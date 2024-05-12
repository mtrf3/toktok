package X;

/* renamed from: X.Ige, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47256Ige {
    public final IWH LIZ;
    public final InterfaceC47258Igg LIZIZ;
    public RunnableC47253Igb LIZJ;
    public RunnableC47252Iga LIZLLL;

    public final void LIZ(InterfaceC46811IYt interfaceC46811IYt) {
        if (this.LIZIZ.LLLIIII()) {
            this.LIZIZ.LLJJIII();
            new RunnableC47253Igb(this, interfaceC46811IYt).run();
        } else {
            this.LIZJ = new RunnableC47253Igb(this, interfaceC46811IYt);
        }
    }

    public C47256Ige(IWH iwh, InterfaceC47258Igg interfaceC47258Igg) {
        this.LIZ = iwh;
        this.LIZIZ = interfaceC47258Igg;
        interfaceC47258Igg.LLLIIIIL(new C47257Igf(this));
    }
}
