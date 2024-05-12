package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JvV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50725JvV extends AbstractC65781Prl implements InterfaceC88471Ynr<C50715JvL, C50726JvW, C50715JvL> {
    public static final C50725JvV LJLIL = new C50725JvV();

    public C50725JvV() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50715JvL invoke(C50715JvL c50715JvL, C50726JvW c50726JvW) {
        C50715JvL state = c50715JvL;
        C50726JvW action = c50726JvW;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        return C50715JvL.L(state, action.LIZ, System.currentTimeMillis(), false, null, 0, 28);
    }
}
