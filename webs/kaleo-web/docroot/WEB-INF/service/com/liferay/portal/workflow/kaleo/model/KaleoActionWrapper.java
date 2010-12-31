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

/**
 * <p>
 * This class is a wrapper for {@link KaleoAction}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       KaleoAction
 * @generated
 */
public class KaleoActionWrapper implements KaleoAction {
	public KaleoActionWrapper(KaleoAction kaleoAction) {
		_kaleoAction = kaleoAction;
	}

	/**
	* Gets the primary key of this kaleo action.
	*
	* @return the primary key of this kaleo action
	*/
	public long getPrimaryKey() {
		return _kaleoAction.getPrimaryKey();
	}

	/**
	* Sets the primary key of this kaleo action
	*
	* @param pk the primary key of this kaleo action
	*/
	public void setPrimaryKey(long pk) {
		_kaleoAction.setPrimaryKey(pk);
	}

	/**
	* Gets the kaleo action ID of this kaleo action.
	*
	* @return the kaleo action ID of this kaleo action
	*/
	public long getKaleoActionId() {
		return _kaleoAction.getKaleoActionId();
	}

	/**
	* Sets the kaleo action ID of this kaleo action.
	*
	* @param kaleoActionId the kaleo action ID of this kaleo action
	*/
	public void setKaleoActionId(long kaleoActionId) {
		_kaleoAction.setKaleoActionId(kaleoActionId);
	}

	/**
	* Gets the group ID of this kaleo action.
	*
	* @return the group ID of this kaleo action
	*/
	public long getGroupId() {
		return _kaleoAction.getGroupId();
	}

	/**
	* Sets the group ID of this kaleo action.
	*
	* @param groupId the group ID of this kaleo action
	*/
	public void setGroupId(long groupId) {
		_kaleoAction.setGroupId(groupId);
	}

	/**
	* Gets the company ID of this kaleo action.
	*
	* @return the company ID of this kaleo action
	*/
	public long getCompanyId() {
		return _kaleoAction.getCompanyId();
	}

	/**
	* Sets the company ID of this kaleo action.
	*
	* @param companyId the company ID of this kaleo action
	*/
	public void setCompanyId(long companyId) {
		_kaleoAction.setCompanyId(companyId);
	}

	/**
	* Gets the user ID of this kaleo action.
	*
	* @return the user ID of this kaleo action
	*/
	public long getUserId() {
		return _kaleoAction.getUserId();
	}

	/**
	* Sets the user ID of this kaleo action.
	*
	* @param userId the user ID of this kaleo action
	*/
	public void setUserId(long userId) {
		_kaleoAction.setUserId(userId);
	}

	/**
	* Gets the user uuid of this kaleo action.
	*
	* @return the user uuid of this kaleo action
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoAction.getUserUuid();
	}

	/**
	* Sets the user uuid of this kaleo action.
	*
	* @param userUuid the user uuid of this kaleo action
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_kaleoAction.setUserUuid(userUuid);
	}

	/**
	* Gets the user name of this kaleo action.
	*
	* @return the user name of this kaleo action
	*/
	public java.lang.String getUserName() {
		return _kaleoAction.getUserName();
	}

	/**
	* Sets the user name of this kaleo action.
	*
	* @param userName the user name of this kaleo action
	*/
	public void setUserName(java.lang.String userName) {
		_kaleoAction.setUserName(userName);
	}

	/**
	* Gets the create date of this kaleo action.
	*
	* @return the create date of this kaleo action
	*/
	public java.util.Date getCreateDate() {
		return _kaleoAction.getCreateDate();
	}

	/**
	* Sets the create date of this kaleo action.
	*
	* @param createDate the create date of this kaleo action
	*/
	public void setCreateDate(java.util.Date createDate) {
		_kaleoAction.setCreateDate(createDate);
	}

	/**
	* Gets the modified date of this kaleo action.
	*
	* @return the modified date of this kaleo action
	*/
	public java.util.Date getModifiedDate() {
		return _kaleoAction.getModifiedDate();
	}

	/**
	* Sets the modified date of this kaleo action.
	*
	* @param modifiedDate the modified date of this kaleo action
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_kaleoAction.setModifiedDate(modifiedDate);
	}

	/**
	* Gets the kaleo definition ID of this kaleo action.
	*
	* @return the kaleo definition ID of this kaleo action
	*/
	public long getKaleoDefinitionId() {
		return _kaleoAction.getKaleoDefinitionId();
	}

