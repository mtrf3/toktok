package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;

/* loaded from: classes9.dex */
public final class IYQ extends IYO {
    public boolean LJLJJLL;
    public int LJLJLJ;
    public long LJLJLLL;
    public String LJLL;
    public IY3 LJLLI;
    public String LJLLJ;
    public String LJLJL = "";
    public int LJLLILLLL = 1;

    public static IYQ LIZ(IYO iyo) {
        if (iyo instanceof IYO) {
            IYQ iyq = new IYQ();
            iyq.LJLIL = iyo.LJLIL;
            iyq.LJLJI = iyo.LJLJI;
            iyq.LJLILLLLZI = iyo.LJLILLLLZI;
            iyq.LJLJJI = iyo.LJLJJI;
            iyq.LJLJJL = iyo.LJLJJL;
            IYN iyn = iyo.LJLIL;
            if (iyn instanceof SimBitRate) {
                SimBitRate simBitRate = (SimBitRate) iyn;
                if (simBitRate.getPlayAddr() != null) {
                    iyq.LJLLJ = simBitRate.getPlayAddr().getaK();
                }
            }
            if (iyo instanceof IYQ) {
                IYQ iyq2 = (IYQ) iyo;
                iyq.LJLJLLL = iyq2.LJLJLLL;
                iyq.LJLL = iyq2.LJLL;
                iyq.LJLJL = iyq2.LJLJL;
                return iyq;
            }
            return iyq;
        }
        return null;
    }
}
