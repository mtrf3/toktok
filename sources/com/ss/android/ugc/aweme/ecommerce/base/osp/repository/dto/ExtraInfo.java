package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ExtraInfo extends F9E {

    @InterfaceC65349Pkn("sku_infos")
    public final List<SkuInfo> skuInfos;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.skuInfos};
    }

    public ExtraInfo(List<SkuInfo> skuInfos) {
        o.LJIIIZ(skuInfos, "skuInfos");
        this.skuInfos = skuInfos;
    }
}
