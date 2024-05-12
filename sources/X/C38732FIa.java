package X;

import Y.ARunnableS9S0101000_5;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.bytedance.keva.KevaBuilder;
import com.ss.android.ugc.bytex.pthread.base.convergence.helper.NewThreadPoolHelper;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.FIa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38732FIa {
    public static final String LIZ = UUID.randomUUID().toString();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static void LIZ(Context context) {
        boolean readBoolean;
        boolean z;
        C56672Kh.LIZ().LIZLLL("application_init_keva_duration");
        C56672Kh.LIZ().LIZLLL("application_init_keva_part1");
        C56672Kh.LIZ().LIZLLL("init_keva_obtain");
        o.LJIIIZ(context, "context");
        if (C35820E4a.LIZIZ(context, "optimize_kevaio", false)) {
            readBoolean = C35820E4a.LIZIZ(context, "keva_bak_sp", false);
        } else {
            C56672Kh.LIZ().LIZLLL("kevabaksp_obtain_getfile");
            if (C38733FIb.LIZ(context).exists()) {
                C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "kevabaksp_obtain_getfile");
                try {
                    C56672Kh.LIZ().LIZLLL("kevabaksp_obtain_read");
                    DataInputStream dataInputStream = new DataInputStream(new FileInputStream(C38733FIb.LIZ));
                    readBoolean = dataInputStream.readBoolean();
                    try {
                        C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "kevabaksp_obtain_read");
                        C56672Kh.LIZ().LIZLLL("kevabaksp_obtain_close");
                        dataInputStream.close();
                        C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "kevabaksp_obtain_close");
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
            }
            readBoolean = false;
        }
        FAK LIZ2 = C56672Kh.LIZ();
        LIZ2.getClass();
        LIZ2.LJFF(SystemClock.uptimeMillis(), "init_keva_obtain");
        C56672Kh.LIZ().LIZLLL("init_keva_hook");
        SharedPreferences sharedPreferences = context.getSharedPreferences("keva_switch_repo", 0);
        F9J.LIZ = sharedPreferences.getBoolean("keva_switch", true);
        HashSet<String> hashSet = F9J.LIZLLL;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(context.getPackageName());
        LIZ3.append("_preferences");
        hashSet.addAll(Arrays.asList("default_config", "awesome_splash", "splash_ad_sp", "ttnetCookieStore", "key_language_sp_key", "ttnet_store_region", "applog_stats", "aweme-app", "av_settings", "av_settings.xml", "ab_test_config", "aweme_user", "com.ss.spip_setting", "SP_EXPERIMENT_CACHE", "SP_CLIENT_EXPOSURE_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE", "CLIENT_EXPERIMENT_CACHE_TAG", X1D.LIZIZ(LIZ3), "rhea.sp", "ttlive_tabs_cache", "ttlive_sdk_shared_pref_cache", "live_sdk_core", "WebViewChromiumPrefs", "KevaOptNewUser", "tablet_cache", "_debug_fragment_sp_switch_channel", "debug_config_mock", "tpc_sp", "prev_data_sp", "backup_count_sp"));
        hashSet.addAll(sharedPreferences.getStringSet("keva_blacklist", Collections.emptySet()));
        java.util.Set<String> stringSet = sharedPreferences.getStringSet("keva_migrate", Collections.emptySet());
        hashSet.removeAll(stringSet);
        F9J.LJ.addAll(stringSet);
        F9J.LJFF.addAll(Arrays.asList(F9J.LJI));
        if (F9J.LIZ) {
            F9J.LIZJ = new Random().nextInt(8);
        }
        F9J.LIZIZ = readBoolean;
        FAK LIZ4 = C56672Kh.LIZ();
        LIZ4.getClass();
        LIZ4.LJFF(SystemClock.uptimeMillis(), "init_keva_hook");
        FAK LIZ5 = C56672Kh.LIZ();
        LIZ5.getClass();
        LIZ5.LJFF(SystemClock.uptimeMillis(), "application_init_keva_part1");
        C56672Kh.LIZ().LIZLLL("application_init_keva_part2");
        KevaBuilder kevaBuilder = KevaBuilder.getInstance();
        FAK LIZ6 = C56672Kh.LIZ();
        LIZ6.getClass();
        LIZ6.LJFF(SystemClock.uptimeMillis(), "application_init_keva_part2");
        C56672Kh.LIZ().LIZLLL("application_init_keva_part3");
        kevaBuilder.setContext(context);
        kevaBuilder.setMonitor(new C38734FIc());
        kevaBuilder.setPortedRepoName("aweme_ported_sp_repo");
        FAK LIZ7 = C56672Kh.LIZ();
        LIZ7.getClass();
        LIZ7.LJFF(SystemClock.uptimeMillis(), "application_init_keva_part3");
        C56672Kh.LIZ().LIZLLL("application_init_keva_part4");
        System.currentTimeMillis();
        if (FLR.LIZIZ(1) && FLR.LIZIZ(8)) {
            int max = Math.max(Runtime.getRuntime().availableProcessors() * 2, 6);
            ThreadPoolExecutor newThreadPool = NewThreadPoolHelper.INSTANCE.newThreadPool(max, max, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
            newThreadPool.allowCoreThreadTimeOut(true);
            kevaBuilder.setExecutor(newThreadPool);
        } else if (C35820E4a.LIZIZ(context, "optimize_keavexecute", false)) {
            kevaBuilder.setExecutor(new FSA((ThreadPoolExecutor) C38995FSd.LIZLLL()));
        } else {
            kevaBuilder.setExecutor(C38995FSd.LIZLLL());
        }
        FAK LIZ8 = C56672Kh.LIZ();
        LIZ8.getClass();
        LIZ8.LJFF(SystemClock.uptimeMillis(), "application_init_keva_part4");
        C56672Kh.LIZ().LIZLLL("application_init_keva_part5");
        kevaBuilder.setEnableExecutorOpt(C35820E4a.LIZIZ(context, "optimize_kevafeaturetask", false));
        kevaBuilder.setExecuteType(C35820E4a.LIZ(context, -1, "optimize_kevaexectuetype"));
        kevaBuilder.setEnableLockOpt(C35820E4a.LIZIZ(context, "optimize_kevaasynchronize", false));
        Boolean bool = C78688UuS.LJLJJI;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            try {
                Boolean valueOf = Boolean.valueOf(new File(C16880lQ.LLIIJLIL(context) + "/is_keva_load_opt_enabled_v3.cfg").exists());
                C78688UuS.LJLJJI = valueOf;
                z = valueOf.booleanValue();
            } catch (Throwable unused3) {
                z = false;
            }
        }
        kevaBuilder.setEnableLoadOpt(z);
        kevaBuilder.setEnableArrayMap(C35820E4a.LIZIZ(context, "keva_enable_arraymap", false));
        FAK LIZ9 = C56672Kh.LIZ();
        LIZ9.getClass();
        LIZ9.LJFF(SystemClock.uptimeMillis(), "application_init_keva_part5");
        FAK LIZ10 = C56672Kh.LIZ();
        LIZ10.getClass();
        LIZ10.LJFF(SystemClock.uptimeMillis(), "application_init_keva_duration");
        KevaBuilder.getInstance().setIsLoadFromNative(FKE.LIZ);
        C56672Kh.LIZ().LIZLLL("application_init_keva_coldboot");
        if (C35820E4a.LIZIZ(context, "optimize_initkeva_v2", false)) {
            C38995FSd.LIZLLL().execute(new ARunnableS9S0101000_5(5, context, 12));
        }
        FAK LIZ11 = C56672Kh.LIZ();
        LIZ11.getClass();
        LIZ11.LJFF(SystemClock.uptimeMillis(), "application_init_keva_coldboot");
        LIZIZ.set(true);
    }
}
