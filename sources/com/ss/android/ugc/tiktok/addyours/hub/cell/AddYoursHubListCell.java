package com.ss.android.ugc.tiktok.addyours.hub.cell;

import X.C16950lX;
import X.C214298b3;
import X.C219988kE;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C85520XhM;
import X.C85521XhN;
import X.C85522XhO;
import X.C85523XhP;
import X.C85524XhQ;
import X.C85525XhR;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.KOZ;
import X.YE1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubListAssem;
import com.ss.android.ugc.tiktok.addyours.hub.viewmodel.AddYoursHubTabViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AddYoursHubListCell extends AssemPowerCell<AddYoursHubListAssem, C219988kE> implements KOZ {
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 690));
    public final C214298b3 LJLJLJ;

    @Override // X.KOZ
    public final void k2() {
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final AddYoursHubListAssem L() {
        return new AddYoursHubListAssem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC55100Ljs
    public final InterfaceC55235Lm3 getParentScope() {
        return (InterfaceC55235Lm3) this.LJLJL.getValue();
    }

    public AddYoursHubListCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AddYoursHubTabViewModel.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 696);
        C85523XhP c85523XhP = C85523XhP.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85521XhN.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 697), new AqS165S0100000_15((InterfaceC93923mO) this, 698), C85525XhR.INSTANCE, c85523XhP, new AqS165S0100000_15((InterfaceC93923mO) this, 699), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85522XhO.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 700), new AqS165S0100000_15((InterfaceC93923mO) this, 691), C85524XhQ.INSTANCE, c85523XhP, new AqS165S0100000_15((InterfaceC93923mO) this, 692), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85520XhM.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 693), new AqS165S0100000_15((InterfaceC93923mO) this, 694), new AqS165S0100000_15((InterfaceC93923mO) this, 695), c85523XhP, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJLJ = c214298b3;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        AddYoursHubListAssem addYoursHubListAssem = new AddYoursHubListAssem();
        View LIZ = C16950lX.LIZ(parent.getContext(), R.layout.gj, parent, false, -1);
        o.LJIIIIZZ(LIZ, "getView(parent.context, …ayoutId(), parent, false)");
        this.LJLIL = LIZ;
        M(addYoursHubListAssem, getContainerView(), this);
        return getContainerView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.KOZ
    public final void onPageSelected(int i) {
        Integer valueOf;
        AssemViewModel assemViewModel = (AssemViewModel) this.LJLJLJ.getValue();
        C219988kE c219988kE = (C219988kE) getItem();
        if (c219988kE != null && (valueOf = Integer.valueOf(c219988kE.LJLIL)) != null) {
            valueOf.intValue();
            assemViewModel.setState(new AqS169S0100000_3(valueOf, 856));
        }
    }
}
