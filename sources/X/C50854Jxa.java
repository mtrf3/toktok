package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jxa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50854Jxa extends AbstractC60800Ntc {
    public final /* synthetic */ C50865Jxl LJLIL;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLL() {
        C15280iq.LIZIZ("SparkViewContainer", "onPreKitCreate");
        AbstractC60800Ntc abstractC60800Ntc = this.LJLIL.LIZLLL;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.LJJJJLL();
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void onDestroy() {
        C15280iq.LIZIZ("SparkViewContainer", "onDestroy");
        AbstractC60800Ntc abstractC60800Ntc = this.LJLIL.LIZLLL;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.onDestroy();
        }
        this.LJLIL.LJII();
    }

    public C50854Jxa(C50865Jxl c50865Jxl) {
        this.LJLIL = c50865Jxl;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadFinish");
        LIZ.append(view);
        C15280iq.LIZIZ("SparkViewContainer", X1D.LIZIZ(LIZ));
        this.LJLIL.LIZJ = new C50849JxV(view);
        this.LJLIL.LJIIIIZZ();
        AbstractC60800Ntc abstractC60800Ntc = this.LJLIL.LIZLLL;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.LJJJJJ(view);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLI(InterfaceC60761Nsz interfaceC60761Nsz) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPostKitCreated:");
        LIZ.append(interfaceC60761Nsz);
        C15280iq.LIZIZ("SparkViewContainer", X1D.LIZIZ(LIZ));
        AbstractC60800Ntc abstractC60800Ntc = this.LJLIL.LIZLLL;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.LJJJJLI(interfaceC60761Nsz);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJZ(EnumC39924Flg kitType) {
        o.LJIIIZ(kitType, "kitType");
        C15280iq.LIZIZ("SparkViewContainer", "onRuntimeReady");
        AbstractC60800Ntc abstractC60800Ntc = this.LJLIL.LIZLLL;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.LJJJJZ(kitType);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJ(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadFailed");
        LIZ.append(url);
        C15280iq.LIZIZ("SparkViewContainer", X1D.LIZIZ(LIZ));
        AbstractC60800Ntc abstractC60800Ntc = this.LJLIL.LIZLLL;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.LJJJJ(view, url);
        }
        this.LJLIL.LJII();
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadStart:");
        LIZ.append(url);
        C15280iq.LIZIZ("SparkViewContainer", X1D.LIZIZ(LIZ));
        AbstractC60800Ntc abstractC60800Ntc = this.LJLIL.LIZLLL;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.LJJJJJL(view, url);
        }
    }
}
