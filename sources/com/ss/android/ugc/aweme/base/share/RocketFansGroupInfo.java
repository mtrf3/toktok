package com.ss.android.ugc.aweme.base.share;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class RocketFansGroupInfo implements Serializable {

    @InterfaceC65349Pkn("download_url")
    public String downloadUrl;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("token")
    public String token;

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getToken() {
        return this.token;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
