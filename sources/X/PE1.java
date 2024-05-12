package X;

/* loaded from: classes12.dex */
public final class PE1 implements PD3 {
    public final /* synthetic */ PD7 LJLIL;
    public final /* synthetic */ Runnable LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Runnable runnable = this.LJLILLLLZI;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            PD2.LIZ.LIZ("APM_INNER_ERROR_async_task", th);
        }
    }

    @Override // X.PD3
    public final PD7 LJIJ() {
        return this.LJLIL;
    }

    public PE1(PD7 pd7, Runnable runnable, String str) {
        this.LJLIL = pd7;
        this.LJLILLLLZI = runnable;
    }
}
