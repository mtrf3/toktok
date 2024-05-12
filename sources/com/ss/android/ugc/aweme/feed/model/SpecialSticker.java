package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes11.dex */
public class SpecialSticker implements Serializable {

    @InterfaceC65349Pkn("icon_url")
    public UrlModel iconUrl;

    @InterfaceC65349Pkn("link")
    public String linkUrl;

    @InterfaceC65349Pkn("open_url")
    public String openUrl;

    @InterfaceC65349Pkn("sticker_id")
    public String stickerId;

    @InterfaceC65349Pkn("sticker_type")
    public int stickerType;

    @InterfaceC65349Pkn("title")
    public String title;

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getStickerType() {
        return this.stickerType;
    }

    public String getTitle() {
        return this.title;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setStickerType(int i) {
        this.stickerType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
