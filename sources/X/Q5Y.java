package X;

import android.os.Bundle;
import com.facebook.login.LoginClient;
import com.facebook.login.WebViewLoginMethodHandler;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q5Y implements InterfaceC66401Q4f {
    public final /* synthetic */ WebViewLoginMethodHandler LIZ;
    public final /* synthetic */ LoginClient.Request LIZIZ;

    public Q5Y(WebViewLoginMethodHandler webViewLoginMethodHandler, LoginClient.Request request) {
        this.LIZ = webViewLoginMethodHandler;
        this.LIZIZ = request;
    }

    @Override // X.InterfaceC66401Q4f
    public final void LIZ(Bundle bundle, Q4W q4w) {
        WebViewLoginMethodHandler webViewLoginMethodHandler = this.LIZ;
        LoginClient.Request request = this.LIZIZ;
        webViewLoginMethodHandler.getClass();
        o.LJIIIZ(request, "request");
        webViewLoginMethodHandler.LJIILL(request, bundle, q4w);
    }
}
