package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SellingPoint {

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    public static /* synthetic */ SellingPoint copy$default(SellingPoint sellingPoint, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = sellingPoint.type;
        }
        if ((i & 2) != 0) {
            str = sellingPoint.text;
        }
        return sellingPoint.copy(num, str);
    }

    public final SellingPoint copy(Integer num, String str) {
        return new SellingPoint(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellingPoint)) {
            return false;
        }
        SellingPoint sellingPoint = (SellingPoint) obj;
        return o.LJ(this.type, sellingPoint.type) && o.LJ(this.text, sellingPoint.text);
    }

    public int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SellingPoint(type=");
        LIZ.append(this.type);
        LIZ.append(", text=");
        return q.LIZIZ(LIZ, this.text, ')', LIZ);
    }

    public final String getText() {
        return this.text;
    }

    public final Integer getType() {
        return this.type;
    }

    public SellingPoint(Integer num, String str) {
        this.type = num;
        this.text = str;
    }
}
