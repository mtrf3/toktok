package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder;

import X.C117114ih;
import X.C16880lQ;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71731SDf;
import X.C76800UCe;
import X.C79081V1x;
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
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.SB8;
import X.SBS;
import X.SBT;
import X.SBU;
import X.SBV;
import X.SBW;
import X.SBX;
import X.SBY;
import X.SD5;
import X.TBW;
import X.YE1;
import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DisableElementViewHolder extends PowerCell<SB8> implements KPL {
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

    public DisableElementViewHolder() {
        C214298b3 c214298b3;
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BillingAddressViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 249);
        SBV sbv = SBV.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SBT.INSTANCE, new AqS162S0100000_12(this, LiveCoverMinSizeSetting.DEFAULT), new AqS162S0100000_12(this, 251), SBX.INSTANCE, sbv, new AqS162S0100000_12(this, 252), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SBU.INSTANCE, new AqS162S0100000_12(this, 253), new AqS162S0100000_12(this, 244), SBW.INSTANCE, sbv, new AqS162S0100000_12(this, 245), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SBS.INSTANCE, new AqS162S0100000_12(this, 246), new AqS162S0100000_12(this, 247), new AqS162S0100000_12(this, 248), sbv, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(SB8 sb8) {
        SB8 t = sb8;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        ElementDTO elementDTO = t.LJLILLLLZI.LIZ;
        PaymentMethod paymentMethod = t.LJLIL;
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setTag(R.id.bn_, new C117114ih(C79081V1x.LJII(25), 0, 0, 0, false, 0, true, 254));
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.view.CCDCNormalElement");
        SD5 sd5 = (SD5) view;
        sd5.setOnVerify(SBY.LJLIL);
        String str = null;
        sd5.LIZ(elementDTO, paymentMethod, null, null);
        ((C71731SDf) sd5.LIZIZ(R.id.eod)).LIZ(R.id.eof).setFocusable(false);
        ((C71731SDf) sd5.LIZIZ(R.id.eod)).setText("");
        C71731SDf c71731SDf = (C71731SDf) sd5.LIZIZ(R.id.eod);
        Region kv0 = ((BillingAddressViewModel) this.LJLIL.getValue()).kv0();
        String str2 = kv0.name;
        if (str2 == null || str2.length() == 0) {
            String str3 = kv0.code;
            if (str3 != null) {
                str = str3.toUpperCase(Locale.ROOT);
                o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            }
        } else {
            str = kv0.name;
        }
        c71731SDf.setHint(str);
        ((ImageView) sd5.LIZIZ(R.id.e_q)).setVisibility(0);
        C16880lQ.LJJJ((TuxIconView) sd5.LIZIZ(R.id.e_q), new ACListenerS21S0100000_1(sd5, 169));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        return new SD5(context);
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
