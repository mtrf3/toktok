package X;

/* renamed from: X.QpT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC68187QpT extends C68054QnK {
    public boolean LIZJ;

    public abstract void LJIIIIZZ();

    public final void LJI() {
        if (this.LIZJ) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void LJII() {
        if (!this.LIZJ) {
            LJIIIIZZ();
            this.LIZIZ.LJIIZILJ++;
            this.LIZJ = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public AbstractC68187QpT(C68241QqL c68241QqL) {
        super(c68241QqL);
        this.LIZIZ.LJIILLIIL++;
    }
}
