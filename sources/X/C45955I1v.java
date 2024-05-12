package X;

import kotlin.jvm.internal.o;

/* renamed from: X.I1v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45955I1v extends F9E {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C45955I1v() {
        this(C45956I1w.LJLIL, C45957I1x.LJLIL, C45958I1y.LJLIL);
    }

    public C45955I1v(InterfaceC65784Pro<C76800UCe> goBack, InterfaceC65784Pro<C76800UCe> reshoot, InterfaceC65784Pro<C76800UCe> confirm) {
        o.LJIIIZ(goBack, "goBack");
        o.LJIIIZ(reshoot, "reshoot");
        o.LJIIIZ(confirm, "confirm");
        this.LJLIL = goBack;
        this.LJLILLLLZI = reshoot;
        this.LJLJI = confirm;
    }
}
