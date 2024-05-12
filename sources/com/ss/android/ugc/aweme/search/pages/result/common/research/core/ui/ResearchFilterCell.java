package com.ss.android.ugc.aweme.search.pages.result.common.research.core.ui;

import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C00F;
import X.C16880lQ;
import X.C1FJ;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C221108m2;
import X.C26338AVi;
import X.C30581Hy;
import X.C32151Nz;
import X.C33Q;
import X.C3C8;
import X.C50225JnR;
import X.C50240Jng;
import X.C50288JoS;
import X.C50289JoT;
import X.C50290JoU;
import X.C50291JoV;
import X.C51763KTf;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68182ly;
import X.C76800UCe;
import X.C78897Uxp;
import X.C79045V0n;
import X.C8YN;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.FFL;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.InterfaceC93923mO;
import X.KM0;
import X.KM4;
import X.KM5;
import X.KM6;
import X.KM9;
import X.KPL;
import X.O6R;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBV;
import X.TBW;
import X.YE1;
import Y.ACListenerS28S0100000_8;
import Y.AObserverS76S0100000_8;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.filter.research.ResearchFilterStruct;
import com.ss.android.ugc.aweme.search.pages.common.theme.ThemeViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.viewmodel.ResearchFilterVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ResearchFilterCell extends PowerCell<C50225JnR> implements KPL {
    public TuxTextView LJLIL;
    public final C214298b3 LJLILLLLZI;
    public boolean LJLJI;
    public ThemeViewModel LJLJJI;

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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        MutableLiveData<C50240Jng> gv0;
        MutableLiveData<C50240Jng> hv0;
        super.onItemViewCreated();
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS28S0100000_8(this, 33));
            C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBV() { // from class: X.JnW
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return ((C50229JnV) obj).LJLIL;
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    ((C50229JnV) obj).LJLIL = (ResearchFilterStruct) obj2;
                }
            }, null, new AqS190S0100000_8(this, 31), 6);
            TuxTextView tuxTextView2 = this.LJLIL;
            if (tuxTextView2 != null) {
                ActivityC45651qj LJJIJIL = C30581Hy.LJJIJIL(tuxTextView2);
                if (LJJIJIL != null) {
                    this.LJLJJI = (ThemeViewModel) ViewModelProviders.of(LJJIJIL).get(ThemeViewModel.class);
                }
                ThemeViewModel themeViewModel = this.LJLJJI;
                if (themeViewModel != null && (hv0 = themeViewModel.hv0()) != null) {
                    C68182ly.LIZJ(hv0, this, new AObserverS76S0100000_8(this, 48));
                }
                ThemeViewModel themeViewModel2 = this.LJLJJI;
                if (themeViewModel2 != null && (gv0 = themeViewModel2.gv0()) != null) {
                    C68182ly.LIZJ(gv0, this, new AObserverS76S0100000_8(this, 49));
                    return;
                }
                return;
            }
            o.LJIJI("filterText");
            throw null;
        }
        o.LJIJI("filterText");
        throw null;
    }

    public final int L() {
        Integer LJI;
        ResearchFilterStruct researchFilterStruct;
        C50225JnR item;
        ResearchFilterStruct researchFilterStruct2;
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            Context context = tuxTextView.getContext();
            if (this.LJLJI) {
                C50289JoT.LIZ.getClass();
                if (C50289JoT.LIZ() && (item = getItem()) != null && (researchFilterStruct2 = item.LJLIL) != null && researchFilterStruct2.isSelected()) {
                    o.LJIIIIZZ(context, "context");
                    LJI = C79045V0n.LJI(R.attr.da, context);
                } else {
                    o.LJIIIIZZ(context, "context");
                    LJI = C79045V0n.LJI(R.attr.d1, context);
                }
            } else {
                C50289JoT.LIZ.getClass();
                if (C50289JoT.LIZ()) {
                    C50225JnR item2 = getItem();
                    if (item2 != null && (researchFilterStruct = item2.LJLIL) != null && researchFilterStruct.isSelected()) {
                        o.LJIIIIZZ(context, "context");
                        LJI = C79045V0n.LJI(R.attr.cf, context);
                    } else {
                        o.LJIIIIZZ(context, "context");
                        LJI = C79045V0n.LJI(R.attr.cv, context);
                    }
                } else {
                    o.LJIIIIZZ(context, "context");
                    LJI = C79045V0n.LJI(R.attr.cf, context);
                }
            }
            if (LJI == null) {
                return 0;
            }
            return LJI.intValue();
        }
        o.LJIJI("filterText");
        throw null;
    }

    public ResearchFilterCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ResearchFilterVM.class);
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8((InterfaceC65350Pko) LIZ, LiveCoverMinSizeSetting.DEFAULT);
        C50288JoS c50288JoS = C50288JoS.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS158S0100000_8, KM4.INSTANCE, new AqS158S0100000_8((InterfaceC93923mO) this, 251), new AqS158S0100000_8((InterfaceC93923mO) this, 252), KM9.INSTANCE, c50288JoS, new AqS158S0100000_8((InterfaceC93923mO) this, 253), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS158S0100000_8, KM5.INSTANCE, new AqS158S0100000_8((InterfaceC93923mO) this, 254), new AqS158S0100000_8((InterfaceC93923mO) this, 245), KM6.INSTANCE, c50288JoS, new AqS158S0100000_8((InterfaceC93923mO) this, 246), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS158S0100000_8, KM0.INSTANCE, new AqS158S0100000_8((InterfaceC93923mO) this, 247), new AqS158S0100000_8((InterfaceC93923mO) this, 248), new AqS158S0100000_8((InterfaceC93923mO) this, 249), c50288JoS, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLILLLLZI = c214298b3;
        C221108m2.LIZIZ(C50290JoU.LJLIL);
    }

    public final int M() {
        ResearchFilterStruct researchFilterStruct;
        C50225JnR item = getItem();
        if (item != null && (researchFilterStruct = item.LJLIL) != null && researchFilterStruct.isSelected()) {
            if (this.LJLJI) {
                return R.attr.dj;
            }
            return R.attr.go;
        }
        if (this.LJLJI) {
            return R.attr.dm;
        }
        return R.attr.gv;
    }

    public final void N(C50240Jng c50240Jng) {
        int i;
        this.LJLJI = o.LJ(c50240Jng.LIZ, "dark");
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            tuxTextView.setBackground(C51763KTf.LIZIZ(C32151Nz.LJIIZILJ(5), L()));
            TuxTextView tuxTextView2 = this.LJLIL;
            if (tuxTextView2 != null) {
                Context context = tuxTextView2.getContext();
                o.LJIIIIZZ(context, "filterText.context");
                Integer LJI = C79045V0n.LJI(M(), context);
                if (LJI != null) {
                    i = LJI.intValue();
                } else {
                    i = 0;
                }
                tuxTextView2.setTextColor(i);
                return;
            }
            o.LJIJI("filterText");
            throw null;
        }
        o.LJIJI("filterText");
        throw null;
    }

    public final void P(boolean z) {
        int i;
        ResearchFilterStruct researchFilterStruct;
        C50225JnR item = getItem();
        if (item != null && (researchFilterStruct = item.LJLIL) != null) {
            researchFilterStruct.setSelected(z);
        }
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            Context context = tuxTextView.getContext();
            o.LJIIIIZZ(context, "filterText.context");
            Integer LJI = C79045V0n.LJI(M(), context);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            tuxTextView.setTextColor(i);
            C50289JoT.LIZ.getClass();
            if (C50289JoT.LIZ()) {
                TuxTextView tuxTextView2 = this.LJLIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setBackground(C51763KTf.LIZIZ(C32151Nz.LJIIZILJ(5), L()));
                    return;
                } else {
                    o.LJIJI("filterText");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("filterText");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C50225JnR c50225JnR) {
        ResearchFilterStruct researchFilterStruct;
        C50225JnR t = c50225JnR;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        C50225JnR item = getItem();
        if (item != null && (researchFilterStruct = item.LJLIL) != null) {
            float width = researchFilterStruct.getWidth();
            TuxTextView tuxTextView = this.LJLIL;
            if (tuxTextView != null) {
                tuxTextView.getLayoutParams().width = (int) width;
            } else {
                o.LJIJI("filterText");
                throw null;
            }
        }
        TuxTextView tuxTextView2 = this.LJLIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(t.LJLIL.getName());
            TuxTextView tuxTextView3 = this.LJLIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setBackground(C51763KTf.LIZIZ(C32151Nz.LJIIZILJ(5), L()));
                C212418Vh.LJIIJJI((AssemViewModel) this.LJLILLLLZI.getValue(), new AqS174S0100000_8(this, 287));
                return;
            } else {
                o.LJIJI("filterText");
                throw null;
            }
        }
        o.LJIJI("filterText");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        boolean z;
        int i;
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(17);
        C50289JoT.LIZ.getClass();
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "unified_horizontal_tab_style", true) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z || C00F.LIZ(31744, 0, "unified_horizontal_tab_style", true) == 3) {
            C26338AVi.LJIIIZ(tuxTextView, C1FJ.LIZIZ(12), C1FJ.LIZIZ(6), C1FJ.LIZIZ(12), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6))), 16);
        } else {
            C26338AVi.LJIIIZ(tuxTextView, C1FJ.LIZIZ(12), AnonymousClass391.LIZJ(8), C1FJ.LIZIZ(12), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), 16);
        }
        if (((Number) C50291JoV.LIZ.getValue()).intValue() == 1) {
            i = 62;
        } else {
            i = 72;
        }
        tuxTextView.setTuxFont(i);
        tuxTextView.setMinWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(44)));
        C78897Uxp.LJJJJJL(tuxTextView, C32151Nz.LJIIZILJ(5));
        this.LJLIL = tuxTextView;
        return tuxTextView;
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
