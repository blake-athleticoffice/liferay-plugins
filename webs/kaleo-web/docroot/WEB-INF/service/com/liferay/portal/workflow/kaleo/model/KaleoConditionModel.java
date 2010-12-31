/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the KaleoCondition service. Represents a row in the &quot;KaleoCondition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoConditionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoConditionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoCondition
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoConditionImpl
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoConditionModelImpl
 * @generated
 */
public interface KaleoConditionModel extends BaseModel<KaleoCondition> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a kaleo condition model instance should use the {@link KaleoCondition} interface instead.
	 */

	/**
	 * Gets the primary key of this kaleo condition.
	 *
	 * @return the primary key of this kaleo condition
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this kaleo condition
	 *
	 * @param pk the primary key of this kaleo condition
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the kaleo condition ID of this kaleo condition.
	 *
	 * @return the kaleo condition ID of this kaleo condition
	 */
	public long getKaleoConditionId();

	/**
	 * Sets the kaleo condition ID of this kaleo condition.
	 *
	 * @param kaleoConditionId the kaleo condition ID of this kaleo condition
	 */
	public void setKaleoConditionId(long kaleoConditionId);

	/**
	 * Gets the group ID of this kaleo condition.
	 *
	 * @return the group ID of this kaleo condition
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this kaleo condition.
	 *
	 * @param groupId the group ID of this kaleo condition
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this kaleo condition.
	 *
	 * @return the company ID of this kaleo condition
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this kaleo condition.
	 *
	 * @param companyId the company ID of this kaleo condition
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this kaleo condition.
	 *
	 * @return the user ID of this kaleo condition
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this kaleo condition.
	 *
	 * @param userId the user ID of this kaleo condition
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this kaleo condition.
	 *
	 * @return the user uuid of this kaleo condition
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this kaleo condition.
	 *
	 * @param userUuid the user uuid of this kaleo condition
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this kaleo condition.
	 *
	 * @return the user name of this kaleo condition
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this kaleo condition.
	 *
	 * @param userName the user name of this kaleo condition
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this kaleo condition.
	 *
	 * @return the create date of this kaleo condition
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this kaleo condition.
	 *
	 * @param createDate the create date of this kaleo condition
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this kaleo condition.
	 *
	 * @return the modified date of this kaleo condition
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this kaleo condition.
	 *
	 * @param modifiedDate the modified date of this kaleo condition
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the class name of this kaleo condition.
	 *
	 * @return the class name of this kaleo condition
	 */
	@AutoEscape
	public String getClassName();

	/**
	 * Sets the class name of this kaleo condition.
	 *
	 * @param className the class name of this kaleo condition
	 */
	public void setClassName(String className);

	/**
	 * Gets the class p k of this kaleo condition.
	 *
	 * @return the class p k of this kaleo condition
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this kaleo condition.
	 *
	 * @param classPK the class p k of this kaleo condition
	 */
	public void setClassPK(long classPK);

	/**
	 * Gets the description of this kaleo condition.
	 *
	 * @return the description of this kaleo condition
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this kaleo condition.
	 *
	 * @param description the description of this kaleo condition
	 */
	public void setDescription(String description);

	/**
	 * Gets the script of this kaleo condition.
	 *
	 * @return the script of this kaleo condition
	 */
	@AutoEscape
	public String getScript();

	/**
	 * Sets the script of this kaleo condition.
	 *
	 * @param script the script of this kaleo condition
	 */
	public void setScript(String script);

	/**
	 * Gets the script language of this kaleo condition.
	 *
	 * @return the script language of this kaleo condition
	 */
	@AutoEscape
	public String getScriptLanguage();

	/**
	 * Sets the script language of this kaleo condition.
	 *
	 * @param scriptLanguage the script language of this kaleo condition
	 */
	public void setScriptLanguage(String scriptLanguage);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(KaleoCondition kaleoCondition);

	public int hashCode();

	public KaleoCondition toEscapedModel();

	public String toString();

	public String toXmlString();
}