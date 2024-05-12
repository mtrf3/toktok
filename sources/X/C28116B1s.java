package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.B1s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28116B1s extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C28116B1s LJLIL = new C28116B1s();

    public C28116B1s() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(ATMCardAssem.class);
        uiContentAssem.LJIIIIZZ = new ATMCardAssem();
        uiContentAssem.LJI = R.id.bs8;
        return C76800UCe.LIZ;
    }
}
