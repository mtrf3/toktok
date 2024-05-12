package X;

import com.bytedance.android.live.network.response.BaseResponse;
import kotlin.jvm.internal.o;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* renamed from: X.C8v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30849C8v<T> implements InterfaceC64592gB {
    public static final C30849C8v<T> LJLIL = new C30849C8v<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        T t = ((BaseResponse) obj).data;
        o.LJIIIIZZ(t, "it.data");
        C30846C8s.LIZIZ((GetSubPrivilegeDetailResponse.Data) t);
    }
}
