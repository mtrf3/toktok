package com.google.firebase.messaging;

import X.C67195QYt;
import X.QSK;
import X.QYK;
import X.QYQ;
import X.QYR;
import X.QYS;
import X.QZ4;
import X.QZL;
import X.QZQ;
import X.QZT;
import X.QZU;
import X.QZW;
import X.QZX;
import X.QZZ;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class FirebaseMessagingRegistrar implements QZ4 {
    @Override // X.QZ4
    public List<QZT<?>> getComponents() {
        QZT[] qztArr = new QZT[2];
        QZU LIZ = QZT.LIZ(FirebaseMessaging.class);
        LIZ.LIZ(QZW.LIZ(C67195QYt.class));
        LIZ.LIZ(new QZW(0, 0, QSK.class));
        LIZ.LIZ(new QZW(0, 1, QYS.class));
        LIZ.LIZ(new QZW(0, 1, QYR.class));
        LIZ.LIZ(new QZW(0, 0, QZL.class));
        LIZ.LIZ(QZW.LIZ(QYQ.class));
        LIZ.LIZ(QZW.LIZ(QYK.class));
        LIZ.LJ = new QZZ();
        if (LIZ.LIZJ == 0) {
            LIZ.LIZJ = 1;
            qztArr[0] = LIZ.LIZIZ();
            qztArr[1] = QZX.LIZ("fire-fcm", "23.0.7");
            return Arrays.asList(qztArr);
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(QZQ qzq) {
        return new FirebaseMessaging((C67195QYt) qzq.LIZ(C67195QYt.class), (QSK) qzq.LIZ(QSK.class), qzq.LJ(QYS.class), qzq.LJ(QYR.class), (QYQ) qzq.LIZ(QYQ.class), (QZL) qzq.LIZ(QZL.class), (QYK) qzq.LIZ(QYK.class));
    }
}
