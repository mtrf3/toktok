package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.QLz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66863QLz {
    public static C66862QLy LIZ(Context context) {
        o.LJIIIZ(context, "context");
        if (C66862QLy.LIZJ == null) {
            synchronized (C66862QLy.class) {
                if (C66862QLy.LIZJ == null) {
                    Context LLLLL = C16880lQ.LLLLL(context);
                    o.LJIIIIZZ(LLLLL, "context.applicationContext");
                    C66862QLy.LIZJ = new C66862QLy(LLLLL);
                }
            }
        }
        C66862QLy c66862QLy = C66862QLy.LIZJ;
        o.LJI(c66862QLy);
        return c66862QLy;
    }
}
