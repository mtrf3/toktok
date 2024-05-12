package X;

import android.os.Bundle;

/* loaded from: classes12.dex */
public final class QQR implements Runnable {
    public final /* synthetic */ Bundle LJLIL;
    public final /* synthetic */ QQS LJLILLLLZI;

    public final void LIZ() {
        QQS qqs;
        C60016Ngy LJIL;
        if (this.LJLIL == null || (qqs = this.LJLILLLLZI) == null || (LJIL = qqs.LJIL()) == null) {
            return;
        }
        if (this.LJLIL.getBoolean("app_entrance")) {
            QQP LIZJ = QQP.LIZJ(LJIL);
            if (!LIZJ.LJLJJL) {
                return;
            }
            LIZJ.LJLJJI.sendEmptyMessage(1);
            return;
        }
        if (!this.LJLIL.getBoolean("app_exit")) {
            return;
        }
        QQP LIZJ2 = QQP.LIZJ(LJIL);
        if (!LIZJ2.LJLJJL) {
            return;
        }
        LIZJ2.LJLJJI.sendEmptyMessage(2);
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

    public QQR(Bundle bundle, QQS qqs) {
        this.LJLIL = bundle;
        this.LJLILLLLZI = qqs;
    }
}
