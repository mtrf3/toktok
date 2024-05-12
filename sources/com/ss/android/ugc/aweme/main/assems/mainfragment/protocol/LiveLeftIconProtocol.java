package com.ss.android.ugc.aweme.main.assems.mainfragment.protocol;

import X.LM4;
import X.LME;
import X.LMF;
import X.LMH;
import X.LNP;
import X.LQB;
import com.bytedance.tiktok.homepage.mainfragment.MFLeftIconPriority;
import com.ss.android.ugc.aweme.main.MainFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LiveLeftIconProtocol implements IMFLeftIconProtocol {
    public LQB LJLIL;

    @Override // X.LML
    public final void LIZ() {
        LQB lqb = this.LJLIL;
        if (lqb != null) {
            lqb.LIZLLL(LMH.DARK);
        }
    }

    @Override // X.LML
    public final void LIZJ() {
        LQB lqb = this.LJLIL;
        if (lqb != null) {
            lqb.LIZLLL(LMH.DEFAULT);
        }
    }

    @Override // X.LML
    public final LM4 LIZLLL() {
        LQB lqb = this.LJLIL;
        if (lqb != null) {
            return lqb;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.LML
    public final String LJFF() {
        return LMF.LIVE.getTag();
    }

    @Override // X.LML
    public final void e0() {
        LQB lqb = this.LJLIL;
        if (lqb != null) {
            lqb.LIZLLL(LMH.DEFAULT);
        }
    }

    @Override // X.LML
    public final MFLeftIconPriority LJ() {
        return MFLeftIconPriority.LIVE;
    }

    @Override // X.LML
    public final LME LJI() {
        return LME.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.protocol.IMFLeftIconProtocol
    public final void LLLLIILL(MainFragment mainFragment, LNP environmentConfig) {
        o.LJIIIZ(environmentConfig, "environmentConfig");
        this.LJLIL = new LQB(mainFragment, environmentConfig);
    }
}
