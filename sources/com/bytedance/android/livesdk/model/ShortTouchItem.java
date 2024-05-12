package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class ShortTouchItem implements Serializable {

    @InterfaceC65349Pkn("anime_type")
    public int animeType;

    @InterfaceC65349Pkn("fc_second")
    public long fcSecond;

    @InterfaceC65349Pkn("height")
    public long height;

    @InterfaceC65349Pkn("icon_skin")
    public String iconSkin;

    @InterfaceC65349Pkn("left_margin")
    public long leftMargin;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("preview_setting")
    public ShortTouchPreviewSetting previewSetting;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("top_margin")
    public long topMargin;

    @InterfaceC65349Pkn("width")
    public long width;

    public long getFcSecond() {
        return this.fcSecond;
    }

    public long getHeight() {
        return this.height;
    }

    public long getLeftMargin() {
        return this.leftMargin;
    }

    public String getName() {
        return this.name;
    }

    public ShortTouchPreviewSetting getPreviewSetting() {
        return this.previewSetting;
    }

    public String getSchema() {
        return this.schema;
    }

    public long getTopMargin() {
        return this.topMargin;
    }

    public long getWidth() {
        return this.width;
    }

    public void setFcSecond(long j) {
        this.fcSecond = j;
    }

    public void setHeight(long j) {
        this.height = j;
    }

    public void setLeftMargin(long j) {
        this.leftMargin = j;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPreviewSetting(ShortTouchPreviewSetting shortTouchPreviewSetting) {
        this.previewSetting = shortTouchPreviewSetting;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTopMargin(long j) {
        this.topMargin = j;
    }

    public void setWidth(long j) {
        this.width = j;
    }
}
