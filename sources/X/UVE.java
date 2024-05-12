package X;

import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes14.dex */
public final class UVE implements UVF {
    public static final UVE LIZ = new UVE();

    @Override // X.UVF
    public final UVC LIZ(CoroutineExceptionHandler exceptionHandler, InterfaceC70422pa scope, AqS163S0100000_13 obtainPreRequestInterceptors, AqS163S0100000_13 obtainPreRequestProcessors, InterfaceC88471Ynr onResult, InterfaceC88471Ynr onFail, InterfaceC65784Pro onAvailable) {
        o.LJIIIZ(exceptionHandler, "exceptionHandler");
        o.LJIIIZ(scope, "scope");
        o.LJIIIZ(obtainPreRequestInterceptors, "obtainPreRequestInterceptors");
        o.LJIIIZ(obtainPreRequestProcessors, "obtainPreRequestProcessors");
        o.LJIIIZ(onResult, "onResult");
        o.LJIIIZ(onFail, "onFail");
        o.LJIIIZ(onAvailable, "onAvailable");
        return new UVC(scope, obtainPreRequestInterceptors, obtainPreRequestProcessors, onResult, onFail, onAvailable);
    }
}
