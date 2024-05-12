package X;

/* renamed from: X.SzD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73887SzD implements Runnable {
    public final T LJLIL;
    public final /* synthetic */ C73884SzA LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLILLLLZI.LJLIL.onNext(this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC73887SzD(C73884SzA c73884SzA, T t) {
        this.LJLILLLLZI = c73884SzA;
        this.LJLIL = t;
    }
}
