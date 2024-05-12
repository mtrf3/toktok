package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankCardRule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SCS {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List values) {
        String str;
        String str2;
        String str3;
        C24000wu c24000wu;
        String str4;
        o.LJIIIZ(elementDTO, "elementDTO");
        o.LJIIIZ(paymentMethod, "paymentMethod");
        o.LJIIIZ(values, "values");
        try {
            Integer num = elementDTO.styleType;
            int ordinal = EnumC28119B1v.CardNumber.ordinal();
            boolean z = false;
            if (num == null || num.intValue() != ordinal) {
                int ordinal2 = EnumC28119B1v.Date.ordinal();
                if (num == null || num.intValue() != ordinal2) {
                    int ordinal3 = EnumC28119B1v.Normal.ordinal();
                    if (num == null || num.intValue() != ordinal3) {
                        return null;
                    }
                    PaymentElement paymentElement = (PaymentElement) ORZ.LJLLLLLL(0, values);
                    if (paymentElement != null) {
                        str4 = paymentElement.getParamValue();
                    } else {
                        str4 = null;
                    }
                    C24000wu LIZLLL = C22780uw.LIZ.LIZLLL(paymentMethod.id, elementDTO.id, str4);
                    o.LJIIIIZZ(LIZLLL, "getECommerceService().is…              paramValue)");
                    if (LIZLLL.LIZ) {
                        return null;
                    }
                    String LIZ2 = LIZLLL.LIZ();
                    if (LIZ2 != null) {
                        return LIZ2;
                    }
                } else {
                    C276116n c276116n = C22780uw.LIZ;
                    String str5 = paymentMethod.id;
                    PaymentElement paymentElement2 = (PaymentElement) ORZ.LJLLLLLL(1, values);
                    if (paymentElement2 != null) {
                        str2 = paymentElement2.getParamValue();
                    } else {
                        str2 = null;
                    }
                    PaymentElement paymentElement3 = (PaymentElement) ORZ.LJLLLLLL(0, values);
                    if (paymentElement3 != null) {
                        str3 = paymentElement3.getParamValue();
                    } else {
                        str3 = null;
                    }
                    C24000wu LJ = c276116n.LJ(str5, str2, str3);
                    if (LJ.LIZLLL == null) {
                        LJ.LIZLLL = new ArrayList();
                    }
                    List<C24000wu> list = LJ.LIZLLL;
                    if (list != null) {
                        c24000wu = (C24000wu) ORZ.LJLLLLLL(0, list);
                    } else {
                        c24000wu = null;
                    }
                    if (!LJ.LIZ) {
                        String LIZ3 = LJ.LIZ();
                        if (LIZ3 != null) {
                            return LIZ3;
                        }
                    } else {
                        if (c24000wu != null && !c24000wu.LIZ) {
                            z = true;
                        }
                        if (!z) {
                            return null;
                        }
                        String LIZ4 = c24000wu.LIZ();
                        if (LIZ4 != null) {
                            return LIZ4;
                        }
                    }
                }
            } else {
                PaymentElement paymentElement4 = (PaymentElement) ORZ.LJLLLLLL(0, values);
                if (paymentElement4 != null) {
                    str = paymentElement4.getParamValue();
                } else {
                    str = null;
                }
                C24000wu LIZLLL2 = C22780uw.LIZ.LIZLLL(paymentMethod.id, elementDTO.id, str);
                if (LIZLLL2.LIZ) {
                    return null;
                }
                String LIZ5 = LIZLLL2.LIZ();
                if (LIZ5 != null) {
                    return LIZ5;
                }
            }
            return "";
        } catch (Exception unused) {
            return "system_error";
        }
    }

    public static boolean LIZ(String str, String str2, List list, List values) {
        BankCardRule bankCardRule;
        String str3;
        String str4;
        int[] iArr;
        int[] iArr2;
        Object obj;
        o.LJIIIZ(values, "values");
        Integer num = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (o.LJ(((BankCardRule) obj).paymentMethodId, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            bankCardRule = (BankCardRule) obj;
        } else {
            bankCardRule = null;
        }
        PaymentElement paymentElement = (PaymentElement) ORZ.LJLLLLLL(0, values);
        if (paymentElement != null) {
            str3 = paymentElement.getParamValue();
        } else {
            str3 = null;
        }
        PaymentElement paymentElement2 = (PaymentElement) ORZ.LJLLLLLL(1, values);
        if (paymentElement2 != null) {
            str4 = paymentElement2.getParamValue();
        } else {
            str4 = null;
        }
        if (str2 == null) {
            return false;
        }
        int hashCode = str2.hashCode();
        if (hashCode != -1030054939) {
            if (hashCode != 37481866) {
                if (hashCode != 2072584063 || !str2.equals("eg_ccdc_global_card_number") || bankCardRule == null || (iArr2 = bankCardRule.cardBrandLength) == null || iArr2.length != 1) {
                    return false;
                }
                if (str3 != null) {
                    num = Integer.valueOf(str3.length());
                }
                return o.LJ(num, ORY.LJJJJ(0, bankCardRule.cardBrandLength));
            }
            if (!str2.equals("eg_ccdc_global_cvv") || bankCardRule == null || (iArr = bankCardRule.cvvLength) == null || iArr.length != 1) {
                return false;
            }
            if (str3 != null) {
                num = Integer.valueOf(str3.length());
            }
            return o.LJ(num, ORY.LJJJJ(0, bankCardRule.cvvLength));
        }
        if (!str2.equals("eg_ccdc_global_expiration_date") || str3 == null || str3.length() != 2 || str4 == null || str4.length() != 2) {
            return false;
        }
        return true;
    }
}
