package com.rh.constats.api.data;

public class MergeRequestRaw {

	private int id;
	private int mr_id;
	private int page;
	private String raw_json;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMr_id() {
		return mr_id;
	}
	public void setMr_id(int mr_id) {
		this.mr_id = mr_id;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getRaw_json() {
		return raw_json;
	}
	public void setRaw_json(String raw_json) {
		this.raw_json = raw_json;
	}
}
