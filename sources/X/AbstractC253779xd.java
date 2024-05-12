package X;

import Y.ARunnableS15S0300000_4;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserPopupVM;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS72S1100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9xd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC253779xd implements InterfaceC25781A9x, KPL, InterfaceC57910Mo6 {
    public AbstractC25774A9q LJLIL;
    public TuxIconView LJLJI;
    public RecUserPopupVM LJLJJL;
    public ActivityC45651qj LJLJJLL;
    public boolean LJLJLJ;
    public InterfaceC88472Yns<? super C57778Mly, C76800UCe> LJLJLLL;
    public final AtomicBoolean LJLILLLLZI = new AtomicBoolean(false);
    public boolean LJLJJI = true;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1192));
    public String LJLL = "";
    public final CopyOnWriteArrayList<InterfaceC65784Pro<C76800UCe>> LJLLI = new CopyOnWriteArrayList<>();

    public abstract void LIZIZ(Bundle bundle, ActivityC45651qj activityC45651qj);

    @Override // X.InterfaceC25781A9x
    public final void destroy() {
        this.LJLJLLL = null;
        LJI(new AqS154S0100000_4(this, 1190));
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

    @Override // X.InterfaceC25781A9x
    public final C57778Mly LIZ() {
        if (this.LJLIL != null) {
            return LIZLLL().getCurrentState();
        }
        return null;
    }

    public final ActivityC45651qj LIZJ() {
        ActivityC45651qj activityC45651qj = this.LJLJJLL;
        if (activityC45651qj != null) {
            return activityC45651qj;
        }
        o.LJIJI("hostActivity");
        throw null;
    }

    public final AbstractC25774A9q LIZLLL() {
        AbstractC25774A9q abstractC25774A9q = this.LJLIL;
        if (abstractC25774A9q != null) {
            return abstractC25774A9q;
        }
        o.LJIJI("userCardLayout");
        throw null;
    }

    public final RecUserPopupVM LJFF() {
        RecUserPopupVM recUserPopupVM = this.LJLJJL;
        if (recUserPopupVM != null) {
            return recUserPopupVM;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    @Override // X.InterfaceC25781A9x
    public final void LJIIL() {
        LJI(new AqS154S0100000_4(this, 1191));
    }

    @Override // X.InterfaceC25781A9x
    public final void LJIILLIIL() {
        LJI(new AqS154S0100000_4(this, 1193));
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = LIZJ().getLifecycle();
        o.LJIIIIZZ(lifecycle, "hostActivity.lifecycle");
        return lifecycle;
    }

    public final void LJI(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (this.LJLILLLLZI.get()) {
            interfaceC65784Pro.invoke();
        } else {
            this.LJLLI.add(interfaceC65784Pro);
        }
    }

    public final void LJII(boolean z) {
        int i;
        this.LJLJJI = z;
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            tuxIconView.setVisibility(i);
        }
    }

    @Override // X.InterfaceC25781A9x
    public final void LJIILIIL(InterfaceC88472Yns<? super C57778Mly, C76800UCe> interfaceC88472Yns) {
        this.LJLJLLL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC25781A9x
    public final void LJIILJJIL(InterfaceC57910Mo6 listener) {
        o.LJIIIZ(listener, "listener");
        LJI(new AqS151S0200000_4(this, listener, 45));
    }

    @Override // X.InterfaceC25781A9x
    public final void LJIJI(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        LJI(new AqS72S1100000_4(this, enterFrom, 5));
        this.LJLL = enterFrom;
    }

    @Override // X.InterfaceC25781A9x
    public final void LJIILL(Bundle bundle, ActivityC45651qj host) {
        o.LJIIIZ(host, "host");
        this.LJLJJLL = host;
        String string = bundle.getString("enter_from", "");
        o.LJIIIIZZ(string, "extra.getString(Mob.Key.ENTER_FROM, \"\")");
        this.LJLL = string;
        if (bundle.getBoolean("use_async_init", false)) {
            C38995FSd.LIZJ().execute(new ARunnableS15S0300000_4(this, host, bundle, 11));
        } else {
            LIZIZ(bundle, host);
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
