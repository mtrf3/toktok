package X;

import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class O44 {
    public static final List<Integer> LJ = C47261Igj.LJJIJIIJI(408, 503, 504);
    public boolean LIZ;
    public final int LIZIZ;
    public final java.util.Map<String, String> LIZJ;
    public AbstractC40713FyP LIZLLL;

    public abstract InputStream LIZIZ();

    public final synchronized boolean LIZ(O4O forestBuffer, C61296O3w fetchTask) {
        Object LIZ;
        o.LJIIJ(forestBuffer, "forestBuffer");
        o.LJIIJ(fetchTask, "fetchTask");
        if (this.LIZ) {
            return true;
        }
        Object obj = null;
        if (!forestBuffer.LJIILL()) {
            C39930Flm.LIZJ("TTNetDepender", "forest buffer does not provide cache", null, true);
            return false;
        }
        try {
            LIZ = new O4B(this, forestBuffer, fetchTask.LJIIL);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        O4B o4b = (O4B) obj;
        if (o4b == null) {
            return false;
        }
        O4I<O4B> o4i = fetchTask.LJFF;
        if (o4i != null) {
            o4i.LIZ(o4b);
            o4i.LIZ = true;
            O4A.LIZIZ(o4i, fetchTask.LIZLLL.LIZLLL);
        }
        this.LIZ = true;
        C39930Flm.LJI("TTNetDepender", "cache stored, " + o4b.LIZIZ(), false, 4);
        return true;
    }

    public O44(int i, java.util.Map<String, String> map, AbstractC40713FyP abstractC40713FyP) {
        this.LIZIZ = i;
        this.LIZJ = map;
        this.LIZLLL = abstractC40713FyP;
    }
}
