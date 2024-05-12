package X;

import Y.ARunnableS47S0100000_11;
import android.text.TextUtils;
import com.ss.android.ug.bus.UgCallbackCenter;

/* loaded from: classes12.dex */
public final class QTK implements QTJ, InterfaceC65888PtU {
    public static volatile QTK LJLJJI;
    public boolean LJLIL;
    public String LJLILLLLZI = "";
    public volatile boolean LJLJI;

    public final void LJJLIIJ() {
        this.LJLJI = true;
        C66960QPs.LIZ();
        ((QTW) QTW.LIZIZ(QWR.LIZ())).LIZ(this);
        C66960QPs.LIZ();
        String str = ((QTW) QTW.LIZIZ(QWR.LIZ())).LLFZ;
        this.LJLILLLLZI = str;
        this.LJLIL = true ^ TextUtils.isEmpty(str);
    }

    public static QTK LJJJLZIJ() {
        if (LJLJJI == null) {
            synchronized (QTK.class) {
                if (LJLJJI == null) {
                    LJLJJI = new QTK();
                }
            }
        }
        return LJLJJI;
    }

    @Override // X.QTJ
    public final String getSecUid() {
        if (!this.LJLJI) {
            LJJLIIJ();
        }
        C66960QPs.LIZ();
        return ((QTW) QTW.LIZIZ(QWR.LIZ())).LLFZ;
    }

    @Override // X.InterfaceC65888PtU
    public final void LIZLLL(C65886PtS c65886PtS) {
        if (!this.LJLJI) {
            LJJLIIJ();
        }
        int i = c65886PtS.LIZ;
        if (i == 1 || i == 2) {
            this.LJLIL = false;
            this.LJLILLLLZI = "";
            UgCallbackCenter.LIZ(new QTT());
        } else {
            if (!this.LJLIL) {
                String secUid = getSecUid();
                if (this.LJLIL) {
                    return;
                }
                UgCallbackCenter.LIZ(new QSF(secUid));
                this.LJLILLLLZI = secUid;
                this.LJLIL = true;
                return;
            }
            String secUid2 = getSecUid();
            if (this.LJLILLLLZI.equals(secUid2)) {
                return;
            }
            this.LJLILLLLZI = secUid2;
            UgCallbackCenter.LIZ(new QSG(secUid2));
        }
    }

    @Override // X.QTJ
    public final void LJJ(QTI qti) {
        if (!this.LJLJI) {
            LJJLIIJ();
        }
        QTP.LIZ.execute(new ARunnableS47S0100000_11(new QTM(new QTL(qti)), 113));
    }
}
