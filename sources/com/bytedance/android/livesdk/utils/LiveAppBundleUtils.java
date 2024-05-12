package com.bytedance.android.livesdk.utils;

import X.C0K2;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C221108m2;
import X.C38442F6w;
import X.C38443F6x;
import X.C38444F6y;
import X.C38445F6z;
import X.C38995FSd;
import X.C5H3;
import X.CN1;
import X.EnumC38440F6u;
import X.F6T;
import X.ORY;
import X.ORZ;
import X.OSZ;
import X.X1D;
import Y.ARunnableS5S0310000_6;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.keva.Keva;
import com.ss.ttlivestreamer.core.utils.LibraryLoader;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes7.dex */
public final class LiveAppBundleUtils {
    public static volatile boolean hasAlreadyInstalled;
    public static final LiveAppBundleUtils INSTANCE = new LiveAppBundleUtils();
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    public static final Keva COVERAGE_KEVA = Keva.getRepo("aab_coverage");
    public static final Keva SO_KEVA = Keva.getRepo("aab_so_load");
    public static final Set<EnumC38440F6u> sLoggedTotalSet = new CopyOnWriteArraySet();
    public static final Set<EnumC38440F6u> sLoggedInstalledSet = new CopyOnWriteArraySet();
    public static final Set<String> sLoggedSOSuccessSet = new CopyOnWriteArraySet();
    public static final Set<String> sLoggedSOFailedSet = new CopyOnWriteArraySet();
    public static final Handler mainHandler = new Handler(C16880lQ.LLJJJJ());
    public static final C5H3 soNamesFilter$delegate = C221108m2.LIZIZ(C38443F6x.LJLIL);
    public static final C38444F6y iCoverageMonitor = new C38444F6y();
    public static final C38445F6z iSOMonitor = new C38445F6z();

    public static final void ensurePluginAvailable(EnumC38440F6u plugin) {
        o.LJIIIZ(plugin, "plugin");
        ensurePluginAvailable$default(plugin, null, false, 6, null);
    }

    public static final void ensurePluginAvailable(EnumC38440F6u plugin, F6T f6t) {
        o.LJIIIZ(plugin, "plugin");
        ensurePluginAvailable$default(plugin, f6t, false, 4, null);
    }

    private final String[] getSoNamesFilter() {
        return (String[]) soNamesFilter$delegate.getValue();
    }

    public static final void initCoreSOLoader() {
        LibraryLoader.setupLibraryLoader(new C38442F6w(), C15380j0.LIZLLL());
    }

    private final void splitInstallIfNeed() {
        if (!hasAlreadyInstalled) {
            synchronized (LiveAppBundleUtils.class) {
                if (!hasAlreadyInstalled && INSTANCE.splitInstall().getFirst().booleanValue()) {
                    hasAlreadyInstalled = true;
                }
            }
        }
    }

    public final OSZ<Boolean, String> splitInstall() {
        Context LLLLL;
        Context LIZLLL = C15380j0.LIZLLL();
        if (LIZLLL == null || (LLLLL = C16880lQ.LLLLL(LIZLLL)) == null) {
            return new OSZ<>(Boolean.FALSE, "appContext is null");
        }
        IHostPlugin iHostPlugin = (IHostPlugin) CN1.LIZ(IHostPlugin.class);
        if (iHostPlugin == null) {
            return new OSZ<>(Boolean.FALSE, "IHostPlugin is null");
        }
        return iHostPlugin.splitCompatInstall(LLLLL);
    }

    private final String generateErrorMsg(String str) {
        if (s.LJJJLZIJ(str, "PathClassLoader", false)) {
            StringBuilder sb = new StringBuilder("Existing Live's df: ");
            EnumC38440F6u[] values = EnumC38440F6u.values();
            ArrayList arrayList = new ArrayList();
            for (EnumC38440F6u enumC38440F6u : values) {
                if (s.LJJJLZIJ(str, enumC38440F6u.getDfModuleName(), false)) {
                    arrayList.add(enumC38440F6u);
                }
            }
            sb.append(ORZ.LLD(arrayList, null, null, null, null, 63));
            return sb.toString();
        }
        return str;
    }

