package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C51788KUe;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FFL;
import X.FH5;
import X.InterfaceC36076EDw;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.experiment.PopupRules;
import com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry;
import com.ss.android.ugc.aweme.image.experiment.ImageCropConfig;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import java.util.List;

/* loaded from: classes10.dex */
public final class PreloadKevaKeyTask implements EE1, InterfaceC36076EDw {
    @Override // X.EEY
    public final String key() {
        return "PreloadKevaKeyTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.InterfaceC36076EDw
    public final String[] deps() {
        return new String[]{"ABTask"};
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        FH5.LIZIZ().getClass();
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LIZ("aab_plugin_fake_install", false);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "fetch_feed_in_foreground", true, false);
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LIZ("use_bridge_engine_v2", true);
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LIZ("enable_vboost_settings", false);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "push_init_optimize_enable", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "event_map_builder_optimize", true, false);
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LJ("music_media_player_time", 30000);
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LIZ("enable_horae_init", false);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "page_monitor_service_enable_ab", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 1, "optimize_preloadfeedtype", true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "optimize_asyncinflatefragmentmain", true, true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "optimize_asyncinflatefragmentfeed", true, true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "optimize_asyncinflatefragmentfeed", true, true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "optimize_asyncinflatecoldbootfinish", true, true);
        FFL.LJIIIZ().getClass();
        FFL.LJIILIIL(31744, 800L, "optimize_asyncinflateprofiledelaytime");
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "player_background_release_codec_res", true);
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LIZ("feed_detail_transition_local_enable", true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "feed_detail_transition_enable", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "feed_populate_partition_optimize", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "player_ab_block_type", true);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "ad_opt_webview_preload", true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "feed_prepare_push_control_optimize", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "for_you_new_translations", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJIILIIL(31744, 30000L, "player_background_release_codec_res_countdown_duration");
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "feed_scrool_duration_opt_enable", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "use_new_app_alert", true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "combine_settings_req", true, true);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "auto_volume_adjustment", true);
        FFL.LJIIIZ().getClass();
        FFL.LJIIIIZZ(31744, "auto_volume_threshold", 0.75f);
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LJ("background_pause_player_setting", 0);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 5, "tt_story_experiment", true);
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LJ("video_play_progress_count", 0);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "following_feed_experience_optimize", true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "following_red_dot_reverse", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "cancel_other_push", true);
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LJ("inapp_update_switch_strategy", 0);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "enable_full_screen_read_adaption", true, true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "i18n_following_badge_type_number", true, false);
        try {
            FFL.LJIIIZ().getClass();
            FFL.LJIILLIIL(SpecialTopicEntry.class, "special_event_entrypoint", true);
            FFL.LJIIIZ().getClass();
            FFL.LJIILLIIL(ImageCropConfig.class, "image_crop_config_v3", true);
            FFL LJIIIZ = FFL.LJIIIZ();
            PopupRules popupRules = C51788KUe.LIZ;
            LJIIIZ.getClass();
            FFL.LJIJ(true, "permission_pop_up_frequency_control", 31744, PopupRules.class, popupRules);
            FFL.LJIIIZ().getClass();
            FFL.LJIILLIIL(PreloadStrategyConfig.class, "preload_strategy_hp", true);
        } catch (Exception unused) {
        }
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "feed_view_page_preload_view_optimize", true, false);
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LIZ("feed_handle_generic_motion", true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "enable_network_notice", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "view_page_populate_delay_enable", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "view_page_smooth_scroll_enable", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "gather_mode", true);
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LJ("vboost_feed_scroll_opt_time", ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LJ("feed_find_bug_setting", 1);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, -1, "feed_adapter_get_view_delay", true);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "engine_preloader_pre_connect", true);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "player_precreateplayer", true);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 100, "optimize_feed_prepare_video_option", true);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "optimize_feed_precreate_player_option", true);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, -1, "feed_adapter_get_view_delay", true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "user_manager_update_optimize", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 1, "full_recommend_live_display_type", true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "preload_feed_item_optimize", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "is_clear_video_background", true, true);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "lottie_opt_group_ab", true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "enable_benchmark_performance", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "marquee_title_opt", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "feed_Commerce_selected_optimize", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "feed_Commerce_logic_optimize", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "resize_feed_in_small_screen", true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "feed_Commerce_unselected_optimize", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "surface_lifecycle_notification_enabled", true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "enable_reuse_external_image_include_static_image", true, true);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "follow_live_interaction_style", true);
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LJ("allow_long_video_scrubbing", 0);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "is_preload_process_data", true, false);
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LJ("enable_feed_ad_break_duration_optimize", 0);
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LJ("playermanager_background_check", 0);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "player_schedule_on_render", true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "player_prerender_surface_slow_set_fix", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "viewpager_load_delay_phase", true);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "interction_share_button_whatsapp_style", true);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "interction_share_button_style", true);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "show_play_count", true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "feed_player_load_more_preload_experiment", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 1000, "feed_view_page_preload_delay_time_option", true);
        FFL.LJIIIZ().getClass();
        FFL.LJ(31744, "play_time_opt_exp", true, false);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "player_play_start_time_storge_opt", true);
        FFL.LJIIIZ().getClass();
        FFL.LJIIJ(31744, 0, "player_prerender_enable", true);
    }
}
