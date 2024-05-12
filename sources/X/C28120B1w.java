package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.B1w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28120B1w extends B2I {
    public final String LIZJ;
    public final boolean LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28120B1w(ElementDTO elementDTO, PaymentMethod paymentMethod, String str, boolean z) {
        super(elementDTO, paymentMethod);
        o.LJIIIZ(elementDTO, "elementDTO");
        o.LJIIIZ(paymentMethod, "paymentMethod");
        this.LIZJ = str;
        this.LIZLLL = z;
    }
}
