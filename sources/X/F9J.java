package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.keva.KevaImpl;
import com.bytedance.keva.adapter.KevaSpFastAdapter;
import com.ss.android.ugc.aweme.sp.SharedPreferencesManager;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes7.dex */
public final class F9J {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static int LIZJ;
    public static File LJIIIIZZ;
    public static final HashSet<String> LIZLLL = new HashSet<>();
    public static final HashSet<String> LJ = new HashSet<>();
    public static final HashSet<String> LJFF = new HashSet<>();
    public static final String[] LJI = {"is_allow_oppo_push", "push_multi_process_config", "traffic_monitor_info", "applog_stats", "wschannel_multi_process_config", "device_register_migrate_detector", "com.ss.android.deviceregister.utils.Cdid", "rec_user", "ab_test_mock_config", "anr_monitor_table", "app_setting", "aweme-abtest-hooker", "gaid_sp_name", "google_ads_flags", "image_opt_table", "KEY_NEED_UPLOAD_LAUNCHLOG", "plugin_meta_data", "pref_registered_pkg_names", "push_setting", "ss_app_config", "ss_location", "test_setting", "update_params", "use_https", "XMPushServiceConfig", "MiniAppCookiePersistence", "tma_jssdk_info", "mini_app_storage", "appbrand_file", "share_setting_preference", "push_switch", "sync", "httpdns_config_cache", "sp_client_report_status", "effect_setting", "d_permit", "Alvin2", "ContextData", "pushConfig", "MainTabPreferences", "sp_download_info", "TTWebView_Json_Config_Manager", "TeenageModeSetting", "extra_group", "WebViewBytedancePrefs", "app_bundle_session_ids"};
    public static final List<Class> LJII = Arrays.asList(C38481F8j.class, C43862HJi.class);
    public static final HashMap<String, Boolean> LJIIIZ = new HashMap<>();

    public static SharedPreferences LIZ(Context context, int i, String str) {
        if (!TextUtils.equals("plugin_meta_data", str) && !TextUtils.equals("bmd_monitor", str) && !TextUtils.equals("multidex.version", str)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(context.getPackageName());
            LIZ2.append("_preferences");
            if (!TextUtils.equals(X1D.LIZIZ(LIZ2), str)) {
                SharedPreferences sharedPreferences = SharedPreferencesManager.getInstance().getSharedPreferences(context, str);
                if (sharedPreferences != null) {
                    return sharedPreferences;
                }
                return context.getSharedPreferences(str, i);
            }
        }
        return context.getSharedPreferences(str, i);
    }

    public static SharedPreferences LIZIZ(Context context, int i, String str) {
        boolean z;
        boolean exists;
        boolean z2 = false;
        boolean z3 = true;
        if (!LIZ || LJII.contains(context.getClass()) || LIZLLL.contains(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return LIZ(context, i, str);
        }
        if ((str.length() & 7) == LIZJ) {
            z2 = true;
        }
        if (!z2 && !KevaImpl.isRepoPorted(str)) {
            HashMap<String, Boolean> hashMap = LJIIIZ;
            synchronized (hashMap) {
                Boolean bool = hashMap.get(str);
                if (bool != null) {
                    exists = bool.booleanValue();
                } else {
                    if (LJIIIIZZ == null) {
                        File LLIIJLIL = C16880lQ.LLIIJLIL(context);
                        if (!LLIIJLIL.exists()) {
                            LLIIJLIL.mkdir();
                        }
                        LJIIIIZZ = new File(LLIIJLIL.getParent(), "shared_prefs");
                    }
                    File file = LJIIIIZZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    LIZ2.append(".xml");
                    exists = new File(file, X1D.LIZIZ(LIZ2)).exists();
                    hashMap.put(str, Boolean.valueOf(exists));
                }
            }
            if (exists) {
                return LIZ(context, i, str);
            }
        }
        if (LJFF.contains(str)) {
            i = 4;
        }
        boolean z4 = LIZIZ;
        if (!LJ.contains(str)) {
            z3 = z4;
        }
        return KevaSpFastAdapter.getSharedPreferences(context, str, i, z3);
    }
}
