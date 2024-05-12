package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C109544Rq;
import X.C116724i4;
import X.C1GE;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes2.dex */
public class SystemCardContent extends BaseContent {

    @InterfaceC65349Pkn("business_id")
    public String businessId;

    @InterfaceC65349Pkn("extract")
    public final String extract;

    @InterfaceC65349Pkn("link_cards")
    public final List<LinkCard> linkCards;

    @InterfaceC65349Pkn("link_info")
    public LinkInfo linkInfo;

    @InterfaceC65349Pkn("text_info")
    public TextInfo textInfo;

    @InterfaceC65349Pkn("title")
    public Title title;

    @InterfaceC65349Pkn("video_info")
    public VideoInfo videoInfo;

    public final String getBusinessId() {
        return this.businessId;
    }

    public final String getExtract() {
        return this.extract;
    }

    public final List<LinkCard> getLinkCards() {
        return this.linkCards;
    }

    public final LinkInfo getLinkInfo() {
        return this.linkInfo;
    }

    public final TextInfo getTextInfo() {
        return this.textInfo;
    }

    public final Title getTitle() {
        return this.title;
    }

    public final VideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public final void setBusinessId(String str) {
        this.businessId = str;
    }

    public final void setLinkInfo(LinkInfo linkInfo) {
        this.linkInfo = linkInfo;
    }

    public final void setTextInfo(TextInfo textInfo) {
        this.textInfo = textInfo;
    }

    public final void setTitle(Title title) {
        this.title = title;
    }

    public final void setVideoInfo(VideoInfo videoInfo) {
        this.videoInfo = videoInfo;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        MessageTitle title;
        String title2;
        String str2 = "";
        if (C1GE.LJIIL(this.extract)) {
            String str3 = this.extract;
            if (str3 == null) {
                return "";
            }
            return str3;
        }
        C116724i4 c116724i4 = new C116724i4();
        TextInfo textInfo = this.textInfo;
        if (textInfo != null && (title = textInfo.getTitle()) != null && (title2 = title.getTitle()) != null) {
            str2 = title2;
        }
        c116724i4.LIZIZ(str2);
        return c116724i4.LIZ.toString();
    }
}
