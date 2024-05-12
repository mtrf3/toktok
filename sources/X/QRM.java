package X;

/* loaded from: classes12.dex */
public final class QRM implements InterfaceC66984QQq {
    public static final QRM LJIIIIZZ = new QRM();
    public final HG3 LIZ = new HG3();
    public QRR LIZIZ;
    public C66970QQc LIZJ;
    public volatile QRN LIZLLL;
    public volatile QRP LJ;
    public volatile QR4 LJFF;
    public volatile QRC LJI;
    public volatile InterfaceC67000QRg LJII;

    public static InterfaceC67000QRg LJFF() {
        return LJIIIIZZ.LIZIZ();
    }

    public static InterfaceC39118FWw LJI() {
        return LJIIIIZZ.LIZLLL();
    }

    public static R39 LJII() {
        return LJIIIIZZ.LIZIZ.LJIIJJI;
    }

    public static QR4 LJIIIIZZ() {
        QRM qrm = LJIIIIZZ;
        if (qrm.LJFF == null) {
            synchronized (qrm) {
                if (qrm.LJFF == null) {
                    QRP LJ = qrm.LJ();
                    qrm.LIZLLL();
                    qrm.LJFF = new QR4(LJ, qrm.LIZIZ);
                }
            }
        }
        return qrm.LJFF;
    }

    public final java.util.Map<String, String> LIZ() {
        return this.LIZJ.LIZ();
    }

    public final InterfaceC67000QRg LIZIZ() {
        if (this.LJII == null) {
            synchronized (this) {
                if (this.LJII == null) {
                    if (C36929EeT.LJFF(this.LIZIZ.LIZ)) {
                        this.LJII = new QSQ(this.LIZIZ);
                    } else {
                        this.LJII = new O6R(0);
                    }
                }
            }
        }
        return this.LJII;
    }

    public final QRO LIZJ() {
        if (this.LIZLLL == null) {
            synchronized (this) {
                if (this.LIZLLL == null) {
                    this.LIZLLL = new QRN(this);
                }
            }
        }
        return this.LIZLLL;
    }

    public final InterfaceC39118FWw LIZLLL() {
        if (this.LJI == null) {
            synchronized (this) {
                if (this.LJI == null) {
                    this.LJI = new QRC(this.LIZIZ);
                }
            }
        }
        return this.LJI;
    }

    public final QRP LJ() {
        if (this.LJ == null) {
            synchronized (this) {
                if (this.LJ == null) {
                    this.LJ = new QRP();
                }
            }
        }
        return this.LJ;
    }
}
