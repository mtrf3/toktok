package com.ss.android.ugc.aweme.im.service.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class NoticePushMessage implements Serializable {

    @InterfaceC65349Pkn("image_url")
    public String imageUrl = "";

    @InterfaceC65349Pkn("from_uid")
    public String fromUid = "";

    @InterfaceC65349Pkn("from_sec_uid")
    public String fromSecUid = "";

    @InterfaceC65349Pkn("content")
    public String content = "";

    @InterfaceC65349Pkn("title")
    public String title = "";

    @InterfaceC65349Pkn("push_type")
    public String pushType = "";

    @InterfaceC65349Pkn("inapp_push_type")
    public String inAppPushType = "";

    @InterfaceC65349Pkn("open_url")
    public String openUrl = "";

    @InterfaceC65349Pkn("item_id")
    public String itemId = "";

    public final String getContent() {
        return this.content;
    }

    public final String getFromSecUid() {
        return this.fromSecUid;
    }

    public final String getFromUid() {
        return this.fromUid;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getInAppPushType() {
        return this.inAppPushType;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getPushType() {
        return this.pushType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setFromSecUid(String str) {
        this.fromSecUid = str;
    }

    public final void setFromUid(String str) {
        this.fromUid = str;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setInAppPushType(String str) {
        this.inAppPushType = str;
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public final void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public final void setPushType(String str) {
        this.pushType = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
