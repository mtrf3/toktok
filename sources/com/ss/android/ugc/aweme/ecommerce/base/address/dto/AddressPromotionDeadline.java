package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressPromotionDeadline {

    @InterfaceC65349Pkn("hour")
    public final Integer hour;

    @InterfaceC65349Pkn("minute")
    public final Integer minute;

    @InterfaceC65349Pkn("second")
    public final Integer second;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressPromotionDeadline)) {
            return false;
        }
        AddressPromotionDeadline addressPromotionDeadline = (AddressPromotionDeadline) obj;
        return o.LJ(this.hour, addressPromotionDeadline.hour) && o.LJ(this.minute, addressPromotionDeadline.minute) && o.LJ(this.second, addressPromotionDeadline.second);
    }

    public final int hashCode() {
        Integer num = this.hour;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.minute;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.second;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressPromotionDeadline(hour=");
        LIZ.append(this.hour);
        LIZ.append(", minute=");
        LIZ.append(this.minute);
        LIZ.append(", second=");
        return s0.LIZJ(LIZ, this.second, ')', LIZ);
    }

    public AddressPromotionDeadline(Integer num, Integer num2, Integer num3) {
        this.hour = num;
        this.minute = num2;
        this.second = num3;
    }
}
