package com.ss.android.ugc.aweme.detail.prefab.videos;

import X.C185927Rk;
import X.C214348b8;
import X.C5H3;
import X.C65352Pkq;
import X.C7UJ;
import X.EnumC221088m0;
import X.InterfaceC55235Lm3;
import X.InterfaceC57784Mm4;
import Y.IDCListenerS253S0100000_3;
import android.view.View;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.detail.arch.videos.CollisionResolver;
import com.ss.android.ugc.aweme.detail.prefab.videos.DetailVideoCellAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class DetailVideoCell<ASSEM extends DetailVideoCellAssem, T extends C185927Rk> extends AssemPowerCell<ASSEM, T> {
    public final C5H3 LJLJL = C214348b8.LIZJ(this, C65352Pkq.LIZ(CollisionResolver.class), C7UJ.INSTANCE, EnumC221088m0.SYNCHRONIZED);

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC55100Ljs
    public final InterfaceC55235Lm3 getParentScope() {
        return null;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC57784Mm4 t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.addOnLayoutChangeListener(new IDCListenerS253S0100000_3(this, 0));
    }
}
