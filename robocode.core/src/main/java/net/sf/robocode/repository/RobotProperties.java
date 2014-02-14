/*******************************************************************************
 * Copyright (c) 2001-2014 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://robocode.sourceforge.net/license/epl-v10.html
 *******************************************************************************/
package net.sf.robocode.repository;


import java.net.URL;


/**
 * Container for Robot properties used in Robot packages.
 *
 * @author Flemming N. Larsen (original)
 */
public class RobotProperties {

	private boolean includeSources;
	private String version;
	private String author;
	private String description;
	private URL webPage;
	private Integer codeSize;

	public boolean isIncludeSources() {
		return includeSources;
	}

	public void setIncludeSources(boolean includeSources) {
		this.includeSources = includeSources;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public URL getWebPage() {
		return webPage;
	}

	public void setWebPage(URL webPage) {
		this.webPage = webPage;
	}

	public Integer getCodeSize() {
		return codeSize;
	}

	public void setCodeSize(Integer codeSize) {
		this.codeSize = codeSize;
	}
}
