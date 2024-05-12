package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C109544Rq;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public abstract class AbsShareWebContent extends BaseContent {

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("cover_url")
    public String image;

    @InterfaceC65349Pkn("push_detail")
    public String pushDetail;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("link_url")
    public String url;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public abstract String getMsgHint();

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public abstract String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq);

    public final String getDesc() {
        return this.desc;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getPushDetail() {
        return this.pushDetail;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
