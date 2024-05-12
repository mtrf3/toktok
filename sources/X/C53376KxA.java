package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KxA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53376KxA extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C53376KxA LJLIL = new C53376KxA();

    public C53376KxA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String value = (String) C52304Kfs.LIZ.getValue();
        o.LJIIIIZZ(value, "value");
        if (value.length() <= 0) {
            value = null;
        }
        if (value != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bgmSettingsUrl = ");
            LIZ.append(value);
            C221018lt.LIZ("RecSwipeUserCardViewHolder", X1D.LIZIZ(LIZ));
            return value;
        }
        String value2 = (String) C52302Kfq.LIZ.getValue();
        o.LJIIIIZZ(value2, "value");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("backup bgmSettingsUrl = ");
        LIZ2.append(value2);
        C221018lt.LIZ("RecSwipeUserCardViewHolder", X1D.LIZIZ(LIZ2));
        return value2;
    }
}
