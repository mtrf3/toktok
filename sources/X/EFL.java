package X;

import android.content.Context;
import android.os.SystemClock;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EFL {
    public Context LIZ;
    public final java.util.Map<EFN, List<EFM>> LIZIZ = new HashMap();

    public final boolean LIZIZ(EFN type) {
        o.LJIIIZ(type, "type");
        o.LJI(((HashMap) this.LIZIZ).get(type));
        return !((Collection) r0).isEmpty();
    }

    public final EFM LIZJ(EFN type) {
        o.LJIIIZ(type, "type");
        synchronized (this.LIZIZ) {
            o.LJI(((HashMap) this.LIZIZ).get(type));
            if (!((Collection) r0).isEmpty()) {
                Object obj = ((HashMap) this.LIZIZ).get(type);
                o.LJI(obj);
                return (EFM) ((List) obj).get(0);
            }
            return null;
        }
    }

    public final void LIZLLL(EFM efm) {
        synchronized (this.LIZIZ) {
            Object obj = ((HashMap) this.LIZIZ).get(efm.type());
            o.LJI(obj);
            ((List) obj).remove(efm);
        }
    }

    public final void LIZ(EFN efn, EFM efm) {
        synchronized (this.LIZIZ) {
            Object obj = ((HashMap) this.LIZIZ).get(efn);
            o.LJI(obj);
            ((List) obj).add(efm);
        }
    }

    public final void LJ(EFM request, boolean z) {
        o.LJIIIZ(request, "request");
        FCD.LJI(EF7.LIZIZ());
        System.currentTimeMillis();
        SystemClock.currentThreadTimeMillis();
        synchronized (request) {
            Object obj = ((HashMap) this.LIZIZ).get(request.type());
            o.LJI(obj);
            if (((List) obj).contains(request)) {
                LIZLLL(request);
                C36093EEn.LIZ.getClass();
                EEA eea = C36093EEn.LJI;
                if (eea != null) {
                    eea.LIZIZ(request);
                }
                Context context = this.LIZ;
                if (context != null) {
                    request.LIZJ(context, z);
                    EEA eea2 = C36093EEn.LJI;
                    if (eea2 != null) {
                        eea2.LIZ(request);
                    }
                } else {
                    o.LJIJI("context");
                    throw null;
                }
            }
        }
        System.currentTimeMillis();
        SystemClock.currentThreadTimeMillis();
        C36839Ed1.LIZIZ(EF7.LIZIZ());
    }
}
