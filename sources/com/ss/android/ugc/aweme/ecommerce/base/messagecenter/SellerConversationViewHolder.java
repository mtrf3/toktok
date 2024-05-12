package com.ss.android.ugc.aweme.ecommerce.base.messagecenter;

import X.AVS;
import X.AbstractC029409q;
import X.C018905p;
import X.C06490Nh;
import X.C111434Yx;
import X.C12460eI;
import X.C16880lQ;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C27474AqM;
import X.C32151Nz;
import X.C33Q;
import X.C3C8;
import X.C45804HyK;
import X.C56412MCa;
import X.C57105Mb7;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71778SFa;
import X.C71779SFb;
import X.C71780SFc;
import X.C71781SFd;
import X.C71782SFe;
import X.C71783SFf;
import X.C71784SFg;
import X.C76800UCe;
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
import X.OUP;
import X.S3I;
import X.S3L;
import X.TBW;
import X.W5F;
import X.W5U;
import X.YE1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.StoreSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.showcase.ECommerceShowcaseService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SellerConversationViewHolder extends PowerCell<C111434Yx> implements KPL {
    public final C214298b3 LJLIL;
    public C27474AqM LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

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

    public SellerConversationViewHolder() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MessageCenterViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 215);
        C71782SFe c71782SFe = C71782SFe.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C71780SFc.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 216), new AqS162S0100000_12((InterfaceC93923mO) this, 217), C71784SFg.INSTANCE, c71782SFe, new AqS162S0100000_12((InterfaceC93923mO) this, 218), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C71781SFd.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 219), new AqS162S0100000_12((InterfaceC93923mO) this, 210), C71783SFf.INSTANCE, c71782SFe, new AqS162S0100000_12((InterfaceC93923mO) this, 211), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C71779SFb.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 212), new AqS162S0100000_12((InterfaceC93923mO) this, 213), new AqS162S0100000_12((InterfaceC93923mO) this, 214), c71782SFe, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
    public final void onBindItemView(C111434Yx c111434Yx) {
        int i;
        int i2;
        StoreSellingPoint storeSellingPoint;
        C111434Yx t = c111434Yx;
        o.LJIIIZ(t, "t");
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        ((ViewGroup) itemView.findViewById(R.id.ina)).removeAllViews();
        ((TextView) _$_findCachedViewById(R.id.mby)).setText(t.LJLJI);
        ((TextView) _$_findCachedViewById(R.id.bst)).setText(t.LJLJJI);
        Long l = t.LJLJJL;
        if (l != null) {
            ((TextView) _$_findCachedViewById(R.id.time)).setText(C57105Mb7.LIZJ(l.longValue(), this.itemView.getContext()));
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.time);
        int i3 = 8;
        if (t.LJLJJL != null) {
            i = 0;
        } else {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
        Integer num = t.LJLJJLL;
        if (num != null) {
            ((AVS) _$_findCachedViewById(R.id.mu1)).setCount(num.intValue());
        }
        if (t.LJLJLLL) {
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.mby).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((C018905p) layoutParams).endToStart = _$_findCachedViewById(R.id.m2l).getId();
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.m2l));
        } else {
            View tv_collaborator = _$_findCachedViewById(R.id.m2l);
            o.LJIIIIZZ(tv_collaborator, "tv_collaborator");
            OUP.LJIJJLI(tv_collaborator);
        }
        C27474AqM c27474AqM = this.LJLILLLLZI;
        if (c27474AqM != null && c27474AqM.LJLJJL && (storeSellingPoint = t.LJLL) != null) {
            IECommerceShowcaseService LJIIIZ = ECommerceShowcaseService.LJIIIZ();
            View itemView2 = this.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            View findViewById = itemView2.findViewById(R.id.g4o);
            o.LJIIIIZZ(findViewById, "containerView.ll_name");
            View LIZJ = LJIIIZ.LIZJ(findViewById, storeSellingPoint.rateDisplayStyle, storeSellingPoint.shopRatingDisplay, storeSellingPoint.expRatePercentile, storeSellingPoint.showRateNotApplicable);
            if (LIZJ != null) {
                ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.mby).getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((C018905p) layoutParams2).endToStart = _$_findCachedViewById(R.id.ina).getId();
                View itemView3 = this.itemView;
                o.LJIIIIZZ(itemView3, "itemView");
                ((ViewGroup) itemView3.findViewById(R.id.ina)).addView(LIZJ);
                View itemView4 = this.itemView;
                o.LJIIIIZZ(itemView4, "itemView");
                View findViewById2 = itemView4.findViewById(R.id.ina);
                o.LJIIIIZZ(findViewById2, "containerView.rating_container");
                findViewById2.setVisibility(0);
            }
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.mu1);
        Integer num2 = t.LJLJJLL;
        if (num2 != null && num2.intValue() > 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        _$_findCachedViewById2.setVisibility(i2);
        String str = t.LJLILLLLZI;
        if (str != null) {
            W5F LJFF = W5U.LJFF(UriProtector.parse(str));
            S3I s3i = new S3I();
            s3i.LIZLLL = C45804HyK.LJJ(28);
            s3i.LIZ = false;
            float LJIIZILJ = C32151Nz.LJIIZILJ(Double.valueOf(0.5d));
            s3i.LIZJ = R.attr.dz;
            s3i.LIZIZ = LJIIZILJ;
            LJFF.LJIJJLI = new S3L(s3i);
            LJFF.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.abh);
            C16880lQ.LLJJJ(LJFF);
        }
        this.itemView.setTag(Integer.valueOf(getBindingAdapterPosition()));
        AbstractC029409q<? extends RecyclerView.ViewHolder> bindingAdapter = getBindingAdapter();
        if (bindingAdapter != null) {
            int itemCount = bindingAdapter.getItemCount();
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.cd4);
            if (getBindingAdapterPosition() != itemCount - 1) {
                i3 = 0;
            }
            _$_findCachedViewById3.setVisibility(i3);
        }
        View itemView5 = this.itemView;
        o.LJIIIIZZ(itemView5, "itemView");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(t, this, 2, 42), itemView5);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.a0e, viewGroup, false);
        this.LJLILLLLZI = ((MessageCenterViewModel) this.LJLIL.getValue()).LJLJJLL;
        o.LJIIIIZZ(view, "view");
        C12460eI.LIZJ(view, new C71778SFa(this));
        return view;
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
