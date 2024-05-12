package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C107104Ig;
import X.C109544Rq;
import X.C61878OQg;
import X.EF7;
import X.InterfaceC65349Pkn;
import X.ORZ;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareChallengeContent extends BaseContent {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("challenge_id")
    public String challengeId;

    @InterfaceC65349Pkn("cover_url")
    public List<? extends UrlModel> coverUrl;

    @InterfaceC65349Pkn("is_commerce")
    public boolean isCommerce;

    @InterfaceC65349Pkn("push_detail")
    public String pushDetail;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("user_count")
    public long userCount;

    public static final ShareChallengeContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher
    public List<UrlModel> fetchPreload() {
        List<UrlModel> LLILLL;
        List<? extends UrlModel> list = this.coverUrl;
        if (list == null || (LLILLL = ORZ.LLILLL(list, 3)) == null) {
            return C61878OQg.INSTANCE;
        }
        return LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        PureDataSharePackage.Companion.getClass();
        return C107104Ig.LIZ("challenge");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        String string = EF7.LIZIZ().getResources().getString(R.string.h4n, this.pushDetail);
        o.LJIIIIZZ(string, "getApplicationContext().…nge_msg_hint, pushDetail)");
        return string;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ShareChallengeContent fromSharePackage(SharePackage sharePackage) {
            o.LJIIIZ(sharePackage, "sharePackage");
            String string = sharePackage.extras.getString("challenge_id");
            String string2 = sharePackage.extras.getString("challenge_name");
            boolean z = sharePackage.extras.getBoolean("is_commerce");
            int i = sharePackage.extras.getInt("user_count");
            String string3 = sharePackage.extras.getString("cover_thumb");
            ShareChallengeContent shareChallengeContent = new ShareChallengeContent();
            shareChallengeContent.setChallengeId(string);
            shareChallengeContent.setTitle(string2);
            shareChallengeContent.setCommerce(z);
            shareChallengeContent.setUserCount(i);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('#');
            LIZ.append(shareChallengeContent.getTitle());
            shareChallengeContent.setPushDetail(X1D.LIZIZ(LIZ));
            if (!TextUtils.isEmpty(string3)) {
                shareChallengeContent.setCoverUrl(JsonParseUtils.LIZIZ(UrlModel.class, string3));
            }
            return shareChallengeContent;
        }
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final List<UrlModel> getCoverUrl() {
        return this.coverUrl;
    }

    public final String getPushDetail() {
        return this.pushDetail;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getUserCount() {
        return this.userCount;
    }

    public final boolean isCommerce() {
        return this.isCommerce;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        o.LJIIIZ(context, "context");
        String string = context.getResources().getString(R.string.h80, this.title);
        o.LJIIIIZZ(string, "context.resources.getStr….im_quote_hashtag, title)");
        return string;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setCommerce(boolean z) {
        this.isCommerce = z;
    }

    public final void setCoverUrl(List<? extends UrlModel> list) {
        this.coverUrl = list;
    }

    public final void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUserCount(long j) {
        this.userCount = j;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        Context LIZIZ = EF7.LIZIZ();
        if (z || z2) {
            String string = LIZIZ.getString(R.string.ciy, this.pushDetail);
            o.LJIIIIZZ(string, "{\n            context.ge…ag, pushDetail)\n        }");
            return string;
        }
        String string2 = LIZIZ.getString(R.string.qh0, this.pushDetail);
        o.LJIIIIZZ(string2, "{\n            context.ge…ag, pushDetail)\n        }");
        return string2;
    }
}
