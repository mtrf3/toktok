package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.MtS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58242MtS {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C58241MtR.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C58243MtT.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C58244MtU.LJLIL);

    public static InterfaceC86486Xww LIZ(int i) {
        return (InterfaceC86486Xww) ((ConcurrentHashMap) LIZ.getValue()).get(Integer.valueOf(i));
    }

    public static void LIZIZ(InterfaceC86486Xww interfaceC86486Xww) {
        for (int i : interfaceC86486Xww.LIZ()) {
            ((ConcurrentHashMap) LIZ.getValue()).put(Integer.valueOf(i), interfaceC86486Xww);
        }
    }
}
