package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C07670Rv;
import X.C32I;
import X.C78685UuP;
import X.InterfaceC65349Pkn;
import X.InterfaceC88472Yns;
import X.ORY;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentMethodsData {
    public PaymentMethod LIZ;
    public List<PaymentMethod> LIZIZ;

    @InterfaceC65349Pkn("bank_card_rules")
    public final List<BankCardRule> bankCardRules;

    @InterfaceC65349Pkn("payment_card_rules")
    public final List<CardRules> cardRules;

    @InterfaceC65349Pkn("certification")
    public final PaymentCertification certification;

    @InterfaceC65349Pkn("consultation_id")
    public final String consultationId;

    @InterfaceC65349Pkn("encode_key")
    public final String encodeKey;

    @InterfaceC65349Pkn("payment_guarantee_info")
    public final PaymentGuaranteeInfo guaranteeInfo;

    @InterfaceC65349Pkn("methods_photos")
    public final Photos methodsPhotos;

    @InterfaceC65349Pkn("payment_methods")
    public final List<PaymentMethod> paymentMethods;

    @InterfaceC65349Pkn("methods_text")
    public final String paymentMethodsText;

    @InterfaceC65349Pkn("payment_policy")
    public final PaymentMethodPolicy paymentPolicy;

    @InterfaceC65349Pkn("pipo_host")
    public final String pipoHost;

    @InterfaceC65349Pkn("recommend_payment_method")
    public final PaymentMethod recommendPaymentMethod;

    @InterfaceC65349Pkn("recommend_payment_methods")
    public final List<PaymentMethod> recommendPaymentMethods;

    @InterfaceC65349Pkn("secure_payment")
    public final UserTrustItem securePayment;

    @InterfaceC65349Pkn("stored_method_show_count")
    public final Integer storedMethodShowCount;

    @InterfaceC65349Pkn("stored_methods")
    public final List<PaymentMethod> storedMethods;

    public final List<PaymentMethod> LIZIZ() {
        List LJJLI = C32I.LJJLI(ORY.LJJIJLIJ(new List[]{this.paymentMethods, this.storedMethods}));
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJJLI) {
            if (((PaymentMethod) obj).LIZ()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodsData)) {
            return false;
        }
        PaymentMethodsData paymentMethodsData = (PaymentMethodsData) obj;
        return o.LJ(this.paymentMethods, paymentMethodsData.paymentMethods) && o.LJ(this.recommendPaymentMethod, paymentMethodsData.recommendPaymentMethod) && o.LJ(this.recommendPaymentMethods, paymentMethodsData.recommendPaymentMethods) && o.LJ(this.storedMethods, paymentMethodsData.storedMethods) && o.LJ(this.cardRules, paymentMethodsData.cardRules) && o.LJ(this.paymentPolicy, paymentMethodsData.paymentPolicy) && o.LJ(this.storedMethodShowCount, paymentMethodsData.storedMethodShowCount) && o.LJ(this.encodeKey, paymentMethodsData.encodeKey) && o.LJ(this.pipoHost, paymentMethodsData.pipoHost) && o.LJ(this.paymentMethodsText, paymentMethodsData.paymentMethodsText) && o.LJ(this.methodsPhotos, paymentMethodsData.methodsPhotos) && o.LJ(this.certification, paymentMethodsData.certification) && o.LJ(this.guaranteeInfo, paymentMethodsData.guaranteeInfo) && o.LJ(this.securePayment, paymentMethodsData.securePayment) && o.LJ(this.bankCardRules, paymentMethodsData.bankCardRules) && o.LJ(this.consultationId, paymentMethodsData.consultationId);
    }

    public final int hashCode() {
        List<PaymentMethod> list = this.paymentMethods;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        PaymentMethod paymentMethod = this.recommendPaymentMethod;
        int hashCode2 = (hashCode + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        List<PaymentMethod> list2 = this.recommendPaymentMethods;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PaymentMethod> list3 = this.storedMethods;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<CardRules> list4 = this.cardRules;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        PaymentMethodPolicy paymentMethodPolicy = this.paymentPolicy;
        int hashCode6 = (hashCode5 + (paymentMethodPolicy == null ? 0 : paymentMethodPolicy.hashCode())) * 31;
        Integer num = this.storedMethodShowCount;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.encodeKey;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pipoHost;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethodsText;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Photos photos = this.methodsPhotos;
        int hashCode11 = (hashCode10 + (photos == null ? 0 : photos.hashCode())) * 31;
        PaymentCertification paymentCertification = this.certification;
        int hashCode12 = (hashCode11 + (paymentCertification == null ? 0 : paymentCertification.hashCode())) * 31;
        PaymentGuaranteeInfo paymentGuaranteeInfo = this.guaranteeInfo;
        int hashCode13 = (hashCode12 + (paymentGuaranteeInfo == null ? 0 : paymentGuaranteeInfo.hashCode())) * 31;
        UserTrustItem userTrustItem = this.securePayment;
        int hashCode14 = (hashCode13 + (userTrustItem == null ? 0 : userTrustItem.hashCode())) * 31;
        List<BankCardRule> list5 = this.bankCardRules;
        int hashCode15 = (hashCode14 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str4 = this.consultationId;
        return hashCode15 + (str4 != null ? str4.hashCode() : 0);
    }

    public final List<BankCardRule> LIZJ() {
        CardRules cardRules;
        List<BankCardRule> list;
        List<CardRules> list2 = this.cardRules;
        if (list2 != null) {
            Iterator<CardRules> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    cardRules = it.next();
                    if (o.LJ(cardRules.id, "pm_pi_ccdc_all")) {
                        break;
                    }
                } else {
                    cardRules = null;
                    break;
                }
            }
            CardRules cardRules2 = cardRules;
            if (cardRules2 != null && (list = cardRules2.rules) != null) {
                return list;
            }
        }
        return this.bankCardRules;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        if (r3 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod LIZLLL() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r6.LIZ
            if (r0 != 0) goto L7c
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r2 = r6.recommendPaymentMethod
            if (r2 == 0) goto L81
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r0 = r2.availability
            if (r0 == 0) goto L16
            java.lang.Boolean r1 = r0.isAvailable
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L1c
        L16:
            boolean r0 = r2.LIZ()
            if (r0 != 0) goto L81
        L1c:
            r0 = 1
            r5 = 0
            if (r0 == 0) goto L81
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r6.storedMethods
            if (r0 == 0) goto L4d
            java.util.Iterator r4 = r0.iterator()
        L28:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r0 = r2.availability
            if (r0 == 0) goto L28
            java.lang.Boolean r1 = r0.isAvailable
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L28
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L28
        L49:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r3 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r3
            if (r3 != 0) goto L7a
        L4d:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r6.paymentMethods
            if (r0 == 0) goto L79
            java.util.Iterator r4 = r0.iterator()
        L55:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r0 = r2.availability
            if (r0 == 0) goto L55
            java.lang.Boolean r1 = r0.isAvailable
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L55
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L55
            r5 = r3
        L77:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r5 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r5
        L79:
            r3 = r5
        L7a:
            r6.LIZ = r3
        L7c:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r6.LIZ
            return r0
        L7f:
            r3 = r5
            goto L49
        L81:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r6.recommendPaymentMethod
            r6.LIZ = r0
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData.LIZLLL():com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod");
    }

    public final List<PaymentMethod> LJ() {
        ArrayList arrayList;
        if (this.LIZIZ == null) {
            List<PaymentMethod> list = this.recommendPaymentMethods;
            if (list != null) {
                arrayList = new ArrayList();
                for (PaymentMethod paymentMethod : list) {
                    PaymentMethod paymentMethod2 = paymentMethod;
                    Availability availability = paymentMethod2.availability;
                    if (availability != null && o.LJ(availability.isAvailable, Boolean.TRUE) && paymentMethod2.LIZ()) {
                        List<PaymentMethod> list2 = paymentMethod2.subPaymentMethods;
                        if (list2 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (PaymentMethod paymentMethod3 : list2) {
                                if (paymentMethod3.LIZ()) {
                                    arrayList2.add(paymentMethod3);
                                }
                            }
                            paymentMethod2.subPaymentMethods = arrayList2;
                        }
                        arrayList.add(paymentMethod);
                    }
                }
            } else {
                arrayList = new ArrayList();
            }
            this.LIZIZ = arrayList;
        }
        return this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentMethodsData(paymentMethods=");
        sb.append(this.paymentMethods);
        sb.append(", recommendPaymentMethod=");
        sb.append(this.recommendPaymentMethod);
        sb.append(", recommendPaymentMethods=");
        sb.append(this.recommendPaymentMethods);
        sb.append(", storedMethods=");
        sb.append(this.storedMethods);
        sb.append(", cardRules=");
        sb.append(this.cardRules);
        sb.append(", paymentPolicy=");
        sb.append(this.paymentPolicy);
        sb.append(", storedMethodShowCount=");
        sb.append(this.storedMethodShowCount);
        sb.append(", encodeKey=");
        sb.append(this.encodeKey);
        sb.append(", pipoHost=");
        sb.append(this.pipoHost);
        sb.append(", paymentMethodsText=");
        sb.append(this.paymentMethodsText);
        sb.append(", methodsPhotos=");
        sb.append(this.methodsPhotos);
        sb.append(", certification=");
        sb.append(this.certification);
        sb.append(", guaranteeInfo=");
        sb.append(this.guaranteeInfo);
        sb.append(", securePayment=");
        sb.append(this.securePayment);
        sb.append(", bankCardRules=");
        sb.append(this.bankCardRules);
        sb.append(", consultationId=");
        return C07670Rv.LIZIZ(sb, this.consultationId, ')');
    }

    public static PaymentMethod LIZ(List list, int i, InterfaceC88472Yns interfaceC88472Yns) {
        String str;
        if (i < 1 || list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PaymentMethod paymentMethod = (PaymentMethod) it.next();
            BindInfo bindInfo = paymentMethod.bindInfo;
            if (bindInfo != null) {
                str = bindInfo.buttonText;
            } else {
                str = null;
            }
            if (!C78685UuP.LJJJZ(str) && !o.LJ(paymentMethod.id, "pm_pi_ccdc_all")) {
                if (o.LJ(paymentMethod.isChooseRecommend, Boolean.TRUE) && ((Boolean) interfaceC88472Yns.invoke(paymentMethod)).booleanValue()) {
                    return paymentMethod;
                }
                PaymentMethod LIZ = LIZ(paymentMethod.subPaymentMethods, i - 1, interfaceC88472Yns);
                if (LIZ != null) {
                    return LIZ;
                }
            }
        }
        return null;
    }

    public PaymentMethodsData(List<PaymentMethod> list, PaymentMethod paymentMethod, List<PaymentMethod> list2, List<PaymentMethod> list3, List<CardRules> list4, PaymentMethodPolicy paymentMethodPolicy, Integer num, String str, String str2, String str3, Photos photos, PaymentCertification paymentCertification, PaymentGuaranteeInfo paymentGuaranteeInfo, UserTrustItem userTrustItem, List<BankCardRule> list5, String str4) {
        this.paymentMethods = list;
        this.recommendPaymentMethod = paymentMethod;
        this.recommendPaymentMethods = list2;
        this.storedMethods = list3;
        this.cardRules = list4;
        this.paymentPolicy = paymentMethodPolicy;
        this.storedMethodShowCount = num;
        this.encodeKey = str;
        this.pipoHost = str2;
        this.paymentMethodsText = str3;
        this.methodsPhotos = photos;
        this.certification = paymentCertification;
        this.guaranteeInfo = paymentGuaranteeInfo;
        this.securePayment = userTrustItem;
        this.bankCardRules = list5;
        this.consultationId = str4;
    }
}
