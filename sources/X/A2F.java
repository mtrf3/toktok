package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A2F {
    public static A2H LIZ(List data) {
        o.LJIIIZ(data, "data");
        return new A2H(data);
    }

    public static A2H LIZIZ(A2F a2f) {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        a2f.getClass();
        return LIZ(c61878OQg);
    }

    public static A2I LIZJ(Exception exception) {
        o.LJIIIZ(exception, "exception");
        return new A2I(exception);
    }

    public static A2V LIZLLL(Object obj, Object obj2, List data) {
        o.LJIIIZ(data, "data");
        return new A2V(obj, obj2, data);
    }

    public static A2V LJ(A2F a2f, Object obj, Object obj2, List list, int i) {
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        if ((i & 4) != 0) {
            list = C61878OQg.INSTANCE;
        }
        a2f.getClass();
        return LIZLLL(obj, obj2, list);
    }
}
