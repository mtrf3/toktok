package X;

import com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig;

/* loaded from: classes12.dex */
public final class PPY {
    public static final NetworkMonitorConfig LIZ = new NetworkMonitorConfig(false, false, false, false, false, false, 63, null);
    public static Long LIZIZ;
    public static NetworkMonitorConfig LIZJ;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r3 - r0) > 60000) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig LIZ() {
        /*
            com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig r0 = X.PPY.LIZJ     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L1b
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3f
            java.lang.Long r0 = X.PPY.LIZIZ     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L11
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L3f
            goto L13
        L11:
            r0 = 0
        L13:
            long r3 = r3 - r0
            r1 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L38
        L1b:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "network_monitor_manager_config"
            java.lang.Class<com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig> r0 = com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig.class
            r2.getClass()     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = com.bytedance.ies.abmock.SettingsManager.LJII(r1, r0)     // Catch: java.lang.Throwable -> L3f
            com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig r0 = (com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig) r0     // Catch: java.lang.Throwable -> L3f
            X.PPY.LIZJ = r0     // Catch: java.lang.Throwable -> L3f
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3f
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L3f
            X.PPY.LIZIZ = r0     // Catch: java.lang.Throwable -> L3f
        L38:
            com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig r0 = X.PPY.LIZJ     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L45
            com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig r0 = X.PPY.LIZ     // Catch: java.lang.Throwable -> L3f
            goto L45
        L3f:
            com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig r0 = X.PPY.LIZJ
            if (r0 != 0) goto L45
            com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig r0 = X.PPY.LIZ
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PPY.LIZ():com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig");
    }
}
