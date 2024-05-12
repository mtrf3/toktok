package X;

import android.content.Context;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;

/* renamed from: X.Q6h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66455Q6h {
    public static volatile C66455Q6h LIZIZ;
    public static FQ7 LIZJ;
    public final C66454Q6g LIZ;

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:14|15)|(4:17|18|19|20)|24|18|19|20) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ() {
        /*
            r5 = this;
            X.Q6g r1 = r5.LIZ
            java.lang.String r4 = ""
            r1.getClass()
            boolean r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "ws_apps"
            if (r0 == 0) goto L15
            android.content.SharedPreferences r0 = r1.LIZJ     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = r0.getString(r3, r4)     // Catch: java.lang.Throwable -> L3b
            goto L3b
        L15:
            android.content.Context r0 = r1.LIZ     // Catch: java.lang.Throwable -> L3b
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L3b
            android.content.Context r1 = r1.LIZ     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = "string"
            android.net.Uri r0 = com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.LIZ(r1, r3, r0)     // Catch: java.lang.Throwable -> L3b
            android.database.Cursor r1 = X.C66454Q6g.LIZ(r2, r0)     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L2a
            goto L3b
        L2a:
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L36
            r0 = 0
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L36
            goto L37
        L36:
            r0 = r4
        L37:
            r1.close()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L3b
        L3a:
            r4 = r0
        L3b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66455Q6h.LIZ():java.lang.String");
    }

    public final boolean LIZJ() {
        return this.LIZ.LIZIZ("frontier_enabled", true);
    }

    public C66455Q6h(Context context) {
        C66454Q6g c66454Q6g;
        Context LLLLL = C16880lQ.LLLLL(context);
        synchronized (WsChannelMultiProcessSharedProvider.class) {
            if (WsChannelMultiProcessSharedProvider.LJLJLLL == null) {
                WsChannelMultiProcessSharedProvider.LJLJLLL = new C66454Q6g(LLLLL);
            }
            c66454Q6g = WsChannelMultiProcessSharedProvider.LJLJLLL;
        }
        this.LIZ = c66454Q6g;
    }

    public static C66455Q6h LIZIZ(Context context) {
        if (LIZIZ == null) {
            synchronized (C66455Q6h.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C66455Q6h(context);
                }
            }
        }
        return LIZIZ;
    }
}
