package X;

import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* renamed from: X.FCz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38601FCz implements FD4 {
    public static final C38601FCz LIZ = new C38601FCz();

    @Override // X.FD4
    public final boolean LIZIZ(InterfaceC60761Nsz interfaceC60761Nsz) {
        return interfaceC60761Nsz instanceof WebView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.FD4
    public final void LIZ(InterfaceC60761Nsz interfaceC60761Nsz, C79604VMa customInfo) {
        o.LJIIJ(customInfo, "customInfo");
        if (!(interfaceC60761Nsz instanceof WebView)) {
            return;
        }
        VMI.LJ.LJIILL((WebView) interfaceC60761Nsz, customInfo);
    }
}
