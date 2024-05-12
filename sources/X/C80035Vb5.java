package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Vb5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80035Vb5 {
    public static InterfaceC80039Vb9 LIZ(EnumC79963VZv playMode) {
        o.LJIIJ(playMode, "playMode");
        int i = C79964VZw.LIZ[playMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return new C78924UyG();
            }
            return new C80036Vb6();
        }
        return new C78923UyF();
    }
}
