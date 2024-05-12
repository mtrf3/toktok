package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.WJn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82087WJn {
    public static C82088WJo LIZ(Context context) {
        o.LJIIIZ(context, "context");
        if (C82088WJo.LIZIZ == null) {
            synchronized (C65352Pkq.LIZ(C82088WJo.class)) {
                if (C82088WJo.LIZIZ == null) {
                    C82088WJo.LIZIZ = new C82088WJo(context);
                }
            }
        }
        C82088WJo c82088WJo = C82088WJo.LIZIZ;
        o.LJI(c82088WJo);
        return c82088WJo;
    }
}
