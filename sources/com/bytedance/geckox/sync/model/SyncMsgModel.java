package com.bytedance.geckox.sync.model;

import X.InterfaceC65349Pkn;
import com.bytedance.geckox.model.CleanPolicyModel;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class SyncMsgModel {

    @InterfaceC65349Pkn("data")
    public SyncDataModel data;

    @InterfaceC65349Pkn("msg_type")
    public int msgType;

    @InterfaceC65349Pkn("sync_task_id")
    public int syncTaskId;

    @InterfaceC65349Pkn("timestamp")
    public long timestamp;

    /* loaded from: classes11.dex */
    public static class SyncDataModel {

        @InterfaceC65349Pkn("check_update_info")
        public SyncCheckUpdateModel checkUpdateInfo;

        @InterfaceC65349Pkn("clean_info")
        public Map<String, CleanPolicyModel> cleanInfo;

        @InterfaceC65349Pkn("download_info")
        public Map<String, List<SyncDownloadChanelModel>> downloadInfo;

        public SyncCheckUpdateModel getCheckUpdateInfo() {
            return this.checkUpdateInfo;
        }

        public Map<String, CleanPolicyModel> getCleanInfo() {
            return this.cleanInfo;
        }

        public Map<String, List<SyncDownloadChanelModel>> getDownloadInfo() {
            return this.downloadInfo;
        }

        public void setCheckUpdateInfo(SyncCheckUpdateModel syncCheckUpdateModel) {
            this.checkUpdateInfo = syncCheckUpdateModel;
        }

        public void setCleanInfo(Map<String, CleanPolicyModel> map) {
            this.cleanInfo = map;
        }

        public void setDownloadInfo(Map<String, List<SyncDownloadChanelModel>> map) {
            this.downloadInfo = map;
        }
    }

    public SyncDataModel getData() {
        return this.data;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public int getSyncTaskId() {
        return this.syncTaskId;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setData(SyncDataModel syncDataModel) {
        this.data = syncDataModel;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setSyncTaskId(int i) {
        this.syncTaskId = i;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }
}
