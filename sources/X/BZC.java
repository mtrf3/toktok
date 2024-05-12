package X;

import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BZC {
    public static final HashSet<Integer> LIZ = new HashSet<>();

    public static boolean LIZ(int i) {
        Long previousTime;
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.ENGLISH;
        String format = new SimpleDateFormat("dd-MM-yyyy", locale).format(Long.valueOf(currentTimeMillis));
        o.LJIIIIZZ(format, "SimpleDateFormat(\"dd-MM-…e.ENGLISH).format(timeMs)");
        if (i == 1) {
            previousTime = InterfaceC30442Bx8.LLLLLLLLLL.LIZJ();
        } else {
            previousTime = InterfaceC30442Bx8.LLLLLLLZIL.LIZJ();
        }
        o.LJIIIIZZ(previousTime, "previousTime");
        String format2 = new SimpleDateFormat("dd-MM-yyyy", locale).format(Long.valueOf(previousTime.longValue()));
        o.LJIIIIZZ(format2, "SimpleDateFormat(\"dd-MM-…e.ENGLISH).format(timeMs)");
        if (!LIZ.contains(Integer.valueOf(i)) && !o.LJ(format, format2)) {
            return false;
        }
        return true;
    }
}
