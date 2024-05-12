package X;

/* loaded from: classes14.dex */
public final class UI1 implements UI3 {
    public final /* synthetic */ Runnable LIZ;
    public final /* synthetic */ Runnable LIZIZ;

    @Override // X.UI3
    public final void LIZ() {
        Runnable runnable = this.LIZ;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // X.UI3
    public final void LIZIZ() {
        Runnable runnable = this.LIZIZ;
        if (runnable != null) {
            runnable.run();
        }
    }

    public UI1(Runnable runnable, Runnable runnable2) {
        this.LIZ = runnable;
        this.LIZIZ = runnable2;
    }
}
