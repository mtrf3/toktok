package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.search.detail.filter.viewmodel.FilterVM;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS171S0200000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KPI implements KPL, InterfaceC224598rf {
    public final DetailFragmentPanel LJLIL;
    public final KPL LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public KPH LJLJJI;
    public Integer LJLJJL;

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this.LJLILLLLZI.getActualLifecycleOwner();
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this.LJLILLLLZI.getActualLifecycleOwnerHolder();
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this.LJLILLLLZI.getActualReceiver();
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this.LJLILLLLZI.getActualReceiverHolder();
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return this.LJLILLLLZI.getHostLifecycleOwner();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLILLLLZI.getLifecycle();
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this.LJLILLLLZI.getOwnLifecycleOwner();
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return this.LJLILLLLZI.getReceiverForHostVM();
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return this.LJLILLLLZI.getUniqueOnlyDefault();
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> prop1, C56412MCa<C213178Yf<A>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> subscriber) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return this.LJLILLLLZI.selectSubscribe(assemViewModel, prop1, config, interfaceC88472Yns, subscriber);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, C56412MCa<C213198Yh<A, B>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> subscriber) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return this.LJLILLLLZI.selectSubscribe(assemViewModel, prop1, prop2, config, interfaceC88472Yns, subscriber);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, C56412MCa<OSK<A, B, C>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> subscriber) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return this.LJLILLLLZI.selectSubscribe(assemViewModel, prop1, prop2, prop3, config, interfaceC88472Yns, subscriber);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, C56412MCa<OSL<A, B, C, D>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> subscriber) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return this.LJLILLLLZI.selectSubscribe(assemViewModel, prop1, prop2, prop3, prop4, config, interfaceC88472Yns, subscriber);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, TBW<S, ? extends E> prop5, C56412MCa<OSM<A, B, C, D, E>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(prop5, "prop5");
        o.LJIIIZ(config, "config");
        return this.LJLILLLLZI.selectSubscribe(assemViewModel, prop1, prop2, prop3, prop4, prop5, config, interfaceC88472Yns, interfaceC88476Ynw);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> prop1, C56412MCa<C213178Yf<A>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> subscriber) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return this.LJLILLLLZI.selectSubscribeOnAsync(assemViewModel, prop1, config, interfaceC88472Yns, subscriber);
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> subscriber) {
        o.LJIIIZ(assemViewModel, "<this>");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return this.LJLILLLLZI.subscribe(assemViewModel, config, interfaceC88472Yns, subscriber);
    }

    public final FilterVM LJFF() {
        return (FilterVM) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC224598rf
    public final void LIZ(String str) {
        FilterVM LJFF = LJFF();
        if (str == null) {
            str = "";
        }
        KPQ kpq = new KPQ(str, false);
        LJFF.getClass();
        LJFF.setState(new AqS170S0100000_4(kpq, 964));
    }

    @Override // X.InterfaceC224598rf
    public final void LIZJ(String str) {
        FilterVM LJFF = LJFF();
        if (str == null) {
            str = "";
        }
        KPQ kpq = new KPQ(str, true);
        LJFF.getClass();
        LJFF.setState(new AqS170S0100000_4(kpq, 964));
    }

    @Override // X.InterfaceC224598rf
    public final void LIZLLL(InterfaceC224118qt interfaceC224118qt) {
        Integer num;
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initPanel, aid = ");
        LIZ.append(this.LJLIL.LJJLIL());
        LIZ.append(", items size: ");
        List<Aweme> LJJLL = this.LJLIL.LJJLL();
        Aweme aweme = null;
        if (LJJLL != null) {
            num = Integer.valueOf(LJJLL.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        FilterVM LJFF = LJFF();
        String LJJLIL = this.LJLIL.LJJLIL();
        o.LJIIIIZZ(LJJLIL, "originalPanel.aid");
        LJFF.getClass();
        LJFF.setState(new AqS29S1000000_4(LJJLIL, 27));
        List<Aweme> LJJLL2 = this.LJLIL.LJJLL();
        if (LJJLL2 != null) {
            Iterator<Aweme> it = LJJLL2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Aweme next = it.next();
                Aweme aweme2 = next;
                if (aweme2 != null) {
                    str = aweme2.getAid();
                } else {
                    str = null;
                }
                if (o.LJ(str, this.LJLIL.LJJLIL())) {
                    aweme = next;
                    break;
                }
            }
            Aweme aweme3 = aweme;
            if (aweme3 != null) {
                boolean LIZIZ = JI4.LIZIZ(aweme3);
                FilterVM LJFF2 = LJFF();
                LJFF2.getClass();
                LJFF2.setState(new AqS9S0010000_4(LIZIZ, 33));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("set initial filter is enable: ");
                LIZ2.append(LIZIZ);
                X1D.LIZIZ(LIZ2);
            }
        }
        this.LJLIL.addOnPageChangeListener(new KPK(this));
        C8YN.LJII(this, LJFF(), new TBT() { // from class: X.981
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C252449vU) obj).LJLLJ;
            }
        }, null, new AqS171S0200000_8(interfaceC224118qt, this, 3), 6);
        C8YN.LJII(this, LJFF(), new TBT() { // from class: X.KPO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C252449vU) obj).LJLJLJ;
            }
        }, null, new AqS190S0100000_8(this, 48), 6);
        C8YN.LJII(this, LJFF(), new TBT() { // from class: X.980
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((C252449vU) obj).LJLJJL);
            }
        }, C213688a4.LIZJ(), new AqS190S0100000_8(this, 49), 4);
    }

    public KPI(DetailFragmentPanel originalPanel, KPL iVMSubscriber) {
        o.LJIIIZ(originalPanel, "originalPanel");
        o.LJIIIZ(iVMSubscriber, "iVMSubscriber");
        this.LJLIL = originalPanel;
        this.LJLILLLLZI = iVMSubscriber;
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1488));
    }

    @Override // X.InterfaceC224598rf
    public final KPH LIZIZ(Context context, LayoutInflater inflater, InterfaceC72642tA listener, Fragment fragment, View.OnTouchListener tapTouchListener, BaseFeedPageParams baseFeedPageParams, Object iHandlePlay) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(tapTouchListener, "tapTouchListener");
        o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
        o.LJIIIZ(iHandlePlay, "iHandlePlay");
        KPH kph = new KPH(this, context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, (InterfaceC2302191t) iHandlePlay);
        this.LJLJJI = kph;
        return kph;
    }
}
