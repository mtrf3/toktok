package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.B1q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28114B1q extends B2I {
    public final java.util.Map<String, String> LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28114B1q(ElementDTO elementDTO, PaymentMethod paymentMethod, java.util.Map<String, String> map) {
        super(elementDTO, paymentMethod);
        o.LJIIIZ(elementDTO, "elementDTO");
        o.LJIIIZ(paymentMethod, "paymentMethod");
        this.LIZJ = map;
    }
}
