package com.google.firebase.installations;

import X.C66716QGi;
import X.C67195QYt;
import X.C67211QZj;
import X.C78688UuS;
import X.InterfaceC67212QZk;
import X.QGY;
import X.QYQ;
import X.QZ4;
import X.QZQ;
import X.QZT;
import X.QZU;
import X.QZW;
import X.QZX;
import X.QZY;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class FirebaseInstallationsRegistrar implements QZ4 {
    @Override // X.QZ4
    public List<QZT<?>> getComponents() {
        QZU LIZ = QZT.LIZ(QYQ.class);
        LIZ.LIZ(QZW.LIZ(C67195QYt.class));
        LIZ.LIZ(new QZW(0, 1, QGY.class));
        LIZ.LJ = new QZY();
        C78688UuS c78688UuS = new C78688UuS();
        QZU LIZ2 = QZT.LIZ(InterfaceC67212QZk.class);
        LIZ2.LIZLLL = 1;
        LIZ2.LJ = new C67211QZj(c78688UuS);
        return Arrays.asList(LIZ.LIZIZ(), LIZ2.LIZIZ(), QZX.LIZ("fire-installations", "17.0.1"));
    }

    public static /* synthetic */ QYQ lambda$getComponents$0(QZQ qzq) {
        return new C66716QGi((C67195QYt) qzq.LIZ(C67195QYt.class), qzq.LJ(QGY.class));
    }
}
