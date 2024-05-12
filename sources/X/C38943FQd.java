package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.service.downgrade.DefaultLocalTestImpl;
import java.io.File;

/* renamed from: X.FQd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38943FQd {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        int i = O12.LIZ[O3U.LJFF().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "95bcaef5f85b57bef49180849da0ab20";
            }
            return "365b20e8f6c343df1eff65214a0e3e74";
        }
        return "9f87ed36c915115ff7febd807c9e1a23";
    }

    public static String LIZIZ() {
        boolean z;
        Keva repo;
        LocalTestApi localTestApi = C37090Eh4.LIZ.LIZ;
        if (localTestApi == null) {
            z = true;
        } else {
            z = localTestApi instanceof DefaultLocalTestImpl;
        }
        if (!(!z) || (repo = Keva.getRepo("hybrid_debug_settings")) == null) {
            return "gecko-va.tiktokv.com";
        }
        return repo.getString("gecko_host_spinner", "gecko-va.tiktokv.com");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:18|(7:20|21|4|5|(4:7|(2:10|8)|11|12)|15|12))|3|4|5|(0)|15|12) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        com.ss.android.agilelogger.ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("OFFLINE PREFIX EXCEPTION", r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[Catch: Exception -> 0x0053, TryCatch #2 {Exception -> 0x0053, blocks: (B:5:0x0035, B:7:0x003b, B:8:0x003f, B:10:0x0045), top: B:4:0x0035 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ() {
        /*
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.FJs r1 = X.C38776FJs.LJIIL()
            android.content.Context r0 = X.EF7.LIZIZ()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            android.content.SharedPreferences r3 = r1.LIZLLL(r0)
            if (r3 != 0) goto L17
        L15:
            r1 = 0
            goto L35
        L17:
            java.lang.String r1 = ""
            java.lang.String r0 = "aweme_gecko_offline_host_prefix"
            java.lang.String r1 = r3.getString(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L26
            goto L15
        L26:
            java.util.List r1 = com.ss.android.ugc.aweme.utils.JsonParseUtils.LIZIZ(r4, r1)     // Catch: java.lang.Error -> L2b java.lang.Exception -> L30
            goto L35
        L2b:
            r0 = move-exception
            r0.printStackTrace()
            goto L15
        L30:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L15
        L35:
            boolean r0 = X.C79004UzY.LJJIFFI(r1)     // Catch: java.lang.Exception -> L53
            if (r0 != 0) goto L5d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L53
        L3f:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L78
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> L53
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L53
            java.util.regex.Pattern r0 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)     // Catch: java.lang.Exception -> L53
            r2.add(r0)     // Catch: java.lang.Exception -> L53
            goto L3f
        L53:
            r0 = move-exception
            java.lang.String r1 = "OFFLINE PREFIX EXCEPTION"
            java.lang.String r0 = r0.getMessage()
            com.ss.android.agilelogger.ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(r1, r0)
        L5d:
            java.lang.String r0 = "s16.tiktokcdn.com/tiktok/falcon/"
            java.util.regex.Pattern r0 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
            r2.add(r0)
            java.lang.String r0 = "www.tiktok.com/falcon/"
            java.util.regex.Pattern r0 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
            r2.add(r0)
            java.lang.String r0 = "m.tiktok.com/falcon/"
            java.util.regex.Pattern r0 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
            r2.add(r0)
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38943FQd.LIZJ():java.util.List");
    }

    public static File LIZLLL() {
        File file = new File(C16880lQ.LLIIJLIL(EF7.LIZIZ()), "offlineX");
        C39579Fg7.LJFF(file);
        return file;
    }
}
