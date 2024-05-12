package X;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ErJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37725ErJ {
    public final ConcurrentHashMap<EnumC37844EtE, ConcurrentHashMap<String, Class<? extends InterfaceC37666EqM>>> LIZ;
    public final C36562EWo LIZIZ;
    public final boolean LIZJ;

    public C37725ErJ() {
        this(0);
    }

    public /* synthetic */ C37725ErJ(int i) {
        this(false, null);
    }

    public C37725ErJ(boolean z, InterfaceC38263Ezz interfaceC38263Ezz) {
        String LIZIZ;
        this.LIZJ = z;
        this.LIZ = new ConcurrentHashMap<>();
        if (z) {
            C36562EWo c36562EWo = new C36562EWo();
            if (interfaceC38263Ezz != null && (LIZIZ = interfaceC38263Ezz.LIZIZ()) != null) {
                C36551EWd.LIZ.put(LIZIZ, new WeakReference<>(c36562EWo));
            }
            this.LIZIZ = c36562EWo;
        }
    }

    public final Class<? extends InterfaceC37666EqM> LIZ(EnumC37844EtE platformType, String name) {
        ConcurrentHashMap<String, Class<? extends InterfaceC37666EqM>> concurrentHashMap;
        o.LJIIJ(platformType, "platformType");
        o.LJIIJ(name, "name");
        if (platformType == EnumC37844EtE.NONE || (concurrentHashMap = this.LIZ.get(platformType)) == null) {
            return null;
        }
        return concurrentHashMap.get(name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(Class<? extends InterfaceC37666EqM> clazz, EnumC37844EtE scope) {
        List LJJIJ;
        String LIZ;
        o.LJIIJ(clazz, "clazz");
        o.LJIIJ(scope, "scope");
        EnumC37844EtE enumC37844EtE = EnumC37844EtE.ALL;
        if (scope == enumC37844EtE) {
            LJJIJ = C47261Igj.LJJIJIIJI(enumC37844EtE, EnumC37844EtE.WEB, EnumC37844EtE.LYNX, EnumC37844EtE.RN);
        } else {
            LJJIJ = C47261Igj.LJJIJ(scope);
        }
        for (Object obj : LJJIJ) {
            ConcurrentHashMap<String, Class<? extends InterfaceC37666EqM>> concurrentHashMap = this.LIZ.get(obj);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
            }
            if (!this.LIZJ) {
                C36562EWo LIZ2 = C36551EWd.LIZ(null);
                if (LIZ2 != null) {
                    LIZ = LIZ2.LIZ(clazz);
                    if (LIZ != null && LIZ.length() != 0) {
                        concurrentHashMap.put(LIZ, clazz);
                        this.LIZ.put(obj, concurrentHashMap);
                    }
                }
            } else {
                C36562EWo c36562EWo = this.LIZIZ;
                if (c36562EWo != null) {
                    LIZ = c36562EWo.LIZ(clazz);
                    if (LIZ != null) {
                        concurrentHashMap.put(LIZ, clazz);
                        this.LIZ.put(obj, concurrentHashMap);
                    }
                }
            }
        }
    }
}
