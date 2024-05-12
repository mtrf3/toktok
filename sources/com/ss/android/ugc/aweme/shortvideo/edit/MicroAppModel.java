package com.ss.android.ugc.aweme.shortvideo.edit;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes7.dex */
public final class MicroAppModel implements Serializable {

    @InterfaceC65349Pkn(alternate = {"a"}, value = "appId")
    public String appId;

    @InterfaceC65349Pkn(alternate = {"b"}, value = "appTitle")
    public String appTitle;

    @InterfaceC65349Pkn(alternate = {"d"}, value = "appUrl")
    public String appUrl;

    @InterfaceC65349Pkn(alternate = {"h"}, value = "cardCode")
    public String cardCode;

    @InterfaceC65349Pkn(alternate = {"g"}, value = "cardImage")
    public String cardImage;

    @InterfaceC65349Pkn(alternate = {"c"}, value = "description")
    public String description;

    @InterfaceC65349Pkn(alternate = {"e"}, value = "extra")
    public String extra;

    @InterfaceC65349Pkn(alternate = {"f"}, value = "schema")
    public String schema;

    public final String getAppTitle() {
        return this.appTitle;
    }

    public final String getAppUrl() {
        return this.appUrl;
    }

    public final String getCardCode() {
        return this.cardCode;
    }

    public final String getCardImage() {
        return this.cardImage;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final void setAppTitle(String str) {
        this.appTitle = str;
    }

    public final void setAppUrl(String str) {
        this.appUrl = str;
    }

    public final void setCardCode(String str) {
        this.cardCode = str;
    }

    public final void setCardImage(String str) {
        this.cardImage = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }
}
