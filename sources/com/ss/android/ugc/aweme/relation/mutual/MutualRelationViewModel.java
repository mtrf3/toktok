package com.ss.android.ugc.aweme.relation.mutual;

import X.C221018lt;
import X.C3C1;
import X.C57778Mly;
import X.C61878OQg;
import X.C72912tb;
import X.C94113mh;
import X.C94143mk;
import X.C94153ml;
import X.C94163mm;
import X.C94183mo;
import X.EnumC94093mf;
import X.EnumC94173mn;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class MutualRelationViewModel extends AssemViewModel<C94113mh> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C94113mh defaultState() {
        EnumC94173mn enumC94173mn = EnumC94173mn.UNINITIALIZED;
        return new C94113mh(EnumC94093mf.UNINITIALIZED, C61878OQg.INSTANCE, new C57778Mly(0), enumC94173mn, new ArrayList(), new ArrayList(), null);
    }

    public final void gv0() {
        if (getState().LJLJJI == EnumC94173mn.LOADING || getState().LJLJJI == EnumC94173mn.UP_LOADING) {
            if (jv0() && hv0()) {
                setState(C94143mk.LJLIL);
                return;
            }
            if (jv0() && iv0()) {
                setState(C94153ml.LJLIL);
                return;
            }
            if (kv0() && hv0()) {
                setState(C94163mm.LJLIL);
            } else {
                if (!kv0() || !iv0()) {
                    return;
                }
                C221018lt.LIZ("MutualRelationViewModel", "[data_ready]");
                setState(C94183mo.LJLIL);
            }
        }
    }

    public final boolean hv0() {
        C57778Mly c57778Mly = getState().LJLJI;
        if (((c57778Mly.LIZJ instanceof C72912tb) && c57778Mly.LIZJ()) || (getState().LJLJI.LIZ instanceof C3C1)) {
            return true;
        }
        return false;
    }

    public final boolean iv0() {
        C57778Mly c57778Mly = getState().LJLJI;
        if ((c57778Mly.LIZJ instanceof C72912tb) && !c57778Mly.LIZJ()) {
            return true;
        }
        return false;
    }

    public final boolean jv0() {
        if (getState().LJLIL == EnumC94093mf.EMPTY || getState().LJLIL == EnumC94093mf.FAIL) {
            return true;
        }
        return false;
    }

    public final boolean kv0() {
        if (getState().LJLIL == EnumC94093mf.NOT_EMPTY) {
            return true;
        }
        return false;
    }
}
