package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api;

import X.AbstractC73672Svk;
import X.C10K;
import X.C27965AyH;
import X.C28025AzF;
import X.E4Q;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC27212Am8;
import X.InterfaceC28048Azc;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import X.QDX;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddOnWriteImpressionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddOnWriteImpressionResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckLawfulRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckLawfulResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuitReasonData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SubmitQuitReasonRequest;
import java.util.HashMap;

/* loaded from: classes5.dex */
public interface OrderSubmitApi {
    public static final C27965AyH LIZ = C27965AyH.LIZ;

    @E4T("/api/v1/shop/recommend/impression/write")
    AbstractC73672Svk<AddOnWriteImpressionResponse> addOnWriteImpression(@InterfaceC27211Am7 AddOnWriteImpressionRequest addOnWriteImpressionRequest);

    @E4T("/api/v1/reverse/cancel_order")
    Object cancelOrder(@InterfaceC27211Am7 CancelOrderRequest cancelOrderRequest, @InterfaceC27212Am8 HashMap<String, String> hashMap, InterfaceC67352kd<? super CancelOrderResponse> interfaceC67352kd);

    @E4T("/api/v1/trade/check_lawful")
    AbstractC73672Svk<CheckLawfulResponse> checkLawful(@InterfaceC27211Am7 CheckLawfulRequest checkLawfulRequest);

    @E4T("/api/v1/trade/order/create")
    AbstractC73672Svk<C28025AzF> createOrder(@InterfaceC27211Am7 CreateOrderRequest createOrderRequest, @InterfaceC27212Am8 HashMap<String, String> hashMap);

    @E4T("/api/v1/shop/bill_info/get")
    AbstractC73672Svk<BillInfoResponse> getBillInfo(@InterfaceC27211Am7 BillInfoRequest billInfoRequest, @InterfaceC27212Am8 HashMap<String, String> hashMap);

    @InterfaceC28048Azc
    @E4T("/api/v2/shop/bill_info/get")
    C10K<QDX<BillInfoResponse>> getBillInfoByChunk(@InterfaceC27211Am7 BillInfoRequest billInfoRequest, @InterfaceC27212Am8 HashMap<String, String> hashMap);

    @E4Q("api/v1/shop/quit_reasons/get")
    AbstractC73672Svk<Response<QuitReasonData>> getQuitReason(@InterfaceC64989Pez("reason_show_type") int i);

    @E4T("/api/v1/shop/quit_reasons/save")
    AbstractC73672Svk<Response<Object>> submitQuitReason(@InterfaceC27211Am7 SubmitQuitReasonRequest submitQuitReasonRequest);
}
