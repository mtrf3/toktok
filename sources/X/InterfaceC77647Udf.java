package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.data.recharge.CreateOrderExtra;
import com.bytedance.android.live.wallet.model.DiamondBuyResult;
import tikcast.api.wallet.tiktok.DiamondBuyRequestParams;
import tikcast.api.wallet.tiktok.QueryOrderResult;

/* renamed from: X.Udf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77647Udf {
    void LIZ(String str, QueryOrderResult queryOrderResult);

    BaseResponse<DiamondBuyResult, CreateOrderExtra> LIZIZ(String str);

    void LIZJ(DiamondBuyRequestParams diamondBuyRequestParams, BaseResponse<DiamondBuyResult, CreateOrderExtra> baseResponse);

    C77651Udj LIZLLL(String str);
}
