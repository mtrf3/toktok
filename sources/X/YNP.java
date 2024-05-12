package X;

import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.commerce.CommerceInfo;
import com.ss.android.ugc.aweme.music.OriginalMusician;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;

/* loaded from: classes16.dex */
public final class YNP {
    public final SharedPreferences LIZ = F9J.LIZIZ(C1791471i.LIZ, 0, "aweme_user");

    public final User LIZ() {
        User user = new User();
        user.setUid(this.LIZ.getString("uid", ""));
        user.setShortId(this.LIZ.getString("aweme_id", ""));
        user.setNickname(this.LIZ.getString("nickname", ""));
        user.setSignature(this.LIZ.getString("signature", ""));
        user.setFollowStatus(this.LIZ.getInt("allow_status", 0));
        user.setAwemeCount(this.LIZ.getInt("aweme_count", 0));
        user.setFollowingCount(this.LIZ.getInt("following_count", 0));
        user.setFollowerCount(this.LIZ.getInt("follower_count", 0));
        user.setTotalFavorited(this.LIZ.getInt("total_favorite", 0));
        user.setFavoritingCount(this.LIZ.getInt("favoriting_count", 0));
        user.setAllowStatus(this.LIZ.getInt("allow_status", 1));
        user.setRegisterStatus(this.LIZ.getInt("register_status", 0));
        user.setHideSearch(this.LIZ.getBoolean("hide_search", false));
        user.setLoginPlatform(this.LIZ.getInt("login_platform", 0));
        user.setLiveAgreement(this.LIZ.getInt("live_agreement", 0));
        user.setCustomVerify(this.LIZ.getString("custom_verify", ""));
        user.setUniqueId(this.LIZ.getString("unique_id", ""));
        user.setBindPhone(this.LIZ.getString("bind_phone", ""));
        user.setPhoneBinded(this.LIZ.getBoolean("is_phone_bound", false));
        user.setIsCreater(this.LIZ.getBoolean("is_creater", false));
        user.setHasEmail(this.LIZ.getBoolean("has_email", false));
        user.setCreateTime(Long.valueOf(this.LIZ.getLong("create_time", 0L)));
        user.setNeedRecommend(this.LIZ.getBoolean("show_recommend", false));
        user.setShowImageBubble(this.LIZ.getBoolean("show_image_bubble", false));
        user.setRegisterTime(this.LIZ.getLong("register_time", 0L));
        user.setHasFacebookToken(false);
        user.setHasTwitterToken(false);
        user.setFbExpireTime(0L);
        user.setTwExpireTime(0L);
        user.setYoutubeExpireTime(0L);
        user.setHasYoutubeToken(false);
        user.setShieldFollowNotice(0);
        user.setShieldDiggNotice(0);
        user.setShieldCommentNotice(0);
        user.setInsId(this.LIZ.getString("ins_id", ""));
        user.setTwitterId(this.LIZ.getString("twitter_id", ""));
        user.setTwitterName(this.LIZ.getString("twitter_name", ""));
        user.setYoutubeChannelId(this.LIZ.getString("youtube_channel_id", ""));
        user.setYoutubeChannelTitle(this.LIZ.getString("youtube_channel_title", ""));
        user.setAuthorityStatus(this.LIZ.getLong("authority_status", 0L));
        user.setWithCommerceEntry(this.LIZ.getBoolean("with_commerce_enty", false));
        user.setWithNewGoods(this.LIZ.getBoolean("with_new_goods", false));
        user.setHasOrders(this.LIZ.getBoolean("user_has_orders", false));
        user.setVerificationType(this.LIZ.getInt("verification_type", 0));
        user.setCommerceUserLevel(this.LIZ.getInt("commerce_user_level", 0));
        user.setEnterpriseVerifyReason(this.LIZ.getString("enterprise_verify", ""));
        user.setSecret(this.LIZ.getBoolean("secret", false));
        user.setHandleModified(0L);
        user.setCommerceUserLevel(this.LIZ.getInt("commerce_user_level", 0));
        user.setDisciplineMember(this.LIZ.getBoolean("is_discipline_member", false));
        user.setShowImageBubble(this.LIZ.getBoolean("show_image_bubble", false));
        user.setCommentSetting(this.LIZ.getInt("comment_setting", 0));
        user.setRegisterTime(this.LIZ.getLong("register_time", 0L));
        user.setRegion(this.LIZ.getString("region", ""));
        try {
            user.setAvatarThumb((UrlModel) JsonParseUtils.LIZJ(UrlModel.class, this.LIZ.getString("avatar_thumb", "")));
            user.setAvatarMedium((UrlModel) JsonParseUtils.LIZJ(UrlModel.class, this.LIZ.getString("avatar_medium", "")));
            user.setAvatarLarger((UrlModel) JsonParseUtils.LIZJ(UrlModel.class, this.LIZ.getString("avatar_larger", "")));
            user.setShareInfo((ShareInfo) JsonParseUtils.LIZJ(ShareInfo.class, this.LIZ.getString("share_info", "")));
            user.setOriginalMusician((OriginalMusician) JsonParseUtils.LIZJ(OriginalMusician.class, this.LIZ.getString("original_musician", "")));
            user.setCommerceInfo((CommerceInfo) JsonParseUtils.LIZJ(CommerceInfo.class, this.LIZ.getString("commerce_info", "")));
        } catch (Throwable unused) {
            SharedPreferences.Editor edit = this.LIZ.edit();
            edit.putString("share_info", "");
            edit.putString("avatar_larger", "");
            edit.putString("avatar_thumb", "");
            edit.putString("avatar_medium", "");
            WX6.LIZ(edit);
        }
        return user;
    }
}
