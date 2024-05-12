package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CancelOrderRequest {
    public String LIZ;

    @InterfaceC65349Pkn("cancel_reason")
    public final String cancelReason;

    @InterfaceC65349Pkn("combo_id")
    public final String comboId;

    @InterfaceC65349Pkn("main_order_id")
    public final String mainOrderId;

    @InterfaceC65349Pkn("reverse_type")
    public final Integer reverseType;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final Integer scene;

    /* JADX WARN: Multi-variable type inference failed */
    public CancelOrderRequest() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelOrderRequest)) {
            return false;
        }
        CancelOrderRequest cancelOrderRequest = (CancelOrderRequest) obj;
        return o.LJ(this.mainOrderId, cancelOrderRequest.mainOrderId) && o.LJ(this.comboId, cancelOrderRequest.comboId) && o.LJ(this.cancelReason, cancelOrderRequest.cancelReason) && o.LJ(this.reverseType, cancelOrderRequest.reverseType) && o.LJ(this.scene, cancelOrderRequest.scene);
    }

    public final int hashCode() {
        String str = this.mainOrderId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.comboId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cancelReason;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.reverseType;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.scene;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CancelOrderRequest(mainOrderId=");
        LIZ.append(this.mainOrderId);
        LIZ.append(", comboId=");
        LIZ.append(this.comboId);
        LIZ.append(", cancelReason=");
        LIZ.append(this.cancelReason);
        LIZ.append(", reverseType=");
        LIZ.append(this.reverseType);
        LIZ.append(", scene=");
        return s0.LIZJ(LIZ, this.scene, ')', LIZ);
    }

    public CancelOrderRequest(String str, String str2, String str3, Integer num, Integer num2) {
        this.mainOrderId = str;
        this.comboId = str2;
        this.cancelReason = str3;
        this.reverseType = num;
        this.scene = num2;
    }

    public /* synthetic */ CancelOrderRequest(String str, String str2, String str3, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) == 0 ? num2 : null);
    }
}
