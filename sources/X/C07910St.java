package X;

import android.os.Looper;
import android.webkit.TracingConfig;
import android.webkit.TracingController;
import android.webkit.WebView;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* renamed from: X.0St, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07910St {
    public static TracingController LIZ() {
        return TracingController.getInstance();
    }

    public static ClassLoader LIZIZ() {
        return WebView.getWebViewClassLoader();
    }

    public static Looper LIZJ(WebView webView) {
        return webView.getWebViewLooper();
    }

    public static boolean LIZLLL(TracingController tracingController) {
        return tracingController.isTracing();
    }

    public static void LJ(String str) {
        WebView.setDataDirectorySuffix(str);
    }

    public static void LJFF(TracingController tracingController, C07430Qx c07430Qx) {
        new TracingConfig.Builder();
        throw null;
    }

    public static boolean LJI(TracingController tracingController, OutputStream outputStream, Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
