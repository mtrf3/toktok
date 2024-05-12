package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FBb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38551FBb extends AbstractC65781Prl implements InterfaceC88472Yns<C38555FBf, CharSequence> {
    public static final C38551FBb LJLIL = new C38551FBb();

    public C38551FBb() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(C38555FBf c38555FBf) {
        C38555FBf info = c38555FBf;
        o.LJIIIZ(info, "info");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(info.LIZ);
        LIZ.append(',');
        LIZ.append(info.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }
}
