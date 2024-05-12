package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class CashierOptionList {

    @InterfaceC65349Pkn("dark_mode_icon_url")
    public String darkModeIconUrl;

    @InterfaceC65349Pkn("icon_url")
    public String iconUrl;

    @InterfaceC65349Pkn("key")
    public String key;

    @InterfaceC65349Pkn("max_limited_amount")
    public String maxLimitedAmount;

    @InterfaceC65349Pkn("min_limited_amount")
    public String minLimitedAmount;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("value")
    public String value;

    /* JADX WARN: Multi-variable type inference failed */
    public CashierOptionList() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CashierOptionList copy$default(CashierOptionList cashierOptionList, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashierOptionList.key;
        }
        if ((i & 2) != 0) {
            str2 = cashierOptionList.value;
        }
        if ((i & 4) != 0) {
            str3 = cashierOptionList.name;
        }
        if ((i & 8) != 0) {
            str4 = cashierOptionList.iconUrl;
        }
        if ((i & 16) != 0) {
            str5 = cashierOptionList.darkModeIconUrl;
        }
        if ((i & 32) != 0) {
            str6 = cashierOptionList.maxLimitedAmount;
        }
        if ((i & 64) != 0) {
            str7 = cashierOptionList.minLimitedAmount;
        }
        return cashierOptionList.copy(str, str2, str3, str4, str5, str6, str7);
    }

    public final CashierOptionList copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new CashierOptionList(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashierOptionList)) {
            return false;
        }
        CashierOptionList cashierOptionList = (CashierOptionList) obj;
        return o.LJ(this.key, cashierOptionList.key) && o.LJ(this.value, cashierOptionList.value) && o.LJ(this.name, cashierOptionList.name) && o.LJ(this.iconUrl, cashierOptionList.iconUrl) && o.LJ(this.darkModeIconUrl, cashierOptionList.darkModeIconUrl) && o.LJ(this.maxLimitedAmount, cashierOptionList.maxLimitedAmount) && o.LJ(this.minLimitedAmount, cashierOptionList.minLimitedAmount);
    }

    public int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconUrl;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.darkModeIconUrl;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.maxLimitedAmount;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.minLimitedAmount;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CashierOptionList(key=");
        LIZ.append((Object) this.key);
        LIZ.append(", value=");
        LIZ.append((Object) this.value);
        LIZ.append(", name=");
        LIZ.append((Object) this.name);
        LIZ.append(", iconUrl=");
        LIZ.append((Object) this.iconUrl);
        LIZ.append(", darkModeIconUrl=");
        LIZ.append((Object) this.darkModeIconUrl);
        LIZ.append(", maxLimitedAmount=");
        LIZ.append((Object) this.maxLimitedAmount);
        LIZ.append(", minLimitedAmount=");
        LIZ.append((Object) this.minLimitedAmount);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getDarkModeIconUrl() {
        return this.darkModeIconUrl;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getMaxLimitedAmount() {
        return this.maxLimitedAmount;
    }

    public final String getMinLimitedAmount() {
        return this.minLimitedAmount;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setDarkModeIconUrl(String str) {
        this.darkModeIconUrl = str;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setMaxLimitedAmount(String str) {
        this.maxLimitedAmount = str;
    }

    public final void setMinLimitedAmount(String str) {
        this.minLimitedAmount = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public CashierOptionList(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.key = str;
        this.value = str2;
        this.name = str3;
        this.iconUrl = str4;
        this.darkModeIconUrl = str5;
        this.maxLimitedAmount = str6;
        this.minLimitedAmount = str7;
    }

    public /* synthetic */ CashierOptionList(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) == 0 ? str7 : null);
    }
}
