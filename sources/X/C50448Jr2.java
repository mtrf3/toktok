package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jr2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50448Jr2 extends AbstractC65781Prl implements InterfaceC88471Ynr<C50449Jr3, C50442Jqw, C50449Jr3> {
    public static final C50448Jr2 LJLIL = new C50448Jr2();

    public C50448Jr2() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50449Jr3 invoke(C50449Jr3 c50449Jr3, C50442Jqw action) {
        C50449Jr3 lastState = c50449Jr3;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        lastState.LJLIL.clear();
        return C50449Jr3.LIZ(lastState, -1L);
    }
}
