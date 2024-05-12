package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.VSo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79774VSo {
    public static final List<C79775VSp> LIZ = new ArrayList();
    public static int LIZIZ;

    public static void LIZIZ(String str) {
        if (str != null) {
            Iterator it = ((ArrayList) LIZ).iterator();
            while (it.hasNext()) {
                C79775VSp c79775VSp = (C79775VSp) it.next();
                if (o.LJ(c79775VSp.LIZ, str)) {
                    ((ArrayList) LIZ).remove(c79775VSp);
                    return;
                }
            }
        }
    }

    public static String LIZ(String str, DialogC79776VSq dialog) {
        o.LJIIJ(dialog, "dialog");
        if (str == null) {
            StringBuilder sb = new StringBuilder("default_overlay_id_");
            int i = LIZIZ;
            LIZIZ = i + 1;
            sb.append(i);
            str = sb.toString();
            o.LJFF(str, "StringBuilder(DEFAULT_OV… sCurrentId++).toString()");
        }
        ListProtector.add(LIZ, 0, new C79775VSp(str, dialog));
        return str;
    }
}
