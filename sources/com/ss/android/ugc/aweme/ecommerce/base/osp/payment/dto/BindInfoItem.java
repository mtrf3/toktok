package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BindInfoItem {

    @InterfaceC65349Pkn("payment_method_bind_url")
    public final String paymentMethodBindUrl;

    @InterfaceC65349Pkn("payment_method_id")
    public final String paymentMethodId;

    /* JADX WARN: Multi-variable type inference failed */
    public BindInfoItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BindInfoItem copy$default(BindInfoItem bindInfoItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindInfoItem.paymentMethodId;
        }
        if ((i & 2) != 0) {
            str2 = bindInfoItem.paymentMethodBindUrl;
        }
        return bindInfoItem.copy(str, str2);
    }

    public final BindInfoItem copy(String str, String str2) {
        return new BindInfoItem(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindInfoItem)) {
            return false;
        }
        BindInfoItem bindInfoItem = (BindInfoItem) obj;
        return o.LJ(this.paymentMethodId, bindInfoItem.paymentMethodId) && o.LJ(this.paymentMethodBindUrl, bindInfoItem.paymentMethodBindUrl);
    }

    public int hashCode() {
        String str = this.paymentMethodId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentMethodBindUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BindInfoItem(paymentMethodId=");
        LIZ.append(this.paymentMethodId);
        LIZ.append(", paymentMethodBindUrl=");
        return q.LIZIZ(LIZ, this.paymentMethodBindUrl, ')', LIZ);
    }

    public final String getPaymentMethodBindUrl() {
        return this.paymentMethodBindUrl;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public BindInfoItem(String str, String str2) {
        this.paymentMethodId = str;
        this.paymentMethodBindUrl = str2;
    }

    public /* synthetic */ BindInfoItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
