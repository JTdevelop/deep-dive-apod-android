package edu.cnm.deepdive.apod.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Date;

public class Apod {

  @Expose
  private Date date;

  @Expose
  private String title;

  @Expose
  private String explanation;

  @Expose
  private String copyright;

  @Expose
  private String url;

  @Expose
  @SerializedName("media_type")
  private String mediaType;

  @Expose
  @SerializedName("hdurl")
  private String hdurl;

  @Expose
  @SerializedName("service_version")
  private String serviceVersion;

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public String getHdurl() {
    return hdurl;
  }

  public void setHdurl(String hdurl) {
    this.hdurl = hdurl;
  }

  public String getServiceVersion() {
    return serviceVersion;
  }

  public void setServiceVersion(String serviceVersion) {
    this.serviceVersion = serviceVersion;
  }

}
