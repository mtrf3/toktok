package X;

import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* renamed from: X.Si0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72820Si0 {
    public final String LIZ;
    public final long LIZIZ;
    public final InterfaceC40311Frv LIZJ;
    public final WebView LIZLLL;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C72820Si0)) {
            return false;
        }
        C72820Si0 c72820Si0 = (C72820Si0) obj;
        if (o.LJ(this.LIZ, c72820Si0.LIZ) && this.LIZ.length() > 0) {
            return true;
        }
        if (!o.LJ(this.LIZ, c72820Si0.LIZ) || !o.LJ(this.LIZLLL, c72820Si0.LIZLLL) || this.LIZLLL == null) {
            return false;
        }
        return true;
    }

    public C72820Si0(String str, long j, InterfaceC40311Frv interfaceC40311Frv, WebView webView) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = interfaceC40311Frv;
        this.LIZLLL = webView;
    }
}
