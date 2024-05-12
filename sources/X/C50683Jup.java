package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jup, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50683Jup extends AbstractC65781Prl implements InterfaceC88471Ynr<C50679Jul, C50684Juq, C50679Jul> {
    public static final C50683Jup LJLIL = new C50683Jup();

    public C50683Jup() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50679Jul invoke(C50679Jul c50679Jul, C50684Juq c50684Juq) {
        C50679Jul state = c50679Jul;
        C50684Juq action = c50684Juq;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        return C50679Jul.L(state, 0L, action.LIZ, false, 5);
    }
}
