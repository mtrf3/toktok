package com.bytedance.geckox.model;

import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class CheckRequestBodyModel {

    @InterfaceC65349Pkn("common")
    public Common common;

    @InterfaceC65349Pkn("custom")
    public Map<String, Map<String, Object>> custom;

    @InterfaceC65349Pkn("deployments")
    public Map<String, Object> deployments;

    @InterfaceC65349Pkn("local")
    public Map<String, Map<String, LocalChannel>> local;

    @InterfaceC65349Pkn("req_meta")
    public RequestMeta requestMeta;

    /* loaded from: classes11.dex */
    public static class LocalChannel {

        @InterfaceC65349Pkn("l_v")
        public Long localVersion;
    }

    /* loaded from: classes11.dex */
    public static class RequestMeta {

        @InterfaceC65349Pkn("combine_level")
        public String combineLevel;

        @InterfaceC65349Pkn("req_type")
        public int reqType;

        @InterfaceC65349Pkn("sync_task_id")
        public int syncTaskId;

        public String getCombineLevel() {
            return this.combineLevel;
        }

        public int getReqType() {
            return this.reqType;
        }

        public int getSyncTaskId() {
            return this.syncTaskId;
        }

        public RequestMeta(int i) {
            this.reqType = i;
        }

        public void setCombineLevel(String str) {
            this.combineLevel = str;
        }

        public void setReqType(int i) {
            this.reqType = i;
        }

        public void setSyncTaskId(int i) {
            this.syncTaskId = i;
        }
    }

    /* loaded from: classes7.dex */
    public static class TargetChannel {

        @InterfaceC65349Pkn("c")
        public String channelName;

        @InterfaceC65349Pkn("from")
        public List<String> from;

        @InterfaceC65349Pkn("t_v")
        public Long targetVersion;

        public TargetChannel() {
        }

        public TargetChannel(String str) {
            this.channelName = str;
        }

        public TargetChannel(String str, Long l) {
            this.channelName = str;
            this.targetVersion = l;
        }
    }

    public void setCommon(Common common) {
        this.common = common;
    }

    public void setCustom(Map<String, Map<String, Object>> map) {
        this.custom = map;
    }

    public void setDeployments(Map<String, Object> map) {
        this.deployments = map;
    }

    public void setLocal(Map<String, Map<String, LocalChannel>> map) {
        this.local = map;
    }

    public void setRequestMeta(RequestMeta requestMeta) {
        this.requestMeta = requestMeta;
    }
}
