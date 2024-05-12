package com.bytedance.android.live.wallet.data.model.exchange;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class ExchangeUpdateAddressRequest {

    @InterfaceC65349Pkn("city")
    public String city;

    @InterfaceC65349Pkn("country_code")
    public String countryCode;

    @InterfaceC65349Pkn("county")
    public String county;

    @InterfaceC65349Pkn("state_code")
    public String stateCode;

    /* JADX WARN: Multi-variable type inference failed */
    public ExchangeUpdateAddressRequest() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public ExchangeUpdateAddressRequest(String str, String str2, String str3, String str4) {
        this.countryCode = str;
        this.stateCode = str2;
        this.county = str3;
        this.city = str4;
    }

    public /* synthetic */ ExchangeUpdateAddressRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
