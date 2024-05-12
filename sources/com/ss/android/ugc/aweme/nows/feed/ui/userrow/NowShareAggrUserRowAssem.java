package com.ss.android.ugc.aweme.nows.feed.ui.userrow;

import X.AbstractC193947jK;
import X.C194267jq;
import X.C194277jr;
import X.C194287js;
import X.C194297jt;
import X.C195627m2;
import X.C196367nE;
import X.C213688a4;
import X.C214348b8;
import X.C56412MCa;
import X.C61845OOz;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.AggregatedViewModel;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowOtherCollectionListViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowShareAggrUserRowAssem extends AbsNowShareUserRowAssem<C195627m2, NowShareAggrUserRowAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFII;
    public final InterfaceC115514g7 LLFF;
    public final InterfaceC115514g7 LLFFF;

    static {
        TBT tbt = new TBT(NowShareAggrUserRowAssem.class, "aggregatedViewModel", "getAggregatedViewModel()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/AggregatedViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFII = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(NowShareAggrUserRowAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowOtherCollectionListViewModel;", 0, c65351Pkp)};
    }

    public NowShareAggrUserRowAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(AggregatedViewModel.class);
        this.LLFF = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 652), null, C194287js.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(NowOtherCollectionListViewModel.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 653), null, C194297jt.INSTANCE, null, null);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowShareUserRowAssem
    public final AbstractC193947jK a4() {
        return (AbstractC193947jK) C8YN.LJIJI((AssemViewModel) this.LLFF.LIZ(this, LLFII[0]), C194277jr.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowShareUserRowAssem
    public final InterfaceC194547kI b4() {
        return (InterfaceC194547kI) C8YN.LJIJI((AssemViewModel) this.LLFFF.LIZ(this, LLFII[1]), new AqS169S0100000_3(this, 337));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(Object obj) {
        C195627m2 item = (C195627m2) obj;
        o.LJIIIZ(item, "item");
        C8YN.LJIJI((AssemViewModel) this.LLFF.LIZ(this, LLFII[0]), new AqS169S0100000_3(this, 1028));
        C196367nE c196367nE = C196367nE.LIZ;
        Aweme aweme = item.LJLIL;
        c196367nE.getClass();
        if (C196367nE.LIZ(aweme)) {
            Z3(item.LIZ());
        } else {
            c4();
        }
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowShareUserRowAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        AggregatedViewModel aggregatedViewModel = (AggregatedViewModel) this.LLFF.LIZ(this, LLFII[0]);
        C56412MCa LIZLLL = C213688a4.LIZLLL();
        aggregatedViewModel.getClass();
        AssemViewModel.selectSubscribe$default(aggregatedViewModel, C194267jq.LJLIL, LIZLLL, null, null, new AqS134S0200000_3((ReusedUIAssem) this, (ReusedUIAssem<Object>) aggregatedViewModel, (AggregatedViewModel) 8), 12, null);
    }
}
