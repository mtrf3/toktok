package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.m;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SA3 {
    public final Context LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public NewPayInfo LIZLLL;
    public final Cashier LJ;
    public final String LJFF;
    public final PaymentInfo LJI;
    public final java.util.Map<String, Object> LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final SAG LJIIJJI;
    public final Boolean LJIIL;
    public final C36251bZ LJIILIIL = new C36251bZ();
    public final C36241bY LJIILJJIL = new C36241bY();

    public SA3(C28057Azl c28057Azl) {
        Cashier cashier;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        boolean z;
        PaymentMethodInfo paymentMethodInfo;
        Boolean isChooseSave;
        PaymentParams paymentParams;
        PaymentParams paymentParams2;
        PaymentParams paymentParams3;
        PaymentParams paymentParams4;
        PaymentParams paymentParams5;
        PaymentParams paymentParams6;
        PaymentParams paymentParams7;
        this.LIZ = c28057Azl.LIZ;
        this.LIZIZ = c28057Azl.LIZIZ;
        this.LIZJ = c28057Azl.LIZJ;
        this.LIZLLL = c28057Azl.LIZLLL;
        this.LJIIJJI = c28057Azl.LJ;
        ArrayList arrayList = null;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), c28057Azl.LJFF, C65330PkU.LIZJ(C65352Pkq.LIZLLL(Cashier.class)));
            cashier = (Cashier) (fromJson instanceof Cashier ? fromJson : null);
        } catch (s unused) {
            cashier = null;
        }
        this.LJ = cashier;
        String str18 = c28057Azl.LJI;
        this.LJFF = str18;
        this.LJI = c28057Azl.LJII;
        HashMap<String, Object> hashMap = c28057Azl.LJIIIIZZ;
        this.LJII = hashMap == null ? new HashMap<>() : hashMap;
        this.LJIIIIZZ = c28057Azl.LJIIIZ;
        this.LJIIIZ = c28057Azl.LJIIJ;
        this.LJIIL = c28057Azl.LJIIL;
        this.LJIIJ = c28057Azl.LJIIJJI;
        C24080x2 c24080x2 = new C24080x2();
        if (cashier != null) {
            str = cashier.env;
        } else {
            str = null;
        }
        c24080x2.LIZ = str;
        c24080x2.LIZLLL = "android";
        if (cashier != null) {
            str2 = cashier.originKey;
        } else {
            str2 = null;
        }
        c24080x2.LIZJ = str2;
        if (cashier != null) {
            str3 = cashier.locale;
        } else {
            str3 = null;
        }
        c24080x2.LIZIZ = str3;
        C36251bZ c36251bZ = this.LJIILIIL;
        if (cashier != null && (paymentParams7 = cashier.paymentParams) != null) {
            str4 = paymentParams7.chargeId;
        } else {
            str4 = null;
        }
        c36251bZ.LJIIIZ = str4;
        if (cashier != null) {
            str5 = cashier.nonce;
        } else {
            str5 = null;
        }
        c36251bZ.LJFF = str5;
        if (cashier != null) {
            str6 = cashier.merchantUserId;
        } else {
            str6 = null;
        }
        c36251bZ.LJI = str6;
        if (cashier != null) {
            str7 = cashier.merchantId;
        } else {
            str7 = null;
        }
        c36251bZ.LIZIZ = str7;
        if (cashier != null && (paymentParams6 = cashier.paymentParams) != null) {
            str8 = paymentParams6.paymentReference;
        } else {
            str8 = null;
        }
        c36251bZ.LJIIIIZZ = str8;
        c36251bZ.LJII = c24080x2;
        c36251bZ.LIZJ = String.valueOf(System.currentTimeMillis());
        this.LJIILIIL.LJ = C113554cx.LJJJLZIJ(new OSZ("Referer", C71058Rug.LIZ()));
        C36241bY c36241bY = this.LJIILJJIL;
        if (cashier != null) {
            str9 = cashier.merchantUserId;
        } else {
            str9 = null;
        }
        c36241bY.LJIILLIIL = str9;
        if (cashier != null) {
            str10 = cashier.merchantId;
        } else {
            str10 = null;
        }
        c36241bY.LIZIZ = str10;
        c36241bY.LIZJ = String.valueOf(System.currentTimeMillis());
        C36241bY c36241bY2 = this.LJIILJJIL;
        if (cashier != null && (paymentParams5 = cashier.paymentParams) != null) {
            str11 = paymentParams5.chargeId;
        } else {
            str11 = null;
        }
        c36241bY2.LJI = str11;
        if (cashier != null && (paymentParams4 = cashier.paymentParams) != null) {
            str12 = paymentParams4.amountBeforePaymentPromotion;
        } else {
            str12 = null;
        }
        c36241bY2.LJFF = str12;
        if (cashier != null && (paymentParams3 = cashier.paymentParams) != null) {
            str13 = paymentParams3.currency;
        } else {
            str13 = null;
        }
        c36241bY2.LJIIIIZZ = str13;
        if (cashier != null) {
            str14 = cashier.nonce;
        } else {
            str14 = null;
        }
        c36241bY2.LJIILL = str14;
        if (cashier != null && (paymentParams2 = cashier.paymentParams) != null) {
            str15 = paymentParams2.paymentReference;
        } else {
            str15 = null;
        }
        c36241bY2.LJIIJ = str15;
        if (cashier != null) {
            str16 = cashier.riskInfo;
        } else {
            str16 = null;
        }
        if (C28034AzO.LIZ() && str18 != null) {
            try {
                Object fromJson2 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str16, C65330PkU.LIZJ(C65352Pkq.LJI(m.class)));
                m mVar = (m) (fromJson2 instanceof m ? fromJson2 : null);
                if (mVar != null) {
                    mVar.LJJIIZ("pre_risk_id", this.LJFF);
                    str16 = C27739Aud.LJI(mVar);
                }
            } catch (s unused2) {
            }
            str16 = null;
        }
        C36241bY c36241bY3 = this.LJIILJJIL;
        c36241bY3.LJIIL = str16;
        Cashier cashier2 = this.LJ;
        if (cashier2 != null && (paymentParams = cashier2.paymentParams) != null) {
            str17 = paymentParams.subMerchantId;
        } else {
            str17 = null;
        }
        c36241bY3.LJIILJJIL = str17;
        PaymentMethodInfo LIZ = SA5.LIZ(c28057Azl.LJII, true);
        String id = LIZ.getId();
        List<PaymentElement> paymentElements = LIZ.getPaymentElements();
        if (paymentElements != null) {
            arrayList = new ArrayList(C32I.LJJL(paymentElements, 10));
            for (PaymentElement paymentElement : paymentElements) {
                o.LJIIIZ(paymentElement, "<this>");
                C24040wy c24040wy = new C24040wy(paymentElement.getElement(), paymentElement.getParamName(), paymentElement.getParamValue());
                c24040wy.LIZLLL = paymentElement.isEncrypted().booleanValue();
                arrayList.add(c24040wy);
            }
        }
        C24060x0 c24060x0 = new C24060x0(id, arrayList);
        c24060x0.LIZIZ = LIZ.getToken();
        c36241bY3.LJIIIZ = c24060x0;
        C36241bY c36241bY4 = this.LJIILJJIL;
        PaymentInfo paymentInfo = c28057Azl.LJII;
        if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null && (isChooseSave = paymentMethodInfo.isChooseSave()) != null) {
            z = isChooseSave.booleanValue();
        } else {
            z = false;
        }
        c36241bY4.LJIILIIL = z;
        C36241bY c36241bY5 = this.LJIILJJIL;
        c36241bY5.LJII = c24080x2;
        c36241bY5.LJ = C113554cx.LJJJLZIJ(new OSZ("Referer", C71058Rug.LIZ()));
    }
}
