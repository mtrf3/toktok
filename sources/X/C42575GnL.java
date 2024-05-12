package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GnL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42575GnL extends AbstractC65781Prl implements InterfaceC88472Yns<C42576GnM, CharSequence> {
    public static final C42575GnL LJLIL = new C42575GnL();

    public C42575GnL() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(C42576GnM c42576GnM) {
        C42576GnM it = c42576GnM;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("type: ");
        LIZ.append(it.LIZ);
        LIZ.append(" - oriId: ");
        LIZ.append(it.LIZIZ);
        LIZ.append(" - finalId: ");
        LIZ.append(it.LIZJ);
        return X1D.LIZIZ(LIZ);
    }
}
