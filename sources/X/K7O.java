package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K7O extends AbstractC65781Prl implements InterfaceC88471Ynr<C50428Jqi, K7N, C50428Jqi> {
    public static final K7O LJLIL = new K7O();

    public K7O() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50428Jqi invoke(C50428Jqi c50428Jqi, K7N k7n) {
        String str;
        C50428Jqi lastState = c50428Jqi;
        K7N action = k7n;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        int i = K7M.LIZ[action.LJLIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                str = "button";
            }
        } else {
            str = "swipe";
        }
        return C50428Jqi.LIZ(lastState, 0, 0, null, null, str, false, 959);
    }
}
