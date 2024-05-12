package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AsF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27591AsF extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C27591AsF LJLIL = new C27591AsF();

    public C27591AsF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(SubPaymentListAssem.class);
        uiContentAssem.LJIIIIZZ = new SubPaymentListAssem();
        uiContentAssem.LJI = R.id.bs8;
        return C76800UCe.LIZ;
    }
}
