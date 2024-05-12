package com.ss.android.ugc.aweme.profile.aigc;

import X.C16880lQ;
import X.C1DI;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71897SJp;
import X.C72142STa;
import X.C72143STb;
import X.C72144STc;
import X.C72145STd;
import X.C72146STe;
import X.C72147STf;
import X.C76800UCe;
import X.C8YN;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC72807Shn;
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
import X.STY;
import X.TBT;
import X.TBW;
import X.W5F;
import X.W5U;
import X.YE1;
import Y.ACListenerS37S0300000_12;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS174S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ChooseStyleCell extends PowerCell<STY> implements KPL {
    public final C214298b3 LJLIL;
    public boolean LJLILLLLZI;

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

    public final ProfileAigcStyleViewModel L() {
        return (ProfileAigcStyleViewModel) this.LJLIL.getValue();
    }

    public ChooseStyleCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileAigcStyleViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 815);
        C72145STd c72145STd = C72145STd.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C72143STb.INSTANCE, new AqS162S0100000_12(this, 816), new AqS162S0100000_12(this, 817), C72147STf.INSTANCE, c72145STd, new AqS162S0100000_12(this, 818), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C72144STc.INSTANCE, new AqS162S0100000_12(this, 819), new AqS162S0100000_12(this, 810), C72146STe.INSTANCE, c72145STd, new AqS162S0100000_12(this, 811), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C72142STa.INSTANCE, new AqS162S0100000_12(this, 812), new AqS162S0100000_12(this, 813), new AqS162S0100000_12(this, 814), c72145STd, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(STY sty) {
        STY t = sty;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        C71897SJp c71897SJp = (C71897SJp) this.itemView.findViewById(R.id.b_d);
        C212418Vh.LJIIJJI(L(), new AqS116S0300000_12(c71897SJp, this, t, 0));
        C8YN.LJII(this, L(), new TBT() { // from class: X.ELC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EL9) obj).LJLILLLLZI;
            }
        }, null, new AqS174S0200000_12(c71897SJp, this, 0), 6);
        TextView textView = (TextView) this.itemView.findViewById(R.id.text);
        String str = t.LJLIL.displayName;
        if (str == null) {
            str = "Display name";
        }
        textView.setText(str);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.egd);
        W5F LJIIIIZZ = W5U.LJIIIIZZ(t.LJLIL.styleImage);
        LJIIIIZZ.LJJIIJ = smartImageView;
        LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_CROP;
        C16880lQ.LLJJJ(LJIIIIZZ);
        C16880lQ.LJIIJ(new ACListenerS37S0300000_12(c71897SJp, this, t, 0), this.itemView);
        c71897SJp.setInterceptToggleListener(new AqS159S0200000_12(this, t, 4));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.c3b, viewGroup, false, "from(parent.context)\n   …tion_item, parent, false)");
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
