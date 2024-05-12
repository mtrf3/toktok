package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes13.dex */
public class DescendantsModel implements Serializable {

    @InterfaceC65349Pkn("notify_msg")
    public String notifyMsg;

    @InterfaceC65349Pkn("platforms")
    public List<String> platforms;

    public String getNotifyMsg() {
        return this.notifyMsg;
    }

    public List<String> getPlatforms() {
        return this.platforms;
    }

    public void setNotifyMsg(String str) {
        this.notifyMsg = str;
    }

    public void setPlatforms(List<String> list) {
        this.platforms = list;
    }
}
