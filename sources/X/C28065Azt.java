package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Azt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28065Azt implements SAG {
    public final /* synthetic */ C28064Azs LIZ;
    public final /* synthetic */ PaymentInfo LIZIZ;

    @Override // X.SAG
    public final void LIZJ() {
    }

    @Override // X.SAG
    public final void LIZLLL() {
    }

    @Override // X.SAG
    public final void LJ() {
    }

    @Override // X.SAG
    public final void LJFF() {
        String str;
        Integer num;
        String str2;
        InstallmentInfo installmentInfo;
        List<InstallmentPlan> list;
        PaymentMethod paymentMethod = this.LIZIZ.paymentMethod;
        String str3 = null;
        if (paymentMethod != null) {
            str = paymentMethod.LJIIL();
        } else {
            str = null;
        }
        PaymentMethod paymentMethod2 = this.LIZIZ.paymentMethod;
        if (paymentMethod2 != null && (installmentInfo = paymentMethod2.installmentInfo) != null && (list = installmentInfo.installmentPlans) != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        Object obj = this.LIZ.LJII.get("entrance_info");
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        Object obj2 = this.LIZ.LJII.get("previous_page");
        if (obj2 instanceof String) {
            str3 = (String) obj2;
        }
        C28068Azw.LIZIZ(num, "payment_code", str, str2, str3);
    }

    @Override // X.SAG
    public final void LIZIZ() {
        EventCenter.LJ().LIZ("ec_awaiting_payment_open_h5", "{}");
    }

    public C28065Azt(C28064Azs c28064Azs, PaymentInfo paymentInfo) {
        this.LIZ = c28064Azs;
        this.LIZIZ = paymentInfo;
    }

    @Override // X.SAG
    public final void LIZ(PayResult payResult, String str, String str2) {
        o.LJIIIZ(payResult, "payResult");
        C28064Azs c28064Azs = this.LIZ;
        c28064Azs.getClass();
        try {
            ((DialogC25756A8y) c28064Azs.LJIIJJI.getValue()).dismiss();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
