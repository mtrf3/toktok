package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.api;

import X.AbstractC73672Svk;
import X.C27097AkH;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC27212Am8;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryRequest;
import java.util.HashMap;

/* loaded from: classes5.dex */
public interface DeliveryApi {
    public static final C27097AkH LIZ = C27097AkH.LIZ;

    @E4T("/api/v1/shop/logistic/list")
    AbstractC73672Svk<Response<DeliveryData>> getLogistics(@InterfaceC27211Am7 DeliveryRequest deliveryRequest, @InterfaceC27212Am8 HashMap<String, String> hashMap);
}
