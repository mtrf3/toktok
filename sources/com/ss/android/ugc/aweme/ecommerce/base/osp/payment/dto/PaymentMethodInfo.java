package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentMethodInfo implements Serializable {

    @InterfaceC65349Pkn("consultation_id")
    public String consultationId;

    @InterfaceC65349Pkn("payment_method_id")
    public final String id;

    @InterfaceC65349Pkn("installment_plan_id")
    public String installmentPlanId;

    @InterfaceC65349Pkn("is_choose_save")
    public final Boolean isChooseSave;

    @InterfaceC65349Pkn("payment_elements")
    public List<PaymentElement> paymentElements;

    @InterfaceC65349Pkn("tenure")
    public String tenure;

    @InterfaceC65349Pkn("payment_method_token")
    public final String token;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodInfo copy$default(PaymentMethodInfo paymentMethodInfo, String str, String str2, List list, Boolean bool, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentMethodInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = paymentMethodInfo.token;
        }
        if ((i & 4) != 0) {
            list = paymentMethodInfo.paymentElements;
        }
        if ((i & 8) != 0) {
            bool = paymentMethodInfo.isChooseSave;
        }
        if ((i & 16) != 0) {
            str3 = paymentMethodInfo.tenure;
        }
        if ((i & 32) != 0) {
            str4 = paymentMethodInfo.installmentPlanId;
        }
        if ((i & 64) != 0) {
            str5 = paymentMethodInfo.consultationId;
        }
        return paymentMethodInfo.copy(str, str2, list, bool, str3, str4, str5);
    }

    public final PaymentMethodInfo copy(String str, String str2, List<PaymentElement> list, Boolean bool, String str3, String str4, String str5) {
        return new PaymentMethodInfo(str, str2, list, bool, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodInfo)) {
            return false;
        }
        PaymentMethodInfo paymentMethodInfo = (PaymentMethodInfo) obj;
        return o.LJ(this.id, paymentMethodInfo.id) && o.LJ(this.token, paymentMethodInfo.token) && o.LJ(this.paymentElements, paymentMethodInfo.paymentElements) && o.LJ(this.isChooseSave, paymentMethodInfo.isChooseSave) && o.LJ(this.tenure, paymentMethodInfo.tenure) && o.LJ(this.installmentPlanId, paymentMethodInfo.installmentPlanId) && o.LJ(this.consultationId, paymentMethodInfo.consultationId);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PaymentElement> list = this.paymentElements;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isChooseSave;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.tenure;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.installmentPlanId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.consultationId;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentMethodInfo(id=");
        LIZ.append(this.id);
        LIZ.append(", token=");
        LIZ.append(this.token);
        LIZ.append(", paymentElements=");
        LIZ.append(this.paymentElements);
        LIZ.append(", isChooseSave=");
        LIZ.append(this.isChooseSave);
        LIZ.append(", tenure=");
        LIZ.append(this.tenure);
        LIZ.append(", installmentPlanId=");
        LIZ.append(this.installmentPlanId);
        LIZ.append(", consultationId=");
        return q.LIZIZ(LIZ, this.consultationId, ')', LIZ);
    }

    public final String getConsultationId() {
        return this.consultationId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInstallmentPlanId() {
        return this.installmentPlanId;
    }

    public final List<PaymentElement> getPaymentElements() {
        return this.paymentElements;
    }

    public final String getTenure() {
        return this.tenure;
    }

    public final String getToken() {
        return this.token;
    }

    public final Boolean isChooseSave() {
        return this.isChooseSave;
    }

    public final void setConsultationId(String str) {
        this.consultationId = str;
    }

    public final void setInstallmentPlanId(String str) {
        this.installmentPlanId = str;
    }

    public final void setPaymentElements(List<PaymentElement> list) {
        this.paymentElements = list;
    }

    public final void setTenure(String str) {
        this.tenure = str;
    }

    public PaymentMethodInfo(String str, String str2, List<PaymentElement> list, Boolean bool, String str3, String str4, String str5) {
        this.id = str;
        this.token = str2;
        this.paymentElements = list;
        this.isChooseSave = bool;
        this.tenure = str3;
        this.installmentPlanId = str4;
        this.consultationId = str5;
    }

    public /* synthetic */ PaymentMethodInfo(String str, String str2, List list, Boolean bool, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : list, bool, str3, str4, (i & 64) == 0 ? str5 : null);
    }
}
