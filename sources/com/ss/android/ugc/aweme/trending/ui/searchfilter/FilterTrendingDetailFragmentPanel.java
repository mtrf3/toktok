package com.ss.android.ugc.aweme.trending.ui.searchfilter;

import X.AbstractC55082Lja;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C221108m2;
import X.C33Q;
import X.C3C8;
import X.C50420Jqa;
import X.C56412MCa;
import X.C62822Ol8;
import X.C76800UCe;
import X.C8YZ;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC224118qt;
import X.InterfaceC224598rf;
import X.InterfaceC224628ri;
import X.InterfaceC2302191t;
import X.InterfaceC51679KPz;
import X.InterfaceC72642tA;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPH;
import X.KPL;
import X.M89;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.trending.ui.TrendingDetailFragmentPanel;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FilterTrendingDetailFragmentPanel extends TrendingDetailFragmentPanel implements KPL {
    public final C62822Ol8 LLJJJJLIIL;

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

    @Override // com.ss.android.ugc.aweme.trending.ui.TrendingDetailFragmentPanel, com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh
    public final void initPanel() {
        Object obj;
        super.initPanel();
        InterfaceC224598rf interfaceC224598rf = (InterfaceC224598rf) this.LLJJJJLIIL.getValue();
        if (interfaceC224598rf != null) {
            InterfaceC51679KPz interfaceC51679KPz = this.LJLL;
            InterfaceC224118qt interfaceC224118qt = null;
            if (interfaceC51679KPz != null) {
                obj = interfaceC51679KPz.getViewModel();
            } else {
                obj = null;
            }
            if (obj instanceof InterfaceC224118qt) {
                interfaceC224118qt = (InterfaceC224118qt) obj;
            }
            interfaceC224598rf.LIZLLL(interfaceC224118qt);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final void onPlaying(String str) {
        InterfaceC224598rf interfaceC224598rf = (InterfaceC224598rf) this.LLJJJJLIIL.getValue();
        if (interfaceC224598rf != null) {
            interfaceC224598rf.LIZJ(str);
        }
        super.onPlaying(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final void onVideoPaused(String str) {
        InterfaceC224598rf interfaceC224598rf = (InterfaceC224598rf) this.LLJJJJLIIL.getValue();
        if (interfaceC224598rf != null) {
            interfaceC224598rf.LIZ(str);
        }
        super.onVideoPaused(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterTrendingDetailFragmentPanel(InterfaceC224628ri delegate, M89 feedParam) {
        super(delegate, feedParam);
        o.LJIIIZ(delegate, "delegate");
        o.LJIIIZ(feedParam, "feedParam");
        this.LLJJJJLIIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1130));
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

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final AbstractC55082Lja createFeedPagerAdapter(Context context, LayoutInflater inflater, InterfaceC72642tA<C50420Jqa> listener, Fragment fragment, View.OnTouchListener tapTouchListener, BaseFeedPageParams baseFeedPageParams, InterfaceC2302191t iHandlePlay) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(tapTouchListener, "tapTouchListener");
        o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
        o.LJIIIZ(iHandlePlay, "iHandlePlay");
        InterfaceC224598rf interfaceC224598rf = (InterfaceC224598rf) this.LLJJJJLIIL.getValue();
        KPH kph = null;
        if (interfaceC224598rf != null) {
            kph = interfaceC224598rf.LIZIZ(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay);
        }
        if (!(kph instanceof AbstractC55082Lja) || kph == null) {
            return super.createFeedPagerAdapter(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay);
        }
        return kph;
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
