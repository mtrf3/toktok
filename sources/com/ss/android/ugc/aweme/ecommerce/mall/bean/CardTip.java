package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CardTip {

    @InterfaceC65349Pkn("data")
    public String data;

    @InterfaceC65349Pkn("type")
    public Integer type;

    public static /* synthetic */ CardTip copy$default(CardTip cardTip, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = cardTip.type;
        }
        if ((i & 2) != 0) {
            str = cardTip.data;
        }
        return cardTip.copy(num, str);
    }

    public final CardTip copy(Integer num, String str) {
        return new CardTip(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardTip)) {
            return false;
        }
        CardTip cardTip = (CardTip) obj;
        return o.LJ(this.type, cardTip.type) && o.LJ(this.data, cardTip.data);
    }

    public int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.data;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CardTip(type=");
        LIZ.append(this.type);
        LIZ.append(", data=");
        return q.LIZIZ(LIZ, this.data, ')', LIZ);
    }

    public final String getData() {
        return this.data;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public CardTip(Integer num, String str) {
        this.type = num;
        this.data = str;
    }
}
