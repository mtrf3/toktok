package com.ss.android.ugc.aweme.search.pages.voice.voicesearch.settings.ui;

import X.AEY;
import X.AI8;
import X.AI9;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C25991AHz;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C8YN;
import X.C8YZ;
import X.C94510aiA;
import X.C94596ajY;
import X.C94597ajZ;
import X.C94598aja;
import X.C94599ajb;
import X.C94600ajc;
import X.C94601ajd;
import X.C9BD;
import X.C9BE;
import X.C9XN;
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
import X.TBT;
import X.TBW;
import X.X1D;
import Y.IDCListenerS210S0100000_42;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.settings.viewmodel.VoiceSearchLanguageSettingViewModel;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.IDqS446S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class VoiceSearchLanguageCell extends PowerCell<C94510aiA> implements KPL {
    public final C214298b3 LJLIL;

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
        AI8 ai8;
        AEY aey;
        super.onItemViewCreated();
        View view = this.itemView;
        if ((view instanceof AI8) && (ai8 = (AI8) view) != null) {
            AI9 accessory = ai8.getAccessory();
            if ((accessory instanceof C25991AHz) && (aey = (AEY) accessory) != null) {
                aey.LJIILL(new IDCListenerS210S0100000_42(this, 0));
            }
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.apx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C94379ag3) obj).LJLILLLLZI;
            }
        }, null, new IDqS446S0100000_42(this, 4), 6);
    }

    public VoiceSearchLanguageCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VoiceSearchLanguageSettingViewModel.class);
        IDqS423S0100000_42 iDqS423S0100000_42 = new IDqS423S0100000_42(LIZ, 98);
        C94598aja c94598aja = C94598aja.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, iDqS423S0100000_42, C94599ajb.INSTANCE, new IDqS423S0100000_42(this, 99), new IDqS423S0100000_42(this, 100), C94600ajc.INSTANCE, c94598aja, new IDqS423S0100000_42(this, 101), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, iDqS423S0100000_42, C94601ajd.INSTANCE, new IDqS423S0100000_42(this, 102), new IDqS423S0100000_42(this, 93), C94596ajY.INSTANCE, c94598aja, new IDqS423S0100000_42(this, 94), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, iDqS423S0100000_42, C94597ajZ.INSTANCE, new IDqS423S0100000_42(this, 95), new IDqS423S0100000_42(this, 96), new IDqS423S0100000_42(this, 97), c94598aja, (InterfaceC65784Pro) null, 384);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Don't support this VMScope: ");
            LIZ2.append(c9be);
            LIZ2.append(" there");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C94510aiA c94510aiA) {
        AI8 ai8;
        C25991AHz c25991AHz;
        C94510aiA t = c94510aiA;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        View view = this.itemView;
        if ((view instanceof AI8) && (ai8 = (AI8) view) != null) {
            ai8.setTitle(t.LJLIL.LIZIZ);
            AI9 accessory = ai8.getAccessory();
            if ((accessory instanceof C25991AHz) && (c25991AHz = (C25991AHz) accessory) != null) {
                C212418Vh.LJIIJJI((AssemViewModel) this.LJLIL.getValue(), new IDqS175S0200000_42(c25991AHz, t, 17));
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        AI8 ai8 = new AI8(context, null, 6);
        Context context2 = ai8.getContext();
        o.LJIIIIZZ(context2, "context");
        ai8.setAccessory(new C25991AHz(context2));
        ai8.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return ai8;
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
