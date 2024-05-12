package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.experiment.ThreadConvergenceConfig;

/* loaded from: classes7.dex */
public final class FKN {
    public static void LIZJ() {
        boolean z;
        boolean z2;
        SharedPreferences.Editor putBoolean = C35820E4a.LIZLLL(FKM.LIZ()).edit().putBoolean("optimize_cold_boot_hook_app_context", E1C.LIZ).putBoolean("optimize_keavexecute", C38791FKh.LIZ).putBoolean("optimize_kevafeaturetask", C38792FKi.LIZ).putBoolean("keva_enable_arraymap", C38788FKe.LIZ).putBoolean("optimize_kevaasynchronize", C38790FKg.LIZ).putBoolean("optimize_initkeva_v2", C38787FKd.LIZ).putBoolean("optimize_kevaio", C38793FKj.LIZ).putBoolean("optimize_loadabrepo_v2", C38785FKb.LIZ).putBoolean("optimize_preinitnpth", C38784FKa.LIZ).putBoolean("optimize_asyncjatotask", C34985DoD.LIZ).putInt("optimize_preinitjatoverify_v3", ((Number) FKS.LIZ.getValue()).intValue()).putBoolean("optimize_asyncpreload", C34987DoF.LIZ).putBoolean("optimize_kevasp", C35346Du2.LIZ).putBoolean("optimize_systemtaskopt", C38786FKc.LIZ).putBoolean("tt_new_string_opt", C38789FKf.LIZ);
        FFL.LJIIIZ().getClass();
        boolean z3 = false;
        SharedPreferences.Editor putInt = putBoolean.putInt("key_idle_loadso", FFL.LJIIJ(31744, 0, "key_idle_loadso", true));
        FFL.LJIIIZ().getClass();
        SharedPreferences.Editor putInt2 = putInt.putInt("xjl_main_looper_opt_exp", FFL.LJIIJ(31744, 0, "xjl_main_looper_opt_exp", true));
        FFL.LJIIIZ().getClass();
        SharedPreferences.Editor putBoolean2 = putInt2.putBoolean("open_switch_to_bdtrakcer", FFL.LJ(31744, "open_switch_to_bdtrakcer", true, false)).putBoolean("optimize_apprefactor", ((Boolean) FKU.LIZ.getValue()).booleanValue());
        FFL.LJIIIZ().getClass();
        SharedPreferences.Editor putInt3 = putBoolean2.putInt("open_keva_load_optimized_2", FFL.LJIIJ(31744, 0, "open_keva_load_optimized_2", true));
        FFL.LJIIIZ().getClass();
        SharedPreferences.Editor putBoolean3 = putInt3.putBoolean("open_release_java_memory_key_2", FFL.LJ(31744, "open_release_java_memory_key_2", true, false));
        FFL.LJIIIZ().getClass();
        SharedPreferences.Editor putBoolean4 = putBoolean3.putBoolean("open_release_native_memory_key_2", FFL.LJ(31744, "open_release_native_memory_key_2", true, false));
        FFL.LJIIIZ().getClass();
        SharedPreferences.Editor putInt4 = putBoolean4.putInt("clean_interval_time_2", FFL.LJIIJ(31744, Integer.MAX_VALUE, "clean_interval_time_2", true));
        FFL.LJIIIZ().getClass();
        SharedPreferences.Editor putInt5 = putInt4.putInt("cache_expiration_time_2", FFL.LJIIJ(31744, Integer.MAX_VALUE, "cache_expiration_time_2", true)).putInt("optimize_kevaexectuetype", ((Number) FKW.LIZ.getValue()).intValue());
        FFL.LJIIIZ().getClass();
        SharedPreferences.Editor putInt6 = putInt5.putInt("gc_block_max_duration_key", FFL.LJIIJ(31744, -1, "gc_block_max_duration_key", true));
        FFL.LJIIIZ().getClass();
        SharedPreferences.Editor putInt7 = putInt6.putInt("gc_block_max_duration_render_ready", FFL.LJIIJ(31744, -1, "gc_block_max_duration_render_ready", true)).putInt("optimize_executesynctype", ((Number) FKY.LIZ.getValue()).intValue());
        if (C00F.LIZ(31744, 0, "open_strings_hot_update", true) == 1) {
            z = true;
        } else {
            z = false;
        }
        SharedPreferences.Editor putBoolean5 = putInt7.putBoolean("string_hot_update_online", z);
        if (C00F.LIZ(31744, 0, "open_strings_hot_update_xml_support", true) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        SharedPreferences.Editor putBoolean6 = putBoolean5.putBoolean("string_hot_update_xml_online", z2).putBoolean("string_hot_update_need_block_on_tablet", LFH.LIZIZ.LIZLLL().block().LJIILJJIL());
        if (C00F.LIZ(31744, 0, "open_string_hot_webview_delay", true) == 1) {
            z3 = true;
        }
        putBoolean6.putBoolean("string_hot_webview_loading_delay", z3).apply();
        FFL LJIIIZ = FFL.LJIIIZ();
        ThreadConvergenceConfig threadConvergenceConfig = FLR.LIZ;
        LJIIIZ.getClass();
        ThreadConvergenceConfig threadConvergenceConfig2 = (ThreadConvergenceConfig) FFL.LJIJ(true, "tt_thread_convergence_config", 31744, ThreadConvergenceConfig.class, threadConvergenceConfig);
        if (threadConvergenceConfig2 != null) {
            threadConvergenceConfig = threadConvergenceConfig2;
        }
        C35820E4a.LIZLLL(FKM.LIZ()).edit().putString("tt_thread_convergence_config", C75792yF.LIZJ(threadConvergenceConfig)).putInt("tt_thread_convergence_switch", threadConvergenceConfig.f26switch).apply();
    }

    public static int LIZ(Context context) {
        return C35820E4a.LIZ(context, -1, "optimize_executesynctype");
    }

    public static int LIZIZ(Context context) {
        return C35820E4a.LIZ(context, 0, "optimize_preinitjatoverify_v3");
    }
}
