package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.data.recharge.CreateOrderExtra;
import com.bytedance.android.live.wallet.model.DiamondBuyResult;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import tikcast.api.wallet.tiktok.DiamondBuyRequestParams;
import tikcast.api.wallet.tiktok.QueryOrderResult;

/* renamed from: X.UdX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77639UdX implements InterfaceC77647Udf {
    public final HashMap<String, C77651Udj> LIZ = new HashMap<>();

    @Override // X.InterfaceC77647Udf
    public final BaseResponse<DiamondBuyResult, CreateOrderExtra> LIZIZ(String orderId) {
        o.LJIIIZ(orderId, "orderId");
        C77651Udj c77651Udj = this.LIZ.get(orderId);
        if (c77651Udj != null) {
            return c77651Udj.LIZIZ;
        }
        return null;
    }

    @Override // X.InterfaceC77647Udf
    public final C77651Udj LIZLLL(String orderId) {
        o.LJIIIZ(orderId, "orderId");
        return this.LIZ.get(orderId);
    }

    @Override // X.InterfaceC77647Udf
    public final void LIZ(String orderId, QueryOrderResult queryOrderResult) {
        o.LJIIIZ(orderId, "orderId");
        o.LJIIIZ(queryOrderResult, "queryOrderResult");
        C77651Udj c77651Udj = this.LIZ.get(orderId);
        if (c77651Udj != null) {
            c77651Udj.LIZJ = queryOrderResult;
        }
    }

    @Override // X.InterfaceC77647Udf
    public final void LIZJ(DiamondBuyRequestParams requestParams, BaseResponse<DiamondBuyResult, CreateOrderExtra> createOrderResp) {
        String str;
        o.LJIIIZ(requestParams, "requestParams");
        o.LJIIIZ(createOrderResp, "createOrderResp");
        DiamondBuyResult diamondBuyResult = createOrderResp.data;
        if (diamondBuyResult != null && (str = diamondBuyResult.orderId) != null) {
            HashMap<String, C77651Udj> hashMap = this.LIZ;
            C77651Udj c77651Udj = new C77651Udj();
            c77651Udj.LIZIZ = createOrderResp;
            c77651Udj.LIZ = requestParams;
            hashMap.put(str, c77651Udj);
        }
    }
}