	/**
	* Sets the kaleo definition ID of this kaleo action.
	*
	* @param kaleoDefinitionId the kaleo definition ID of this kaleo action
	*/
	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_kaleoAction.setKaleoDefinitionId(kaleoDefinitionId);
	}

	/**
	* Gets the kaleo node ID of this kaleo action.
	*
	* @return the kaleo node ID of this kaleo action
	*/
	public long getKaleoNodeId() {
		return _kaleoAction.getKaleoNodeId();
	}

	/**
	* Sets the kaleo node ID of this kaleo action.
	*
	* @param kaleoNodeId the kaleo node ID of this kaleo action
	*/
	public void setKaleoNodeId(long kaleoNodeId) {
		_kaleoAction.setKaleoNodeId(kaleoNodeId);
	}

	/**
	* Gets the kaleo node name of this kaleo action.
	*
	* @return the kaleo node name of this kaleo action
	*/
	public java.lang.String getKaleoNodeName() {
		return _kaleoAction.getKaleoNodeName();
	}

	/**
	* Sets the kaleo node name of this kaleo action.
	*
	* @param kaleoNodeName the kaleo node name of this kaleo action
	*/
	public void setKaleoNodeName(java.lang.String kaleoNodeName) {
		_kaleoAction.setKaleoNodeName(kaleoNodeName);
	}

	/**
	* Gets the name of this kaleo action.
	*
	* @return the name of this kaleo action
	*/
	public java.lang.String getName() {
		return _kaleoAction.getName();
	}

	/**
	* Sets the name of this kaleo action.
	*
	* @param name the name of this kaleo action
	*/
	public void setName(java.lang.String name) {
		_kaleoAction.setName(name);
	}

	/**
	* Gets the description of this kaleo action.
	*
	* @return the description of this kaleo action
	*/
	public java.lang.String getDescription() {
		return _kaleoAction.getDescription();
	}

	/**
	* Sets the description of this kaleo action.
	*
	* @param description the description of this kaleo action
	*/
	public void setDescription(java.lang.String description) {
		_kaleoAction.setDescription(description);
	}

	/**
	* Gets the execution type of this kaleo action.
	*
	* @return the execution type of this kaleo action
	*/
	public java.lang.String getExecutionType() {
		return _kaleoAction.getExecutionType();
	}

	/**
	* Sets the execution type of this kaleo action.
	*
	* @param executionType the execution type of this kaleo action
	*/
	public void setExecutionType(java.lang.String executionType) {
		_kaleoAction.setExecutionType(executionType);
	}

	/**
	* Gets the script of this kaleo action.
	*
	* @return the script of this kaleo action
	*/
	public java.lang.String getScript() {
		return _kaleoAction.getScript();
	}

	/**
	* Sets the script of this kaleo action.
	*
	* @param script the script of this kaleo action
	*/
	public void setScript(java.lang.String script) {
		_kaleoAction.setScript(script);
	}

	/**
	* Gets the script language of this kaleo action.
	*
	* @return the script language of this kaleo action
	*/
	public java.lang.String getScriptLanguage() {
		return _kaleoAction.getScriptLanguage();
	}

	/**
	* Sets the script language of this kaleo action.
	*
	* @param scriptLanguage the script language of this kaleo action
	*/
	public void setScriptLanguage(java.lang.String scriptLanguage) {
		_kaleoAction.setScriptLanguage(scriptLanguage);
	}

	/**
	* Gets the priority of this kaleo action.
	*
	* @return the priority of this kaleo action
	*/
	public int getPriority() {
		return _kaleoAction.getPriority();
	}

	/**
	* Sets the priority of this kaleo action.
	*
	* @param priority the priority of this kaleo action
	*/
	public void setPriority(int priority) {
		_kaleoAction.setPriority(priority);
	}

	public boolean isNew() {
		return _kaleoAction.isNew();
	}

	public void setNew(boolean n) {
		_kaleoAction.setNew(n);
	}

	public boolean isCachedModel() {
		return _kaleoAction.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_kaleoAction.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _kaleoAction.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_kaleoAction.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _kaleoAction.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _kaleoAction.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_kaleoAction.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new KaleoActionWrapper((KaleoAction)_kaleoAction.clone());
	}

	public int compareTo(
		com.liferay.portal.workflow.kaleo.model.KaleoAction kaleoAction) {
		return _kaleoAction.compareTo(kaleoAction);
	}

	public int hashCode() {
		return _kaleoAction.hashCode();
	}

	public com.liferay.portal.workflow.kaleo.model.KaleoAction toEscapedModel() {
		return new KaleoActionWrapper(_kaleoAction.toEscapedModel());
	}

	public java.lang.String toString() {
		return _kaleoAction.toString();
	}

	public java.lang.String toXmlString() {
		return _kaleoAction.toXmlString();
	}

	public KaleoAction getWrappedKaleoAction() {
		return _kaleoAction;
	}

	private KaleoAction _kaleoAction;
}