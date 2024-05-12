package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* renamed from: X.NtI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60780NtI extends AbstractC60423NnX {
    public final /* synthetic */ C60783NtL LJLIL;

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr getExtension() {
        return this.LJLIL;
    }

    public C60780NtI(C60783NtL c60783NtL) {
        this.LJLIL = c60783NtL;
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIJJLI(WebView webView, WebResourceRequest webResourceRequest) {
        boolean z;
        C60775NtD c60775NtD = this.LJLIL.LJLJLJ;
        if (!c60775NtD.LJLJLLL && !c60775NtD.LJLL) {
            z = true;
        } else {
            z = false;
        }
        c60775NtD.LJLL = true;
        try {
            boolean LJIJJLI = super.LJIJJLI(webView, webResourceRequest);
            if (z) {
                if (!LJIJJLI) {
                    C60775NtD c60775NtD2 = this.LJLIL.LJLJLJ;
                    String uri = webResourceRequest.getUrl().toString();
                    C37735ErT c37735ErT = c60775NtD2.LJLLILLLL;
                    if (c37735ErT != null) {
                        c37735ErT.LIZ(1, uri);
                    }
                }
                this.LJLIL.LJLJLJ.getClass();
            }
            return LJIJJLI;
        } finally {
            this.LJLIL.LJLJLJ.LJLL = false;
        }
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIL(WebView webView, String str) {
        boolean z;
        C37735ErT c37735ErT;
        C60775NtD c60775NtD = this.LJLIL.LJLJLJ;
        if (!c60775NtD.LJLJLLL && !c60775NtD.LJLL) {
            z = true;
        } else {
            z = false;
        }
        c60775NtD.LJLJLLL = true;
        try {
            boolean LJIL = super.LJIL(webView, str);
            if (z) {
                if (!LJIL && (c37735ErT = this.LJLIL.LJLJLJ.LJLLILLLL) != null) {
                    c37735ErT.LIZ(1, str);
                }
                this.LJLIL.LJLJLJ.getClass();
            }
            return LJIL;
        } finally {
            this.LJLIL.LJLJLJ.LJLJLLL = false;
        }
    }

    @Override // X.AbstractC60423NnX
    public final void LIZ(WebView webView, String str, boolean z) {
        C37735ErT c37735ErT = this.LJLIL.LJLJLJ.LJLLILLLL;
        if (c37735ErT != null) {
            c37735ErT.LIZ(1, str);
        }
        this.LJLIL.LJLJLJ.getClass();
        super.LIZ(webView, str, z);
    }
}
