package X;

import android.content.Context;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;

/* renamed from: X.QMl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66875QMl {
    public static volatile C66875QMl LIZIZ;
    public final C66874QMk LIZ;

    /* JADX WARN: Can't wrap try/catch for region: R(7:14|15|(4:17|19|20|21)|24|19|20|21) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZIZ() {
        /*
            r6 = this;
            X.QMk r1 = r6.LIZ
            r1.getClass()
            r2 = 0
            boolean r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = "red_badge_last_request_time"
            if (r0 == 0) goto L14
            android.content.SharedPreferences r0 = r1.LIZJ     // Catch: java.lang.Throwable -> L3b
            long r2 = r0.getLong(r5, r2)     // Catch: java.lang.Throwable -> L3b
            goto L3b
        L14:
            android.content.Context r0 = r1.LIZ     // Catch: java.lang.Throwable -> L3b
            android.content.ContentResolver r4 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L3b
            android.content.Context r1 = r1.LIZ     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = "long"
            android.net.Uri r0 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.LIZIZ(r1, r5, r0)     // Catch: java.lang.Throwable -> L3b
            android.database.Cursor r4 = X.C66874QMk.LIZ(r4, r0)     // Catch: java.lang.Throwable -> L3b
            if (r4 != 0) goto L29
            goto L3b
        L29:
            boolean r0 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L35
            r0 = 0
            long r0 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r0 = 0
        L37:
            r4.close()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L3b
        L3a:
            r2 = r0
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66875QMl.LIZIZ():long");
    }

    public C66875QMl(Context context) {
        this.LIZ = PushMultiProcessSharedProvider.LIZLLL(C16880lQ.LLLLL(context));
    }

    public static synchronized C66875QMl LIZ(Context context) {
        C66875QMl c66875QMl;
        synchronized (C66875QMl.class) {
            if (LIZIZ == null) {
                LIZIZ = new C66875QMl(context);
            }
            c66875QMl = LIZIZ;
        }
        return c66875QMl;
    }

    public final void LIZJ(long j) {
        C66873QMj LIZIZ2 = this.LIZ.LIZIZ();
        LIZIZ2.LIZIZ.put("red_badge_last_request_time", Long.valueOf(j));
        LIZIZ2.LIZ();
    }
}
