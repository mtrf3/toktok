package X;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.LaE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54502LaE {
    public static final ConcurrentHashMap<String, Long> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LIZIZ = new ConcurrentHashMap<>();
    public static final C54505LaH LIZJ = new C54505LaH();

    public static final void LIZIZ(String key) {
        o.LJIIIZ(key, "key");
        LIZLLL(key, null, 6);
    }

    public static final void LIZ(String key) {
        o.LJIIIZ(key, "key");
        LIZIZ.put(key, Boolean.TRUE);
        if (!C52231Keh.LIZ() || TextUtils.isEmpty(key)) {
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = LIZ;
        if (concurrentHashMap.containsKey(key)) {
            concurrentHashMap.remove(key);
        }
        concurrentHashMap.put(key, Long.valueOf(System.currentTimeMillis()));
    }

    public static final boolean LJ(String str) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.containsKey(str) && o.LJ(concurrentHashMap.get(str), Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public static final void LIZJ(String key, EnumC1804076e result, String str) {
        java.util.Map<String, ? extends Object> map;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(result, "result");
        LIZIZ.put(key, Boolean.FALSE);
        if (C52231Keh.LIZ() && !TextUtils.isEmpty(key)) {
            ConcurrentHashMap<String, Long> concurrentHashMap = LIZ;
            if (!concurrentHashMap.containsKey(key)) {
                return;
            }
            long j = 0;
            if (result == EnumC1804076e.SUCCESS) {
                Long l = concurrentHashMap.get(key);
                if (l == null || l.longValue() <= 0) {
                    return;
                } else {
                    j = System.currentTimeMillis() - l.longValue();
                }
            }
            if (str != null) {
                map = E2C.LIZJ("from_scene", str);
            } else {
                map = null;
            }
            C54505LaH c54505LaH = LIZJ;
            if (c54505LaH != null) {
                c54505LaH.LIZ(key, result, j, map);
            }
            concurrentHashMap.remove(key);
        }
    }

    public static /* synthetic */ void LIZLLL(String str, EnumC1804076e enumC1804076e, int i) {
        if ((i & 2) != 0) {
            enumC1804076e = EnumC1804076e.SUCCESS;
        }
        LIZJ(str, enumC1804076e, null);
    }
}
