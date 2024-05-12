package ms.bd.o;

import X.X1D;
import android.content.Context;
import android.util.DisplayMetrics;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class u1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        if (context != null) {
            try {
                new DisplayMetrics();
                r2.LIZ = context.getResources().getDisplayMetrics().densityDpi;
            } catch (Throwable unused) {
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(r2.LIZ);
        return X1D.LIZIZ(LIZ);
    }
}
