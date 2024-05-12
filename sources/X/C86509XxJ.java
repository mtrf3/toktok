package X;

/* renamed from: X.XxJ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86509XxJ<TTaskResult, TContinuationResult> implements C10I {
    public static final C86509XxJ<TTaskResult, TContinuationResult> LIZ = new C86509XxJ<>();

    @Override // X.C10I
    public final Object then(C10K c10k) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("loop end, queue:");
        HandlerC86501XxB handlerC86501XxB = HandlerC86501XxB.LIZ;
        handlerC86501XxB.getClass();
        LIZ2.append(HandlerC86501XxB.LIZJ().size());
        C86478Xwo.LIZLLL("InnerPushQueueLooper", X1D.LIZIZ(LIZ2));
        HandlerC86501XxB.LIZJ = false;
        handlerC86501XxB.LJ(false);
        return C76800UCe.LIZ;
    }
}
