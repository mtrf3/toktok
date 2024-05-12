package com.lynx.fresco;

import X.AbstractC80967Vq7;
import X.C06460Ne;
import X.C67155QXf;
import X.C81392Vwy;
import X.W8E;
import X.X1D;
import a04.IDfS1S0100000_14;
import android.graphics.Bitmap;
import android.util.Log;
import com.lynx.tasm.base.LLog;

/* loaded from: classes15.dex */
public class FrescoBitmapPool extends AbstractC80967Vq7 {
    @Override // X.AbstractC80967Vq7
    public C67155QXf<Bitmap> require(int i, int i2, Bitmap.Config config) {
        try {
            C81392Vwy<Bitmap> LJ = W8E.LJII().LJIIJ().LJ(i, i2, config);
            Bitmap LJI = LJ.LJI();
            if (LJI == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("maybe oom ");
                LIZ.append(Log.getStackTraceString(new OutOfMemoryError()));
                LLog.LIZLLL(3, "Image", X1D.LIZIZ(LIZ));
                return null;
            }
            return new C67155QXf<>(LJI, new IDfS1S0100000_14(LJ, 0));
        } catch (Throwable th) {
            StringBuilder LIZJ = C06460Ne.LIZJ("maybe oom: ", i, "x", i2, ", ");
            LIZJ.append(Log.getStackTraceString(new RuntimeException(th)));
            LLog.LIZLLL(3, "Image", X1D.LIZIZ(LIZJ));
            return null;
        }
    }
}
