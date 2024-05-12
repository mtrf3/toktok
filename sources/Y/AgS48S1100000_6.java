package Y;

import X.C10I;
import X.C10K;
import X.C36776Ec0;
import X.C36989EfR;
import X.C36992EfU;
import X.C36994EfW;
import X.C38113ExZ;
import X.C3AV;
import X.C61878OQg;
import X.C76800UCe;
import X.C77876UhM;
import X.F7O;
import X.InterfaceC65784Pro;
import X.TCM;
import com.bytedance.keva.Keva;
import com.google.gson.internal.h;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class AgS48S1100000_6 implements C10I {
    public final int $t;
    public Object l1;
    public String s0;

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

    public static final Object then$0(AgS48S1100000_6 agS48S1100000_6, C10K c10k) {
        ((F7O) agS48S1100000_6.l1).LIZ(agS48S1100000_6.s0, "retry");
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS48S1100000_6 agS48S1100000_6, C10K c10k) {
        C36992EfU c36992EfU = C36992EfU.LIZ;
        Object LJIIJJI = c10k.LJIIJJI();
        o.LJIIIIZZ(LJIIJJI, "it.result");
        String str = (String) LJIIJJI;
        c36992EfU.getClass();
        Keva repo = Keva.getRepo("KEY_PREFETCH_CACHE");
        C36989EfR c36989EfR = new C36989EfR();
        c36989EfR.LJIIIIZZ = 32;
        c36989EfR.LJII = false;
        c36989EfR.LIZ = new C36776Ec0(repo);
        c36989EfR.LIZLLL = new C36994EfW(str);
        c36989EfR.LJI = new C77876UhM();
        c36989EfR.LJFF = new h();
        C61878OQg urlAdapterList = C61878OQg.INSTANCE;
        o.LJIIJ(urlAdapterList, "urlAdapterList");
        c36989EfR.LJ = urlAdapterList;
        c36989EfR.LIZJ = new TCM();
        ExecutorService workerExecutor = C36992EfU.LIZIZ;
        o.LJIIIIZZ(workerExecutor, "workerExecutor");
        c36989EfR.LIZIZ = workerExecutor;
        C3AV predicate = C3AV.LJLIL;
        o.LJIIJ(predicate, "predicate");
        Map<String, InterfaceC65784Pro<Boolean>> map = c36989EfR.LJIIIZ;
        if (map == null) {
            c36989EfR.LJIIIZ = new LinkedHashMap();
        } else {
            map.put("login", predicate);
        }
        C36992EfU.LJFF = c36989EfR.LIZ();
        if (!ujb.o.LJJJJJL(str)) {
            C36992EfU.LIZLLL = true;
        }
        C36992EfU.LIZIZ((C38113ExZ) agS48S1100000_6.l1, agS48S1100000_6.s0);
        return null;
    }

    public AgS48S1100000_6(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
