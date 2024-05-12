package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.feed.platform.popupclean.v2.nuj.dialogclean.NewUserPopupCleanRule;
import com.ss.android.ugc.feed.platform.popupclean.v2.nuj.dialogclean.NewUserPopupGroupSetting;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LhA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54932LhA extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends NewUserPopupCleanRule.RuleGroup>> {
    public static final C54932LhA LJLIL = new C54932LhA();

    public C54932LhA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends NewUserPopupCleanRule.RuleGroup> invoke() {
        int i;
        List<NewUserPopupCleanRule.RuleGroup> list;
        Integer groupId;
        NewUserPopupCleanRule.RuleGroup ruleGroup;
        NewUserPopupGroupSetting.PopupRuleGroup popupRuleGroup = (NewUserPopupGroupSetting.PopupRuleGroup) SettingsManager.LIZLLL().LJIIIIZZ("fcp_popup_config", NewUserPopupGroupSetting.PopupRuleGroup.class, null);
        if (popupRuleGroup == null || (list = popupRuleGroup.ruleGroup) == null) {
            NewUserPopupGroupSetting.LIZ.getClass();
            new C55652Lsm("NewUserPopupGroupSetting");
            NewUserPopupGroupSetting.LIZIZ = true;
            i = 3;
            list = new NewUserPopupGroupSetting.PopupRuleGroup(C47261Igj.LJJIJIL(new NewUserPopupCleanRule.RuleGroup(0, 1, 3, null, null, null, null, null, C47261Igj.LJJIJIIJI("new_user_journey_popup", "global_tcp_kr", "global_tcp_not_kr", "age_gate_ban", "global_age_gate", "feed_splash_ad", "global_motivate_login_pop", "popular_feed_desc_pop", "feed_detail_video_view_history_authorization", "global_nearby_feed_permission_pop", "feed_hpas_2sv", "global_encourage_login_pop", "matched_friends_permission", "profile_login_sign_up", "praise_guide_dialog", "now_follow_via_web_pop", "global_group_chat_invite", "main_touch_point_pop", "global_nearby_feed_permission_pop_for_check_location", "underage_recovery_flow", "global_policy_notice", "global_terms_consent", "global_save_info", "nearby_feed_intro_pop", "global_gradient_punish_warning", "store_region_changed_popup", "global_personalized_ad", "inbox_guide_user_out_push", "feedback_replay_dialog", "default_notice_opt_in", "global_private_account_tip", "friends_intro_pop", "main_slide_guide_mask", "prompt_bind_email_phone", "relaunch_popup", "now_trial_start", "now_legal_notification_on_toast", "prompt_bind_email_phone_phase2", "paid_content_banner_popup_task", "proactive_triggers_popup", "google_one_tap_popup", "global_private_account_prompt", "copyright_violation_snack_bar_task", "global_consent_box", "bind_phone_number_popup", "email_pop_up_sheet", "email_pop_up_dialog", "feed_survey_tux_pop", "inbox_activity_status_init_pop", "dm_everyone_popup", "global_follow_live_pop", "global_top_live_pop", "dm_keyword_filter_popup", "quick_share_tooltip", "global_live_inbox_guide_watch_following", "global_shop_tab_tooltip", "aigc_half_intro_page_popup_task", "profile_highlight_guide", "music_offline_popup", "profile_highlight_page_guide", "profile_highlight_bubble_guide", "profile_music_offline_notification_banner", "tiktok_welcome_beta_app", "tiktok_beta_app_ready")), new NewUserPopupCleanRule.RuleGroup(1, 1, 3, null, null, null, null, null, C47261Igj.LJJIJIIJI("global_rec_friends_consent", "feed_location_permission", "global_social_new_friends_rec", "global_contact_permission", "main_social_user_recommend", "fyp_location_permission")), new NewUserPopupCleanRule.RuleGroup(2, 2, 3, null, null, null, null, null, C61878OQg.INSTANCE), new NewUserPopupCleanRule.RuleGroup(3, 3, 3, null, null, null, null, null, C47261Igj.LJJIJ("preferred_language_popup")), new NewUserPopupCleanRule.RuleGroup(4, 4, 3, 1, Float.valueOf(0.16f), 1, 24, 1, C47261Igj.LJJIJ("profile_views_guide")))).ruleGroup;
        } else {
            i = 3;
        }
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            NewUserPopupCleanRule.RuleGroup ruleGroup2 = (NewUserPopupCleanRule.RuleGroup) ListProtector.get(arrayList, i2);
            if (ruleGroup2 != null && (groupId = ruleGroup2.getGroupId()) != null && groupId.intValue() == 4) {
                int i3 = NewUserPopupCleanRule.LIZ;
                C55652Lsm c55652Lsm = NewUserPopupCleanRule.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("exp in ");
                LIZ.append(i3);
                c55652Lsm.LJIIIIZZ(X1D.LIZIZ(LIZ));
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != i) {
                            if (i3 == 4) {
                                ruleGroup = new NewUserPopupCleanRule.RuleGroup(null, ruleGroup2.getSessionCount(), null, null, null, null, ruleGroup2.getVvInterval(), ruleGroup2.getMaxCountInVVInterval(), ruleGroup2.getPopupIds(), 61, null);
                            }
                        } else {
                            ruleGroup = new NewUserPopupCleanRule.RuleGroup(null, ruleGroup2.getSessionCount(), null, null, ruleGroup2.getTimeInterval(), ruleGroup2.getMaxCountInTimeInterval(), null, null, ruleGroup2.getPopupIds(), 205, null);
                        }
                    } else {
                        ruleGroup = new NewUserPopupCleanRule.RuleGroup(null, ruleGroup2.getSessionCount(), null, ruleGroup2.getMaxCountInSession(), null, null, null, null, ruleGroup2.getPopupIds(), 245, null);
                    }
                } else {
                    ruleGroup = new NewUserPopupCleanRule.RuleGroup(null, ruleGroup2.getSessionCount(), ruleGroup2.getBypassActiveDay(), null, null, null, null, null, ruleGroup2.getPopupIds(), 249, null);
                }
                ListProtector.set(arrayList, i2, ruleGroup);
            }
        }
        return arrayList;
    }
}
