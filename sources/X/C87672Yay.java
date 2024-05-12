package X;

import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.Yay, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87672Yay extends AbstractC87674Yb0 {
    public final YXT LIZIZ;

    @Override // X.AbstractC87674Yb0
    public final String LIZIZ() {
        return "Complete";
    }

    @Override // X.AbstractC87674Yb0
    public final void LJII() {
        C43366H0g.LIZ(this.LIZ.LIZLLL, new AqS166S0100000_16(this, 18));
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Complete:");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87672Yay(C87678Yb4 stateMachine, YXT result) {
        super(stateMachine);
        o.LJIIIZ(stateMachine, "stateMachine");
        o.LJIIIZ(result, "result");
        this.LIZIZ = result;
    }
}
