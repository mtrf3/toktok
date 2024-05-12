package X;

/* loaded from: classes12.dex */
public class QI1 {
    public String LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final /* synthetic */ C66758QHy LJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.LIZJ);
        sb.append("-");
        sb.append(this.LIZLLL);
        sb.append("-");
        sb.append(this.LIZ);
        sb.append("-");
        sb.append(this.LIZIZ);
        return sb.toString();
    }

    public QI1(C66758QHy c66758QHy) {
        this.LJ = c66758QHy;
    }

    public final void LIZ(QI2 qi2, int i) {
        QIQ qiq;
        String LJI = qi2.LJI();
        if (LJI != null) {
            if (LJI.length() > this.LIZIZ) {
                this.LIZ = qi2.LJII();
                this.LIZIZ = LJI.length();
            }
            if (LJI.length() >= 50000) {
                QIB qib = this.LJ.LIZ.LJLJI.LIZLLL;
                if (i != 0) {
                    if (i != 2) {
                        qiq = QIQ.event_v3;
                    } else {
                        qiq = QIQ.log_data;
                    }
                } else {
                    qiq = QIQ.event;
                }
                qib.LJ(qiq, QIK.f_log_size_limit);
            }
            this.LIZLLL = LJI.length() + this.LIZLLL;
        }
    }
}
