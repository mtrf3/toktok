package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Pdc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64904Pdc {
    public static String LIZIZ(InterfaceC65105Pgr interfaceC65105Pgr) {
        return C16880lQ.LJLLJ(interfaceC65105Pgr.getClass());
    }

    public static Object LIZ(InterfaceC65105Pgr key, C37826Esw getData) {
        o.LJIIIZ(getData, "$this$getData");
        o.LJIIIZ(key, "key");
        return ((java.util.Map) getData.LIZLLL.getValue()).get(key);
    }

    public static void LIZJ(InterfaceC65105Pgr key, C37826Esw putData, Object obj) {
        o.LJIIIZ(putData, "$this$putData");
        o.LJIIIZ(key, "key");
        ((java.util.Map) putData.LIZLLL.getValue()).put(key, obj);
    }
}
