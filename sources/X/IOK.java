package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IOK {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(FWH.LJLIL);

    public static Keva LIZLLL() {
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        return (Keva) value;
    }

    public static long LIZ() {
        return LIZLLL().getLong("feed_video_cache_time", 0L);
    }

    public static long LIZIZ() {
        return LIZLLL().getLong("feed_video_cache_time2", 0L);
    }

    public static long LIZJ() {
        return LIZLLL().getLong("feed_video_cache_time_v3", 0L);
    }

    public static String LJ() {
        String string = LIZLLL().getString("feed_video_group_key", "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public static String LJFF() {
        String string = LIZLLL().getString("feed_video_group_key2", "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public static String LJI() {
        String string = LIZLLL().getString("feed_video_group_v3", "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public static void LJII(String value) {
        o.LJIIIZ(value, "value");
        LIZLLL().storeString("feed_video_group_key", value);
    }

    public static void LJIIIIZZ(String value) {
        o.LJIIIZ(value, "value");
        LIZLLL().storeString("feed_video_group_key2", value);
    }

    public static void LJIIIZ(String value) {
        o.LJIIIZ(value, "value");
        LIZLLL().storeString("feed_video_group_v3", value);
    }
}
