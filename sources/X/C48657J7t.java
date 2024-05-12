package X;

import android.os.SystemClock;
import java.util.HashMap;
import kotlin.jvm.internal.AqS75S1100000_8;

/* renamed from: X.J7t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48657J7t {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static java.util.Map LIZ(java.util.Map map) {
        ?? hashMap;
        C76800UCe c76800UCe = null;
        if (map != null) {
            try {
                String str = (String) map.get("log_extra");
                if (str != null) {
                    hashMap = new HashMap();
                    String str2 = (String) map.get("ad_id");
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    hashMap.put("ad_id", str2);
                    String str4 = (String) map.get("value");
                    if (str4 != null) {
                        str3 = str4;
                    }
                    hashMap.put("creative_id", str3);
                    hashMap.put("tag", "live_ad");
                    AqS75S1100000_8 aqS75S1100000_8 = new AqS75S1100000_8(str, (HashMap) hashMap, 17);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    aqS75S1100000_8.invoke();
                    C48656J7s.LIZIZ(str.length(), SystemClock.elapsedRealtime() - elapsedRealtime);
                    try {
                        c76800UCe = C76800UCe.LIZ;
                        hashMap = hashMap;
                        C3C5.m7constructorimpl(c76800UCe);
                        return hashMap;
                    } catch (Throwable th) {
                        th = th;
                        c76800UCe = hashMap;
                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                        return c76800UCe;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                return c76800UCe;
            }
        }
        hashMap = 0;
        C3C5.m7constructorimpl(c76800UCe);
        return hashMap;
    }
}
