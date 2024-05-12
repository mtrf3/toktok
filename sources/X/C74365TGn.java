package X;

import Y.ARunnableS16S0101000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TGn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74365TGn extends WM7 implements InterfaceC151715xP, W4B {
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C74367TGp LJLJJI;
    public final C62822Ol8 LJLJJL;
    public boolean LJLJJLL;
    public final C82622Wbi LJLJL;
    public final C74363TGl LJLJLJ;
    public final InterfaceC83566Wqw LJLJLLL;

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

    @Override // X.W4B
    public final WM7 getScene() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.W4B
    public final void hide() {
        ((TGH) this.LJLJJL.getValue()).hide();
    }

    @Override // X.W4B
    public final void show() {
        ((TGH) this.LJLJJL.getValue()).show();
    }

    @Override // X.W4B
    public final void LLJI(I9W i9w) {
        if (this.LJLJJLL) {
            return;
        }
        this.LJLJJLL = true;
        if (i9w != null) {
            i9w.U9((IDH) this.LJLJJL.getValue());
            InterfaceC83566Wqw interfaceC83566Wqw = this.LJLJLLL;
            View requireViewById = requireViewById(R.id.fm5);
            o.LJIIIIZZ(requireViewById, "requireViewById(R.id.lay…_sticker_extra_container)");
            i9w.No(interfaceC83566Wqw, (FrameLayout) requireViewById);
        }
    }

    public final void LLJILJIL(int i) {
        ViewGroup Uh;
        TGH tgh = (TGH) this.LJLJJL.getValue();
        if (tgh != null && (Uh = tgh.Uh()) != null) {
            Uh.setVisibility(0);
            ViewGroup viewGroup = (ViewGroup) Uh.findViewById(R.id.kgu);
            if (viewGroup != null) {
                viewGroup.post(new ARunnableS16S0101000_12(viewGroup, i, 1));
            }
        }
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LJLJI.getValue();
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 viewModel1, InterfaceC88472Yns<? super S1, ? extends R> block) {
        o.LJIIIZ(viewModel1, "viewModel1");
        o.LJIIIZ(block, "block");
        return (R) C73157SnR.LJIIJJI(viewModel1, block);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.dsb, viewGroup, false, "inflater.inflate(R.layou…_scene, container, false)");
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> subscribe, C73165SnZ<S> config, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> subscriber) {
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C73157SnR.LJI(this, subscribe, config, subscriber);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        return C73157SnR.LIZIZ(this, selectSubscribe, prop1, config, interfaceC88471Ynr);
    }

    public C74365TGn(C82622Wbi parentContainer, TGP tgp, C74363TGl c74363TGl, InterfaceC83566Wqw onEffectTvShow, TCO converter) {
        o.LJIIIZ(parentContainer, "parentContainer");
        o.LJIIIZ(onEffectTvShow, "onEffectTvShow");
        o.LJIIIZ(converter, "converter");
        this.LJLJL = parentContainer;
        this.LJLJLJ = c74363TGl;
        this.LJLJLLL = onEffectTvShow;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1021));
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0200000_12(this, C65352Pkq.LIZ(RecordStickerPanelViewModel.class), 48));
        this.LJLJJI = new C74367TGp(this);
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0200000_12(this, tgp, 49));
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, C73165SnZ<TMG> config, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> subscriber) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C73157SnR.LIZJ(this, selectSubscribe, prop1, prop2, config, subscriber);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> asyncSubscribe, TBW<S, ? extends AbstractC26082ALm<? extends T>> prop, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        o.LJIIIZ(asyncSubscribe, "$this$asyncSubscribe");
        o.LJIIIZ(prop, "prop");
        o.LJIIIZ(config, "config");
        return C73157SnR.LIZ(this, asyncSubscribe, prop, config, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, C73165SnZ<C157166Eu> config, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(config, "config");
        return C73157SnR.LIZLLL(this, selectSubscribe, prop1, prop2, prop3, config, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, C73165SnZ<W1T> config, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(config, "config");
        return C73157SnR.LJ(this, selectSubscribe, prop1, prop2, prop3, prop4, config, interfaceC88475Ynv);
    }
}
