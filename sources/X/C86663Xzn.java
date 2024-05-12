package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Xzn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86663Xzn {
    public static final XLL LIZ = C79853Bl.LIZ(0, 0, null, 6);
    public static final Keva LIZIZ = Keva.getRepo("auto_translation_settings_cache");

    public static boolean LIZ() {
        if (C41032G8m.LIZ()) {
            return AK4.LIZ().LJJIIZI();
        }
        if (C52263KfD.LIZ()) {
            return LIZIZ.getBoolean("enable_translation_one_click", false);
        }
        return LIZIZ.getBoolean("enable_translation", true);
    }
}
