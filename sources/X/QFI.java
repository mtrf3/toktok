package X;

/* loaded from: classes12.dex */
public final class QFI {
    public final int LIZ;
    public final QFH LIZIZ = QFH.Low;
    public final QFQ LIZJ;

    public QFI(int i, QFN qfn) {
        if (i > 0) {
            this.LIZ = i;
            this.LIZJ = qfn;
            return;
        }
        throw new IllegalArgumentException("Service identity must be set greater than 0.");
    }
}
