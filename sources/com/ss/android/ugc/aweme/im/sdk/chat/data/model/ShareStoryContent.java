package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C107104Ig;
import X.C109544Rq;
import X.C54838Lfe;
import X.C55723Ltv;
import X.C72972SkS;
import X.EF7;
import X.InterfaceC65349Pkn;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareStoryContent extends ShareAwemeContent {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("expired_at")
    public Long expireAt = 0L;

    @InterfaceC65349Pkn("source_type")
    public Integer sourceType = 0;
    public String storyCollectionId = "";

    public static final ShareStoryContent fromAweme(Aweme aweme) {
        return Companion.fromAweme(aweme);
    }

    public static final ShareStoryContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    public static final boolean isStory(BaseContent baseContent) {
        return Companion.isStory(baseContent);
    }

    public static final boolean isStoryExpired(ShareStoryContent shareStoryContent) {
        return Companion.isStoryExpired(shareStoryContent);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent
    public boolean showQuoteHint() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        long j;
        PureDataSharePackage.Companion.getClass();
        SharePackage LIZ = C107104Ig.LIZ("story_video");
        Bundle bundle = LIZ.extras;
        bundle.putInt("aweme_type", getAwemeType());
        bundle.putString("item_id_string", getItemId());
        bundle.putString("author_id", getUser());
        bundle.putString("author_name", getContentName());
        bundle.putSerializable("video_cover", getCoverUrl());
        bundle.putSerializable("thumb_for_share", getContentThumb());
        bundle.putString("desc", getTitle());
        Long l = this.expireAt;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        bundle.putLong("expired_at", j);
        bundle.putInt("source_type", 3);
        bundle.putInt("aweme_height", (int) getHeight());
        bundle.putInt("aweme_width", (int) getWidth());
        bundle.putInt("aweme_type", this.type);
        bundle.putBoolean("is_story", isStory());
        return LIZ;
    }

    public ShareStoryContent() {
        setStory(true);
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        private final int getAweType(Integer num) {
            if (num == null || num.intValue() != 1) {
                return 1;
            }
            return 0;
        }

        public final ShareStoryContent fromAweme(Aweme aweme) {
            UrlModel urlModel;
            UrlModel urlModel2;
            String str;
            float f;
            long j;
            o.LJIIIZ(aweme, "aweme");
            ShareStoryContent shareStoryContent = new ShareStoryContent();
            shareStoryContent.setUser(aweme.getAuthorUid());
            shareStoryContent.setSecUid(aweme.getSecAuthorUid());
            shareStoryContent.setItemId(aweme.getAid());
            shareStoryContent.setStoryCollectionId(C54838Lfe.LJI(aweme));
            Video video = aweme.getVideo();
            if (video == null || (urlModel = video.getCover()) == null) {
                urlModel = new UrlModel();
            }
            shareStoryContent.setCoverUrl(urlModel);
            User author = aweme.getAuthor();
            if (author == null || (urlModel2 = author.getAvatarThumb()) == null) {
                urlModel2 = new UrlModel();
            }
            shareStoryContent.setContentThumb(urlModel2);
            User author2 = aweme.getAuthor();
            if (author2 == null || (str = author2.getNickname()) == null) {
                str = "";
            }
            shareStoryContent.setContentName(str);
            Video video2 = aweme.getVideo();
            float f2 = 0.0f;
            if (video2 != null) {
                f = video2.getWidth();
            } else {
                f = 0.0f;
            }
            shareStoryContent.setWidth(f);
            Video video3 = aweme.getVideo();
            if (video3 != null) {
                f2 = video3.getHeight();
            }
            shareStoryContent.setHeight(f2);
            shareStoryContent.setTitle(aweme.getDesc());
            Story story = aweme.getStory();
            if (story != null) {
                j = story.getExpiredAt();
            } else {
                j = 0;
            }
            shareStoryContent.setExpireAt(Long.valueOf(j));
            shareStoryContent.setSourceType(1);
            shareStoryContent.setAwemeType(aweme.getAwemeType());
            shareStoryContent.type = ShareStoryContent.Companion.getAweType(shareStoryContent.getSourceType());
            shareStoryContent.setStory(aweme.getIsTikTokStory());
            return shareStoryContent;
        }

        public final ShareStoryContent fromSharePackage(SharePackage sharePackage) {
            UrlModel urlModel;
            o.LJIIIZ(sharePackage, "sharePackage");
            ShareStoryContent shareStoryContent = new ShareStoryContent();
            Bundle bundle = sharePackage.extras;
            shareStoryContent.setUser(bundle.getString("uid_for_share"));
            shareStoryContent.setSecUid(bundle.getString("sec_user_id"));
            shareStoryContent.setItemId(bundle.getString("item_id_string"));
            Serializable serializable = bundle.getSerializable("video_cover");
            UrlModel urlModel2 = null;
            if (serializable instanceof UrlModel) {
                urlModel = (UrlModel) serializable;
            } else {
                urlModel = null;
            }
            shareStoryContent.setCoverUrl(urlModel);
            Serializable serializable2 = bundle.getSerializable("thumb_for_share");
            if (serializable2 instanceof UrlModel) {
                urlModel2 = (UrlModel) serializable2;
            }
            shareStoryContent.setContentThumb(urlModel2);
            shareStoryContent.setContentName(bundle.getString("author_name"));
            shareStoryContent.setWidth(bundle.getInt("aweme_width"));
            shareStoryContent.setHeight(bundle.getInt("aweme_height"));
            shareStoryContent.setTitle(bundle.getString("desc"));
            shareStoryContent.setExpireAt(Long.valueOf(bundle.getLong("expired_at", 0L)));
            shareStoryContent.setSourceType(Integer.valueOf(bundle.getInt("source_type", 0)));
            shareStoryContent.setAwemeType(bundle.getInt("aweme_type"));
            shareStoryContent.type = ShareStoryContent.Companion.getAweType(shareStoryContent.getSourceType());
            shareStoryContent.setStory(bundle.getBoolean("is_story"));
            return shareStoryContent;
        }

        public final boolean isStory(BaseContent content) {
            o.LJIIIZ(content, "content");
            return content instanceof ShareStoryContent;
        }

        public final boolean isStoryExpired(ShareStoryContent content) {
            o.LJIIIZ(content, "content");
            Long expireAt = content.getExpireAt();
            if (expireAt != null && expireAt.longValue() < System.currentTimeMillis()) {
                return true;
            }
            return false;
        }
    }

    public final Long getExpireAt() {
        return this.expireAt;
    }

    public final Integer getSourceType() {
        return this.sourceType;
    }

    public final String getStoryCollectionId() {
        return this.storyCollectionId;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return C72972SkS.LJ(context, "context", R.string.h88, "context.resources.getStr…(R.string.im_quote_story)");
    }

    public final void setExpireAt(Long l) {
        this.expireAt = l;
    }

    public final void setSourceType(Integer num) {
        this.sourceType = num;
    }

    public final void setStoryCollectionId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.storyCollectionId = str;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        String string;
        if (!C55723Ltv.LIZIZ.LJIIJ()) {
            return super.wrapMsgHint(z, z2, str, c109544Rq);
        }
        Context LIZIZ = EF7.LIZIZ();
        if (z || z2) {
            string = LIZIZ.getString(R.string.tya);
            o.LJIIIIZZ(string, "{\n            context.ge…preview_noname)\n        }");
        } else {
            string = LIZIZ.getString(R.string.ty_);
            o.LJIIIIZZ(string, "{\n            context.ge…hare_DMpreview)\n        }");
        }
        setAwemeMsgHint(string);
        return getAwemeMsgHint();
    }
}
