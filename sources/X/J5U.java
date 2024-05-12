package X;

/* loaded from: classes9.dex */
public abstract class J5U implements J6D {
    public boolean LIZ;
    public J5W LIZIZ;

    public abstract void LIZIZ(C11030bz c11030bz);

    public abstract void LIZJ();

    public abstract void LIZLLL();

    @Override // X.J6D
    public final void start() {
        if (this.LIZ) {
            return;
        }
        LIZJ();
        this.LIZ = true;
    }

    @Override // X.J6D
    public final void stop() {
        if (!this.LIZ) {
            return;
        }
        this.LIZ = false;
        LIZLLL();
    }

    public J5U() {
        new J5Q(-1);
    }

    @Override // X.J6D
    public final boolean isStarted() {
        return this.LIZ;
    }

    @Override // X.J6D
    public final void LIZ(C11030bz c11030bz) {
        if (!this.LIZ) {
            return;
        }
        LIZIZ(c11030bz);
    }
}
