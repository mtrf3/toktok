package X;

import Y.ACListenerS27S0100000_7;
import Y.AObjectS86S0100000_7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I7m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46102I7m extends AbstractC56042Hw implements InterfaceC143795kd {
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final InterfaceC88472Yns<View, Boolean> LJLJJI;
    public final C40871j1<Drawable> LJLJJL;
    public final C40871j1<OSZ<Float, Float>> LJLJJLL;
    public final C0IB<Boolean> LJLJL;
    public final C29901Fi<C76800UCe> LJLJLJ;
    public C170736mz LJLJLLL;

    @Override // X.AbstractC56042Hw
    public final int LLJILJILJ() {
        return R.layout.ce6;
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

    @Override // X.AbstractC56042Hw
    public final void LLJJ() {
        View requireViewById = requireViewById(R.id.ej6);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.img_close_record)");
        this.LJLJLLL = (C170736mz) requireViewById;
        this.LJLJJL.LIZIZ(this, new AObjectS86S0100000_7(this, 195));
        this.LJLJJLL.LIZIZ(this, new AObjectS86S0100000_7(this, 196));
        this.LJLJL.LIZIZ(this, new AObjectS86S0100000_7(this, 197));
        this.LJLJLJ.LIZLLL(this, new AObjectS86S0100000_7(this, 198));
        C170736mz c170736mz = this.LJLJLLL;
        if (c170736mz != null) {
            C16880lQ.LJJJZ(c170736mz, new ACListenerS27S0100000_7(this, 72));
        } else {
            o.LJIJI("closeRecordView");
            throw null;
        }
    }

    @Override // X.AbstractC56042Hw
    public final C0R5 LLJILJIL(LayoutInflater inflater) {
        o.LJIIIZ(inflater, "inflater");
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        C30981Jm c30981Jm = new C30981Jm(requireSceneContext);
        if (this.LJLIL) {
            int LIZ = C00F.LIZ(31744, 0, "creative_tools_record_exit_async_layout_inflater_scene_enabled", true);
            c30981Jm.LIZ.getClass();
            C81121Vsb.LJLJI.setPriority(LIZ);
        }
        return c30981Jm;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
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

    public C46102I7m(AqS157S0100000_7 aqS157S0100000_7, I71 i71, C40871j1 exitDrawable, C40871j1 closeAlphaAnim, C0IB enableTopMarginEvent, C29901Fi clickBackEvent, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(exitDrawable, "exitDrawable");
        o.LJIIIZ(closeAlphaAnim, "closeAlphaAnim");
        o.LJIIIZ(enableTopMarginEvent, "enableTopMarginEvent");
        o.LJIIIZ(clickBackEvent, "clickBackEvent");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJLJI = aqS157S0100000_7;
        this.LJLJJI = i71;
        this.LJLJJL = exitDrawable;
        this.LJLJJLL = closeAlphaAnim;
        this.LJLJL = enableTopMarginEvent;
        this.LJLJLJ = clickBackEvent;
        this.LJLIL = C00F.LIZ(31744, 0, "creative_tools_record_exit_async_layout_inflater_scene_enabled", true) != 0;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}