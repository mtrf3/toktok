package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Yas, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87666Yas extends AbstractC87668Yau {
    public final YXT LIZIZ;

    @Override // X.AbstractC87674Yb0
    public final String LIZIZ() {
        return "Cancel";
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cancel:");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87666Yas(C87678Yb4 stateMachine, YXT yxt) {
        super(stateMachine);
        o.LJIIIZ(stateMachine, "stateMachine");
        this.LIZIZ = yxt;
    }
}
