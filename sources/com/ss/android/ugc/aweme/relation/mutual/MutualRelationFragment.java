package com.ss.android.ugc.aweme.relation.mutual;

import X.AA9;
import X.AbstractC57781Mm1;
import X.AbstractC58014Mpm;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C221018lt;
import X.C221108m2;
import X.C25770A9m;
import X.C25771A9n;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C3GT;
import X.C56412MCa;
import X.C57434MgQ;
import X.C57858MnG;
import X.C57859MnH;
import X.C57866MnO;
import X.C57867MnP;
import X.C57884Mng;
import X.C57886Mni;
import X.C57930MoQ;
import X.C57934MoU;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78613UtF;
import X.C78926UyI;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C94203mq;
import X.C94223ms;
import X.C94253mv;
import X.C94293mz;
import X.C9BD;
import X.C9BE;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC57910Mo6;
import X.InterfaceC65350Pko;
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
import X.SIT;
import X.SYL;
import X.TBT;
import X.TBW;
import X.XKX;
import Y.AObserverS69S0100000_1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationFragment;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationViewModel;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MutualRelationFragment extends BaseFragment implements KPL {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public AbstractC58014Mpm LJLJJI;
    public boolean LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MutualRelationFragment() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MutualRelationViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 702);
        C94223ms c94223ms = C94223ms.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c94223ms, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c94223ms, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 701));
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 700));
        this.LJLJJL = true;
    }

    public final C94253mv vl() {
        return (C94253mv) this.LJLILLLLZI.getValue();
    }

    public final MutualRelationViewModel wl() {
        return (MutualRelationViewModel) this.LJLIL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LJLJJL) {
            this.LJLJJL = false;
            C221018lt.LIZ("MutualRelationFragment", "[come into refresh]");
            xl();
        }
    }

    public final void xl() {
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            arrayList2 = arguments.getStringArrayList("mutual_relation_user_list");
            arrayList = arguments.getStringArrayList("mutual_relation_sec_user_list");
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        wl().setState(C94203mq.LJLIL);
        if (arrayList2 != null && arrayList != null) {
            MutualRelationViewModel wl = wl();
            wl.getClass();
            wl.setState(new AqS132S0200000_1(arrayList2, arrayList, (ArrayList<String>) 63));
            XKX.LIZLLL(wl.getAssemVMScope(), C78613UtF.LIZJ, null, new C3GT(wl, arrayList2, arrayList, null), 2);
        }
        AbstractC58014Mpm abstractC58014Mpm = this.LJLJJI;
        if (abstractC58014Mpm != null) {
            ((C57934MoU) abstractC58014Mpm).LJLJLJ(false);
        } else {
            o.LJIJI("mafListChunk");
            throw null;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object LIZJ;
        LifecycleOwner LIZIZ;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((SYL) _$_findCachedViewById(R.id.i04)).LJLJJL((SIT) this.LJLJI.getValue());
        ((SYL) _$_findCachedViewById(R.id.i04)).LJLJJL(vl());
        C57858MnG c57858MnG = new C57858MnG(null, this, 1);
        c57858MnG.LIZ(C57884Mng.LJLIL);
        c57858MnG.LIZJ(new AqS167S0100000_1(this, 294));
        c57858MnG.LIZLLL(AA9.LJLIL);
        c57858MnG.LIZIZ(C57886Mni.LJLIL);
        IRelationUserCardInternalService.LIZ.getClass();
        IRelationUserCardInternalService LIZ = C57930MoQ.LIZ();
        C57867MnP c57867MnP = c57858MnG.LIZLLL;
        if (c57867MnP.LIZLLL == -1) {
            int i = c57858MnG.LJFF.LIZJ - 10;
            if (i < 5) {
                i = 5;
            }
            c57867MnP.LIZLLL = i;
        }
        C65776Prg LIZ2 = C65352Pkq.LIZ(AbstractC58014Mpm.class);
        if (!o.LJ(LIZ2, C65352Pkq.LIZ(C25771A9n.class)) && !o.LJ(LIZ2, C65352Pkq.LIZ(C25770A9m.class)) && (o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC58014Mpm.class)) || o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC57781Mm1.class)))) {
            C57866MnO c57866MnO = c57858MnG.LJFF;
            if (c57866MnO.LJIILJJIL == null) {
                c57866MnO.LJIILJJIL = Boolean.TRUE;
            }
        }
        C57859MnH c57859MnH = new C57859MnH(c57858MnG.LIZ, c57858MnG.LIZIZ, c57858MnG.LIZJ, c57858MnG.LIZLLL, c57858MnG.LJ, c57858MnG.LJFF, null);
        C65776Prg LIZ3 = C65352Pkq.LIZ(AbstractC58014Mpm.class);
        if (o.LJ(LIZ3, C65352Pkq.LIZ(C25771A9n.class))) {
            LIZJ = C94293mz.LIZ(LIZ, c57859MnH, 2).getLayout();
        } else if (o.LJ(LIZ3, C65352Pkq.LIZ(C25770A9m.class))) {
            LIZJ = LIZ.LIZIZ(c57859MnH, 0).getLayout();
        } else if (o.LJ(LIZ3, C65352Pkq.LIZ(AbstractC58014Mpm.class))) {
            LIZJ = LIZ.LIZ(c57859MnH);
        } else if (o.LJ(LIZ3, C65352Pkq.LIZ(AbstractC57781Mm1.class))) {
            LIZJ = LIZ.LIZJ(c57859MnH);
        } else {
            "type is error!".toString();
            throw new IllegalStateException("type is error!");
        }
        if (LIZJ != null) {
            AbstractC58014Mpm abstractC58014Mpm = (AbstractC58014Mpm) LIZJ;
            this.LJLJJI = abstractC58014Mpm;
            ((C57934MoU) abstractC58014Mpm).LJIILL(null);
            AbstractC58014Mpm abstractC58014Mpm2 = this.LJLJJI;
            if (abstractC58014Mpm2 != null) {
                ((C57934MoU) abstractC58014Mpm2).W7(new InterfaceC57910Mo6() { // from class: X.3my
                    @Override // X.InterfaceC57910Mo6
                    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
                    }

                    @Override // X.InterfaceC57910Mo6
                    public final void ww(C57778Mly state) {
                        o.LJIIIZ(state, "state");
                        MutualRelationViewModel wl = MutualRelationFragment.this.wl();
                        wl.getClass();
                        wl.setState(new AqS167S0100000_1(state, 295));
                    }

                    @Override // X.InterfaceC57910Mo6
                    public final void LJLZ(int i2, RecyclerView recyclerView) {
                        o.LJIIIZ(recyclerView, "recyclerView");
                    }
                });
                SYL syl = (SYL) _$_findCachedViewById(R.id.i04);
                AbstractC58014Mpm abstractC58014Mpm3 = this.LJLJJI;
                if (abstractC58014Mpm3 != null) {
                    syl.LLLF.LLD(abstractC58014Mpm3);
                    C8YN.LJII(this, wl(), new TBT() { // from class: X.3mt
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C94113mh) obj).LJLJI;
                        }
                    }, C213688a4.LJ(), new AqS183S0100000_1(this, 81), 4);
                    C8YN.LJII(this, wl(), new TBT() { // from class: X.3mW
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C94113mh) obj).LJLIL;
                        }
                    }, C213688a4.LJ(), new AqS183S0100000_1(this, 82), 4);
                    C8YN.LJII(this, wl(), new TBT() { // from class: X.3mi
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C94113mh) obj).LJLJJI;
                        }
                    }, null, new AqS183S0100000_1(this, 83), 6);
                    MutualRelationViewModel wl = wl();
                    Context context = getContext();
                    wl.getClass();
                    if (context != null && (LIZIZ = C57434MgQ.LIZIZ(context)) != null) {
                        UserService.LIZ().LJII().observe(LIZIZ, new AObserverS69S0100000_1(wl, 96));
                    }
                    C8YN.LJII(this, wl(), new TBT() { // from class: X.3mZ
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C94113mh) obj).LJLJL;
                        }
                    }, null, new AqS183S0100000_1(this, 80), 6);
                    return;
                }
                o.LJIJI("mafListChunk");
                throw null;
            }
            o.LJIJI("mafListChunk");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardChunk");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awz, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
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
