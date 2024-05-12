package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BindInfoReqInfo implements Serializable {

    @InterfaceC65349Pkn("commute_type")
    public final CommuteType bindCommuteType;

    @InterfaceC65349Pkn("deeplink")
    public final String deepLink;

    @InterfaceC65349Pkn("idempotency_key")
    public final String idempotencyKey;

    @InterfaceC65349Pkn("payment_method_id")
    public final String paymentMethodId;

    @InterfaceC65349Pkn("payment_method_token")
    public final String paymentMethodToken;

    /* JADX WARN: Multi-variable type inference failed */
    public BindInfoReqInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BindInfoReqInfo copy$default(BindInfoReqInfo bindInfoReqInfo, String str, String str2, String str3, CommuteType commuteType, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindInfoReqInfo.paymentMethodId;
        }
        if ((i & 2) != 0) {
            str2 = bindInfoReqInfo.paymentMethodToken;
        }
        if ((i & 4) != 0) {
            str3 = bindInfoReqInfo.idempotencyKey;
        }
        if ((i & 8) != 0) {
            commuteType = bindInfoReqInfo.bindCommuteType;
        }
        if ((i & 16) != 0) {
            str4 = bindInfoReqInfo.deepLink;
        }
        return bindInfoReqInfo.copy(str, str2, str3, commuteType, str4);
    }

    public final BindInfoReqInfo copy(String str, String str2, String str3, CommuteType commuteType, String str4) {
        return new BindInfoReqInfo(str, str2, str3, commuteType, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindInfoReqInfo)) {
            return false;
        }
        BindInfoReqInfo bindInfoReqInfo = (BindInfoReqInfo) obj;
        return o.LJ(this.paymentMethodId, bindInfoReqInfo.paymentMethodId) && o.LJ(this.paymentMethodToken, bindInfoReqInfo.paymentMethodToken) && o.LJ(this.idempotencyKey, bindInfoReqInfo.idempotencyKey) && this.bindCommuteType == bindInfoReqInfo.bindCommuteType && o.LJ(this.deepLink, bindInfoReqInfo.deepLink);
    }

    public int hashCode() {
        String str = this.paymentMethodId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentMethodToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.idempotencyKey;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CommuteType commuteType = this.bindCommuteType;
        int hashCode4 = (hashCode3 + (commuteType == null ? 0 : commuteType.hashCode())) * 31;
        String str4 = this.deepLink;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BindInfoReqInfo(paymentMethodId=");
        LIZ.append(this.paymentMethodId);
        LIZ.append(", paymentMethodToken=");
        LIZ.append(this.paymentMethodToken);
        LIZ.append(", idempotencyKey=");
        LIZ.append(this.idempotencyKey);
        LIZ.append(", bindCommuteType=");
        LIZ.append(this.bindCommuteType);
        LIZ.append(", deepLink=");
        return q.LIZIZ(LIZ, this.deepLink, ')', LIZ);
    }

    public final CommuteType getBindCommuteType() {
        return this.bindCommuteType;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getPaymentMethodToken() {
        return this.paymentMethodToken;
    }

    public BindInfoReqInfo(String str, String str2, String str3, CommuteType commuteType, String str4) {
        this.paymentMethodId = str;
        this.paymentMethodToken = str2;
        this.idempotencyKey = str3;
        this.bindCommuteType = commuteType;
        this.deepLink = str4;
    }

    public /* synthetic */ BindInfoReqInfo(String str, String str2, String str3, CommuteType commuteType, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : commuteType, (i & 16) == 0 ? str4 : null);
    }
}
