package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Je8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49648Je8 extends AbstractC65781Prl implements InterfaceC88471Ynr<C49651JeB, C49649Je9, C49651JeB> {
    public static final C49648Je8 LJLIL = new C49648Je8();

    public C49648Je8() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C49651JeB invoke(C49651JeB c49651JeB, C49649Je9 c49649Je9) {
        C49651JeB lastState = c49651JeB;
        C49649Je9 action = c49649Je9;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        if (lastState.LJLIL.isEmpty() || !o.LJ(((C49647Je7) ORZ.LLFF(lastState.LJLIL)).LJLIL, action.LJLIL)) {
            lastState.LJLIL.add(new C49647Je7(action.LJLIL, 6));
        }
        return lastState;
    }
}
