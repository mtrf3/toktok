package X;

import android.webkit.WebSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.NnG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60406NnG implements InterfaceC60244Nke {
    @Override // X.InterfaceC60244Nke
    public java.util.Map<String, Object> LIZIZ(NUX instance, F3T providerFactory) {
        o.LJIIJ(instance, "instance");
        o.LJIIJ(providerFactory, "providerFactory");
        return null;
    }

    @Override // X.InterfaceC60244Nke
    public InterfaceC60252Nkm LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC60244Nke
    public final C60245Nkf LIZ() {
        return new C60245Nkf(Boolean.TRUE, 2);
    }

    @Override // X.InterfaceC60244Nke
    public void LIZJ(WebSettings webSettings, C59614NaU c59614NaU) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setBlockNetworkImage(false);
    }
}
