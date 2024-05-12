package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api;

import X.C37228EjI;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC27212Am8;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteProductRequest;
import java.util.HashMap;

/* loaded from: classes7.dex */
public interface FavoriteApi {
    public static final C37228EjI LIZ = C37228EjI.LIZ;

    @E4T("/api/v1/favorite/api/add")
    Object favoriteProduct(@InterfaceC27211Am7 FavoriteProductRequest favoriteProductRequest, @InterfaceC27212Am8 HashMap<String, String> hashMap, InterfaceC67352kd<? super Response<Object>> interfaceC67352kd);

    @E4T("/api/v1/favorite/api/cancel")
    Object unFavoriteProduct(@InterfaceC27211Am7 FavoriteProductRequest favoriteProductRequest, InterfaceC67352kd<? super Response<Object>> interfaceC67352kd);
}
