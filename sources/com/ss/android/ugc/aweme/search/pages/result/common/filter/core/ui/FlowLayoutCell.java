package com.ss.android.ugc.aweme.search.pages.result.common.filter.core.ui;

import X.C05040Hs;
import X.C16880lQ;
import X.C19N;
import X.C1DI;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C221108m2;
import X.C33Q;
import X.C3C8;
import X.C51763KTf;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C77339UWx;
import X.C78847Ux1;
import X.C78897Uxp;
import X.C8YN;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
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
import X.K47;
import X.K4C;
import X.KM1;
import X.KM2;
import X.KM3;
import X.KM7;
import X.KM8;
import X.KPL;
import X.O6R;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBV;
import X.TBW;
import Y.ACListenerS28S0100000_8;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.viewmodel.SearchFilterViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;
import o3.IDaS91S0000000_9;
import o3.h0;

/* loaded from: classes9.dex */
public final class FlowLayoutCell extends PowerCell<K47> implements KPL {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;

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

    public final TuxTextView M() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-content>(...)");
        return (TuxTextView) value;
    }

    public final SearchFilterViewModel N() {
        return (SearchFilterViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        int i;
        int i2;
        int i3;
        super.onItemViewCreated();
        C16880lQ.LJJJJI(M(), new ACListenerS28S0100000_8(this, 32));
        C8YN.LJII(this, N(), new TBV() { // from class: X.K4D
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((K42) obj).LJLJJI;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((K42) obj).LJLJJI = (SubFilterOptionStruct) obj2;
            }
        }, null, new AqS190S0100000_8(this, 27), 6);
        C8YN.LJII(this, N(), new TBV() { // from class: X.K4E
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((K42) obj).LJLJJL;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((K42) obj).LJLJJL = (SubFilterOptionStruct) obj2;
            }
        }, null, new AqS190S0100000_8(this, 28), 6);
        C8YN.LJII(this, N(), new TBV() { // from class: X.K4F
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((K42) obj).LJLJJLL;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((K42) obj).LJLJJLL = (SubFilterOptionStruct) obj2;
            }
        }, null, new AqS190S0100000_8(this, 29), 6);
        C8YN.LJII(this, N(), new TBV() { // from class: X.K4G
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((K42) obj).LJLILLLLZI;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((K42) obj).LJLILLLLZI = (SubFilterOptionStruct) obj2;
            }
        }, null, new AqS190S0100000_8(this, 30), 6);
        C8YN.LJII(this, N(), new TBV() { // from class: X.K4A
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((K42) obj).LJLIL;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((K42) obj).LJLIL = (SubFilterOptionStruct) obj2;
            }
        }, null, new AqS190S0100000_8(this, 25), 6);
        C8YN.LJII(this, N(), new TBV() { // from class: X.K4B
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((K42) obj).LJLJI;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((K42) obj).LJLJI = (SubFilterOptionStruct) obj2;
            }
        }, null, new AqS190S0100000_8(this, 26), 6);
        float f = 16;
        float f2 = 10;
        M().setPaddingRelative(C05040Hs.LIZ(1, f), C05040Hs.LIZ(1, f2), C05040Hs.LIZ(1, f), O6R.LJJIIZ(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics())));
        TuxTextView M = M();
        Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.cv);
        if (LIZIZ != null) {
            i = LIZIZ.intValue();
        } else {
            i = 0;
        }
        Integer LIZIZ2 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.go);
        if (LIZIZ2 != null) {
            i2 = LIZIZ2.intValue();
        } else {
            i2 = 0;
        }
        int LIZ = C05040Hs.LIZ(1, 1);
        float LJJIFFI = C78847Ux1.LJJIFFI(5);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(LJJIFFI);
        gradientDrawable.setStroke(LIZ, i2);
        Integer LIZIZ3 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.cv);
        if (LIZIZ3 != null) {
            i3 = LIZIZ3.intValue();
        } else {
            i3 = 0;
        }
        Drawable LIZIZ4 = C51763KTf.LIZIZ(C78847Ux1.LJJIFFI(5), i3);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, gradientDrawable);
        stateListDrawable.addState(new int[]{-16842913}, LIZIZ4);
        M.setBackground(stateListDrawable);
        h0.LJIJI(M(), new IDaS91S0000000_9(2));
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C78897Uxp.LJJJJJL(itemView, C78847Ux1.LJJIFFI(5));
    }

    public FlowLayoutCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SearchFilterViewModel.class);
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 242);
        K4C k4c = K4C.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS158S0100000_8, KM3.INSTANCE, new AqS158S0100000_8((InterfaceC93923mO) this, 243), new AqS158S0100000_8((InterfaceC93923mO) this, 233), KM7.INSTANCE, k4c, new AqS158S0100000_8((InterfaceC93923mO) this, 235), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS158S0100000_8, KM1.INSTANCE, new AqS158S0100000_8((InterfaceC93923mO) this, 236), new AqS158S0100000_8((InterfaceC93923mO) this, 237), KM8.INSTANCE, k4c, new AqS158S0100000_8((InterfaceC93923mO) this, 238), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS158S0100000_8, KM2.INSTANCE, new AqS158S0100000_8((InterfaceC93923mO) this, 239), new AqS158S0100000_8((InterfaceC93923mO) this, 240), new AqS158S0100000_8((InterfaceC93923mO) this, 241), k4c, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 234));
    }

    public final void L(boolean z) {
        TuxTextView M = M();
        M.setSelected(z);
        int i = 0;
        if (z) {
            Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.go);
            if (LIZIZ != null) {
                i = LIZIZ.intValue();
            }
            M.setTextColor(i);
            M.setTuxFont(52);
            return;
        }
        Integer LIZIZ2 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gu);
        if (LIZIZ2 != null) {
            i = LIZIZ2.intValue();
        }
        M.setTextColor(i);
        M.setTuxFont(51);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(K47 k47) {
        K47 t = k47;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        M().setText(t.LJLIL.getName());
        C212418Vh.LJIIJJI(N(), new AqS139S0200000_8(t, this, 54));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.cjb, viewGroup, false, "from(parent.context).inf…ow_layout, parent, false)");
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
