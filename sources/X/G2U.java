package X;

import android.content.Context;
import java.io.File;

/* loaded from: classes7.dex */
public final class G2U {
    public static InterfaceC79713Ax LIZ;

    public static void LIZ(E5O e5o, Context context) {
        File LLIIJLIL;
        File LLIIJLIL2;
        C64390POw c64390POw = C64390POw.LIZIZ;
        c64390POw.LIZ.LIZLLL(e5o);
        if (c64390POw.LIZ()) {
            C64387POt c64387POt = new C64387POt();
            C18080nM.LIZ.getClass();
            C18080nM.LJ().add(c64387POt);
            if (c64390POw.LJI() && context != null && (LLIIJLIL2 = C16880lQ.LLIIJLIL(context)) != null && LLIIJLIL2.exists()) {
                File file = new File(LLIIJLIL2, "traceLogs");
                if (!file.exists()) {
                    file.mkdirs();
                }
                String absolutePath = file.getAbsolutePath();
                if (absolutePath != null) {
                    G2V.LIZIZ.LIZ(context, absolutePath);
                }
            }
            if (!c64390POw.LIZIZ() || context == null || (LLIIJLIL = C16880lQ.LLIIJLIL(context)) == null || !LLIIJLIL.exists()) {
                return;
            }
            C56463MDz.LJI(new File(LLIIJLIL, "traceLogs"));
        }
    }
}
