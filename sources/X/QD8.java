package X;

import org.greenrobot.eventbus.EventBus;

/* loaded from: classes12.dex */
public final class QD8 implements Runnable, QDI {
    public final QDB LJLIL = new QDB();
    public final EventBus LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            QDA LIZIZ = this.LJLIL.LIZIZ();
            if (LIZIZ != null) {
                this.LJLILLLLZI.LJ(LIZIZ);
                return;
            }
            throw new IllegalStateException("No pending post available");
        } finally {
            if (LIZ) {
            }
        }
    }

    public QD8(EventBus eventBus) {
        this.LJLILLLLZI = eventBus;
    }

    @Override // X.QDI
    public final void LIZ(Object obj, QDC qdc) {
        this.LJLIL.LIZ(QDA.LIZ(obj, qdc));
        this.LJLILLLLZI.LIZ.execute(this);
    }
}
