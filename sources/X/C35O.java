package X;

import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.jvm.internal.o;

/* renamed from: X.35O, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35O {
    public static final Queue<List<EcSearchActivity>> LIZ = new LinkedList();

    public static boolean LIZ(ActivityC45651qj activityC45651qj) {
        Iterator<T> it = LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            List list = (List) it.next();
            o.LJIIIIZZ(list, "list");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (o.LJ(it2.next(), activityC45651qj)) {
                    if (list.size() > 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
