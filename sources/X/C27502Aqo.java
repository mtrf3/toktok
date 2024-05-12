package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Aqo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27502Aqo extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Object, C76800UCe> {
    public static final C27502Aqo LJLIL = new C27502Aqo();

    public C27502Aqo() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Object obj) {
        BillingAddressFragment billingAddressFragment;
        UIAssem selectSubscribe = uIAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (obj != null) {
            Fragment LIZLLL = C212428Vi.LIZLLL(selectSubscribe);
            if ((LIZLLL instanceof BillingAddressFragment) && (billingAddressFragment = (BillingAddressFragment) LIZLLL) != null) {
                billingAddressFragment.vl();
            }
        }
        return C76800UCe.LIZ;
    }
}
