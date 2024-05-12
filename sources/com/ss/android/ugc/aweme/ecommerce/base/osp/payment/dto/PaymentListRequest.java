package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C28034AzO;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PayRiskControlParam;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentListRequest {

    @InterfaceC65349Pkn("client_template")
    public final int client_template;

    @InterfaceC65349Pkn("combo_Id")
    public final String comboId;

    @InterfaceC65349Pkn("order_ids")
    public final List<String> orderIds;

    @InterfaceC65349Pkn("pay_risk_control_param")
    public final PayRiskControlParam payRiskControlParam;

    @InterfaceC65349Pkn("with_pre_risk_param")
    public final boolean withPreRiskParam;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentListRequest)) {
            return false;
        }
        PaymentListRequest paymentListRequest = (PaymentListRequest) obj;
        return o.LJ(this.comboId, paymentListRequest.comboId) && o.LJ(this.orderIds, paymentListRequest.orderIds) && o.LJ(this.payRiskControlParam, paymentListRequest.payRiskControlParam) && this.withPreRiskParam == paymentListRequest.withPreRiskParam && this.client_template == paymentListRequest.client_template;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.comboId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.orderIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        PayRiskControlParam payRiskControlParam = this.payRiskControlParam;
        int hashCode3 = (hashCode2 + (payRiskControlParam != null ? payRiskControlParam.hashCode() : 0)) * 31;
        boolean z = this.withPreRiskParam;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode3 + i) * 31) + this.client_template;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentListRequest(comboId=");
        LIZ.append(this.comboId);
        LIZ.append(", orderIds=");
        LIZ.append(this.orderIds);
        LIZ.append(", payRiskControlParam=");
        LIZ.append(this.payRiskControlParam);
        LIZ.append(", withPreRiskParam=");
        LIZ.append(this.withPreRiskParam);
        LIZ.append(", client_template=");
        return b0.LIZJ(LIZ, this.client_template, ')', LIZ);
    }

    public PaymentListRequest(String str, List<String> list, PayRiskControlParam payRiskControlParam, boolean z, int i) {
        this.comboId = str;
        this.orderIds = list;
        this.payRiskControlParam = payRiskControlParam;
        this.withPreRiskParam = z;
        this.client_template = i;
    }

    public /* synthetic */ PaymentListRequest(String str, List list, PayRiskControlParam payRiskControlParam, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i2 & 4) != 0 ? null : payRiskControlParam, (i2 & 8) != 0 ? C28034AzO.LIZ() : z, i);
    }
}
