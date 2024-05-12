package com.bytedance.ies.abmock;

import X.C31461Li;
import X.C38686FGg;
import X.EJU;
import X.EYS;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes7.dex */
public class ClientExpManager {
    public static final EYS akamai_tnc_config_update_exp;
    public static final EYS backup_video_opt;
    public static final EYS bootfinish_msg_aggre_opt;
    public static final EYS decompress_so_strategy_client;
    public static final EYS disable_dex2oat_strategy;
    public static final EYS emoji_preload_type_v3;
    public static final String[] experiments_array;
    public static final EYS feed_platform_local_offline;
    public static final EYS feed_total_v2_opt;
    public static final EYS fix_active_user_experiment;
    public static final EYS fix_smartlock_memory_leak;
    public static final EYS flow_opt_key;
    public static final EYS gecko_bytediff_exp_tt_android;
    public static final EYS google_onetap_nonce_fix_2;
    public static final EYS inference_engine_opt;
    public static final EYS is_new_user_see_first;
    public static final EYS is_opt_new_user_boot;
    public static final EYS launch_opt_swipeup;
    public static final EYS leakcanary_clean_type_v2550;
    public static final EYS local_notify_4_non_login_users;
    public static final EYS low_storage_aot_service_type_v259;
    public static final EYS low_storage_gecko_unload_high_type;
    public static final EYS miniapp_plugin_install_strategy;
    public static final EYS new_user_aggregated_2_optimization;
    public static final EYS new_user_aggregated_3_optimization;
    public static final EYS new_user_aggregated_4_optimization;
    public static final EYS new_user_aggregated_5_optimization;
    public static final EYS new_user_aggregated_optimization;
    public static final EYS new_user_bootfinish_opt_downgrade;
    public static final EYS new_user_coldboot_background_opt;
    public static final EYS new_user_coldboot_mainthread_opt;
    public static final EYS new_user_feed_consume_opt_nonuj;
    public static final EYS new_user_feed_consume_opt_nuj;
    public static final EYS new_user_feed_fluency_v1_opt;
    public static final EYS new_user_feed_network_deterioration;
    public static final EYS new_user_feed_total_aggre;
    public static final EYS new_user_local_aweme_with_guide;
    public static final EYS new_user_local_aweme_without_guide;
    public static final EYS new_user_login_experience_aggre_opt;
    public static final EYS new_user_login_experience_opt;
    public static final EYS new_user_login_experience_v2_opt;
    public static final EYS new_user_low_end_opt_aggregation;
    public static final EYS new_user_lynxenv_init_opt;
    public static final EYS new_user_nonuj_feed_preload_opt;
    public static final EYS new_user_onboarding_simplify;
    public static final EYS new_user_resources_download_opt;
    public static final EYS new_user_resources_first_day_opt;
    public static final EYS new_user_second_feed_block_opt;
    public static final EYS new_user_startwatching_anim_video_prerender;
    public static final EYS new_user_subthread_optimization;
    public static final EYS new_user_swipe_ui_downgrade_opt;
    public static final EYS new_user_swipeup_animation_downgrade_opt;
    public static final EYS new_user_task_downgrade;
    public static final EYS new_user_thread_priority_opt;
    public static final EYS new_user_top_thread_runnable_switch;
    public static final EYS new_user_video_first_frame_opt;
    public static final EYS new_user_video_fluency_strategy_opt;
    public static final EYS newuser_gecko_high_priority_non_weakcountry_opt;
    public static final EYS newuser_gecko_high_priority_opt;
    public static final EYS newuser_gecko_opt;
    public static final EYS newuser_keva;
    public static final EYS newuser_loadmore_cache_opt;
    public static final EYS newuser_message_statistics_switch;
    public static final EYS newuser_start_watching_below_10_opt;
    public static final EYS newuser_start_watching_opt;
    public static final EYS nuj_report_page_start;
    public static final EYS nuj_slogan_optimize;
    public static final EYS old_offline_clean_v2;
    public static final EYS old_user_login_experience_opt;
    public static final EYS old_user_login_experience_v2_opt;
    public static final EYS penetration_rate_blank_search;
    public static final EYS penetration_rate_comment_page;
    public static final EYS penetration_rate_follow;
    public static final EYS penetration_rate_inbox;
    public static final EYS penetration_rate_music_detail;
    public static final EYS penetration_rate_others;
    public static final EYS penetration_rate_user_profile;
    public static final EYS penetration_rate_video_detail;
    public static final EYS player_new_user_opt_exp;
    public static final EYS plugin_interceptor_experiment;
    public static final EYS preload_uninstall_opt;
    public static final EYS qr_code_login;
    public static final EYS resso_anchor_uninstalled_vid;
    public static final EYS signup_login_bind_phone_email;
    public static final EYS simplifying_password;
    public static final EYS slogan_login_opt_experiment;
    public static final EYS three_vv_fluency;
    public static final EYS weak_net_country_traffic_opt;
    public static final EYS zero_video_view_monitor_newuser_exp;

