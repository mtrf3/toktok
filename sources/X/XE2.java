package X;

import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XE2 implements InterfaceC84451XCl {
    public final /* synthetic */ XDY LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ long LIZLLL;
    public final /* synthetic */ EffectListResponse LJ;

    @Override // X.InterfaceC84451XCl
    public final void onSuccess() {
        super/*X.XDF*/.LJIIL(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
    }

    @Override // X.InterfaceC84451XCl
    public final void LIZ(C84418XBe exceptionResult) {
        o.LJIIJ(exceptionResult, "exceptionResult");
        this.LIZ.LJIIJ(null, null, exceptionResult);
    }

    public XE2(XDY xdy, long j, long j2, long j3, EffectListResponse effectListResponse) {
        this.LIZ = xdy;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = effectListResponse;
    }
}
