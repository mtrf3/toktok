package X;

import java.util.concurrent.TimeoutException;

/* renamed from: X.Mel, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57331Mel implements InterfaceC57361MfF<C57311MeR> {
    @Override // X.InterfaceC57361MfF
    public final C57355Mf9<C57311MeR> LIZ(C57355Mf9<C57311MeR> c57355Mf9) {
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(c57355Mf9.LIZ);
        if (m10exceptionOrNullimpl != null && !(m10exceptionOrNullimpl instanceof TimeoutException)) {
            return new C57355Mf9<>(c57355Mf9.LIZ, new C57332Mem(true, 2));
        }
        return c57355Mf9;
    }
}
