package com.ss.android.ugc.aweme.legoImp;

import X.C0RN;
import X.C34613DiD;
import X.C34668Dj6;
import X.C35274Dss;
import X.C38657FFd;
import X.C38659FFf;
import X.C62822Ol8;
import X.EE1;
import X.EE4;
import X.EE8;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.EnumC38662FFi;
import X.F9J;
import X.InterfaceC36076EDw;
import android.content.Context;
import com.bytedance.keva.KevaImpl;
import java.util.List;

/* loaded from: classes7.dex */
public class SPKevaPreloadTaskV3 implements EE1, EE8, InterfaceC36076EDw {
    public Long LJLIL = 500L;

    @Override // X.EE8
    public final boolean LJ() {
        return true;
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "SPKevaPreloadTaskV3";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EE8
    public final long LJII() {
        return this.LJLIL.longValue();
    }

    @Override // X.EE8
    public final EE4 threadType() {
        if (((Boolean) C35274Dss.LJJI.getValue()).booleanValue()) {
            return EE4.IO;
        }
        return EE4.CPU;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EE8
    public final void LIZLLL(Long l) {
        this.LJLIL = l;
    }

    public final void LJIIJJI(Context context) {
        LJIIJ(context, 0, "applog_stats");
        LJIIJ(context, 0, "prefs_feed_check");
        LJIIJ(context, 0, "default_config");
        LJIIJ(context, 0, "key_language_sp_key");
        LJIIJ(context, 0, "sp_translation_cache");
        LJIIJ(context, 0, "KEY_NEED_UPLOAD_LAUNCHLOG");
        LJIIJ(context, 0, "HotSwapKey");
        LJIIJ(context, 0, "preinsatll_appflyer");
        LJIIJ(context, 0, "live-app-core-sdk");
        LJIIJ(context, 0, "app_setting");
        LJIIJ(context, 0, "av_ab_vesdk.xml");
        LJIIJ(context, 0, "awemeInfo");
        LJIIJ(context, 0, "performance_sp");
        LJIIJ(context, 0, "account_sec_share_data");
        LJIIJ(context, 0, "ttlive_tabs_cache_fyp");
        LJIIJ(context, 0, "VideoRecord");
    }

    @Override // X.EEY
    public final void run(Context context) {
        C62822Ol8 c62822Ol8 = C34668Dj6.LIZ;
        if (((Boolean) c62822Ol8.getValue()).booleanValue()) {
            C38659FFf.LJFF.getClass();
            if (((Boolean) c62822Ol8.getValue()).booleanValue()) {
                C38657FFd.LIZJ(EnumC38662FFi.KV, "frist_brush_keva");
            }
            C38657FFd.LIZLLL(EnumC38662FFi.KV, "frist_brush_keva");
            if (((Boolean) C34668Dj6.LIZIZ.getValue()).booleanValue()) {
                LJIIJJI(context);
                return;
            }
            return;
        }
        LJIIJJI(context);
        if (((Boolean) C34613DiD.LJ.getValue()).booleanValue()) {
            KevaImpl.getRepoSync("repo_ve_hook", 0);
            KevaImpl.getRepoFromSpSync(context, "com.vkontakte.android_pref_name", 0);
            KevaImpl.getRepoFromSpSync(context, "prefs_feed_check", 0);
            KevaImpl.getRepoSync("repo_new_version_journey", 0);
            KevaImpl.getRepoSync("repo_auto_volume", 0);
            KevaImpl.getRepoSync("compliance_setting", 0);
            KevaImpl.getRepoSync("tpc_consent", 0);
            KevaImpl.getRepoSync("new_user_journey", 0);
            KevaImpl.getRepoSync("eea_nonpersonalized_repo", 0);
            KevaImpl.getRepoSync("NewUserUtils", 0);
            KevaImpl.getRepoSync("new_user_journey", 0);
            KevaImpl.getRepoSync("praise_keva", 0);
            KevaImpl.getRepoSync("mandatory_login_repo", 0);
            KevaImpl.getRepoSync("event_hot_area", 0);
            KevaImpl.getRepoSync("repo_story_cold_start", 0);
            KevaImpl.getRepoSync("account_security_keva_name", 0);
            KevaImpl.getRepoSync("first_install_version", 0);
            KevaImpl.getRepoFromSpSync(context, "MTMainTabPreferences", 0);
            KevaImpl.getRepoFromSpSync(context, "InitialChooseLanguagePreferences", 0);
            KevaImpl.getRepoSync("guidance_progress_bar", 0);
            KevaImpl.getRepoSync("search_common", 0);
            KevaImpl.getRepoSync("money_growth", 0);
            KevaImpl.getRepoSync("not_interested_tutorial", 0);
            KevaImpl.getRepoSync("plugin_repo", 0);
            KevaImpl.getRepoFromSpSync(context, "tcm_pro_account", 0);
            KevaImpl.getRepoSync("keva_notice_count", 0);
            KevaImpl.getRepoSync("compliance_privacy_group_chat_cache", 0);
            KevaImpl.getRepoSync("age_gate_service_repo", 0);
            KevaImpl.getRepoSync("ies_im_core", 0);
            KevaImpl.getRepoSync("check_multi_account_repo", 0);
            KevaImpl.getRepoSync("password_status", 0);
            KevaImpl.getRepoSync("keva_aweme_account_user", 0);
            KevaImpl.getRepoSync("disable_im_under_sixteen_repo", 0);
            KevaImpl.getRepoSync("feed_ad_survey_repo", 0);
            KevaImpl.getRepoFromSpSync(context, "sp_stay_home_guide_cache", 0);
            KevaImpl.getRepoFromSpSync(context, "sp_show_share_guide_cache", 0);
            KevaImpl.getRepoSync("interest_select", 0);
            KevaImpl.getRepoSync("spec_act_debug_time", 0);
            KevaImpl.getRepoSync("deliverAdKeva", 0);
            KevaImpl.getRepoSync("keva_video_consume", 0);
            KevaImpl.getRepoSync("permission_dialog6774942497421984774", 0);
        } else if (((Boolean) C34613DiD.LJFF.getValue()).booleanValue()) {
            KevaImpl.getRepoSync("repo_ve_hook", 0);
            KevaImpl.getRepoSync("repo_new_version_journey", 0);
            KevaImpl.getRepoSync("repo_auto_volume", 0);
            KevaImpl.getRepoSync("tpc_consent", 0);
            KevaImpl.getRepoSync("setting_from_server", 0);
            KevaImpl.getRepoSync("new_user_journey", 0);
            KevaImpl.getRepoSync("eea_nonpersonalized_repo", 0);
            KevaImpl.getRepoSync("NewUserUtils", 0);
            KevaImpl.getRepoSync("praise_keva", 0);
            KevaImpl.getRepoSync("mandatory_login_repo", 0);
            KevaImpl.getRepoSync("event_hot_area", 0);
            KevaImpl.getRepoSync("auto_translation_settings_cache", 0);
            KevaImpl.getRepoSync("TTSettingData", 0);
            KevaImpl.getRepoSync("repo_story_cold_start", 0);
            KevaImpl.getRepoSync("account_security_keva_name", 0);
            KevaImpl.getRepoSync("first_install_version", 0);
            KevaImpl.getRepoFromSpSync(context, "MTMainTabPreferences", 0);
            KevaImpl.getRepoSync("BaseListFragmentPanel", 0);
            KevaImpl.getRepoFromSpSync(context, "InitialChooseLanguagePreferences", 0);
            KevaImpl.getRepoSync("guidance_progress_bar", 0);
            KevaImpl.getRepoSync("search_common", 0);
            KevaImpl.getRepoSync("not_interested_tutorial", 0);
            KevaImpl.getRepoSync("plugin_repo", 0);
            KevaImpl.getRepoSync("keva_notice_count", 0);
            KevaImpl.getRepoSync("age_gate_service_repo", 0);
            KevaImpl.getRepoSync("compliance_privacy_group_chat_cache", 0);
            KevaImpl.getRepoSync("check_multi_account_repo", 0);
            KevaImpl.getRepoSync("password_status", 0);
            KevaImpl.getRepoSync("keva_aweme_account_user", 0);
            KevaImpl.getRepoSync("disable_im_under_sixteen_repo", 0);
            KevaImpl.getRepoSync("player_setting", 0);
            KevaImpl.getRepoSync("feed_ad_survey_repo", 0);
            KevaImpl.getRepoSync("video_gift_settings_keva_repo", 0);
            KevaImpl.getRepoSync("interest_select", 0);
            KevaImpl.getRepoSync("spec_act_debug_time", 0);
            KevaImpl.getRepoSync("deliverAdKeva", 0);
            KevaImpl.getRepoSync("keva_video_consume", 0);
            KevaImpl.getRepoSync("permission_dialog6774942497421984774", 0);
        }
        KevaImpl.getRepoSync("kevaUser", 0);
    }

    public final void LJIIJ(Context context, int i, String str) {
        F9J.LIZIZ(context, 0, str).getInt("tiktok", 0);
    }
}
