package com.ss.android.ugc.tiktok.addyours.hub.cell;

import X.C16950lX;
import X.C219618jd;
import X.C221108m2;
import X.C62822Ol8;
import X.InterfaceC55235Lm3;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursHubItemCell extends AssemPowerCell<AddYoursHubItemCellAssem, C219618jd> {
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1431));

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final AddYoursHubItemCellAssem L() {
        return new AddYoursHubItemCellAssem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC55100Ljs
    public final InterfaceC55235Lm3 getParentScope() {
        return (InterfaceC55235Lm3) this.LJLJL.getValue();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        AddYoursHubItemCellAssem addYoursHubItemCellAssem = new AddYoursHubItemCellAssem();
        View LIZ = C16950lX.LIZ(parent.getContext(), R.layout.gk, parent, false, -1);
        o.LJIIIIZZ(LIZ, "getView(parent.context, …ayoutId(), parent, false)");
        this.LJLIL = LIZ;
        M(addYoursHubItemCellAssem, getContainerView(), this);
        return getContainerView();
    }
}
