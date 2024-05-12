package X;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.2o0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69442o0 extends MB6 implements CoroutineExceptionHandler {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ InterfaceC88472Yns LJLILLLLZI;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load friends data failed, isLoadMore: ");
        LIZ.append(this.LJLIL);
        LIZ.append(", stacktrace: ");
        LIZ.append(android.util.Log.getStackTraceString(th));
        H78.LIZIZ("SharedAR", X1D.LIZIZ(LIZ));
        InterfaceC88472Yns interfaceC88472Yns = this.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69442o0(AnonymousClass315 anonymousClass315, boolean z, InterfaceC88472Yns interfaceC88472Yns) {
        super(anonymousClass315);
        this.LJLIL = z;
        this.LJLILLLLZI = interfaceC88472Yns;
    }
}
