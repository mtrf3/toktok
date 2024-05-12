package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.a1X, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91867a1X {
    public static final InterfaceC91961a33 LIZ(C92204a6y c92204a6y, String str) {
        InterfaceC91961a33 interfaceC91961a33;
        o.LJIIIZ(c92204a6y, "<this>");
        Iterator<InterfaceC91961a33> it = c92204a6y.LJLJJL.iterator();
        while (true) {
            if (it.hasNext()) {
                interfaceC91961a33 = it.next();
                InterfaceC91961a33 interfaceC91961a332 = interfaceC91961a33;
                if (interfaceC91961a332 instanceof C92231a7P) {
                    C92231a7P c92231a7P = (C92231a7P) interfaceC91961a332;
                    if (o.LJ(c92231a7P.LJLIL.getPaymentMethodType(), str) || o.LJ(c92231a7P.LJLIL.getPaymentMethodId(), str)) {
                        break;
                    }
                }
            } else {
                interfaceC91961a33 = null;
                break;
            }
        }
        return interfaceC91961a33;
    }
}
