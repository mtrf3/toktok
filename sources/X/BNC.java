package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;

/* loaded from: classes6.dex */
public final class BNC<T> implements InterfaceC64592gB {
    public static final BNC<T> LJLIL = new BNC<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        T t;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (t = baseResponse.data) != null && ((ShareReportResult) t).getDeltaIntimacy() > 0) {
            C73943T0h.LIZ().LIZIZ(new BNB((ShareReportResult) baseResponse.data));
        }
    }
}
