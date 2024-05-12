package X;

import com.bytedance.common.utility.Logger;

/* loaded from: classes12.dex */
public class QFD implements Runnable {
    public final QF9 LJLIL;
    public final /* synthetic */ QFG LJLILLLLZI;

    public final void LIZ() {
        try {
            System.currentTimeMillis();
            this.LJLIL.run();
            Logger.debug();
        } catch (Throwable unused) {
        }
        QF9 qf9 = this.LJLIL;
        qf9.getClass();
        this.LJLILLLLZI.LIZIZ.remove(qf9);
        this.LJLILLLLZI.LIZJ.remove(this.LJLIL);
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

    public QFD(QFG qfg, QF8 qf8) {
        this.LJLILLLLZI = qfg;
        this.LJLIL = qf8;
    }
}
