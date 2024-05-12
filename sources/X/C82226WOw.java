package X;

import Y.AObserverS82S0100000_14;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WOw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82226WOw extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLLJ;
    public final C82632Wbs LJLIL;
    public final C82632Wbs LJLILLLLZI;
    public final C82631Wbr LJLJI;
    public C82221WOr LJLJJI;
    public final C82222WOs LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public TextView LJLJL;
    public final WST LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public InterfaceC82227WOx LJLL;
    public final AqS180S0100000_14 LJLLI;
    public final C82622Wbi LJLLILLLL;

    static {
        TBT tbt = new TBT(C82226WOw.class, "beautyApi", "getBeautyApi()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82226WOw.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82226WOw.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0, c65351Pkp)};
    }

    public final I37 LLJILJIL() {
        return (I37) this.LJLIL.LIZ(this, LJLLJ[0]);
    }

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

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.unRegisterActivityOnKeyDownListener((C5HC) this.LJLJJLL.getValue());
        }
        C78928UyK.LIZIZ(true, false, false, (InterfaceC82086WJm) this.LJLILLLLZI.LIZ(this, LJLLJ[1]));
        InterfaceC82227WOx interfaceC82227WOx = this.LJLL;
        if (interfaceC82227WOx != null) {
            interfaceC82227WOx.hide();
        }
        this.LJLL = null;
        this.LJLJLJ.LJI.e8().getEffectController().G9();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLLILLLL;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        InterfaceC82227WOx LIZ;
        super.onActivityCreated(bundle);
        C82222WOs c82222WOs = this.LJLJJL;
        if (c82222WOs.LJFF && !c82222WOs.LJIIIIZZ) {
            z = true;
        } else {
            z = false;
        }
        C82516Wa0.LJII = z;
        C82516Wa0.LIZIZ = new C60903NvH();
        C82516Wa0.LIZJ = new AqS196S0100000_14(this, 7);
        if (this.LJLJJL.LIZJ == null) {
            new C78934UyQ();
        }
        ViewGroup container = (ViewGroup) this.mView.findViewById(R.id.ir3);
        InterfaceC82227WOx interfaceC82227WOx = this.LJLL;
        if (interfaceC82227WOx == null) {
            o.LJIIIIZZ(container, "container");
            InterfaceC88473Ynt<? super InterfaceC83142Wk6, ? super C79146V4k, ? super InterfaceC88472Yns<? super C83232WlY, C76800UCe>, ? extends InterfaceC82228WOy> interfaceC88473Ynt = this.LJLJJL.LJI;
            if (interfaceC88473Ynt != null) {
                InterfaceC82228WOy invoke = interfaceC88473Ynt.invoke(LLJILJIL().f7(), this.LJLJJL.LIZIZ, this.LJLLI);
                Activity requireActivity = requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                LIZ = invoke.LIZ(requireActivity, container, (InterfaceC83144Wk8) this.LJLJLLL.getValue());
            } else if (C82516Wa0.LJIIJ) {
                C83214WlG c83214WlG = new C83214WlG(LLJILJIL().f7(), this.LJLJJL.LIZIZ, this.LJLLI);
                Activity requireActivity2 = requireActivity();
                o.LJIIIIZZ(requireActivity2, "requireActivity()");
                LIZ = c83214WlG.LIZ(requireActivity2, container, (InterfaceC83144Wk8) this.LJLJLLL.getValue());
            } else {
                C83228WlU c83228WlU = new C83228WlU(LLJILJIL().f7(), this.LJLJJL.LIZIZ, this.LJLLI);
                Activity requireActivity3 = requireActivity();
                o.LJIIIIZZ(requireActivity3, "requireActivity()");
                LIZ = c83228WlU.LIZ(requireActivity3, container, (InterfaceC83144Wk8) this.LJLJLLL.getValue());
            }
            this.LJLL = LIZ;
        } else {
            o.LJIIIIZZ(container, "container");
            interfaceC82227WOx.setContainer(container);
        }
        this.LJLJJL.LIZIZ.LJIIZILJ();
        InterfaceC82227WOx interfaceC82227WOx2 = this.LJLL;
        if (interfaceC82227WOx2 != null) {
            interfaceC82227WOx2.show();
        }
        WST wst = this.LJLJLJ;
        wst.getClass();
        wst.LJII.f7().x7().safeObserve(this, new AObserverS82S0100000_14(wst, 3));
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.registerActivityOnKeyDownListener((C5HC) this.LJLJJLL.getValue());
        }
    }

    public C82226WOw(C82622Wbi diContainer, InterfaceC88472Yns<? super C82222WOs, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLLILLLL = diContainer;
        this.LJLIL = UCI.LJI(diContainer, I37.class, null);
        C82632Wbs LJI = UCI.LJI(diContainer, InterfaceC82086WJm.class, null);
        this.LJLILLLLZI = LJI;
        this.LJLJI = UCI.LJII(diContainer, InterfaceC82353WTt.class, null);
        C82222WOs c82222WOs = new C82222WOs(null);
        this.LJLJJL = c82222WOs;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c82222WOs);
        }
        this.LJLJJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 37));
        this.LJLJLJ = new WST((InterfaceC82086WJm) LJI.LIZ(this, LJLLJ[1]), LLJILJIL(), new AqS180S0100000_14(this, 24));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 38));
        this.LJLLI = new AqS180S0100000_14(this, 23);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 viewModel1, InterfaceC88472Yns<? super S1, ? extends R> block) {
        o.LJIIIZ(viewModel1, "viewModel1");
        o.LJIIIZ(block, "block");
        return (R) C73297Sph.LJIIZILJ(viewModel1, block);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.drw, container, false);
        this.LJLJL = (TextView) LLLLIILL.findViewById(R.id.m1b);
        WST wst = this.LJLJLJ;
        wst.LJI.e8().getEffectController().K9(new WSU(wst));
        return LLLLIILL;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> subscribe, C73165SnZ<S> config, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> subscriber) {
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C73297Sph.LJIIIZ(this, subscribe, config, subscriber);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> selectNonNullSubscribe, TBW<S, ? extends A> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(selectNonNullSubscribe, "$this$selectNonNullSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        C73297Sph.LIZJ(this, selectNonNullSubscribe, prop1, config, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        return C73297Sph.LJ(this, selectSubscribe, prop1, config, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> subscribeEvent, TBW<S, ? extends C45927I0t<? extends A>> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(subscribeEvent, "$this$subscribeEvent");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        C73297Sph.LJIIJ(this, subscribeEvent, prop1, config, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, C73165SnZ<TMG> config, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> subscriber) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C73297Sph.LJFF(this, selectSubscribe, prop1, prop2, config, subscriber);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> asyncSubscribe, TBW<S, ? extends AbstractC26082ALm<? extends T>> prop, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        o.LJIIIZ(asyncSubscribe, "$this$asyncSubscribe");
        o.LJIIIZ(prop, "prop");
        o.LJIIIZ(config, "config");
        return C73297Sph.LIZ(this, asyncSubscribe, prop, config, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, C73165SnZ<C157166Eu> config, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(config, "config");
        return C73297Sph.LJI(this, selectSubscribe, prop1, prop2, prop3, config, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, C73165SnZ<W1T> config, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(config, "config");
        return C73297Sph.LJII(this, selectSubscribe, prop1, prop2, prop3, prop4, config, interfaceC88475Ynv);
    }
}
