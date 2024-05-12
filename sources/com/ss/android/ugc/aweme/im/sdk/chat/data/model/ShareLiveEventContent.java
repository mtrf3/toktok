package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C107104Ig;
import X.C109544Rq;
import X.C72972SkS;
import X.EF7;
import X.InterfaceC65349Pkn;
import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareLiveEventContent extends BaseContent {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("event_id")
    public String eventId;

    @InterfaceC65349Pkn("link_url")
    public String linkUrl;

    @InterfaceC65349Pkn("organizer_avatar")
    public UrlModel organizerAvatar;

    @InterfaceC65349Pkn("organizer_enterprise")
    public String organizerEnterprise;

    @InterfaceC65349Pkn("organizer_name")
    public String organizerName;

    @InterfaceC65349Pkn("organizer_verify_reason")
    public String organizerVerifyReason;

    @InterfaceC65349Pkn("organizer_id")
    public String organizerd;

    @InterfaceC65349Pkn("start_time")
    public String startTime;

    @InterfaceC65349Pkn("title")
    public String title;

    public static final ShareLiveEventContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        PureDataSharePackage.Companion.getClass();
        SharePackage LIZ = C107104Ig.LIZ("live_event");
        LIZ.extras.putString("live_event_title", this.title);
        return LIZ;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ShareLiveEventContent fromSharePackage(SharePackage sharePackage) {
            UrlModel urlModel;
            o.LJIIIZ(sharePackage, "sharePackage");
            ShareLiveEventContent shareLiveEventContent = new ShareLiveEventContent();
            shareLiveEventContent.setEventId(sharePackage.extras.getString("live_event_id"));
            shareLiveEventContent.setTitle(sharePackage.extras.getString("live_event_title"));
            shareLiveEventContent.setStartTime(sharePackage.extras.getString("live_event_start_time"));
            shareLiveEventContent.setLinkUrl(sharePackage.extras.getString("live_event_internal_share_url"));
            shareLiveEventContent.setOrganizerd(sharePackage.extras.getString("live_event_author_id"));
            shareLiveEventContent.setOrganizerName(sharePackage.extras.getString("live_event_author_name"));
            shareLiveEventContent.setOrganizerVerifyReason(sharePackage.extras.getString("live_event_author_verify_info"));
            shareLiveEventContent.setOrganizerEnterprise(sharePackage.extras.getString("live_event_author_enterprise"));
            Serializable serializable = sharePackage.extras.getSerializable("live_event_author_avatar");
            if (serializable instanceof UrlModel) {
                urlModel = (UrlModel) serializable;
            } else {
                urlModel = null;
            }
            shareLiveEventContent.setOrganizerAvatar(urlModel);
            return shareLiveEventContent;
        }
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final UrlModel getOrganizerAvatar() {
        return this.organizerAvatar;
    }

    public final String getOrganizerEnterprise() {
        return this.organizerEnterprise;
    }

    public final String getOrganizerName() {
        return this.organizerName;
    }

    public final String getOrganizerVerifyReason() {
        return this.organizerVerifyReason;
    }

    public final String getOrganizerd() {
        return this.organizerd;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return C72972SkS.LJ(context, "context", R.string.h7w, "context.resources.getStr…ring.im_quote_Live_event)");
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public final void setOrganizerAvatar(UrlModel urlModel) {
        this.organizerAvatar = urlModel;
    }

    public final void setOrganizerEnterprise(String str) {
        this.organizerEnterprise = str;
    }

    public final void setOrganizerName(String str) {
        this.organizerName = str;
    }

    public final void setOrganizerVerifyReason(String str) {
        this.organizerVerifyReason = str;
    }

    public final void setOrganizerd(String str) {
        this.organizerd = str;
    }

    public final void setStartTime(String str) {
        this.startTime = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        Context LIZIZ = EF7.LIZIZ();
        if (z || z2) {
            String string = LIZIZ.getString(R.string.g70);
            o.LJIIIIZZ(string, "{\n            context.ge…ents_dm_share2)\n        }");
            return string;
        }
        String string2 = LIZIZ.getString(R.string.g6z);
        o.LJIIIIZZ(string2, "{\n            context.ge…vents_dm_share)\n        }");
        return string2;
    }
}
