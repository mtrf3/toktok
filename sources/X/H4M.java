package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H4M {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(H4N.LJLIL);

    public static Keva LIZIZ() {
        return (Keva) LIZ.getValue();
    }

    public static void LIZJ(String path, boolean z) {
        o.LJIIIZ(path, "path");
        LIZIZ().storeString(C72972SkS.LIZLLL(z ? 1 : 0, "key_ending_effects_path"), path);
    }

    public static void LIZLLL(String str, boolean z) {
        LIZIZ().storeString(C72972SkS.LIZLLL(z ? 1 : 0, "key_user_fingerprint"), str);
    }
}
