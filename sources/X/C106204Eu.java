package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.4Eu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106204Eu {
    public static final C106204Eu LIZ = new C106204Eu();
    public static Keva LIZIZ;

    public static String LIZ(String key) {
        Keva keva;
        synchronized (LIZ) {
            keva = LIZIZ;
            if (keva == null) {
                keva = Keva.getRepo("action_bar_repo");
                LIZIZ = keva;
                o.LJIIIIZZ(keva, "getRepo(KEVA_REPO).also { keva = it }");
            }
        }
        o.LJIIIZ(key, "key");
        String string = keva.getString(key, "");
        o.LJIIIIZZ(string, "repo.getString(key, defValue)");
        return string;
    }

    public static void LIZIZ(String key, String str) {
        Keva keva;
        synchronized (LIZ) {
            keva = LIZIZ;
            if (keva == null) {
                keva = Keva.getRepo("action_bar_repo");
                LIZIZ = keva;
                o.LJIIIIZZ(keva, "getRepo(KEVA_REPO).also { keva = it }");
            }
        }
        o.LJIIIZ(key, "key");
        keva.storeString(key, str);
    }
}
