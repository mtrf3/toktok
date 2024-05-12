package X;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: X.1M7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1M7 implements C0T1 {
    public final Object LJLIL;

    @Override // X.C0T1
    public final String[] LIZ() {
        return ((WebViewProviderFactoryBoundaryInterface) this.LJLIL).getSupportedFeatures();
    }

    @Override // X.C0T1
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) EMD.LIZ(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.LJLIL).getWebkitToCompatConverter());
    }

    public /* synthetic */ C1M7(XQY xqy) {
        this.LJLIL = xqy;
    }

    public /* synthetic */ C1M7(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.LJLIL = webViewProviderFactoryBoundaryInterface;
    }
}