    static {
        String[] strArr = {"akamai_tnc_config_update_exp", "backup_video_opt", "bootfinish_msg_aggre_opt", "decompress_so_strategy_client", "disable_dex2oat_strategy", "emoji_preload_type_v3", "feed_platform_local_offline", "feed_total_v2_opt", "fix_active_user_experiment", "fix_smartlock_memory_leak", "flow_opt_key", "gecko_bytediff_exp_tt_android", "google_onetap_nonce_fix_2", "inference_engine_opt", "is_new_user_see_first", "is_opt_new_user_boot", "launch_opt_swipeup", "leakcanary_clean_type_v2550", "local_notify_4_non_login_users", "low_storage_aot_service_type_v259", "low_storage_gecko_unload_high_type", "miniapp_plugin_install_strategy", "new_user_aggregated_2_optimization", "new_user_aggregated_3_optimization", "new_user_aggregated_4_optimization", "new_user_aggregated_5_optimization", "new_user_aggregated_optimization", "new_user_bootfinish_opt_downgrade", "new_user_coldboot_background_opt", "new_user_coldboot_mainthread_opt", "new_user_feed_consume_opt_nonuj", "new_user_feed_consume_opt_nuj", "new_user_feed_fluency_v1_opt", "new_user_feed_network_deterioration", "new_user_feed_total_aggre", "new_user_local_aweme_with_guide", "new_user_local_aweme_without_guide", "new_user_login_experience_aggre_opt", "new_user_login_experience_opt", "new_user_login_experience_v2_opt", "new_user_low_end_opt_aggregation", "new_user_lynxenv_init_opt", "new_user_nonuj_feed_preload_opt", "new_user_onboarding_simplify", "new_user_resources_download_opt", "new_user_resources_first_day_opt", "new_user_second_feed_block_opt", "new_user_startwatching_anim_video_prerender", "new_user_subthread_optimization", "new_user_swipe_ui_downgrade_opt", "new_user_swipeup_animation_downgrade_opt", "new_user_task_downgrade", "new_user_thread_priority_opt", "new_user_top_thread_runnable_switch", "new_user_video_first_frame_opt", "new_user_video_fluency_strategy_opt", "newuser_gecko_high_priority_non_weakcountry_opt", "newuser_gecko_high_priority_opt", "newuser_gecko_opt", "newuser_keva", "newuser_loadmore_cache_opt", "newuser_message_statistics_switch", "newuser_start_watching_below_10_opt", "newuser_start_watching_opt", "nuj_report_page_start", "nuj_slogan_optimize", "old_offline_clean_v2", "old_user_login_experience_opt", "old_user_login_experience_v2_opt", "penetration_rate_blank_search", "penetration_rate_comment_page", "penetration_rate_follow", "penetration_rate_inbox", "penetration_rate_music_detail", "penetration_rate_others", "penetration_rate_user_profile", "penetration_rate_video_detail", "player_new_user_opt_exp", "plugin_interceptor_experiment", "preload_uninstall_opt", "qr_code_login", "resso_anchor_uninstalled_vid", "signup_login_bind_phone_email", "simplifying_password", "slogan_login_opt_experiment", "three_vv_fluency", "weak_net_country_traffic_opt", "zero_video_view_monitor_newuser_exp"};
        experiments_array = strArr;
        akamai_tnc_config_update_exp = new EYS("com.ss.android.ugc.aweme.net.experiment.AkamaiTncUpdateExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70824850", 0.45d, 0), new EJU("70824851", 0.45d, 1), new EJU("70824852", 0.1d, 2));
        backup_video_opt = new EYS("com.ss.android.ugc.aweme.experiment.NewUserBackupVideoExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70409680", 0.06d, 0), new EJU("70409681", 0.06d, 1), new EJU("70409682", 0.06d, 2), new EJU("70409683", 0.06d, 3), new EJU("70409684", 0.06d, 4), new EJU("70409685", 0.7d, 5));
        bootfinish_msg_aggre_opt = new EYS("com.ss.android.ugc.aweme.experiment.NewUserMsgOptExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70501446", 0.05d, 0), new EJU("70501447", 0.05d, 1), new EJU("70501448", 0.05d, 2), new EJU("70501449", 0.05d, 3), new EJU("70501450", 0.8d, 4));
        decompress_so_strategy_client = new EYS("com.ss.android.ugc.aweme.buildconfigdiff.LibraryCompressABGray", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("1668063", 0.05d, 0), new EJU("1668064", 0.05d, 1), new EJU("1668065", 0.05d, 2), new EJU("1668066", 0.05d, 3));
        disable_dex2oat_strategy = new EYS("com.ss.android.ugc.aweme.experiment.olduser.Dex2OatDisableClientExp", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71593071", 0.25d, 0), new EJU("71593072", 0.25d, 1), new EJU("71593073", 0.25d, 2), new EJU("71593074", 0.25d, 3));
        emoji_preload_type_v3 = new EYS("com.ss.android.ugc.aweme.emoji.abtest.EmojiPreloadABV2", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70622938", 0.25d, 0), new EJU("70622939", 0.25d, 1), new EJU("70622940", 0.25d, 2), new EJU("70622941", 0.25d, 3));
        feed_platform_local_offline = new EYS("com.ss.android.ugc.feed.platform.FeedPlatformLocalOfflineConfig", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70907925", 0.5d, 0), new EJU("70907926", 0.5d, 1));
        feed_total_v2_opt = new EYS("com.ss.android.ugc.aweme.experiment.NewUserFeedTotalV2Experiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70515308", 0.15d, 0), new EJU("70515309", 0.15d, 1), new EJU("70515310", 0.15d, 2), new EJU("70515311", 0.15d, 3), new EJU("70515312", 0.15d, 4), new EJU("70515313", 0.25d, 5));
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        fix_active_user_experiment = new EYS("com.ss.android.ugc.aweme.experiment.FixActiveUserExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70242164", 0.5d, bool), new EJU("70242163", 0.5d, bool2));
        fix_smartlock_memory_leak = new EYS("com.ss.android.ugc.aweme.experiments.SmartLockFixMemoryLeakExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70988211", 0.5d, 0), new EJU("70988212", 0.5d, 1));
        flow_opt_key = new EYS("com.ss.android.ugc.aweme.experiment.FlowOptAB", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("50014827", 0.5d, 0), new EJU("50014828", 0.5d, 1));
        gecko_bytediff_exp_tt_android = new EYS("com.ss.android.ugc.aweme.utils.gecko.GeckoXBytediffExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70327863", 0.25d, 0), new EJU("70327864", 0.25d, 1), new EJU("70327865", 0.25d, 2), new EJU("70327866", 0.25d, 3));
        google_onetap_nonce_fix_2 = new EYS("com.ss.android.ugc.aweme.account.experiment.GoogleOneTapNonceFixSetting$GoogleOneTapNonceFixExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71288117", 0.33d, 0), new EJU("71288118", 0.33d, 1), new EJU("71288119", 0.33d, 2), new EJU("71288120", 0.01d, 3));
        inference_engine_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.InferenceEngineOptExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70517544", 0.1d, 0), new EJU("70517545", 0.1d, 1), new EJU("70517546", 0.1d, 2), new EJU("70517547", 0.1d, 3), new EJU("70517548", 0.6d, 4));
        is_new_user_see_first = new EYS("com.ss.android.ugc.aweme.experiment.newuser.RecFirstItemOptExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70793243", 0.5d, 0), new EJU("70793244", 0.5d, 1));
        is_opt_new_user_boot = new EYS("com.ss.android.ugc.aweme.experiment.NewUserColdBootOptimizeV1Experiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70259969", 0.25d, 0), new EJU("70259970", 0.25d, 1), new EJU("70259971", 0.25d, 2), new EJU("70259972", 0.25d, 3));
        launch_opt_swipeup = new EYS("com.ss.android.ugc.aweme.buildconfigdiff.NewUserSwipeUpOptimizeExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("185214911", 0.5d, 0), new EJU("185215011", 0.5d, 1));
        leakcanary_clean_type_v2550 = new EYS("com.ss.android.storageInit.experiment.LeakCanaryCleanABV3", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70625904", 0.5d, 0), new EJU("70625905", 0.5d, 1));
        local_notify_4_non_login_users = new EYS("com.ss.android.ugc.localnotify.experiment.NonLoginPushLocalExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71367915", 0.2d, bool2), new EJU("71367916", 0.2d, bool));
        low_storage_aot_service_type_v259 = new EYS("com.ss.android.ugc.aweme.experiment.LowStorageAotServiceAB", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70670912", 0.05d, 0), new EJU("70670913", 0.05d, 1), new EJU("70670914", 0.9d, 2));
        low_storage_gecko_unload_high_type = new EYS("com.ss.android.ugc.aweme.requesttask.idle.experment.LowStroageGeckoUnloadHighAB", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70707837", 0.1d, 0), new EJU("70707838", 0.1d, 1), new EJU("70707839", 0.8d, 2));
        miniapp_plugin_install_strategy = new EYS("com.ss.android.ugc.aweme.miniapp.abtest.MiniAppPluginInstallAB", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("50019349", 0.5d, 0), new EJU("50019350", 0.5d, 1));
        new_user_aggregated_2_optimization = new EYS("com.ss.android.ugc.aweme.experiment.NewUserAggreV2Experiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70815726", 0.001d, 0), new EJU("70815727", 0.001d, 1), new EJU("70815728", 0.001d, 2), new EJU("70815729", 0.996d, 3), new EJU("70815730", 0.001d, 4));
        new_user_aggregated_3_optimization = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserAggreV3Experiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70954799", 0.001d, 0), new EJU("70954800", 0.001d, 1), new EJU("70954801", 0.001d, 2), new EJU("70954802", 0.997d, 3));
        new_user_aggregated_4_optimization = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserAggreV4Experiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71076390", 0.001d, 0), new EJU("71076391", 0.001d, 1), new EJU("71076392", 0.996d, 2), new EJU("71076393", 0.001d, 3), new EJU("71076394", 0.001d, 4));
        new_user_aggregated_5_optimization = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserAggreV5Experiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71518011", 0.2d, 0), new EJU("71518012", 0.2d, 1), new EJU("71518013", 0.2d, 2), new EJU("71518014", 0.2d, 3), new EJU("71518015", 0.2d, 4));
        new_user_aggregated_optimization = new EYS("com.ss.android.ugc.aweme.experiment.NewUserAggreExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70483040", 0.01d, 0), new EJU("70483041", 0.97d, 1), new EJU("70483042", 0.01d, 2), new EJU("70483043", 0.01d, 3));
        new_user_bootfinish_opt_downgrade = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserBootFinishOptExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70746666", 0.2d, 0), new EJU("70746667", 0.2d, 3), new EJU("70746668", 0.6d, 4));
        new_user_coldboot_background_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserColdbootBackgroundExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71083834", 0.1d, 0), new EJU("71083835", 0.1d, 1), new EJU("71083836", 0.1d, 2), new EJU("71083837", 0.7d, 3));
        new_user_coldboot_mainthread_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserColdBootOptExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70865457", 0.06d, 1), new EJU("70865458", 0.06d, 2), new EJU("70865459", 0.06d, 3), new EJU("70865460", 0.06d, 4), new EJU("70865461", 0.76d, 5));
        new_user_feed_consume_opt_nonuj = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NoNujFeedConsumeExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70662631", 0.49d, 0), new EJU("70662632", 0.49d, 1), new EJU("70662633", 0.02d, 2));
        new_user_feed_consume_opt_nuj = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserFeedConsumeExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70839451", 0.25d, 0), new EJU("70839452", 0.25d, 1), new EJU("70839453", 0.25d, 2), new EJU("70839454", 0.25d, 3));
        new_user_feed_fluency_v1_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserFluencyExperiments$NewUserFeedFluencyV1Experiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71466430", 0.2d, 0), new EJU("71466431", 0.2d, 1), new EJU("71466432", 0.2d, 2), new EJU("71466433", 0.2d, 3), new EJU("71466434", 0.2d, 4));
        new_user_feed_network_deterioration = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserFeedDeteriorationExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70986535", 0.01d, 0), new EJU("70986536", 0.01d, 1), new EJU("70986537", 0.01d, 2));
        new_user_feed_total_aggre = new EYS("com.ss.android.ugc.aweme.experiment.NewUserFeedTotalExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70417627", 0.2d, 0), new EJU("70417628", 0.2d, 1), new EJU("70417629", 0.2d, 2), new EJU("70417630", 0.2d, 3), new EJU("70417631", 0.2d, 4));
        new_user_local_aweme_with_guide = new EYS("com.ss.android.ugc.aweme.experiment.NewUserLocalAwemeWithGuideExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70655597", 0.25d, 0), new EJU("70655598", 0.25d, 1), new EJU("70655599", 0.25d, 2), new EJU("70655600", 0.25d, 3));
        new_user_local_aweme_without_guide = new EYS("com.ss.android.ugc.aweme.experiment.NewUserLocalAwemeWithoutGuideExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70655635", 0.2d, 0), new EJU("70655636", 0.2d, 1), new EJU("70655637", 0.2d, 2), new EJU("70655638", 0.2d, 3), new EJU("70655639", 0.2d, 4));
        new_user_login_experience_aggre_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserLoginExperienceAggreExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70798056", 0.25d, 0), new EJU("70798057", 0.25d, 1), new EJU("70798058", 0.25d, 2), new EJU("70798059", 0.25d, 3));
        new_user_login_experience_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserLoginExperienceExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70732541", 0.25d, 0), new EJU("70732542", 0.25d, 1), new EJU("70732543", 0.25d, 2), new EJU("70732544", 0.25d, 3));
        new_user_login_experience_v2_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserLoginExperienceV2Experiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70763460", 0.2d, 0), new EJU("70763461", 0.2d, 1), new EJU("70763462", 0.6d, 2));
        new_user_low_end_opt_aggregation = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserDowngradeAggreExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70415695", 0.2d, 0), new EJU("70415696", 0.2d, 1), new EJU("70415697", 0.6d, 2));
        new_user_lynxenv_init_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserLynxEnvInitOptExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71008416", 0.1d, 0), new EJU("71008417", 0.1d, 1));
        new_user_nonuj_feed_preload_opt = new EYS("com.ss.android.ugc.aweme.experiment.FeedPreloadRequestExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70645734", 0.05d, 0), new EJU("70645735", 0.05d, 1), new EJU("70645736", 0.05d, 2), new EJU("70645737", 0.05d, 3), new EJU("70645738", 0.8d, 4));
        new_user_onboarding_simplify = new EYS("com.ss.android.ugc.aweme.experiment.newuser.OnBoardingSimplifyExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70680569", 0.33d, 0), new EJU("70680570", 0.33d, 1), new EJU("70680571", 0.33d, 2), new EJU("70680572", 0.01d, 3));
        new_user_resources_download_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserResourceExperiments$NewUserResourcesDownloadOptExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71466529", 0.1d, 0), new EJU("71466530", 0.1d, 1), new EJU("71466531", 0.1d, 2), new EJU("71466532", 0.1d, 3), new EJU("71466533", 0.1d, 4), new EJU("71466534", 0.5d, 5));
        new_user_resources_first_day_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserResourceExperiments$NewUserResourcesFirstDayOptExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71466520", 0.1d, 0), new EJU("71466521", 0.1d, 1), new EJU("71466522", 0.1d, 2), new EJU("71466523", 0.1d, 3), new EJU("71466524", 0.1d, 4), new EJU("71466525", 0.5d, 5));
        new_user_second_feed_block_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserSecondVideoBlockExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71057931", 0.1d, 0), new EJU("71057932", 0.1d, 1), new EJU("71057933", 0.1d, 2), new EJU("71057934", 0.7d, 3));
        new_user_startwatching_anim_video_prerender = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserStartWatchingAnimAndPreRenderExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71001458", 0.15d, 0), new EJU("71001459", 0.15d, 1), new EJU("71001460", 0.15d, 2), new EJU("71001461", 0.55d, 3));
        new_user_subthread_optimization = new EYS("com.ss.android.ugc.aweme.experiment.NewUserExperiments$NewUserSubThreadExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70596877", 0.15d, 0), new EJU("70596878", 0.15d, 1), new EJU("70596879", 0.15d, 2), new EJU("70596880", 0.15d, 3), new EJU("70596881", 0.4d, 4));
        new_user_swipe_ui_downgrade_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserSwipeUIDowngradeExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70867037", 0.05d, 0), new EJU("70867038", 0.05d, 1), new EJU("70867039", 0.05d, 2), new EJU("70867040", 0.85d, 3));
        new_user_swipeup_animation_downgrade_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserSwipeUpDowngradeExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70645716", 0.33d, 0), new EJU("70645717", 0.33d, 1), new EJU("70645718", 0.34d, 2));
        new_user_task_downgrade = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserTaskDowngradeExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70836557", 0.2d, 0), new EJU("70836558", 0.2d, 1), new EJU("70836559", 0.2d, 2), new EJU("70836560", 0.4d, 3));
        new_user_thread_priority_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserThreadPriorityExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70797050", 0.25d, 0), new EJU("70797051", 0.25d, 1), new EJU("70797052", 0.25d, 2), new EJU("70797053", 0.25d, 3));
        new_user_top_thread_runnable_switch = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserTopThreadRunnableExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71337227", 0.1d, 0), new EJU("71337228", 0.1d, 1), new EJU("71337229", 0.8d, 2));
        new_user_video_first_frame_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserVideoFirstFrameExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71489174", 0.1d, 0), new EJU("71489175", 0.1d, 5), new EJU("71489176", 0.1d, 1), new EJU("71489177", 0.1d, 2), new EJU("71489178", 0.1d, 3), new EJU("71489179", 0.5d, 4));
        new_user_video_fluency_strategy_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserFluencyVideoStrategyOpt", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71424159", 0.1d, 0), new EJU("71424160", 0.1d, 1), new EJU("71424161", 0.1d, 2), new EJU("71424162", 0.1d, 3), new EJU("71424163", 0.6d, 4));
        newuser_gecko_high_priority_non_weakcountry_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.GeckoHighChannelNonWeakCountryOpt", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70927158", 0.001d, 0), new EJU("70927159", 0.001d, 1), new EJU("70927160", 0.001d, 2), new EJU("70927161", 0.996d, 3), new EJU("70927162", 0.001d, 4));
        newuser_gecko_high_priority_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.GeckoHighChannelWeakCountryOpt", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70926990", 0.001d, 0), new EJU("70926991", 0.001d, 1), new EJU("70926992", 0.001d, 2), new EJU("70926993", 0.996d, 3), new EJU("70926994", 0.001d, 4));
        newuser_gecko_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.GeckoOptExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70454102", 0.001d, 0), new EJU("70454105", 0.999d, 1));
        newuser_keva = new EYS("com.ss.android.ugc.aweme.experiment.NewUserKevaDefaultValueExp", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70426625", 0.1d, 0), new EJU("70426626", 0.1d, 1), new EJU("70426627", 0.8d, 2));
        newuser_loadmore_cache_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserLoadMoreOptExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71076330", 0.1d, 0), new EJU("71076331", 0.1d, 1), new EJU("71076332", 0.8d, 2));
        newuser_message_statistics_switch = new EYS("com.ss.android.ugc.aweme.experiment.newuser.NewUserMessageStatisticsExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71570198", 0.1d, 0), new EJU("71570199", 0.1d, 1), new EJU("71570200", 0.8d, 2));
        newuser_start_watching_below_10_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.StartWatchingBelow10Opt", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70553920", 0.11d, 0), new EJU("70553921", 0.11d, 1), new EJU("70553922", 0.11d, 2), new EJU("70553923", 0.67d, 3));
        newuser_start_watching_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.StartWatchingExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70866572", 0.33d, 0), new EJU("70866573", 0.33d, 1), new EJU("70866574", 0.33d, 2), new EJU("70866575", 0.01d, 3));
        nuj_report_page_start = new EYS("com.bytedance.ies.ugc.statisticlogger.experiment.ReportPageStartForNujExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71447635", 0.9d, 0), new EJU("71447636", 0.1d, 1));
        nuj_slogan_optimize = new EYS("com.ss.android.ugc.aweme.journey.experiment.NUJSloganOptimizeExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71580486", 0.2d, 0), new EJU("71580487", 0.2d, 1), new EJU("71580488", 0.2d, 2));
        old_offline_clean_v2 = new EYS("com.ss.android.storageInit.experiment.OldOfflineCleanExperimentV2", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70618488", 0.495d, 0), new EJU("70618489", 0.495d, 1), new EJU("70618490", 0.01d, 2));
        old_user_login_experience_opt = new EYS("com.ss.android.ugc.aweme.experiment.olduser.OldUserLoginExperienceExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70713771", 0.15d, 0), new EJU("70713772", 0.15d, 1), new EJU("70713773", 0.15d, 2), new EJU("70713774", 0.15d, 3), new EJU("70713775", 0.15d, 4), new EJU("70713776", 0.1d, 5));
        old_user_login_experience_v2_opt = new EYS("com.ss.android.ugc.aweme.experiment.olduser.OldUserLoginExperienceV2Experiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70763463", 0.5d, 0), new EJU("70763464", 0.5d, 1));
        penetration_rate_blank_search = new EYS("com.ss.android.ugc.aweme.experiment.extendedscene.CountPenetrationRateBlankSearchExp", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71058260", 1.0d, 1));
        penetration_rate_comment_page = new EYS("com.ss.android.ugc.aweme.experiment.extendedscene.CountPenetrationRateCommentExp", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71058255", 1.0d, 1));
        penetration_rate_follow = new EYS("com.ss.android.ugc.aweme.experiment.extendedscene.CountPenetrationRateFollowExp", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71058286", 1.0d, 1));
        penetration_rate_inbox = new EYS("com.ss.android.ugc.aweme.experiment.extendedscene.CountPenetrationRateInboxExp", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71058276", 1.0d, 1));
        penetration_rate_music_detail = new EYS("com.ss.android.ugc.aweme.experiment.extendedscene.CountPenetrationRateMusicDetailExp", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71058285", 1.0d, 1));
        penetration_rate_others = new EYS("com.ss.android.ugc.aweme.experiment.extendedscene.CountPenetrationRateOthersExp", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71058247", 1.0d, 1));
        penetration_rate_user_profile = new EYS("com.ss.android.ugc.aweme.experiment.extendedscene.CountPenetrationRateUserProfileExp", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71058252", 1.0d, 1));
        penetration_rate_video_detail = new EYS("com.ss.android.ugc.aweme.experiment.extendedscene.CountPenetrationRateVideoDetailExp", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("71058275", 1.0d, 1));
        player_new_user_opt_exp = new EYS("com.ss.android.ugc.aweme.video.experiment.NewUserPlayerOptExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70575442", 0.25d, 0), new EJU("70575443", 0.25d, 1), new EJU("70575444", 0.25d, 2), new EJU("70575445", 0.25d, 3));
        plugin_interceptor_experiment = new EYS("com.ss.android.ugc.aweme.plugin.PluginInterceptorExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70611468", 0.1d, 0), new EJU("70611469", 0.1d, 1), new EJU("70611470", 0.8d, 2));
        preload_uninstall_opt = new EYS("com.ss.android.ugc.aweme.experiment.PreloadUninstallOptExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70615503", 0.4d, bool), new EJU("70615504", 0.6d, bool2));
        qr_code_login = new EYS("com.ss.android.ugc.aweme.buildconfigdiff.QRCodeLoginExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("50017292", 0.5d, bool2), new EJU("50017293", 0.5d, bool));
        resso_anchor_uninstalled_vid = new EYS("com.ss.android.ugc.aweme.buildconfigdiff.RessoAnchorUninstalledVidExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70126866,50065928", 1.0d, 0));
        signup_login_bind_phone_email = new EYS("com.ss.android.ugc.aweme.account.experiment.BindPhoneOrEmailExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70628063", 0.06d, 0), new EJU("70628064", 0.06d, 1), new EJU("70628065", 0.06d, 2), new EJU("70628066", 0.06d, 3), new EJU("70628067", 0.06d, 4), new EJU("70628068", 0.7d, 5));
        simplifying_password = new EYS("com.ss.android.ugc.aweme.account.experiment.SimplifyingPasswordSetting", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70853005", 0.25d, 0), new EJU("70853006", 0.25d, 1), new EJU("70853007", 0.25d, 2), new EJU("70853008", 0.25d, 3));
        slogan_login_opt_experiment = new EYS("com.ss.android.ugc.aweme.buildconfigdiff.SloganExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("50022572", 0.34d, 0), new EJU("50022573", 0.33d, 1), new EJU("50022574", 0.33d, 2));
        three_vv_fluency = new EYS("com.ss.android.ugc.aweme.experiment.fluency.ThreeVVFluencyExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70715866", 0.19d, 0), new EJU("70715867", 0.19d, 1), new EJU("70715868", 0.19d, 2), new EJU("70715869", 0.19d, 3), new EJU("70715870", 0.19d, 4), new EJU("70715871", 0.05d, 5));
        weak_net_country_traffic_opt = new EYS("com.ss.android.ugc.aweme.experiment.newuser.WeakNetCountryGeckoOptExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70542676", 0.25d, 0), new EJU("70542677", 0.25d, 1), new EJU("70542678", 0.25d, 2), new EJU("70542679", 0.25d, 3));
        zero_video_view_monitor_newuser_exp = new EYS("com.ss.android.ugc.aweme.vv.ZeroVideoViewNewUserExperiment", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, "app", strArr, new EJU("70805688", 0.1d, 0), new EJU("70805689", 0.1d, 1), new EJU("70805690", 0.8d, 2));
    }

    public static boolean fix_active_user_experiment() {
        return ((Boolean) C38686FGg.LIZIZ("fix_active_user_experiment", Boolean.TYPE, Boolean.valueOf("false"), true, fix_active_user_experiment)).booleanValue();
    }

    public static boolean fix_active_user_experiment(boolean z) {
        return ((Boolean) C38686FGg.LIZIZ("fix_active_user_experiment", Boolean.TYPE, Boolean.valueOf("false"), z, fix_active_user_experiment)).booleanValue();
    }

    public static boolean local_notify_4_non_login_users() {
        return ((Boolean) C38686FGg.LIZIZ("local_notify_4_non_login_users", Boolean.TYPE, Boolean.valueOf("false"), true, local_notify_4_non_login_users)).booleanValue();
    }

    public static boolean local_notify_4_non_login_users(boolean z) {
        return ((Boolean) C38686FGg.LIZIZ("local_notify_4_non_login_users", Boolean.TYPE, Boolean.valueOf("false"), z, local_notify_4_non_login_users)).booleanValue();
    }

    public static boolean preload_uninstall_opt() {
        return ((Boolean) C38686FGg.LIZIZ("preload_uninstall_opt", Boolean.TYPE, Boolean.valueOf("false"), true, preload_uninstall_opt)).booleanValue();
    }

    public static boolean preload_uninstall_opt(boolean z) {
        return ((Boolean) C38686FGg.LIZIZ("preload_uninstall_opt", Boolean.TYPE, Boolean.valueOf("false"), z, preload_uninstall_opt)).booleanValue();
    }

    public static boolean qr_code_login() {
        return ((Boolean) C38686FGg.LIZIZ("qr_code_login", Boolean.TYPE, Boolean.valueOf("false"), true, qr_code_login)).booleanValue();
    }

    public static boolean qr_code_login(boolean z) {
        return ((Boolean) C38686FGg.LIZIZ("qr_code_login", Boolean.TYPE, Boolean.valueOf("false"), z, qr_code_login)).booleanValue();
    }

    public static int akamai_tnc_config_update_exp() {
        return ((Integer) C38686FGg.LIZIZ("akamai_tnc_config_update_exp", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, akamai_tnc_config_update_exp)).intValue();
    }

    public static int backup_video_opt() {
        return ((Integer) C38686FGg.LIZIZ("backup_video_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, backup_video_opt)).intValue();
    }

    public static int bootfinish_msg_aggre_opt() {
        return ((Integer) C38686FGg.LIZIZ("bootfinish_msg_aggre_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, bootfinish_msg_aggre_opt)).intValue();
    }

    public static int decompress_so_strategy_client() {
        return ((Integer) C38686FGg.LIZIZ("decompress_so_strategy_client", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, decompress_so_strategy_client)).intValue();
    }

    public static int disable_dex2oat_strategy() {
        return ((Integer) C38686FGg.LIZIZ("disable_dex2oat_strategy", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, disable_dex2oat_strategy)).intValue();
    }

    public static int emoji_preload_type_v3() {
        return ((Integer) C38686FGg.LIZIZ("emoji_preload_type_v3", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, emoji_preload_type_v3)).intValue();
    }

    public static int feed_platform_local_offline() {
        return ((Integer) C38686FGg.LIZIZ("feed_platform_local_offline", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, feed_platform_local_offline)).intValue();
    }

    public static int feed_total_v2_opt() {
        return ((Integer) C38686FGg.LIZIZ("feed_total_v2_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, feed_total_v2_opt)).intValue();
    }

    public static int fix_smartlock_memory_leak() {
        return ((Integer) C38686FGg.LIZIZ("fix_smartlock_memory_leak", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, fix_smartlock_memory_leak)).intValue();
    }

    public static int flow_opt_key() {
        return ((Integer) C38686FGg.LIZIZ("flow_opt_key", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, flow_opt_key)).intValue();
    }

    public static int gecko_bytediff_exp_tt_android() {
        return ((Integer) C38686FGg.LIZIZ("gecko_bytediff_exp_tt_android", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, gecko_bytediff_exp_tt_android)).intValue();
    }

    public static int google_onetap_nonce_fix_2() {
        return ((Integer) C38686FGg.LIZIZ("google_onetap_nonce_fix_2", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, google_onetap_nonce_fix_2)).intValue();
    }

    public static int inference_engine_opt() {
        return ((Integer) C38686FGg.LIZIZ("inference_engine_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, inference_engine_opt)).intValue();
    }

    public static int is_new_user_see_first() {
        return ((Integer) C38686FGg.LIZIZ("is_new_user_see_first", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, is_new_user_see_first)).intValue();
    }

    public static int is_opt_new_user_boot() {
        return ((Integer) C38686FGg.LIZIZ("is_opt_new_user_boot", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, is_opt_new_user_boot)).intValue();
    }

    public static int launch_opt_swipeup() {
        return ((Integer) C38686FGg.LIZIZ("launch_opt_swipeup", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, launch_opt_swipeup)).intValue();
    }

    public static int leakcanary_clean_type_v2550() {
        return ((Integer) C38686FGg.LIZIZ("leakcanary_clean_type_v2550", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, leakcanary_clean_type_v2550)).intValue();
    }

    public static int low_storage_aot_service_type_v259() {
        return ((Integer) C38686FGg.LIZIZ("low_storage_aot_service_type_v259", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, low_storage_aot_service_type_v259)).intValue();
    }

    public static int low_storage_gecko_unload_high_type() {
        return ((Integer) C38686FGg.LIZIZ("low_storage_gecko_unload_high_type", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, low_storage_gecko_unload_high_type)).intValue();
    }

    public static int miniapp_plugin_install_strategy() {
        return ((Integer) C38686FGg.LIZIZ("miniapp_plugin_install_strategy", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, miniapp_plugin_install_strategy)).intValue();
    }

    public static int new_user_aggregated_2_optimization() {
        return ((Integer) C38686FGg.LIZIZ("new_user_aggregated_2_optimization", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_aggregated_2_optimization)).intValue();
    }

    public static int new_user_aggregated_3_optimization() {
        return ((Integer) C38686FGg.LIZIZ("new_user_aggregated_3_optimization", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_aggregated_3_optimization)).intValue();
    }

    public static int new_user_aggregated_4_optimization() {
        return ((Integer) C38686FGg.LIZIZ("new_user_aggregated_4_optimization", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_aggregated_4_optimization)).intValue();
    }

    public static int new_user_aggregated_5_optimization() {
        return ((Integer) C38686FGg.LIZIZ("new_user_aggregated_5_optimization", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_aggregated_5_optimization)).intValue();
    }

    public static int new_user_aggregated_optimization() {
        return ((Integer) C38686FGg.LIZIZ("new_user_aggregated_optimization", Integer.TYPE, C31461Li.LIZIZ("1"), true, new_user_aggregated_optimization)).intValue();
    }

    public static int new_user_bootfinish_opt_downgrade() {
        return ((Integer) C38686FGg.LIZIZ("new_user_bootfinish_opt_downgrade", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_bootfinish_opt_downgrade)).intValue();
    }

    public static int new_user_coldboot_background_opt() {
        return ((Integer) C38686FGg.LIZIZ("new_user_coldboot_background_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_coldboot_background_opt)).intValue();
    }

    public static int new_user_coldboot_mainthread_opt() {
        return ((Integer) C38686FGg.LIZIZ("new_user_coldboot_mainthread_opt", Integer.TYPE, C31461Li.LIZIZ("1"), true, new_user_coldboot_mainthread_opt)).intValue();
    }

    public static int new_user_feed_consume_opt_nonuj() {
        return ((Integer) C38686FGg.LIZIZ("new_user_feed_consume_opt_nonuj", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_feed_consume_opt_nonuj)).intValue();
    }

    public static int new_user_feed_consume_opt_nuj() {
        return ((Integer) C38686FGg.LIZIZ("new_user_feed_consume_opt_nuj", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_feed_consume_opt_nuj)).intValue();
    }

    public static int new_user_feed_fluency_v1_opt() {
        return ((Integer) C38686FGg.LIZIZ("new_user_feed_fluency_v1_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_feed_fluency_v1_opt)).intValue();
    }

    public static int new_user_feed_network_deterioration() {
        return ((Integer) C38686FGg.LIZIZ("new_user_feed_network_deterioration", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_feed_network_deterioration)).intValue();
    }

    public static int new_user_feed_total_aggre() {
        return ((Integer) C38686FGg.LIZIZ("new_user_feed_total_aggre", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_feed_total_aggre)).intValue();
    }

    public static int new_user_local_aweme_with_guide() {
        return ((Integer) C38686FGg.LIZIZ("new_user_local_aweme_with_guide", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_local_aweme_with_guide)).intValue();
    }

    public static int new_user_local_aweme_without_guide() {
        return ((Integer) C38686FGg.LIZIZ("new_user_local_aweme_without_guide", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_local_aweme_without_guide)).intValue();
    }

    public static int new_user_login_experience_aggre_opt() {
        return ((Integer) C38686FGg.LIZIZ("new_user_login_experience_aggre_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_login_experience_aggre_opt)).intValue();
    }

    public static int new_user_login_experience_opt() {
        return ((Integer) C38686FGg.LIZIZ("new_user_login_experience_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_login_experience_opt)).intValue();
    }

    public static int new_user_login_experience_v2_opt() {
        return ((Integer) C38686FGg.LIZIZ("new_user_login_experience_v2_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_login_experience_v2_opt)).intValue();
    }

    public static int new_user_low_end_opt_aggregation() {
        return ((Integer) C38686FGg.LIZIZ("new_user_low_end_opt_aggregation", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_low_end_opt_aggregation)).intValue();
    }

    public static int new_user_lynxenv_init_opt() {
        return ((Integer) C38686FGg.LIZIZ("new_user_lynxenv_init_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_lynxenv_init_opt)).intValue();
    }

    public static int new_user_nonuj_feed_preload_opt() {
        return ((Integer) C38686FGg.LIZIZ("new_user_nonuj_feed_preload_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_nonuj_feed_preload_opt)).intValue();
    }

    public static int new_user_onboarding_simplify() {
        return ((Integer) C38686FGg.LIZIZ("new_user_onboarding_simplify", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_onboarding_simplify)).intValue();
    }

    public static int new_user_resources_download_opt() {
        return ((Integer) C38686FGg.LIZIZ("new_user_resources_download_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_resources_download_opt)).intValue();
    }

    public static int new_user_resources_first_day_opt() {
        return ((Integer) C38686FGg.LIZIZ("new_user_resources_first_day_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_resources_first_day_opt)).intValue();
    }

    public static int new_user_second_feed_block_opt() {
        return ((Integer) C38686FGg.LIZIZ("new_user_second_feed_block_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_second_feed_block_opt)).intValue();
    }

    public static int new_user_startwatching_anim_video_prerender() {
        return ((Integer) C38686FGg.LIZIZ("new_user_startwatching_anim_video_prerender", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_startwatching_anim_video_prerender)).intValue();
    }

    public static int new_user_subthread_optimization() {
        return ((Integer) C38686FGg.LIZIZ("new_user_subthread_optimization", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_subthread_optimization)).intValue();
    }

    public static int new_user_swipe_ui_downgrade_opt() {
        return ((Integer) C38686FGg.LIZIZ("new_user_swipe_ui_downgrade_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_swipe_ui_downgrade_opt)).intValue();
    }

    public static int new_user_swipeup_animation_downgrade_opt() {
        return ((Integer) C38686FGg.LIZIZ("new_user_swipeup_animation_downgrade_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_swipeup_animation_downgrade_opt)).intValue();
    }

    public static int new_user_task_downgrade() {
        return ((Integer) C38686FGg.LIZIZ("new_user_task_downgrade", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_task_downgrade)).intValue();
    }

    public static int new_user_thread_priority_opt() {
        return ((Integer) C38686FGg.LIZIZ("new_user_thread_priority_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_thread_priority_opt)).intValue();
    }

    public static int new_user_top_thread_runnable_switch() {
        return ((Integer) C38686FGg.LIZIZ("new_user_top_thread_runnable_switch", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_top_thread_runnable_switch)).intValue();
    }

    public static int new_user_video_first_frame_opt() {
        return ((Integer) C38686FGg.LIZIZ("new_user_video_first_frame_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_video_first_frame_opt)).intValue();
    }

    public static int new_user_video_fluency_strategy_opt() {
        return ((Integer) C38686FGg.LIZIZ("new_user_video_fluency_strategy_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, new_user_video_fluency_strategy_opt)).intValue();
    }

    public static int newuser_gecko_high_priority_non_weakcountry_opt() {
        return ((Integer) C38686FGg.LIZIZ("newuser_gecko_high_priority_non_weakcountry_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, newuser_gecko_high_priority_non_weakcountry_opt)).intValue();
    }

    public static int newuser_gecko_high_priority_opt() {
        return ((Integer) C38686FGg.LIZIZ("newuser_gecko_high_priority_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, newuser_gecko_high_priority_opt)).intValue();
    }

    public static int newuser_gecko_opt() {
        return ((Integer) C38686FGg.LIZIZ("newuser_gecko_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, newuser_gecko_opt)).intValue();
    }

    public static int newuser_keva() {
        return ((Integer) C38686FGg.LIZIZ("newuser_keva", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, newuser_keva)).intValue();
    }

    public static int newuser_loadmore_cache_opt() {
        return ((Integer) C38686FGg.LIZIZ("newuser_loadmore_cache_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, newuser_loadmore_cache_opt)).intValue();
    }

    public static int newuser_message_statistics_switch() {
        return ((Integer) C38686FGg.LIZIZ("newuser_message_statistics_switch", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, newuser_message_statistics_switch)).intValue();
    }

    public static int newuser_start_watching_below_10_opt() {
        return ((Integer) C38686FGg.LIZIZ("newuser_start_watching_below_10_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, newuser_start_watching_below_10_opt)).intValue();
    }

    public static int newuser_start_watching_opt() {
        return ((Integer) C38686FGg.LIZIZ("newuser_start_watching_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, newuser_start_watching_opt)).intValue();
    }

    public static int nuj_report_page_start() {
        return ((Integer) C38686FGg.LIZIZ("nuj_report_page_start", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, nuj_report_page_start)).intValue();
    }

    public static int nuj_slogan_optimize() {
        return ((Integer) C38686FGg.LIZIZ("nuj_slogan_optimize", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, nuj_slogan_optimize)).intValue();
    }

    public static int old_offline_clean_v2() {
        return ((Integer) C38686FGg.LIZIZ("old_offline_clean_v2", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, old_offline_clean_v2)).intValue();
    }

    public static int old_user_login_experience_opt() {
        return ((Integer) C38686FGg.LIZIZ("old_user_login_experience_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, old_user_login_experience_opt)).intValue();
    }

    public static int old_user_login_experience_v2_opt() {
        return ((Integer) C38686FGg.LIZIZ("old_user_login_experience_v2_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, old_user_login_experience_v2_opt)).intValue();
    }

    public static int penetration_rate_blank_search() {
        return ((Integer) C38686FGg.LIZIZ("penetration_rate_blank_search", Integer.TYPE, C31461Li.LIZIZ("1"), true, penetration_rate_blank_search)).intValue();
    }

    public static int penetration_rate_comment_page() {
        return ((Integer) C38686FGg.LIZIZ("penetration_rate_comment_page", Integer.TYPE, C31461Li.LIZIZ("1"), true, penetration_rate_comment_page)).intValue();
    }

    public static int penetration_rate_follow() {
        return ((Integer) C38686FGg.LIZIZ("penetration_rate_follow", Integer.TYPE, C31461Li.LIZIZ("1"), true, penetration_rate_follow)).intValue();
    }

    public static int penetration_rate_inbox() {
        return ((Integer) C38686FGg.LIZIZ("penetration_rate_inbox", Integer.TYPE, C31461Li.LIZIZ("1"), true, penetration_rate_inbox)).intValue();
    }

    public static int penetration_rate_music_detail() {
        return ((Integer) C38686FGg.LIZIZ("penetration_rate_music_detail", Integer.TYPE, C31461Li.LIZIZ("1"), true, penetration_rate_music_detail)).intValue();
    }

    public static int penetration_rate_others() {
        return ((Integer) C38686FGg.LIZIZ("penetration_rate_others", Integer.TYPE, C31461Li.LIZIZ("1"), true, penetration_rate_others)).intValue();
    }

    public static int penetration_rate_user_profile() {
        return ((Integer) C38686FGg.LIZIZ("penetration_rate_user_profile", Integer.TYPE, C31461Li.LIZIZ("1"), true, penetration_rate_user_profile)).intValue();
    }

    public static int penetration_rate_video_detail() {
        return ((Integer) C38686FGg.LIZIZ("penetration_rate_video_detail", Integer.TYPE, C31461Li.LIZIZ("1"), true, penetration_rate_video_detail)).intValue();
    }

    public static int player_new_user_opt_exp() {
        return ((Integer) C38686FGg.LIZIZ("player_new_user_opt_exp", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, player_new_user_opt_exp)).intValue();
    }

    public static int plugin_interceptor_experiment() {
        return ((Integer) C38686FGg.LIZIZ("plugin_interceptor_experiment", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, plugin_interceptor_experiment)).intValue();
    }

    public static int resso_anchor_uninstalled_vid() {
        return ((Integer) C38686FGg.LIZIZ("resso_anchor_uninstalled_vid", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, resso_anchor_uninstalled_vid)).intValue();
    }

    public static int signup_login_bind_phone_email() {
        return ((Integer) C38686FGg.LIZIZ("signup_login_bind_phone_email", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, signup_login_bind_phone_email)).intValue();
    }

    public static int simplifying_password() {
        return ((Integer) C38686FGg.LIZIZ("simplifying_password", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, simplifying_password)).intValue();
    }

    public static int slogan_login_opt_experiment() {
        return ((Integer) C38686FGg.LIZIZ("slogan_login_opt_experiment", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, slogan_login_opt_experiment)).intValue();
    }

    public static int three_vv_fluency() {
        return ((Integer) C38686FGg.LIZIZ("three_vv_fluency", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, three_vv_fluency)).intValue();
    }

    public static int weak_net_country_traffic_opt() {
        return ((Integer) C38686FGg.LIZIZ("weak_net_country_traffic_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, weak_net_country_traffic_opt)).intValue();
    }

    public static int zero_video_view_monitor_newuser_exp() {
        return ((Integer) C38686FGg.LIZIZ("zero_video_view_monitor_newuser_exp", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), true, zero_video_view_monitor_newuser_exp)).intValue();
    }

    public static int akamai_tnc_config_update_exp(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("akamai_tnc_config_update_exp", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, akamai_tnc_config_update_exp)).intValue();
    }

    public static int backup_video_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("backup_video_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, backup_video_opt)).intValue();
    }

    public static int bootfinish_msg_aggre_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("bootfinish_msg_aggre_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, bootfinish_msg_aggre_opt)).intValue();
    }

    public static int decompress_so_strategy_client(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("decompress_so_strategy_client", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, decompress_so_strategy_client)).intValue();
    }

    public static int disable_dex2oat_strategy(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("disable_dex2oat_strategy", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, disable_dex2oat_strategy)).intValue();
    }

    public static int emoji_preload_type_v3(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("emoji_preload_type_v3", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, emoji_preload_type_v3)).intValue();
    }

    public static int feed_platform_local_offline(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("feed_platform_local_offline", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, feed_platform_local_offline)).intValue();
    }

    public static int feed_total_v2_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("feed_total_v2_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, feed_total_v2_opt)).intValue();
    }

    public static int fix_smartlock_memory_leak(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("fix_smartlock_memory_leak", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, fix_smartlock_memory_leak)).intValue();
    }

    public static int flow_opt_key(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("flow_opt_key", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, flow_opt_key)).intValue();
    }

    public static int gecko_bytediff_exp_tt_android(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("gecko_bytediff_exp_tt_android", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, gecko_bytediff_exp_tt_android)).intValue();
    }

    public static int google_onetap_nonce_fix_2(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("google_onetap_nonce_fix_2", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, google_onetap_nonce_fix_2)).intValue();
    }

    public static int inference_engine_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("inference_engine_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, inference_engine_opt)).intValue();
    }

    public static int is_new_user_see_first(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("is_new_user_see_first", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, is_new_user_see_first)).intValue();
    }

    public static int is_opt_new_user_boot(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("is_opt_new_user_boot", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, is_opt_new_user_boot)).intValue();
    }

    public static int launch_opt_swipeup(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("launch_opt_swipeup", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, launch_opt_swipeup)).intValue();
    }

    public static int leakcanary_clean_type_v2550(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("leakcanary_clean_type_v2550", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, leakcanary_clean_type_v2550)).intValue();
    }

    public static int low_storage_aot_service_type_v259(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("low_storage_aot_service_type_v259", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, low_storage_aot_service_type_v259)).intValue();
    }

    public static int low_storage_gecko_unload_high_type(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("low_storage_gecko_unload_high_type", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, low_storage_gecko_unload_high_type)).intValue();
    }

    public static int miniapp_plugin_install_strategy(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("miniapp_plugin_install_strategy", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, miniapp_plugin_install_strategy)).intValue();
    }

    public static int new_user_aggregated_2_optimization(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_aggregated_2_optimization", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_aggregated_2_optimization)).intValue();
    }

    public static int new_user_aggregated_3_optimization(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_aggregated_3_optimization", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_aggregated_3_optimization)).intValue();
    }

    public static int new_user_aggregated_4_optimization(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_aggregated_4_optimization", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_aggregated_4_optimization)).intValue();
    }

    public static int new_user_aggregated_5_optimization(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_aggregated_5_optimization", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_aggregated_5_optimization)).intValue();
    }

    public static int new_user_aggregated_optimization(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_aggregated_optimization", Integer.TYPE, C31461Li.LIZIZ("1"), z, new_user_aggregated_optimization)).intValue();
    }

    public static int new_user_bootfinish_opt_downgrade(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_bootfinish_opt_downgrade", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_bootfinish_opt_downgrade)).intValue();
    }

    public static int new_user_coldboot_background_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_coldboot_background_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_coldboot_background_opt)).intValue();
    }

    public static int new_user_coldboot_mainthread_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_coldboot_mainthread_opt", Integer.TYPE, C31461Li.LIZIZ("1"), z, new_user_coldboot_mainthread_opt)).intValue();
    }

    public static int new_user_feed_consume_opt_nonuj(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_feed_consume_opt_nonuj", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_feed_consume_opt_nonuj)).intValue();
    }

    public static int new_user_feed_consume_opt_nuj(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_feed_consume_opt_nuj", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_feed_consume_opt_nuj)).intValue();
    }

    public static int new_user_feed_fluency_v1_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_feed_fluency_v1_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_feed_fluency_v1_opt)).intValue();
    }

    public static int new_user_feed_network_deterioration(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_feed_network_deterioration", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_feed_network_deterioration)).intValue();
    }

    public static int new_user_feed_total_aggre(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_feed_total_aggre", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_feed_total_aggre)).intValue();
    }

    public static int new_user_local_aweme_with_guide(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_local_aweme_with_guide", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_local_aweme_with_guide)).intValue();
    }

    public static int new_user_local_aweme_without_guide(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_local_aweme_without_guide", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_local_aweme_without_guide)).intValue();
    }

    public static int new_user_login_experience_aggre_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_login_experience_aggre_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_login_experience_aggre_opt)).intValue();
    }

    public static int new_user_login_experience_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_login_experience_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_login_experience_opt)).intValue();
    }

    public static int new_user_login_experience_v2_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_login_experience_v2_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_login_experience_v2_opt)).intValue();
    }

    public static int new_user_low_end_opt_aggregation(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_low_end_opt_aggregation", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_low_end_opt_aggregation)).intValue();
    }

    public static int new_user_lynxenv_init_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_lynxenv_init_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_lynxenv_init_opt)).intValue();
    }

    public static int new_user_nonuj_feed_preload_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_nonuj_feed_preload_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_nonuj_feed_preload_opt)).intValue();
    }

    public static int new_user_onboarding_simplify(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_onboarding_simplify", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_onboarding_simplify)).intValue();
    }

    public static int new_user_resources_download_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_resources_download_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_resources_download_opt)).intValue();
    }

    public static int new_user_resources_first_day_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_resources_first_day_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_resources_first_day_opt)).intValue();
    }

    public static int new_user_second_feed_block_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_second_feed_block_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_second_feed_block_opt)).intValue();
    }

    public static int new_user_startwatching_anim_video_prerender(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_startwatching_anim_video_prerender", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_startwatching_anim_video_prerender)).intValue();
    }

    public static int new_user_subthread_optimization(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_subthread_optimization", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_subthread_optimization)).intValue();
    }

    public static int new_user_swipe_ui_downgrade_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_swipe_ui_downgrade_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_swipe_ui_downgrade_opt)).intValue();
    }

    public static int new_user_swipeup_animation_downgrade_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_swipeup_animation_downgrade_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_swipeup_animation_downgrade_opt)).intValue();
    }

    public static int new_user_task_downgrade(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_task_downgrade", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_task_downgrade)).intValue();
    }

    public static int new_user_thread_priority_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_thread_priority_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_thread_priority_opt)).intValue();
    }

    public static int new_user_top_thread_runnable_switch(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_top_thread_runnable_switch", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_top_thread_runnable_switch)).intValue();
    }

    public static int new_user_video_first_frame_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_video_first_frame_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_video_first_frame_opt)).intValue();
    }

    public static int new_user_video_fluency_strategy_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("new_user_video_fluency_strategy_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, new_user_video_fluency_strategy_opt)).intValue();
    }

    public static int newuser_gecko_high_priority_non_weakcountry_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("newuser_gecko_high_priority_non_weakcountry_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, newuser_gecko_high_priority_non_weakcountry_opt)).intValue();
    }

    public static int newuser_gecko_high_priority_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("newuser_gecko_high_priority_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, newuser_gecko_high_priority_opt)).intValue();
    }

    public static int newuser_gecko_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("newuser_gecko_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, newuser_gecko_opt)).intValue();
    }

    public static int newuser_keva(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("newuser_keva", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, newuser_keva)).intValue();
    }

    public static int newuser_loadmore_cache_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("newuser_loadmore_cache_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, newuser_loadmore_cache_opt)).intValue();
    }

    public static int newuser_message_statistics_switch(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("newuser_message_statistics_switch", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, newuser_message_statistics_switch)).intValue();
    }

    public static int newuser_start_watching_below_10_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("newuser_start_watching_below_10_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, newuser_start_watching_below_10_opt)).intValue();
    }

    public static int newuser_start_watching_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("newuser_start_watching_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, newuser_start_watching_opt)).intValue();
    }

    public static int nuj_report_page_start(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("nuj_report_page_start", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, nuj_report_page_start)).intValue();
    }

    public static int nuj_slogan_optimize(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("nuj_slogan_optimize", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, nuj_slogan_optimize)).intValue();
    }

    public static int old_offline_clean_v2(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("old_offline_clean_v2", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, old_offline_clean_v2)).intValue();
    }

    public static int old_user_login_experience_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("old_user_login_experience_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, old_user_login_experience_opt)).intValue();
    }

    public static int old_user_login_experience_v2_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("old_user_login_experience_v2_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, old_user_login_experience_v2_opt)).intValue();
    }

    public static int penetration_rate_blank_search(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("penetration_rate_blank_search", Integer.TYPE, C31461Li.LIZIZ("1"), z, penetration_rate_blank_search)).intValue();
    }

    public static int penetration_rate_comment_page(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("penetration_rate_comment_page", Integer.TYPE, C31461Li.LIZIZ("1"), z, penetration_rate_comment_page)).intValue();
    }

    public static int penetration_rate_follow(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("penetration_rate_follow", Integer.TYPE, C31461Li.LIZIZ("1"), z, penetration_rate_follow)).intValue();
    }

    public static int penetration_rate_inbox(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("penetration_rate_inbox", Integer.TYPE, C31461Li.LIZIZ("1"), z, penetration_rate_inbox)).intValue();
    }

    public static int penetration_rate_music_detail(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("penetration_rate_music_detail", Integer.TYPE, C31461Li.LIZIZ("1"), z, penetration_rate_music_detail)).intValue();
    }

    public static int penetration_rate_others(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("penetration_rate_others", Integer.TYPE, C31461Li.LIZIZ("1"), z, penetration_rate_others)).intValue();
    }

    public static int penetration_rate_user_profile(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("penetration_rate_user_profile", Integer.TYPE, C31461Li.LIZIZ("1"), z, penetration_rate_user_profile)).intValue();
    }

    public static int penetration_rate_video_detail(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("penetration_rate_video_detail", Integer.TYPE, C31461Li.LIZIZ("1"), z, penetration_rate_video_detail)).intValue();
    }

    public static int player_new_user_opt_exp(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("player_new_user_opt_exp", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, player_new_user_opt_exp)).intValue();
    }

    public static int plugin_interceptor_experiment(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("plugin_interceptor_experiment", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, plugin_interceptor_experiment)).intValue();
    }

    public static int resso_anchor_uninstalled_vid(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("resso_anchor_uninstalled_vid", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, resso_anchor_uninstalled_vid)).intValue();
    }

    public static int signup_login_bind_phone_email(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("signup_login_bind_phone_email", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, signup_login_bind_phone_email)).intValue();
    }

    public static int simplifying_password(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("simplifying_password", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, simplifying_password)).intValue();
    }

    public static int slogan_login_opt_experiment(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("slogan_login_opt_experiment", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, slogan_login_opt_experiment)).intValue();
    }

    public static int three_vv_fluency(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("three_vv_fluency", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, three_vv_fluency)).intValue();
    }

    public static int weak_net_country_traffic_opt(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("weak_net_country_traffic_opt", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, weak_net_country_traffic_opt)).intValue();
    }

    public static int zero_video_view_monitor_newuser_exp(boolean z) {
        return ((Integer) C38686FGg.LIZIZ("zero_video_view_monitor_newuser_exp", Integer.TYPE, C31461Li.LIZIZ(CardStruct.IStatusCode.DEFAULT), z, zero_video_view_monitor_newuser_exp)).intValue();
    }
}
