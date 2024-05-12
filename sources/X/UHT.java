package X;

/* loaded from: classes14.dex */
public final class UHT implements UHU {
    public W5P LIZ;
    public AbstractC81686W4c LIZIZ;
    public VA9 LIZJ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.W5O, REQUEST] */
    @Override // X.UHU
    public final void LIZ(int i, int i2) {
        W5P w5p = this.LIZ;
        AbstractC81686W4c abstractC81686W4c = this.LIZIZ;
        if (w5p == null) {
            return;
        }
        w5p.LIZJ = new C79238V7y(i, i2);
        abstractC81686W4c.LIZLLL = w5p.LIZ();
        this.LIZJ.setController(abstractC81686W4c.LIZ());
    }

    public UHT(W5P w5p, AbstractC81686W4c abstractC81686W4c, VA9 va9) {
        va9.getClass();
        this.LIZ = w5p;
        this.LIZIZ = abstractC81686W4c;
        this.LIZJ = va9;
    }
}
