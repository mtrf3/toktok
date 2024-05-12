package com.ss.android.ugc.profile.platform.base.mode;

import X.C47261Igj;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileModesAndFeaturesInfo extends F9E {

    @InterfaceC65349Pkn("count")
    public final int count;

    @InterfaceC65349Pkn("modes")
    public final List<ProfileSingleModeAndFeaturesList> modes;

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileModesAndFeaturesInfo() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.count), this.modes};
    }

    public ProfileModesAndFeaturesInfo(int i, List<ProfileSingleModeAndFeaturesList> modes) {
        o.LJIIIZ(modes, "modes");
        this.count = i;
        this.modes = modes;
    }

    public /* synthetic */ ProfileModesAndFeaturesInfo(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? C47261Igj.LJJIJIIJI(new ProfileSingleModeAndFeaturesList("normal_mode", C47261Igj.LJJIJIIJI("nav_bar", "nav_bar_start", "nav_bar_start_back", "nav_bar_start_find_friends", "nav_bar_start_share_profile", "nav_bar_start_activity", "nav_bar_center", "nav_bar_center_nickname", "nav_bar_end", "nav_bar_end_live", "nav_bar_end_viewer_entrance", "nav_bar_end_settings", "nav_bar_end_bell", "nav_bar_end_more", "header", "header_top_tips", "top_tips_private_info", "header_avatar", "avatar_normal", "info", "user_info", "user_account_base_info", "user_account_user_name", "user_account_verify", "user_account_user_name_modify", "user_account_qr_code", "user_account_state_control_media", "user_account_honor_label", "user_account_rba_identifier", "user_account_ags_warning", "user_relation_info", "relation_info_following", "relation_info_follower", "relation_info_like", "relation_info_posts", "cta", "cta_edit_profile", "cta_add_friends", "cta_share_profile", "cta_social_entrance", "cta_recommend_button", "cta_base_item", "cta_social_interaction", "recommend", "recommend_user_card", "bio", "bio_signature", "bio_add_bio", "bio_tap_to_add_bio", "bio_mail_link", "bio_email", "bio_link", "bio_business_account", "bio_business_account_email", "bio_business_account_app_download", "bio_business_account_phone", "bio_business_account_address", "bio_business_account_coupon", "bio_base_item", "bio_relation_label", "advanced_feature", "advanced_feature_base_item", "advanced_feature_showcase", "advanced_feature_shop", "advanced_feature_order_center", "advanced_feature_tipping", "advanced_feature_supporting", "advanced_feature_qna_profile", "advanced_feature_social_entrance", "advanced_feature_leads_gen", "advanced_feature_paid_collections", "advanced_feature_live_events", "advanced_feature_live_subscription", "profile_tab", "profile_tab_music", "profile_tab_public_post", "profile_tab_ecommerce_store", "profile_tab_ecommerce_showcase", "profile_tab_business_page", "profile_tab_effect", "profile_tab_sticker_store", "profile_tab_private", "profile_tab_favorite", "profile_tab_repost", "profile_tab_like", "pop_up", "pop_up_creator_fund_account_notice")), new ProfileSingleModeAndFeaturesList("empty_mode", C47261Igj.LJJIJIIJI("nav_bar", "nav_bar_start", "nav_bar_start_back", "nav_bar_start_find_friends", "nav_bar_start_share_profile", "nav_bar_start_activity", "nav_bar_center", "nav_bar_center_nickname", "nav_bar_end", "nav_bar_end_live", "nav_bar_end_viewer_entrance", "nav_bar_end_settings", "nav_bar_end_bell", "nav_bar_end_more", "header", "header_avatar", "avatar_normal", "info", "user_account_base_info", "user_info", "user_account_user_name", "user_account_verify", "user_account_user_name_modify", "user_account_qr_code", "user_account_state_control_media", "user_account_honor_label", "user_account_rba_identifier", "user_account_ags_warning", "user_relation_info", "relation_info_following", "relation_info_follower", "relation_info_like", "relation_info_posts", "cta", "cta_edit_profile", "bio", "bio_business_account", "bio_base_item", "bio_business_account_email", "bio_business_account_app_download", "bio_signature", "bio_website", "bio_email_download_app", "profile_tab", "profile_tab_public_post", "profile_tab_private", "profile_tab_favorite", "profile_tab_like")), new ProfileSingleModeAndFeaturesList("abnormal_mode_banned", C47261Igj.LJJIJIIJI("nav_bar", "nav_bar_start_back", "nav_bar_left", "nav_bar_middle", "nav_bar_right", "nav_bar_middle_nickname", "header", "avatar", "avatar_normal", "info_statistic_follower_count", "info_statistic_following_count", "info_statistic_likes_count", "cta", "cta_relation_deleted_blockyou", "cta_edit_profile", "tabs", "tabs_post", "tabs_like"))) : list);
    }
}
