package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.lynx.hybrid.webkit.WebKitView;

/* renamed from: X.NrL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60659NrL extends AbstractC60629Nqr<OM1> implements InterfaceC60707Ns7 {
    public InterfaceC60663NrP LJLJL;
    public final C60662NrO LJLJLJ = new C60662NrO(this);

    @Override // X.AbstractC60629Nqr
    public final void LIZJ() {
        WebKitView webKitView;
        C60737Nsb hybridContext;
        InterfaceC37737ErV LIZ = LIZ();
        InterfaceC60663NrP interfaceC60663NrP = null;
        if ((LIZ instanceof WebKitView) && (webKitView = (WebKitView) LIZ) != null && (hybridContext = webKitView.getHybridContext()) != null) {
            interfaceC60663NrP = (InterfaceC60663NrP) hybridContext.LIZIZ(InterfaceC60663NrP.class);
        }
        this.LJLJL = interfaceC60663NrP;
        C60631Nqt.LIZ(((C60640Nr2) LIZ()).getExtendableWebChromeClient(), new C60661NrN(this));
        LJ("destroy", this.LJLJLJ, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
    }
}
