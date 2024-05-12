package X;

import Y.ARunnableS30S0200000_11;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class QEX implements QF3 {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ QEW LIZIZ;

    @Override // X.QF3
    public final void run() {
        this.LIZIZ.LJLJJL.flip();
        QEW qew = this.LIZIZ;
        long j = qew.LJLJJLL;
        if (j != -1 && j - qew.LJLJL < qew.LJLJJL.remaining()) {
            QEW qew2 = this.LIZIZ;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C16880lQ.LLLZI(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.LIZIZ.LJLJL + r0.LJLJJL.remaining()), Long.valueOf(this.LIZIZ.LJLJJLL)}));
            QET qet = ((QEZ) qew2).LJLLILLLL;
            qet.getClass();
            qet.LJIJJ(new C66674QEs("Exception received from UploadDataProvider", illegalArgumentException));
            return;
        }
        QEW qew3 = this.LIZIZ;
        ByteBuffer byteBuffer = qew3.LJLJJL;
        QEZ qez = (QEZ) qew3;
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            i += qez.LJLL.write(byteBuffer);
        }
        qez.LJLLI.flush();
        qew3.LJLJL += i;
        QEW qew4 = this.LIZIZ;
        long j2 = qew4.LJLJL;
        long j3 = qew4.LJLJJLL;
        if (j2 >= j3) {
            if (j3 == -1) {
                if (this.LIZ) {
                    QEZ qez2 = (QEZ) qew4;
                    if (qez2.LJLL != null && qez2.LJLJLLL.compareAndSet(false, true)) {
                        qez2.LJLL.close();
                    }
                    QET qet2 = qez2.LJLLILLLL;
                    qet2.getClass();
                    new ARunnableS30S0200000_11(qet2, new QES(qet2), 25);
                    throw null;
                }
            } else {
                if (j3 == j2) {
                    QEZ qez3 = (QEZ) qew4;
                    if (qez3.LJLL != null && qez3.LJLJLLL.compareAndSet(false, true)) {
                        qez3.LJLL.close();
                    }
                    QET qet3 = qez3.LJLLILLLL;
                    qet3.getClass();
                    new ARunnableS30S0200000_11(qet3, new QES(qet3), 25);
                    throw null;
                }
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(C16880lQ.LLLZI(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.LIZIZ.LJLJL), Long.valueOf(this.LIZIZ.LJLJJLL)}));
                QET qet4 = ((QEZ) qew4).LJLLILLLL;
                qet4.getClass();
                qet4.LJIJJ(new C66674QEs("Exception received from UploadDataProvider", illegalArgumentException2));
                return;
            }
        }
        qew4.LJLJJL.clear();
        this.LIZIZ.LJLIL.set(0);
        this.LIZIZ.LLLLZ(new C66660QEe(this));
    }

    public QEX(QEW qew, boolean z) {
        this.LIZIZ = qew;
        this.LIZ = z;
    }
}
