package X;

/* loaded from: classes12.dex */
public final class QCD {
    public static final QCF LIZ = new QCF();
    public static long LIZIZ = -1;
    public static final QCE LIZJ = new QCE();
    public static final QCC LIZLLL = new QCC();
    public static QCD LJ;

    public static synchronized QCD LIZ() {
        QCD qcd;
        synchronized (QCD.class) {
            if (LJ == null) {
                LJ = new QCD();
            }
            qcd = LJ;
        }
        return qcd;
    }
}
