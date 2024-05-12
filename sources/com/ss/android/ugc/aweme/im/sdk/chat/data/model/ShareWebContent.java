package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C107104Ig;
import X.C109544Rq;
import X.C72972SkS;
import X.EF7;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareWebContent extends AbsShareWebContent {
    public static final Companion Companion = new Companion();

    public static final ShareWebContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        PureDataSharePackage.Companion.getClass();
        SharePackage LIZ = C107104Ig.LIZ("web");
        LIZ.extras.putSerializable("thumb_url", getImage());
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.AbsShareWebContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        String string = EF7.LIZIZ().getString(R.string.h_p, getTitle());
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

        public final ShareWebContent fromSharePackage(SharePackage sharePackage) {
            o.LJIIIZ(sharePackage, "sharePackage");
            ShareWebContent shareWebContent = new ShareWebContent();
            shareWebContent.setTitle(sharePackage.title);
            shareWebContent.setDesc(sharePackage.description);
            shareWebContent.setImage(sharePackage.extras.getString("thumb_url"));
            String string = sharePackage.extras.getString("url_for_im_share");
            if (TextUtils.isEmpty(string)) {
                string = sharePackage.url;
            }
            shareWebContent.setUrl(string);
            shareWebContent.setPushDetail(sharePackage.title);
            return shareWebContent;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return C72972SkS.LJ(context, "context", R.string.h81, "context.resources.getStr…g(R.string.im_quote_link)");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.AbsShareWebContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
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
