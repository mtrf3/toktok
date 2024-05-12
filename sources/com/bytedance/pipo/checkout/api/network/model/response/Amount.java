package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class Amount {

    @InterfaceC65349Pkn("currency")
    public String currency;

    @InterfaceC65349Pkn("value")
    public String value;

    /* JADX WARN: Multi-variable type inference failed */
    public Amount() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Amount copy$default(Amount amount, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = amount.value;
        }
        if ((i & 2) != 0) {
            str2 = amount.currency;
        }
        return amount.copy(str, str2);
    }

    public final Amount copy(String str, String str2) {
        return new Amount(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Amount)) {
            return false;
        }
        Amount amount = (Amount) obj;
        return o.LJ(this.value, amount.value) && o.LJ(this.currency, amount.currency);
    }

    public int hashCode() {
        String str = this.value;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Amount(value=");
        LIZ.append((Object) this.value);
        LIZ.append(", currency=");
        LIZ.append((Object) this.currency);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public Amount(String str, String str2) {
        this.value = str;
        this.currency = str2;
    }

    public /* synthetic */ Amount(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
