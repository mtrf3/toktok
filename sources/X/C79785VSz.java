package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.VSz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79785VSz {
    public static final List<VT0> LIZ = new ArrayList();
    public static int LIZIZ;

    public static String LIZ(DialogC79782VSw dialogNG) {
        o.LJIIIZ(dialogNG, "dialogNG");
        StringBuilder sb = new StringBuilder("default_overlay_id_");
        int i = LIZIZ;
        LIZIZ = i + 1;
        sb.append(i);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "StringBuilder(DEFAULT_OV… sCurrentId++).toString()");
        ListProtector.add(LIZ, 0, new VT0(sb2, dialogNG));
        return sb2;
    }

    public static void LIZIZ(String str) {
        if (str != null) {
            Iterator it = ((ArrayList) LIZ).iterator();
            while (it.hasNext()) {
                VT0 vt0 = (VT0) it.next();
                if (o.LJ(vt0.LIZ, str)) {
                    ((ArrayList) LIZ).remove(vt0);
                    return;
                }
            }
        }
    }
}
