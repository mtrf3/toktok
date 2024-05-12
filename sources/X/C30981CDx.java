package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.CDx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30981CDx<T1, T2, R> implements RTU {
    public static final C30981CDx<T1, T2, R> LJLIL = new C30981CDx<>();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.RTU
    public final Object apply(Object obj, Object obj2) {
        BaseResponse subscribeInfoResponse = (BaseResponse) obj;
        Boolean emailInfoResponse = (Boolean) obj2;
        o.LJIIIZ(subscribeInfoResponse, "subscribeInfoResponse");
        o.LJIIIZ(emailInfoResponse, "emailInfoResponse");
        T t = subscribeInfoResponse.data;
        o.LJIIIIZZ(t, "subscribeInfoResponse.data");
        return new CE9((GetSubInfoResponse) t, emailInfoResponse.booleanValue());
    }
}
