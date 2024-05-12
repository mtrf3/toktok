package com.ss.android.ugc.aweme.profile.ui.pager;

import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C244939jN;
import X.C244949jO;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C76800UCe;
import X.C8YZ;
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
import X.TBW;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAwemeListSubscriber implements GenericLifecycleObserver, KPL {
    public final AwemeListFragmentImpl LJLIL;

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
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (X.C235099Kn.LIZ() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008d, code lost:
    
        r1 = r6.LJLIL.LLJLILLLLZIIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
    
        if (r1 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        r0 = (X.InterfaceC238569Xw) X.C8VC.LJI(r1, X.C65352Pkq.LIZ(X.InterfaceC238569Xw.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        if (r0 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        return r0.H8();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
    
        r0 = r6.LJLIL.LLJLILLLLZIIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r0 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r0 = X.C212428Vi.LIZIZ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        if (r0 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        r0 = r0.LJLLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        if (r0 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        r5 = r0.iterator();
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        if (r5.hasNext() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0045, code lost:
    
        r1 = r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004d, code lost:
    
        if ((r1 instanceof com.ss.android.ugc.profile.platform.base.assemble.ProfileRootComponent) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        r0 = X.C212428Vi.LIZJ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0053, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r0 = r0.LJLLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0059, code lost:
    
        r2 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0061, code lost:
    
        if (r2.hasNext() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0063, code lost:
    
        r1 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006b, code lost:
    
        if ((r1 instanceof com.ss.android.ugc.profile.platform.business.tabs.container.MineAwemePagerAssemV2) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006f, code lost:
    
        if ((r1 instanceof com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0071, code lost:
    
        r0 = (X.InterfaceC238569Xw) X.C8VC.LJII(r1, X.C65352Pkq.LIZ(X.InterfaceC238569Xw.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007d, code lost:
    
        if (r0 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0084, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007f, code lost:
    
        r4 = r0.H8();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0086, code lost:
    
        if (r1 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0.L7() == true) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r1 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerVM LIZ() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl r0 = r6.LJLIL
            androidx.fragment.app.Fragment r0 = r0.LLJLILLLLZIIL
            r3 = 0
            if (r0 == 0) goto L89
            X.Lm3 r1 = X.C55230Lly.LIZJ(r0, r3)
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility> r0 = com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility.class
            X.2K0 r0 = X.C55096Ljo.LIZ(r1, r0, r3)
            com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility r0 = (com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility) r0
            if (r0 == 0) goto L89
            boolean r0 = r0.L7()
            r1 = 1
            if (r0 != r1) goto L89
        L1c:
            boolean r0 = X.AXO.LIZ()
            if (r0 == 0) goto L86
            if (r1 != 0) goto L2a
        L24:
            boolean r0 = X.C235099Kn.LIZ()
            if (r0 == 0) goto L8d
        L2a:
            com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl r0 = r6.LJLIL
            androidx.fragment.app.Fragment r0 = r0.LLJLILLLLZIIL
            if (r0 == 0) goto La5
            com.bytedance.assem.arch.core.AssemSupervisor r0 = X.C212428Vi.LIZIZ(r0)
            if (r0 == 0) goto La5
            java.util.concurrent.CopyOnWriteArrayList<X.8W0> r0 = r0.LJLLI
            if (r0 == 0) goto La5
            java.util.Iterator r5 = r0.iterator()
            r4 = r3
        L3f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r1 = r5.next()
            X.8W0 r1 = (X.C8W0) r1
            boolean r0 = r1 instanceof com.ss.android.ugc.profile.platform.base.assemble.ProfileRootComponent
            if (r0 == 0) goto L3f
            com.bytedance.assem.arch.core.AssemSupervisor r0 = X.C212428Vi.LIZJ(r1)
            if (r0 == 0) goto L3f
            java.util.concurrent.CopyOnWriteArrayList<X.8W0> r0 = r0.LJLLI
            if (r0 == 0) goto L3f
            java.util.Iterator r2 = r0.iterator()
        L5d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r1 = r2.next()
            X.8W0 r1 = (X.C8W0) r1
            boolean r0 = r1 instanceof com.ss.android.ugc.profile.platform.business.tabs.container.MineAwemePagerAssemV2
            if (r0 != 0) goto L71
            boolean r0 = r1 instanceof com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2
            if (r0 == 0) goto L5d
        L71:
            java.lang.Class<X.9Xw> r0 = X.InterfaceC238569Xw.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            X.8V9 r0 = X.C8VC.LJII(r1, r0)
            X.9Xw r0 = (X.InterfaceC238569Xw) r0
            if (r0 == 0) goto L84
            com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerVM r4 = r0.H8()
            goto L5d
        L84:
            r4 = r3
            goto L5d
        L86:
            if (r1 != 0) goto L8d
            goto L24
        L89:
            r1 = 0
            goto L1c
        L8b:
            r3 = r4
            goto La5
        L8d:
            com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl r0 = r6.LJLIL
            androidx.fragment.app.Fragment r1 = r0.LLJLILLLLZIIL
            if (r1 == 0) goto La5
            java.lang.Class<X.9Xw> r0 = X.InterfaceC238569Xw.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            X.8V9 r0 = X.C8VC.LJI(r1, r0)
            X.9Xw r0 = (X.InterfaceC238569Xw) r0
            if (r0 == 0) goto La5
            com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerVM r3 = r0.H8()
        La5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.pager.ProfileAwemeListSubscriber.LIZ():com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerVM");
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.LJLIL.getLifecycle();
        o.LJIIIIZZ(lifecycle, "fragment.lifecycle");
        return lifecycle;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        C244949jO c244949jO = C244949jO.LJLIL;
        int i = this.LJLIL.LJLL;
        if (i != 0 && i != 1 && i != 14) {
            return;
        }
        c244949jO.invoke(new C244939jN(i));
    }

    public ProfileAwemeListSubscriber(AwemeListFragmentImpl fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = fragment;
        getLifecycle().addObserver(this);
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
