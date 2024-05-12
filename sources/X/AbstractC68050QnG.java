package X;

/* renamed from: X.QnG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC68050QnG extends C68052QnI {
    public boolean LIZIZ;

    public abstract boolean LJIIIIZZ();

    public final void LJI() {
        if (this.LIZIZ) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void LJII() {
        if (!this.LIZIZ) {
            if (!LJIIIIZZ()) {
                this.LIZ.LJI();
                this.LIZIZ = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public AbstractC68050QnG(C68033Qmz c68033Qmz) {
        super(c68033Qmz);
        this.LIZ.LJJIIZ++;
    }
}
