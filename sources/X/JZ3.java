package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JZ3 extends AbstractC65781Prl implements InterfaceC88471Ynr<JZ4, JZ1, JZ4> {
    public static final JZ3 LJLIL = new JZ3();

    public JZ3() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final JZ4 invoke(JZ4 jz4, JZ1 jz1) {
        JZ4 lastState = jz4;
        JZ1 action = jz1;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        return JZ4.LIZ(lastState, null, action.LJLIL, 3);
    }
}
