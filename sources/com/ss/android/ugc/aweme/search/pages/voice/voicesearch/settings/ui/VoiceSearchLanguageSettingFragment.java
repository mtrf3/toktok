package com.ss.android.ugc.aweme.search.pages.voice.voicesearch.settings.ui;

import X.ASQ;
import X.ASX;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C188727au;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C234509Ig;
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
import X.C76800UCe;
import X.C78926UyI;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C93898aYI;
import X.C94360afk;
import X.C94361afl;
import X.C94379ag3;
import X.C94602aje;
import X.C94603ajf;
import X.C94604ajg;
import X.C94719alX;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.EnumC252729vw;
import X.FMX;
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
import X.SYL;
import X.TBT;
import X.TBW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.settings.viewmodel.LanguageSelectionState;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.settings.viewmodel.VoiceSearchLanguageSettingViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.IDqS1S0001000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.IDqS446S0100000_42;
import kotlin.jvm.internal.IDqS9S1000000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class VoiceSearchLanguageSettingFragment extends BaseFragment implements KPL {
    public C252709vu LJLJJI;
    public SYL LJLJJL;
    public boolean LJLJJLL;
    public final C214298b3 LJLJL;
    public final C214378bB LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 104));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 103));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 105));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    public VoiceSearchLanguageSettingFragment() {
        C214298b3 c214298b3;
        AqS60S0110000_3 LJJ;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VoiceSearchLanguageSettingViewModel.class);
        IDqS423S0100000_42 iDqS423S0100000_42 = new IDqS423S0100000_42(LIZ, 107);
        C94603ajf c94603ajf = C94603ajf.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(iDqS423S0100000_42, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c94603ajf, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(iDqS423S0100000_42, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c94603ajf, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJL = c214298b3;
        IDqS423S0100000_42 iDqS423S0100000_422 = new IDqS423S0100000_42(this, 106);
        C65776Prg LIZ2 = C65352Pkq.LIZ(LanguageSelectionState.class);
        C94604ajg c94604ajg = C94604ajg.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLJLJ = new C214378bB(LIZ2, iDqS423S0100000_422, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c94604ajg, LJJ, C78926UyI.LJIILLIIL(this, true));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        super.onDestroyView();
        if (this.LJLJJLL) {
            ((AssemViewModel) this.LJLJLJ.getValue()).setState(new IDqS1S0001000_42(1, 1));
        } else {
            ((AssemViewModel) this.LJLJLJ.getValue()).setState(new IDqS1S0001000_42(2, 1));
        }
        super.onDestroy();
        C188727au c188727au = new C188727au();
        c188727au.LJII((HashMap) this.LJLIL.getValue());
        if (this.LJLJJLL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_choose", str);
        FMX.LJIIL("voice_language_page_result", c188727au.LIZ);
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(C94602aje.LJLIL);
        super.onCreate(bundle);
    }

    public final void vl(boolean z) {
        if (z) {
            this.LJLJJLL = true;
            C93898aYI c93898aYI = new C93898aYI();
            String language = ((C94379ag3) ((AssemViewModel) this.LJLJL.getValue()).getState()).LJLILLLLZI;
            o.LJIIIZ(language, "language");
            c93898aYI.LIZ.storeString("selected_sauc_language", language);
        }
        ASQ.LJ(this, ASX.LIZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJI = (C252709vu) view.findViewById(R.id.gwg);
        this.LJLJJL = (SYL) view.findViewById(R.id.fu6);
        C235119Kp c235119Kp = new C235119Kp();
        C234509Ig c234509Ig = new C234509Ig();
        String string = getString(R.string.ts_);
        o.LJIIIIZZ(string, "getString(R.string.voice…ottomsheet_header_cancel)");
        c234509Ig.LIZJ = string;
        c234509Ig.LIZ(EnumC252729vw.SECONDARY);
        c234509Ig.LIZ = new C94360afk(this);
        c235119Kp.LIZLLL(c234509Ig);
        C9KF c9kf = new C9KF();
        String string2 = getString(R.string.ts9);
        o.LJIIIIZZ(string2, "getString(R.string.voice…guage_bottomsheet_header)");
        c9kf.LIZJ = string2;
        c235119Kp.LIZJ = c9kf;
        C234509Ig c234509Ig2 = new C234509Ig();
        String string3 = getString(R.string.tsa);
        o.LJIIIIZZ(string3, "getString(R.string.voice…_bottomsheet_header_done)");
        c234509Ig2.LIZJ = string3;
        c234509Ig2.LIZ(EnumC252729vw.PRIMARY);
        c234509Ig2.LIZ = new C94361afl(this);
        c234509Ig2.LIZIZ = "tag_done";
        c234509Ig2.LJ = false;
        c235119Kp.LIZIZ(c234509Ig2);
        C252709vu c252709vu = this.LJLJJI;
        if (c252709vu != null) {
            c252709vu.setNavActions(c235119Kp);
        }
        C252709vu c252709vu2 = this.LJLJJI;
        if (c252709vu2 != null) {
            c252709vu2.LJIILJJIL(true);
        }
        SYL syl = this.LJLJJL;
        if (syl != null) {
            syl.setLifecycleOwner(this);
        }
        SYL syl2 = this.LJLJJL;
        if (syl2 != null) {
            syl2.setNestedScrollingEnabled(true);
        }
        SYL syl3 = this.LJLJJL;
        if (syl3 != null) {
            syl3.LLLF.LJZL(VoiceSearchLanguageCell.class);
        }
        SYL syl4 = this.LJLJJL;
        if (syl4 != null) {
            syl4.setItemAnimator(null);
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LJLJL.getValue();
        String initCluster = (String) this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(initCluster, "initCluster");
        assemViewModel.setState(new IDqS9S1000000_42(initCluster, 2));
        ((AssemViewModel) this.LJLJL.getValue()).setState(C94719alX.LJLIL);
        C8YN.LJII(this, (AssemViewModel) this.LJLJL.getValue(), new TBT() { // from class: X.aq3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C94379ag3) obj).LJLJJI;
            }
        }, null, new IDqS446S0100000_42(this, 17), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLJL.getValue(), new TBT() { // from class: X.aq4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C94379ag3) obj).LJLJI);
            }
        }, null, new IDqS446S0100000_42(this, 18), 6);
        C188727au c188727au = new C188727au();
        c188727au.LJII((HashMap) this.LJLIL.getValue());
        FMX.LJIIL("voice_language_page_show", c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dwn, viewGroup, false);
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
