package X;

import android.content.Context;

/* loaded from: classes12.dex */
public class QTY implements QQL {
    @Override // X.QQL
    public final void LIZ(QQI qqi) {
        C66960QPs.LIZ();
        Context LIZ = QWR.LIZ();
        if (qqi instanceof R6R) {
            QTX qtx = ((R6R) qqi).LJIIIZ;
            if (qtx != null) {
                ((QTW) QTW.LIZIZ(LIZ)).LJFF(qtx, true);
                return;
            }
            return;
        }
        if (qqi instanceof R40) {
            T t = ((R40) qqi).LJIIIZ;
            if (!(t instanceof InterfaceC67052QTg)) {
                return;
            }
            ((QTW) QTW.LIZIZ(LIZ)).LJFF(((InterfaceC67052QTg) t).LIZ(), true);
            return;
        }
        if (!(qqi instanceof C67050QTe)) {
            return;
        }
        qqi.getClass();
    }
}
