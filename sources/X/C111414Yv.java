package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111414Yv {
    public static EnumC111404Yu LIZ = EnumC111404Yu.UNKNOWN;
    public static final List<InterfaceC111424Yw> LIZIZ = new ArrayList();

    public static void LIZ(EnumC111404Yu netState) {
        o.LJIIIZ(netState, "netState");
        EnumC111404Yu enumC111404Yu = LIZ;
        if (enumC111404Yu != netState) {
            LIZ = netState;
            Iterator it = ((ArrayList) LIZIZ).iterator();
            while (it.hasNext()) {
                ((InterfaceC111424Yw) it.next()).LIZ(enumC111404Yu, LIZ);
            }
        }
    }
}
