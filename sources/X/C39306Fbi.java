package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import kotlin.jvm.internal.o;

/* renamed from: X.Fbi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39306Fbi implements InterfaceC39320Fbw {
    public final Context LIZ;

    public static Cursor LIZJ(ContentResolver contentResolver, android.net.Uri uri) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, null, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-435829630570320254"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, null, null, null, null);
    }

    @Override // X.InterfaceC39320Fbw
    public final boolean LIZIZ() {
        return false;
    }

    public C39306Fbi(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        if (r6 != null) goto L39;
     */
    @Override // X.InterfaceC39320Fbw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C39316Fbs LIZ(X.C39316Fbs r11) {
        /*
            r10 = this;
            java.lang.String r0 = "preInstallResult"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "content://"
            r1.append(r0)
            android.content.Context r0 = r10.LIZ
            java.lang.String r0 = r0.getPackageName()
            r1.append(r0)
            java.lang.String r0 = ".identifierprovider/preload_info"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            r6 = 0
            android.content.Context r0 = r10.LIZ     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            android.database.Cursor r6 = LIZJ(r0, r1)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            if (r6 != 0) goto L32
            return r11
        L32:
            r6.moveToFirst()     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            java.lang.String r0 = "preinstall_version"
            int r7 = r6.getColumnIndex(r0)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            java.lang.String r0 = "preinstall_channel"
            int r9 = r6.getColumnIndex(r0)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            java.lang.String r0 = "preinstall_campaign"
            int r8 = r6.getColumnIndex(r0)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            java.lang.String r0 = "first_install_time"
            int r0 = r6.getColumnIndex(r0)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            if (r0 < 0) goto L5d
            long r2 = r6.getLong(r0)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
        L53:
            long r0 = X.FLO.LIZIZ()     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            long r0 = r0 - r2
            long r3 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            goto L60
        L5d:
            r2 = 0
            goto L53
        L60:
            r1 = 1800000(0x1b7740, double:8.89318E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6b
            r6.close()
            return r11
        L6b:
            java.lang.String r5 = ""
            if (r9 < 0) goto L74
            java.lang.String r4 = r6.getString(r9)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            goto L75
        L74:
            r4 = r5
        L75:
            if (r8 < 0) goto L7c
            java.lang.String r3 = r6.getString(r8)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            goto L7d
        L7c:
            r3 = r5
        L7d:
            r2 = 1
            if (r4 == 0) goto Lb2
            int r0 = r4.length()     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            if (r0 != 0) goto L87
            goto Lb2
        L87:
            X.Fbm r1 = r11.LIZ     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            r0 = 9
            r1.LJLLILLLL = r0     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            java.lang.String r0 = "preinstallChannel"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            r1.LJLIL = r4     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            X.Fbm r1 = r11.LIZ     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            java.lang.String r0 = "preinstallCampaign"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            r1.getClass()     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            r1.LJLILLLLZI = r3     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            r11.LJ = r2     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            if (r7 < 0) goto Laa
            java.lang.String r5 = r6.getString(r7)     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            if (r5 == 0) goto Lbf
        Laa:
            X.Fbm r0 = r11.LIZ     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            r0.getClass()     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            r0.LJLJJI = r5     // Catch: java.lang.Throwable -> Lb6 java.lang.Exception -> Lbd
            goto Lbf
        Lb2:
            r6.close()
            return r11
        Lb6:
            r0 = move-exception
            if (r6 == 0) goto Lbc
            r6.close()
        Lbc:
            throw r0
        Lbd:
            if (r6 == 0) goto Lc2
        Lbf:
            r6.close()
        Lc2:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39306Fbi.LIZ(X.Fbs):X.Fbs");
    }
}
