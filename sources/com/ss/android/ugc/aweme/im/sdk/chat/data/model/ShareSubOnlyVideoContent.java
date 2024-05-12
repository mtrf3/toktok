package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareSubOnlyVideoContent extends ShareAwemeContent {
    public static final Companion Companion = new Companion();

    public static final ShareSubOnlyVideoContent fromAweme(Aweme aweme, String str) {
        return Companion.fromAweme(aweme, str);
    }

    public static final ShareSubOnlyVideoContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ShareSubOnlyVideoContent fromSharePackage(SharePackage sharePackage) {
            UrlModel urlModel;
            o.LJIIIZ(sharePackage, "sharePackage");
            ShareSubOnlyVideoContent shareSubOnlyVideoContent = new ShareSubOnlyVideoContent();
            shareSubOnlyVideoContent.setUser(sharePackage.extras.getString("uid_for_share"));
            shareSubOnlyVideoContent.setSecUid(sharePackage.extras.getString("sec_user_id"));
            shareSubOnlyVideoContent.setItemId(sharePackage.extras.getString("item_id_string"));
            Serializable serializable = sharePackage.extras.getSerializable("video_cover");
            UrlModel urlModel2 = null;
            if (serializable instanceof UrlModel) {
                urlModel = (UrlModel) serializable;
            } else {
                urlModel = null;
            }
            shareSubOnlyVideoContent.setCoverUrl(urlModel);
            Serializable serializable2 = sharePackage.extras.getSerializable("thumb_for_share");
            if (serializable2 instanceof UrlModel) {
                urlModel2 = (UrlModel) serializable2;
            }
            shareSubOnlyVideoContent.setContentThumb(urlModel2);
            shareSubOnlyVideoContent.setContentName(sharePackage.extras.getString("author_name"));
            shareSubOnlyVideoContent.setAuthorUsername(sharePackage.extras.getString("author_username"));
            shareSubOnlyVideoContent.setAdFake(sharePackage.extras.getBoolean("is_ad_fake"));
            shareSubOnlyVideoContent.setWidth(sharePackage.extras.getInt("aweme_width"));
            shareSubOnlyVideoContent.setHeight(sharePackage.extras.getInt("aweme_height"));
            shareSubOnlyVideoContent.setHotSpotVideo(sharePackage.extras.getBoolean("is_hot_spot_video"));
            shareSubOnlyVideoContent.setHotSpotCreateTime(System.currentTimeMillis());
            if (o.LJ(sharePackage.itemType, "aweme_photo")) {
                shareSubOnlyVideoContent.setAwemeType(150);
                shareSubOnlyVideoContent.type = 810;
            } else {
                shareSubOnlyVideoContent.setAwemeType(0);
                shareSubOnlyVideoContent.type = 800;
            }
            shareSubOnlyVideoContent.setTitle(sharePackage.extras.getString("desc"));
            shareSubOnlyVideoContent.setDiamondGameId(sharePackage.extras.getString("diamond_game_id"));
            shareSubOnlyVideoContent.setNeedSkipStrange(sharePackage.extras.getInt("key_message_source", 0));
            return shareSubOnlyVideoContent;
        }

        public final ShareSubOnlyVideoContent fromAweme(Aweme aweme, String sendMethod) {
            o.LJIIIZ(aweme, "aweme");
            o.LJIIIZ(sendMethod, "sendMethod");
            ShareSubOnlyVideoContent shareSubOnlyVideoContent = new ShareSubOnlyVideoContent();
            shareSubOnlyVideoContent.setUser(aweme.getAuthor().getUid());
            shareSubOnlyVideoContent.setSecUid(aweme.getAuthor().getSecUid());
            shareSubOnlyVideoContent.setItemId(aweme.getAid());
            shareSubOnlyVideoContent.setCoverUrl(aweme.getVideo().getCover());
            shareSubOnlyVideoContent.setContentThumb(aweme.getAuthor().getAvatarThumb());
            shareSubOnlyVideoContent.setContentName(aweme.getAuthor().getUserDisplayName());
            shareSubOnlyVideoContent.setAuthorUsername(aweme.getAuthor().getUniqueId());
            shareSubOnlyVideoContent.setAdFake(!aweme.isAd());
            shareSubOnlyVideoContent.setWidth(aweme.getVideo().getWidth());
            shareSubOnlyVideoContent.setHeight(aweme.getVideo().getHeight());
            shareSubOnlyVideoContent.setHotSpotVideo(aweme.isHotVideoAweme());
            if (aweme.getAwemeType() == 150) {
                shareSubOnlyVideoContent.setAwemeType(150);
                shareSubOnlyVideoContent.type = 810;
            } else {
                shareSubOnlyVideoContent.setAwemeType(0);
                shareSubOnlyVideoContent.type = 800;
            }
            shareSubOnlyVideoContent.setTitle(aweme.getDesc());
            shareSubOnlyVideoContent.setSendMethod(sendMethod);
            return shareSubOnlyVideoContent;
        }
    }
}
