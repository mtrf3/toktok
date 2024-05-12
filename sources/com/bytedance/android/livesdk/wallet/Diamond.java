package com.bytedance.android.livesdk.wallet;

import X.C77745UfF;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.wallet.model.CurrencyPriceItem;
import java.util.List;

/* loaded from: classes14.dex */
public class Diamond extends F9E {
    public int LJLIL;
    public String LJLILLLLZI;
    public long LJLJI;
    public final String LJLJJI;
    public C77745UfF LJLJJL;
    public Boolean LJLJJLL;

    @InterfaceC65349Pkn("diamond_count")
    public int count;

    @InterfaceC65349Pkn("coupon_id")
    public String couponId;

    @InterfaceC65349Pkn("currency_price")
    public List<CurrencyPriceItem> currencyPrice;

    @InterfaceC65349Pkn("describe")
    public String describe;

    @InterfaceC65349Pkn("discount_price")
    public Integer discountPrice;

    @InterfaceC65349Pkn("exchange_price")
    public Integer exchangePrice;

    @InterfaceC65349Pkn("giving_count")
    public int givingCount;

    @InterfaceC65349Pkn("iap_id")
    public String iapId;

    @InterfaceC65349Pkn("id")
    public int id;

    @InterfaceC65349Pkn("price")
    public String price;

    @InterfaceC65349Pkn("stall_type")
    public int stallType;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.id), this.iapId, this.price, Integer.valueOf(this.count)};
    }

    public Diamond() {
        this.LJLILLLLZI = "";
        this.LJLJJI = "";
        this.LJLJJLL = Boolean.TRUE;
    }

    public Diamond(String str, String str2, String str3, long j, String str4) {
        this.LJLJJI = "";
        this.LJLJJLL = Boolean.TRUE;
        this.iapId = str;
        this.price = str2;
        this.LJLILLLLZI = str3;
        this.LJLJI = j;
        this.LJLJJI = str4;
    }
}
