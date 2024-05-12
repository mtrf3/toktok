package X;

import Y.ARunnableS46S0100000_10;
import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.Yb6, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87680Yb6 extends AbstractC87674Yb0 {
    public final String toString() {
        return "Running";
    }

    @Override // X.AbstractC87674Yb0
    public final void LIZ() {
        C87678Yb4 c87678Yb4 = this.LIZ;
        c87678Yb4.getClass();
        c87678Yb4.LIZLLL(new C87666Yas(c87678Yb4, null));
        C38995FSd.LJFF().execute(new ARunnableS46S0100000_10((InterfaceC65784Pro) new AqS166S0100000_16(c87678Yb4, 19), 142));
    }

    @Override // X.AbstractC87674Yb0
    public final void LJ() {
        C87678Yb4 c87678Yb4 = this.LIZ;
        c87678Yb4.LIZLLL(new C87667Yat(c87678Yb4));
    }

    @Override // X.AbstractC87674Yb0
    public final void LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BDUploadSpeedProbe : ");
        LIZ.append("invalid on running");
        H78.LIZJ(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("BDUploadSpeedProbe : ");
        LIZ2.append("invalid on running");
        C78983UzD.LJIILL(X1D.LIZIZ(LIZ2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87680Yb6(C87678Yb4 stateMachine) {
        super(stateMachine);
        o.LJIIIZ(stateMachine, "stateMachine");
    }

    @Override // X.AbstractC87674Yb0
    public final void LIZLLL(C87672Yay c87672Yay) {
        C87678Yb4 c87678Yb4 = this.LIZ;
        C43366H0g c43366H0g = c87678Yb4.LIZLLL;
        c43366H0g.getClass();
        c43366H0g.LIZJ = System.currentTimeMillis();
        c87678Yb4.LIZLLL(c87672Yay);
    }

    @Override // X.AbstractC87674Yb0
    public final void LJFF(C87682Yb8 c87682Yb8) {
        this.LIZ.LIZLLL(c87682Yb8);
    }
}
