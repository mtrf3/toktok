package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Rd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58452Rd extends AbstractC65781Prl implements InterfaceC88472Yns<OSZ<? extends Integer, ? extends Integer>, CharSequence> {
    public static final C58452Rd LJLIL = new C58452Rd();

    public C58452Rd() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(OSZ<? extends Integer, ? extends Integer> osz) {
        OSZ<? extends Integer, ? extends Integer> it = osz;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("group(");
        LIZ.append(it.getFirst());
        LIZ.append(")=");
        LIZ.append(it.getSecond());
        return X1D.LIZIZ(LIZ);
    }
}
