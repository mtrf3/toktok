package X;

import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XE8 implements InterfaceC84451XCl {
    public final /* synthetic */ XDZ LIZ;
    public final /* synthetic */ EffectListResponse LIZIZ;

    @Override // X.InterfaceC84451XCl
    public final void onSuccess() {
        XCZ.LJFF(new AqS165S0100000_15(this, 724));
    }

    @Override // X.InterfaceC84451XCl
    public final void LIZ(C84418XBe exceptionResult) {
        o.LJIIJ(exceptionResult, "exceptionResult");
        XCZ.LJFF(new AqS162S0200000_15(this, exceptionResult, 56));
    }

    public XE8(XDZ xdz, EffectListResponse effectListResponse) {
        this.LIZ = xdz;
        this.LIZIZ = effectListResponse;
    }
}
