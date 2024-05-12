package X;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0eq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12800eq {
    public static boolean LIZ;
    public static final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>(200);
    public static final ConcurrentHashMap<String, Long> LIZJ = new ConcurrentHashMap<>(200);

    public static void LIZJ(EnumC12790ep enumC12790ep) {
        if (enumC12790ep == null) {
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.containsKey(enumC12790ep.name())) {
            concurrentHashMap.remove(enumC12790ep.name());
        }
        ConcurrentHashMap<String, Long> concurrentHashMap2 = LIZJ;
        if (concurrentHashMap2.containsKey(enumC12790ep.name())) {
            concurrentHashMap2.remove(enumC12790ep.name());
        }
    }

    public static void LIZLLL(EnumC12790ep enumC12790ep) {
        if (!LIZ) {
            return;
        }
        LJ(enumC12790ep, null);
    }

    public static void LJFF(EnumC12790ep enumC12790ep) {
        if (!LIZ) {
            return;
        }
        LIZIZ.put(enumC12790ep.name(), Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.EnumC12790ep r8, java.util.HashMap<java.lang.String, java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12800eq.LJ(X.0ep, java.util.HashMap):void");
    }

    public static void LIZ(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (JSONException e) {
            C0NB.LJFF("TimeCostUtil", "", e);
        }
    }

    public static void LIZIZ(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            C0NB.LJFF("TimeCostUtil", "", e);
        }
    }
}
