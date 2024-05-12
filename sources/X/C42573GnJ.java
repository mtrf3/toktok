package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GnJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42573GnJ extends AbstractC65781Prl implements InterfaceC88472Yns<C42571GnH, CharSequence> {
    public static final C42573GnJ LJLIL = new C42573GnJ();

    public C42573GnJ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(C42571GnH c42571GnH) {
        C42571GnH it = c42571GnH;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("type: ");
        LIZ.append(it.LIZ);
        LIZ.append(" - info: ");
        LIZ.append(it.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }
}
