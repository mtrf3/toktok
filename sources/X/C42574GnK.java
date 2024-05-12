package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GnK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42574GnK extends AbstractC65781Prl implements InterfaceC88472Yns<C42572GnI, CharSequence> {
    public static final C42574GnK LJLIL = new C42574GnK();

    public C42574GnK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(C42572GnI c42572GnI) {
        C42572GnI it = c42572GnI;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("type: ");
        LIZ.append(it.LIZ);
        LIZ.append(" - names: ");
        LIZ.append(it.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }
}
