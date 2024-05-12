package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KxB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53377KxB extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C53377KxB LJLIL = new C53377KxB();

    public C53377KxB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String value = (String) C52302Kfq.LIZ.getValue();
        o.LJIIIIZZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("backup bgmSettingsUrl = ");
        LIZ.append(value);
        C221018lt.LIZ("TTRecUserBigCardViewHolder", X1D.LIZIZ(LIZ));
        return value;
    }
}
