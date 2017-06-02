package com.example.entity;

import java.io.Serializable;

/**
 * 
 * @author Administrator
 *
 */
public class Log implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5555698437825717120L;

	/** 系统名称 */
	private String systemName;

	/** JAVA路径 */
	private String javaPath;

	/** 日志级别 */
	private String logLevel;

	/** 日志内容 */
	private String logContent;

	/** 记录时间 */
	private String logTime;

	/** 开始时间 */
	private String starttime;

	/** 结束时间 */
	private String endtime;

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getJavaPath() {
		return javaPath;
	}

	public void setJavaPath(String javaPath) {
		this.javaPath = javaPath;
	}

	public String getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}

	public String getLogContent() {
		return logContent;
	}

	public void setLogContent(String logContent) {
		this.logContent = logContent == null ? null : logContent.trim();
	}

	public String getLogTime() {
		return logTime;
	}

	public void setLogTime(String logTime) {
		this.logTime = logTime;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

}