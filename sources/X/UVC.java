package X;

import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UVC extends AbstractC77292UVc {
    public final InterfaceC65784Pro<List<InterfaceC77303UVn>> LJIIIZ;
    public final String LJIIJ;

    @Override // X.AbstractC77292UVc
    public final InterfaceC65784Pro<List<InterfaceC77303UVn>> LJI() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC77292UVc
    public final String LJII() {
        return this.LJIIJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0123 A[Catch: all -> 0x0136, TryCatch #0 {all -> 0x0136, blocks: (B:11:0x011a, B:12:0x011d, B:14:0x0123, B:17:0x0129), top: B:10:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0129 A[Catch: all -> 0x0136, TryCatch #0 {all -> 0x0136, blocks: (B:11:0x011a, B:12:0x011d, B:14:0x0123, B:17:0x0129), top: B:10:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // X.AbstractC77292UVc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C32816CuK r30, X.InterfaceC67352kd<? super X.UVA> r31) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UVC.LJFF(X.CuK, X.2kd):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UVC(InterfaceC70422pa scope, AqS163S0100000_13 obtainPreRequestInterceptors, AqS163S0100000_13 obtainPreRequestProcessor, InterfaceC88471Ynr onResult, InterfaceC88471Ynr onFail, InterfaceC65784Pro onAvailable) {
        super(scope, obtainPreRequestInterceptors, obtainPreRequestProcessor, onResult, onFail, onAvailable);
        o.LJIIIZ(scope, "scope");
        o.LJIIIZ(obtainPreRequestInterceptors, "obtainPreRequestInterceptors");
        o.LJIIIZ(obtainPreRequestProcessor, "obtainPreRequestProcessor");
        o.LJIIIZ(onResult, "onResult");
        o.LJIIIZ(onFail, "onFail");
        o.LJIIIZ(onAvailable, "onAvailable");
        this.LJIIIZ = obtainPreRequestProcessor;
        this.LJIIJ = "RetrofitSendGiftExecutor";
    }
}
