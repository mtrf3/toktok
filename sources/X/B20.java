package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B20 extends B2I {
    public String LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B20(ElementDTO elementDTO, PaymentMethod paymentMethod, String str) {
        super(elementDTO, paymentMethod);
        o.LJIIIZ(elementDTO, "elementDTO");
        o.LJIIIZ(paymentMethod, "paymentMethod");
        this.LIZJ = str;
    }
}
