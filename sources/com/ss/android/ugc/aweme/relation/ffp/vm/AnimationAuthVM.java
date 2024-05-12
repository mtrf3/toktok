package com.ss.android.ugc.aweme.relation.ffp.vm;

import X.ATV;
import X.C221018lt;
import X.EnumC58046MqI;
import X.P2M;
import X.P2N;
import X.P2O;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AnimationAuthVM extends AssemViewModel<ATV> {
    public final Map<EnumC58046MqI, Boolean> LJLIL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final ATV defaultState() {
        return new ATV(0);
    }

    public final void gv0() {
        C221018lt.LIZ("[ffp]_Anim", "update auth state!");
        Object obj = ((LinkedHashMap) this.LJLIL).get(EnumC58046MqI.CONTACT);
        Boolean bool = Boolean.FALSE;
        if (o.LJ(obj, bool)) {
            setState(P2M.LJLIL);
            return;
        }
        if (o.LJ(((LinkedHashMap) this.LJLIL).get(EnumC58046MqI.FACEBOOK), bool)) {
            setState(P2N.LJLIL);
        } else {
            setStateImmediate(P2O.LJLIL);
            C221018lt.LJFF("[ffp]_Anim", "auth flow end!");
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        for (EnumC58046MqI enumC58046MqI : EnumC58046MqI.values()) {
            this.LJLIL.put(enumC58046MqI, Boolean.valueOf(enumC58046MqI.isGrant()));
        }
        runOnWorkThread(new AqS170S0100000_4(this, 946));
    }
}
