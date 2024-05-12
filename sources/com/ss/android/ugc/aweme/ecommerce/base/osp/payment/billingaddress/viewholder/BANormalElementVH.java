package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder;

import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C33Q;
import X.C3C8;
import X.C45804HyK;
import X.C56412MCa;
import X.C61878OQg;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71731SDf;
import X.C76800UCe;
import X.C78685UuP;
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
import X.OUP;
import X.SB1;
import X.SB2;
import X.SB3;
import X.SB4;
import X.SB5;
import X.SB6;
import X.SB7;
import X.SD5;
import X.TBW;
import X.YE1;
import Y.ACListenerS46S0200000_12;
import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS57S0400000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class BANormalElementVH extends PowerCell<SB1> implements KPL {
    public final C214298b3 LJLIL;
    public String LJLILLLLZI;
    public Boolean LJLJI;
    public boolean LJLJJI;
    public String LJLJJL;

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

    public BANormalElementVH() {
        C214298b3 c214298b3;
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BillingAddressViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 239);
        SB5 sb5 = SB5.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SB3.INSTANCE, new AqS162S0100000_12(this, 240), new AqS162S0100000_12(this, 241), SB7.INSTANCE, sb5, new AqS162S0100000_12(this, 242), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SB4.INSTANCE, new AqS162S0100000_12(this, 243), new AqS162S0100000_12(this, 234), SB6.INSTANCE, sb5, new AqS162S0100000_12(this, 235), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SB2.INSTANCE, new AqS162S0100000_12(this, 236), new AqS162S0100000_12(this, 237), new AqS162S0100000_12(this, 238), sb5, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = "";
        this.LJLJJL = "";
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onCreate() {
        this.LJLJJI = ((BillingAddressViewModel) this.LJLIL.getValue()).LJLJJL;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(SB1 sb1) {
        SB1 t = sb1;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        OUP.LJJJJJL(C45804HyK.LJJI(16), itemView);
        String str = t.LJLILLLLZI.LIZ.paramName;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        this.LJLILLLLZI = str;
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        itemView2.setTag(R.id.bn_, t.LJLJJI);
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.view.CCDCNormalElement");
        SD5 sd5 = (SD5) view;
        ElementDTO elementDTO = t.LJLILLLLZI.LIZ;
        PaymentMethod paymentMethod = t.LJLIL;
        sd5.setOnValueChange(new AqS143S0200000_12(this, elementDTO, 92));
        sd5.setOnVerify(new AqS57S0400000_12(this, paymentMethod, elementDTO, sd5, 10));
        sd5.setOnErrorClear(new AqS162S0100000_12(t, 1074));
        sd5.setOnFocusChange(new AqS116S0300000_12(this, sd5, elementDTO, 32));
        sd5.getInputView().setIndicatorClickListener(new ACListenerS46S0200000_12(sd5, this, 26));
        ((C71731SDf) sd5.LIZIZ(R.id.eod)).setOnIndicatorVisibleChangeListener(new AqS178S0100000_12(this, 425));
        if (t.LJLJI && C78685UuP.LJJJZ(t.LJLILLLLZI.LIZJ)) {
            sd5.getInputView().requestFocus();
            sd5.postDelayed(new ARunnableS48S0100000_12(sd5, 74), 200L);
            t.LJLJI = false;
        } else {
            t.LJLJI = false;
        }
        BillingAddressViewModel billingAddressViewModel = (BillingAddressViewModel) this.LJLIL.getValue();
        String str3 = elementDTO.id;
        if (str3 != null) {
            str2 = str3;
        }
        List<PaymentElement> list = (List) ((LinkedHashMap) billingAddressViewModel.LJLIL).get(str2);
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        sd5.LIZ(elementDTO, paymentMethod, list, t.LJLILLLLZI.LIZJ);
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
