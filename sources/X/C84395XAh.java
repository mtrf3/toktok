package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XAh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84395XAh {
    public static final C40601ia<String, InterfaceC84458XCs> LIZ = new C40601ia<>(true);

    public static InterfaceC84458XCs LIZ(String dirPath) {
        o.LJIIJ(dirPath, "dirPath");
        if (C107244Iu.LIZIZ(dirPath)) {
            return null;
        }
        C40601ia<String, InterfaceC84458XCs> c40601ia = LIZ;
        if (!c40601ia.containsKey(dirPath)) {
            return null;
        }
        return c40601ia.get(dirPath);
    }
}
