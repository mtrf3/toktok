package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.8Aj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206978Aj {
    public static int LIZIZ;
    public static boolean LJ;
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C206988Ak.LJLIL);
    public static long LIZJ = SystemClock.elapsedRealtime();
    public static final java.util.Map<String, java.util.Set<String>> LIZLLL = new LinkedHashMap();
    public static String LJFF = "";
    public static String LJI = "";
    public static boolean LJII = true;

    public static String LIZ() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : ((LinkedHashMap) LIZLLL).keySet()) {
            Iterable iterable = (Iterable) ((LinkedHashMap) LIZLLL).get(obj);
            if (iterable != null) {
                str = ORZ.LLD(iterable, null, null, null, null, 63);
            } else {
                str = "";
            }
            linkedHashMap.put(obj, str);
        }
        String json = GsonProtectorUtils.toJson(C75792yF.LIZIZ(), linkedHashMap);
        o.LJIIIIZZ(json, "getGson().toJson(interactionMapString)");
        return json;
    }

    public static void LIZLLL(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        java.util.Map<String, java.util.Set<String>> map = LIZLLL;
        if (!map.containsKey(eventName)) {
            map.put(eventName, new LinkedHashSet());
        }
        java.util.Set set = (java.util.Set) ((LinkedHashMap) map).get(eventName);
        if (set != null) {
            set.add(str);
        }
    }

    public static void LIZIZ(boolean z, Throwable th, boolean z2) {
        C206998Al c206998Al = (C206998Al) LIZ.getValue();
        if (c206998Al.LIZIZ == 0 && c206998Al.LIZ == 0) {
            return;
        }
        if (c206998Al.LJI) {
            c206998Al.LJI = false;
            c206998Al.LJFF = z2;
            c206998Al.LJII = th;
            c206998Al.LIZ();
            return;
        }
        c206998Al.LJ = z;
        if (z) {
            c206998Al.LJI = true;
            return;
        }
        c206998Al.LJFF = z2;
        c206998Al.LIZJ = SystemClock.elapsedRealtime();
        c206998Al.LJII = th;
        if (z2) {
            return;
        }
        c206998Al.LIZ();
    }

    public static void LIZJ(String str, String enterFrom, String str2, int i) {
        boolean z;
        String str3 = str2;
        if ((i & 4) != 0) {
            if (C206928Ae.LIZ == 2) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        o.LJIIIZ(enterFrom, "enterFrom");
        LJFF = enterFrom;
        LJI = str;
        long elapsedRealtime = SystemClock.elapsedRealtime() - LIZJ;
        boolean z2 = LJII;
        if (str3 == null) {
            str3 = "";
        }
        C207008Am.LIZ(new C207038Ap(elapsedRealtime, str, enterFrom, str3, z2, z));
        LJII = false;
    }
}
