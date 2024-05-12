package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GOV implements GOW {
    public static final GOV LIZ = new GOV();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(GMY.LJLIL);
    public static final java.util.Map<String, List<GUQ>> LIZJ = new LinkedHashMap();
    public static final java.util.Set<String> LIZLLL = new LinkedHashSet();
    public static final java.util.Map<String, String> LJ = new LinkedHashMap();
    public static final java.util.Map<String, InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object>> LJFF = new LinkedHashMap();
    public static final java.util.Map<String, InterfaceC79150V4o> LJI = new LinkedHashMap();
    public static final java.util.Set<String> LJII = new LinkedHashSet();

    @Override // X.GOW
    public final GUQ LIZ(String taskId) {
        List list;
        o.LJIIIZ(taskId, "taskId");
        Object obj = ((LinkedHashMap) LJ).get(taskId);
        Object obj2 = null;
        if (obj == null || (list = (List) ((LinkedHashMap) LIZJ).get(obj)) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((GUQ) next).LJLJJL.LIZLLL instanceof GOS)) {
                obj2 = next;
                break;
            }
        }
        return (GUQ) obj2;
    }
}
