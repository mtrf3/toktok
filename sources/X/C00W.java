package X;

import android.content.Context;
import java.net.URLConnection;

/* renamed from: X.00W, reason: invalid class name */
/* loaded from: classes.dex */
public final class C00W {
    public final String LIZ;
    public final C00V LIZIZ;

    public static URLConnection LIZ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-1897939483294127499"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0GQ LIZIZ() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00W.LIZIZ():X.0GQ");
    }

    public C00W(Context context, String str) {
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LIZ = str;
        this.LIZIZ = new C00V(LLLLL, str);
    }
}
