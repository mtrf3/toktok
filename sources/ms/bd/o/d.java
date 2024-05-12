package ms.bd.o;

import android.content.Context;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class d extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        if (context != null) {
            return context.getPackageName();
        }
        return "";
    }
}
