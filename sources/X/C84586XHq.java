package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.XHq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84586XHq extends AbstractC65781Prl implements InterfaceC88472Yns<C57355Mf9<XI5>, C57355Mf9<XI5>> {
    public static final C84586XHq LJLIL = new C84586XHq();

    public C84586XHq() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C57355Mf9<XI5> invoke(C57355Mf9<XI5> c57355Mf9) {
        C57355Mf9<XI5> it = c57355Mf9;
        o.LJIIIZ(it, "it");
        if (C3C5.m10exceptionOrNullimpl(it.LIZ) instanceof C38333F2r) {
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(it.LIZ);
            o.LJII(m10exceptionOrNullimpl, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
            C38306F1q c38306F1q = (C38306F1q) m10exceptionOrNullimpl;
            if (c38306F1q.getErrorCode() == 3009015 || c38306F1q.getErrorCode() == 4097) {
                XI5 xi5 = new XI5(new BaseResponse());
                C3C5.m7constructorimpl(xi5);
                return new C57355Mf9<>(xi5, it.LIZIZ);
            }
            return it;
        }
        return it;
    }
}
