package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class PlatformInfo implements Serializable {

    @InterfaceC65349Pkn("full_synced")
    public boolean fullSynced;

    @InterfaceC65349Pkn("nickname")
    public String nickName;

    @InterfaceC65349Pkn("platform_name")
    public String patformName;

    public String getNickName() {
        return this.nickName;
    }

    public String getPatformName() {
        return this.patformName;
    }

    public boolean isFullSynced() {
        return this.fullSynced;
    }

    public void setFullSynced(boolean z) {
        this.fullSynced = z;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setPatformName(String str) {
        this.patformName = str;
    }
}
