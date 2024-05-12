package X;

import java.util.logging.Level;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes12.dex */
public final class QD6 implements Runnable, QDI {
    public final QDB LJLIL = new QDB();
    public final EventBus LJLILLLLZI;
    public volatile boolean LJLJI;

    public final void LIZIZ() {
        while (true) {
            try {
                QDA LIZJ = this.LJLIL.LIZJ();
                if (LIZJ == null) {
                    synchronized (this) {
                        LIZJ = this.LJLIL.LIZIZ();
                        if (LIZJ == null) {
                            return;
                        }
                    }
                }
                this.LJLILLLLZI.LJ(LIZJ);
            } catch (InterruptedException e) {
                P9G p9g = this.LJLILLLLZI.LIZIZ;
                Level level = Level.WARNING;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C16880lQ.LLLLIIIILLL().getName());
                LIZ.append(" was interruppted");
                p9g.LIZ(level, X1D.LIZIZ(LIZ), e);
                return;
            } finally {
                this.LJLJI = false;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public QD6(EventBus eventBus) {
        this.LJLILLLLZI = eventBus;
    }

    @Override // X.QDI
    public final void LIZ(Object obj, QDC qdc) {
        QDA LIZ = QDA.LIZ(obj, qdc);
        synchronized (this) {
            this.LJLIL.LIZ(LIZ);
            if (!this.LJLJI) {
                this.LJLJI = true;
                this.LJLILLLLZI.LIZ.execute(this);
            }
        }
    }
}
