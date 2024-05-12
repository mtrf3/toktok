package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H9H {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(H9I.LJLIL);

    public static final String LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        return ((Keva) LIZ.getValue()).getString(str, null);
    }

    public static final void LIZ(String musicId, String musicPath) {
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(musicPath, "musicPath");
        ((Keva) LIZ.getValue()).storeString(musicId, musicPath);
    }
}
