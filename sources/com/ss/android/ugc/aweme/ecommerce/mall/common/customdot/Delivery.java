package com.ss.android.ugc.aweme.ecommerce.mall.common.customdot;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Delivery {
    public final int duration;

    @InterfaceC65349Pkn("icon_url")
    public final String iconUrl;
    public final String id;

    public static /* synthetic */ Delivery copy$default(Delivery delivery, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = delivery.id;
        }
        if ((i2 & 2) != 0) {
            str2 = delivery.iconUrl;
        }
        if ((i2 & 4) != 0) {
            i = delivery.duration;
        }
        return delivery.copy(str, str2, i);
    }

    public final Delivery copy(String str, String str2, int i) {
        return new Delivery(str, str2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Delivery)) {
            return false;
        }
        Delivery delivery = (Delivery) obj;
        return o.LJ(this.id, delivery.id) && o.LJ(this.iconUrl, delivery.iconUrl) && this.duration == delivery.duration;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconUrl;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.duration;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Delivery(id=");
        LIZ.append(this.id);
        LIZ.append(", iconUrl=");
        LIZ.append(this.iconUrl);
        LIZ.append(", duration=");
        return b0.LIZJ(LIZ, this.duration, ')', LIZ);
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public Delivery(String str, String str2, int i) {
        this.id = str;
        this.iconUrl = str2;
        this.duration = i;
    }
}
