package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JxW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50850JxW extends AbstractC60800Ntc {
    public final /* synthetic */ C50855Jxb LJLIL;

    @Override // X.AbstractC60673NrZ
    public final void onDestroy() {
        C15280iq.LIZIZ("SparkViewContainer", "onDestroy");
        AbstractC60800Ntc abstractC60800Ntc = this.LJLIL.LIZLLL;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.onDestroy();
        }
        this.LJLIL.LJII();
    }

    public C50850JxW(C50855Jxb c50855Jxb) {
        this.LJLIL = c50855Jxb;
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
