package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.WM7;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ModifyRequest {

    @InterfaceC65349Pkn("item_id")
    public final String itemId;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final int scene;

    public ModifyRequest(String itemId, int i) {
        o.LJIIIZ(itemId, "itemId");
        this.itemId = itemId;
        this.scene = i;
    }
}
