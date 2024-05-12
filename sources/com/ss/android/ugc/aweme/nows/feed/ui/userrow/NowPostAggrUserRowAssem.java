package com.ss.android.ugc.aweme.nows.feed.ui.userrow;

import X.AbstractC193947jK;
import X.C194267jq;
import X.C194377k1;
import X.C194407k4;
import X.C194417k5;
import X.C194427k6;
import X.C194437k7;
import X.C195627m2;
import X.C214348b8;
import X.C56412MCa;
import X.C61845OOz;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7MY;
import X.C8VR;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.AggregatedViewModel;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowOtherCollectionListViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowPostAggrUserRowAssem extends AbsNowPostUserRowAssem<C195627m2, NowPostAggrUserRowAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFZ;
    public final InterfaceC115514g7 LLFFF;
    public final InterfaceC115514g7 LLFII;

    static {
        TBT tbt = new TBT(NowPostAggrUserRowAssem.class, "aggregatedViewModel", "getAggregatedViewModel()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/AggregatedViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(NowPostAggrUserRowAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowOtherCollectionListViewModel;", 0, c65351Pkp)};
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowPostUserRowAssem
    public final boolean l4() {
        return false;
    }

    public NowPostAggrUserRowAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(AggregatedViewModel.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 649), null, C194417k5.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(NowOtherCollectionListViewModel.class);
        this.LLFII = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 650), null, C194427k6.INSTANCE, null, null);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowPostUserRowAssem
    public final AbstractC193947jK b4() {
        return (AbstractC193947jK) C8YN.LJIJI((AssemViewModel) this.LLFFF.LIZ(this, LLFZ[0]), C194407k4.LJLIL);
    }

    public final NowOtherCollectionListViewModel p4() {
        return (NowOtherCollectionListViewModel) this.LLFII.LIZ(this, LLFZ[1]);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowPostUserRowAssem
    public final InterfaceC194547kI c4() {
        return (InterfaceC194547kI) C8YN.LJIJI(p4(), new AqS169S0100000_3(this, 336));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(Object obj) {
        C195627m2 item = (C195627m2) obj;
        o.LJIIIZ(item, "item");
        Z3(item.LIZ());
        C8YN.LJIJI((AssemViewModel) this.LLFFF.LIZ(this, LLFZ[0]), new AqS169S0100000_3(this, 1027));
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowPostUserRowAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8VR.LIZ(this, new AqS134S0200000_3(this, view, 112));
        AggregatedViewModel aggregatedViewModel = (AggregatedViewModel) this.LLFFF.LIZ(this, LLFZ[0]);
        C56412MCa c56412MCa = new C56412MCa();
        c56412MCa.LIZ = true;
        aggregatedViewModel.getClass();
        AssemViewModel.selectSubscribe$default(aggregatedViewModel, C194267jq.LJLIL, c56412MCa, null, null, new AqS134S0200000_3((ReusedUIAssem) this, (ReusedUIAssem<Object>) aggregatedViewModel, (AggregatedViewModel) 8), 12, null);
        C8YN.LJIIJ(this, p4(), new TBT() { // from class: X.7k3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C194567kK) obj).LJLJJI);
            }
        }, new TBT() { // from class: X.7k2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C194567kK c194567kK = (C194567kK) obj;
                c194567kK.getClass();
                return C208708Ha.LIZ(c194567kK);
            }
        }, null, C194377k1.LJLIL, 12);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowPostUserRowAssem, X.InterfaceC194257jp
    public final void LLIIJLIL(AbstractC193947jK cellState, C194437k7 nowPostCellState) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        o.LJIIIZ(cellState, "cellState");
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        super.LLIIJLIL(cellState, nowPostCellState);
        if (getContainerView().getVisibility() == 0) {
            int LIZIZ = C7MY.LIZIZ(8);
            ViewGroup.LayoutParams layoutParams = getContainerView().getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams2.topMargin = LIZIZ;
                getContainerView().setLayoutParams(marginLayoutParams2);
            }
            NowOtherCollectionListViewModel p4 = p4();
            p4.getClass();
            p4.setState(new AqS8S0010000_3(true, 4));
            return;
        }
        int LIZIZ2 = C7MY.LIZIZ(0);
        ViewGroup.LayoutParams layoutParams2 = getContainerView().getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.topMargin = LIZIZ2;
            getContainerView().setLayoutParams(marginLayoutParams);
        }
        NowOtherCollectionListViewModel p42 = p4();
        p42.getClass();
        p42.setState(new AqS8S0010000_3(false, 4));
    }
}
