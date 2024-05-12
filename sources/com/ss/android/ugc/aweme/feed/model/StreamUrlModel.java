package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public class StreamUrlModel implements Serializable {

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("rtmp_pull_url")
    public String rtmpPullUrl;

    public String getId() {
        return this.id;
    }

    public String getRtmpPullUrl() {
        return this.rtmpPullUrl;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setRtmpPullUrl(String str) {
        this.rtmpPullUrl = str;
    }
}
