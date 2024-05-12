package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class MediaSourceButtonStruct implements Serializable {

    @InterfaceC65349Pkn("aid")
    public String aid;

    @InterfaceC65349Pkn("eid")
    public String eid;

    @InterfaceC65349Pkn("icon")
    public final UrlModel icon;

    @InterfaceC65349Pkn("has_perchase_url")
    public boolean isBuy;

    @InterfaceC65349Pkn("name")
    public final String name = "";

    @InterfaceC65349Pkn("button_type")
    public int buttonType = 1;

    @InterfaceC65349Pkn("schema")
    public String schema = "";

    public final boolean isMiniApp() {
        if (this.buttonType == 2) {
            return true;
        }
        return false;
    }

    public final boolean isMix() {
        if (this.buttonType == 3) {
            return true;
        }
        return false;
    }

    public final boolean isOrigin() {
        if (this.buttonType == 1) {
            return true;
        }
        return false;
    }

    public final String getAid() {
        return this.aid;
    }

    public final int getButtonType() {
        return this.buttonType;
    }

    public final String getEid() {
        return this.eid;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final boolean isBuy() {
        return this.isBuy;
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setButtonType(int i) {
        this.buttonType = i;
    }

    public final void setBuy(boolean z) {
        this.isBuy = z;
    }

    public final void setEid(String str) {
        this.eid = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }
}
