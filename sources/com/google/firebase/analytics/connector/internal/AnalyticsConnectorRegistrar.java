package com.google.firebase.analytics.connector.internal;

import X.C16880lQ;
import X.C62819Ol5;
import X.C67195QYt;
import X.C67218QZq;
import X.C68074Qne;
import X.InterfaceC67182QYg;
import X.InterfaceC67188QYm;
import X.InterfaceC67209QZh;
import X.QH7;
import X.QYK;
import X.QZ4;
import X.QZQ;
import X.QZT;
import X.QZU;
import X.QZW;
import X.QZX;
import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public class AnalyticsConnectorRegistrar implements QZ4 {
    @Override // X.QZ4
    public List<QZT<?>> getComponents() {
        QZT[] qztArr = new QZT[2];
        QZU LIZ = QZT.LIZ(InterfaceC67188QYm.class);
        LIZ.LIZ(QZW.LIZ(C67195QYt.class));
        LIZ.LIZ(QZW.LIZ(Context.class));
        LIZ.LIZ(QZW.LIZ(QYK.class));
        LIZ.LJ = new InterfaceC67209QZh() { // from class: X.QZe
            @Override // X.InterfaceC67209QZh
            public final Object LIZ(QZO qzo) {
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(qzo);
            }
        };
        if (LIZ.LIZJ == 0) {
            LIZ.LIZJ = 2;
            qztArr[0] = LIZ.LIZIZ();
            qztArr[1] = QZX.LIZ("fire-analytics", "21.0.0");
            return Arrays.asList(qztArr);
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }

    public static InterfaceC67188QYm lambda$getComponents$0(QZQ qzq) {
        C67195QYt c67195QYt = (C67195QYt) qzq.LIZ(C67195QYt.class);
        Context context = (Context) qzq.LIZ(Context.class);
        QYK qyk = (QYK) qzq.LIZ(QYK.class);
        QH7.LJIIIIZZ(c67195QYt);
        QH7.LJIIIIZZ(context);
        QH7.LJIIIIZZ(qyk);
        QH7.LJIIIIZZ(C16880lQ.LLLLL(context));
        if (C67218QZq.LIZIZ == null) {
            synchronized (C67218QZq.class) {
                if (C67218QZq.LIZIZ == null) {
                    Bundle bundle = new Bundle(1);
                    c67195QYt.LIZ();
                    if ("[DEFAULT]".equals(c67195QYt.LIZIZ)) {
                        qyk.LIZIZ(C62819Ol5.class, new Executor() { // from class: X.QZg
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new InterfaceC67182QYg() { // from class: X.QZE
                            @Override // X.InterfaceC67182QYg
                            public final void LIZ(C2311095e c2311095e) {
                                c2311095e.getClass();
                                throw null;
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", c67195QYt.LJI());
                    }
                    C67218QZq.LIZIZ = new C67218QZq(C68074Qne.LIZJ(context, bundle).LIZLLL);
                }
            }
        }
        return C67218QZq.LIZIZ;
    }
}
