package com.ss.android.ugc.aweme.shoutouts.model;

import X.AbstractC73638SvC;
import X.C51716KRk;
import X.E4Q;
import X.InterfaceC64989Pez;

/* loaded from: classes9.dex */
public interface ShoutoutsOrderGetApi {
    public static final C51716KRk LIZ = C51716KRk.LIZ;

    @E4Q("/tiktok/shoutouts/order/get/v1")
    AbstractC73638SvC<ShoutoutsOrderGetResp> getOrder(@InterfaceC64989Pez("order_id") String str);
}
