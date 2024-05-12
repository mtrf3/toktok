package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C107104Ig;
import X.C109544Rq;
import X.C61878OQg;
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
public final class ShareMusicContent extends BaseContent {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("cover_url")
    public List<? extends UrlModel> awemeCoverList;

    @InterfaceC65349Pkn("music_cover")
    public UrlModel coverThumb;

    @InterfaceC65349Pkn("music_id")
    public String musicId;

    @InterfaceC65349Pkn("title")
    public String musicName;

    @InterfaceC65349Pkn("push_detail")
    public String pushDetail;

    @InterfaceC65349Pkn("user_count")
    public int userCount;

    public static final ShareMusicContent fromSharePackage(SharePackage sharePackage) {
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
        SharePackage LIZ = C107104Ig.LIZ("music");
        LIZ.extras.putSerializable("video_cover", this.coverThumb);
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        String string = EF7.LIZIZ().getString(R.string.h7_, this.musicName);
        o.LJIIIIZZ(string, "getApplicationContext().…usic_msg_hint, musicName)");
        return string;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ShareMusicContent fromSharePackage(SharePackage sharePackage) {
            UrlModel urlModel;
            o.LJIIIZ(sharePackage, "sharePackage");
            int i = sharePackage.extras.getInt("user_count");
            Serializable serializable = sharePackage.extras.getSerializable("video_cover");
            UrlModel urlModel2 = null;
            if (serializable instanceof UrlModel) {
                urlModel = (UrlModel) serializable;
            } else {
                urlModel = null;
            }
            Serializable serializable2 = sharePackage.extras.getSerializable("cover_thumb");
            if (serializable2 instanceof UrlModel) {
                urlModel2 = (UrlModel) serializable2;
            }
            String string = sharePackage.extras.getString("aweme_cover_list");
            ShareMusicContent shareMusicContent = new ShareMusicContent();
            shareMusicContent.setMusicId(sharePackage.extras.getString("music_id"));
            shareMusicContent.setMusicName(sharePackage.extras.getString("music_name"));
            shareMusicContent.setPushDetail(shareMusicContent.getMusicName());
            shareMusicContent.setUserCount(i);
            if (urlModel != null) {
                shareMusicContent.setCoverThumb(urlModel);
            } else if (urlModel2 != null) {
                shareMusicContent.setCoverThumb(urlModel2);
            }
            if (!TextUtils.isEmpty(string)) {
                shareMusicContent.setAwemeCoverList(JsonParseUtils.LIZIZ(UrlModel.class, string));
            }
            return shareMusicContent;
        }
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final UrlModel getCoverThumb() {
        return this.coverThumb;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getMusicName() {
        return this.musicName;
    }

    public final String getPushDetail() {
        return this.pushDetail;
    }

    public final int getUserCount() {
        return this.userCount;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        o.LJIIIZ(context, "context");
        String string = context.getResources().getString(R.string.h86, this.musicName);
        o.LJIIIIZZ(string, "context.resources.getStr…m_quote_sound, musicName)");
        return string;
    }

    public final void setAwemeCoverList(List<? extends UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setCoverThumb(UrlModel urlModel) {
        this.coverThumb = urlModel;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicName(String str) {
        this.musicName = str;
    }

    public final void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public final void setUserCount(int i) {
        this.userCount = i;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        Context LIZIZ = EF7.LIZIZ();
        if (z || z2) {
            String string = LIZIZ.getString(R.string.cj4);
            o.LJIIIIZZ(string, "{\n            context.ge…ell_sent_sound)\n        }");
            return string;
        }
        String string2 = LIZIZ.getString(R.string.qh5);
        o.LJIIIIZZ(string2, "{\n            context.ge…elf_sent_sound)\n        }");
        return string2;
    }
}
