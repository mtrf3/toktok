package X;

/* renamed from: X.SvY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73660SvY extends AbstractC73661SvZ<Runnable> {
    public static final long serialVersionUID = -8219729196779211169L;

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RunnableDisposable(disposed=");
        LIZ.append(isDisposed());
        LIZ.append(", ");
        LIZ.append(get());
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C73660SvY(Runnable runnable) {
        super(runnable);
    }

    @Override // X.AbstractC73661SvZ
    public final void LIZ(Runnable runnable) {
        runnable.run();
    }
}
