package X;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.BhS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29470BhS extends MB6 implements CoroutineExceptionHandler {
    public final /* synthetic */ C29465BhN LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29470BhS(AnonymousClass315 anonymousClass315, C29465BhN c29465BhN) {
        super(anonymousClass315);
        this.LJLIL = c29465BhN;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        this.LJLIL.LIZJ.setValue(new C29488Bhk<>(null, 2, th));
    }
}
