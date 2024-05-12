package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.bytedance.common.utility.Logger;

/* renamed from: X.QMk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66874QMk {
    public final Context LIZ;
    public final boolean LIZIZ;
    public final SharedPreferences LIZJ;

    public static Cursor LIZ(ContentResolver contentResolver, android.net.Uri uri) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, null, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "6249587985418038114"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, null, null, null, null);
    }

    public final C66873QMj LIZIZ() {
        return new C66873QMj(this.LIZ);
    }

    public C66874QMk(Context context) {
        this.LIZIZ = C36929EeT.LJFF(context);
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LIZ = LLLLL;
        this.LIZJ = F9J.LIZIZ(C16880lQ.LLLLL(LLLLL), 4, "push_multi_process_config");
        Logger.debug();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:12|13)|(5:15|16|17|18|19)|23|16|17|18|19) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJ(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            boolean r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto Ld
            android.content.SharedPreferences r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = r0.getString(r5, r3)     // Catch: java.lang.Throwable -> L33
            return r0
        Ld:
            android.content.Context r0 = r4.LIZ     // Catch: java.lang.Throwable -> L33
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L33
            android.content.Context r1 = r4.LIZ     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = "string"
            android.net.Uri r0 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.LIZIZ(r1, r5, r0)     // Catch: java.lang.Throwable -> L33
            android.database.Cursor r1 = LIZ(r2, r0)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L22
            goto L33
        L22:
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L2e
            r0 = 0
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L2e
            goto L2f
        L2e:
            r0 = r3
        L2f:
            r1.close()     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L33
        L32:
            r3 = r0
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66874QMk.LJ(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:11|12)|(6:14|(1:16)|17|18|19|20)|24|17|18|19|20) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(java.lang.String r4, boolean r5) {
        /*
            r3 = this;
            boolean r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto Lb
            android.content.SharedPreferences r0 = r3.LIZJ     // Catch: java.lang.Throwable -> L34
            boolean r0 = r0.getBoolean(r4, r5)     // Catch: java.lang.Throwable -> L34
            return r0
        Lb:
            android.content.Context r0 = r3.LIZ     // Catch: java.lang.Throwable -> L34
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L34
            android.content.Context r1 = r3.LIZ     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "boolean"
            android.net.Uri r0 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.LIZIZ(r1, r4, r0)     // Catch: java.lang.Throwable -> L34
            android.database.Cursor r2 = LIZ(r2, r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L20
            goto L34
        L20:
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L2f
            r1 = 0
            int r0 = r2.getInt(r1)     // Catch: java.lang.Throwable -> L2f
            if (r0 <= 0) goto L30
            r1 = 1
            goto L30
        L2f:
            r1 = r5
        L30:
            r2.close()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L34
        L33:
            r5 = r1
        L34:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66874QMk.LIZJ(java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:11|12)|(5:14|15|16|17|18)|22|15|16|17|18) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZLLL(java.lang.String r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto Lb
            android.content.SharedPreferences r0 = r3.LIZJ     // Catch: java.lang.Throwable -> L31
            int r0 = r0.getInt(r4, r5)     // Catch: java.lang.Throwable -> L31
            return r0
        Lb:
            android.content.Context r0 = r3.LIZ     // Catch: java.lang.Throwable -> L31
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L31
            android.content.Context r1 = r3.LIZ     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "integer"
            android.net.Uri r0 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.LIZIZ(r1, r4, r0)     // Catch: java.lang.Throwable -> L31
            android.database.Cursor r1 = LIZ(r2, r0)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L20
            goto L31
        L20:
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2c
            r0 = 0
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L2c
            goto L2d
        L2c:
            r0 = r5
        L2d:
            r1.close()     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L31
        L30:
            r5 = r0
        L31:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66874QMk.LIZLLL(java.lang.String, int):int");
    }
}
