package X;

import android.database.ContentObserver;
import android.os.Handler;
import com.bytedance.common.utility.Logger;

/* loaded from: classes12.dex */
public final class QMO extends ContentObserver {
    public final /* synthetic */ QMN LIZ;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        QMM qmm;
        Logger.debug();
        QMN qmn = this.LIZ;
        qmn.getClass();
        try {
            boolean z2 = qmn.LIZLLL;
            try {
                boolean LIZJ = C66455Q6h.LIZIZ(qmn.LIZIZ).LIZJ();
                Logger.debug();
                if (LIZJ != qmn.LIZLLL) {
                    qmn.LIZLLL = LIZJ;
                }
            } catch (Throwable unused) {
            }
            boolean z3 = qmn.LIZLLL;
            if (z2 != z3 && (qmm = qmn.LIZJ) != null) {
                ((QMH) qmm).LJ(z3);
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QMO(QMN qmn, Handler handler) {
        super(handler);
        this.LIZ = qmn;
    }
}
