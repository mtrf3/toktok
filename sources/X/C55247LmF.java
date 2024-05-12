package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS63S1200000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.LmF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55247LmF {
    public static final void LIZJ(InterfaceC55235Lm3 interfaceC55235Lm3) {
        o.LJIIIZ(interfaceC55235Lm3, "<this>");
        interfaceC55235Lm3.getTree().LIZLLL();
    }

    public static void LIZ(InterfaceC55235Lm3 interfaceC55235Lm3, InterfaceC55235Lm3 vScope) {
        C55232Lm0 c55232Lm0 = new C55232Lm0(null, 3);
        o.LJIIIZ(interfaceC55235Lm3, "<this>");
        o.LJIIIZ(vScope, "vScope");
        interfaceC55235Lm3.getTree().LIZ(vScope, c55232Lm0);
    }

    public static final InterfaceC55251LmJ LIZLLL(InterfaceC55235Lm3 interfaceC55235Lm3, Class clz, String str) {
        o.LJIIIZ(interfaceC55235Lm3, "<this>");
        o.LJIIIZ(clz, "clz");
        return (InterfaceC55251LmJ) SZE.LJ(C65352Pkq.LIZ(C88499YoJ.class), new SZD(), new AqS63S1200000_8(interfaceC55235Lm3, clz, str, 1));
    }

    public static final <T extends InterfaceC80653En> void LJ(InterfaceC55235Lm3 interfaceC55235Lm3, Class<T> cls, String str) {
        o.LJIIIZ(interfaceC55235Lm3, "<this>");
        C55252LmK tree = interfaceC55235Lm3.getTree();
        tree.getClass();
        InterfaceC55251LmJ interfaceC55251LmJ = (InterfaceC55251LmJ) ((ConcurrentHashMap) tree.LIZIZ).remove(new C55248LmG(cls, str));
        if (interfaceC55251LmJ != null) {
            interfaceC55251LmJ.destroy();
        }
    }

    public static final <T extends InterfaceC80653En> void LIZIZ(InterfaceC55235Lm3 interfaceC55235Lm3, T data, Class<T> cls, String str) {
        o.LJIIIZ(interfaceC55235Lm3, "<this>");
        o.LJIIIZ(data, "data");
        SZE.LJ(C65352Pkq.LIZ(C88500YoK.class), new SZD(), new C49622Jdi(interfaceC55235Lm3, data, cls, str));
    }
}
