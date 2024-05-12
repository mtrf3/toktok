package X;

import android.util.Printer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class PJK {
    public static Printer LJ;
    public static PJK LJFF;
    public static final PJL LJI = new PJL();
    public long LIZ = -1;
    public final List<Printer> LIZIZ = new ArrayList();
    public final List<Printer> LIZJ = new ArrayList();
    public boolean LIZLLL;

    public static PJK LIZ() {
        if (LJFF == null) {
            synchronized (PJK.class) {
                if (LJFF == null) {
                    LJFF = new PJK();
                }
            }
        }
        return LJFF;
    }

    public static void LIZIZ(String str, List list) {
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.isEmpty()) {
                return;
            }
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Printer printer = (Printer) ListProtector.get(list, i);
                    if (printer == null) {
                        return;
                    }
                    printer.println(str);
                }
            } catch (Throwable unused) {
                C78685UuP.LJJ();
            }
        }
    }
}
