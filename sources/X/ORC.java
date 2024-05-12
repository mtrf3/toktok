package X;

import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class ORC extends AbstractC65781Prl implements InterfaceC88472Yns<Byte, CharSequence> {
    public static final ORC LJLIL = new ORC();

    public ORC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Byte b) {
        byte byteValue = b.byteValue();
        C17N.LJIIJ(16);
        C17N.LJIIJ(16);
        String num = Integer.toString(byteValue, 16);
        o.LJIIIIZZ(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        return s.LJJLIL(2, num);
    }
}
