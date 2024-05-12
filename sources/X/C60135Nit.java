package X;

import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;

/* renamed from: X.Nit, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60135Nit extends C60413NnN {
    @Override // X.AbstractC60423NnX
    public final void LIZ(WebView webView, String str, boolean z) {
        C60737Nsb hybridContext;
        InterfaceC60844NuK interfaceC60844NuK;
        C60737Nsb hybridContext2;
        InterfaceC60844NuK interfaceC60844NuK2;
        C60792NtU.LIZ.getClass();
        if (C60792NtU.LIZ(webView) > 1) {
            if ((webView instanceof WebKitView) && webView != null && (hybridContext2 = ((WebKitView) webView).getHybridContext()) != null && (interfaceC60844NuK2 = (InterfaceC60844NuK) hybridContext2.LIZIZ(InterfaceC60844NuK.class)) != null) {
                interfaceC60844NuK2.LJJJ(true);
                return;
            }
            return;
        }
        if (!(webView instanceof WebKitView) || webView == null || (hybridContext = ((WebKitView) webView).getHybridContext()) == null || (interfaceC60844NuK = (InterfaceC60844NuK) hybridContext.LIZIZ(InterfaceC60844NuK.class)) == null) {
            return;
        }
        interfaceC60844NuK.LJJJ(false);
    }
}
