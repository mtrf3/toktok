package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class CashierConfig {

    @InterfaceC65349Pkn("card_type")
    public String cardType;

    @InterfaceC65349Pkn("prepaid_type")
    public String prepaidType;

    /* JADX WARN: Multi-variable type inference failed */
    public CashierConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CashierConfig copy$default(CashierConfig cashierConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashierConfig.cardType;
        }
        if ((i & 2) != 0) {
            str2 = cashierConfig.prepaidType;
        }
        return cashierConfig.copy(str, str2);
    }

    public final CashierConfig copy(String str, String str2) {
        return new CashierConfig(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashierConfig)) {
            return false;
        }
        CashierConfig cashierConfig = (CashierConfig) obj;
        return o.LJ(this.cardType, cashierConfig.cardType) && o.LJ(this.prepaidType, cashierConfig.prepaidType);
    }

    public int hashCode() {
        String str = this.cardType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.prepaidType;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CashierConfig(cardType=");
        LIZ.append((Object) this.cardType);
        LIZ.append(", prepaidType=");
        LIZ.append((Object) this.prepaidType);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getPrepaidType() {
        return this.prepaidType;
    }

    public final void setCardType(String str) {
        this.cardType = str;
    }

    public final void setPrepaidType(String str) {
        this.prepaidType = str;
    }

    public CashierConfig(String str, String str2) {
        this.cardType = str;
        this.prepaidType = str2;
    }

    public /* synthetic */ CashierConfig(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
