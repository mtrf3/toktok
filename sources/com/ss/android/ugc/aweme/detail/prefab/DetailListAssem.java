package com.ss.android.ugc.aweme.detail.prefab;

import X.C212428Vi;
import X.C221108m2;
import X.C40443Fu3;
import X.C55230Lly;
import X.C62822Ol8;
import X.C8YN;
import X.TBT;
import X.X1D;
import Y.IDrS43S0100000_3;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.prefab.ListAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class DetailListAssem extends ListAssem {
    public boolean LJLLJ;
    public final C62822Ol8 LJLLL;

    public DetailListAssem() {
        new LinkedHashMap();
        this.LJLLJ = true;
        this.LJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 183));
    }

    public final void R3() {
        AssemListViewModel<?, ?, ?> P3 = P3();
        o.LJII(P3, "null cannot be cast to non-null type com.bytedance.assem.arch.viewModel.AssemViewModel<com.bytedance.ext_power_list.IAssemListVMState<*, *>>");
        AssemViewModel.asyncSubscribe$default(P3, new TBT() { // from class: X.7SX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((InterfaceC2064888m) obj).getRefreshState();
            }
        }, null, new AqS169S0100000_3(this, 907), null, null, 26, null);
        C8YN.LJII(this, P3, new TBT() { // from class: X.7SZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((InterfaceC2064788l) obj).getListState();
            }
        }, null, new AqS185S0100000_3(this, 213), 6);
        AssemListViewModel<?, ?, ?> P32 = P3();
        o.LJII(P32, "null cannot be cast to non-null type com.bytedance.assem.arch.viewModel.AssemViewModel<com.bytedance.ext_power_list.IAssemListVMState<*, *>>");
        AssemViewModel.asyncSubscribe$default(P32, new TBT() { // from class: X.7SV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((InterfaceC2064888m) obj).getRefreshState();
            }
        }, null, new AqS169S0100000_3(this, 105), new AqS153S0100000_3(this, 184), new AqS169S0100000_3(this, 106), 2, null);
    }

    public final void U3() {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            M3().LJIIJJI(new IDrS43S0100000_3(C55230Lly.LIZJ(LIZLLL, null), 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        String str = (String) this.LJLLL.getValue();
        if (str != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("_detail_scroll_fps");
            C40443Fu3.LIZ(X1D.LIZIZ(LIZ)).LJIIIIZZ(M3());
        }
    }
}
