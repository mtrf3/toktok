package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankCardRule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CardRules;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SEY {
    public static final C0UE LIZ = new C0UE();
    public static int LIZIZ = 19;

    public static void LIZ(PaymentMethodsData paymentMethodsData) {
        CardRules cardRules;
        CardRules cardRules2;
        List<BankCardRule> list;
        int i;
        List<CardRules> list2 = paymentMethodsData.cardRules;
        List<BankCardRule> list3 = null;
        if (list2 != null) {
            Iterator<CardRules> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    cardRules2 = it.next();
                    if (o.LJ(cardRules2.id, "pm_pi_atmcard_all")) {
                        break;
                    }
                } else {
                    cardRules2 = null;
                    break;
                }
            }
            cardRules = cardRules2;
            if (cardRules != null && (list = cardRules.rules) != null) {
                Iterator<BankCardRule> it2 = list.iterator();
                while (it2.hasNext()) {
                    int[] iArr = it2.next().cardBrandLength;
                    if (iArr != null) {
                        i = ORY.LJJL(iArr);
                    } else {
                        i = LIZIZ;
                    }
                    int i2 = LIZIZ;
                    if (i < i2) {
                        i = i2;
                    }
                    LIZIZ = i;
                }
            }
        } else {
            cardRules = null;
        }
        C0UE c0ue = LIZ;
        if (cardRules != null) {
            list3 = cardRules.rules;
        }
        ((ConcurrentHashMap) c0ue.LIZIZ).clear();
        C71753SEb c71753SEb = new C71753SEb();
        Iterator<String> it3 = C71753SEb.LIZ.iterator();
        while (it3.hasNext()) {
            ((ConcurrentHashMap) c0ue.LIZ).put(it3.next(), c71753SEb);
        }
        SEZ sez = new SEZ();
        Iterator<String> it4 = SEZ.LIZ.iterator();
        while (it4.hasNext()) {
            ((ConcurrentHashMap) c0ue.LIZ).put(it4.next(), sez);
        }
        C71752SEa c71752SEa = new C71752SEa();
        Iterator<String> it5 = C71752SEa.LIZ.iterator();
        while (it5.hasNext()) {
            ((ConcurrentHashMap) c0ue.LIZ).put(it5.next(), c71752SEa);
        }
        SEW sew = new SEW(c0ue);
        Iterator<String> it6 = SEW.LIZIZ.iterator();
        while (it6.hasNext()) {
            ((ConcurrentHashMap) c0ue.LIZ).put(it6.next(), sew);
        }
        if (list3 != null) {
            for (BankCardRule bankCardRule : list3) {
                ((ConcurrentHashMap) c0ue.LIZIZ).put(bankCardRule.paymentMethodId, bankCardRule);
            }
        }
    }
}
