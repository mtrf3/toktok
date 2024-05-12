package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.DyI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35610DyI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context) {
        try {
            FFL.LJIIIZ().getClass();
            boolean LJ = FFL.LJ(31744, "so_load_opt_experiment", true, false);
            File file = new File(C16880lQ.LLIIJLIL(context).toString() + "/so_load_opt_experiment.cfg");
            if (LJ) {
                file.exists();
            }
        } catch (Throwable unused) {
        }
    }
}
