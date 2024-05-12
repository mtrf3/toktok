package com.ss.android.ugc.aweme.commerce;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class OfflineInfo implements Serializable {

    @InterfaceC65349Pkn("action")
    public String action;

    @InterfaceC65349Pkn("link_type")
    public String linkType;

    @InterfaceC65349Pkn("offline_info_type")
    public int offlineInfoType;

    @InterfaceC65349Pkn("offline_subtype")
    public int offlineSubtype;

    @InterfaceC65349Pkn("text")
    public String text;

    public String getAction() {
        return this.action;
    }

    public String getLinkType() {
        return this.linkType;
    }

    public int getOfflineInfoType() {
        return this.offlineInfoType;
    }

    public int getOfflineSubtype() {
        return this.offlineSubtype;
    }

    public String getText() {
        return this.text;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setLinkType(String str) {
        this.linkType = str;
    }

    public void setOfflineInfoType(int i) {
        this.offlineInfoType = i;
    }

    public void setOfflineSubtype(int i) {
        this.offlineSubtype = i;
    }

    public void setText(String str) {
        this.text = str;
    }
}
