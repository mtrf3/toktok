package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EtI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37848EtI {
    public static final ConcurrentHashMap<Class<AbstractC31941CgD>, AbstractC31941CgD> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C37849EtJ> LIZIZ = new ConcurrentHashMap<>();

    public static AbstractC31941CgD LIZJ(Class cls) {
        ConcurrentHashMap<Class<AbstractC31941CgD>, AbstractC31941CgD> concurrentHashMap = LIZ;
        AbstractC31941CgD abstractC31941CgD = concurrentHashMap.get(cls);
        if (abstractC31941CgD != null) {
            return abstractC31941CgD;
        }
        try {
            AbstractC31941CgD tmp = (AbstractC31941CgD) cls.newInstance();
            o.LJFF(tmp, "tmp");
            concurrentHashMap.put(cls, tmp);
            return tmp;
        } catch (Exception unused) {
            return null;
        }
    }

    public static java.util.Map LIZIZ(EnumC37847EtH platformType, String namespace) {
        C37849EtJ c37849EtJ;
        o.LJIIJ(platformType, "platformType");
        o.LJIIJ(namespace, "namespace");
        ConcurrentHashMap<String, C37849EtJ> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.get(namespace) == null || (c37849EtJ = concurrentHashMap.get(namespace)) == null || platformType == EnumC37847EtH.NONE) {
            return null;
        }
        return c37849EtJ.LIZ.get(platformType);
    }

    public static Class LIZ(EnumC37847EtH platformType, String name, String namespace) {
        C37849EtJ c37849EtJ;
        ConcurrentHashMap<String, Class<? extends InterfaceC37774Es6>> concurrentHashMap;
        o.LJIIJ(platformType, "platformType");
        o.LJIIJ(name, "name");
        o.LJIIJ(namespace, "namespace");
        ConcurrentHashMap<String, C37849EtJ> concurrentHashMap2 = LIZIZ;
        if (concurrentHashMap2.get(namespace) == null || (c37849EtJ = concurrentHashMap2.get(namespace)) == null || platformType == EnumC37847EtH.NONE || (concurrentHashMap = c37849EtJ.LIZ.get(platformType)) == null) {
            return null;
        }
        return concurrentHashMap.get(name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(Class cls, EnumC37847EtH scope, String namespace, int i) {
        List LJJIJ;
        String str;
        ConcurrentHashMap<Class<? extends InterfaceC37774Es6>, String> concurrentHashMap;
        if ((i & 2) != 0) {
            scope = EnumC37847EtH.ALL;
        }
        if ((i & 4) != 0) {
            namespace = "DEFAULT";
        }
        o.LJIIJ(scope, "scope");
        o.LJIIJ(namespace, "namespace");
        ConcurrentHashMap<String, C37849EtJ> concurrentHashMap2 = LIZIZ;
        if (concurrentHashMap2.get(namespace) == null) {
            concurrentHashMap2.put(namespace, new C37849EtJ());
        }
        C37849EtJ c37849EtJ = concurrentHashMap2.get(namespace);
        if (c37849EtJ != null) {
            EnumC37847EtH enumC37847EtH = EnumC37847EtH.ALL;
            if (scope == enumC37847EtH) {
                LJJIJ = C47261Igj.LJJIJIIJI(enumC37847EtH, EnumC37847EtH.WEB, EnumC37847EtH.LYNX, EnumC37847EtH.RN);
            } else {
                LJJIJ = C47261Igj.LJJIJ(scope);
            }
            for (Object obj : LJJIJ) {
                ConcurrentHashMap<String, Class<? extends InterfaceC37774Es6>> concurrentHashMap3 = c37849EtJ.LIZ.get(obj);
                if (concurrentHashMap3 == null) {
                    concurrentHashMap3 = new ConcurrentHashMap<>();
                }
                try {
                    concurrentHashMap = C37850EtK.LIZ;
                    str = concurrentHashMap.get(cls);
                } catch (Exception unused) {
                }
                if (str == null) {
                    concurrentHashMap.put(cls, ((InterfaceC37774Es6) cls.newInstance()).getName());
                    str = concurrentHashMap.get(cls);
                    if (str != null) {
                    }
                    str = "";
                }
                concurrentHashMap3.put(str, cls);
                c37849EtJ.LIZ.put(obj, concurrentHashMap3);
            }
        }
    }
}
