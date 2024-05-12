package X;

/* renamed from: X.QkR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67875QkR<TListener> {
    public TListener LIZ;
    public boolean LIZIZ;
    public final /* synthetic */ AbstractC67863QkF LIZJ;

    public AbstractC67875QkR(AbstractC67863QkF abstractC67863QkF, TListener tlistener) {
        this.LIZJ = abstractC67863QkF;
        this.LIZ = tlistener;
    }

    public abstract void LIZ();

    public abstract void LIZIZ();

    public final void LIZJ() {
        synchronized (this) {
            this.LIZ = null;
        }
    }

    public final void LIZLLL() {
        LIZJ();
        synchronized (this.LIZJ.LJZ) {
            this.LIZJ.LJZ.remove(this);
        }
    }
}
