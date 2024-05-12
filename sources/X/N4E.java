package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N4E implements InterfaceC58549MyP {
    public static final N4E LIZ = new N4E();

    @Override // X.InterfaceC58549MyP
    public final java.util.Map LIZ(M95 m95, String str, java.util.Map map) {
        o.LJIIIZ(str, "<anonymous parameter 2>");
        N4D.LIZ.getClass();
        Object obj = ((LinkedHashMap) map).get(N4D.LJIILJJIL.LIZ);
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) obj).intValue() < 0) {
            return null;
        }
        return map;
    }
}
