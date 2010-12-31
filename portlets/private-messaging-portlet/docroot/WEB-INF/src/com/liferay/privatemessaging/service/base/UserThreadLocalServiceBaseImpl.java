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

package com.liferay.privatemessaging.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.privatemessaging.model.UserThread;
import com.liferay.privatemessaging.service.UserThreadLocalService;
import com.liferay.privatemessaging.service.persistence.UserThreadPersistence;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the user thread local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.privatemessaging.service.impl.UserThreadLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.privatemessaging.service.impl.UserThreadLocalServiceImpl
 * @see com.liferay.privatemessaging.service.UserThreadLocalServiceUtil
 * @generated
 */
public abstract class UserThreadLocalServiceBaseImpl
	implements UserThreadLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.privatemessaging.service.UserThreadLocalServiceUtil} to access the user thread local service.
	 */

	/**
	 * Adds the user thread to the database. Also notifies the appropriate model listeners.
	 *
	 * @param userThread the user thread to add
	 * @return the user thread that was added
	 * @throws SystemException if a system exception occurred
	 */
	public UserThread addUserThread(UserThread userThread)
		throws SystemException {
		userThread.setNew(true);

		return userThreadPersistence.update(userThread, false);
	}

	/**
	 * Creates a new user thread with the primary key. Does not add the user thread to the database.
	 *
	 * @param userThreadId the primary key for the new user thread
	 * @return the new user thread
	 */
	public UserThread createUserThread(long userThreadId) {
		return userThreadPersistence.create(userThreadId);
	}

	/**
	 * Deletes the user thread with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userThreadId the primary key of the user thread to delete
	 * @throws PortalException if a user thread with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteUserThread(long userThreadId)
		throws PortalException, SystemException {
		userThreadPersistence.remove(userThreadId);
	}

	/**
	 * Deletes the user thread from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userThread the user thread to delete
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteUserThread(UserThread userThread)
		throws SystemException {
		userThreadPersistence.remove(userThread);
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return userThreadPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @param start the lower bound of the range of model instances to return
	 * @param end the upper bound of the range of model instances to return (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return userThreadPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @param start the lower bound of the range of model instances to return
	 * @param end the upper bound of the range of model instances to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return userThreadPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Counts the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return userThreadPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Gets the user thread with the primary key.
	 *
	 * @param userThreadId the primary key of the user thread to get
	 * @return the user thread
	 * @throws PortalException if a user thread with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public UserThread getUserThread(long userThreadId)
		throws PortalException, SystemException {
		return userThreadPersistence.findByPrimaryKey(userThreadId);
	}

	/**
	 * Gets a range of all the user threads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of user threads to return
	 * @param end the upper bound of the range of user threads to return (not inclusive)
	 * @return the range of user threads
	 * @throws SystemException if a system exception occurred
	 */
	public List<UserThread> getUserThreads(int start, int end)
		throws SystemException {
		return userThreadPersistence.findAll(start, end);
	}

	/**
	 * Gets the number of user threads.
	 *
	 * @return the number of user threads
	 * @throws SystemException if a system exception occurred
	 */
	public int getUserThreadsCount() throws SystemException {
		return userThreadPersistence.countAll();
	}

	/**
	 * Updates the user thread in the database. Also notifies the appropriate model listeners.
	 *
	 * @param userThread the user thread to update
	 * @return the user thread that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public UserThread updateUserThread(UserThread userThread)
		throws SystemException {
		userThread.setNew(false);

		return userThreadPersistence.update(userThread, true);
	}

	/**
	 * Updates the user thread in the database. Also notifies the appropriate model listeners.
	 *
	 * @param userThread the user thread to update
	 * @param merge whether to merge the user thread with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the user thread that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public UserThread updateUserThread(UserThread userThread, boolean merge)
		throws SystemException {
		userThread.setNew(false);

		return userThreadPersistence.update(userThread, merge);
	}

	/**
	 * Gets the user thread local service.
	 *
	 * @return the user thread local service
	 */
	public UserThreadLocalService getUserThreadLocalService() {
		return userThreadLocalService;
	}

	/**
	 * Sets the user thread local service.
	 *
	 * @param userThreadLocalService the user thread local service
	 */
	public void setUserThreadLocalService(
		UserThreadLocalService userThreadLocalService) {
		this.userThreadLocalService = userThreadLocalService;
	}

	/**
	 * Gets the user thread persistence.
	 *
	 * @return the user thread persistence
	 */
	public UserThreadPersistence getUserThreadPersistence() {
		return userThreadPersistence;
	}

	/**
	 * Sets the user thread persistence.
	 *
	 * @param userThreadPersistence the user thread persistence
	 */
	public void setUserThreadPersistence(
		UserThreadPersistence userThreadPersistence) {
		this.userThreadPersistence = userThreadPersistence;
	}

	/**
	 * Gets the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Gets the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Gets the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Gets the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Gets the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Gets the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Gets the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query to perform
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = userThreadPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = UserThreadLocalService.class)
	protected UserThreadLocalService userThreadLocalService;
	@BeanReference(type = UserThreadPersistence.class)
	protected UserThreadPersistence userThreadPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}