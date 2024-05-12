package X;

/* loaded from: classes16.dex */
public abstract class XJB implements Runnable, Comparable<XJB>, T2N, XJH {
    public long LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI = -1;

    @Override // X.T2N
    public final synchronized void dispose() {
        XJC xjc;
        Object obj = this.LJLILLLLZI;
        C3BS c3bs = XJJ.LIZ;
        if (obj == c3bs) {
            return;
        }
        if ((obj instanceof XJC) && (xjc = (XJC) obj) != null) {
            xjc.LIZIZ(this);
        }
        this.LJLILLLLZI = c3bs;
    }

    @Override // X.XJH
    public final XJD<?> LIZJ() {
        Object obj = this.LJLILLLLZI;
        if (obj instanceof XJD) {
            return (XJD) obj;
        }
        return null;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Delayed[nanos=");
        return C47135Ieh.LIZIZ(LIZ, this.LJLIL, ']', LIZ);
    }

    @Override // X.XJH
    public final int getIndex() {
        return this.LJLJI;
    }

    public XJB(long j) {
        this.LJLIL = j;
    }

    @Override // X.XJH
    public final void LIZLLL(XJC xjc) {
        if (this.LJLILLLLZI != XJJ.LIZ) {
            this.LJLILLLLZI = xjc;
        } else {
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(XJB xjb) {
        long j = this.LJLIL - xjb.LJLIL;
        if (j > 0) {
            return 1;
        }
        if (j < 0) {
            return -1;
        }
        return 0;
    }

    @Override // X.XJH
    public final void setIndex(int i) {
        this.LJLJI = i;
    }
}
