package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class JumpData implements Serializable {

    @InterfaceC65349Pkn("appleid")
    public String appleId;

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("open_url")
    public String openUrl;

    @InterfaceC65349Pkn("package")
    public String packageName;

    @InterfaceC65349Pkn("web_title")
    public String webTitle;

    @InterfaceC65349Pkn("web_url")
    public String webUrl;

    public final String getAppleId() {
        return this.appleId;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getWebTitle() {
        return this.webTitle;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final void setAppleId(String str) {
        this.appleId = str;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public final void setPackageName(String str) {
        this.packageName = str;
    }

    public final void setWebTitle(String str) {
        this.webTitle = str;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }
}
