package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3QK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3QK extends AbstractC65781Prl implements InterfaceC88472Yns<C3QL, CharSequence> {
    public static final C3QK LJLIL = new C3QK();

    public C3QK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(C3QL c3ql) {
        C3QL it = c3ql;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(it.LIZIZ);
        LIZ.append(" #* ");
        LIZ.append(it.LIZJ);
        LIZ.append(" #* ");
        LIZ.append(it.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }
}
