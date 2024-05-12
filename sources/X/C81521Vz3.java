package X;

import Y.AObjectS86S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vz3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81521Vz3 extends WM7 implements InterfaceC143795kd {
    public final ShortVideoContext LJLIL;
    public final WSE LJLILLLLZI;
    public final C0IB<Boolean> LJLJI;
    public ViewOnTouchListenerC81419VxP LJLJJI;
    public final C62822Ol8 LJLJJL;
    public ImageView LJLJJLL;

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

    public final C131865Fm LLJILJILJ() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-tabTextLayout>(...)");
        return (C131865Fm) value;
    }

    public final void LLJJ() {
        ViewGroup.LayoutParams layoutParams = LLJILJILJ().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        float LIZJ = KL2.LIZJ(requireActivity(), 16.0f);
        int i = marginLayoutParams.leftMargin;
        if (i > 0) {
            if (marginLayoutParams.rightMargin > 0) {
                C131865Fm LLJILJILJ = LLJILJILJ();
                LLJILJILJ.LJLJJLL = 12;
                LLJILJILJ.invalidate();
                LLJILJILJ().setDrawSize(LIZJ);
                return;
            }
        } else if (i == 0) {
            C131865Fm LLJILJILJ2 = LLJILJILJ();
            LLJILJILJ2.LJLJJLL = 4;
            LLJILJILJ2.invalidate();
            LLJILJILJ().setDrawSize(LIZJ);
            return;
        }
        if (marginLayoutParams.rightMargin == 0) {
            C131865Fm LLJILJILJ3 = LLJILJILJ();
            LLJILJILJ3.LJLJJLL = 8;
            LLJILJILJ3.invalidate();
            LLJILJILJ().setDrawSize(LIZJ);
            return;
        }
        LLJILJILJ().setDrawSize(0.0f);
    }

    public final int LLJILJIL(Object tag) {
        o.LJIIIZ(tag, "tag");
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJLJJI;
        if (viewOnTouchListenerC81419VxP != null) {
            int tabCount = viewOnTouchListenerC81419VxP.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP2 = this.LJLJJI;
                if (viewOnTouchListenerC81419VxP2 != null) {
                    if (o.LJ(tag, viewOnTouchListenerC81419VxP2.LIZLLL(i))) {
                        return i;
                    }
                } else {
                    o.LJIJI("tabHost");
                    throw null;
                }
            }
            return -1;
        }
        o.LJIJI("tabHost");
        throw null;
    }

    public final void LLJJI(Integer num) {
        int i;
        ViewGroup.LayoutParams layoutParams = LLJILJILJ().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        marginLayoutParams.rightMargin = i;
        LLJILJILJ().setLayoutParams(marginLayoutParams);
        LLJJ();
    }

    public final void LLJJIJI(Integer num) {
        int i;
        ViewGroup.LayoutParams layoutParams = LLJILJILJ().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        marginLayoutParams.leftMargin = i;
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJLJJI;
        if (viewOnTouchListenerC81419VxP != null) {
            if (num != null) {
                i2 = num.intValue();
            }
            viewOnTouchListenerC81419VxP.setStartMargin(i2);
            LLJILJILJ().setLayoutParams(marginLayoutParams);
            LLJJ();
            return;
        }
        o.LJIJI("tabHost");
        throw null;
    }

    public final void LLJJIJIL(Animation animation) {
        o.LJIIIZ(animation, "animation");
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJLJJI;
        if (viewOnTouchListenerC81419VxP != null) {
            viewOnTouchListenerC81419VxP.clearAnimation();
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP2 = this.LJLJJI;
            if (viewOnTouchListenerC81419VxP2 != null) {
                viewOnTouchListenerC81419VxP2.startAnimation(animation);
                return;
            } else {
                o.LJIJI("tabHost");
                throw null;
            }
        }
        o.LJIJI("tabHost");
        throw null;
    }

    public final void LLJJJ(int i) {
        ImageView imageView = this.LJLJJLL;
        if (imageView != null) {
            imageView.setImageResource(i);
            RecordPageOptionalConfig recordPageOptionalConfig = this.LJLIL.creativeModel.initialModel.recordPageOptionalConfig;
            if (recordPageOptionalConfig != null && recordPageOptionalConfig.exteriorRecordPageType == HR3.PHOTO_SEARCH.getType()) {
                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJLJJI;
                if (viewOnTouchListenerC81419VxP != null) {
                    viewOnTouchListenerC81419VxP.setScrollEnabled(false);
                    ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP2 = this.LJLJJI;
                    if (viewOnTouchListenerC81419VxP2 != null) {
                        viewOnTouchListenerC81419VxP2.setUISwitchEnabled(false);
                        return;
                    } else {
                        o.LJIJI("tabHost");
                        throw null;
                    }
                }
                o.LJIJI("tabHost");
                throw null;
            }
            return;
        }
        o.LJIJI("dot");
        throw null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.arn);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.bottom_tab_host)");
        this.LJLJJI = (ViewOnTouchListenerC81419VxP) requireViewById;
        View requireViewById2 = requireViewById(R.id.irg);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.record_mode_dot)");
        this.LJLJJLL = (ImageView) requireViewById2;
        WSE wse = this.LJLILLLLZI;
        ShortVideoContext shortVideoContext = this.LJLIL;
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJLJJI;
        if (viewOnTouchListenerC81419VxP != null) {
            wse.LJI(shortVideoContext, viewOnTouchListenerC81419VxP);
            this.LJLJI.LIZIZ(this, new AObjectS86S0100000_7(this, 107));
        } else {
            o.LJIJI("tabHost");
            throw null;
        }
    }

    public final void LLJJIJIIJIL(int i, int i2) {
        int i3;
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJLJJI;
        if (viewOnTouchListenerC81419VxP != null) {
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(i, viewOnTouchListenerC81419VxP.getContext());
            int LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(i2, viewOnTouchListenerC81419VxP.getContext());
            int i4 = viewOnTouchListenerC81419VxP.LLIIIILZ;
            for (int i5 = 0; i5 < viewOnTouchListenerC81419VxP.LJLJL.getChildCount(); i5++) {
                if (i5 == i4) {
                    i3 = LJIIIIZZ;
                } else {
                    i3 = LJIIIIZZ2;
                }
                viewOnTouchListenerC81419VxP.LJIIJJI(i5, i3);
            }
            viewOnTouchListenerC81419VxP.LJZI = LJIIIIZZ;
            viewOnTouchListenerC81419VxP.LJZL = LJIIIIZZ2;
            return;
        }
        o.LJIJI("tabHost");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public C81521Vz3(ShortVideoContext shortVideoContext, WSE wse, C0IB<Boolean> relayoutEvent) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(relayoutEvent, "relayoutEvent");
        this.LJLIL = shortVideoContext;
        this.LJLILLLLZI = wse;
        this.LJLJI = relayoutEvent;
        C221108m2.LIZIZ(new AqS164S0100000_14(this, 213));
        this.LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 214));
    }

    public final void LLJJIII(int i, boolean z, boolean z2) {
        if (z) {
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJLJJI;
            if (viewOnTouchListenerC81419VxP != null) {
                viewOnTouchListenerC81419VxP.LJII(i, 0, z2);
                return;
            } else {
                o.LJIJI("tabHost");
                throw null;
            }
        }
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP2 = this.LJLJJI;
        if (viewOnTouchListenerC81419VxP2 != null) {
            viewOnTouchListenerC81419VxP2.LJIIIIZZ(i, z2, true);
        } else {
            o.LJIJI("tabHost");
            throw null;
        }
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.drx, viewGroup, false, "inflater.inflate(R.layou…_scene, container, false)");
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
