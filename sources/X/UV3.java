package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.model.GiftSendResponse;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UV3 extends UV5 {
    public final UV2 LIZ;
    public final BaseResponse<SendGiftResult, GiftSendResponse.GiftExtra> LIZIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StateSuccess:");
        LIZ.append(this.LIZ.LJIIIZ());
        LIZ.append(" resp:");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public UV3(UV2 sendInfo, BaseResponse<SendGiftResult, GiftSendResponse.GiftExtra> resp) {
        o.LJIIIZ(sendInfo, "sendInfo");
        o.LJIIIZ(resp, "resp");
        this.LIZ = sendInfo;
        this.LIZIZ = resp;
    }
}
