package X;

/* renamed from: X.QRw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67016QRw {
    public static C67016QRw LIZIZ;
    public QSE LIZ;

    public C67016QRw(QSE qse) {
        this.LIZ = qse;
    }

    public static synchronized void LIZ(QSE qse) {
        synchronized (C67016QRw.class) {
            if (qse != null) {
                C67016QRw c67016QRw = LIZIZ;
                if (c67016QRw == null) {
                    LIZIZ = new C67016QRw(qse);
                } else {
                    c67016QRw.LIZ = qse;
                }
            } else {
                throw new IllegalArgumentException("Please use MainInterfaceForPush instance initialization");
            }
        }
    }
}
