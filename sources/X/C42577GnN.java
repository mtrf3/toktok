package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GnN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42577GnN extends AbstractC65781Prl implements InterfaceC88472Yns<C42576GnM, CharSequence> {
    public static final C42577GnN LJLIL = new C42577GnN();

    public C42577GnN() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(C42576GnM c42576GnM) {
        C42576GnM it = c42576GnM;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(it.LIZIZ);
        LIZ.append('-');
        LIZ.append(it.LIZJ);
        return X1D.LIZIZ(LIZ);
    }
}
