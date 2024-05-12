package X;

import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.PvP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66007PvP {
    public static final ConcurrentHashMap<EnumC66006PvO, InterfaceC66022Pve> LIZ;

    static {
        ConcurrentHashMap<EnumC66006PvO, InterfaceC66022Pve> concurrentHashMap = new ConcurrentHashMap<>();
        LIZ = concurrentHashMap;
        concurrentHashMap.put(EnumC66006PvO.MSG, new C66021Pvd());
        concurrentHashMap.put(EnumC66006PvO.JSON, new EPP());
        concurrentHashMap.put(EnumC66006PvO.BUNDLE, new C66018Pva());
        concurrentHashMap.put(EnumC66006PvO.INTENT, new C66010PvS());
        concurrentHashMap.put(EnumC66006PvO.BORDER, new EPN());
        concurrentHashMap.put(EnumC66006PvO.STACKTRACE, new EPO());
        concurrentHashMap.put(EnumC66006PvO.THREAD, new C66015PvX());
        concurrentHashMap.put(EnumC66006PvO.THROWABLE, new C66020Pvc());
    }

    public static String LIZ(EnumC66006PvO enumC66006PvO, Intent intent) {
        LIZ.get(enumC66006PvO).getClass();
        if (intent == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Intent { ");
        OGT.LIZJ(intent, sb);
        sb.append(" }");
        return sb.toString();
    }

    public static String LIZIZ(EnumC66006PvO enumC66006PvO, Bundle bundle) {
        LIZ.get(enumC66006PvO).getClass();
        return OGT.LIZIZ(bundle);
    }

    public static String LIZJ(EnumC66006PvO enumC66006PvO, String str) {
        InterfaceC66022Pve interfaceC66022Pve = LIZ.get(enumC66006PvO);
        if (interfaceC66022Pve != null) {
            if (enumC66006PvO == EnumC66006PvO.BORDER) {
                return interfaceC66022Pve.LIZ(new String[]{str});
            }
            return interfaceC66022Pve.LIZ(str);
        }
        return str;
    }

    public static String LIZLLL(EnumC66006PvO enumC66006PvO, Thread thread) {
        return LIZ.get(enumC66006PvO).LIZ(thread);
    }

    public static String LJ(EnumC66006PvO enumC66006PvO, Throwable th) {
        return LIZ.get(enumC66006PvO).LIZ(th);
    }

    public static String LJFF(EnumC66006PvO enumC66006PvO, StackTraceElement[] stackTraceElementArr) {
        return LIZ.get(enumC66006PvO).LIZ(stackTraceElementArr);
    }
}
