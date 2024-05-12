package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankCardRule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SEW implements InterfaceC71754SEc {
    public static final List<String> LIZIZ = C47261Igj.LJJIJIIJI("eg_pi_vnatmcard_c_d_issue_date_card_number", "eg_pi_vnatmcard_c_d_expiration_date_card_number");
    public final C0UE LIZ;

    public SEW(C0UE c0ue) {
        this.LIZ = c0ue;
    }

    @Override // X.InterfaceC71754SEc
    public final SEX LIZ(String... values) {
        boolean z;
        String str;
        int[] iArr;
        String msg;
        o.LJIIIZ(values, "values");
        SEX sex = new SEX(0);
        if (values.length == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (!z) {
            str = values[0];
        } else {
            str = null;
        }
        BankCardRule LIZ = this.LIZ.LIZ(str);
        if (LIZ != null) {
            str2 = LIZ.paymentMethodId;
        }
        PaymentMethod LIZIZ2 = this.LIZ.LIZIZ(str);
        if (str == null || str.length() == 0) {
            sex.LIZJ("pipo_common_error_required_field", "pipo_common_payin_card_number");
        } else if (str2 != null && LIZIZ2 == null) {
            sex.LIZJ("pipo_common_error_card_not_supported", new String[0]);
        } else if (LIZIZ2 != null) {
            C0UE c0ue = this.LIZ;
            String str3 = LIZIZ2.id;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0ue.LIZIZ;
            if (str3 == null) {
                str3 = "";
            }
            BankCardRule bankCardRule = (BankCardRule) concurrentHashMap.get(str3);
            if (bankCardRule != null && (iArr = bankCardRule.cardBrandLength) != null && ORY.LJJIJ(str.length(), iArr)) {
                if (!Pattern.matches("^[0-9]+$", str)) {
                    sex.LIZJ("pipo_common_error_card_check", new String[0]);
                } else if (!C78977Uz7.LJJJJLL(str)) {
                    sex.LIZJ("pipo_common_error_card_number", new String[0]);
                } else {
                    Availability availability = LIZIZ2.availability;
                    if (availability == null || !o.LJ(availability.isAvailable, Boolean.TRUE)) {
                        PaymentTip paymentTip = LIZIZ2.paymentTip;
                        if (paymentTip == null || (msg = paymentTip.tips) == null || msg.length() == 0) {
                            sex.LIZJ("pipo_common_error_card_not_supported", new String[0]);
                        } else {
                            o.LJIIIZ(msg, "msg");
                            sex.LIZ = msg;
                        }
                    }
                }
            } else {
                sex.LIZJ("pipo_common_error_card_number_length", new String[0]);
            }
        } else {
            sex.LIZJ("pipo_common_error_card_number", new String[0]);
        }
        return sex;
    }
}
