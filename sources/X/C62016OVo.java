package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.OVo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62016OVo {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C62018OVq.LJLIL);

    public static Keva LIZ() {
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        return (Keva) value;
    }

    public static void LIZIZ(java.util.Set set) {
        if (set == null) {
            LIZ().erase("keva_key_wallpaper_player_error_events");
        } else {
            LIZ().storeStringSet("keva_key_wallpaper_player_error_events", set);
        }
    }
}
