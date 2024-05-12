package com.ttnet.org.chromium.base.memory;

import X.C25620zW;
import X.C78939UyV;
import X.X1D;
import android.os.Debug;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class JavaHeapDumpGenerator {
    public static boolean generateHprof(String str) {
        try {
            Debug.dumpHprofData(str);
            return true;
        } catch (IOException e) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("Error writing to file ", str, ". Error: ");
            LIZIZ.append(e.getMessage());
            String LIZIZ2 = X1D.LIZIZ(LIZIZ);
            Object[] objArr = new Object[0];
            C78939UyV.LJIILIIL(LIZIZ2, C78939UyV.LJJII(objArr), objArr);
            return false;
        }
    }
}