    private final boolean isPluginAndDependsInstalled(EnumC38440F6u enumC38440F6u) {
        for (String str : enumC38440F6u.getDependPlugins()) {
            IHostPlugin iHostPlugin = (IHostPlugin) CN1.LIZ(IHostPlugin.class);
            if (iHostPlugin == null || !iHostPlugin.checkPluginInstalled(str)) {
                return false;
            }
        }
        IHostPlugin iHostPlugin2 = (IHostPlugin) CN1.LIZ(IHostPlugin.class);
        if (iHostPlugin2 == null) {
            return false;
        }
        return iHostPlugin2.checkPluginInstalled(enumC38440F6u.getPackageName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r0 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isPluginAvailable(X.EnumC38440F6u r2) {
        /*
            java.lang.String r0 = "plugin"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            com.bytedance.android.livesdk.utils.LiveAppBundleUtils r1 = com.bytedance.android.livesdk.utils.LiveAppBundleUtils.INSTANCE
            r1.logTotalIfNeed(r2)
            boolean r0 = r2.isSkipAAB()
            if (r0 == 0) goto L15
            r0 = 1
        L11:
            r1.logInstalledIfNeed(r2)
        L14:
            return r0
        L15:
            r1.splitInstallIfNeed()
            boolean r0 = r1.isPluginAndDependsInstalled(r2)
            if (r0 == 0) goto L14
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.LiveAppBundleUtils.isPluginAvailable(X.F6u):boolean");
    }

    private final void logTotalIfNeed(EnumC38440F6u enumC38440F6u) {
        Set<EnumC38440F6u> set = sLoggedTotalSet;
        if (set.contains(enumC38440F6u)) {
            return;
        }
        set.add(enumC38440F6u);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(enumC38440F6u.name());
        LIZ.append("total");
        String LIZIZ = X1D.LIZIZ(LIZ);
        String format = DATE_FORMAT.format(new Date(System.currentTimeMillis()));
        Keva keva = COVERAGE_KEVA;
        if (!format.equals(keva.getString(LIZIZ, format)) || !keva.contains(LIZIZ)) {
            C38444F6y c38444F6y = iCoverageMonitor;
            JSONObject extra = getCoverageBaseExtra("coverage_total", enumC38440F6u);
            c38444F6y.getClass();
            o.LJIIIZ(extra, "extra");
            if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_coverage_monitor", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
                C0K2.LJIIIIZZ("ttlive_client_coverage_monitor", 0, extra);
            }
            keva.storeString(LIZIZ, format);
        }
    }

    public final void logInstalledIfNeed(EnumC38440F6u enumC38440F6u) {
        Set<EnumC38440F6u> set = sLoggedInstalledSet;
        if (set.contains(enumC38440F6u)) {
            return;
        }
        set.add(enumC38440F6u);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(enumC38440F6u.name());
        LIZ.append("installed");
        String LIZIZ = X1D.LIZIZ(LIZ);
        String format = DATE_FORMAT.format(new Date(System.currentTimeMillis()));
        Keva keva = COVERAGE_KEVA;
        if (!format.equals(keva.getString(LIZIZ, format)) || !keva.contains(LIZIZ)) {
            C38444F6y c38444F6y = iCoverageMonitor;
            JSONObject extra = getCoverageBaseExtra("coverage_installed", enumC38440F6u);
            c38444F6y.getClass();
            o.LJIIIZ(extra, "extra");
            if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_coverage_monitor", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
                C0K2.LJIIIIZZ("ttlive_client_coverage_monitor", 0, extra);
            }
            keva.storeString(LIZIZ, format);
        }
    }

    private final JSONObject getCoverageBaseExtra(String str, EnumC38440F6u enumC38440F6u) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", str);
            jSONObject.put("plugin_names", enumC38440F6u.getPackageName());
            jSONObject.put("flag", "3");
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static final void ensurePluginAvailable(EnumC38440F6u plugin, F6T f6t, boolean z) {
        o.LJIIIZ(plugin, "plugin");
        LiveAppBundleUtils liveAppBundleUtils = INSTANCE;
        liveAppBundleUtils.splitInstallIfNeed();
        liveAppBundleUtils.logTotalIfNeed(plugin);
        boolean isPluginAvailable = isPluginAvailable(plugin);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isAvailable: ");
        LIZ.append(isPluginAvailable);
        LIZ.append(' ');
        LIZ.append(plugin);
        C0NB.LJIIIZ("FindCrashLog#LiveAppBundleUtils#ensurePluginAvailable", X1D.LIZIZ(LIZ));
        if (isPluginAvailable) {
            liveAppBundleUtils.logInstalledIfNeed(plugin);
            if (f6t != null) {
                f6t.onSuccess();
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(" onPluginLoadCallback != null ");
            LIZ2.append(plugin);
            C0NB.LJIIIZ("FindCrashLog#LiveAppBundleUtils#ensurePluginAvailable", X1D.LIZIZ(LIZ2));
            return;
        }
        liveAppBundleUtils.startInstallPlugin(plugin, f6t, z);
    }

    private final JSONObject getBaseExtra(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", str2);
            jSONObject.put("so_name", str);
            jSONObject.put("flag", "3");
            jSONObject.put("load_from", str3);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static final boolean loadSOByLoader(String str, String from, boolean z) {
        o.LJIIIZ(from, "from");
        if (str == null) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            if (z) {
                System.loadLibrary(str);
            } else {
                System.load(str);
            }
            INSTANCE.monitorLoadSuccessIfNeed(str, SystemClock.uptimeMillis() - uptimeMillis, from);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(" Load succeed ");
            LIZ.append(from);
            C0NB.LJIIIZ("FindCrashLog#LiveAppBundleUtils#tryLoadAppBundlePlugin", X1D.LIZIZ(LIZ));
            return true;
        } catch (Throwable th) {
            INSTANCE.monitorLoadFailedIfNeed(str, SystemClock.uptimeMillis() - uptimeMillis, th.toString(), from);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(" Load Failed ");
            LIZ2.append(from);
            LIZ2.append(", ");
            LIZ2.append(th);
            C0NB.LJ("FindCrashLog#LiveAppBundleUtils#tryLoadAppBundlePlugin", X1D.LIZIZ(LIZ2));
            return false;
        }
    }

    private final void monitorLoadSuccessIfNeed(String str, long j, String str2) {
        if (!ORY.LJJIJIIJIL(str, getSoNamesFilter())) {
            return;
        }
        Set<String> set = sLoggedSOSuccessSet;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("success");
        String LIZIZ = X1D.LIZIZ(LIZ);
        String format = DATE_FORMAT.format(new Date(System.currentTimeMillis()));
        Keva keva = SO_KEVA;
        if (!format.equals(keva.getString(LIZIZ, format)) || !keva.contains(LIZIZ)) {
            JSONObject extra = getBaseExtra(str, "so_load_success", str2);
            try {
                extra.put("duration", j);
            } catch (JSONException unused) {
            }
            iSOMonitor.getClass();
            o.LJIIIZ(extra, "extra");
            if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_so_monitor", 0.01d)) {
                C0K2.LJIIIIZZ("ttlive_client_so_monitor", 0, extra);
            }
            SO_KEVA.storeString(LIZIZ, format);
        }
    }

    private final void startInstallPlugin(EnumC38440F6u enumC38440F6u, F6T f6t, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("starInstallPlugin ");
        LIZ.append(enumC38440F6u);
        LIZ.append(" callback ");
        LIZ.append(f6t);
        C0NB.LJIIIZ("LiveAppBundleUtils", X1D.LIZIZ(LIZ));
        IHostPlugin iHostPlugin = (IHostPlugin) CN1.LIZ(IHostPlugin.class);
        if (iHostPlugin == null) {
            return;
        }
        C38995FSd.LJFF().submit(new ARunnableS5S0310000_6(iHostPlugin, enumC38440F6u, new WeakReference(f6t), z, 0));
    }

    private final void monitorLoadFailedIfNeed(String str, long j, String str2, String str3) {
        if (!ORY.LJJIJIIJIL(str, getSoNamesFilter())) {
            return;
        }
        Set<String> set = sLoggedSOFailedSet;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("failed");
        String LIZIZ = X1D.LIZIZ(LIZ);
        String format = DATE_FORMAT.format(new Date(System.currentTimeMillis()));
        Keva keva = SO_KEVA;
        if (!format.equals(keva.getString(LIZIZ, format)) || !keva.contains(LIZIZ)) {
            JSONObject extra = getBaseExtra(str, "so_load_failed", str3);
            try {
                extra.put("duration", j);
                extra.put("error_msg", generateErrorMsg(str2));
            } catch (Throwable unused) {
            }
            iSOMonitor.getClass();
            o.LJIIIZ(extra, "extra");
            if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_so_monitor", 0.01d)) {
                C0K2.LJIIIIZZ("ttlive_client_so_monitor", 0, extra);
            }
            SO_KEVA.storeString(LIZIZ, format);
        }
    }

    public static /* synthetic */ void ensurePluginAvailable$default(EnumC38440F6u enumC38440F6u, F6T f6t, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            f6t = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        ensurePluginAvailable(enumC38440F6u, f6t, z);
    }

    public static /* synthetic */ boolean loadSOByLoader$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return loadSOByLoader(str, str2, z);
    }
}
