package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem;

import X.C221108m2;
import X.C2K0;
import X.C2L4;
import X.C33Q;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C72949Sk5;
import X.C72957SkD;
import X.C72968SkO;
import X.C76965UIn;
import X.C78404Ups;
import X.EV6;
import X.InterfaceC55102Lju;
import X.X1D;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope.LinkMicScope;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;

/* loaded from: classes13.dex */
public final class DistributeStatusViewModel extends AssemViewModel implements IDistributeStateAbility, InterfaceC55102Lju, C2L4 {
    public final String LJLIL;
    public final EV6 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 2007555203) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C72949Sk5(0);
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(LinkMicScope.class);
    }

    public DistributeStatusViewModel() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DistributeStatusViewModel");
        LIZ.append(hashCode());
        this.LJLIL = X1D.LIZIZ(LIZ);
        this.LJLILLLLZI = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C72968SkO.class));
        this.LJLJI = C221108m2.LIZIZ(C72957SkD.LJLIL);
    }
}
