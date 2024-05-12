package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C107104Ig;
import X.C109544Rq;
import X.EF7;
import X.InterfaceC65349Pkn;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareSearchContent extends BaseContent {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("image")
    public String image;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("url")
    public String url;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        PureDataSharePackage.Companion.getClass();
        SharePackage LIZ = C107104Ig.LIZ("search");
        Bundle bundle = LIZ.extras;
        String str = this.image;
        if (str == null) {
            str = "";
        }
        bundle.putSerializable("thumb_url", str);
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        Context LIZIZ = EF7.LIZIZ();
        Object[] objArr = new Object[1];
        String str = this.title;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        String string = LIZIZ.getString(R.string.h_p, objArr);
        o.LJIIIIZZ(string, "AppContextManager.getApp…eb_msg_hint, title ?: \"\")");
        return string;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ShareSearchContent fromSharePackage(SharePackage sharePackage) {
            o.LJIIIZ(sharePackage, "sharePackage");
            ShareSearchContent shareSearchContent = new ShareSearchContent();
            shareSearchContent.setTitle(sharePackage.title);
            shareSearchContent.setDesc(sharePackage.description);
            shareSearchContent.setImage(sharePackage.extras.getString("thumb_url"));
            shareSearchContent.setSchema(sharePackage.extras.getString("schema"));
            String string = sharePackage.extras.getString("url_for_im_share");
            if (TextUtils.isEmpty(string)) {
                string = sharePackage.url;
            }
            shareSearchContent.setUrl(string);
            return shareSearchContent;
        }
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getSchema() {
        return this.schema;
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

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        String string;
        Context LIZIZ = EF7.LIZIZ();
        if (z || z2) {
            string = LIZIZ.getString(R.string.ciz);
        } else {
            string = LIZIZ.getString(R.string.qh1);
        }
        o.LJIIIIZZ(string, "if (isReceive || isFromP…self_sent_link)\n        }");
        return string;
    }
}
