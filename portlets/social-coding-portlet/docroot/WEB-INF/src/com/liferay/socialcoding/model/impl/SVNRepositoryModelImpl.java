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

package com.liferay.socialcoding.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.socialcoding.model.SVNRepository;
import com.liferay.socialcoding.model.SVNRepositoryModel;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

/**
 * The base model implementation for the SVNRepository service. Represents a row in the &quot;SC_SVNRepository&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.socialcoding.model.SVNRepositoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SVNRepositoryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SVNRepositoryImpl
 * @see com.liferay.socialcoding.model.SVNRepository
 * @see com.liferay.socialcoding.model.SVNRepositoryModel
 * @generated
 */
public class SVNRepositoryModelImpl extends BaseModelImpl<SVNRepository>
	implements SVNRepositoryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a s v n repository model instance should use the {@link com.liferay.socialcoding.model.SVNRepository} interface instead.
	 */
	public static final String TABLE_NAME = "SC_SVNRepository";
	public static final Object[][] TABLE_COLUMNS = {
			{ "svnRepositoryId", new Integer(Types.BIGINT) },
			{ "url", new Integer(Types.VARCHAR) },
			{ "revisionNumber", new Integer(Types.BIGINT) }
		};
	public static final String TABLE_SQL_CREATE = "create table SC_SVNRepository (svnRepositoryId LONG not null primary key,url VARCHAR(200) null,revisionNumber LONG)";
	public static final String TABLE_SQL_DROP = "drop table SC_SVNRepository";
	public static final String ORDER_BY_JPQL = " ORDER BY svnRepository.url ASC";
	public static final String ORDER_BY_SQL = " ORDER BY SC_SVNRepository.url ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.socialcoding.model.SVNRepository"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.socialcoding.model.SVNRepository"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.socialcoding.model.SVNRepository"));

	public SVNRepositoryModelImpl() {
	}

	public long getPrimaryKey() {
		return _svnRepositoryId;
	}

	public void setPrimaryKey(long pk) {
		setSvnRepositoryId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_svnRepositoryId);
	}

	public long getSvnRepositoryId() {
		return _svnRepositoryId;
	}

	public void setSvnRepositoryId(long svnRepositoryId) {
		_svnRepositoryId = svnRepositoryId;
	}

	public String getUrl() {
		if (_url == null) {
			return StringPool.BLANK;
		}
		else {
			return _url;
		}
	}

	public void setUrl(String url) {
		_url = url;

		if (_originalUrl == null) {
			_originalUrl = url;
		}
	}

	public String getOriginalUrl() {
		return GetterUtil.getString(_originalUrl);
	}

	public long getRevisionNumber() {
		return _revisionNumber;
	}

	public void setRevisionNumber(long revisionNumber) {
		_revisionNumber = revisionNumber;
	}

	public SVNRepository toEscapedModel() {
		if (isEscapedModel()) {
			return (SVNRepository)this;
		}
		else {
			return (SVNRepository)Proxy.newProxyInstance(SVNRepository.class.getClassLoader(),
				new Class[] { SVNRepository.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					SVNRepository.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		SVNRepositoryImpl clone = new SVNRepositoryImpl();

		clone.setSvnRepositoryId(getSvnRepositoryId());
		clone.setUrl(getUrl());
		clone.setRevisionNumber(getRevisionNumber());

		return clone;
	}

	public int compareTo(SVNRepository svnRepository) {
		int value = 0;

		value = getUrl().compareTo(svnRepository.getUrl());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		SVNRepository svnRepository = null;

		try {
			svnRepository = (SVNRepository)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = svnRepository.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{svnRepositoryId=");
		sb.append(getSvnRepositoryId());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", revisionNumber=");
		sb.append(getRevisionNumber());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.liferay.socialcoding.model.SVNRepository");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>svnRepositoryId</column-name><column-value><![CDATA[");
		sb.append(getSvnRepositoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>revisionNumber</column-name><column-value><![CDATA[");
		sb.append(getRevisionNumber());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _svnRepositoryId;
	private String _url;
	private String _originalUrl;
	private long _revisionNumber;
	private transient ExpandoBridge _expandoBridge;
}