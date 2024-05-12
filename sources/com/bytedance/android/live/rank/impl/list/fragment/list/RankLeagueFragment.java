package com.bytedance.android.live.rank.impl.list.fragment.list;

import X.AbstractC030109x;
import X.AbstractC28931Bp;
import X.C15380j0;
import X.C15490jB;
import X.C15540jG;
import X.C16880lQ;
import X.C2A7;
import X.C30554Byw;
import X.C31415CUp;
import X.C31512CYi;
import X.C31522CYs;
import X.C47061t0;
import X.C48459J0d;
import X.C51029K0z;
import X.C77958Uig;
import X.C77966Uio;
import X.C77988UjA;
import X.C77999UjL;
import X.C78004UjQ;
import X.C78025Ujl;
import X.C78026Ujm;
import X.C78934UyQ;
import X.CountDownTimerC77998UjK;
import X.InterfaceC30442Bx8;
import X.InterfaceC77978Uj0;
import X.RunnableC31065CHd;
import X.ViewOnClickListenerC78013UjZ;
import Y.AObserverS81S0100000_13;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RankLeagueFragment extends GiftListFragment {
    public View LLIIIL;
    public C47061t0 LLIIIZ;
    public TextView LLIIJI;
    public TextView LLIIJLIL;
    public C2A7 LLIIL;
    public boolean LLIILII;
    public CountDownTimerC77998UjK LLIILZL;
    public final Map<Integer, View> LLIL = new LinkedHashMap();
    public final C78004UjQ LLIIZ = new C78004UjQ(this);

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.GiftListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIL).clear();
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.GiftListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment
    public final void Al(RankListV2Response.RankInfo rankInfo) {
        TextView textView;
        super.Al(rankInfo);
        if (rankInfo != null && (textView = this.LJZL) != null && rankInfo.rankStr.length() > 3) {
            textView.setTextSize(13.0f);
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment
    public final void Gl(C31415CUp c31415CUp) {
        super.Gl(c31415CUp);
        c31415CUp.LJLLLLLL(C77988UjA.class, new C77966Uio(C51029K0z.LJIILIIL(this), hashCode(), new AqS163S0100000_13(c31415CUp, 179)));
        c31415CUp.LJLLLLLL(C78025Ujl.class, new C78026Ujm(hashCode(), new AqS163S0100000_13(c31415CUp, 180)));
    }

    public final void Jl(C77999UjL c77999UjL) {
        RankRootViewModel LIZ;
        String LJIILJJIL;
        RankListV2Response.RankView rankView;
        RankListViewModel LJII;
        InterfaceC77978Uj0 interfaceC77978Uj0;
        int i = c77999UjL.LIZIZ;
        long j = c77999UjL.LIZLLL;
        RankListController rankListController = this.LJLJJLL;
        if (rankListController == null || (LIZ = rankListController.LIZ()) == null || !LIZ.LJLJI || 1 == 0) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                C30554Byw<Boolean> c30554Byw = InterfaceC30442Bx8.N2;
                Boolean LIZ2 = c30554Byw.LIZ();
                if (LIZ2 != null && LIZ2.booleanValue() && Il(i, j)) {
                    return;
                } else {
                    c30554Byw.LIZJ(Boolean.TRUE);
                }
            } else {
                C30554Byw<Boolean> c30554Byw2 = InterfaceC30442Bx8.M2;
                Boolean LIZ3 = c30554Byw2.LIZ();
                if (LIZ3 != null && LIZ3.booleanValue() && Il(i, j)) {
                    return;
                } else {
                    c30554Byw2.LIZJ(Boolean.TRUE);
                }
            }
        } else {
            C30554Byw<Boolean> c30554Byw3 = InterfaceC30442Bx8.L2;
            Boolean LIZ4 = c30554Byw3.LIZ();
            if (LIZ4 != null && LIZ4.booleanValue() && Il(i, j)) {
                return;
            } else {
                c30554Byw3.LIZJ(Boolean.TRUE);
            }
        }
        if (this.LLIILII) {
            return;
        }
        this.LLIILII = true;
        if (this.LLIIIL == null && (getView() instanceof ViewGroup)) {
            LayoutInflater layoutInflater = getLayoutInflater();
            View view = getView();
            o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
            this.LLIIIL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dcc, (ViewGroup) view, false);
        }
        View view2 = this.LLIIIL;
        if (view2 != null) {
            view2.setVisibility(0);
            RankPageController rankPageController = this.LJLJL;
            if (rankPageController != null && (interfaceC77978Uj0 = rankPageController.LJLJL) != null) {
                interfaceC77978Uj0.xh(view2, false);
            }
            C16880lQ.LJIIJ(ViewOnClickListenerC78013UjZ.LJLIL, view2);
            this.LLIIIZ = (C47061t0) view2.findViewById(R.id.f9i);
            this.LLIIJI = (TextView) view2.findViewById(R.id.mgd);
            this.LLIIJLIL = (TextView) view2.findViewById(R.id.mgc);
            this.LLIIL = (C2A7) view2.findViewById(R.id.ay_);
            C47061t0 c47061t0 = this.LLIIIZ;
            if (c47061t0 != null) {
                c47061t0.setVisibility(0);
            }
            TextView textView = this.LLIIJI;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.LLIIJLIL;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            C2A7 c2a7 = this.LLIIL;
            if (c2a7 != null) {
                c2a7.setVisibility(4);
            }
            int i2 = c77999UjL.LIZJ;
            if (i2 != 1) {
                if (i2 != 2) {
                    LJIILJJIL = "";
                } else {
                    LJIILJJIL = C15380j0.LJIILJJIL(R.string.op2);
                }
            } else {
                LJIILJJIL = C15380j0.LJIILJJIL(R.string.op5);
            }
            int i3 = c77999UjL.LIZIZ;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        TextView textView3 = this.LLIIJI;
                        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.op3);
                        boolean z = C31512CYi.LIZIZ;
                        C78934UyQ.LJJIIJZLJL(textView3, LJIILJJIL2, z);
                        C78934UyQ.LJJIIJZLJL(this.LLIIJLIL, LJIILJJIL, z);
                    }
                } else {
                    TextView textView4 = this.LLIIJI;
                    String LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.op6);
                    boolean z2 = C31512CYi.LIZIZ;
                    C78934UyQ.LJJIIJZLJL(textView4, LJIILJJIL3, z2);
                    C78934UyQ.LJJIIJZLJL(this.LLIIJLIL, LJIILJJIL, z2);
                }
            } else {
                TextView textView5 = this.LLIIJI;
                String LJIILJJIL4 = C15380j0.LJIILJJIL(R.string.opg);
                boolean z3 = C31512CYi.LIZIZ;
                C78934UyQ.LJJIIJZLJL(textView5, LJIILJJIL4, z3);
                C78934UyQ.LJJIIJZLJL(this.LLIIJLIL, C15380j0.LJIILJJIL(R.string.opf), z3);
            }
            C47061t0 c47061t02 = this.LLIIIZ;
            if (c47061t02 != null) {
                C15540jG c15540jG = new C15540jG();
                c15540jG.LJFF = true;
                c15540jG.LJI = 1;
                c15540jG.LIZ = c47061t02;
                c15540jG.LIZIZ = "tiktok_live_revenue_demand_1";
                c15540jG.LIZJ = "ttlive_icon_rank_league_promotion.webp";
                c15540jG.LJ = new C77958Uig(this);
                C15490jB.LJI(c15540jG);
            }
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
            RankListController rankListController2 = this.LJLJJLL;
            if (rankListController2 != null && (LJII = rankListController2.LJII()) != null) {
                rankView = LJII.LJLILLLLZI;
            } else {
                rankView = null;
            }
            C31522CYs.LJII(this.LJLJJI, rankView, LJIILIIL, true);
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.GiftListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment
    public final void wl(boolean z) {
        RankListController rankListController;
        RankListViewModel LJII;
        MutableLiveData<C77999UjL> mutableLiveData;
        C77999UjL value;
        super.wl(z);
        if (z && (rankListController = this.LJLJJLL) != null && (LJII = rankListController.LJII()) != null && (mutableLiveData = LJII.LJLJJLL) != null && (value = mutableLiveData.getValue()) != null) {
            Jl(value);
        }
    }

    public final boolean Il(int i, long j) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return true;
                }
                C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.K2;
                Long LIZJ = c48459J0d.LIZJ();
                if (LIZJ == null || j != LIZJ.longValue()) {
                    c48459J0d.LIZ(Long.valueOf(j));
                    return false;
                }
            } else {
                C48459J0d<Long> c48459J0d2 = InterfaceC30442Bx8.J2;
                Long LIZJ2 = c48459J0d2.LIZJ();
                if (LIZJ2 == null || j != LIZJ2.longValue()) {
                    c48459J0d2.LIZ(Long.valueOf(j));
                    return false;
                }
            }
        } else {
            C48459J0d<Long> c48459J0d3 = InterfaceC30442Bx8.I2;
            Long LIZJ3 = c48459J0d3.LIZJ();
            if (LIZJ3 == null || j != LIZJ3.longValue()) {
                c48459J0d3.LIZ(Long.valueOf(j));
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.GiftListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC030109x abstractC030109x;
        RankListViewModel LJII;
        MutableLiveData<C77999UjL> mutableLiveData;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RankListController rankListController = this.LJLJJLL;
        if (rankListController != null && (LJII = rankListController.LJII()) != null && (mutableLiveData = LJII.LJLJJLL) != null) {
            mutableLiveData.observe(this, new AObserverS81S0100000_13(this, 45));
        }
        RunnableC31065CHd runnableC31065CHd = this.LJLLLLLL;
        if (runnableC31065CHd != null) {
            abstractC030109x = runnableC31065CHd.getItemAnimator();
        } else {
            abstractC030109x = null;
        }
        o.LJII(abstractC030109x, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((AbstractC28931Bp) abstractC030109x).LJI = false;
    }
}
