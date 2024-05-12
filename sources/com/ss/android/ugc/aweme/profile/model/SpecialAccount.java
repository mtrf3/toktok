package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class SpecialAccount implements Serializable {

    @InterfaceC65349Pkn("tt_seller")
    public final TTSeller seller;

    public final TTSeller getSeller() {
        return this.seller;
    }

    public SpecialAccount(TTSeller tTSeller) {
        this.seller = tTSeller;
    }
}
