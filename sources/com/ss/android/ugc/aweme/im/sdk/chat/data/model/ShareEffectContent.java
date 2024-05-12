package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C107104Ig;
import X.C109544Rq;
import X.C65777Prh;
import X.EF7;
import X.InterfaceC65349Pkn;
import android.content.Context;
import android.os.Bundle;
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
public final class ShareEffectContent extends BaseContent {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("video_cover_urls")
    public List<UrlModel> awemeCoverList;

    @InterfaceC65349Pkn("cover_url")
    public UrlModel cover;

    @InterfaceC65349Pkn("sticker_id")
    public String stickerId = "";

    @InterfaceC65349Pkn("text")
    public String title = "";

    @InterfaceC65349Pkn("user_count")
    public Long userCount = 0L;

    public static final ShareEffectContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher
    public List<UrlModel> fetchPreload() {
        List<UrlModel> list = this.awemeCoverList;
        if (list == null || list.size() < 3) {
            return null;
        }
        return list;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        PureDataSharePackage.Companion.getClass();
        SharePackage LIZ = C107104Ig.LIZ("sticker");
        LIZ.extras.putSerializable("video_cover", this.cover);
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        String string = EF7.LIZIZ().getResources().getString(R.string.cpe, this.title);
        o.LJIIIIZZ(string, "AppContextManager.getApp…_transmit_sticker, title)");
        return string;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ShareEffectContent fromSharePackage(SharePackage sharePackage) {
            UrlModel urlModel;
            o.LJIIIZ(sharePackage, "sharePackage");
            ShareEffectContent shareEffectContent = new ShareEffectContent();
            Bundle bundle = sharePackage.extras;
            shareEffectContent.setStickerId(bundle.getString("sticker_id"));
            shareEffectContent.setTitle(bundle.getString("sticker_name"));
            shareEffectContent.setUserCount(Long.valueOf(bundle.getLong("user_count")));
            Serializable serializable = bundle.getSerializable("video_cover");
            List<UrlModel> list = null;
            if (serializable instanceof UrlModel) {
                urlModel = (UrlModel) serializable;
            } else {
                urlModel = null;
            }
            shareEffectContent.setCover(urlModel);
            String string = bundle.getString("aweme_cover_list");
            if (string != null && string.length() != 0) {
                Object LIZJ = JsonParseUtils.LIZJ(List.class, string);
                if (C65777Prh.LJI(LIZJ)) {
                    list = (List) LIZJ;
                }
                shareEffectContent.setAwemeCoverList(list);
            }
            return shareEffectContent;
        }
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getUserCount() {
        return this.userCount;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        o.LJIIIZ(context, "context");
        String string = context.getResources().getString(R.string.h7x, this.title);
        o.LJIIIIZZ(string, "context.resources.getStr…g.im_quote_effect, title)");
        return string;
    }

    public final void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUserCount(Long l) {
        this.userCount = l;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        Context LIZIZ = EF7.LIZIZ();
        if (z || z2) {
            String string = LIZIZ.getString(R.string.civ, this.title);
            o.LJIIIIZZ(string, "{\n            context.ge…_effect, title)\n        }");
            return string;
        }
        String string2 = LIZIZ.getString(R.string.qgx, this.title);
        o.LJIIIIZZ(string2, "{\n            context.ge…_effect, title)\n        }");
        return string2;
    }
}
