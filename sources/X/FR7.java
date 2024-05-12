package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FR7 {
    public static Keva LIZ;
    public static boolean LIZIZ;

    public static Keva LIZ() {
        Keva keva = LIZ;
        if (keva != null || LIZIZ) {
            return keva;
        }
        synchronized ("repo_client_ai_kv") {
            if (LIZ == null) {
                LIZ = KevaImpl.getRepoSync("repo_client_ai_kv", 0);
            }
        }
        LIZIZ = true;
        return LIZ;
    }

    public static String LIZIZ(String key) {
        String string;
        o.LJIIIZ(key, "key");
        Keva LIZ2 = LIZ();
        if (LIZ2 == null || (string = LIZ2.getString(key, "")) == null) {
            return "";
        }
        return string;
    }

    public static void LIZJ(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        Keva LIZ2 = LIZ();
        if (LIZ2 != null) {
            LIZ2.storeString(key, value);
        }
    }
}
