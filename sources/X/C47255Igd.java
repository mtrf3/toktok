package X;

/* renamed from: X.Igd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47255Igd extends RunnableC47259Igh {
    public RunnableC47254Igc LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLILLLLZI.LLLIIIIL(new C47260Igi(this));
            if (this.LJLILLLLZI.LLLIIII()) {
                this.LJLILLLLZI.LLJJIII();
                new RunnableC47254Igc(this).run();
            } else {
                this.LJLJJI = new RunnableC47254Igc(this);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public C47255Igd(IWH iwh, InterfaceC47258Igg interfaceC47258Igg, InterfaceC46811IYt interfaceC46811IYt) {
        super(iwh, interfaceC47258Igg, interfaceC46811IYt);
    }
}
