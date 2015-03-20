package com.georgelung.template.dto;

import java.util.List;

import com.google.common.collect.Lists;

public class ListDTO<T> {
	private List<T> list;
	
	public ListDTO (List<T> list){
		this.list = list;
	}
	
	public ListDTO (Iterable<T> list){
		this.list = Lists.newArrayList(list);
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
	public int getCount(){
		return list != null ? list.size() : 0;
	}
	
	public void setCount(){
		// do nothing
	}
}
