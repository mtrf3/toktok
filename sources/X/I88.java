package X;

import Y.AObjectS86S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I88 extends WM7 implements InterfaceC143795kd {
    public final I83 LJLIL;
    public final C0IB<Boolean> LJLILLLLZI;
    public final boolean LJLJI;
    public I89 LJLJJI;
    public InterfaceC82683Wch LJLJJL;
    public ShortVideoContextViewModel LJLJJLL;
    public TuxIconView LJLJL;
    public TextView LJLJLJ;
    public RelativeLayout LJLJLLL;
    public final C62822Ol8 LJLL;

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final SafeHandler LLJILJIL() {
        return (SafeHandler) this.LJLL.getValue();
    }

    public final boolean LLJILJILJ() {
        ShortVideoContextViewModel shortVideoContextViewModel = this.LJLJJLL;
        if (shortVideoContextViewModel != null) {
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.LJLIL;
            if (shortVideoContext.isPhotoMvMode && shortVideoContext.mIsFromDraft) {
                return true;
            }
            return false;
        }
        o.LJIJI("shortVideoContextViewModel");
        throw null;
    }

    public final void LLJJ(boolean z) {
        if (LLJILJILJ()) {
            TuxIconView tuxIconView = this.LJLJL;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
                TextView textView = this.LJLJLJ;
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                } else {
                    o.LJIJI("tvChooseMusic");
                    throw null;
                }
            }
            o.LJIJI("ivChooseMusic");
            throw null;
        }
        if (z && this.LJLJI) {
            TextView textView2 = this.LJLJLJ;
            if (textView2 != null) {
                textView2.setVisibility(0);
                LLJILJIL().post(new ARunnableS43S0100000_7(this, 16));
                return;
            } else {
                o.LJIJI("tvChooseMusic");
                throw null;
            }
        }
        TextView textView3 = this.LJLJLJ;
        if (textView3 != null) {
            textView3.setVisibility(8);
        } else {
            o.LJIJI("tvChooseMusic");
            throw null;
        }
    }

    public I88(I83 states, C0IB<Boolean> enableTopMarginEvent) {
        o.LJIIIZ(states, "states");
        o.LJIIIZ(enableTopMarginEvent, "enableTopMarginEvent");
        this.LJLIL = states;
        this.LJLILLLLZI = enableTopMarginEvent;
        this.LJLJI = true;
        this.LJLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 118));
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View requireViewById = requireViewById(R.id.j53);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.rl_music_container)");
        this.LJLJLLL = (RelativeLayout) requireViewById;
        View requireViewById2 = requireViewById(R.id.f07);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.iv_choose_music)");
        this.LJLJL = (TuxIconView) requireViewById2;
        View requireViewById3 = requireViewById(R.id.m28);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.tv_choose_music)");
        this.LJLJLJ = (TextView) requireViewById3;
        LLJILJIL().post(new ARunnableS43S0100000_7(this, 15));
        Typeface LIZLLL = C8HI.LIZJ().LIZLLL("medium");
        if (LIZLLL != null) {
            TextView textView = this.LJLJLJ;
            if (textView != null) {
                textView.setTypeface(LIZLLL);
            } else {
                o.LJIJI("tvChooseMusic");
                throw null;
            }
        }
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJJLL = (ShortVideoContextViewModel) ViewModelProviders.of((ActivityC45651qj) activity).get(ShortVideoContextViewModel.class);
        this.LJLILLLLZI.LIZIZ(this, new AObjectS86S0100000_7(this, 19));
        this.LJLIL.LJLJLJ.LIZIZ(this, new AObjectS86S0100000_7(this, 20));
        this.LJLIL.LJLJLLL.LIZLLL(this, new AObjectS86S0100000_7(this, 21));
        this.LJLIL.LJLJJLL.LIZIZ(this, new AObjectS86S0100000_7(this, 22));
        this.LJLIL.LJLJL.LIZLLL(this, new AObjectS86S0100000_7(this, 23));
        this.LJLIL.LJLJJL.LIZLLL(this, new AObjectS86S0100000_7(this, 24));
        this.LJLIL.LJLILLLLZI.LIZIZ(this, new AObjectS86S0100000_7(this, 25));
        this.LJLIL.LJLJI.LIZIZ(this, new AObjectS86S0100000_7(this, 17));
        this.LJLIL.LJLL.LIZLLL(this, new AObjectS86S0100000_7(this, 18));
        if (LLJILJILJ()) {
            LLJJ(false);
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.az7, viewGroup, false, "inflater.inflate(getLayo…esId(), container, false)");
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
