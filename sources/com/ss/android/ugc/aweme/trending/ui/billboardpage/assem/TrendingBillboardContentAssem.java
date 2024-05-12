package com.ss.android.ugc.aweme.trending.ui.billboardpage.assem;

import X.AbstractC72278SYg;
import X.C214298b3;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C78926UyI;
import X.C7PJ;
import X.C7PK;
import X.C9BE;
import X.InterfaceC57784Mm4;
import X.SYL;
import X.TBR;
import X.TBT;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.trending.ui.billboardpage.list.TrendingIndependentCell;
import com.ss.android.ugc.aweme.trending.ui.billboardpage.viewmodel.TrendingBillboardViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TrendingBillboardContentAssem extends DynamicAssem {
    public SYL LJLJLLL;
    public final C55749LuL LJLL;
    public final C214298b3 LJLLI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.ctp;
    }

    public TrendingBillboardContentAssem() {
        new LinkedHashMap();
        this.LJLL = new C55749LuL(C47704Ins.LIZJ(this, C7PJ.class, null), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TrendingBillboardViewModel.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1124), C7PK.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        assembleChildren();
        View findViewById = view.findViewById(R.id.lkq);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.trending_list)");
        SYL syl = (SYL) findViewById;
        this.LJLJLLL = syl;
        syl.LLLF.LJZL(TrendingIndependentCell.class);
        SYL syl2 = this.LJLJLLL;
        if (syl2 != null) {
            getContext();
            syl2.setLayoutManager(new LinearLayoutManager(1, false));
            SYL syl3 = this.LJLJLLL;
            if (syl3 != null) {
                syl3.setLifecycleOwner(this);
                C57939MoZ c57939MoZ = new C57939MoZ();
                c57939MoZ.LIZIZ = true;
                c57939MoZ.LIZJ = TrendingBillboardFooter.class;
                SYL syl4 = this.LJLJLLL;
                if (syl4 != null) {
                    syl4.setListConfig(c57939MoZ);
                    AssemListViewModel assemListViewModel = (AssemListViewModel) this.LJLLI.getValue();
                    C72808Sho<InterfaceC57784Mm4> state = syl4.getState();
                    o.LJIIIIZZ(state, "state");
                    assemListViewModel.setListState(state);
                    SYL syl5 = this.LJLJLLL;
                    if (syl5 != null) {
                        final TrendingBillboardViewModel trendingBillboardViewModel = (TrendingBillboardViewModel) this.LJLLI.getValue();
                        syl5.LJLJLLL((AbstractC72278SYg) new TBR(trendingBillboardViewModel) { // from class: X.7PI
                            @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
                            public final Object get() {
                                return ((AssemListViewModel) this.receiver).getConfig();
                            }
                        }.get());
                        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLLI.getValue(), new TBT() { // from class: X.7PH
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                C118114kJ c118114kJ = (C118114kJ) obj;
                                c118114kJ.getClass();
                                return C208708Ha.LIZLLL(c118114kJ);
                            }
                        }, null, null, null, new AqS169S0100000_3(this, 510), 14, null);
                        return;
                    }
                    o.LJIJI("powerList");
                    throw null;
                }
                o.LJIJI("powerList");
                throw null;
            }
            o.LJIJI("powerList");
            throw null;
        }
        o.LJIJI("powerList");
        throw null;
    }
}
