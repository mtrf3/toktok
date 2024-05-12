package X;

/* loaded from: classes12.dex */
public final class QP2 implements QRB {
    public static final QP2 LIZ = new QP2();
    public static QP4 LIZIZ;
    public static QP3 LIZJ;

    @Override // X.QRB
    public final void LIZIZ() {
        if (C35154Dqw.LIZ()) {
            if (LIZJ != null) {
                C67128QWe.LIZIZ.LJIIJ();
            }
        } else if (LIZIZ != null) {
            QWY LIZ2 = QWY.LJIIIZ.LIZ();
            LIZ2.LJIIIIZZ.remove(new M50(1777, 1777));
        }
    }

    @Override // X.QRB
    public final void LIZ(QR9 qr9) {
        if (C35154Dqw.LIZ()) {
            C67128QWe c67128QWe = C67128QWe.LIZIZ;
            c67128QWe.LJIIIIZZ(new QP1(qr9));
            if (LIZJ == null) {
                LIZJ = new QP3(qr9);
            }
            QP3 qp3 = LIZJ;
            if (qp3 != null) {
                c67128QWe.LIZJ(1777, 1777, qp3);
                return;
            }
            return;
        }
        C67143QWt c67143QWt = QWY.LJIIIZ;
        c67143QWt.LIZ().LIZJ(new QP0(qr9));
        if (LIZIZ == null) {
            LIZIZ = new QP4(qr9);
        }
        QP4 qp4 = LIZIZ;
        if (qp4 != null) {
            c67143QWt.LIZ().LIZLLL(new M50(1777, 1777), qp4);
        }
    }
}
