package X;

/* loaded from: classes12.dex */
public final class QDB {
    public QDA LIZ;
    public QDA LIZIZ;

    public final synchronized QDA LIZIZ() {
        QDA qda;
        qda = this.LIZ;
        if (qda != null) {
            QDA qda2 = qda.LIZJ;
            this.LIZ = qda2;
            if (qda2 == null) {
                this.LIZIZ = null;
            }
        }
        return qda;
    }

    public final synchronized QDA LIZJ() {
        if (this.LIZ == null) {
            wait(1000);
        }
        return LIZIZ();
    }

    public final synchronized void LIZ(QDA qda) {
        QDA qda2 = this.LIZIZ;
        if (qda2 != null) {
            qda2.LIZJ = qda;
            this.LIZIZ = qda;
        } else if (this.LIZ == null) {
            this.LIZIZ = qda;
            this.LIZ = qda;
        } else {
            throw new IllegalStateException("Head present, but no tail");
        }
        notifyAll();
    }
}
