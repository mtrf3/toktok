package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Kub, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53217Kub {
    public static final C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.NONE, C53263KvL.LJLIL);

    public static void LIZ(List list, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        if (list == null) {
            list = new ArrayList();
        }
        interfaceC88472Yns.invoke(list);
        FFL.LJIIIZ().getClass();
        if (FFL.LJ(31744, "gecko_channel_store", true, false) && (list instanceof ArrayList)) {
            interfaceC88472Yns2.invoke(((ArrayList) list).toArray(new String[0]));
        }
    }
}
