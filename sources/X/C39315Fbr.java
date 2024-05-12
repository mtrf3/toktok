package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import java.net.URLDecoder;
import kotlin.jvm.internal.o;

/* renamed from: X.Fbr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39315Fbr implements InterfaceC39320Fbw {
    public final String LIZ = "content://com.huawei.appmarket.commondata/item/5";
    public final int LIZIZ = 1;
    public final int LIZJ = 2;
    public final int LIZLLL = 3;
    public final int LJ = 4;
    public final int LJFF = 5;
    public final Context LJI;

    public static Cursor LIZJ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, null, null, strArr, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-5408337169554699191"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, null, null, strArr, null);
    }

    @Override // X.InterfaceC39320Fbw
    public final boolean LIZIZ() {
        return true;
    }

    public C39315Fbr(Context context) {
        this.LJI = context;
    }

    public static void LIZLLL(C39316Fbs c39316Fbs) {
        C39317Fbt c39317Fbt = c39316Fbs.LJFF;
        java.util.Map<String, String> map = c39316Fbs.LIZLLL.LJLJJLL;
        String str = c39317Fbt.LJLIL;
        try {
            String decode = URLDecoder.decode(str, "UTF-8");
            o.LJIIIIZZ(decode, "URLDecoder.decode(referrer, \"UTF-8\")");
            str = decode;
        } catch (Exception unused) {
        }
        String str2 = c39317Fbt.LJLJJLL;
        try {
            String decode2 = URLDecoder.decode(str2, "UTF-8");
            o.LJIIIIZZ(decode2, "URLDecoder.decode(referrer, \"UTF-8\")");
            str2 = decode2;
        } catch (Exception unused2) {
        }
        map.put("referrer", str);
        map.put("click_ts", String.valueOf(c39317Fbt.LJLILLLLZI));
        map.put("install_end_ts", String.valueOf(c39317Fbt.LJLJI));
        map.put("install_begin_ts", String.valueOf(c39317Fbt.LJLJJI));
        map.put("track_id", c39317Fbt.LJLJJL);
        map.put("referrer_ex", str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        if (r2 != null) goto L21;
     */
    @Override // X.InterfaceC39320Fbw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C39316Fbs LIZ(X.C39316Fbs r6) {
        /*
            r5 = this;
            java.lang.String r0 = "preInstallResult"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            android.content.Context r0 = r5.LJI
            android.content.ContentResolver r4 = r0.getContentResolver()
            java.lang.String r0 = "context.contentResolver"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            android.content.Context r0 = r5.LJI
            java.lang.String r0 = r0.getPackageName()
            r1 = 0
            r3[r1] = r0
            r2 = 0
            java.lang.String r0 = r5.LIZ     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            android.database.Cursor r2 = LIZJ(r4, r0, r3)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            if (r2 != 0) goto L2a
            return r6
        L2a:
            r2.moveToFirst()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            X.Fbt r3 = r6.LJFF     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            java.lang.String r0 = r2.getString(r1)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            if (r0 == 0) goto L7e
        L35:
            r3.getClass()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            r3.LJLIL = r0     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            int r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            long r0 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            r3.LJLILLLLZI = r0     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            int r0 = r5.LIZJ     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            long r0 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            r3.LJLJI = r0     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            int r1 = r2.getColumnCount()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            int r0 = r5.LIZLLL     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            if (r1 <= r0) goto L7a
            long r0 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            r3.LJLJJI = r0     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            int r0 = r5.LJ     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            if (r0 == 0) goto L6d
            int r0 = r5.LJ     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            java.lang.String r1 = r2.getString(r0)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            java.lang.String r0 = "cursor.getString(trackIdIndex)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            r3.LJLJJL = r1     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
        L6d:
            int r0 = r5.LJFF     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            java.lang.String r1 = r2.getString(r0)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            java.lang.String r0 = "cursor.getString(referrerExIndex)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            r3.LJLJJLL = r1     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
        L7a:
            LIZLLL(r6)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L88
            goto L8a
        L7e:
            java.lang.String r0 = ""
            goto L35
        L81:
            r0 = move-exception
            if (r2 == 0) goto L87
            r2.close()
        L87:
            throw r0
        L88:
            if (r2 == 0) goto L8d
        L8a:
            r2.close()
        L8d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39315Fbr.LIZ(X.Fbs):X.Fbs");
    }
}
