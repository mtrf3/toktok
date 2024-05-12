package X;

/* loaded from: classes12.dex */
public final class QSV {
    public static volatile QSV LIZIZ;
    public final InterfaceC67020QSa LIZ;

    public static QSV LIZ() {
        if (LIZIZ == null) {
            synchronized (QSV.class) {
                if (LIZIZ == null) {
                    LIZIZ = new QSV();
                }
            }
        }
        return LIZIZ;
    }

    public QSV() {
        if (this.LIZ == null) {
            QSW qsw = new QSW();
            C66960QPs.LIZ();
            qsw.LIZ = QWR.LIZ();
            qsw.LIZLLL = false;
            qsw.LIZIZ = "account";
            qsw.LIZJ = "0.1.9";
            qsw.LJ = 0;
            this.LIZ = QSX.LIZ(qsw.LIZ());
        }
    }
}
