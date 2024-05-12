package X;

/* renamed from: X.SyD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73825SyD implements Runnable {
    public final T LJLIL;
    public final /* synthetic */ C73824SyC LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLILLLLZI.LJLILLLLZI.onSuccess(this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC73825SyD(C73824SyC c73824SyC, T t) {
        this.LJLILLLLZI = c73824SyC;
        this.LJLIL = t;
    }
}
