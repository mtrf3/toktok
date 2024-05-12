package com.ss.android.ugc.aweme.shoutouts.network;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes3.dex */
public final class CheckWalletResponse extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes3.dex */
    public static final class Data {

        @InterfaceC65349Pkn("need_wallet_redirect")
        public Boolean canGoWallet;
    }
}
