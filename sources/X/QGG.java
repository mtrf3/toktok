package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class QGG {
    public static final List<QGM> LIZ = new ArrayList();
    public static final List<InterfaceC61844OOy> LIZIZ = new ArrayList();
    public static boolean LIZJ = false;
    public static boolean LIZLLL = false;
    public static boolean LJ = true;
    public static Context LJFF;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r0.isAvailable() != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(org.json.JSONObject r2, java.lang.String r3, boolean r4) {
        /*
            if (r4 != 0) goto L27
            android.content.Context r1 = X.QGG.LJFF
            if (r1 == 0) goto L1c
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = X.C16880lQ.LLILL(r1, r0)     // Catch: java.lang.Exception -> L41
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L41
            android.net.NetworkInfo r0 = X.C16880lQ.LJJLI(r0)     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L41
            boolean r0 = r0.isAvailable()     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L41
        L1c:
            java.lang.String r1 = "image_monitor_error_v2"
            boolean r0 = X.C64235PIx.LIZ(r1)
            if (r0 == 0) goto L27
            X.C09900aA.LJ(r1, r2)
        L27:
            java.util.List<X.QGM> r0 = X.QGG.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L2f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r1.next()
            X.QGM r0 = (X.QGM) r0
            if (r0 == 0) goto L2f
            r0.LJJLIIIJLLLLLLLZ(r2, r3, r4)
            goto L2f
        L41:
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = com.ss.android.ugc.aweme.live.LiveOuterService.LJJJLL()
            boolean r0 = r0.LJJIJIIJI()
            if (r0 != 0) goto L4c
        L4b:
            return
        L4c:
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = com.ss.android.ugc.aweme.live.LiveOuterService.LJJJLL()     // Catch: java.lang.Throwable -> L58
            X.XvR r0 = r0.LJJIJIL()     // Catch: java.lang.Throwable -> L58
            r0.LJJLIIIJLLLLLLLZ(r2, r3, r4)     // Catch: java.lang.Throwable -> L58
            goto L4b
        L58:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QGG.LIZ(org.json.JSONObject, java.lang.String, boolean):void");
    }
}
