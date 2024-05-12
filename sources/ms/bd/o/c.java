package ms.bd.o;

import X.C16880lQ;
import android.content.Context;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class c extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        try {
            if (n2.LIZIZ == "") {
                n2.LIZIZ = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).versionName;
            }
        } catch (Throwable unused) {
        }
        return n2.LIZIZ;
    }
}
