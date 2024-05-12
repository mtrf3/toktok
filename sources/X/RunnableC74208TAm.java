package X;

/* renamed from: X.TAm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC74208TAm<U, T extends U> extends C84662XKo<T> implements Runnable {
    public final long LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            long j = this.LJLJJI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Timed out waiting for ");
            LIZ2.append(j);
            LIZ2.append(" ms");
            LJJIJIIJI(new C74185T9p(X1D.LIZIZ(LIZ2), this));
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.XKZ, kotlinx.coroutines.JobSupport
    public final String LJJLIIIJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.LJJLIIIJ());
        LIZ.append("(timeMillis=");
        return C47135Ieh.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public RunnableC74208TAm(long j, InterfaceC67352kd<? super U> interfaceC67352kd) {
        super(interfaceC67352kd, interfaceC67352kd.getContext());
        this.LJLJJI = j;
    }
}
