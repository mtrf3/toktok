package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.5o2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145905o2 {
    public static final Keva LIZ = Keva.getRepo("MusicSyncModeControl");

    public static boolean LIZ(String str) {
        if (o.LJ(str, "single_song")) {
            return false;
        }
        int LIZ2 = C00F.LIZ(31744, 0, "studio_auto_sound_sync_follower_count", true);
        if (LIZ2 != 0) {
            C78934UyQ.LJLIL.getCommerceService();
            if (HH2.LIZ() < LIZ2) {
                return false;
            }
        }
        C78934UyQ.LJLIL.getCommerceService();
        if (HH2.LIZ() >= C00F.LIZ(31744, 10000, "enable_soundsync_remember_follower_count", true)) {
            String string = LIZ.getString("storeLastMode1", "default");
            o.LJIIIIZZ(string, "keva.getString(STORE_LAST_MODE, default)");
            return o.LJ(string, "default");
        }
        String string2 = LIZ.getString("storeLastMode1", "SYNC");
        o.LJIIIIZZ(string2, "keva.getString(STORE_LAST_MODE, default)");
        return o.LJ(string2, "default");
    }

    public static void LIZIZ(String str, boolean z) {
        String str2;
        if (o.LJ(str, "single_song")) {
            return;
        }
        Keva keva = LIZ;
        if (z) {
            str2 = "SYNC";
        } else {
            str2 = "default";
        }
        keva.storeString("storeLastMode1", str2);
    }
}
