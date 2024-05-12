package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Juy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50692Juy extends AbstractC65781Prl implements InterfaceC88471Ynr<C50701Jv7, C50319Jox, C50701Jv7> {
    public static final C50692Juy LJLIL = new C50692Juy();

    public C50692Juy() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50701Jv7 invoke(C50701Jv7 c50701Jv7, C50319Jox c50319Jox) {
        C50701Jv7 state = c50701Jv7;
        C50319Jox action = c50319Jox;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        return C50701Jv7.L(state, System.currentTimeMillis(), false, null, action.LIZ, action.LIZIZ, 0L, 0L, null, 460);
    }
}
