package com.ss.android.ugc.aweme.mix.pickcandidate;

import X.AbstractC028509h;
import X.AbstractC030309z;
import X.AbstractC72278SYg;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C228228xW;
import X.C228668yE;
import X.C228678yF;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C76800UCe;
import X.C78926UyI;
import X.C8YZ;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC65784Pro;
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
import X.Q7K;
import X.SY4;
import X.SYL;
import X.TBT;
import X.TBW;
import Y.AObserverS59S0101000_3;
import Y.AObserverS71S0100000_3;
import Y.IDcS7S0200000_3;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class AddMultiVideoFragment extends AmeBaseFragment implements KPL {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final C214298b3 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public boolean LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 527));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    public AddMultiVideoFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(MixCreateViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 525);
        C228668yE c228668yE = C228668yE.INSTANCE;
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        AqS61S0110000_4 LJJII = C78926UyI.LJJII(this, true);
        AqS60S0110000_3 LJJIIJZLJL = C78926UyI.LJJIIJZLJL(this, true);
        C184077Kh c184077Kh = C184077Kh.LJLIL;
        this.LJLILLLLZI = new C214298b3(LIZ, aqS153S0100000_3, c214528bQ, LJJII, LJJIIJZLJL, c184077Kh, c228668yE, (InterfaceC65784Pro) null, 384);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MixVideosManageViewModel.class);
        this.LJLJI = new C214298b3(LIZ2, new AqS153S0100000_3(LIZ2, 526), c214528bQ, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), c184077Kh, C228678yF.INSTANCE, (InterfaceC65784Pro) null, 384);
    }

    public final MixCreateViewModel vl() {
        return (MixCreateViewModel) this.LJLILLLLZI.getValue();
    }

    public final MixVideosManageViewModel wl() {
        return (MixVideosManageViewModel) this.LJLJI.getValue();
    }

    public final MultiVideoViewModel xl() {
        return (MultiVideoViewModel) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        o.LJI(view);
        view.setFocusableInTouchMode(true);
        View view2 = getView();
        o.LJI(view2);
        view2.requestFocus();
        View view3 = getView();
        o.LJI(view3);
        view3.setOnKeyListener(new View.OnKeyListener() { // from class: X.8yB
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view4, int i, KeyEvent keyEvent) {
                FragmentManager supportFragmentManager;
                if (keyEvent.getAction() == 0 && i == 4) {
                    ActivityC45651qj mo49getActivity = AddMultiVideoFragment.this.mo49getActivity();
                    if (mo49getActivity != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null) {
                        AddMultiVideoFragment addMultiVideoFragment = AddMultiVideoFragment.this;
                        MixVideosManageViewModel wl = addMultiVideoFragment.wl();
                        wl.getClass();
                        wl.setState(new AqS8S0010000_3(true, 59));
                        if (supportFragmentManager.LJJJJIZL() == 0) {
                            ActivityC45651qj mo49getActivity2 = addMultiVideoFragment.mo49getActivity();
                            if (mo49getActivity2 != null) {
                                mo49getActivity2.finish();
                            }
                        } else {
                            supportFragmentManager.LJJLIIIJJI();
                        }
                    }
                    return true;
                }
                return false;
            }
        });
    }

    /* loaded from: classes4.dex */
    public static final class CandidateGridLayoutManager extends GridLayoutManager {
        public final SYL LLIIZ;

        @Override // androidx.recyclerview.widget.GridLayoutManager
        public final void LLJLILLLLZIIL(AbstractC028509h abstractC028509h) {
            this.LLIILII = new IDcS7S0200000_3(this, abstractC028509h, 2);
        }

        public CandidateGridLayoutManager(Context context, SYL syl) {
            super(3);
            this.LLIIZ = syl;
            LLJLILLLLZIIL(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        List arrayList;
        List<String> arrayList2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (mo49getActivity() instanceof MixFeedManagerActivity) {
            MultiVideoViewModel xl = xl();
            String str = wl().LJLILLLLZI;
            xl.getClass();
            o.LJIIIZ(str, "<set-?>");
            xl.LJLL = str;
        }
        Context context = getContext();
        if (context != null) {
            obj = C16880lQ.LLILL(context, "input_method");
        } else {
            obj = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(_$_findCachedViewById(R.id.h0u).getWindowToken(), 0);
        }
        ((C73305Spp) _$_findCachedViewById(R.id.b49)).setVisibility(0);
        if (mo49getActivity() instanceof MixFeedManagerActivity) {
            ((TextView) _$_findCachedViewById(R.id.h0u)).setText(getString(R.string.bg7));
        } else {
            ((TextView) _$_findCachedViewById(R.id.h0u)).setText(getString(R.string.exd));
        }
        _$_findCachedViewById(R.id.h0u).getClass();
        if (mo49getActivity() instanceof MixFeedManagerActivity) {
            List<Aweme> list = xl().LJLJI;
            C228228xW state = wl().getVmDispatcher().getState();
            if (state != null) {
                arrayList = state.LJLJJLL;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
            } else {
                arrayList = new ArrayList();
            }
            ((ArrayList) list).addAll(arrayList);
            xl().LJLJLJ.postValue(0);
            MultiVideoViewModel xl2 = xl();
            C228228xW state2 = wl().getVmDispatcher().getState();
            if (state2 != null) {
                arrayList2 = state2.LJLJL;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
            } else {
                arrayList2 = new ArrayList<>();
            }
            xl2.LJLJLLL = arrayList2;
        }
        ((SY4) _$_findCachedViewById(R.id.h0u)).setEnabled(false);
        if (getContext() != null) {
            ((SYL) _$_findCachedViewById(R.id.igw)).LLLF.LJZL(MixPickCandidatePowerCell.class);
            ((RecyclerView) _$_findCachedViewById(R.id.igw)).LJII(new AbstractC030309z() { // from class: X.8yD
                @Override // X.AbstractC030309z
                public final void LJFF(Canvas c, RecyclerView parent, C0AC state3) {
                    o.LJIIIZ(c, "c");
                    o.LJIIIZ(parent, "parent");
                    o.LJIIIZ(state3, "state");
                }

                @Override // X.AbstractC030309z
                public final void LJ(Rect rect, View view2, RecyclerView recyclerView, C0AC c0ac) {
                    T28.LJ(rect, "outRect", view2, "view", recyclerView, "parent", c0ac, "state");
                    super.LJ(rect, view2, recyclerView, c0ac);
                    rect.set(2, 2, 2, 2);
                }
            }, -1);
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.igw);
            Context context2 = getContext();
            o.LJI(context2);
            SYL pw_list_video = (SYL) _$_findCachedViewById(R.id.igw);
            o.LJIIIIZZ(pw_list_video, "pw_list_video");
            recyclerView.setLayoutManager(new CandidateGridLayoutManager(context2, pw_list_video));
            ((RecyclerView) _$_findCachedViewById(R.id.igw)).setItemAnimator(null);
            ((SYL) _$_findCachedViewById(R.id.igw)).LJLJLLL((AbstractC72278SYg) xl().LJLLI.getValue());
            ((PowerPageSource) xl().LJLLI.getValue()).getOperator().refresh();
            ((SYL) _$_findCachedViewById(R.id.igw)).LJLJL(0, C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bt4, null, false));
            C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.b49);
            if (c73305Spp != null) {
                c73305Spp.LJFF();
            }
        }
        xl().LJLJJI.observe(this, new AObserverS59S0101000_3(Q7K.LIZIZ("mix_max_add_aweme_count", 100), this, 1));
        xl().LJLJJL.observe(this, new AObserverS71S0100000_3(this, 92));
        if (mo49getActivity() instanceof MixFeedManagerActivity) {
            xl().LJLJLJ.observe(this, new AObserverS71S0100000_3(this, 93));
        }
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l_2);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_ltr;
        LIZJ.LIZIZ(new AqS153S0100000_3(this, 1779));
        c235119Kp.LIZLLL(LIZJ);
        c235119Kp.LIZLLL = false;
        C9KF c9kf = new C9KF();
        String string = getResources().getString(R.string.bg4);
        o.LJIIIIZZ(string, "resources.getString(R.string.add_to_playlist)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        c252709vu.setNavActions(c235119Kp);
        View next = _$_findCachedViewById(R.id.h0u);
        o.LJIIIIZZ(next, "next");
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 42, 42, 42), next);
        AssemViewModel.asyncSubscribe$default(vl(), new TBT() { // from class: X.8yQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return ((C228798yR) obj2).LJLJL;
            }
        }, null, new AqS169S0100000_3(this, 1024), null, null, 26, null);
        AssemViewModel.asyncSubscribe$default(vl(), new TBT() { // from class: X.8yK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return ((C228798yR) obj2).LJLJLJ;
            }
        }, null, new AqS169S0100000_3(this, 1022), null, null, 26, null);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bt9, viewGroup, false);
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
