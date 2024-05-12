package X;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FFS {
    public static Integer LIZ;
    public static File LIZIZ;

    public static File LIZ(Context context) {
        File LLIIJLIL = C16880lQ.LLIIJLIL(context);
        LIZIZ = new File(LLIIJLIL, "covode_enable");
        if (LLIIJLIL.exists()) {
            LLIIJLIL.mkdir();
        }
        File file = LIZIZ;
        o.LJII(file, "null cannot be cast to non-null type java.io.File");
        return file;
    }
}
