package X;

/* renamed from: X.QnF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC68049QnF extends C68048QnE {
    public boolean LIZIZ;

    public abstract boolean LJI();

    public final void LJII() {
        if (this.LIZIZ) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void LJIIIIZZ() {
        if (!this.LIZIZ) {
            if (!LJI()) {
                this.LIZ.LJI();
                this.LIZIZ = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public AbstractC68049QnF(C68033Qmz c68033Qmz) {
        super(c68033Qmz);
        this.LIZ.LJJIIZ++;
    }
}
