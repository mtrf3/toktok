package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C107104Ig;
import X.C109544Rq;
import X.C61878OQg;
import X.C72972SkS;
import X.EF7;
import X.InterfaceC65349Pkn;
import X.ORZ;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareUserContent extends BaseContent {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("avatar")
    public UrlModel avatar;

    @InterfaceC65349Pkn("cover_url")
    public List<? extends UrlModel> awemeCoverList;

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("push_detail")
    public String pushDetail;

    @InterfaceC65349Pkn("secUID")
    public String secUid;

    @InterfaceC65349Pkn("uid")
    public String uid;

    public static final ShareUserContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher
    public List<UrlModel> fetchPreload() {
        List<UrlModel> LLILLL;
        List<? extends UrlModel> list = this.awemeCoverList;
        if (list == null || (LLILLL = ORZ.LLILLL(list, 3)) == null) {
            return C61878OQg.INSTANCE;
        }
        return LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        PureDataSharePackage.Companion.getClass();
        SharePackage LIZ = C107104Ig.LIZ("user");
        LIZ.extras.putSerializable("video_cover", this.avatar);
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        String string = EF7.LIZIZ().getString(R.string.h_l, this.name);
        o.LJIIIIZZ(string, "getApplicationContext().…g.im_user_msg_hint, name)");
        return string;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ShareUserContent fromSharePackage(SharePackage sharePackage) {
            o.LJIIIZ(sharePackage, "sharePackage");
            ShareUserContent shareUserContent = new ShareUserContent();
            shareUserContent.setUid(sharePackage.extras.getString("uid"));
            shareUserContent.setSecUid(sharePackage.extras.getString("sec_user_id"));
            shareUserContent.setName(sharePackage.extras.getString("name"));
            shareUserContent.setDesc(sharePackage.extras.getString("desc"));
            Serializable serializable = sharePackage.extras.getSerializable("video_cover");
            if (serializable instanceof UrlModel) {
                shareUserContent.setAvatar((UrlModel) serializable);
            }
            shareUserContent.pushDetail = sharePackage.extras.getString("name");
            String string = sharePackage.extras.getString("aweme_cover_list");
            if (!TextUtils.isEmpty(string)) {
                shareUserContent.setAwemeCoverList(JsonParseUtils.LIZIZ(UrlModel.class, string));
            }
            return shareUserContent;
        }
    }

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return C72972SkS.LJ(context, "context", R.string.h84, "context.resources.getStr….string.im_quote_profile)");
    }

    public final void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public final void setAwemeCoverList(List<? extends UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        Context LIZIZ = EF7.LIZIZ();
        if (z || z2) {
            String string = LIZIZ.getString(R.string.cj3, this.name);
            o.LJIIIIZZ(string, "{\n            context.ge…_profile, name)\n        }");
            return string;
        }
        String string2 = LIZIZ.getString(R.string.qh4, this.name);
        o.LJIIIIZZ(string2, "{\n            context.ge…_profile, name)\n        }");
        return string2;
    }
}
