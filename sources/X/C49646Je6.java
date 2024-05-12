package X;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.Je6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49646Je6 extends AbstractC65781Prl implements InterfaceC88471Ynr<C49651JeB, JIR, C49651JeB> {
    public static final C49646Je6 INSTANCE = new C49646Je6();

    public C49646Je6() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final C49651JeB invoke2(C49651JeB lastState, JIR action) {
        C49647Je7 L;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        try {
            C49647Je7 latestSearchGidInfo = (C49647Je7) ORZ.LLFF(lastState.LJLIL);
            if (action.LJLIL) {
                o.LJIIIIZZ(latestSearchGidInfo, "latestSearchGidInfo");
                L = C49647Je7.L(latestSearchGidInfo, action.LJLILLLLZI, null, 5);
            } else {
                o.LJIIIIZZ(latestSearchGidInfo, "latestSearchGidInfo");
                L = C49647Je7.L(latestSearchGidInfo, null, action.LJLILLLLZI, 3);
            }
            lastState.LJLIL.set(r1.size() - 1, L);
            return lastState;
        } catch (NoSuchElementException e) {
            C16880lQ.LLLLIIL(e);
            return lastState;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C49651JeB invoke(C49651JeB c49651JeB, JIR jir) {
        C49651JeB c49651JeB2 = c49651JeB;
        invoke2(c49651JeB2, jir);
        return c49651JeB2;
    }
}
