package ms.bd.o;

import X.C16880lQ;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class y0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        ApplicationInfo LLLLLLLLL = C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 0);
        String str2 = LLLLLLLLL.sourceDir;
        if (str2 != null) {
            return str2;
        }
        return LLLLLLLLL.publicSourceDir;
    }
}
