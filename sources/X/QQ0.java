package X;

/* loaded from: classes12.dex */
public abstract class QQ0 {
    public QQ8 mJobController;

    public void cancelApi() {
        QQ8 qq8 = this.mJobController;
        if (qq8 != null) {
            AbstractC66965QPx abstractC66965QPx = (AbstractC66965QPx) qq8;
            abstractC66965QPx.LJ = null;
            C66966QPy c66966QPy = abstractC66965QPx.LJFF;
            if (c66966QPy != null) {
                c66966QPy.LJLILLLLZI.compareAndSet(false, true);
            }
        }
    }
}
