package X;

import android.content.Context;
import android.os.HandlerThread;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FgJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39591FgJ {
    public static volatile boolean LIZ;
    public static HandlerC39590FgI LIZJ;
    public static Context LIZLLL;
    public static volatile boolean LJ;
    public static boolean LJFF;
    public static final HandlerThread LIZIZ = new HandlerThread("MemoryPeakThread");
    public static final List<String> LJI = new ArrayList();

    static {
        new ArrayList();
        new ArrayList();
    }

    public static File LIZ() {
        Context context = LIZLLL;
        if (context != null) {
            File LLIIJI = C16880lQ.LLIIJI(context, "liko");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("leakcanary-");
            Context context2 = LIZLLL;
            if (context2 != null) {
                LIZ2.append(context2.getPackageName());
                return new File(LLIIJI, X1D.LIZIZ(LIZ2));
            }
            o.LJIJI("context");
            throw null;
        }
        o.LJIJI("context");
        throw null;
    }
}
