package X;

import Y.ARunnableS46S0100000_10;
import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.Yb8, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87682Yb8 extends AbstractC87674Yb0 {
    public final YXT LIZIZ;

    @Override // X.AbstractC87674Yb0
    public final String LIZIZ() {
        return "FastResult";
    }

    @Override // X.AbstractC87674Yb0
    public final void LIZ() {
        C87678Yb4 c87678Yb4 = this.LIZ;
        YXT yxt = this.LIZIZ;
        c87678Yb4.getClass();
        c87678Yb4.LIZLLL(new C87666Yas(c87678Yb4, yxt));
        C38995FSd.LJFF().execute(new ARunnableS46S0100000_10((InterfaceC65784Pro) new AqS166S0100000_16(c87678Yb4, 19), 142));
    }

    @Override // X.AbstractC87674Yb0
    public final void LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BDUploadSpeedProbe : ");
        LIZ.append("invalid on fast result");
        H78.LIZJ(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("BDUploadSpeedProbe : ");
        LIZ2.append("invalid on fast result");
        C78983UzD.LJIILL(X1D.LIZIZ(LIZ2));
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FastResult:");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87682Yb8(C87678Yb4 stateMachine, YXT result) {
        super(stateMachine);
        o.LJIIIZ(stateMachine, "stateMachine");
        o.LJIIIZ(result, "result");
        this.LIZIZ = result;
    }
}
