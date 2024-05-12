package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.model.GiftSendResponse;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;

/* loaded from: classes14.dex */
public final class UV9 extends UVA {
    public final BaseResponse<SendGiftResult, GiftSendResponse.GiftExtra> LIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExecutorSuccess(data:");
        LIZ.append(this.LIZ.data);
        LIZ.append(", ext:");
        LIZ.append(this.LIZ.extra);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public UV9(BaseResponse<SendGiftResult, GiftSendResponse.GiftExtra> baseResponse) {
        this.LIZ = baseResponse;
    }
}
