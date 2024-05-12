package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS0S2010000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B1K {
    public static final String[] LJIIJ;
    public static final String[] LJIIJJI;
    public static PaymentMethod LJIIL;
    public static PaymentMethod LJIILIIL;
    public final LinkedHashMap<String, Object> LIZ;
    public final List<String> LIZIZ;
    public final List<String> LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;
    public long LJFF;
    public long LJI;
    public final java.util.Map<String, Long> LJII;
    public boolean LJIIIIZZ;
    public final java.util.Map<String, Long> LJIIIZ;

    static {
        String[] strArr = new String[4];
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            String str = ",card_number";
            while (true) {
                strArr[i2] = str;
                i2++;
                if (i2 >= 4) {
                    break loop0;
                }
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                str = null;
                            } else {
                                str = ",card_holder";
                            }
                        } else {
                            str = ",code";
                        }
                    } else {
                        str = ",date";
                    }
                }
            }
        }
        LJIIJ = strArr;
        String[] strArr2 = new String[4];
        do {
            strArr2[i] = LJIIJ[i];
            i++;
        } while (i < 4);
        LJIIJJI = strArr2;
    }

    public B1K(EnterParams enterParams) {
        o.LJIIIZ(enterParams, "enterParams");
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        this.LIZ = linkedHashMap;
        this.LIZIZ = new ArrayList();
        this.LIZJ = new ArrayList();
        this.LIZLLL = new ArrayList();
        this.LJ = new ArrayList();
        this.LJII = new LinkedHashMap();
        this.LJIIIZ = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "payment_method");
        linkedHashMap.put("is_fullscreen", Integer.valueOf(!enterParams.LIZ ? 1 : 0));
        HashMap<String, Object> hashMap = enterParams.trackParams;
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
    }

    public static String LJIJ(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 98896) {
                if (hashCode != 98915) {
                    if (hashCode != 766686014 || !str.equals("expiration_date")) {
                        return str;
                    }
                    return "date";
                }
                if (!str.equals("cvv")) {
                    return str;
                }
            } else if (!str.equals("cvc")) {
                return str;
            }
            return "code";
        }
        return "";
    }

    public final long LIZ(String str) {
        Long l = (Long) ((LinkedHashMap) this.LJIIIZ).get(str);
        if (l != null) {
            long longValue = l.longValue();
            this.LJIIIZ.remove(str);
            return SystemClock.elapsedRealtime() - longValue;
        }
        return 0L;
    }

    public final void LIZIZ(String inputBoxName) {
        o.LJIIIZ(inputBoxName, "inputBoxName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("input_box_name", inputBoxName);
        C76542zS.LIZ("tiktokec_input_click", linkedHashMap);
    }

    public final void LIZLLL(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("button_name", str);
        C76542zS.LIZ("tiktokec_button_show", linkedHashMap);
    }

    public final void LJFF(PaymentMethod paymentMethod) {
        if (((ArrayList) this.LIZJ).contains(paymentMethod.LJFF())) {
            return;
        }
        LJIIL("edit");
        ((ArrayList) this.LIZJ).add(paymentMethod.LJFF());
    }

    public final void LJI(PaymentMethod paymentMethod) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("button_name", "info");
        linkedHashMap.put("option_name", paymentMethod.LJIIL());
        linkedHashMap.put("option_type", "payment_type");
        C76542zS.LIZ("tiktokec_button_click", linkedHashMap);
    }

    public final void LJII(PaymentMethod paymentMethod) {
        if (((ArrayList) this.LJ).contains(paymentMethod.LJFF())) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("button_name", "info");
        linkedHashMap.put("option_name", paymentMethod.LJIIL());
        linkedHashMap.put("option_type", "payment_type");
        C76542zS.LIZ("tiktokec_button_show", linkedHashMap);
        ((ArrayList) this.LJ).add(paymentMethod.LJFF());
    }

    public final void LJIIL(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("button_name", str);
        C76542zS.LIZ("tiktokec_button_show", linkedHashMap);
    }

    public final void LJIJI(String str) {
        this.LJIIIZ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public final void LJ(PaymentMethod paymentMethod, String event) {
        String str;
        o.LJIIIZ(paymentMethod, "paymentMethod");
        o.LJIIIZ(event, "event");
        String LJIIL2 = paymentMethod.LJIIL();
        boolean LJJJIL = C78857UxB.LJJJIL(paymentMethod.extraInfo);
        BindInfo bindInfo = paymentMethod.bindInfo;
        if (bindInfo != null) {
            str = bindInfo.bindStatus;
        } else {
            str = null;
        }
        C76542zS.LIZIZ(event, this.LIZ, new AqS0S2010000_4(LJIIL2, LJJJIL, str, 0));
    }

    public final void LIZJ(long j, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("input_box_name", str);
        linkedHashMap.put("stay_time", String.valueOf(j));
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("input_method", str2);
        C76542zS.LIZ("tiktokec_input_staytime", linkedHashMap);
    }

    public static /* synthetic */ void LJIIJJI(B1K b1k, String str, String str2, String str3, int i) {
        String[] strArr;
        String str4 = str3;
        if ((i & 8) != 0) {
            strArr = LJIIJ;
        } else {
            strArr = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        b1k.LJIIJ(str, str2, null, strArr, null, str4, null, null, null, null, null, null);
    }

    public final void LJIIIIZZ(Boolean bool, String str, String str2, String focused, boolean z) {
        o.LJIIIZ(focused, "focused");
        if (o.LJ(focused, str2)) {
            return;
        }
        LJIILIIL(bool, str, str2, "card_number_ocr", z);
        LIZJ(LIZ(str2), str2, "card_number_ocr");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIZ(long j, Integer num, String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = this.LIZ.get("EVENT_ORIGIN_FEATURE");
        String str4 = "";
        if (obj == null) {
            obj = "";
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", obj);
        Object obj2 = this.LIZ.get("entrance_info");
        if (obj2 != 0) {
            str4 = obj2;
        }
        linkedHashMap.put("entrance_info", str4);
        linkedHashMap.put("page_name", "payment_method");
        linkedHashMap.put("previous_page", "order_submit");
        linkedHashMap.put("quit_type", str);
        linkedHashMap.put("stay_time", Long.valueOf(j));
        if (num != null) {
            num.intValue();
            linkedHashMap.put("ocr_mode", V1M.LJJJJZI(num.intValue()));
        }
        if (str2 != null) {
            linkedHashMap.put("is_valid", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("if_same_with_last_auto_result", str3);
        }
        C76542zS.LIZ("tiktokec_scan_result", linkedHashMap);
    }

    public final void LJIILIIL(Boolean bool, String str, String str2, String str3, boolean z) {
        C76542zS.LIZIZ("tiktokec_input_result", this.LIZ, new B1L(bool, str, str2, str3, z));
    }

    public static /* synthetic */ void LJIILJJIL(B1K b1k, String str, boolean z, String str2, String str3, int i) {
        String str4 = str3;
        if ((i & 8) != 0) {
            str4 = null;
        }
        b1k.LJIILIIL(null, str, str2, str4, z);
    }

    public final void LJIILL(String str, PaymentMethod paymentMethod, boolean z, Boolean bool, String str2, Integer num) {
        this.LJFF = SystemClock.elapsedRealtime() - this.LJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("stay_time", Long.valueOf(this.LJFF));
        linkedHashMap.put("is_load_data", 1);
        linkedHashMap.put("quit_type", str);
        linkedHashMap.put("is_card_save", Integer.valueOf(z ? 1 : 0));
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap.put("is_use_ocr", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (str2 != null) {
            linkedHashMap.put("is_edit_ocr_result", str2);
        }
        if (num != null) {
            num.intValue();
            linkedHashMap.put("ocr_mode", V1M.LJJJJZI(num.intValue()));
        }
        if (paymentMethod != null) {
            linkedHashMap.put("pay_type", paymentMethod.LJIIL());
        }
        C76542zS.LIZ("tiktokec_stay_page", linkedHashMap);
    }

    public final void LJIILLIIL(String parentOptionName, String optionName, int i, boolean z, String str, Boolean bool, InstallmentPlan installmentPlan, String str2) {
        String str3;
        o.LJIIIZ(parentOptionName, "parentOptionName");
        o.LJIIIZ(optionName, "optionName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("parent_option_name", parentOptionName);
        linkedHashMap.put("option_name", optionName);
        linkedHashMap.put("option_type", "sub_payment_type");
        linkedHashMap.put("rank", Integer.valueOf(i));
        linkedHashMap.put("is_option_discounted", Integer.valueOf(z ? 1 : 0));
        if (str != null && str.length() != 0) {
            linkedHashMap.put("status_code", str);
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            linkedHashMap.put("is_default", V1M.LJJJJZ(bool.booleanValue()));
        } else {
            linkedHashMap.put("is_default", V1M.LJJJJZ(false));
        }
        if (installmentPlan != null) {
            Amount amount = installmentPlan.totalFee;
            if (amount == null || (str3 = amount.priceStr) == null) {
                str3 = "";
            }
            linkedHashMap.put("service_fee", str3);
            String str4 = installmentPlan.tenure;
            if (str4 == null) {
                str4 = "";
            }
            linkedHashMap.put("installment_cnt", str4);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("total_payment", str2);
        }
        C76542zS.LIZ("tiktokec_select_option", linkedHashMap);
    }

    public final void LJIIZILJ(String str, String optionName, int i, boolean z, String str2, Boolean bool, InstallmentPlan installmentPlan, String str3) {
        String str4;
        o.LJIIIZ(optionName, "optionName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("parent_option_name", str);
        linkedHashMap.put("option_name", optionName);
        linkedHashMap.put("option_type", "sub_payment_type");
        linkedHashMap.put("is_option_discounted", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("rank", Integer.valueOf(i));
        if (str2 != null && str2.length() != 0) {
            linkedHashMap.put("status_code", str2);
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            linkedHashMap.put("is_default", 1);
        }
        if (installmentPlan != null) {
            Amount amount = installmentPlan.totalFee;
            if (amount == null || (str4 = amount.priceStr) == null) {
                str4 = "";
            }
            linkedHashMap.put("service_fee", str4);
            String str5 = installmentPlan.tenure;
            if (str5 == null) {
                str5 = "";
            }
            linkedHashMap.put("installment_cnt", str5);
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put("total_payment", str3);
        }
        C76542zS.LIZ("tiktokec_option_show", linkedHashMap);
    }

    public final void LJIIJ(String buttonName, String str, String str2, String[] paymentInfoFinish, Boolean bool, String str3, String str4, Boolean bool2, String str5, Integer num, String str6, String str7) {
        String substring;
        o.LJIIIZ(buttonName, "buttonName");
        o.LJIIIZ(paymentInfoFinish, "paymentInfoFinish");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("button_name", buttonName);
        linkedHashMap.put("option_type", "payment_type");
        if (str != null) {
            linkedHashMap.put("pay_type", str);
            linkedHashMap.put("option_name", str);
        }
        if (o.LJ(str, "CCDC") || o.LJ(str7, "CCDC")) {
            if (str2 != null) {
                try {
                    linkedHashMap.put("is_card_save", str2);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
            String str8 = "";
            int i = 0;
            do {
                if (LJIIJJI[i] != null || paymentInfoFinish[i] != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str8);
                    LIZ.append(LJIIJ[i]);
                    str8 = X1D.LIZIZ(LIZ);
                }
                i++;
            } while (i < 4);
            if (str8.length() == 0) {
                substring = "1";
            } else {
                substring = str8.substring(1);
                o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            }
            C3C5.m7constructorimpl(linkedHashMap.put("payment_info_finish", substring));
        }
        if (bool2 != null) {
            bool2.booleanValue();
            linkedHashMap.put("is_use_ocr", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (str5 != null) {
            linkedHashMap.put("is_edit_ocr_result", str5);
        }
        if (num != null) {
            num.intValue();
            linkedHashMap.put("ocr_mode", V1M.LJJJJZI(num.intValue()));
        }
        if (bool != null) {
            linkedHashMap.put("is_pay_saved", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (str3 != null && str3.length() > 0) {
            linkedHashMap.put("pay_bind_status", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("total_payment", str4);
        }
        if (str6 != null) {
            linkedHashMap.put("installment_cnt", str6);
        }
        C76542zS.LIZ("tiktokec_button_click", linkedHashMap);
    }
}
