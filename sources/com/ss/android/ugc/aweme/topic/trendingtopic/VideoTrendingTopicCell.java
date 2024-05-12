package com.ss.android.ugc.aweme.topic.trendingtopic;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C188727au;
import X.C1DI;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C244879jH;
import X.C244889jI;
import X.C244899jJ;
import X.C27713AuD;
import X.C27714AuE;
import X.C27715AuF;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C62846OlW;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C77123UOp;
import X.C78765Uvh;
import X.C8YN;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.C9RC;
import X.C9XN;
import X.FMX;
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
import X.SY4;
import X.TBT;
import X.TBW;
import X.YE1;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class VideoTrendingTopicCell<T extends C9RC> extends PowerCell<C9RC> implements KPL {
    public boolean LJLIL;
    public final C214298b3 LJLILLLLZI;

    public final void M() {
        String str;
        this.LJLIL = true;
        TextView textView = (TextView) this.itemView.findViewById(R.id.lhu);
        Context context = getContext();
        if (context != null) {
            str = context.getString(R.string.sk5);
        } else {
            str = null;
        }
        textView.setText(str);
        ((SY4) this.itemView.findViewById(R.id.lhu)).setEnabled(false);
        Context context2 = getContext();
        if (context2 != null) {
            ((TextView) this.itemView.findViewById(R.id.lhu)).setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context2));
        }
    }

    public final void N() {
        String str;
        this.LJLIL = false;
        TextView textView = (TextView) this.itemView.findViewById(R.id.lhu);
        Context context = getContext();
        if (context != null) {
            str = context.getString(R.string.sk4);
        } else {
            str = null;
        }
        textView.setText(str);
        ((SY4) this.itemView.findViewById(R.id.lhu)).setEnabled(true);
        Context context2 = getContext();
        if (context2 != null) {
            ((TextView) this.itemView.findViewById(R.id.lhu)).setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context2));
        }
    }

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
        C16880lQ.LJJIZ((SY4) this.itemView.findViewById(R.id.lhu), new ACListenerS24S0100000_4(this, 188));
        ((SY4) this.itemView.findViewById(R.id.lhu)).setSupportClickWhenDisable(true);
        this.itemView.findViewById(R.id.lhu).getClass();
        C8YN.LJII(this, L(), new TBT() { // from class: X.9R6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9R4) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4((VideoTrendingTopicCell) this, 203), 4);
    }

    public final VideoTrendingTopicListViewModel L() {
        return (VideoTrendingTopicListViewModel) this.LJLILLLLZI.getValue();
    }

    public VideoTrendingTopicCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoTrendingTopicListViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 877);
        C244879jH c244879jH = C244879jH.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27714AuE.INSTANCE, new AqS154S0100000_4(this, 878), new AqS154S0100000_4(this, 879), C244899jJ.INSTANCE, c244879jH, new AqS154S0100000_4(this, 880), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27715AuF.INSTANCE, new AqS154S0100000_4(this, 881), new AqS154S0100000_4(this, 872), C244889jI.INSTANCE, c244879jH, new AqS154S0100000_4(this, 873), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27713AuD.INSTANCE, new AqS154S0100000_4(this, 874), new AqS154S0100000_4(this, 875), new AqS154S0100000_4(this, 876), c244879jH, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLILLLLZI = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C9RC c9rc) {
        String str;
        Resources resources;
        String quantityString;
        Resources resources2;
        String quantityString2;
        C9RC item = c9rc;
        o.LJIIIZ(item, "item");
        View view = this.itemView;
        C78765Uvh.LJIIIZ((C62846OlW) view.findViewById(R.id.lhy), item.LJLIL.getEventImg(), -1, -1);
        ((TextView) view.findViewById(R.id.lib)).setText(item.LJLIL.getEventName());
        TextView textView = (TextView) view.findViewById(R.id.c9h);
        Context context = view.getContext();
        String str2 = null;
        if (context != null && (resources2 = context.getResources()) != null && (quantityString2 = resources2.getQuantityString(R.plurals.tp, (int) item.LJLIL.getTotalVideos())) != null) {
            String LJJIIJ = C77123UOp.LJJIIJ(item.LJLIL.getTotalViews());
            o.LJIIIIZZ(LJJIIJ, "getDisplayCount(item.topic.totalViews)");
            str = ujb.o.LJJJJZ(quantityString2, "%@", LJJIIJ, false);
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = (TextView) view.findViewById(R.id.c9g);
        Context context2 = view.getContext();
        if (context2 != null && (resources = context2.getResources()) != null && (quantityString = resources.getQuantityString(R.plurals.to, (int) item.LJLIL.getTotalVideos())) != null) {
            String LJJIIJ2 = C77123UOp.LJJIIJ(item.LJLIL.getTotalVideos());
            o.LJIIIIZZ(LJJIIJ2, "getDisplayCount(item.topic.totalVideos)");
            str2 = ujb.o.LJJJJZ(quantityString, "%@", LJJIIJ2, false);
        }
        textView2.setText(str2);
        VideoTrendingTopic videoTrendingTopic = item.LJLIL;
        VideoTrendingTopicListViewModel L = L();
        if (videoTrendingTopic != null) {
            VideoTrendingTopic videoTrendingTopic2 = L.LJLJLJ;
            if (videoTrendingTopic2 != null && videoTrendingTopic2.equals(videoTrendingTopic)) {
                M();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "video_post_page");
                c188727au.LJIIIZ("enter_method", "trends_selection_panel");
                c188727au.LJIIIZ("event_name", item.LJLIL.getEventName());
                c188727au.LJ(item.LJLIL.getEventId(), "event_id");
                c188727au.LJIIIZ("recall_source", "");
                c188727au.LJIIIZ("trends_type", L().LJLJJL);
                FMX.LJIIL("trends_event_show_al", c188727au.LIZ);
            }
        } else {
            L.getClass();
        }
        N();
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", "video_post_page");
        c188727au2.LJIIIZ("enter_method", "trends_selection_panel");
        c188727au2.LJIIIZ("event_name", item.LJLIL.getEventName());
        c188727au2.LJ(item.LJLIL.getEventId(), "event_id");
        c188727au2.LJIIIZ("recall_source", "");
        c188727au2.LJIIIZ("trends_type", L().LJLJJL);
        FMX.LJIIL("trends_event_show_al", c188727au2.LIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.dsd, viewGroup, false, "from(parent.context)\n   …opic_cell, parent, false)");
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
