package X;

/* loaded from: classes15.dex */
public final class W6L implements C10I<Boolean, C10K<Boolean>> {
    public final /* synthetic */ W6U LIZ;
    public final /* synthetic */ W6J LIZIZ;

    @Override // X.C10I
    public final C10K<Boolean> then(C10K<Boolean> c10k) {
        if (!c10k.LJIIL() && !c10k.LJIILJJIL() && c10k.LJIIJJI().booleanValue()) {
            return C10K.LJIIIZ(Boolean.TRUE);
        }
        return this.LIZIZ.LJI.LIZIZ(this.LIZ);
    }

    public W6L(W6J w6j, W6U w6u) {
        this.LIZIZ = w6j;
        this.LIZ = w6u;
    }
}
