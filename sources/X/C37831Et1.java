package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Et1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37831Et1 {
    public static final C37829Esz LIZ = new C37829Esz();

    public static final java.util.Map<String, Class<? extends InterfaceC37666EqM>> LIZ(EnumC37844EtE platformType, String namespace) {
        C37725ErJ c37725ErJ;
        o.LJIIJ(platformType, "platformType");
        o.LJIIJ(namespace, "namespace");
        C37829Esz c37829Esz = LIZ;
        c37829Esz.getClass();
        if (c37829Esz.LIZJ.get(namespace) == null || (c37725ErJ = c37829Esz.LIZJ.get(namespace)) == null || platformType == EnumC37844EtE.NONE) {
            return null;
        }
        return c37725ErJ.LIZ.get(platformType);
    }

    public static void LIZIZ(Class cls, EnumC37844EtE scope, int i) {
        String namespace;
        if ((i & 2) != 0) {
            scope = EnumC37844EtE.ALL;
        }
        if ((i & 4) != 0) {
            namespace = "DEFAULT";
        } else {
            namespace = null;
        }
        o.LJIIJ(scope, "scope");
        o.LJIIJ(namespace, "namespace");
        LIZ.LIZIZ(cls, scope, namespace);
    }
}
