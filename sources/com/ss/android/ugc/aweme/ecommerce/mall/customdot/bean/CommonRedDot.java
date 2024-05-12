package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CommonRedDot {

    @InterfaceC65349Pkn("basic_type")
    public final int basicType;

    @InterfaceC65349Pkn("delivery_icon")
    public final Delivery deliveryIcon;
    public final int group;

    @InterfaceC65349Pkn("newest_notice")
    public final Notice newestNotice;

    public static /* synthetic */ CommonRedDot copy$default(CommonRedDot commonRedDot, int i, int i2, Notice notice, Delivery delivery, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = commonRedDot.basicType;
        }
        if ((i3 & 2) != 0) {
            i2 = commonRedDot.group;
        }
        if ((i3 & 4) != 0) {
            notice = commonRedDot.newestNotice;
        }
        if ((i3 & 8) != 0) {
            delivery = commonRedDot.deliveryIcon;
        }
        return commonRedDot.copy(i, i2, notice, delivery);
    }

    public final CommonRedDot copy(int i, int i2, Notice notice, Delivery delivery) {
        return new CommonRedDot(i, i2, notice, delivery);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonRedDot)) {
            return false;
        }
        CommonRedDot commonRedDot = (CommonRedDot) obj;
        return this.basicType == commonRedDot.basicType && this.group == commonRedDot.group && o.LJ(this.newestNotice, commonRedDot.newestNotice) && o.LJ(this.deliveryIcon, commonRedDot.deliveryIcon);
    }

    public int hashCode() {
        int i = ((this.basicType * 31) + this.group) * 31;
        Notice notice = this.newestNotice;
        int hashCode = (i + (notice == null ? 0 : notice.hashCode())) * 31;
        Delivery delivery = this.deliveryIcon;
        return hashCode + (delivery != null ? delivery.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommonRedDot(basicType=");
        LIZ.append(this.basicType);
        LIZ.append(", group=");
        LIZ.append(this.group);
        LIZ.append(", newestNotice=");
        LIZ.append(this.newestNotice);
        LIZ.append(", deliveryIcon=");
        LIZ.append(this.deliveryIcon);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int getBasicType() {
        return this.basicType;
    }

    public final Delivery getDeliveryIcon() {
        return this.deliveryIcon;
    }

    public final int getGroup() {
        return this.group;
    }

    public final Notice getNewestNotice() {
        return this.newestNotice;
    }

    public CommonRedDot(int i, int i2, Notice notice, Delivery delivery) {
        this.basicType = i;
        this.group = i2;
        this.newestNotice = notice;
        this.deliveryIcon = delivery;
    }
}
