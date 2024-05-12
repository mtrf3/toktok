package com.ss.android.ugc.playerkit.simapicommon.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class SimUrlModel implements Serializable {

    @InterfaceC65349Pkn("player_access_key")
    public String aK;

    @InterfaceC65349Pkn("file_cs")
    public String fileCheckSum;

    @InterfaceC65349Pkn("file_hash")
    public String fileHash;

    @InterfaceC65349Pkn("height")
    public int height;
    public String logLabel;
    public Object origin;

    @InterfaceC65349Pkn("data_size")
    public long size;

    @InterfaceC65349Pkn("uri")
    public String uri;

    @InterfaceC65349Pkn("url_key")
    public String urlKey;

    @InterfaceC65349Pkn("url_list")
    public List<String> urlList;

    @InterfaceC65349Pkn("width")
    public int width;

    public int hashCode() {
        String str;
        int i;
        if (TextUtils.isEmpty(this.urlKey)) {
            str = this.uri;
        } else {
            str = this.urlKey;
        }
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        List<String> list = this.urlList;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i3 + i2;
    }

    public String getFileCheckSum() {
        return this.fileCheckSum;
    }

    public String getFileHash() {
        return this.fileHash;
    }

    public int getHeight() {
        return this.height;
    }

    public String getLogLabel() {
        return this.logLabel;
    }

    public long getSize() {
        return this.size;
    }

    public String getUri() {
        return this.uri;
    }

    public String getUrlKey() {
        return this.urlKey;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public int getWidth() {
        return this.width;
    }

    public String getaK() {
        return this.aK;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimUrlModel)) {
            return false;
        }
        SimUrlModel simUrlModel = (SimUrlModel) obj;
        String str = this.uri;
        if (str == null ? simUrlModel.uri != null : !str.equals(simUrlModel.uri)) {
            return false;
        }
        String str2 = this.urlKey;
        if (str2 == null ? simUrlModel.urlKey != null : !str2.equals(simUrlModel.urlKey)) {
            return false;
        }
        List<String> list = this.urlList;
        List<String> list2 = simUrlModel.urlList;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public void setFileCheckSum(String str) {
        this.fileCheckSum = str;
    }

    public void setFileHash(String str) {
        this.fileHash = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLogLabel(String str) {
        this.logLabel = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlKey(String str) {
        this.urlKey = str;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public void setaK(String str) {
        this.aK = str;
    }
}
