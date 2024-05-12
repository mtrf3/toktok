package X;

import kotlin.jvm.internal.o;

/* renamed from: X.USe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77216USe extends F9E {
    public final C77217USf LJLIL;
    public final UQ0 LJLILLLLZI;

    public C77216USe() {
        this(0);
    }

    public static C77216USe L(C77217USf status, UQ0 step) {
        o.LJIIIZ(status, "status");
        o.LJIIIZ(step, "step");
        return new C77216USe(status, step);
    }

    public static /* synthetic */ C77216USe M(C77216USe c77216USe, UQ0 uq0) {
        C77217USf c77217USf = c77216USe.LJLIL;
        c77216USe.getClass();
        return L(c77217USf, uq0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public /* synthetic */ C77216USe(int i) {
        this(new C77217USf(false, false, false), UQ0.START);
    }

    public C77216USe(C77217USf status, UQ0 step) {
        o.LJIIIZ(status, "status");
        o.LJIIIZ(step, "step");
        this.LJLIL = status;
        this.LJLILLLLZI = step;
    }
}
