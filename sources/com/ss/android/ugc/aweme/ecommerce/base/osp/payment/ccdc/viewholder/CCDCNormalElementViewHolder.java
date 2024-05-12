package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.B21;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C27500Aqm;
import X.C33Q;
import X.C3C8;
import X.C45804HyK;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71679SBf;
import X.C71731SDf;
import X.C76800UCe;
import X.C78685UuP;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC27239AmZ;
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
import X.SCB;
import X.SCC;
import X.SCD;
import X.SCI;
import X.SCM;
import X.SCN;
import X.SD5;
import X.T5T;
import X.TBW;
import X.YE1;
import Y.ACListenerS46S0200000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS16S0500000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CCDCNormalElementViewHolder extends PowerCell<C71679SBf> implements KPL, InterfaceC27239AmZ {
    public final C214298b3 LJLIL;
    public Boolean LJLILLLLZI;
    public int LJLJI;

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

    public CCDCNormalElementViewHolder() {
        C214298b3 c214298b3;
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CCDCAddCardViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 324);
        SCI sci = SCI.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SCC.INSTANCE, new AqS162S0100000_12(this, 325), new AqS162S0100000_12(this, 326), SCN.INSTANCE, sci, new AqS162S0100000_12(this, 327), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SCD.INSTANCE, new AqS162S0100000_12(this, 328), new AqS162S0100000_12(this, 319), SCM.INSTANCE, sci, new AqS162S0100000_12(this, 320), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SCB.INSTANCE, new AqS162S0100000_12(this, 321), new AqS162S0100000_12(this, 322), new AqS162S0100000_12(this, 323), sci, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // X.InterfaceC27239AmZ
    public final T5T getFocusView() {
        T5T t5t = (T5T) this.itemView.findViewById(R.id.eof);
        o.LJIIIIZZ(t5t, "itemView.inputWithIndicatorEditText");
        return t5t;
    }

    public final CCDCAddCardViewModel getViewModel() {
        return (CCDCAddCardViewModel) this.LJLIL.getValue();
    }

    @Override // X.InterfaceC27239AmZ
    public final boolean needFocus() {
        String str;
        B21 b21;
        C71679SBf item = getItem();
        if (item != null && (b21 = item.LJLILLLLZI) != null) {
            str = b21.LIZJ;
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str) || String.valueOf(getFocusView().getText()).length() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C71679SBf c71679SBf) {
        C71679SBf t = c71679SBf;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setTag(R.id.bn_, t.LJLJJLL);
        if (C27500Aqm.LIZ() && o.LJ(t.LJLILLLLZI.LIZ.id, "eg_ccdc_global_cvv")) {
            this.itemView.setPadding(C45804HyK.LJJI(0), this.itemView.getPaddingTop(), C45804HyK.LJJI(16), this.itemView.getPaddingBottom());
        } else {
            this.itemView.setPadding(C45804HyK.LJJI(16), this.itemView.getPaddingTop(), C45804HyK.LJJI(16), this.itemView.getPaddingBottom());
        }
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.view.CCDCNormalElement");
        SD5 sd5 = (SD5) view;
        ElementDTO elementDTO = t.LJLILLLLZI.LIZ;
        PaymentMethod paymentMethod = t.LJLIL;
        sd5.setFocusChange(new AqS178S0100000_12(elementDTO, 603));
        sd5.setOnValueChange(new AqS116S0300000_12(this, paymentMethod, elementDTO, 40));
        sd5.setOnVerify(new AqS16S0500000_12(this, paymentMethod, elementDTO, sd5, t, 8));
        sd5.setOnErrorClear(new AqS162S0100000_12(t, 1168));
        sd5.setOnFocusChange(new AqS116S0300000_12(this, sd5, elementDTO, 41));
        sd5.getInputView().setIndicatorClickListener(new ACListenerS46S0200000_12(sd5, elementDTO, 55));
        ((C71731SDf) sd5.LIZIZ(R.id.eod)).setOnIndicatorVisibleChangeListener(new AqS143S0200000_12(this, elementDTO, 132));
        CCDCAddCardViewModel viewModel = getViewModel();
        String str = elementDTO.id;
        if (str == null) {
            str = "";
        }
        sd5.LIZ(elementDTO, paymentMethod, viewModel.jv0(str), t.LJLILLLLZI.LIZJ);
        if (o.LJ(t.LJLILLLLZI.LIZ.id, "eg_ccdc_global_cvv")) {
            sd5.getInputView().setInputType(2);
            sd5.getInputView().setMaxLength(4);
            if (C27500Aqm.LIZ()) {
                sd5.getInputView().setInputTextEncrypted(true);
            }
        } else {
            sd5.getInputView().setInputType(1);
            sd5.getInputView().setMaxLength(Integer.MAX_VALUE);
            sd5.getInputView().setInputTextEncrypted(false);
            ((TextView) sd5.LIZIZ(R.id.eof)).setSingleLine();
        }
        ((TextView) sd5.LIZIZ(R.id.eof)).setImeOptions(t.LJLJJL);
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
