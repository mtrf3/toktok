package X;

import com.bytedance.sync.settings.SettingsV2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public class QVQ implements Runnable {
    public final /* synthetic */ QVP LJLIL;

    public final void LIZ() {
        boolean z;
        SettingsV2 LIZIZ = QUW.LIZJ(this.LJLIL.LJLJJL).LIZIZ();
        C66629QCz.LIZJ("[SendMsg] start send msg to server....");
        while (true) {
            QW3 poll = this.LJLIL.LJLILLLLZI.poll();
            if (poll == null) {
                break;
            }
            if (!poll.LIZJ && poll.LIZLLL == null) {
                poll.LIZLLL = new QVT();
            }
            if (!LIZIZ.LIZIZ() || poll.LIZJ) {
                this.LJLIL.LJLJI.LJJL(poll);
            } else {
                this.LJLIL.LJLJJI.LJJL(poll);
            }
        }
        synchronized (this.LJLIL) {
            boolean isEmpty = this.LJLIL.LJLILLLLZI.isEmpty();
            AtomicBoolean atomicBoolean = this.LJLIL.LJLIL;
            if (!isEmpty) {
                z = true;
            } else {
                z = false;
            }
            atomicBoolean.set(z);
            if (!isEmpty) {
                ((ExecutorService) QW6.LIZ.LIZLLL(new Object[0])).submit(new QVQ(this.LJLIL));
            }
        }
        C66629QCz.LIZJ("[SendMsg] send msg to server finish");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public QVQ(QVP qvp) {
        this.LJLIL = qvp;
    }
}
