package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B2D extends B2I {
    public final String LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2D(ElementDTO elementDTO, PaymentMethod paymentMethod) {
        super(elementDTO, paymentMethod);
        o.LJIIIZ(paymentMethod, "paymentMethod");
        this.LIZJ = null;
    }
}