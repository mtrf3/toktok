package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import com.bytedance.common.utility.Logger;

/* loaded from: classes7.dex */
public class FK5 {
    public final Context LIZ;

    public static Cursor LIZ(ContentResolver contentResolver, android.net.Uri uri) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, null, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "8581033607118280278"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, null, null, null, null);
    }

    public FK5(Context context) {
        this.LIZ = C16880lQ.LLLLL(context);
        Logger.debug();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:8|9|(5:11|13|14|15|16)|19|13|14|15|16) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            android.content.Context r0 = r4.LIZ     // Catch: java.lang.Throwable -> L28
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L28
            android.content.Context r1 = r4.LIZ     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = "string"
            android.net.Uri r0 = com.ss.android.common.util.MultiProcessSharedProvider.LIZ(r1, r5, r0)     // Catch: java.lang.Throwable -> L28
            android.database.Cursor r1 = LIZ(r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L17
            goto L28
        L17:
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L23
            r0 = 0
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r0 = r3
        L24:
            r1.close()     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L28
        L27:
            r3 = r0
        L28:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FK5.LIZIZ(java.lang.String):java.lang.String");
    }
}
