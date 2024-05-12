package X;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.2o8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69522o8 extends MB6 implements CoroutineExceptionHandler {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69522o8(AnonymousClass315 anonymousClass315, String str) {
        super(anonymousClass315);
        this.LJLIL = str;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        C69732oT.LJI(this.LJLIL);
    }
}
