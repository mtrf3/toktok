package X;

/* renamed from: X.Jdf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49619Jdf implements InterfaceC49620Jdg {
    public final /* synthetic */ Runnable LIZ;
    public final /* synthetic */ C49710Jf8 LIZIZ;

    @Override // X.InterfaceC49620Jdg
    public final void LIZ() {
        this.LIZ.run();
        this.LIZIZ.LLLIIL.LIZIZ().remove(this);
    }

    public C49619Jdf(Runnable runnable, C49710Jf8 c49710Jf8) {
        this.LIZ = runnable;
        this.LIZIZ = c49710Jf8;
    }
}
