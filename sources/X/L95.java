package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L95 {
    public static final String LIZ() {
        FFL.LJIIIZ().getClass();
        String LJIILJJIL = FFL.LJIILJJIL(31744, "duet_discover_ui_type", "control", true);
        o.LJIIIIZZ(LJIILJJIL, "getInstance().getStringV…deExperiment::class.java)");
        return LJIILJJIL;
    }

    public static final boolean LIZIZ() {
        String LIZ = LIZ();
        if (TextUtils.equals(LIZ, "two_columns") || TextUtils.equals(LIZ, "full_screen")) {
            return true;
        }
        return false;
    }
}
