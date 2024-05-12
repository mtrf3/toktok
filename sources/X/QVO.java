package X;

import android.content.Context;
import com.bytedance.common.wschannel.model.WsChannelMsg;

/* loaded from: classes12.dex */
public final class QVO implements QW4, InterfaceC67071QTz {
    public final Object LJLIL = new Object();
    public boolean LJLILLLLZI;
    public final InterfaceC67070QTy LJLJI;
    public final QW4 LJLJJI;

    @Override // X.QW4
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC67071QTz
    public final void LJJJLZIJ(boolean z) {
        if (z) {
            synchronized (this.LJLIL) {
                C66629QCz.LIZ("[SendMsg] notify ws connected");
                this.LJLIL.notifyAll();
            }
        }
    }

    @Override // X.QW4
    public final void LJJL(QW3 qw3) {
        if (qw3.LIZJ) {
            this.LJLJJI.LJJL(qw3);
            return;
        }
        C67101QVd c67101QVd = qw3.LIZ;
        if (c67101QVd == null) {
            C66629QCz.LIZIZ("[SendMsg] msg is null ,not send");
            return;
        }
        int intValue = QVW.LIZ(c67101QVd).intValue();
        WsChannelMsg LJIILLIIL = ((QUG) QPG.LIZ(QUG.class)).LJIILLIIL(qw3.LIZ);
        if (LJIILLIIL == null) {
            C66629QCz.LIZIZ("[SendMsg] convert msg error, not send");
            return;
        }
        if (this.LJLJI.LJFF()) {
            this.LJLILLLLZI = false;
            this.LJLJI.LIZIZ(LJIILLIIL);
            LIZLLL(qw3.LIZLLL, 1, intValue, true);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[SendMsg] send msg to ws ");
            LIZ.append(QVP.LIZLLL(qw3.LIZ));
            C66629QCz.LIZ(X1D.LIZIZ(LIZ));
            return;
        }
        try {
            synchronized (this.LJLIL) {
                if (!this.LJLILLLLZI || !qw3.LIZIZ) {
                    C66629QCz.LIZ("[SendMsg] ws not connect, sleep...");
                    long currentTimeMillis = System.currentTimeMillis();
                    this.LJLIL.wait(5000L);
                    if (System.currentTimeMillis() - currentTimeMillis >= 5000) {
                        this.LJLILLLLZI = true;
                    }
                } else {
                    C66629QCz.LIZ("[SendMsg] ws not connect, but waiting timeout, so not sleep");
                }
            }
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (this.LJLJI.LJFF()) {
            this.LJLJI.LIZIZ(LJIILLIIL);
            LIZLLL(qw3.LIZLLL, 1, intValue, true);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[SendMsg] send msg to ws again ");
            LIZ2.append(QVP.LIZLLL(qw3.LIZ));
            C66629QCz.LIZ(X1D.LIZIZ(LIZ2));
            return;
        }
        if (qw3.LIZIZ) {
            C66629QCz.LIZ("[SendMsg] ws not connect, fallback to http...");
            try {
                if (C2NU.LIZ.LIZIZ()) {
                    QW3 qw32 = new QW3();
                    qw32.LIZ = qw3.LIZ;
                    qw32.LIZIZ = false;
                    qw32.LIZLLL = qw3.LIZLLL;
                    this.LJLJJI.LJJL(qw32);
                    return;
                }
            } catch (Exception unused) {
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("[SendMsg] net not available,throw msg ");
            LIZ3.append(QVP.LIZLLL(qw3.LIZ));
            C66629QCz.LIZIZ(X1D.LIZIZ(LIZ3));
            LIZLLL(qw3.LIZLLL, 3, QVW.LIZ(qw3.LIZ).intValue(), false);
            return;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("[SendMsg] send payload failed with ws ");
        LIZ4.append(QVP.LIZLLL(qw3.LIZ));
        LIZ4.append(", throw it");
        C66629QCz.LIZIZ(X1D.LIZIZ(LIZ4));
        LIZLLL(qw3.LIZLLL, 2, intValue, false);
    }

    public QVO(Context context, C67040QSu c67040QSu, QW2 qw2) {
        this.LJLJI = c67040QSu.LIZJ;
        this.LJLJJI = qw2;
        ((InterfaceC67063QTr) QPG.LIZ(InterfaceC67063QTr.class)).LJJIJIIJI(this);
    }

    public static void LIZLLL(QW1 qw1, int i, int i2, boolean z) {
        if (qw1 != null) {
            qw1.LIZ = 1;
            qw1.LIZIZ = i;
            qw1.LIZJ = i2;
            qw1.LIZLLL = z ? 1 : 0;
            qw1.LIZ();
        }
    }
}
