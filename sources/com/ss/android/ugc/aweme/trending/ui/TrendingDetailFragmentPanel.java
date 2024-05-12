package com.ss.android.ugc.aweme.trending.ui;

import X.C10K;
import X.C184077Kh;
import X.C214378bB;
import X.C214528bQ;
import X.C36922EeM;
import X.C55313LnJ;
import X.C55320LnQ;
import X.C65352Pkq;
import X.C65777Prh;
import X.C78926UyI;
import X.FMX;
import X.InterfaceC224118qt;
import X.InterfaceC224628ri;
import X.InterfaceC51679KPz;
import X.InterfaceC55317LnN;
import X.JEZ;
import X.M89;
import X.V3N;
import X.X1D;
import Y.ACallableS13S0310000_3;
import android.util.Log;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.common.viewmodel.TrendingMixInFlowViewModel;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailOperatorWrapper;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class TrendingDetailFragmentPanel extends DetailFragmentPanel {
    public final InterfaceC224628ri LLJJJIL;
    public final C214378bB LLJJJJ;
    public boolean LLJJJJJIL;

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final boolean LLFII(Aweme aweme) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh
    public void initPanel() {
        super.initPanel();
        C55313LnJ c55313LnJ = this.LLJILLL;
        if (c55313LnJ != null) {
            c55313LnJ.LJ = false;
            c55313LnJ.LJFF = true;
            c55313LnJ.LJI = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void LJLLILLLL(List<Aweme> list) {
        List<Aweme> list2;
        TrendingDetailOperatorWrapper trendingDetailOperatorWrapper = (TrendingDetailOperatorWrapper) this.LLJJJJ.getValue();
        if (list == null || !trendingDetailOperatorWrapper.nv0()) {
            trendingDetailOperatorWrapper.LLD = Integer.MAX_VALUE;
        } else {
            int size = list.size();
            if (trendingDetailOperatorWrapper.LLF == 2) {
                List<Aweme> awemeList = trendingDetailOperatorWrapper.getAwemeList();
                trendingDetailOperatorWrapper.LLD = awemeList.size();
                for (Aweme aweme : awemeList) {
                    if (!V3N.LJI(aweme, list)) {
                        ListProtector.add(list, 0, aweme);
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("add to head and size:");
                LIZ.append(awemeList.size());
                X1D.LIZIZ(LIZ);
            } else {
                trendingDetailOperatorWrapper.LLD = list.size();
                InterfaceC51679KPz interfaceC51679KPz = trendingDetailOperatorWrapper.LL;
                if (interfaceC51679KPz != null) {
                    Object viewModel = interfaceC51679KPz.getViewModel();
                    Integer num = null;
                    if (viewModel instanceof InterfaceC224118qt) {
                        List<Aweme> awemeList2 = ((InterfaceC224118qt) viewModel).getAwemeList();
                        o.LJII(awemeList2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.feed.model.Aweme>");
                        list2 = C65777Prh.LIZIZ(awemeList2);
                        if (list2 != null) {
                            for (Aweme aweme2 : list2) {
                                if (!V3N.LJI(aweme2, list)) {
                                    list.add(aweme2);
                                }
                            }
                        }
                    } else {
                        list2 = null;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("add to tail and size:");
                    if (list2 != null) {
                        num = Integer.valueOf(list2.size());
                    }
                    LIZ2.append(num);
                    X1D.LIZIZ(LIZ2);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            TrendingMixInFlowViewModel trendingMixInFlowViewModel = (TrendingMixInFlowViewModel) JEZ.LIZ(trendingDetailOperatorWrapper.getLifecycle(), TrendingMixInFlowViewModel.class);
            int i = trendingDetailOperatorWrapper.LLD;
            trendingMixInFlowViewModel.getClass();
            trendingMixInFlowViewModel.LJLIL = i;
            trendingMixInFlowViewModel.LJLILLLLZI = list;
            StringBuilder sb = new StringBuilder("originDataSize:");
            sb.append(size);
            sb.append(":and final size is");
            sb.append(list.size());
            sb.append(' ');
        }
        LJLLJ(list, false);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final Aweme LL(List<Aweme> list) {
        int i;
        if (this.LLJJJJJIL) {
            this.LLJJJJJIL = false;
            i = LJJZZIII(list);
        } else {
            i = 0;
        }
        if (i != -1 && i < this.mAdapter.getCount()) {
            if (this.mAdapter != null && this.mViewPager.getExpectedAdapterCount() != this.mAdapter.getCount()) {
                this.mAdapter.notifyDataSetChanged();
            }
            this.mViewPager.setFixDispatchFirstSelected(true);
            this.mViewPager.LJJJ(i, false);
            Aweme aweme = (Aweme) ListProtector.get(list, i);
            LLD(aweme);
            return aweme;
        }
        if (((ArrayList) list).size() > 0) {
            this.mViewPager.setFixDispatchFirstSelected(true);
            this.mViewPager.LJJJ(0, false);
            Aweme aweme2 = (Aweme) ListProtector.get(list, 0);
            LLD(aweme2);
            return aweme2;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showLoadError mDetailInputFragment.enterCleanMode() ");
        LIZ.append(Log.getStackTraceString(exc));
        C36922EeM.LIZLLL(6, "DetailFragmentPanel", X1D.LIZIZ(LIZ));
        InterfaceC55317LnN interfaceC55317LnN = this.LLII;
        if (interfaceC55317LnN != null) {
            interfaceC55317LnN.I4();
        }
        IPageStateAbility iPageStateAbility = this.pageStateAbility;
        if (iPageStateAbility != null) {
            iPageStateAbility.A9(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC223218pR
    public final void nc(Exception exc) {
        super.nc(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendingDetailFragmentPanel(InterfaceC224628ri delegate, M89 feedParam) {
        super(feedParam);
        o.LJIIIZ(delegate, "delegate");
        o.LJIIIZ(feedParam, "feedParam");
        this.LLJJJIL = delegate;
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(this, 663);
        this.LLJJJJ = new C214378bB(C65352Pkq.LIZ(TrendingDetailOperatorWrapper.class), aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C55320LnQ.INSTANCE, null, null);
        this.LLJJJJJIL = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void mobScroll(boolean z, Aweme aweme, Aweme aweme2) {
        super.mobScroll(z, aweme, aweme2);
        M89 param = this.param;
        o.LJIIIIZZ(param, "param");
        C10K.LIZIZ(new ACallableS13S0310000_3(aweme, aweme2, param, !z, 0), FMX.LIZIZ(), null);
        this.LLJJJIL.G2(z, aweme, aweme2);
    }
}
