package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JvI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50712JvI extends AbstractC65781Prl implements InterfaceC88471Ynr<C50301Jof, C50719JvP, C50301Jof> {
    public static final C50712JvI LJLIL = new C50712JvI();

    public C50712JvI() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50301Jof invoke(C50301Jof c50301Jof, C50719JvP c50719JvP) {
        C50301Jof state = c50301Jof;
        C50719JvP action = c50719JvP;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        return C50301Jof.L(state, null, action.LIZ, 1);
    }
}
