package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class VideoTag implements Serializable {

    @InterfaceC65349Pkn("background_color")
    public String backgroundColor;

    @InterfaceC65349Pkn("en_title")
    public String englishTitle;

    @InterfaceC65349Pkn("font_color")
    public String fontColor;

    @InterfaceC65349Pkn("url")
    public UrlModel iconUrl;

    @InterfaceC65349Pkn("id")
    public int id;

    @InterfaceC65349Pkn("opacity")
    public int opacity;

    @InterfaceC65349Pkn("left_right_padding")
    public int padding = 4;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("type")
    public String type;

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getEnglishTitle() {
        return this.englishTitle;
    }

    public final String getFontColor() {
        return this.fontColor;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.id;
    }

    public final int getOpacity() {
        return this.opacity;
    }

    public final int getPadding() {
        return this.padding;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setEnglishTitle(String str) {
        this.englishTitle = str;
    }

    public final void setFontColor(String str) {
        this.fontColor = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setOpacity(int i) {
        this.opacity = i;
    }

    public final void setPadding(int i) {
        this.padding = i;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
