package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Yan, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87661Yan extends AbstractC87663Yap {
    public final YXT LIZIZ;

    @Override // X.AbstractC87673Yaz
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
    public C87661Yan(C87677Yb3 stateMachine, YXT yxt) {
        super(stateMachine);
        o.LJIIIZ(stateMachine, "stateMachine");
        this.LIZIZ = yxt;
    }
}
