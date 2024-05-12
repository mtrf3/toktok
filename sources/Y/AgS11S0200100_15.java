package Y;

import X.C10I;
import X.C10K;
import X.C36922EeM;
import X.C45818HyY;
import X.V16;
import X.XRT;
import X.XVF;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

/* loaded from: classes16.dex */
public class AgS11S0200100_15 implements C10I {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS11S0200100_15 agS11S0200100_15, C10K c10k) {
        C45818HyY c45818HyY = (C45818HyY) agS11S0200100_15.l0;
        WeakReference weakReference = (WeakReference) agS11S0200100_15.l1;
        long j = agS11S0200100_15.j2;
        c45818HyY.LIZJ = false;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        XVF.LJFF(System.currentTimeMillis() - j);
        if (c10k.LJIILJJIL()) {
            c45818HyY.LIZ.jv0(1, "local_music_list_status");
            C36922EeM.LIZLLL(3, "Local Sound", "Load Local Sound Task Failed");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        C36922EeM.LIZLLL(3, "Local Sound", "Load Local Sound Task Succeed");
        c45818HyY.LIZ.jv0(0, "local_music_list_status");
        XRT xrt = new XRT();
        xrt.LIZ.put("list_hasmore", Boolean.valueOf(!c45818HyY.LIZIZ));
        xrt.LIZ.put("action_type", 1);
        xrt.LIZIZ("list_data", C45818HyY.LIZ((List) c10k.LJIIJJI()));
        c45818HyY.LIZ.jv0(xrt, "local_music_list_data");
        return null;
    }

    public static final Object then$1(AgS11S0200100_15 agS11S0200100_15, C10K c10k) {
        C45818HyY c45818HyY = (C45818HyY) agS11S0200100_15.l0;
        WeakReference weakReference = (WeakReference) agS11S0200100_15.l1;
        long j = agS11S0200100_15.j2;
        c45818HyY.LIZJ = false;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        XVF.LJFF(System.currentTimeMillis() - j);
        if (c10k.LJIILJJIL()) {
            c45818HyY.LIZ.jv0(1, "local_music_list_load_more_status");
            C36922EeM.LIZLLL(3, "Local Sound", "Load Local Sound Task Failed");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        C36922EeM.LIZLLL(3, "Local Sound", "Load Local Sound Task Succeed");
        c45818HyY.LIZ.jv0(0, "local_music_list_load_more_status");
        Collection collection = (Collection) c10k.LJIIJJI();
        List LJIL = V16.LJIL((XRT) c45818HyY.LIZ.get("local_music_list_data"));
        LJIL.addAll(collection);
        XRT xrt = new XRT();
        xrt.LIZ.put("list_hasmore", Boolean.valueOf(!c45818HyY.LIZIZ));
        xrt.LIZ.put("action_type", 2);
        xrt.LIZIZ("list_data", C45818HyY.LIZ(LJIL));
        c45818HyY.LIZ.jv0(xrt, "local_music_list_data");
        return null;
    }

    public AgS11S0200100_15(C45818HyY c45818HyY, WeakReference weakReference, long j, int i) {
        this.$t = i;
        this.l0 = c45818HyY;
        this.l1 = weakReference;
        this.j2 = j;
    }
}
