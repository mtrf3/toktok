package X;

/* loaded from: classes12.dex */
public final class QDC {
    public final Object LIZ;
    public final QD4 LIZIZ;
    public volatile boolean LIZJ = true;

    public final int hashCode() {
        return this.LIZIZ.LJFF.hashCode() + this.LIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof QDC)) {
            return false;
        }
        QDC qdc = (QDC) obj;
        if (this.LIZ != qdc.LIZ || !this.LIZIZ.equals(qdc.LIZIZ)) {
            return false;
        }
        return true;
    }

    public QDC(Object obj, QD4 qd4) {
        this.LIZ = obj;
        this.LIZIZ = qd4;
    }
}
