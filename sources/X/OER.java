package X;

/* loaded from: classes11.dex */
public abstract class OER implements Runnable, Comparable<OER> {
    public final int LJLIL;
    public final OES LJLILLLLZI;

    @Override // java.lang.Comparable
    public final int compareTo(OER oer) {
        int i = this.LJLIL;
        int i2 = oer.LJLIL;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return 0;
    }

    public OER(int i, OES oes) {
        this.LJLIL = i;
        this.LJLILLLLZI = oes;
    }
}
