package X;

import com.bytedance.android.live.network.response.BaseResponse;
import kotlin.jvm.internal.o;
import webcast.api.linkmic.GetUserLinkmicStatusResponse;

/* renamed from: X.Bii, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29548Bii<T1, T2, R> implements RTU {
    public static final C29548Bii<T1, T2, R> LJLIL = new C29548Bii<>();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.RTU
    public final Object apply(Object obj, Object obj2) {
        Boolean a1 = (Boolean) obj;
        BaseResponse a2 = (BaseResponse) obj2;
        o.LJIIIZ(a1, "a1");
        o.LJIIIZ(a2, "a2");
        return new C29547Bih(a1.booleanValue(), (GetUserLinkmicStatusResponse.ResponseData) a2.data);
    }
}
