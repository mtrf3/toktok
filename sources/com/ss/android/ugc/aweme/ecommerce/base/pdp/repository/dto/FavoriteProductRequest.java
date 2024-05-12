package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FavoriteProductRequest extends F9E {

    @InterfaceC65349Pkn("favorite_infos")
    public final List<FavoriteInfo> favoriteInfos;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.favoriteInfos};
    }

    public FavoriteProductRequest(List<FavoriteInfo> favoriteInfos) {
        o.LJIIIZ(favoriteInfos, "favoriteInfos");
        this.favoriteInfos = favoriteInfos;
    }
}
