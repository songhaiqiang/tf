package com.ruoyi.project.system.region.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.region.domain.Region;
import com.ruoyi.project.system.region.service.IRegionService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;

/**
 * 省市区行政 信息操作处理
 * 
 * @author taifu
 * @date 2018-10-16
 */
@Controller
@RequestMapping("/system/region")
public class RegionController extends BaseController
{
    private String prefix = "system/region";
	
	@Autowired
	private IRegionService regionService;
	
	@RequiresPermissions("system:region:view")
	@GetMapping()
	public String region()
	{
	    return prefix + "/region";
	}
	
	/**
	 * 查询省市区行政列表
	 */
	@RequiresPermissions("system:region:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Region region)
	{
		startPage();
        List<Region> list = regionService.selectRegionList(region);
		return getDataTable(list);
	}
	
	/**
	 * 新增省市区行政
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存省市区行政
	 */
	@RequiresPermissions("system:region:add")
	@Log(title = "省市区行政", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Region region)
	{		
		return toAjax(regionService.insertRegion(region));
	}

	/**
	 * 修改省市区行政
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Region region = regionService.selectRegionById(id);
		mmap.put("region", region);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存省市区行政
	 */
	@RequiresPermissions("system:region:edit")
	@Log(title = "省市区行政", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Region region)
	{		
		return toAjax(regionService.updateRegion(region));
	}
	
	/**
	 * 删除省市区行政
	 */
	@RequiresPermissions("system:region:remove")
	@Log(title = "省市区行政", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(regionService.deleteRegionByIds(ids));
	}




	/**
	 * 加载部门列表树
	 */
	@GetMapping("/treeData")
	@ResponseBody
	public List<Map<String, Object>> treeData()
	{
		List<Map<String, Object>> tree = regionService.selectDeptTree();
		return tree;
	}
	
}
