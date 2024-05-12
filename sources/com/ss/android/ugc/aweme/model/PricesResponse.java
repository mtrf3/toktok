package com.ss.android.ugc.aweme.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PricesResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("local_currency_symbol")
    public final String localCurrencySymbol;

    @InterfaceC65349Pkn("price_list")
    public final List<Price> priceList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PricesResponse copy$default(PricesResponse pricesResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pricesResponse.localCurrencySymbol;
        }
        if ((i & 2) != 0) {
            list = pricesResponse.priceList;
        }
        return pricesResponse.copy(str, list);
    }

    public final PricesResponse copy(String localCurrencySymbol, List<Price> priceList) {
        o.LJIIIZ(localCurrencySymbol, "localCurrencySymbol");
        o.LJIIIZ(priceList, "priceList");
        return new PricesResponse(localCurrencySymbol, priceList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PricesResponse) {
            return C78966Uyw.LJIIIZ(((PricesResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{this.localCurrencySymbol, this.priceList};
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return C78966Uyw.LJJJLL("PricesResponse:%s,%s", getObjects());
    }

    public final String getLocalCurrencySymbol() {
        return this.localCurrencySymbol;
    }

    public final List<Price> getPriceList() {
        return this.priceList;
    }

    public PricesResponse(String localCurrencySymbol, List<Price> priceList) {
        o.LJIIIZ(localCurrencySymbol, "localCurrencySymbol");
        o.LJIIIZ(priceList, "priceList");
        this.localCurrencySymbol = localCurrencySymbol;
        this.priceList = priceList;
    }
}
