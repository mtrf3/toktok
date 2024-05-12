package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.checkout.api.network.model.response.CashierBasicInfoResponse;
import com.bytedance.pipo.checkout.api.network.model.response.CashierOptionList;
import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import com.bytedance.pipo.checkout.api.network.model.response.Methods;
import com.bytedance.pipo.checkout.api.network.model.response.StoredMethods;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.a3B, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91969a3B {
    public static final java.util.Map<String, Integer> LIZ;
    public static final java.util.Map<String, C11850dJ> LIZIZ;
    public static final java.util.Map<String, Integer> LIZJ;
    public static final java.util.Map<String, C92229a7N> LIZLLL;
    public static final java.util.Map<String, List<String>> LJ;
    public static final java.util.Map<String, String> LJFF;

    static {
        EnumC91967a39 enumC91967a39 = EnumC91967a39.CashPin;
        EnumC91967a39 enumC91967a392 = EnumC91967a39.InternetBanking;
        LIZ = C113554cx.LJJL(new OSZ(enumC91967a39.getValue(), 2), new OSZ(enumC91967a392.getValue(), 2), new OSZ(EnumC91967a39.DirectDebit.getValue(), 2));
        LIZIZ = C113554cx.LJJL(new OSZ(EnumC91954a2w.OVO.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4283184276L))), new OSZ(EnumC91954a2w.Dana.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4279537125L))), new OSZ(EnumC91954a2w.GoPay.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4278366169L))), new OSZ(EnumC91954a2w.Momo.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4288619112L))), new OSZ(EnumC91954a2w.ZaloPay.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4278438519L))), new OSZ(EnumC91954a2w.YooMoney.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4278274205L))), new OSZ(EnumC91954a2w.SamsungPay.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4280175558L))), new OSZ(EnumC91954a2w.WeChatPay.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4278827783L))), new OSZ(EnumC91954a2w.WeChatPayHK.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4278827783L))), new OSZ(EnumC91954a2w.Venmo.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4282226126L))), new OSZ(EnumC91954a2w.TrueMoney.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4293294379L))), new OSZ(EnumC91954a2w.TouchAndGo.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4278278589L))), new OSZ(EnumC91954a2w.TossPay.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4278215935L))), new OSZ(EnumC91954a2w.ShopeePay.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4293807405L))), new OSZ(EnumC91954a2w.RazerGold.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4293822474L))), new OSZ(EnumC91954a2w.LinePay.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4278240077L))), new OSZ(EnumC91954a2w.PayPal.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4278264169L))), new OSZ(EnumC91954a2w.Qiwi.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4294155520L))), new OSZ(EnumC91954a2w.PayMaya.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4278223819L))), new OSZ(EnumC91954a2w.Payoneer.getPaymentMethod(), new C11850dJ(C78897Uxp.LJFF(4294919680L))));
        LIZJ = C113554cx.LJJL(new OSZ(EnumC91951a2t.Visa.getId(), Integer.valueOf(R.drawable.kd)), new OSZ(EnumC91951a2t.MasterCard.getId(), Integer.valueOf(R.drawable.je)));
        LIZLLL = C113554cx.LJJL(new OSZ(EnumC91966a38.CardNumber.getType(), new C92229a7N("pipo_cashier_form_label_card_no", "pipo_cashier_form_placeholder_card_no", "Card number", "1234 5678 9012 3456")), new OSZ(EnumC91966a38.ExpirationDate.getType(), new C92229a7N("pipo_cashier_form_label_expdate", "pipo_cashier_form_placeholder_expdate", "Expiration date", "MM/YY")), new OSZ(EnumC91966a38.SecurityCode.getType(), new C92229a7N("pipo_cashier_form_label_cvv", "pipo_cashier_form_placeholder_cvv", "Security code", "CVV/CVC")), new OSZ(EnumC91966a38.CardHolderName.getType(), new C92229a7N("pipo_cashier_form_label_name", "", "Name", "")), new OSZ(EnumC91966a38.Email.getType(), new C92229a7N("pipo_cashier_form_label_email", "pipo_cashier_form_placeholder_email", "Email", "example@email.com")), new OSZ(EnumC91966a38.CPF.getType(), new C92229a7N("pipo_cashier_form_label_CPF", "pipo_cashier_form_placeholder_CPF", "CPF", "123.456.789-01")), new OSZ(EnumC91966a38.CNPJ.getType(), new C92229a7N("pipo_cashier_form_label_CNPJ", "pipo_cashier_form_placeholder_CNPJ", "CNPJ", "12.345.678/9012-34")), new OSZ(EnumC91966a38.MobilePhone.getType(), new C92229a7N("pipo_cashier_form_label_phone", "", "Phone number", "")), new OSZ(EnumC91966a38.BillingStreet.getType(), new C92229a7N("pipo_cashier_form_label_street", "", "Street address", "")), new OSZ(EnumC91966a38.BillingPostalCode.getType(), new C92229a7N("pipo_cashier_form_label_postcode", "", "Postal code", "")), new OSZ(EnumC91966a38.WalletID.getType(), new C92229a7N("pipo_cashier_form_label_walletID", "pipo_cashier_form_placeholder_walletID", "E-Wallet ID", "")));
        String value = EnumC91967a39.CCDC.getValue();
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        LJ = C113554cx.LJJL(new OSZ(value, c61878OQg), new OSZ(enumC91967a39.getValue(), c61878OQg), new OSZ(enumC91967a392.getValue(), c61878OQg), new OSZ(EnumC91967a39.BankTransfer.getValue(), C47261Igj.LJJIJ("pm_pi_bt_banktransfer_c_d")), new OSZ(EnumC91967a39.EWallet.getValue(), C47261Igj.LJJIJIIJI("pm_pi_ew_dana_c_r", "pm_pi_ew_truemoney_c_r", "pm_pi_ew_gcash_c_r", "pm_pi_ew_gopay_c_r", "pm_pi_ew_gopay_c_d", "pm_pi_ew_ovo_c_d", "pm_pi_ew_ovo_c_r", "pm_pi_ew_momo_c_r", "pm_pi_ew_touchngo_c_r", "pm_pi_ew_paypal_c_d", "pm_pi_ew_paypal_c_r", "pm_pi_ew_zalopay_c_r", "pm_pi_ew_grabpay_c_r", "pm_pi_ew_razergold_c_r", "pm_pi_ew_linepay_c_r")), new OSZ(EnumC91967a39.BankAccountProxy.getValue(), C47261Igj.LJJIJIIJI("pm_pi_bap_pix_c_d", "pm_pi_bap_promptpay_c_r")), new OSZ(EnumC91967a39.Aggregator.getValue(), C47261Igj.LJJIJIIJI("pm_pi_agg_toss_c_r", "pm_pi_agg_klarna_c_r")));
        LJFF = C113554cx.LJJL(new OSZ("en-CA", "en"), new OSZ("en-GB", "en"), new OSZ("en-US", "en"), new OSZ("es", "es-ES"), new OSZ("fr-CA", "fr"), new OSZ("fr-FR", "fr"), new OSZ("ja-JP", "ja"), new OSZ("pt", "pt-BR"));
    }

    public static final CashierBasicInfoResponse LIZ(CashierBasicInfoResponse cashierBasicInfoResponse) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List<Methods> methods = cashierBasicInfoResponse.getMethods();
        ArrayList arrayList4 = null;
        if (methods == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Methods methods2 : methods) {
                Methods methods3 = methods2;
                if (LJIIJ(methods3.getPaymentMethodType(), methods3.getPaymentMethodId())) {
                    arrayList.add(methods2);
                }
            }
        }
        List<StoredMethods> storedMethods = cashierBasicInfoResponse.getStoredMethods();
        if (storedMethods == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList();
            for (StoredMethods storedMethods2 : storedMethods) {
                StoredMethods storedMethods3 = storedMethods2;
                if (LJIIJ(storedMethods3.getPaymentMethodType(), storedMethods3.getPaymentMethodId())) {
                    arrayList2.add(storedMethods2);
                }
            }
        }
        List<Methods> unavailableMethods = cashierBasicInfoResponse.getUnavailableMethods();
        if (unavailableMethods == null) {
            arrayList3 = null;
        } else {
            arrayList3 = new ArrayList();
            for (Methods methods4 : unavailableMethods) {
                Methods methods5 = methods4;
                if (LJIIJ(methods5.getPaymentMethodType(), methods5.getPaymentMethodId()) && !o.LJ(methods5.getPaymentMethodType(), EnumC91967a39.CCDC.getValue())) {
                    arrayList3.add(methods4);
                }
            }
        }
        List<StoredMethods> unavailableStoredMethods = cashierBasicInfoResponse.getUnavailableStoredMethods();
        if (unavailableStoredMethods != null) {
            arrayList4 = new ArrayList();
            for (StoredMethods storedMethods4 : unavailableStoredMethods) {
                StoredMethods storedMethods5 = storedMethods4;
                if (LJIIJ(storedMethods5.getPaymentMethodType(), storedMethods5.getPaymentMethodId())) {
                    arrayList4.add(storedMethods4);
                }
            }
        }
        return CashierBasicInfoResponse.copy$default(cashierBasicInfoResponse, null, null, null, arrayList, arrayList2, null, null, arrayList3, arrayList4, 103, null);
    }

    public static final String LIZJ(CashierOptionList cashierOptionList) {
        String key;
        String name;
        String str = "";
        if (cashierOptionList == null || (key = cashierOptionList.getKey()) == null) {
            key = "";
        }
        String LIZ2 = C92054a4Y.LIZ(key, new String[0]);
        if (LIZ2.length() == 0) {
            if (cashierOptionList != null && (name = cashierOptionList.getName()) != null) {
                str = name;
            }
            return str;
        }
        return LIZ2;
    }

    public static final EnumC91839a15 LIZLLL(String str) {
        try {
            for (EnumC91839a15 enumC91839a15 : EnumC91839a15.values()) {
                if (ujb.o.LJJJJIZL(enumC91839a15.getType(), str, true)) {
                    return enumC91839a15;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (NoSuchElementException unused) {
            return EnumC91839a15.UNKNOWN;
        }
    }

    public static final CashierOptionList LJ(Methods method) {
        Elements elements;
        List<CashierOptionList> cashierOptionList;
        o.LJIIIZ(method, "method");
        List<Elements> elements2 = method.getElements();
        Object obj = null;
        if (elements2 == null) {
            return null;
        }
        Iterator<Elements> it = elements2.iterator();
        while (true) {
            if (it.hasNext()) {
                elements = it.next();
                if (o.LJ(elements.getParamName(), EnumC91966a38.BankCode.getType())) {
                    break;
                }
            } else {
                elements = null;
                break;
            }
        }
        Elements elements3 = elements;
        if (elements3 == null || (cashierOptionList = elements3.getCashierOptionList()) == null) {
            return null;
        }
        if (!cashierOptionList.isEmpty()) {
            obj = ORZ.LJLLJ(cashierOptionList);
        }
        return (CashierOptionList) obj;
    }

    public static final String LJIIIIZZ(Methods method) {
        String LIZ2;
        String paymentMethod;
        o.LJIIIZ(method, "method");
        String starlingKey = method.getStarlingKey();
        boolean z = false;
        if (starlingKey == null || (LIZ2 = C92054a4Y.LIZ(starlingKey, new String[0])) == null || LIZ2.length() == 0) {
            String displayName = method.getDisplayName();
            if (displayName == null || displayName.length() == 0) {
                z = true;
            }
            if (!z) {
                paymentMethod = method.getDisplayName();
                if (paymentMethod == null) {
                    return "";
                }
            } else {
                paymentMethod = method.getPaymentMethod();
                if (paymentMethod == null) {
                    return "";
                }
            }
            return paymentMethod;
        }
        return LIZ2;
    }

    public static final EnumC91837a13 LJIIJJI(Boolean bool) {
        if (bool == null) {
            return EnumC91837a13.UNKNOWN;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            return EnumC91837a13.Prepaid;
        }
        if (o.LJ(bool, Boolean.FALSE)) {
            return EnumC91837a13.NonPrepaid;
        }
        throw new C162476Zf();
    }

    public static final String LJIIL(String str) {
        String str2;
        String str3 = "pipo_common_payment_method_unavailable_reason4";
        if (str != null) {
            switch (str.hashCode()) {
                case -889391006:
                    if (str.equals("sy0084")) {
                        str3 = "pipo_common_payment_method_unavailable_reason5";
                        break;
                    }
                    break;
                case -889391003:
                    if (str.equals("sy0087")) {
                        str3 = "pipo_common_payment_method_unavailable_reason3";
                        break;
                    }
                    break;
                case -889391002:
                    str2 = "sy0088";
                    str.equals(str2);
                    break;
                case -889391001:
                    if (str.equals("sy0089")) {
                        str3 = "pipo_common_payment_method_unavailable_reason6";
                        break;
                    }
                    break;
                case -869073787:
                    str2 = "tp0009";
                    str.equals(str2);
                    break;
                case -869073730:
                    if (str.equals("tp0024")) {
                        str3 = "pipo_common_payment_method_unavailable_reason1";
                        break;
                    }
                    break;
                case -869073664:
                    if (str.equals("tp0048")) {
                        str3 = "pipo_common_payment_method_unavailable_reason2";
                        break;
                    }
                    break;
            }
        }
        return C92054a4Y.LIZ(str3, new String[0]);
    }

    public static final boolean LJIILIIL(InterfaceC91961a33 method) {
        o.LJIIIZ(method, "method");
        if ((method instanceof C92231a7P) && o.LJ(((C92231a7P) method).LJLIL.getPaymentMethodType(), EnumC91967a39.CCDC.getValue())) {
            return true;
        }
        return false;
    }

    public static final List<StoredMethods> LJIILJJIL(List<StoredMethods> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (StoredMethods storedMethods : list) {
            if (o.LJ(storedMethods.isPrimary(), Boolean.TRUE)) {
                ListProtector.add(arrayList, 0, storedMethods);
            } else {
                arrayList.add(storedMethods);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0164, code lost:
    
        if (r15 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0182, code lost:
    
        if (r15 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.pipo.checkout.api.network.model.response.Methods LIZIZ(com.bytedance.pipo.checkout.api.network.model.response.Methods r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91969a3B.LIZIZ(com.bytedance.pipo.checkout.api.network.model.response.Methods, java.lang.String):com.bytedance.pipo.checkout.api.network.model.response.Methods");
    }

    public static final String LJFF(Elements elements, C92229a7N c92229a7N) {
        String str;
        String str2;
        String paramName;
        if (c92229a7N == null) {
            java.util.Map<String, C92229a7N> map = LIZLLL;
            if (elements == null) {
                paramName = null;
            } else {
                paramName = elements.getParamName();
            }
            c92229a7N = map.get(paramName);
        }
        if (c92229a7N == null || (str = c92229a7N.LJLIL) == null) {
            str = "";
        }
        String LIZ2 = C92054a4Y.LIZ(str, new String[0]);
        if (LIZ2.length() > 0) {
            return LIZ2;
        }
        if (c92229a7N == null || (str2 = c92229a7N.LJLJI) == null) {
            return "";
        }
        return str2;
    }

    public static final String LJI(Elements elements, C92229a7N c92229a7N) {
        String str;
        String str2;
        String paramName;
        if (c92229a7N == null) {
            java.util.Map<String, C92229a7N> map = LIZLLL;
            if (elements == null) {
                paramName = null;
            } else {
                paramName = elements.getParamName();
            }
            c92229a7N = map.get(paramName);
        }
        if (c92229a7N == null || (str = c92229a7N.LJLILLLLZI) == null) {
            str = "";
        }
        String LIZ2 = C92054a4Y.LIZ(str, new String[0]);
        if (LIZ2.length() > 0) {
            return LIZ2;
        }
        if (c92229a7N == null || (str2 = c92229a7N.LJLJJI) == null) {
            return "";
        }
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v7, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.ArrayList] */
    public static final List<InterfaceC91961a33> LJIIIZ(List<Methods> list, List<StoredMethods> list2) {
        int i;
        int i2;
        int i3;
        Elements elements;
        Elements elements2;
        ?? r11;
        int intValue;
        ArrayList arrayList = new ArrayList();
        if (list2 != null) {
            Iterator<StoredMethods> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new C92233a7R(it.next()));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i4 = -1;
        if (list == null) {
            i = -1;
            i2 = 0;
            i3 = 0;
        } else {
            C92231a7P c92231a7P = null;
            i = -1;
            i2 = 0;
            i3 = 0;
            for (Methods methods : list) {
                String paymentMethodType = methods.getPaymentMethodType();
                if (o.LJ(paymentMethodType, EnumC91967a39.CCDC.getValue())) {
                    if (c92231a7P == null) {
                        c92231a7P = new C92231a7P(methods);
                        arrayList.add(c92231a7P);
                    }
                } else {
                    EnumC91967a39 enumC91967a39 = EnumC91967a39.CashPin;
                    if (o.LJ(paymentMethodType, enumC91967a39.getValue())) {
                        if (arrayList3.isEmpty()) {
                            i4 = arrayList.size();
                            arrayList.add(new C92230a7O(arrayList3, enumC91967a39.getValue()));
                        }
                        arrayList3.add(new C92231a7P(methods));
                        i2++;
                    } else {
                        EnumC91967a39 enumC91967a392 = EnumC91967a39.InternetBanking;
                        if (o.LJ(paymentMethodType, enumC91967a392.getValue())) {
                            if (arrayList2.isEmpty()) {
                                i = arrayList.size();
                                arrayList.add(new C92230a7O(arrayList2, enumC91967a392.getValue()));
                            }
                            arrayList2.add(new C92231a7P(methods));
                            i3++;
                        } else if (o.LJ(paymentMethodType, EnumC91967a39.BankTransfer.getValue())) {
                            List<Elements> elements3 = methods.getElements();
                            if (elements3 == null) {
                                elements2 = null;
                            } else {
                                Iterator<Elements> it2 = elements3.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        elements = it2.next();
                                        if (o.LJ(elements.getParamName(), EnumC91966a38.BankCode.getType())) {
                                            break;
                                        }
                                    } else {
                                        elements = null;
                                        break;
                                    }
                                }
                                elements2 = elements;
                            }
                            if (elements2 != null) {
                                try {
                                    List<CashierOptionList> cashierOptionList = elements2.getCashierOptionList();
                                    if (cashierOptionList != null) {
                                        r11 = new ArrayList(C32I.LJJL(cashierOptionList, 10));
                                        Iterator<CashierOptionList> it3 = cashierOptionList.iterator();
                                        while (it3.hasNext()) {
                                            r11.add(new C92231a7P(LIZIZ(methods, it3.next().getValue())));
                                        }
                                    } else {
                                        r11 = 0;
                                    }
                                    if (r11 == 0) {
                                        r11 = C61878OQg.INSTANCE;
                                    }
                                } catch (Throwable unused) {
                                    r11 = C61878OQg.INSTANCE;
                                }
                                if (arrayList4.isEmpty()) {
                                    arrayList.add(new C92230a7O(arrayList4, EnumC91967a39.BankTransfer.getValue()));
                                }
                                arrayList4.addAll(r11);
                            } else {
                                arrayList.add(new C92231a7P(methods));
                            }
                        } else {
                            arrayList.add(new C92231a7P(methods));
                        }
                    }
                }
            }
        }
        java.util.Map<String, Integer> map = LIZ;
        Integer num = map.get(EnumC91967a39.CashPin.getValue());
        int i5 = 2;
        if (num == null) {
            intValue = 2;
        } else {
            intValue = num.intValue();
        }
        if (i2 < intValue && (!arrayList3.isEmpty())) {
            ListProtector.remove(arrayList, i4);
            arrayList.addAll(i4, arrayList3);
        }
        Integer num2 = map.get(EnumC91967a39.InternetBanking.getValue());
        if (num2 != null) {
            i5 = num2.intValue();
        }
        if (i3 < i5 && (!arrayList2.isEmpty())) {
            ListProtector.remove(arrayList, i);
            arrayList.addAll(i, arrayList2);
        }
        return arrayList;
    }

    public static boolean LJIIJ(String str, String str2) {
        java.util.Map<String, List<String>> map = LJ;
        if (!ORZ.LJLJJI(str, map.keySet())) {
            return false;
        }
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return true;
        }
        return ORZ.LJLJJI(str2, list);
    }

    public static final String LJII(String str, String str2, boolean z) {
        if (z) {
            if (str != null) {
                return str;
            }
        } else if (str2 == null || str2.length() == 0) {
            if (str != null) {
                return str;
            }
        } else {
            return str2;
        }
        return "";
    }
}
