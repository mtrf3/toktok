package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import java.util.List;

/* renamed from: X.B1f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28103B1f extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends PaymentInfo>> {
    public static final C28103B1f LJLIL = new C28103B1f();

    public C28103B1f() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends PaymentInfo> invoke() {
        return ORZ.LLJI(PaymentCacheHelper.LIZJ);
    }
}
