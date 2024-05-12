package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.J7r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48655J7r<T, R> implements InterfaceC48038ItG {
    public static final C48655J7r<T, R> LJLIL = new C48655J7r<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        if (it.status_code == 0) {
            return C76800UCe.LIZ;
        }
        throw new RuntimeException("server error");
    }
}
