package X;

import Y.IDTListenerS88S0200000_2;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6G4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6G4 extends WM7 implements InterfaceC143795kd {
    public final QaStruct LJLIL;
    public final String LJLILLLLZI;
    public C157416Ft LJLJI;

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

    public final void LLJILJILJ(boolean z) {
        int i;
        C157416Ft c157416Ft = this.LJLJI;
        if (c157416Ft != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            c157416Ft.setVisibility(i);
            return;
        }
        o.LJIJI("qaStickerView");
        throw null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.ijl);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.question_answer_sticker_view)");
        C157416Ft c157416Ft = (C157416Ft) requireViewById;
        this.LJLJI = c157416Ft;
        QaStruct qaStruct = this.LJLIL;
        if (qaStruct == null) {
            LLJILJILJ(false);
        } else {
            LLJILJIL(c157416Ft, qaStruct);
        }
    }

    public C6G4(QaStruct qaStruct, String str) {
        this.LJLIL = qaStruct;
        this.LJLILLLLZI = str;
    }

    public final void LLJILJIL(C157416Ft c157416Ft, QaStruct qaStruct) {
        o.LJIIIZ(qaStruct, "qaStruct");
        int LJFF = C81184Vtc.LJFF(c157416Ft.getContext());
        ViewGroup.LayoutParams layoutParams = c157416Ft.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((int) KL2.LIZJ(c157416Ft.getContext(), 130.0f)) + LJFF;
        double d = C6G3.LIZ;
        if (d != 1.0d) {
            if (d > 1.0d) {
                d = 1.0d;
            } else if (d < 0.5d) {
                d = 0.5d;
            }
            float f = (float) d;
            c157416Ft.setScaleX(f);
            c157416Ft.setScaleY(f);
            c157416Ft.setPivotX(0.0f);
            c157416Ft.setPivotY(0.0f);
        }
        c157416Ft.LJJZZIII(qaStruct);
        c157416Ft.setAlpha(false);
        c157416Ft.setOnTouchListener(new IDTListenerS88S0200000_2(this, c157416Ft, 2));
        if (TextUtils.equals(this.LJLILLLLZI, "ask_textual_question")) {
            C161756Wl.LIZ(c157416Ft.getContext(), Long.valueOf(qaStruct.getQuestionId()), null);
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.c9j, viewGroup, false, "inflater.inflate(R.layou…layout, container, false)");
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
