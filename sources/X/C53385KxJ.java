package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.KxJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53385KxJ extends AbstractC65781Prl implements InterfaceC88472Yns<String[], C76800UCe> {
    public static final C53385KxJ LJLIL = new C53385KxJ();

    public C53385KxJ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String[] strArr) {
        String[] it = strArr;
        o.LJIIIZ(it, "it");
        Object value = C53217Kub.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-KEVA_REPO>(...)");
        ((Keva) value).storeStringArray("normal_channels", it);
        return C76800UCe.LIZ;
    }
}
