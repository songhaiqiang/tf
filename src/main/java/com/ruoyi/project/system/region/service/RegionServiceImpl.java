package com.ruoyi.project.system.region.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.project.system.dept.domain.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.region.mapper.RegionMapper;
import com.ruoyi.project.system.region.domain.Region;
import com.ruoyi.common.support.Convert;

/**
 * 省市区行政 服务层实现
 * 
 * @author taifu
 * @date 2018-10-16
 */
@Service
public class RegionServiceImpl implements IRegionService 
{
	@Autowired
	private RegionMapper regionMapper;

	/**
     * 查询省市区行政信息
     * 
     * @param id 省市区行政ID
     * @return 省市区行政信息
     */
    @Override
	public Region selectRegionById(Integer id)
	{
	    return regionMapper.selectRegionById(id);
	}
	
	/**
     * 查询省市区行政列表
     * 
     * @param region 省市区行政信息
     * @return 省市区行政集合
     */
	@Override
	public List<Region> selectRegionList(Region region)
	{
	    return regionMapper.selectRegionList(region);
	}
	
    /**
     * 新增省市区行政
     * 
     * @param region 省市区行政信息
     * @return 结果
     */
	@Override
	public int insertRegion(Region region)
	{
	    return regionMapper.insertRegion(region);
	}
	
	/**
     * 修改省市区行政
     * 
     * @param region 省市区行政信息
     * @return 结果
     */
	@Override
	public int updateRegion(Region region)
	{
	    return regionMapper.updateRegion(region);
	}

	/**
     * 删除省市区行政对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteRegionByIds(String ids)
	{
		return regionMapper.deleteRegionByIds(Convert.toStrArray(ids));
	}

	@Override
	public List<Map<String, Object>> selectDeptTree() {
		List<Region> regionList = regionMapper.selectRegionList(new Region());
		getTrees(regionList , false , null);
		return null;
	}

	/**
	 * 对象转部门树
	 *
	 * @param regionList 部门列表
	 * @param isCheck 是否需要选中
	 * @param roleDeptList 角色已存在菜单列表
	 * @return
	 */
	public List<Map<String, Object>> getTrees(List<Region> regionList, boolean isCheck, List<String> roleDeptList)
	{

		List<Map<String, Object>> trees = new ArrayList<Map<String, Object>>();
//		for (Region dept : regionList)
//		{
//			if (UserConstants.DEPT_NORMAL.equals(dept.getStatus()))
//			{
//				Map<String, Object> deptMap = new HashMap<String, Object>();
//				deptMap.put("id", dept.getDeptId());
//				deptMap.put("pId", dept.getParentId());
//				deptMap.put("name", dept.getDeptName());
//				deptMap.put("title", dept.getDeptName());
//				if (isCheck)
//				{
//					deptMap.put("checked", roleDeptList.contains(dept.getDeptId() + dept.getDeptName()));
//				}
//				else
//				{
//					deptMap.put("checked", false);
//				}
//				trees.add(deptMap);
//			}
//		}
		return trees;
	}


}
