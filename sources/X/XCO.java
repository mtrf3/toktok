package X;

import com.ss.ugc.effectplatform.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XCO implements XCP {
    public final /* synthetic */ XCP LIZ;
    public final /* synthetic */ XCL LIZIZ;

    @Override // X.XCP
    public final void onStart(Effect effect) {
    }

    @Override // X.XDR
    public final void onSuccess(Effect effect) {
        this.LIZ.onSuccess(effect);
        XCL xcl = this.LIZIZ;
        xcl.LJIILIIL.LJJJ.LIZJ(xcl.LJIILJJIL);
    }

    @Override // X.XDR
    public final /* bridge */ /* synthetic */ void preProcess(Effect effect) {
    }

    public XCO(XCP xcp, XCL xcl) {
        this.LIZ = xcp;
        this.LIZIZ = xcl;
    }

    @Override // X.XDR
    public final void onFail(Effect effect, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        this.LIZ.onFail(effect, exception);
        XCL xcl = this.LIZIZ;
        xcl.LJIILIIL.LJJJ.LIZJ(xcl.LJIILJJIL);
    }

    @Override // X.XCP
    public final void onProgress(Effect effect, int i, long j) {
        this.LIZ.onProgress(effect, i, j);
    }
}
