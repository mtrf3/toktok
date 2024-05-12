package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.model.CalmDownInfo;
import com.bytedance.android.livesdk.gift.model.GiftSendResponse;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import kotlin.jvm.internal.o;

/* renamed from: X.Cuk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32842Cuk extends AbstractC32132CjI implements UVU {
    public final String LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32842Cuk(InterfaceC32124CjA requireRef) {
        super(requireRef);
        o.LJIIIZ(requireRef, "requireRef");
        this.LIZLLL = "PostSendGiftInterceptor";
    }

    @Override // X.UVU
    public final C35928E8e LJ(UV9 uv9) {
        SendGiftResult sendGiftResult;
        SendGiftResult sendGiftResult2;
        if (this.LIZJ) {
            BaseResponse<SendGiftResult, GiftSendResponse.GiftExtra> baseResponse = uv9.LIZ;
            if (baseResponse != null) {
                sendGiftResult = baseResponse.data;
            } else {
                sendGiftResult = null;
            }
            if (sendGiftResult == null || (sendGiftResult2 = baseResponse.data) == null) {
                return new C35928E8e(C88567YpP.LIZ, true);
            }
            SendGiftResult sendGiftResult3 = sendGiftResult2;
            CalmDownInfo calmDownInfo = sendGiftResult3.mCalmDownInfo;
            if (calmDownInfo != null && calmDownInfo.mRemainTime > 0) {
                String str = baseResponse.LIZIZ;
                if (str == null) {
                    str = "";
                }
                return new C35928E8e(new C88558YpG(calmDownInfo, sendGiftResult3, str), true);
            }
            return new C35928E8e();
        }
        C0NB.LJ(this.LIZLLL, "request check on invalid interceptor!");
        return new C35928E8e();
    }
}
