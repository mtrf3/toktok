package X;

import android.os.Looper;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.NJt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59161NJt {
    public static WebView LIZJ;
    public static C59434NUg LIZLLL;
    public static final C59161NJt LIZ = new C59161NJt();
    public static final AtomicInteger LIZIZ = new AtomicInteger(0);
    public static long LJ = -1;
    public static long LJFF = -1;

    public static void LIZ() {
        LIZIZ.incrementAndGet();
        if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            C10K.LIZIZ(CallableC59160NJs.LJLIL, C10K.LJIIIIZZ, null);
            return;
        }
        LJ = -1L;
        WebView webView = LIZJ;
        if (webView != null) {
            webView.stopLoading();
        }
        C59434NUg c59434NUg = LIZLLL;
        if (c59434NUg == null) {
            return;
        }
        c59434NUg.LIZ = null;
    }
}
