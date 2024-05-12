package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OSPDesignConfig {

    @InterfaceC65349Pkn("ec_osp_items_expand_count")
    public final Integer _itemsExpandCount;

    @InterfaceC65349Pkn("ec_osp_recommend_payment_count")
    public final Integer _paymentCount;

    @InterfaceC65349Pkn("ec_osp_cashier_entrance_position")
    public final int entrancePosition;

    @InterfaceC65349Pkn("ec_payment_component_interaction")
    public final boolean interaction;

    @InterfaceC65349Pkn("ec_cashier_payment_security")
    public final boolean paymentSecurity;

    @InterfaceC65349Pkn("ec_osp_place_order_optimize")
    public final boolean placeOrder;

    /* JADX WARN: Multi-variable type inference failed */
    public OSPDesignConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OSPDesignConfig)) {
            return false;
        }
        OSPDesignConfig oSPDesignConfig = (OSPDesignConfig) obj;
        return this.interaction == oSPDesignConfig.interaction && this.entrancePosition == oSPDesignConfig.entrancePosition && this.placeOrder == oSPDesignConfig.placeOrder && this.paymentSecurity == oSPDesignConfig.paymentSecurity && o.LJ(this._paymentCount, oSPDesignConfig._paymentCount) && o.LJ(this._itemsExpandCount, oSPDesignConfig._itemsExpandCount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public final int hashCode() {
        boolean z = this.interaction;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + this.entrancePosition) * 31;
        ?? r02 = this.placeOrder;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (((i + i2) * 31) + (this.paymentSecurity ? 1 : 0)) * 31;
        Integer num = this._paymentCount;
        int hashCode = (i3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this._itemsExpandCount;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OSPDesignConfig(interaction=");
        LIZ.append(this.interaction);
        LIZ.append(", entrancePosition=");
        LIZ.append(this.entrancePosition);
        LIZ.append(", placeOrder=");
        LIZ.append(this.placeOrder);
        LIZ.append(", paymentSecurity=");
        LIZ.append(this.paymentSecurity);
        LIZ.append(", _paymentCount=");
        LIZ.append(this._paymentCount);
        LIZ.append(", _itemsExpandCount=");
        return s0.LIZJ(LIZ, this._itemsExpandCount, ')', LIZ);
    }

    public OSPDesignConfig(boolean z, int i, boolean z2, boolean z3, Integer num, Integer num2) {
        this.interaction = z;
        this.entrancePosition = i;
        this.placeOrder = z2;
        this.paymentSecurity = z3;
        this._paymentCount = num;
        this._itemsExpandCount = num2;
    }

    public /* synthetic */ OSPDesignConfig(boolean z, int i, boolean z2, boolean z3, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z2, (i2 & 8) == 0 ? z3 : false, (i2 & 16) != 0 ? null : num, (i2 & 32) == 0 ? num2 : null);
    }
}
