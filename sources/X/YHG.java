package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YHG extends YHP {
    @Override // X.YHP
    public final void LIZ(YHN chain, YHM yhm) {
        List LJLL;
        o.LJIIIZ(chain, "chain");
        YHS yhs = YHS.LIZ;
        List<YHV> list = chain.LIZ.LIZJ;
        yhs.getClass();
        if (list == null) {
            LJLL = C61878OQg.INSTANCE;
        } else {
            LJLL = ORZ.LJLL(list);
        }
        if (!LJLL.isEmpty()) {
            YHH yhh = chain.LIZ;
            List<YHV> LLJILJILJ = ORZ.LLJILJILJ(LJLL);
            yhh.getClass();
            yhh.LIZJ = LLJILJILJ;
            chain.LIZIZ(yhm);
            return;
        }
        if (yhm == null) {
            return;
        }
        yhm.LIZ(-1, "prepareData Failed", chain);
    }
}
