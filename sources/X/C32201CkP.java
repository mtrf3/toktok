package X;

import android.content.ContentResolver;
import android.database.Cursor;

/* renamed from: X.CkP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32201CkP {
    public static Cursor LIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr, String str, String[] strArr2) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, str, strArr2, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "6264279547548405458"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, str, strArr2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(android.content.Context r4, android.net.Uri r5, java.lang.String r6, java.lang.String[] r7) {
        /*
            java.lang.String r3 = "_data"
            java.lang.String[] r1 = new java.lang.String[]{r3}
            r2 = 0
            android.content.ContentResolver r0 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L30
            android.database.Cursor r1 = LIZ(r0, r5, r1, r6, r7)     // Catch: java.lang.Throwable -> L29 java.lang.IllegalArgumentException -> L30
            if (r1 == 0) goto L26
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L23 java.lang.IllegalArgumentException -> L31
            if (r0 == 0) goto L26
            int r0 = r1.getColumnIndexOrThrow(r3)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalArgumentException -> L31
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalArgumentException -> L31
            r1.close()
            return r0
        L23:
            r0 = move-exception
            r2 = r1
            goto L2a
        L26:
            if (r1 == 0) goto L36
            goto L33
        L29:
            r0 = move-exception
        L2a:
            if (r2 == 0) goto L2f
            r2.close()
        L2f:
            throw r0
        L30:
            r1 = r2
        L31:
            if (r1 == 0) goto L36
        L33:
            r1.close()
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32201CkP.LIZIZ(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
