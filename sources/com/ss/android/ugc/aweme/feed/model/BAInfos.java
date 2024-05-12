package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.TagBAUser;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class BAInfos implements Serializable {

    @InterfaceC65349Pkn("ba_infos")
    public final List<TagBAUser> baInfos;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public String statusMsg;

    public final List<TagBAUser> getBaInfos() {
        return this.baInfos;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
