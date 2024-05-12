package X;

import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.o;

/* renamed from: X.a5S, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92110a5S {
    public final WebChromeClient LIZ;
    public final WebViewClient LIZIZ;
    public final Integer LIZJ;
    public final boolean LIZLLL;

    public C92110a5S() {
        this(null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92110a5S)) {
            return false;
        }
        C92110a5S c92110a5S = (C92110a5S) obj;
        return o.LJ(this.LIZ, c92110a5S.LIZ) && o.LJ(this.LIZIZ, c92110a5S.LIZIZ) && o.LJ(this.LIZJ, c92110a5S.LIZJ) && this.LIZLLL == c92110a5S.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        WebChromeClient webChromeClient = this.LIZ;
        int hashCode = (webChromeClient == null ? 0 : webChromeClient.hashCode()) * 31;
        WebViewClient webViewClient = this.LIZIZ;
        int hashCode2 = (hashCode + (webViewClient == null ? 0 : webViewClient.hashCode())) * 31;
        Integer num = this.LIZJ;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WebConfig(customChromeClient=");
        LIZ.append(this.LIZ);
        LIZ.append(", customClient=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", backgroundColor=");
        LIZ.append(this.LIZJ);
        LIZ.append(", hideLoading=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C92110a5S(WebChromeClient webChromeClient, WebViewClient webViewClient, Integer num, boolean z) {
        this.LIZ = webChromeClient;
        this.LIZIZ = webViewClient;
        this.LIZJ = num;
        this.LIZLLL = z;
    }
}
