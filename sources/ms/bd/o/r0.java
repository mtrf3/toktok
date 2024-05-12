package ms.bd.o;

import X.C16880lQ;
import android.content.Context;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class r0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        if (n2.LIZ <= 0) {
            try {
                n2.LIZ = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).versionCode;
            } catch (Throwable unused) {
            }
        }
        return Integer.toString(n2.LIZ);
    }
}
