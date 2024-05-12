package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J6H implements J6Q {
    public final J6L LIZIZ;

    public J6H(FQG observer) {
        o.LJIIIZ(observer, "observer");
        this.LIZIZ = observer;
    }

    @Override // X.J6Q
    public final void LIZ(int i) {
        this.LIZIZ.LIZ(i);
    }

    @Override // X.J6Q
    public final void LIZIZ(FQN result) {
        o.LJIIIZ(result, "result");
        this.LIZIZ.LIZIZ(new FQM(result));
    }
}
