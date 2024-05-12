package X;

import Y.ARunnableS46S0100000_10;
import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.Yb7, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87681Yb7 extends AbstractC87673Yaz {
    public final YXT LIZIZ;

    @Override // X.AbstractC87673Yaz
    public final String LIZIZ() {
        return "FastResult";
    }

    @Override // X.AbstractC87673Yaz
    public final void LIZ() {
        C87677Yb3 c87677Yb3 = this.LIZ;
        YXT yxt = this.LIZIZ;
        c87677Yb3.getClass();
        c87677Yb3.LIZLLL(new C87661Yan(c87677Yb3, yxt));
        C38995FSd.LJFF().execute(new ARunnableS46S0100000_10((InterfaceC65784Pro) new AqS166S0100000_16(c87677Yb3, 17), 141));
    }

    @Override // X.AbstractC87673Yaz
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87681Yb7(C87677Yb3 stateMachine, YXT result) {
        super(stateMachine);
        o.LJIIIZ(stateMachine, "stateMachine");
        o.LJIIIZ(result, "result");
        this.LIZIZ = result;
    }
}
