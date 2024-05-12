package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayErrorToast;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SA7 implements AnonymousClass140 {
    public final /* synthetic */ SA3 LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ List<String> LIZJ;

    public SA7(SA3 sa3, long j, List<String> list) {
        this.LIZ = sa3;
        this.LIZIZ = j;
        this.LIZJ = list;
    }

    @Override // X.AnonymousClass140
    public final void LIZ(C36671cF c36671cF) {
        String str;
        PayResult payResult;
        String str2;
        String str3;
        String str4;
        PaymentMethod paymentMethod;
        C24070x1 c24070x1 = c36671cF.LJFF;
        String str5 = null;
        if (c24070x1 != null) {
            str = c24070x1.LIZJ;
        } else {
            str = null;
        }
        String str6 = c36671cF.LIZJ;
        if (o.LJ(str6, "success")) {
            payResult = PayResult.DONE;
        } else if (o.LJ(str6, "redirect")) {
            payResult = PayResult.REDIRECT;
        } else {
            payResult = PayResult.ERROR;
        }
        NewPayInfo newPayInfo = new NewPayInfo(str, payResult, new PayErrorToast(c36671cF.LIZLLL, "", null), null, null);
        PaymentResultProcess paymentResultProcess = PaymentResultProcess.INSTANCE;
        SA3 sa3 = this.LIZ;
        sa3.LIZLLL = newPayInfo;
        paymentResultProcess.payResultProcess(sa3);
        long currentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
        Object obj = this.LIZ.LJII.get("previous_page");
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        List<String> list = this.LIZJ;
        if (list != null) {
            str3 = (String) ORZ.LJLLLL(list);
        } else {
            str3 = null;
        }
        PaymentInfo paymentInfo = this.LIZ.LJI;
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            str4 = paymentMethod.LJIIL();
        } else {
            str4 = null;
        }
        String LIZ = SAE.LIZ(PayResult.NEED_INFO);
        String str7 = c36671cF.LIZLLL;
        if (str7 == null) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        C24070x1 c24070x12 = c36671cF.LJFF;
        if (c24070x12 != null) {
            str5 = c24070x12.LIZJ;
        }
        C28068Azw.LJ("pipo_pay", str2, str3, str4, LIZ, str7, str5, null, currentTimeMillis);
    }
}
