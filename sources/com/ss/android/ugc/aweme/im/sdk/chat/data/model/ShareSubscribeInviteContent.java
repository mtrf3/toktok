package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C107104Ig;
import X.C109544Rq;
import X.C72972SkS;
import X.EF7;
import X.InterfaceC65349Pkn;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareSubscribeInviteContent extends BaseContent {
    public static final Companion Companion = new Companion();

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

    public static final ShareSubscribeInviteContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        PureDataSharePackage.Companion.getClass();
        SharePackage LIZ = C107104Ig.LIZ("subscribe_invite");
        LIZ.extras.putSerializable("thumb_url", this.image);
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        String string = EF7.LIZIZ().getString(R.string.h_p, this.title);
        o.LJIIIIZZ(string, "getApplicationContext().…g.im_web_msg_hint, title)");
        return string;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ShareSubscribeInviteContent fromSharePackage(SharePackage sharePackage) {
            o.LJIIIZ(sharePackage, "sharePackage");
            ShareSubscribeInviteContent shareSubscribeInviteContent = new ShareSubscribeInviteContent();
            shareSubscribeInviteContent.setTitle(sharePackage.title);
            shareSubscribeInviteContent.setDesc(sharePackage.description);
            shareSubscribeInviteContent.setImage(sharePackage.extras.getString("thumb_url"));
            String string = sharePackage.extras.getString("url_for_im_share");
            if (TextUtils.isEmpty(string)) {
                string = sharePackage.url;
            }
            shareSubscribeInviteContent.setUrl(string);
            shareSubscribeInviteContent.setPushDetail(sharePackage.title);
            return shareSubscribeInviteContent;
        }
    }

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

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return C72972SkS.LJ(context, "context", R.string.h81, "context.resources.getStr…g(R.string.im_quote_link)");
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

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        Context LIZIZ = EF7.LIZIZ();
        if (z || z2) {
            String string = LIZIZ.getString(R.string.ciz);
            o.LJIIIIZZ(string, "{\n            context.ge…cell_sent_link)\n        }");
            return string;
        }
        String string2 = LIZIZ.getString(R.string.qh1);
        o.LJIIIIZZ(string2, "{\n            context.ge…self_sent_link)\n        }");
        return string2;
    }
}
