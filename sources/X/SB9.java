package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;

/* loaded from: classes13.dex */
public final class SB9 extends AbstractC65781Prl implements InterfaceC65784Pro<Region> {
    public static final SB9 LJLIL = new SB9();

    public SB9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Region invoke() {
        String str = PaymentCacheHelper.LJFF().geoNameId;
        if (str == null || str.length() == 0) {
            return new Region("United States", "6252001", "US", null, null, null, 56, null);
        }
        return PaymentCacheHelper.LJFF();
    }
}
