package X;

import android.app.Dialog;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.android.base.runtime.depend.IAdThirdTrackerDepend;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OG9 implements IAdThirdTrackerDepend, InterfaceC62096OYq, IPageToFinish {
    @Override // X.InterfaceC62096OYq
    public void LIZ(Throwable th) {
    }

    @Override // X.InterfaceC62096OYq
    public void LJFF(String platform, String shareType, Bundle bundle) {
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(shareType, "shareType");
    }

    @Override // X.InterfaceC62096OYq
    public /* synthetic */ void LJI(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public /* synthetic */ void LJIIIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public /* synthetic */ void onDismiss() {
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IPageToFinish
    public void onFinish(boolean z) {
    }

    public static void LIZIZ(JediViewModel jediViewModel, final LifecycleOwner lifecycleOwner, TBT prop1, InterfaceC88471Ynr interfaceC88471Ynr) {
        C73165SnZ c73165SnZ = new C73165SnZ();
        o.LJIIIZ(jediViewModel, "<this>");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(prop1, "prop1");
        C73297Sph.LIZJ(new InterfaceC143795kd() { // from class: X.5kI
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

            @Override // androidx.lifecycle.LifecycleOwner
            public final Lifecycle getLifecycle() {
                Lifecycle lifecycle = LifecycleOwner.this.getLifecycle();
                o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
                return lifecycle;
            }

            @Override // X.InterfaceC73150SnK
            public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
                return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
            }

            @Override // X.InterfaceC73150SnK
            public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel2, C73165SnZ<S> c73165SnZ2, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr2) {
                return C73297Sph.LJIIIZ(this, jediViewModel2, c73165SnZ2, interfaceC88471Ynr2);
            }

            @Override // X.InterfaceC143795kd
            public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel2, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ2, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr2) {
                C73297Sph.LIZJ(this, jediViewModel2, tbw, c73165SnZ2, interfaceC88471Ynr2);
            }

            @Override // X.InterfaceC73150SnK
            public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel2, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ2, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr2) {
                return C73297Sph.LJ(this, jediViewModel2, tbw, c73165SnZ2, interfaceC88471Ynr2);
            }

            @Override // X.InterfaceC143795kd
            public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel2, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ2, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr2) {
                C73297Sph.LJIIJ(this, jediViewModel2, tbw, c73165SnZ2, interfaceC88471Ynr2);
            }

            @Override // X.InterfaceC73150SnK
            public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel2, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ2, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
                return C73297Sph.LJFF(this, jediViewModel2, tbw, tbw2, c73165SnZ2, interfaceC88473Ynt);
            }

            @Override // X.InterfaceC73150SnK
            public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel2, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ2, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr2, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr3) {
                return C73297Sph.LIZ(this, jediViewModel2, tbw, c73165SnZ2, interfaceC88471Ynr2, interfaceC88472Yns, interfaceC88471Ynr3);
            }

            @Override // X.InterfaceC73150SnK
            public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel2, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ2, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
                return C73297Sph.LJI(this, jediViewModel2, tbw, tbw2, tbw3, c73165SnZ2, interfaceC88474Ynu);
            }

            @Override // X.InterfaceC73150SnK
            public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel2, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ2, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
                return C73297Sph.LJII(this, jediViewModel2, tbw, tbw2, tbw3, tbw4, c73165SnZ2, interfaceC88475Ynv);
            }
        }, jediViewModel, prop1, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAdThirdTrackerDepend
    public void track(String trackLabel, List list, Long l, String str, JSONObject jSONObject) {
        o.LJIIIZ(trackLabel, "trackLabel");
        O8Z.LIZIZ(trackLabel, list, l, str, jSONObject);
    }
}
