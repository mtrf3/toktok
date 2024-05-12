package com.ss.android.ugc.aweme.shoutouts.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShoutoutsPrice {

    @InterfaceC65349Pkn("buyer_payment")
    public final StandardMoney buyerPayment;

    @InterfaceC65349Pkn("coin")
    public final int coin;

    @InterfaceC65349Pkn("creator_earning")
    public final StandardMoney creatorEarning;

    public static /* synthetic */ ShoutoutsPrice copy$default(ShoutoutsPrice shoutoutsPrice, int i, StandardMoney standardMoney, StandardMoney standardMoney2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = shoutoutsPrice.coin;
        }
        if ((i2 & 2) != 0) {
            standardMoney = shoutoutsPrice.buyerPayment;
        }
        if ((i2 & 4) != 0) {
            standardMoney2 = shoutoutsPrice.creatorEarning;
        }
        return shoutoutsPrice.copy(i, standardMoney, standardMoney2);
    }

    public final ShoutoutsPrice copy(int i, StandardMoney standardMoney, StandardMoney standardMoney2) {
        return new ShoutoutsPrice(i, standardMoney, standardMoney2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoutoutsPrice)) {
            return false;
        }
        ShoutoutsPrice shoutoutsPrice = (ShoutoutsPrice) obj;
        return this.coin == shoutoutsPrice.coin && o.LJ(this.buyerPayment, shoutoutsPrice.buyerPayment) && o.LJ(this.creatorEarning, shoutoutsPrice.creatorEarning);
    }

    public int hashCode() {
        int i = this.coin * 31;
        StandardMoney standardMoney = this.buyerPayment;
        int hashCode = (i + (standardMoney == null ? 0 : standardMoney.hashCode())) * 31;
        StandardMoney standardMoney2 = this.creatorEarning;
        return hashCode + (standardMoney2 != null ? standardMoney2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShoutoutsPrice(coin=");
        LIZ.append(this.coin);
        LIZ.append(", buyerPayment=");
        LIZ.append(this.buyerPayment);
        LIZ.append(", creatorEarning=");
        LIZ.append(this.creatorEarning);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final StandardMoney getBuyerPayment() {
        return this.buyerPayment;
    }

    public final int getCoin() {
        return this.coin;
    }

    public final StandardMoney getCreatorEarning() {
        return this.creatorEarning;
    }

    public ShoutoutsPrice(int i, StandardMoney standardMoney, StandardMoney standardMoney2) {
        this.coin = i;
        this.buyerPayment = standardMoney;
        this.creatorEarning = standardMoney2;
    }
}
