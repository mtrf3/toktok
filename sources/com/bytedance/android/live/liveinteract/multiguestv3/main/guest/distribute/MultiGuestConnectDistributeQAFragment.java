package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute;

import X.AbstractC030109x;
import X.AbstractC28931Bp;
import X.ActivityC45651qj;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C20910rv;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C29S;
import X.C31413CUn;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72933Sjp;
import X.C72934Sjq;
import X.C72935Sjr;
import X.C72936Sjs;
import X.C76800UCe;
import X.C78926UyI;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.EnumC72939Sjv;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import X.X1D;
import Y.ACListenerS32S0100000_12;
import Y.ARunnableS31S0200000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.DistributeStatusViewModel;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS54S0110000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MultiGuestConnectDistributeQAFragment extends LiveBaseFragment implements KPL {
    public RecyclerView LJLILLLLZI;
    public View LJLJI;
    public final C214298b3 LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C31413CUn LJLJJI = new C31413CUn();

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MultiGuestConnectDistributeQAFragment() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(DistributeStatusViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 59);
        C72934Sjq c72934Sjq = C72934Sjq.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c72934Sjq, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c72934Sjq, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJJL = c214298b3;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment
    public final boolean onBackPressed() {
        C0NB.LIZIZ("ConnectStatusDistribute_MultiGuestConnectDistributeQAFragment", "handleOnBackPressed");
        AssemViewModel assemViewModel = (AssemViewModel) this.LJLJJL.getValue();
        EnumC72939Sjv page = EnumC72939Sjv.STATUS_SETTING_PAGE;
        o.LJIIIZ(page, "page");
        assemViewModel.setState(new AqS54S0110000_12(page, false, 8));
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.j_f);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.rv_qa)");
        this.LJLILLLLZI = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.eys);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.iv_back)");
        this.LJLJI = findViewById2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("observeVM = ");
        LIZ.append(this.LJLJJL.getValue().hashCode());
        C0NB.LIZIZ("ConnectStatusDistribute_MultiGuestConnectDistributeQAFragment", X1D.LIZIZ(LIZ));
        View findViewById3 = view.findViewById(R.id.hej);
        if (findViewById3 != null) {
            C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 26), findViewById3);
        }
        View findViewById4 = view.findViewById(R.id.n3v);
        if (findViewById4 != null) {
            findViewById4.post(new ARunnableS31S0200000_12(this, findViewById4, 1));
        }
        View view2 = this.LJLJI;
        if (view2 != null) {
            C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 27), view2);
            try {
                requireActivity().getOnBackPressedDispatcher().LIZ(this, new C72933Sjp(this));
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            RecyclerView recyclerView = this.LJLILLLLZI;
            if (recyclerView != null) {
                getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                RecyclerView recyclerView2 = this.LJLILLLLZI;
                if (recyclerView2 != null) {
                    if (recyclerView2.getItemAnimator() instanceof AbstractC28931Bp) {
                        RecyclerView recyclerView3 = this.LJLILLLLZI;
                        if (recyclerView3 != null) {
                            AbstractC030109x itemAnimator = recyclerView3.getItemAnimator();
                            o.LJII(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
                            ((AbstractC28931Bp) itemAnimator).LJI = false;
                        } else {
                            o.LJIJI("rvQaList");
                            throw null;
                        }
                    }
                    RecyclerView recyclerView4 = this.LJLILLLLZI;
                    if (recyclerView4 != null) {
                        AbstractC030109x itemAnimator2 = recyclerView4.getItemAnimator();
                        if (itemAnimator2 instanceof AbstractC28931Bp) {
                            ((AbstractC28931Bp) itemAnimator2).LJI = false;
                        }
                        RecyclerView recyclerView5 = this.LJLILLLLZI;
                        if (recyclerView5 != null) {
                            recyclerView5.setAdapter(this.LJLJJI);
                            this.LJLJJI.LJLZ(C72935Sjr.class, new C72936Sjs());
                            C31413CUn c31413CUn = this.LJLJJI;
                            ArrayList arrayList = new ArrayList();
                            String string = getString(R.string.nb2);
                            o.LJIIIIZZ(string, "getString(R.string.pm_multi_liveStatus_faq_q1)");
                            String string2 = getString(R.string.naz);
                            o.LJIIIIZZ(string2, "getString(R.string.pm_multi_liveStatus_faq_a1)");
                            arrayList.add(new C72935Sjr(string, string2));
                            String string3 = getString(R.string.nb3);
                            o.LJIIIIZZ(string3, "getString(R.string.pm_multi_liveStatus_faq_q2)");
                            String string4 = getString(R.string.nb0);
                            o.LJIIIIZZ(string4, "getString(R.string.pm_multi_liveStatus_faq_a2)");
                            arrayList.add(new C72935Sjr(string3, string4));
                            String string5 = getString(R.string.nb4);
                            o.LJIIIIZZ(string5, "getString(R.string.pm_multi_liveStatus_faq_q3)");
                            String string6 = getString(R.string.nb1);
                            o.LJIIIIZZ(string6, "getString(R.string.pm_multi_liveStatus_faq_a3)");
                            arrayList.add(new C72935Sjr(string5, string6));
                            c31413CUn.LJLIL = arrayList;
                            this.LJLJJI.notifyDataSetChanged();
                            return;
                        }
                        o.LJIJI("rvQaList");
                        throw null;
                    }
                    o.LJIJI("rvQaList");
                    throw null;
                }
                o.LJIJI("rvQaList");
                throw null;
            }
            o.LJIJI("rvQaList");
            throw null;
        }
        o.LJIJI("ivBack");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LJI = C20910rv.LJI(R.layout.d4y, viewGroup, false, 12);
        try {
            ViewTreeLifecycleOwner.set(LJI, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LJI, this);
            C10A.LIZIZ(LJI, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LJI;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
