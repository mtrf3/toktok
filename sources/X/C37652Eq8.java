package X;

import Y.ARunnableS25S0200000_6;
import com.bytedance.pitaya.api.IPitayaCore;
import com.ss.android.ugc.aweme.legoImp.task.PitayaDlpTask;

/* renamed from: X.Eq8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37652Eq8 implements InterfaceC15270ip {
    public final /* synthetic */ PitayaDlpTask LIZ;

    public C37652Eq8(PitayaDlpTask pitayaDlpTask) {
        this.LIZ = pitayaDlpTask;
    }

    @Override // X.InterfaceC15270ip
    public final C15290ir LIZ(C15290ir c15290ir) {
        C38493F8v c38493F8v;
        IPitayaCore iPitayaCore;
        if (c15290ir != null) {
            if (r6.LJLILLLLZI.nextInt(10000) <= 10000 * this.LIZ.LJLIL && (c38493F8v = this.LIZ.LJLJI) != null && (iPitayaCore = c38493F8v.LIZJ) != null && iPitayaCore.isReady()) {
                HandlerThreadC65936PuG.LIZ();
                HandlerThreadC65936PuG.LJLILLLLZI.post(new ARunnableS25S0200000_6(c15290ir, c38493F8v, 13));
            }
        }
        return c15290ir;
    }
}
