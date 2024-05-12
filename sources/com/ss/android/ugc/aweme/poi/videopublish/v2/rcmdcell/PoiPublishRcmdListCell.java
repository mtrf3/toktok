package com.ss.android.ugc.aweme.poi.videopublish.v2.rcmdcell;

import X.AnonymousClass391;
import X.C13930gf;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C26338AVi;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71895SJn;
import X.C76800UCe;
import X.C85339XeR;
import X.C85342XeU;
import X.C85357Xej;
import X.C85361Xen;
import X.C85371Xex;
import X.C85382Xf8;
import X.C85454XgI;
import X.C85455XgJ;
import X.C85480Xgi;
import X.C85481Xgj;
import X.C85482Xgk;
import X.C8YZ;
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
import X.InterfaceC93923mO;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import X.ViewOnClickListenerC13880ga;
import X.YE1;
import Y.ACListenerS49S0200000_15;
import Y.IDCListenerS246S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService;
import com.ss.android.ugc.aweme.anchor.service.AnchorStateServiceImpl;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PoiPublishRcmdListCell extends PowerCell<C85361Xen> implements KPL {
    public final /* synthetic */ C85357Xej LJLIL = new C85357Xej();
    public C71895SJn LJLILLLLZI;
    public TuxTextView LJLJI;
    public final C214298b3 LJLJJI;
    public final AnchorLock$IAnchorStateService LJLJJL;
    public final C85339XeR LJLJJLL;

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

    public final PoiPublishExtensionVMV2 L() {
        return (PoiPublishExtensionVMV2) this.LJLJJI.getValue();
    }

    public PoiPublishRcmdListCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiPublishExtensionVMV2.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 574);
        C85382Xf8 c85382Xf8 = C85382Xf8.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85481Xgj.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 575), new AqS165S0100000_15((InterfaceC93923mO) this, 576), C85455XgJ.INSTANCE, c85382Xf8, new AqS165S0100000_15((InterfaceC93923mO) this, 577), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85482Xgk.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 578), new AqS165S0100000_15((InterfaceC93923mO) this, 569), C85454XgI.INSTANCE, c85382Xf8, new AqS165S0100000_15((InterfaceC93923mO) this, 570), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85480Xgi.INSTANCE, new AqS165S0100000_15((InterfaceC93923mO) this, 571), new AqS165S0100000_15((InterfaceC93923mO) this, 572), new AqS165S0100000_15((InterfaceC93923mO) this, 573), c85382Xf8, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJJI = c214298b3;
        this.LJLJJL = AnchorStateServiceImpl.LJIIJ();
        this.LJLJJLL = C85342XeU.LIZ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.k1z);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.skeleton_container)");
        C71895SJn c71895SJn = (C71895SJn) findViewById;
        this.LJLILLLLZI = c71895SJn;
        View findViewById2 = c71895SJn.findViewById(R.id.l3h);
        o.LJIIIIZZ(findViewById2, "skeletonView.findViewById(R.id.textView)");
        this.LJLJI = (TuxTextView) findViewById2;
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        this.LJLIL.LIZLLL(itemView);
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C13930gf.LIZ(itemView2, new C85371Xex(this));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C85361Xen c85361Xen) {
        String str;
        C85361Xen t = c85361Xen;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            PoiData poiData = t.LJLIL;
            if (poiData != null) {
                str = poiData.getName();
            } else {
                str = null;
            }
            tuxTextView.setText(str);
            tuxTextView.setTag(t.LJLIL);
            C71895SJn c71895SJn = this.LJLILLLLZI;
            if (c71895SJn != null) {
                c71895SJn.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS49S0200000_15(this, t, 27)));
                if (getLayoutPosition() == 0) {
                    if (t.LJLJI) {
                        C71895SJn c71895SJn2 = this.LJLILLLLZI;
                        if (c71895SJn2 != null) {
                            C26338AVi.LJI(c71895SJn2, AnonymousClass391.LIZJ(8), null, null, null, false, 30);
                        } else {
                            o.LJIJI("skeletonView");
                            throw null;
                        }
                    } else {
                        C71895SJn c71895SJn3 = this.LJLILLLLZI;
                        if (c71895SJn3 != null) {
                            C26338AVi.LJI(c71895SJn3, AnonymousClass391.LIZJ(16), null, null, null, false, 30);
                        } else {
                            o.LJIJI("skeletonView");
                            throw null;
                        }
                    }
                }
                this.LJLIL.LIZJ().addOnAttachStateChangeListener(new IDCListenerS246S0100000_9(getCurrentLifecycleOwner(), 4));
                return;
            }
            o.LJIJI("skeletonView");
            throw null;
        }
        o.LJIJI("textView");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        this.LJLIL.getClass();
        return C85357Xej.LIZ(parent);
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
