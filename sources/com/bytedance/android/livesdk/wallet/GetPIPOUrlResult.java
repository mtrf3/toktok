package com.bytedance.android.livesdk.wallet;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class GetPIPOUrlResult extends F9E {

    @InterfaceC65349Pkn("data")
    public UrlData data;

    /* loaded from: classes17.dex */
    public static final class UrlData extends F9E {

        @InterfaceC65349Pkn("merchant_id")
        public String merchantId;

        @InterfaceC65349Pkn("pipo_url")
        public String pipoUrl;

        @Override // X.F9E
        public final Object[] getObjects() {
            String str = this.pipoUrl;
            String str2 = this.merchantId;
            return new Object[]{str, str, str2, str2};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        UrlData urlData = this.data;
        return new Object[]{urlData, urlData};
    }
}
