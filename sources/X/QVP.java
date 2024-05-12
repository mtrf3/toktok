package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class QVP implements QW4 {
    public final AtomicBoolean LJLIL = new AtomicBoolean(false);
    public final LinkedBlockingQueue<QW3> LJLILLLLZI = new LinkedBlockingQueue<>();
    public final QVN LJLJI;
    public final QVO LJLJJI;
    public final Context LJLJJL;

    @Override // X.QW4
    public final boolean LIZIZ() {
        synchronized (QVP.class) {
            Iterator it = new ArrayList(this.LJLILLLLZI).iterator();
            while (it.hasNext()) {
                C67101QVd c67101QVd = ((QW3) it.next()).LIZ;
                if (c67101QVd != null) {
                    Iterator<QVZ> it2 = c67101QVd.topics.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().flag == QVX.Data) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public static String LIZLLL(C67101QVd c67101QVd) {
        if (c67101QVd == null) {
            return null;
        }
        return c67101QVd.toString();
    }

    @Override // X.QW4
    public final void LJJL(QW3 qw3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[SendMsg] offer msg to dequeue : ");
        LIZ.append(LIZLLL(qw3.LIZ));
        LIZ.append(", can fallback: ");
        LIZ.append(qw3.LIZIZ);
        C66629QCz.LIZ(X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.offer(qw3);
        synchronized (this) {
            if (this.LJLIL.compareAndSet(false, true)) {
                ((ExecutorService) QW6.LIZ.LIZLLL(new Object[0])).submit(new QVQ(this));
            }
        }
    }

    public QVP(Context context, C67040QSu c67040QSu, QVC qvc) {
        this.LJLJJL = context;
        this.LJLJJI = new QVO(context, c67040QSu, new QW2(this));
        this.LJLJI = new QVN(c67040QSu, qvc, new C67122QVy(this));
    }
}
