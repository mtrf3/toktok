package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.H5w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43512H5w {
    public final java.util.Map<Object, C43515H5z> LIZ = new LinkedHashMap();
    public final H60 LIZIZ;

    public C43512H5w(H60 h60) {
        this.LIZIZ = h60;
    }

    public final C43515H5z LIZ(Object tag) {
        Object obj;
        o.LJIIIZ(tag, "tag");
        if (!this.LIZ.containsKey(tag)) {
            return null;
        }
        Object obj2 = ((LinkedHashMap) this.LIZ).get(tag);
        o.LJI(obj2);
        C43515H5z c43515H5z = (C43515H5z) obj2;
        if (c43515H5z.LIZ) {
            H60 h60 = this.LIZIZ;
            h60.getClass();
            Integer LIZ = h60.LIZ(tag);
            if (LIZ != null) {
                int intValue = LIZ.intValue() + 1;
                C42982Gtu c42982Gtu = (C42982Gtu) ORZ.LJLLLLLL(intValue, h60.LIZ);
                if (c42982Gtu != null && (obj = c42982Gtu.LJLIL) != null) {
                    C43515H5z c43515H5z2 = new C43515H5z(0.0f, intValue, obj);
                    C43515H5z LIZ2 = LIZ(c43515H5z2.LIZIZ);
                    if (LIZ2 != null) {
                        return LIZ2;
                    }
                    return c43515H5z2;
                }
                return c43515H5z;
            }
            return c43515H5z;
        }
        return c43515H5z;
    }
}
