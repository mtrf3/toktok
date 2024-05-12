package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Uro, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78524Uro {
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Object] */
    public static final InterfaceC32666Cru LIZ(Context context) {
        o.LJIIJ(context, "context");
        C78526Urq c78526Urq = C78517Urh.LIZJ;
        Context LLLLL = C16880lQ.LLLLL(context);
        o.LJFF(LLLLL, "context.applicationContext");
        Object obj = c78526Urq.LIZIZ;
        if (obj == null) {
            synchronized (c78526Urq) {
                Object obj2 = c78526Urq.LIZIZ;
                if (obj2 != null) {
                    obj = obj2;
                } else {
                    InterfaceC88472Yns<? super A, ? extends T> interfaceC88472Yns = c78526Urq.LIZ;
                    if (interfaceC88472Yns != 0) {
                        ?? invoke = interfaceC88472Yns.invoke(LLLLL);
                        c78526Urq.LIZIZ = invoke;
                        c78526Urq.LIZ = null;
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
