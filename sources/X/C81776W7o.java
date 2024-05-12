package X;

/* renamed from: X.W7o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81776W7o extends WB7 {
    public final /* synthetic */ AbstractRunnableC81755W6t LIZ;
    public final /* synthetic */ C81774W7m LIZIZ;

    @Override // X.InterfaceC81847WAh
    public final void LIZJ() {
        this.LIZ.LIZ();
        W6T w6t = this.LIZIZ.LIZIZ;
        AbstractRunnableC81755W6t abstractRunnableC81755W6t = this.LIZ;
        synchronized (w6t) {
            w6t.LIZIZ.remove(abstractRunnableC81755W6t);
        }
    }

    public C81776W7o(C81774W7m c81774W7m, C81775W7n c81775W7n) {
        this.LIZIZ = c81774W7m;
        this.LIZ = c81775W7n;
    }
}
