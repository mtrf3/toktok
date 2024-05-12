package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.KxI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53384KxI extends AbstractC65781Prl implements InterfaceC88472Yns<String[], C76800UCe> {
    public static final C53384KxI LJLIL = new C53384KxI();

    public C53384KxI() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String[] strArr) {
        String[] it = strArr;
        o.LJIIIZ(it, "it");
        Object value = C53217Kub.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-KEVA_REPO>(...)");
        ((Keva) value).storeStringArray("high_pri_channels", it);
        return C76800UCe.LIZ;
    }
}
