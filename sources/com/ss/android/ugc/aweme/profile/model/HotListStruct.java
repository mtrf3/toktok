package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class HotListStruct implements Serializable {

    @InterfaceC65349Pkn("footer")
    public String footer;

    @InterfaceC65349Pkn("header")
    public String header;

    @InterfaceC65349Pkn("image_url")
    public String imageUrl;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("title")
    public String titile;

    @InterfaceC65349Pkn("type")
    public int type;

    public boolean isLocalHot() {
        if (this.type == 9) {
            return true;
        }
        return false;
    }

    public String getFooter() {
        return this.footer;
    }

    public String getHeader() {
        return this.header;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitile() {
        return this.titile;
    }

    public int getType() {
        return this.type;
    }

    public void setFooter(String str) {
        this.footer = str;
    }

    public void setHeader(String str) {
        this.header = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitile(String str) {
        this.titile = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
