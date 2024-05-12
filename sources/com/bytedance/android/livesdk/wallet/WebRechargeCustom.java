package com.bytedance.android.livesdk.wallet;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.live.wallet.model.CurrencyPriceItem;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class WebRechargeCustom {

    @InterfaceC65349Pkn("coupon_id")
    public final String couponId;

    @InterfaceC65349Pkn("currency_price")
    public final List<CurrencyPriceItem> cusList;

    /* JADX WARN: Multi-variable type inference failed */
    public WebRechargeCustom() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebRechargeCustom copy$default(WebRechargeCustom webRechargeCustom, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webRechargeCustom.couponId;
        }
        if ((i & 2) != 0) {
            list = webRechargeCustom.cusList;
        }
        return webRechargeCustom.copy(str, list);
    }

    public final String component1() {
        return this.couponId;
    }

    public final List<CurrencyPriceItem> component2() {
        return this.cusList;
    }

    public final WebRechargeCustom copy(String couponId, List<CurrencyPriceItem> list) {
        o.LJIIIZ(couponId, "couponId");
        return new WebRechargeCustom(couponId, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebRechargeCustom)) {
            return false;
        }
        WebRechargeCustom webRechargeCustom = (WebRechargeCustom) obj;
        return o.LJ(this.couponId, webRechargeCustom.couponId) && o.LJ(this.cusList, webRechargeCustom.cusList);
    }

    public int hashCode() {
        int hashCode = this.couponId.hashCode() * 31;
        List<CurrencyPriceItem> list = this.cusList;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WebRechargeCustom(couponId=");
        LIZ.append(this.couponId);
        LIZ.append(", cusList=");
        return C1NE.LIZIZ(LIZ, this.cusList, ')', LIZ);
    }

    public WebRechargeCustom(String couponId, List<CurrencyPriceItem> list) {
        o.LJIIIZ(couponId, "couponId");
        this.couponId = couponId;
        this.cusList = list;
    }

    public /* synthetic */ WebRechargeCustom(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list);
    }
}
