package com.bytedance.router.monitor;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class RouteInfo {
    public Map<String, Long> durations;
    public String errorMsg;
    public String extraInfo;
    public String host;
    public Map<String, Object> params;
    public String path;
    public String scheme;
    public final long startTime;
    public String targetClass;
    public long totalDuration;
    public String url;
    public Map<String, String> urlChangeLog;

    public final Map<String, Long> getDurations() {
        return this.durations;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final String getExtraInfo() {
        return this.extraInfo;
    }

    public final String getHost() {
        return this.host;
    }

    public final Map<String, Object> getParams() {
        return this.params;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getTargetClass() {
        return this.targetClass;
    }

    public final long getTotalDuration() {
        return this.totalDuration;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Map<String, String> getUrlChangeLog() {
        return this.urlChangeLog;
    }

    public final void setDurations(Map<String, Long> map) {
        o.LJIIIZ(map, "<set-?>");
        this.durations = map;
    }

    public final void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public final void setExtraInfo(String str) {
        this.extraInfo = str;
    }

    public final void setHost(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.host = str;
    }

    public final void setParams(Map<String, Object> map) {
        o.LJIIIZ(map, "<set-?>");
        this.params = map;
    }

    public final void setPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.path = str;
    }

    public final void setScheme(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.scheme = str;
    }

    public final void setTargetClass(String str) {
        this.targetClass = str;
    }

    public final void setTotalDuration(long j) {
        this.totalDuration = j;
    }

    public final void setUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.url = str;
    }

    public final void setUrlChangeLog(Map<String, String> map) {
        o.LJIIIZ(map, "<set-?>");
        this.urlChangeLog = map;
    }

    public RouteInfo(long j, String url) {
        o.LJIIIZ(url, "url");
        this.startTime = j;
        this.url = url;
        this.scheme = "";
        this.host = "";
        this.path = "";
        this.params = new LinkedHashMap();
        this.durations = new LinkedHashMap();
        this.urlChangeLog = new LinkedHashMap();
    }
}
