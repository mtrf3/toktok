package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.SXs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72264SXs {
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Object] */
    public static final InterfaceC32666Cru LIZ(Context context) {
        o.LJIIJ(context, "context");
        C72266SXu c72266SXu = C78516Urg.LIZIZ;
        Context LLLLL = C16880lQ.LLLLL(context);
        o.LJFF(LLLLL, "context.applicationContext");
        Object obj = c72266SXu.LIZIZ;
        if (obj == null) {
            synchronized (c72266SXu) {
                Object obj2 = c72266SXu.LIZIZ;
                if (obj2 != null) {
                    obj = obj2;
                } else {
                    InterfaceC88472Yns<? super A, ? extends T> interfaceC88472Yns = c72266SXu.LIZ;
                    if (interfaceC88472Yns != 0) {
                        ?? invoke = interfaceC88472Yns.invoke(LLLLL);
                        c72266SXu.LIZIZ = invoke;
                        c72266SXu.LIZ = null;
                        obj = invoke;
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
            }
        }
        return (InterfaceC32666Cru) obj;
    }
}
