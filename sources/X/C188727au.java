package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7au, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188727au {
    public static boolean LIZIZ;
    public final java.util.Map<String, String> LIZ = new HashMap();

    public static C188727au LJIIJJI() {
        return new C188727au();
    }

    public final void LJII(HashMap hashMap) {
        if (hashMap != null) {
            ((HashMap) this.LIZ).putAll(hashMap);
        }
    }

    public final void LJIIIIZZ(java.util.Map map) {
        if (map != null) {
            ((HashMap) this.LIZ).putAll(map);
        }
    }

    public final String LJIIJ(String str) {
        java.util.Map<String, String> map = this.LIZ;
        if (map != null && ((HashMap) map).containsKey(str)) {
            return (String) ((HashMap) this.LIZ).get(str);
        }
        return "";
    }

    public final C188727au LIZIZ(float f, String str) {
        if (LIZIZ) {
            LJIIIZ(str, String.valueOf(f));
            return this;
        }
        LJFF(Float.valueOf(f), str);
        return this;
    }

    public final C188727au LIZJ(String str, double d) {
        if (LIZIZ) {
            LJIIIZ(str, String.valueOf(d));
            return this;
        }
        LJFF(Double.valueOf(d), str);
        return this;
    }

    public final void LIZLLL(int i, String str) {
        LJIIIZ(str, String.valueOf(i));
    }

    public final void LJ(long j, String str) {
        LJIIIZ(str, String.valueOf(j));
    }

    public final void LJFF(Object obj, String str) {
        if (obj != null) {
            LJI(str, GsonProtectorUtils.toJson(new Gson(), obj));
        }
    }

    public final void LJI(String str, String str2) {
        LJIIIZ(str, str2);
    }

    public final void LJIIIZ(String str, String str2) {
        ((HashMap) this.LIZ).put(str, C188737av.LIZ(str2));
    }

    public final void LIZ(String str, Aweme aweme, String str2) {
        for (Map.Entry entry : ((HashMap) K02.LIZIZ(str, aweme, str2)).entrySet()) {
            LJI((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
