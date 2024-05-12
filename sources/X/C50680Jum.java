package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jum, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50680Jum extends AbstractC65781Prl implements InterfaceC88471Ynr<C50679Jul, C50443Jqx, C50679Jul> {
    public static final C50680Jum LJLIL = new C50680Jum();

    public C50680Jum() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50679Jul invoke(C50679Jul c50679Jul, C50443Jqx c50443Jqx) {
        boolean z;
        boolean z2;
        C50679Jul state = c50679Jul;
        C50443Jqx action = c50443Jqx;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        boolean N = state.N();
        if (o.LJ(action.LIZ, "homepage_hot") || o.LJ(action.LIZ, "homepage_follow") || o.LJ(action.LIZ, "homepage_friends") || o.LJ(action.LIZ, "homepage_now")) {
            z = true;
        } else {
            z = false;
        }
        boolean isEmpty = state.LJLILLLLZI.isEmpty();
        if (z && N && !isEmpty) {
            z2 = true;
        } else {
            z2 = false;
        }
        return C50679Jul.L(state, 0L, null, z2, 3);
    }
}
