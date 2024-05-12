package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Hw9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45669Hw9 extends F9E {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C45669Hw9() {
        this(C45671HwB.LJLIL, C45672HwC.LJLIL);
    }

    public C45669Hw9(InterfaceC65784Pro<C76800UCe> goBack, InterfaceC65784Pro<C76800UCe> retry) {
        o.LJIIIZ(goBack, "goBack");
        o.LJIIIZ(retry, "retry");
        this.LJLIL = goBack;
        this.LJLILLLLZI = retry;
    }
}
