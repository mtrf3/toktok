package X;

import Y.ARunnableS46S0100000_10;
import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.Yb5, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87679Yb5 extends AbstractC87673Yaz {
    public final String toString() {
        return "Running";
    }

    @Override // X.AbstractC87673Yaz
    public final void LIZ() {
        C87677Yb3 c87677Yb3 = this.LIZ;
        c87677Yb3.getClass();
        c87677Yb3.LIZLLL(new C87661Yan(c87677Yb3, null));
        C38995FSd.LJFF().execute(new ARunnableS46S0100000_10((InterfaceC65784Pro) new AqS166S0100000_16(c87677Yb3, 17), 141));
    }

    @Override // X.AbstractC87673Yaz
    public final void LJ() {
        C87677Yb3 c87677Yb3 = this.LIZ;
        c87677Yb3.LIZLLL(new C87662Yao(c87677Yb3));
    }

    @Override // X.AbstractC87673Yaz
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
    public C87679Yb5(C87677Yb3 stateMachine) {
        super(stateMachine);
        o.LJIIIZ(stateMachine, "stateMachine");
    }

    @Override // X.AbstractC87673Yaz
    public final void LIZLLL(C87671Yax c87671Yax) {
        C87677Yb3 c87677Yb3 = this.LIZ;
        C43366H0g c43366H0g = c87677Yb3.LIZLLL;
        c43366H0g.getClass();
        c43366H0g.LIZJ = System.currentTimeMillis();
        c87677Yb3.LIZLLL(c87671Yax);
    }

    @Override // X.AbstractC87673Yaz
    public final void LJFF(C87681Yb7 c87681Yb7) {
        this.LIZ.LIZLLL(c87681Yb7);
    }
}
