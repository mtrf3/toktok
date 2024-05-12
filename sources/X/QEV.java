package X;

import Y.ARunnableS30S0200000_11;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public final class QEV implements QF3 {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ QEW LIZIZ;

    @Override // X.QF3
    public final void run() {
        QEW qew = this.LIZIZ;
        qew.LJLJJLL = qew.LJLJJI.LIZ();
        QEW qew2 = this.LIZIZ;
        long j = qew2.LJLJJLL;
        if (j == 0) {
            QEZ qez = (QEZ) qew2;
            if (qez.LJLL != null && qez.LJLJLLL.compareAndSet(false, true)) {
                qez.LJLL.close();
            }
            QET qet = qez.LJLLILLLL;
            qet.getClass();
            new ARunnableS30S0200000_11(qet, new QES(qet), 25);
            throw null;
        }
        if (j > 0 && j < 8192) {
            qew2.LJLJJL = ByteBuffer.allocateDirect(((int) j) + 1);
        } else {
            qew2.LJLJJL = ByteBuffer.allocateDirect(FileUtils.BUFFER_SIZE);
        }
        QEW qew3 = this.LIZIZ;
        long j2 = qew3.LJLJJLL;
        QEZ qez2 = (QEZ) qew3;
        if (j2 > 0) {
            qez2.LJLJLJ.setFixedLengthStreamingMode(j2);
        } else {
            qez2.LJLJLJ.setChunkedStreamingMode(FileUtils.BUFFER_SIZE);
        }
        if (this.LIZ) {
            QEW qew4 = this.LIZIZ;
            Executor executor = qew4.LJLJI;
            QEY qey = new QEY(qew4);
            QET qet2 = ((QEZ) qew4).LJLLILLLL;
            qet2.getClass();
            executor.execute(new ARunnableS30S0200000_11(qet2, qey, 25));
            return;
        }
        this.LIZIZ.LJLIL.set(1);
        QEW qew5 = this.LIZIZ;
        qew5.LJLJJI.LIZJ(qew5);
    }

    public QEV(QEZ qez, boolean z) {
        this.LIZIZ = qez;
        this.LIZ = z;
    }
}
