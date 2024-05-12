package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AQO {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(AQN.LJLIL);

    public static C9SN LIZJ() {
        C9SP c9sp = C9SN.Companion;
        int i = LIZLLL().getInt("key_download_state", C9SN.UNINITIALIZED.getValue());
        c9sp.getClass();
        for (C9SN c9sn : C9SN.values()) {
            if (c9sn.getValue() == i) {
                return c9sn;
            }
        }
        return C9SN.UNINITIALIZED;
    }

    public static InterfaceC32651Px LIZLLL() {
        return (InterfaceC32651Px) LIZ.getValue();
    }

    public static int LIZ() {
        return LIZLLL().getInt("keva_cache_count", 50);
    }

    public static int LIZIZ() {
        return LIZLLL().getInt("key_cached_video_count", 0);
    }

    public static boolean LJ() {
        return LIZLLL().getBoolean("key_is_wifi_only", true);
    }

    public static void LJFF(int i) {
        LIZLLL().LIZLLL("keva_cache_count", i);
        AQV.LJLIL.getClass();
        Iterator<AQP> it = AQV.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().Fu(i);
        }
    }

    public static void LJI(double d) {
        LIZLLL().LJ("key_cached_size", d);
        AQV.LJLIL.getClass();
        Iterator<AQP> it = AQV.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().zn0(d);
        }
    }

    public static void LJII(int i) {
        LIZLLL().LIZLLL("key_cached_video_count", i);
        AQV.LJLIL.getClass();
        Iterator<AQP> it = AQV.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().hD(i);
        }
    }

    public static void LJIIIIZZ(C9SN value) {
        o.LJIIIZ(value, "value");
        LIZLLL().LIZLLL("key_download_state", value.getValue());
        AQV.LJLIL.getClass();
        Iterator<AQP> it = AQV.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().Xk(value);
        }
    }

    public static void LJIIIZ(boolean z) {
        LIZLLL().LJI("key_is_wifi_only", z);
        AQV.LJLIL.getClass();
        Iterator<AQP> it = AQV.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().Xh(z);
        }
    }
}
