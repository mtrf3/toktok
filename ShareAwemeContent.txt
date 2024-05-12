package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C107104Ig;
import X.C109544Rq;
import X.C113554cx;
import X.C1DD;
import X.C47261Igj;
import X.C72972SkS;
import X.C8SG;
import X.EF7;
import X.InterfaceC65349Pkn;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ShareAwemeContent extends BaseContent {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("author_username")
    public String authorUsername;
    public int awemeType;

    @InterfaceC65349Pkn("content_name")
    public String contentName;

    @InterfaceC65349Pkn("content_thumb")
    public UrlModel contentThumb;

    @InterfaceC65349Pkn("cover_url")
    public UrlModel coverUrl;

    @InterfaceC65349Pkn("diamond_game_id")
    public String diamondGameId;

    @InterfaceC65349Pkn("cover_height")
    public float height;

    @InterfaceC65349Pkn("hot_spot_create_time")
    public long hotSpotCreateTime;

    @InterfaceC65349Pkn("is_ad_fake")
    public boolean isAdFake;

    @InterfaceC65349Pkn("is_hot_spot_video")
    public boolean isHotSpotVideo;
    public boolean isStory;

    @InterfaceC65349Pkn("itemId")
    public String itemId;

    @InterfaceC65349Pkn("need_skip_strange")
    public int needSkipStrange;

    @InterfaceC65349Pkn("secUID")
    public String secUid;

    @InterfaceC65349Pkn("content_title")
    public String title;

    @InterfaceC65349Pkn("uid")
    public String user;

    @InterfaceC65349Pkn("cover_width")
    public float width;

    @InterfaceC65349Pkn("send_method")
    public String sendMethod = "";
    public String awemeMsgHint = "";

    public static final ShareAwemeContent fromAweme(Aweme aweme, String str) {
        return Companion.fromAweme(aweme, str);
    }

    public static final ShareAwemeContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    public static /* synthetic */ void getAwemeType$annotations() {
    }

    public boolean showQuoteHint() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher
    public List<UrlModel> fetchPreload() {
        UrlModel urlModel = this.coverUrl;
        if (urlModel != null) {
            return C47261Igj.LJJIJ(urlModel);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        PureDataSharePackage.Companion.getClass();
        SharePackage LIZ = C107104Ig.LIZ("aweme");
        Bundle bundle = LIZ.extras;
        bundle.putInt("aweme_type", this.awemeType);
        bundle.putString("item_id_string", this.itemId);
        bundle.putString("author_id", this.user);
        bundle.putSerializable("video_cover", this.coverUrl);
        bundle.putString("diamond_game_id", this.diamondGameId);
        bundle.putBoolean("is_hot_spot_video", this.isHotSpotVideo);
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        if (TextUtils.isEmpty(this.awemeMsgHint)) {
            this.awemeMsgHint = C1DD.LIZLLL(R.string.h9d, "context.getString(R.stri…ssion_cell_content_aweme)");
        }
        return this.awemeMsgHint;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ShareAwemeContent fromSharePackage(SharePackage sharePackage) {
            UrlModel urlModel;
            o.LJIIIZ(sharePackage, "sharePackage");
            ShareAwemeContent shareAwemeContent = new ShareAwemeContent();
            shareAwemeContent.setUser(sharePackage.extras.getString("uid_for_share"));
            shareAwemeContent.setSecUid(sharePackage.extras.getString("sec_user_id"));
            shareAwemeContent.setItemId(sharePackage.extras.getString("item_id_string"));
            Serializable serializable = sharePackage.extras.getSerializable("video_cover");
            UrlModel urlModel2 = null;
            if (serializable instanceof UrlModel) {
                urlModel = (UrlModel) serializable;
            } else {
                urlModel = null;
            }
            shareAwemeContent.setCoverUrl(urlModel);
            Serializable serializable2 = sharePackage.extras.getSerializable("thumb_for_share");
            if (serializable2 instanceof UrlModel) {
                urlModel2 = (UrlModel) serializable2;
            }
            shareAwemeContent.setContentThumb(urlModel2);
            shareAwemeContent.setContentName(sharePackage.extras.getString("author_name"));
            shareAwemeContent.setAuthorUsername(sharePackage.extras.getString("author_username"));
            shareAwemeContent.setAdFake(sharePackage.extras.getBoolean("is_ad_fake"));
            shareAwemeContent.setWidth(sharePackage.extras.getInt("aweme_width"));
            shareAwemeContent.setHeight(sharePackage.extras.getInt("aweme_height"));
            shareAwemeContent.setHotSpotVideo(sharePackage.extras.getBoolean("is_hot_spot_video"));
            shareAwemeContent.setHotSpotCreateTime(System.currentTimeMillis());
            if (o.LJ(sharePackage.itemType, "aweme_photo")) {
                shareAwemeContent.setAwemeType(150);
                shareAwemeContent.type = 810;
            } else {
                shareAwemeContent.setAwemeType(0);
                shareAwemeContent.type = 800;
            }
            shareAwemeContent.setTitle(sharePackage.extras.getString("desc"));
            shareAwemeContent.setDiamondGameId(sharePackage.extras.getString("diamond_game_id"));
            shareAwemeContent.setNeedSkipStrange(sharePackage.extras.getInt("key_message_source", 0));
            return shareAwemeContent;
        }

        public final boolean isVideoMention$im_base_release(C109544Rq c109544Rq) {
            String str;
            Map<String, String> ext;
            if (c109544Rq != null && (ext = c109544Rq.getExt()) != null) {
                str = ext.get("a:src");
            } else {
                str = null;
            }
            return o.LJ("video_mention", str);
        }

        public final boolean isVideoMentionAndTag$im_base_release(C109544Rq c109544Rq) {
            String str;
            Map<String, String> ext;
            if (c109544Rq != null && (ext = c109544Rq.getExt()) != null) {
                str = ext.get("a:src");
            } else {
                str = null;
            }
            return o.LJ("video_mention_and_tag", str);
        }

        public final boolean isVideoMentionOrTag$im_base_release(C109544Rq message) {
            o.LJIIIZ(message, "message");
            if (isVideoMention$im_base_release(message) || isVideoTag$im_base_release(message) || isVideoMentionAndTag$im_base_release(message)) {
                return true;
            }
            return false;
        }

        public final boolean isVideoTag$im_base_release(C109544Rq c109544Rq) {
            String str;
            Map<String, String> ext;
            if (c109544Rq != null && (ext = c109544Rq.getExt()) != null) {
                str = ext.get("a:src");
            } else {
                str = null;
            }
            return o.LJ("video_tag", str);
        }

        public final ShareAwemeContent fromAweme(Aweme aweme, String sendMethod) {
            o.LJIIIZ(aweme, "aweme");
            o.LJIIIZ(sendMethod, "sendMethod");
            ShareAwemeContent shareAwemeContent = new ShareAwemeContent();
            shareAwemeContent.setUser(aweme.getAuthor().getUid());
            shareAwemeContent.setSecUid(aweme.getAuthor().getSecUid());
            shareAwemeContent.setItemId(aweme.getAid());
            shareAwemeContent.setCoverUrl(aweme.getVideo().getCover());
            shareAwemeContent.setContentThumb(aweme.getAuthor().getAvatarThumb());
            shareAwemeContent.setContentName(aweme.getAuthor().getUserDisplayName());
            shareAwemeContent.setAuthorUsername(aweme.getAuthor().getUniqueId());
            shareAwemeContent.setAdFake(!aweme.isAd());
            shareAwemeContent.setWidth(aweme.getVideo().getWidth());
            shareAwemeContent.setHeight(aweme.getVideo().getHeight());
            shareAwemeContent.setHotSpotVideo(aweme.isHotVideoAweme());
            if (aweme.getAwemeType() == 150) {
                shareAwemeContent.setAwemeType(150);
                shareAwemeContent.type = 810;
            } else {
                shareAwemeContent.setAwemeType(0);
                shareAwemeContent.type = 800;
            }
            shareAwemeContent.setTitle(aweme.getDesc());
            shareAwemeContent.setSendMethod(sendMethod);
            return shareAwemeContent;
        }
    }

    public final String getAuthorUsername() {
        return this.authorUsername;
    }

    public final String getAwemeMsgHint() {
        return this.awemeMsgHint;
    }

    public final int getAwemeType() {
        return this.awemeType;
    }

    public final String getContentName() {
        return this.contentName;
    }

    public final UrlModel getContentThumb() {
        return this.contentThumb;
    }

    public final UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public final String getDiamondGameId() {
        return this.diamondGameId;
    }

    public final float getHeight() {
        return this.height;
    }

    public final long getHotSpotCreateTime() {
        return this.hotSpotCreateTime;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final int getNeedSkipStrange() {
        return this.needSkipStrange;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getSendMethod() {
        return this.sendMethod;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUser() {
        return this.user;
    }

    public final float getWidth() {
        return this.width;
    }

    public final boolean isAdFake() {
        return this.isAdFake;
    }

    public final boolean isHotSpotVideo() {
        return this.isHotSpotVideo;
    }

    public final boolean isStory() {
        return this.isStory;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public Map<String, String> getExtForShare(C109544Rq message) {
        o.LJIIIZ(message, "message");
        Map<String, String> ext = message.getExt();
        o.LJIIIIZZ(ext, "message.ext");
        Map<String, String> LJJLIL = C113554cx.LJJLIL(ext);
        if (Companion.isVideoMentionOrTag$im_base_release(message)) {
            LJJLIL.remove("a:src");
        }
        return LJJLIL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return C72972SkS.LJ(context, "context", R.string.h89, "context.resources.getStr…(R.string.im_quote_video)");
    }

    public final void setAdFake(boolean z) {
        this.isAdFake = z;
    }

    public final void setAuthorUsername(String str) {
        this.authorUsername = str;
    }

    public final void setAwemeMsgHint(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.awemeMsgHint = str;
    }

    public final void setAwemeType(int i) {
        this.awemeType = i;
    }

    public final void setContentName(String str) {
        this.contentName = str;
    }

    public final void setContentThumb(UrlModel urlModel) {
        this.contentThumb = urlModel;
    }

    public final void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public final void setDiamondGameId(String str) {
        this.diamondGameId = str;
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final void setHotSpotCreateTime(long j) {
        this.hotSpotCreateTime = j;
    }

    public final void setHotSpotVideo(boolean z) {
        this.isHotSpotVideo = z;
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public final void setNeedSkipStrange(int i) {
        this.needSkipStrange = i;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setSendMethod(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.sendMethod = str;
    }

    public final void setStory(boolean z) {
        this.isStory = z;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUser(String str) {
        this.user = str;
    }

    public final void setWidth(float f) {
        this.width = f;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        String string;
        Context LIZIZ = EF7.LIZIZ();
        if ((z || z2) && C8SG.LIZIZ.LJJIFFI() && this.type == 810) {
            string = LIZIZ.getString(R.string.cj2);
            o.LJIIIIZZ(string, "context.getString(R.string.cell_sent_photo)");
        } else if (z || z2) {
            Companion companion = Companion;
            if (companion.isVideoMention$im_base_release(c109544Rq)) {
                string = LIZIZ.getString(R.string.eox);
            } else if (companion.isVideoTag$im_base_release(c109544Rq)) {
                string = LIZIZ.getString(R.string.ep1);
            } else if (companion.isVideoMentionAndTag$im_base_release(c109544Rq)) {
                string = LIZIZ.getString(R.string.eoz);
            } else {
                string = LIZIZ.getString(R.string.cj5);
            }
            o.LJIIIIZZ(string, "{\n                when {…          }\n            }");
        } else if (C8SG.LIZIZ.LJJIFFI() && this.type == 810) {
            string = LIZIZ.getString(R.string.qh3);
            o.LJIIIIZZ(string, "context.getString(R.string.self_sent_photo)");
        } else {
            Companion companion2 = Companion;
            if (companion2.isVideoMention$im_base_release(c109544Rq)) {
                string = LIZIZ.getString(R.string.eoy);
            } else if (companion2.isVideoTag$im_base_release(c109544Rq)) {
                string = LIZIZ.getString(R.string.ep2);
            } else if (companion2.isVideoMentionAndTag$im_base_release(c109544Rq)) {
                string = LIZIZ.getString(R.string.ep0);
            } else {
                string = LIZIZ.getString(R.string.qh6);
            }
            o.LJIIIIZZ(string, "{\n                when {…          }\n            }");
        }
        this.awemeMsgHint = string;
        return string;
    }
}
