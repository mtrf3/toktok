package X;

import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class FAI {
    public static FAH LIZ;
    public static boolean LIZIZ;

    public static List<Printer> LIZ() {
        FAH fah = LIZ;
        if (fah != null) {
            return fah.LJLIL;
        }
        return null;
    }

    public static void LIZIZ() {
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        LIZ = new FAH();
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            Printer printer = (Printer) declaredField.get(C16880lQ.LLJJJJ());
            if (printer != null) {
                ((ArrayList) LIZ.LJLIL).add(printer);
            }
        } catch (Exception unused) {
        }
        C16880lQ.LLJJJJ().setMessageLogging(LIZ);
    }

    public static void LIZJ(Printer printer) {
        if (printer != null && !((ArrayList) LIZ.LJLILLLLZI).contains(printer)) {
            ((ArrayList) LIZ.LJLILLLLZI).add(printer);
            LIZ.LJLJJI = true;
        }
    }
}
