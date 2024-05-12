package X;

import com.bytedance.pipo.checkout.api.network.model.response.BankCardRules;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a6X, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92177a6X implements InterfaceC91946a2o<String> {
    public final /* synthetic */ C91828a0u LIZ;

    public C92177a6X(C91828a0u c91828a0u) {
        this.LIZ = c91828a0u;
    }

    @Override // X.InterfaceC91946a2o
    public final C92223a7H LIZ(String str) {
        BankCardRules bankCardRules;
        List<Integer> cardBrandLength;
        String it = str;
        o.LJIIIZ(it, "it");
        try {
            C91828a0u c91828a0u = this.LIZ;
            Iterator<BankCardRules> it2 = c91828a0u.LIZIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    bankCardRules = it2.next();
                    String cardBrandRegex = bankCardRules.getCardBrandRegex();
                    if (cardBrandRegex != null && new OJD(cardBrandRegex).matches(it)) {
                        break;
                    }
                } else {
                    bankCardRules = null;
                    break;
                }
            }
            c91828a0u.LIZLLL = bankCardRules;
            if (this.LIZ.LIZ && it.length() == 0) {
                return C91945a2n.LIZ("pipo_cashier_form_error_required");
            }
            C91828a0u c91828a0u2 = this.LIZ;
            BankCardRules bankCardRules2 = c91828a0u2.LIZLLL;
            if (bankCardRules2 == null) {
                return C91945a2n.LIZ("pipo_cashier_form_error_card_notsupport");
            }
            if (!ORZ.LJLJJI(bankCardRules2.getPaymentMethodId(), c91828a0u2.LIZJ)) {
                return C91945a2n.LIZ("pipo_cashier_form_error_card_notsupport");
            }
            BankCardRules bankCardRules3 = this.LIZ.LIZLLL;
            if (bankCardRules3 != null && (cardBrandLength = bankCardRules3.getCardBrandLength()) != null && cardBrandLength.contains(Integer.valueOf(it.length()))) {
                if (!C91962a34.LIZ(it)) {
                    return C91945a2n.LIZ("pipo_rule_common_invalid");
                }
                return C91945a2n.LIZIZ();
            }
            return C91945a2n.LIZ("pipo_cashier_form_error_card_length_invalid");
        } catch (Throwable unused) {
            return C91945a2n.LIZIZ();
        }
    }
}
