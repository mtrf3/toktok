package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes12.dex */
public final class QD7 extends Handler implements QDI {
    public final QDB LJLIL;
    public final int LJLILLLLZI;
    public final EventBus LJLJI;
    public boolean LJLJJI;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                QDA LIZIZ = this.LJLIL.LIZIZ();
                if (LIZIZ == null) {
                    synchronized (this) {
                        LIZIZ = this.LJLIL.LIZIZ();
                        if (LIZIZ == null) {
                            return;
                        }
                    }
                }
                this.LJLJI.LJ(LIZIZ);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.LJLILLLLZI);
            if (sendMessage(obtainMessage())) {
                this.LJLJJI = true;
                return;
            }
            throw new QDE("Could not send handler message");
        } finally {
            this.LJLJJI = false;
        }
    }

    public QD7(EventBus eventBus, Looper looper) {
        super(looper);
        this.LJLJI = eventBus;
        this.LJLILLLLZI = 10;
        this.LJLIL = new QDB();
    }

    @Override // X.QDI
    public final void LIZ(Object obj, QDC qdc) {
        QDA LIZ = QDA.LIZ(obj, qdc);
        synchronized (this) {
            this.LJLIL.LIZ(LIZ);
            if (!this.LJLJJI) {
                this.LJLJJI = true;
                if (!sendMessage(obtainMessage())) {
                    throw new QDE("Could not send handler message");
                }
            }
        }
    }
}
