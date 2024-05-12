package X;

/* loaded from: classes8.dex */
public final class ICI implements ICH {
    public final ICH LIZ;

    @Override // X.ICH
    public final void pause() {
        this.LIZ.pause();
    }

    @Override // X.ICH
    public final void start() {
        this.LIZ.start();
    }

    public ICI(ICH ich) {
        this.LIZ = ich;
    }

    @Override // X.ICH
    public final void LIZIZ(boolean z) {
        this.LIZ.LIZIZ(z);
    }

    @Override // X.ICH
    public final void LIZJ(ICF icf) {
        this.LIZ.LIZJ(icf);
    }
}
