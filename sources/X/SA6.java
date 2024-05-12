package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;

/* loaded from: classes13.dex */
public final class SA6 implements AnonymousClass141 {
    public final /* synthetic */ SAG LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ SA3 LIZJ;
    public final /* synthetic */ List<String> LIZLLL;
    public final /* synthetic */ NewPayInfo LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ Context LJI;
    public final /* synthetic */ String LJII;
    public final /* synthetic */ String LJIIIIZZ;

    public SA6(SAG sag, long j, SA3 sa3, List<String> list, NewPayInfo newPayInfo, String str, Context context, String str2, String str3) {
        this.LIZ = sag;
        this.LIZIZ = j;
        this.LIZJ = sa3;
        this.LIZLLL = list;
        this.LJ = newPayInfo;
        this.LJFF = str;
        this.LJI = context;
        this.LJII = str2;
        this.LJIIIIZZ = str3;
    }

    @Override // X.AnonymousClass141
    public final void LIZ(C36681cG c36681cG) {
        String str;
        String str2;
        String str3;
        PaymentMethod paymentMethod;
        C0E3 c0e3 = c36681cG.LJII;
        C0E3 c0e32 = C0E3.SUCCESS;
        String str4 = null;
        if (c0e3 == c0e32) {
            PaymentResultProcess.payResultProcess$handleSucceed(this.LJFF, this.LJI);
            SAG sag = this.LIZ;
            if (sag != null) {
                sag.LIZJ();
            }
            SAG sag2 = this.LIZ;
            if (sag2 != null) {
                sag2.LIZ(PayResult.DONE, null, null);
            }
        } else {
            PaymentResultProcess.payResultProcess$handleFailed$default(this.LIZJ, this.LJII, this.LJIIIIZZ, this.LJI, c36681cG.LJFF, null, 32, null);
            SAG sag3 = this.LIZ;
            if (sag3 != null) {
                sag3.LIZ(PayResult.DONE, c36681cG.LJFF, null);
            }
            SAG sag4 = this.LIZ;
            if (sag4 != null) {
                sag4.LJ();
            }
        }
        if (c36681cG.LJII == c0e32) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = c36681cG.LJFF;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
        Object obj = this.LIZJ.LJII.get("previous_page");
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        List<String> list = this.LIZLLL;
        if (list != null) {
            str3 = (String) ORZ.LJLLLL(list);
        } else {
            str3 = null;
        }
        PaymentInfo paymentInfo = this.LIZJ.LJI;
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            str4 = paymentMethod.LJIIL();
        }
        C28068Azw.LJ("query_pay_result", str2, str3, str4, SAE.LIZ(PayResult.DONE), str, this.LJ.redirectUrl, c36681cG.LJI, currentTimeMillis);
    }
}
