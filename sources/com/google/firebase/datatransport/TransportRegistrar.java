package com.google.firebase.datatransport;

import X.C31461Li;
import X.C67220QZs;
import X.C67350Qby;
import X.QZ4;
import X.QZL;
import X.QZQ;
import X.QZT;
import X.QZU;
import X.QZW;
import X.QZX;
import android.content.Context;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class TransportRegistrar implements QZ4 {
    @Override // X.QZ4
    public List<QZT<?>> getComponents() {
        QZU LIZ = QZT.LIZ(QZL.class);
        LIZ.LIZ(QZW.LIZ(Context.class));
        LIZ.LJ = new C31461Li();
        return Arrays.asList(LIZ.LIZIZ(), QZX.LIZ("fire-transport", "18.1.5"));
    }

    public static /* synthetic */ QZL lambda$getComponents$0(QZQ qzq) {
        C67350Qby.LIZIZ((Context) qzq.LIZ(Context.class));
        return C67350Qby.LIZ().LIZJ(C67220QZs.LJFF);
    }
}
