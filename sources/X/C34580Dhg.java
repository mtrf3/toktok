package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.gson.Gson;
import com.google.gson.g;
import com.google.gson.j;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Dhg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34580Dhg {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C34583Dhj.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(DPM.LJLIL);

    public static Keva LIZ() {
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        return (Keva) value;
    }

    public static Keva LIZIZ() {
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-kevaMutiprocess>(...)");
        return (Keva) value;
    }

    public static void LIZJ() {
        Keva LIZ2 = E2C.LIZ(31744, 1, "is_opt_lego_bootfinish", true, E2C.LIZ(31744, 0, "fluency_insert_downgrade_opt", true, LIZ(), "fluency_insert_downgrade_opt"), "is_opt_lego_bootfinish");
        SettingsManager.LIZLLL().getClass();
        LIZ2.storeLong("lego_boot_finish_sparse", SettingsManager.LJFF("lego_boot_finish_sparse", 300L));
        Keva LIZ3 = LIZ();
        SettingsManager.LIZLLL().getClass();
        LIZ3.storeLong("coldboot_log_batch_delay_time", SettingsManager.LJFF("coldboot_log_batch_delay_time", 5000L));
        Keva LIZ4 = E2C.LIZ(31744, 0, "applog_batch", true, LIZ(), "applog_batch");
        SettingsManager.LIZLLL().getClass();
        LIZ4.storeLong("lego_boot_finish_trigger_delay", SettingsManager.LJFF("lego_boot_finish_trigger_delay", 1000L));
        Keva LIZ5 = LIZ();
        SettingsManager.LIZLLL().getClass();
        LIZ5.storeLong("lego_boot_finish_min_sparse", SettingsManager.LJFF("lego_boot_finish_min_sparse", 0L));
        Keva LIZ6 = E2C.LIZ(31744, 0, "upgrade_experiment", true, E2C.LIZ(31744, 0, "doframe_drop_opt", true, E2C.LIZ(31744, 1, "first_frame_do_frame_opt", true, E2C.LIZ(31744, 11, "lego_threadpool_type", true, E2C.LIZ(31744, 0, "lego_bootfinish_task_downgrade", true, E2C.LIZ(31744, 0, "swipe_ui_downgrade_experiment_v2", true, E2C.LIZ(31744, 0, "swipe_ui_downgrade_experiment", true, E2C.LIZ(31744, 0, "backgroundtask_opt_v4", true, E2C.LIZ(31744, 1, "bootfinish_task_idle_opt", true, E2C.LIZ(31744, 1, "fresco_total_opt", true, E2C.LIZ(31744, 0, "main_task_opt", true, E2C.LIZ(31744, 3680, "java_threadpriority", true, E2C.LIZ(31744, 0, "measure_downgrade", true, E2C.LIZ(31744, 13, "activity_start_downgrade", true, E2C.LIZ(31744, 0, "boot_do_frame_opt", true, E2C.LIZ(31744, 39, "static_java_memory_opt", true, E2C.LIZ(31744, 29, "launchertask_opt", true, E2C.LIZ(31744, 30, "backgroundtask_opt_v2", true, E2C.LIZ(31744, 145, "backgroundtask_opt", true, E2C.LIZ(31744, 1, "delay_ttlivesdk", true, E2C.LIZ(31744, 0, "is_downgrade_opt", true, E2C.LIZ(31744, 0, "downgrade_bg_experiment", true, LIZ(), "downgrade_bg_experiment"), "is_downgrade_opt"), "delay_ttlivesdk"), "backgroundtask_opt"), "backgroundtask_opt_v2"), "launchertask_opt"), "static_java_memory_opt"), "boot_do_frame_opt"), "activity_start_downgrade"), "measure_downgrade"), "java_threadpriority"), "main_task_opt"), "fresco_total_opt"), "bootfinish_task_idle_opt"), "backgroundtask_opt_v4"), "swipe_ui_downgrade_experiment"), "swipe_ui_downgrade_experiment_v2"), "lego_bootfinish_task_downgrade"), "lego_threadpool_type"), "first_frame_do_frame_opt"), "doframe_drop_opt"), "upgrade_experiment");
        FFL.LJIIIZ().getClass();
        LIZ6.storeBoolean("repo_init_cukaie_opt", FFL.LJ(31744, "init_cukaie_opt", true, false));
        Keva LIZ7 = E2C.LIZ(31744, 0, "lego_request_opt", true, E2C.LIZ(31744, 0, "initinflate_task_opt", true, E2C.LIZ(31744, 0, "legacy_task_opt", true, E2C.LIZ(31744, 0, "bootfinish_task_opt_v2", true, E2C.LIZ(31744, 0, "linux_threadpriority", true, E2C.LIZ(31744, 0, "device_screen_info_cache_opt", true, E2C.LIZ(31744, 1000, "slide_block_gc_time", true, E2C.LIZ(31744, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, "slide_bg_suppression_time", true, E2C.LIZ(31744, 0, "IdleScheduleTest", true, E2C.LIZ(31744, 0, "backgroundtask_schedule_opt", true, E2C.LIZ(31744, 0, "thread_suppression_opt", true, E2C.LIZ(31744, 0, "instance_preload_opt", true, E2C.LIZ(31744, 0, "jsbridge2_init_opt", true, LIZ(), "jsbridge2_init_opt"), "instance_preload_opt"), "thread_suppression_opt"), "backgroundtask_schedule_opt"), "IdleScheduleTest"), "slide_bg_suppression_time"), "slide_block_gc_time"), "device_screen_info_cache_opt"), "linux_threadpriority"), "bootfinish_task_opt_v2"), "legacy_task_opt"), "initinflate_task_opt"), "lego_request_opt");
        FFL.LJIIIZ().getClass();
        LIZ7.storeLong("lego_request_boot_finish_trigger_delay", FFL.LJIILIIL(31744, 2000L, "lego_request_boot_finish_trigger_delay"));
        Keva LIZ8 = LIZ();
        FFL.LJIIIZ().getClass();
        LIZ8.storeLong("lego_request_idle_trigger_delay", FFL.LJIILIIL(31744, 2000L, "lego_request_idle_trigger_delay"));
        Keva LIZ9 = E2C.LIZ(31744, 0, "boot_runnable_opt", true, E2C.LIZ(31744, 0, "assem_performance_opt", true, E2C.LIZ(31744, 0, "feed_refresh_without_scroll_when_back", true, E2C.LIZ(31744, 0, "thread_convergence_local_test_open", true, LIZ(), "thread_convergence_local_test_open"), "feed_refresh_without_scroll_when_back"), "assem_performance_opt"), "boot_runnable_opt");
        SettingsManager.LIZLLL().getClass();
        LIZ9.storeLong("sparse_interval_time", SettingsManager.LJFF("sparse_interval_time", 0L));
        E2C.LIZ(31744, 0, "loading_experience_opt", true, E2C.LIZ(31744, 0, "keva_cache_opt", true, E2C.LIZ(31744, 0, "ab_cache_opt", true, E2C.LIZ(31744, 0, "instance_preload_v2_opt", true, E2C.LIZ(31744, 0, "feed_onsuccess_v1", true, E2C.LIZ(31744, 2, "ab_lock_opt", true, E2C.LIZ(31744, 0, "notification_show_opt", true, E2C.LIZ(31744, 0, "feed_assem_performance_opt", true, E2C.LIZ(31744, 0, "apm_downgrade_v2", true, E2C.LIZ(31744, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, "load_more_opt_low_network_speed", true, E2C.LIZ(31744, 2500, "load_more_opt_high_network_speed", true, E2C.LIZ(31744, 0, "load_more_timing_opt", true, E2C.LIZ(31744, 0, "layoutinfalter_hook_opt", true, E2C.LIZ(31744, 0, "pthread_create_plugin_opt", true, LIZ(), "pthread_create_plugin_opt"), "layoutinfalter_hook_opt"), "load_more_timing_opt"), "load_more_opt_high_network_speed"), "load_more_opt_low_network_speed"), "apm_downgrade_v2"), "feed_assem_performance_opt"), "notification_show_opt"), "ab_lock_opt"), "feed_onsuccess_v1"), "instance_preload_v2_opt"), "ab_cache_opt"), "keva_cache_opt"), "loading_experience_opt").storeLong("app_update_versioncode", C2NW.LIZ().getUpdateVersionCode());
        Keva LIZ10 = E2C.LIZ(31744, 0, "push_start_app_opt_precise", true, E2C.LIZ(31744, 0, "live_pre_parse_dns_opt", true, E2C.LIZ(31744, 0, "request_downgrade_opt", true, E2C.LIZ(31744, 0, "hybridkit_config_opt", true, LIZ(), "hybridkit_config_opt"), "request_downgrade_opt"), "live_pre_parse_dns_opt"), "push_start_app_opt_precise");
        FFL.LJIIIZ().getClass();
        LIZ10.storeLong("bg_task_sum_time", FFL.LJIILIIL(31744, 0L, "bg_task_sum_time"));
        Keva LIZ11 = LIZ();
        FFL.LJIIIZ().getClass();
        LIZ11.storeLong("bg_task_sparse_time", FFL.LJIILIIL(31744, 0L, "bg_task_sparse_time"));
        Keva LIZ12 = LIZ();
        FFL.LJIIIZ().getClass();
        LIZ12.storeLong("cold_boot_request_sparse_time", FFL.LJIILIIL(31744, 0L, "cold_boot_request_sparse_time"));
        Keva LIZ13 = E2C.LIZ(31744, 0, "keva_and_ab_preload_delay", true, E2C.LIZ(31744, 0, "feed_preload_request_delay_time", true, E2C.LIZ(31744, 0, "kin_ship_task_opt", true, E2C.LIZ(31744, 0, "lego_bootfinsh_threadpool_type", true, E2C.LIZ(31744, 0, "coldboot_low_prority_request_delay_time", true, E2C.LIZ(31744, 0, "enter_shoot_opt", true, E2C.LIZ(31744, 0, "helios_logcat_opt", true, E2C.LIZ(31744, 0, "scalpel_runnable_V1", true, E2C.LIZ(31744, 0, "network_common_params_opt", true, E2C.LIZ(31744, 0, "slide_memory_opt", true, E2C.LIZ(31744, 0, "start_up_memory_opt", true, E2C.LIZ(31744, 0, "block_gc_low_device", true, E2C.LIZ(31744, 0, "lighten_display_opt", true, E2C.LIZ(31744, 0, "ibe_preload_opt", true, E2C.LIZ(31744, 0, "cold_boot_request_sparse_opt", true, E2C.LIZ(31744, 0, "live_sdk_start_opt", true, E2C.LIZ(31744, 0, "push_start_task_opt", true, LIZ(), "push_start_task_opt"), "live_sdk_start_opt"), "cold_boot_request_sparse_opt"), "ibe_preload_opt"), "lighten_display_opt"), "block_gc_low_device"), "start_up_memory_opt"), "slide_memory_opt"), "network_common_params_opt"), "scalpel_runnable_V1"), "helios_logcat_opt"), "enter_shoot_opt"), "coldboot_low_prority_request_delay_time"), "lego_bootfinsh_threadpool_type"), "kin_ship_task_opt"), "feed_preload_request_delay_time"), "keva_and_ab_preload_delay");
        FFL.LJIIIZ().getClass();
        LIZ13.storeInt("assem_init_task_opt", FFL.LJIIJ(31744, 0, "assem_init_task_opt", true));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = (ArrayList) GsonProtectorUtils.fromJson(new Gson(), (j) i0.LJ(true, "small_main_task_list", 31744, g.class, null), ArrayList.class);
        if (arrayList != null && arrayList.size() > 0) {
            hashSet.addAll(arrayList);
        }
        Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeStringSet("small_main_task_list", hashSet);
        j jVar = (j) i0.LJ(true, "idle_list", 31744, g.class, null);
        if (jVar != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("idle_list", jVar.toString());
        }
        j jVar2 = (j) i0.LJ(true, "app_background_list", 31744, g.class, null);
        if (jVar2 != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("app_background_list", jVar2.toString());
        }
        j jVar3 = (j) i0.LJ(true, "real_idle_list", 31744, g.class, null);
        if (jVar3 != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("real_idle_list", jVar3.toString());
        }
        j jVar4 = (j) i0.LJ(true, "first_brush_downgrade_whitelist", 31744, g.class, null);
        if (jVar4 != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("first_brush_downgrade_whitelist", jVar4.toString());
        }
        j jVar5 = (j) i0.LJ(true, "pthread_opt_blacklist", 31744, g.class, null);
        if (jVar5 != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("pthread_opt_blacklist", jVar5.toString());
        }
        j jVar6 = (j) i0.LJ(true, "cold_boot_request_sparse_set", 31744, g.class, null);
        if (jVar6 != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("cold_boot_request_sparse_set", jVar6.toString());
        }
        j jVar7 = (j) i0.LJ(true, "shoot_high_priority_request_set", 31744, g.class, null);
        if (jVar7 != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("shoot_high_priority_request_set", jVar7.toString());
        }
        j jVar8 = (j) i0.LJ(true, "legotask_kinship_downgrade", 31744, g.class, null);
        if (jVar8 != null) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeString("legotask_kinship_downgrade", jVar8.toString());
        }
        Keva LIZIZ2 = LIZIZ();
        FFL.LJIIIZ().getClass();
        LIZIZ2.storeInt("push_start_opt_strategy", FFL.LJIIJ(31744, 5, "push_start_opt_strategy", true));
    }
}
