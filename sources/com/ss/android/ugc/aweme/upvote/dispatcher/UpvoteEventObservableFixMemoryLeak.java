package com.ss.android.ugc.aweme.upvote.dispatcher;

import X.ActivityC45651qj;
import X.C181577Ar;
import X.C181627Aw;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214378bB;
import X.C214528bQ;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65777Prh;
import X.C76800UCe;
import X.C78926UyI;
import X.C7B1;
import X.C8YN;
import X.C8YZ;
import X.InterfaceC174526t6;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
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
import X.TBT;
import X.TBW;
import android.app.Activity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UpvoteEventObservableFixMemoryLeak implements GenericLifecycleObserver, InterfaceC174526t6, KPL {
    public static final Map<Integer, InterfaceC174526t6> LJLJI = new LinkedHashMap();
    public final WeakReference<LifecycleOwner> LJLIL;
    public final List<C7B1> LJLILLLLZI = new ArrayList();

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

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = this.LJLIL.get();
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            return lifecycle;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Integer num;
        ((ArrayList) this.LJLILLLLZI).clear();
        Map<Integer, InterfaceC174526t6> map = LJLJI;
        LifecycleOwner lifecycleOwner = this.LJLIL.get();
        if (lifecycleOwner != null) {
            num = Integer.valueOf(lifecycleOwner.hashCode());
        } else {
            num = null;
        }
        C65777Prh.LIZJ(map).remove(num);
    }

    public UpvoteEventObservableFixMemoryLeak(WeakReference<LifecycleOwner> weakReference) {
        ActivityC45651qj activityC45651qj;
        Lifecycle lifecycle;
        this.LJLIL = weakReference;
        LifecycleOwner lifecycleOwner = weakReference.get();
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        Activity topActivity = ActivityStack.getTopActivity();
        if (!(topActivity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) topActivity) == null) {
            return;
        }
        C214378bB c214378bB = new C214378bB(C65352Pkq.LIZ(UpvotePublishVM.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C184077Kh.LJLIL, C181577Ar.INSTANCE, C78926UyI.LJIIJJI(activityC45651qj), C78926UyI.LJIILL(activityC45651qj));
        C8YN.LJII(this, c214378bB.getValue(), new TBT() { // from class: X.7Ay
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C181627Aw) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS166S0200000_3(this, (UpvoteEventObservableFixMemoryLeak) c214378bB, (C214378bB<C181627Aw, UpvotePublishVM>) 30), 4);
        C8YN.LJII(this, c214378bB.getValue(), new TBT() { // from class: X.7Ap
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C181627Aw) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS166S0200000_3(this, (UpvoteEventObservableFixMemoryLeak) c214378bB, (C214378bB<C181627Aw, UpvotePublishVM>) 31), 4);
    }

    @Override // X.InterfaceC174526t6
    public final void LIZ(C7B1 observer) {
        o.LJIIIZ(observer, "observer");
        ((ArrayList) this.LJLILLLLZI).remove(observer);
    }

    @Override // X.InterfaceC174526t6
    public final void LIZIZ(C7B1 c7b1) {
        if (!((ArrayList) this.LJLILLLLZI).contains(c7b1)) {
            ((ArrayList) this.LJLILLLLZI).add(c7b1);
        }
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
