package X;

import defpackage.q;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AFF {
    public static final List<C25890AEc> LIZ = new ArrayList();
    public static final java.util.Set<Integer> LIZIZ = new LinkedHashSet();
    public static C25891AEd LIZJ;

    public static String LIZ() {
        String abstractCollection = new ArrayList(LIZIZ).toString();
        o.LJIIIIZZ(abstractCollection, "ArrayList(checkSet).toString()");
        return abstractCollection;
    }

    public static void LIZIZ() {
        C39398FdC c39398FdC = C39398FdC.LIZ;
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("object_type", "video");
        c198517qh.LIZ.put("is_success", 0);
        C39398FdC.LIZIZ("submit_report_reason", q.LIZJ(c198517qh.LIZ, "reason_id", LIZ(), c198517qh, c39398FdC));
    }
}
