package org.aksw.autosparql.tbsl.algorithm.exploration.Utils;

public class QueryPair {
	private String Query;
	private String Resource;
	private String Property;
	private String PropertyName;
	private double rank;
	public String getQuery() {
		return Query;
	}
	public void setQuery(String query) {
		Query = query;
	}
	public double getRank() {
		return rank;
	}
	public void setRank(double rank) {
		this.rank = rank;
	}

	public void printAll(){
		System.out.println("Query :"+this.getQuery());
		System.out.println("Rank :"+this.getRank());
	}

	public QueryPair(String query_new, double rank_new){
		this.setQuery(query_new);
		this.setRank(rank_new);
	}
	public String getResource() {
		return Resource;
	}
	public void setResource(String resource) {
		Resource = resource;
	}
	public String getProperty() {
		return Property;
	}
	public void setProperty(String property) {
		Property = property;
	}
	public String getPropertyName() {
		return PropertyName;
	}
	public void setPropertyName(String propertyName) {
		PropertyName = propertyName;
	}


}
