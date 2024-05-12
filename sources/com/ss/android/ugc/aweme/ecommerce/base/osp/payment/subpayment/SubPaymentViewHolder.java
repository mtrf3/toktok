package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment;

import X.C16880lQ;
import X.C1DI;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C63044Ooi;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71767SEp;
import X.C71776SEy;
import X.C71777SEz;
import X.C76800UCe;
import X.C77339UWx;
import X.C78685UuP;
import X.C79045V0n;
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
import X.KL2;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OUP;
import X.SF0;
import X.SF1;
import X.SF2;
import X.SF3;
import X.TBW;
import X.W5F;
import X.W5U;
import Y.ARunnableS13S1100000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SubPaymentViewHolder extends PowerCell<C71767SEp> implements KPL {
    public final C214298b3 LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

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

    public SubPaymentViewHolder() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SubPaymentListViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 355);
        SF1 sf1 = SF1.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C71777SEz.INSTANCE, new AqS162S0100000_12(this, 356), new AqS162S0100000_12(this, 357), SF3.INSTANCE, sf1, new AqS162S0100000_12(this, 358), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SF0.INSTANCE, new AqS162S0100000_12(this, 359), new AqS162S0100000_12(this, 350), SF2.INSTANCE, sf1, new AqS162S0100000_12(this, 351), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C71776SEy.INSTANCE, new AqS162S0100000_12(this, 352), new AqS162S0100000_12(this, 353), new AqS162S0100000_12(this, 354), sf1, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = c214298b3;
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view == null) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            View findViewById = itemView.findViewById(i);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C71767SEp c71767SEp) {
        String str;
        Availability availability;
        C71767SEp t = c71767SEp;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        ((C63044Ooi) _$_findCachedViewById(R.id.ilo)).setChecked(t.LJLJI);
        ((TextView) _$_findCachedViewById(R.id.ly0)).setText(t.LJLILLLLZI.displayName);
        String str2 = t.LJLILLLLZI.iconUrl;
        Drawable drawable = null;
        if (str2 != null) {
            Context context = getContext();
            if (context != null) {
                drawable = C79045V0n.LJIIIIZZ(R.attr.cv, context);
            }
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
            LJIIIIZZ.LJIILIIL = drawable;
            LJIIIIZZ.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.ex2);
            C16880lQ.LLJJJ(LJIIIIZZ);
        }
        PaymentMethod paymentMethod = t.LJLILLLLZI;
        String LJII = paymentMethod.LJII();
        if (LJII != null && C78685UuP.LJJJZ(LJII)) {
            str = paymentMethod.LJII();
        } else {
            str = paymentMethod.extraInfo;
        }
        if (str != null && str.length() > 0) {
            View tvExtraInfoRight = _$_findCachedViewById(R.id.lwg);
            o.LJIIIIZZ(tvExtraInfoRight, "tvExtraInfoRight");
            KL2.LJIILLIIL(4, tvExtraInfoRight);
            ((TextView) _$_findCachedViewById(R.id.lwg)).setText(str);
            View _$_findCachedViewById = _$_findCachedViewById(R.id.lwg);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.post(new ARunnableS13S1100000_12(this, str, 4));
            }
        } else {
            View tvExtraInfoRight2 = _$_findCachedViewById(R.id.lwg);
            o.LJIIIIZZ(tvExtraInfoRight2, "tvExtraInfoRight");
            OUP.LJIJJLI(tvExtraInfoRight2);
            View tvExtraInfoBelow = _$_findCachedViewById(R.id.lwf);
            o.LJIIIIZZ(tvExtraInfoBelow, "tvExtraInfoBelow");
            OUP.LJIJJLI(tvExtraInfoBelow);
        }
        String str3 = t.LJLILLLLZI.balance;
        if (str3 != null && str3.length() > 0) {
            if (t.LJLJI || ((availability = t.LJLILLLLZI.availability) != null && o.LJ(availability.isAvailable, Boolean.FALSE))) {
                ((TextView) _$_findCachedViewById(R.id.lvj)).setText(str3);
                View tvBalance = _$_findCachedViewById(R.id.lvj);
                o.LJIIIIZZ(tvBalance, "tvBalance");
                OUP.LJJLIIIJ(tvBalance);
            } else {
                View tvBalance2 = _$_findCachedViewById(R.id.lvj);
                o.LJIIIIZZ(tvBalance2, "tvBalance");
                OUP.LJIJJLI(tvBalance2);
            }
        } else {
            View tvBalance3 = _$_findCachedViewById(R.id.lvj);
            o.LJIIIIZZ(tvBalance3, "tvBalance");
            OUP.LJIJJLI(tvBalance3);
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setEnabled(true);
        _$_findCachedViewById(R.id.ex2).setAlpha(1.0f);
        ((TuxTextView) _$_findCachedViewById(R.id.ly0)).setTextColorRes(R.attr.go);
        ((TuxTextView) _$_findCachedViewById(R.id.lwg)).setTextColorRes(R.attr.eb);
        ((TuxTextView) _$_findCachedViewById(R.id.lwf)).setTextColorRes(R.attr.eb);
        Availability availability2 = t.LJLILLLLZI.availability;
        if (availability2 != null && o.LJ(availability2.isAvailable, Boolean.FALSE)) {
            ((TuxTextView) _$_findCachedViewById(R.id.ly0)).setTextColorRes(R.attr.gp);
            ((TuxTextView) _$_findCachedViewById(R.id.lwg)).setTextColorRes(R.attr.gp);
            ((TuxTextView) _$_findCachedViewById(R.id.lwf)).setTextColorRes(R.attr.gp);
            _$_findCachedViewById(R.id.ex2).setAlpha(0.3f);
            View itemView2 = this.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            itemView2.setEnabled(false);
        }
        View itemView3 = this.itemView;
        o.LJIIIIZZ(itemView3, "itemView");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, t, 58, 42), itemView3);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.a1t, viewGroup, false, "from(parent.context)\n   …b_payment, parent, false)");
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
