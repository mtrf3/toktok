package X;

import com.ss.android.ugc.aweme.setting.model.AuthAppInfoListResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AYO<T, R> implements InterfaceC48038ItG {
    public static final AYO<T, R> LJLIL = new AYO<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        AuthAppInfoListResponse resp = (AuthAppInfoListResponse) obj;
        o.LJIIIZ(resp, "resp");
        return resp.authorizationList;
    }
}
