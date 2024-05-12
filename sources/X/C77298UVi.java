package X;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.UVi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77298UVi extends MB6 implements CoroutineExceptionHandler {
    public final /* synthetic */ C77291UVb LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77298UVi(AnonymousClass315 anonymousClass315, C77291UVb c77291UVb) {
        super(anonymousClass315);
        this.LJLIL = c77291UVb;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        C0NB.LJFF(this.LJLIL.LJII, "CoroutineException", th);
    }
}
