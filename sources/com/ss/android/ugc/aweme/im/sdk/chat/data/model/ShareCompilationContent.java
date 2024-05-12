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
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareCompilationContent extends BaseContent {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("video_cover_urls")
    public List<UrlModel> awemeCoverList;

    @InterfaceC65349Pkn("mix_id")
    public String compilationId = "";

    @InterfaceC65349Pkn("author_id")
    public String authorId = "";

    @InterfaceC65349Pkn("author_secuid")
    public String authorSecUId = "";

    @InterfaceC65349Pkn("author_name")
    public String authorName = "";

    @InterfaceC65349Pkn("title")
    public String title = "";

    public static final ShareCompilationContent fromSharePackage(SharePackage sharePackage) {
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
        return C107104Ig.LIZ("mix_videos");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        String string = EF7.LIZIZ().getResources().getString(R.string.h83, this.title);
        o.LJIIIIZZ(string, "AppContextManager.getApp…im_quote_playlist, title)");
        return string;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ShareCompilationContent fromSharePackage(SharePackage sharePackage) {
            List<UrlModel> list;
            o.LJIIIZ(sharePackage, "sharePackage");
            ShareCompilationContent shareCompilationContent = new ShareCompilationContent();
            Bundle bundle = sharePackage.extras;
            shareCompilationContent.setCompilationId(bundle.getString("compilation_id"));
            shareCompilationContent.setAuthorId(bundle.getString("user_id"));
            shareCompilationContent.setAuthorSecUId(bundle.getString("sec_user_id"));
            shareCompilationContent.setAuthorName(bundle.getString("name"));
            shareCompilationContent.setTitle(bundle.getString("compilation_name"));
            String string = bundle.getString("aweme_cover_list");
            if (string != null && string.length() != 0) {
                Object LIZJ = JsonParseUtils.LIZJ(List.class, string);
                if (C65777Prh.LJI(LIZJ)) {
                    list = (List) LIZJ;
                } else {
                    list = null;
                }
                shareCompilationContent.setAwemeCoverList(list);
            }
            return shareCompilationContent;
        }
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getAuthorSecUId() {
        return this.authorSecUId;
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final String getCompilationId() {
        return this.compilationId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setAuthorName(String str) {
        this.authorName = str;
    }

    public final void setAuthorSecUId(String str) {
        this.authorSecUId = str;
    }

    public final void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setCompilationId(String str) {
        this.compilationId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        Context LIZIZ = EF7.LIZIZ();
        if (z || z2) {
            String string = LIZIZ.getString(R.string.jtr, this.title);
            o.LJIIIIZZ(string, "{\n            context.ge…eceiver, title)\n        }");
            return string;
        }
        String string2 = LIZIZ.getString(R.string.jts, this.title);
        o.LJIIIIZZ(string2, "{\n            context.ge…_sender, title)\n        }");
        return string2;
    }
}
