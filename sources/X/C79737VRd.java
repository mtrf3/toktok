package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.VRd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79737VRd {
    public static void LIZ(List list, InterfaceC79740VRg interfaceC79740VRg) {
        String LIZIZ = LIZIZ("height", list);
        if (LIZIZ != null) {
            interfaceC79740VRg.LIZ(LIZIZ);
        }
        String LIZIZ2 = LIZIZ("foreground", list);
        if (LIZIZ2 != null) {
            interfaceC79740VRg.LIZIZ(LIZIZ2);
        }
    }

    public static String LIZIZ(String str, List list) {
        Object obj;
        Iterator it = ((ArrayList) list).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((OSZ) obj).getFirst(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        OSZ osz = (OSZ) obj;
        if (osz == null) {
            return null;
        }
        return (String) osz.getSecond();
    }
}
