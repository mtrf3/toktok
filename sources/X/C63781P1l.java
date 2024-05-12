package X;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.relation.auth.widget.cell.FacebookMaFCell;
import com.ss.android.ugc.aweme.relation.auth.widget.fb.FacebookMaFWidgetVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.P1l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63781P1l extends AbstractC63795P1z implements KPL, InterfaceC03360Bg {
    public C84773Uj LJLIL;
    public View LJLILLLLZI;
    public SwipeRefreshLayout LJLJI;
    public C73305Spp LJLJJI;
    public SYL LJLJJLL;
    public P1V LJLJLJ;
    public FacebookMaFWidgetVM LJLL;
    public InterfaceC65784Pro<Boolean> LJLLI;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 470));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 471));
    public final C63782P1m LJLJLLL = new C63782P1m(FacebookMaFCell.class);

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

    public final void LIZ() {
        C73305Spp c73305Spp = this.LJLJJI;
        if (c73305Spp != null) {
            P1V p1v = this.LJLJLJ;
            if (p1v != null) {
                C73306Spq c73306Spq = p1v.LJI;
                if (c73306Spq == null) {
                    c73306Spq = new C73306Spq();
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_color_facebook_circle;
                    c73306Spq.LIZJ = 0;
                    c73306Spq.LIZIZ = c2068389v;
                    int LIZIZ = C7MY.LIZIZ(72);
                    int LIZIZ2 = C7MY.LIZIZ(72);
                    c73306Spq.LIZLLL = LIZIZ;
                    c73306Spq.LJ = LIZIZ2;
                    String LJFF = C86V.LJFF(R.string.ghr);
                    o.LJIIIIZZ(LJFF, "getString(R.string.find_…iends_sub_fb_empty_title)");
                    c73306Spq.LJFF = LJFF;
                    String LJFF2 = C86V.LJFF(R.string.ghq);
                    o.LJIIIIZZ(LJFF2, "getString(R.string.find_…sub_fb_empty_description)");
                    c73306Spq.LJI = LJFF2;
                    c73306Spq.LJII = new AqS176S0100000_10(this, 170);
                }
                c73305Spp.setStatus(c73306Spq);
                c73305Spp.setVisibility(0);
                SwipeRefreshLayout swipeRefreshLayout = this.LJLJI;
                if (swipeRefreshLayout == null) {
                    return;
                }
                swipeRefreshLayout.setVisibility(8);
                return;
            }
            o.LJIJI("config");
            throw null;
        }
    }

    @Override // X.InterfaceC03360Bg
    public final void LJ() {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLLI;
        if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
            return;
        }
        FacebookMaFWidgetVM facebookMaFWidgetVM = this.LJLL;
        if (facebookMaFWidgetVM != null) {
            if (facebookMaFWidgetVM.getState().LJLIL instanceof C72922tc) {
                return;
            }
            facebookMaFWidgetVM.setState(C63786P1q.LJLIL);
            XKX.LIZLLL(facebookMaFWidgetVM.getAssemVMScope(), facebookMaFWidgetVM.LJLJI, null, new C62800Okm(facebookMaFWidgetVM, null), 2);
            return;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        FacebookMaFWidgetVM facebookMaFWidgetVM = this.LJLL;
        if (facebookMaFWidgetVM != null) {
            return facebookMaFWidgetVM.getLifecycle();
        }
        o.LJIJI("viewModel");
        throw null;
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
