package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist;

import X.C16880lQ;
import X.C19N;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C29701Eo;
import X.C31811Ce7;
import X.C33Q;
import X.C3C8;
import X.C4HZ;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71608S8m;
import X.C71609S8n;
import X.C71610S8o;
import X.C71611S8p;
import X.C71612S8q;
import X.C71613S8r;
import X.C71614S8s;
import X.C71615S8t;
import X.C71616S8u;
import X.C71617S8v;
import X.C71618S8w;
import X.C71619S8x;
import X.C76800UCe;
import X.C77339UWx;
import X.C79234V7u;
import X.C86V;
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
import X.ORZ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OUP;
import X.S7I;
import X.SY4;
import X.TBW;
import X.YE1;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel;
import com.ss.android.ugc.aweme.utils.Au2S11S0300000_12;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class BaseTemplateCell<T extends TemplateItem> extends PowerCell<T> implements KPL, S7I {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;

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

    public final BillboardGlobalViewModel M() {
        return (BillboardGlobalViewModel) this.LJLIL.getValue();
    }

    public final TemplateListViewModel N() {
        return (TemplateListViewModel) this.LJLILLLLZI.getValue();
    }

    public BaseTemplateCell() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BillboardGlobalViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 666);
        C71615S8t c71615S8t = C71615S8t.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C71608S8m.INSTANCE, new AqS162S0100000_12(this, 656), new AqS162S0100000_12(this, 658), C71617S8v.INSTANCE, c71615S8t, new AqS162S0100000_12(this, 660), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C71610S8o.INSTANCE, new AqS162S0100000_12(this, 662), new AqS162S0100000_12(this, 657), C71616S8u.INSTANCE, c71615S8t, new AqS162S0100000_12(this, 659), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C71609S8n.INSTANCE, new AqS162S0100000_12(this, 661), new AqS162S0100000_12(this, 663), new AqS162S0100000_12(this, 664), c71615S8t, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(TemplateListViewModel.class);
        AqS162S0100000_12 aqS162S0100000_122 = new AqS162S0100000_12(LIZ2, 665);
        C71614S8s c71614S8s = C71614S8s.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b32 = new C214298b3(LIZ2, aqS162S0100000_122, C71611S8p.INSTANCE, new AqS162S0100000_12(this, 667), new AqS162S0100000_12(this, 668), C71618S8w.INSTANCE, c71614S8s, new AqS162S0100000_12(this, 669), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b32 = new C214298b3(LIZ2, aqS162S0100000_122, C71612S8q.INSTANCE, new AqS162S0100000_12(this, 670), new AqS162S0100000_12(this, 671), C71619S8x.INSTANCE, c71614S8s, new AqS162S0100000_12(this, 672), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b32 = new C214298b3(LIZ2, aqS162S0100000_122, C71613S8r.INSTANCE, new AqS162S0100000_12(this, 673), new AqS162S0100000_12(this, 674), new AqS162S0100000_12(this, 675), c71614S8s, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLILLLLZI = c214298b32;
    }

    @Override // X.S7I
    public final void I(TemplateItem newItem) {
        TemplateItem templateItem;
        o.LJIIIZ(newItem, "newItem");
        Fragment LJIIIZ = C79234V7u.LJIIIZ(this.itemView);
        if (LJIIIZ != null) {
            C31811Ce7.LIZJ(LJIIIZ, R.string.q9j);
        }
        List<ITEM> listGetAll = N().listGetAll();
        if (listGetAll != 0) {
            int i = 0;
            int i2 = 0;
            for (ITEM item : listGetAll) {
                if ((item instanceof TemplateItem) && o.LJ(((TemplateItem) item).getTemplateId(), newItem.getTemplateId())) {
                    if (i2 >= 0 && i2 < listGetAll.size()) {
                        ArrayList arrayList = new ArrayList(listGetAll);
                        ListProtector.remove(arrayList, i2);
                        Object LJLLLLLL = ORZ.LJLLLLLL(0, arrayList);
                        if ((LJLLLLLL instanceof TemplateItem) && (templateItem = (TemplateItem) LJLLLLLL) != null && templateItem.LLJLLIL()) {
                            i = 1;
                        }
                        ListProtector.add(arrayList, i, newItem);
                        N().listSetItems(arrayList);
                        return;
                    }
                    return;
                }
                i2++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void L(android.view.View r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.BaseTemplateCell.L(android.view.View, java.util.List):void");
    }

    public final void P(C4HZ c4hz, TemplateItem item) {
        o.LJIIIZ(item, "item");
        if (item.LLJLLIL()) {
            View findViewById = this.itemView.findViewById(R.id.ex6);
            o.LJIIIIZZ(findViewById, "itemView.ivUsingBg");
            OUP.LJJLIIIJ(findViewById);
            this.itemView.findViewById(R.id.ex6).setBackgroundResource(R.drawable.apb);
            View findViewById2 = this.itemView.findViewById(R.id.dbt);
            o.LJIIIIZZ(findViewById2, "itemView.flLottieContainer");
            OUP.LJJLIIIJ(findViewById2);
            View findViewById3 = this.itemView.findViewById(R.id.g_v);
            o.LJIIIIZZ(findViewById3, "itemView.lottieUsing");
            OUP.LJJLIIIJ(findViewById3);
            ((C29701Eo) this.itemView.findViewById(R.id.g_v)).playAnimation();
            ((TextView) this.itemView.findViewById(R.id.au9)).setText(C86V.LJFF(R.string.j1));
            Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.go);
            if (LIZIZ != null) {
                ((TextView) this.itemView.findViewById(R.id.au9)).setTextColor(LIZIZ.intValue());
            }
            ((SY4) this.itemView.findViewById(R.id.au9)).setButtonVariant(5);
            View findViewById4 = this.itemView.findViewById(R.id.au9);
            o.LJIIIIZZ(findViewById4, "itemView.btnDisplay");
            C16880lQ.LJIIJ(new Au2S19S0200000_12(this, item, 33, 42), findViewById4);
            return;
        }
        View findViewById5 = this.itemView.findViewById(R.id.ex6);
        o.LJIIIIZZ(findViewById5, "itemView.ivUsingBg");
        OUP.LJIJJLI(findViewById5);
        this.itemView.findViewById(R.id.ex6).setBackgroundResource(0);
        View findViewById6 = this.itemView.findViewById(R.id.dbt);
        o.LJIIIIZZ(findViewById6, "itemView.flLottieContainer");
        OUP.LJIJJLI(findViewById6);
        ((C29701Eo) this.itemView.findViewById(R.id.g_v)).cancelAnimation();
        View findViewById7 = this.itemView.findViewById(R.id.g_v);
        o.LJIIIIZZ(findViewById7, "itemView.lottieUsing");
        OUP.LJIJJLI(findViewById7);
        ((TextView) this.itemView.findViewById(R.id.au9)).setText(C86V.LJFF(R.string.ekz));
        Integer LIZIZ2 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.dj);
        if (LIZIZ2 != null) {
            ((TextView) this.itemView.findViewById(R.id.au9)).setTextColor(LIZIZ2.intValue());
        }
        ((SY4) this.itemView.findViewById(R.id.au9)).setButtonVariant(0);
        View findViewById8 = this.itemView.findViewById(R.id.au9);
        o.LJIIIIZZ(findViewById8, "itemView.btnDisplay");
        C16880lQ.LJIIJ(new Au2S11S0300000_12(this, c4hz, item, 12), findViewById8);
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
