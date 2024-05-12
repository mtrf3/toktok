package com.ss.android.ugc.aweme.shoutouts.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StandardMoney {

    @InterfaceC65349Pkn("currency_character")
    public final String currencyCharacter;

    @InterfaceC65349Pkn("currency_name")
    public final String currencyName;

    @InterfaceC65349Pkn("money")
    public final int money;

    @InterfaceC65349Pkn("money_str")
    public final String moneyStr;

    public static /* synthetic */ StandardMoney copy$default(StandardMoney standardMoney, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = standardMoney.money;
        }
        if ((i2 & 2) != 0) {
            str = standardMoney.currencyName;
        }
        if ((i2 & 4) != 0) {
            str2 = standardMoney.currencyCharacter;
        }
        if ((i2 & 8) != 0) {
            str3 = standardMoney.moneyStr;
        }
        return standardMoney.copy(i, str, str2, str3);
    }

    public final StandardMoney copy(int i, String str, String str2, String str3) {
        return new StandardMoney(i, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandardMoney)) {
            return false;
        }
        StandardMoney standardMoney = (StandardMoney) obj;
        return this.money == standardMoney.money && o.LJ(this.currencyName, standardMoney.currencyName) && o.LJ(this.currencyCharacter, standardMoney.currencyCharacter) && o.LJ(this.moneyStr, standardMoney.moneyStr);
    }

    public int hashCode() {
        int i = this.money * 31;
        String str = this.currencyName;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currencyCharacter;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.moneyStr;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StandardMoney(money=");
        LIZ.append(this.money);
        LIZ.append(", currencyName=");
        LIZ.append(this.currencyName);
        LIZ.append(", currencyCharacter=");
        LIZ.append(this.currencyCharacter);
        LIZ.append(", moneyStr=");
        return q.LIZIZ(LIZ, this.moneyStr, ')', LIZ);
    }

    public final String getCurrencyCharacter() {
        return this.currencyCharacter;
    }

    public final String getCurrencyName() {
        return this.currencyName;
    }

    public final int getMoney() {
        return this.money;
    }

    public final String getMoneyStr() {
        return this.moneyStr;
    }

    public StandardMoney(int i, String str, String str2, String str3) {
        this.money = i;
        this.currencyName = str;
        this.currencyCharacter = str2;
        this.moneyStr = str3;
    }
}
