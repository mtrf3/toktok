package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes12.dex */
public final class QVN implements QW4 {
    public final C67040QSu LJLIL;
    public final QW8 LJLILLLLZI;
    public final QW4 LJLJI;

    @Override // X.QW4
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.QW4
    public final void LJJL(QW3 qw3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[SendMsg] send msg with https : ");
        LIZ.append(QVP.LIZLLL(qw3.LIZ));
        LIZ.append(", can fallback: ");
        LIZ.append(qw3.LIZIZ);
        C66629QCz.LIZ(X1D.LIZIZ(LIZ));
        if (qw3.LIZ != null) {
            Uri.Builder appendQueryParameter = UriProtector.parse(this.LJLIL.LJI).buildUpon().appendPath("v2/pipeline").appendQueryParameter("device_id", ((InterfaceC67059QTn) QPG.LIZ(InterfaceC67059QTn.class)).LIZJ().LIZ).appendQueryParameter("platform", CardStruct.IStatusCode.DEFAULT);
            if (appendQueryParameter != null) {
                appendQueryParameter.appendQueryParameter("aid", this.LJLIL.LIZ);
                int intValue = QVW.LIZ(qw3.LIZ).intValue();
                C67101QVd LJJLIIIJL = ((QVM) QPG.LIZ(QVM.class)).LJJLIIIJL(qw3.LIZ);
                if (LJJLIIIJL != null) {
                    LIZLLL(qw3.LIZLLL, 1, intValue);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("[SendMsg] send payload success with https ");
                    LIZ2.append(QVP.LIZLLL(qw3.LIZ));
                    C66629QCz.LIZ(X1D.LIZIZ(LIZ2));
                    this.LJLILLLLZI.LIZ(LJJLIIIJL);
                    return;
                }
                if (qw3.LIZIZ) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("[SendMsg] send payload failed with https ");
                    LIZ3.append(QVP.LIZLLL(qw3.LIZ));
                    LIZ3.append(",do fallback");
                    C66629QCz.LIZ(X1D.LIZIZ(LIZ3));
                    qw3.LIZIZ = false;
                    QW4 qw4 = this.LJLJI;
                    if (qw4 != null) {
                        qw4.LJJL(qw3);
                        return;
                    } else {
                        LIZLLL(qw3.LIZLLL, 2, intValue);
                        return;
                    }
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("[SendMsg] send payload failed with https ");
                LIZ4.append(QVP.LIZLLL(qw3.LIZ));
                LIZ4.append(", throw it");
                C66629QCz.LIZIZ(X1D.LIZIZ(LIZ4));
                LIZLLL(qw3.LIZLLL, 2, intValue);
                return;
            }
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("[SendMsg] mismatch url with payload:");
        LIZ5.append(QVP.LIZLLL(qw3.LIZ));
        C66629QCz.LIZIZ(X1D.LIZIZ(LIZ5));
    }

    public QVN(C67040QSu c67040QSu, QW8 qw8, C67122QVy c67122QVy) {
        this.LJLIL = c67040QSu;
        this.LJLILLLLZI = qw8;
        this.LJLJI = c67122QVy;
    }

    public final void LIZLLL(QW1 qw1, int i, int i2) {
        if (qw1 != null) {
            qw1.LIZ = 2;
            qw1.LIZIZ = i;
            qw1.LIZJ = i2;
            qw1.LIZLLL = this.LJLIL.LIZJ.LJFF() ? 1 : 0;
            qw1.LIZ();
        }
    }
}
