package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.model.GiftSendResponse;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UV7 extends QXX {
    public final BaseResponse<SendGiftResult, GiftSendResponse.GiftExtra> LJLIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TaskSuccess(data:");
        LIZ.append(this.LJLIL.data);
        LIZ.append(", ext:");
        LIZ.append(this.LJLIL.extra);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UV7(BaseResponse<SendGiftResult, GiftSendResponse.GiftExtra> resp) {
        super(0);
        o.LJIIIZ(resp, "resp");
        this.LJLIL = resp;
    }
}
