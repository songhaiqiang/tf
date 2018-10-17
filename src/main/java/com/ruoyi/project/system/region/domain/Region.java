package com.ruoyi.project.system.region.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 省市区行政表 sys_region
 * 
 * @author taifu
 * @date 2018-10-16
 */
public class Region extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer id;
	/**  */
	private Integer districtId;
	/**  */
	private String districtName;
	/**  */
	private Integer cityId;
	/**  */
	private String cityName;
	/**  */
	private Integer provinceId;
	/**  */
	private String provinceName;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setDistrictId(Integer districtId) 
	{
		this.districtId = districtId;
	}

	public Integer getDistrictId() 
	{
		return districtId;
	}
	public void setDistrictName(String districtName) 
	{
		this.districtName = districtName;
	}

	public String getDistrictName() 
	{
		return districtName;
	}
	public void setCityId(Integer cityId) 
	{
		this.cityId = cityId;
	}

	public Integer getCityId() 
	{
		return cityId;
	}
	public void setCityName(String cityName) 
	{
		this.cityName = cityName;
	}

	public String getCityName() 
	{
		return cityName;
	}
	public void setProvinceId(Integer provinceId) 
	{
		this.provinceId = provinceId;
	}

	public Integer getProvinceId() 
	{
		return provinceId;
	}
	public void setProvinceName(String provinceName) 
	{
		this.provinceName = provinceName;
	}

	public String getProvinceName() 
	{
		return provinceName;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("districtId", getDistrictId())
            .append("districtName", getDistrictName())
            .append("cityId", getCityId())
            .append("cityName", getCityName())
            .append("provinceId", getProvinceId())
            .append("provinceName", getProvinceName())
            .toString();
    }
}
