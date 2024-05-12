package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O4W {
    public static final Keva LIZ;

    static {
        Keva repo = KevaImpl.getRepo("forest_cdn", 1);
        o.LJFF(repo, "Keva.getRepo(REPO_NAME, …tants.MODE_MULTI_PROCESS)");
        LIZ = repo;
    }

    public static void LIZ(String key) {
        o.LJIIJ(key, "key");
        LIZ.erase(key);
    }

    public static void LIZIZ(String key, String str) {
        o.LJIIJ(key, "key");
        LIZ.storeStringJustDisk(key, str);
    }
}
