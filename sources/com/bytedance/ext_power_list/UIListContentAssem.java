package com.bytedance.ext_power_list;

import X.AbstractC72278SYg;
import X.C57939MoZ;
import X.C72808Sho;
import X.InterfaceC57784Mm4;
import X.SYL;
import X.TBR;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class UIListContentAssem<VM extends AssemListViewModel<?, ?, ?>> extends UIContentAssem {
    public abstract VM A3();

    public abstract SYL v3();

    public abstract C57939MoZ x3();

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        v3().setListConfig(x3());
        final VM A3 = A3();
        C72808Sho<InterfaceC57784Mm4> state = v3().getState();
        o.LJIIIIZZ(state, "list.state");
        A3.setListState(state);
        v3().LJLJLLL((AbstractC72278SYg) new TBR(A3) { // from class: X.7AE
            @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
    }
}
