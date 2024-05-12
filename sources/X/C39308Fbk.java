package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* renamed from: X.Fbk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39308Fbk implements InterfaceC39320Fbw {
    public final String LIZ = "RESULT";
    public final String LIZIZ = "REASON";
    public final String LIZJ = "MAPS_ID";
    public final String LIZLLL = "APP_TRACKING_ID";
    public final String LJ = "INSTALLED_TIME_TEXT";
    public final String LJFF = "ACTIVATED_TIME_TEXT";
    public final String LJI = "COUNTRY";
    public final String LJII = "DEVICE_NAME";
    public final String LJIIIIZZ = "FIRST_QUERY";
    public final Context LJIIIZ;
    public final String[] LJIIJ;

    public static Cursor LIZJ(ContentResolver contentResolver, android.net.Uri uri, String str, String[] strArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, null, str, strArr, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-8413642970619764672"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, null, str, strArr, null);
    }

    @Override // X.InterfaceC39320Fbw
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC39320Fbw
    public final C39316Fbs LIZ(C39316Fbs preInstallResult) {
        String[] strArr;
        Object obj = "";
        o.LJIIIZ(preInstallResult, "preInstallResult");
        C39310Fbm c39310Fbm = preInstallResult.LIZ;
        C39314Fbq c39314Fbq = preInstallResult.LIZLLL;
        try {
            strArr = this.LJIIJ;
        } catch (Exception unused) {
        }
        if (strArr != null && LIZLLL(this.LJIIIZ, c39310Fbm, c39314Fbq, strArr)) {
            c39310Fbm.LJLLILLLL = 6;
            preInstallResult.LJ = true;
            return preInstallResult;
        }
        Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ro.channelId.");
        Context LLLLL = C16880lQ.LLLLL(this.LJIIIZ);
        o.LJIIIIZZ(LLLLL, "context.applicationContext");
        LIZ.append(LLLLL.getPackageName());
        Object invoke = method.invoke(null, X1D.LIZIZ(LIZ), "");
        if (invoke != null) {
            obj = invoke;
        }
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            c39310Fbm.LJLLILLLL = 5;
            c39310Fbm.LJLIL = str;
            c39310Fbm.LJLLI = false;
            preInstallResult.LJ = true;
        }
        return preInstallResult;
    }

    public C39308Fbk(Context context, String[] strArr) {
        this.LJIIIZ = context;
        this.LJIIJ = strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0135, code lost:
    
        if (r3 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        if (r6 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(android.content.Context r10, X.C39310Fbm r11, X.C39314Fbq r12, java.lang.String[] r13) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39308Fbk.LIZLLL(android.content.Context, X.Fbm, X.Fbq, java.lang.String[]):boolean");
    }
}
