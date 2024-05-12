package X;

import Y.ACListenerS34S0100000_14;
import Y.AObjectS89S0100000_14;
import Y.IDTListenerS122S0100000_14;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoPanelState;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.IDqS437S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W20 extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz, C5HC, InterfaceC144185lG {
    public final C82622Wbi LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final THU LJLJJI;
    public final InterfaceC81630W1y LJLJJL;
    public W28 LJLJJLL;
    public ViewPagerBottomSheetBehavior<View> LJLJL;
    public final I0N LJLJLJ;

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

    @Override // X.InterfaceC144185lG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return true;
    }

    public final EffectInfoViewModel LLJILJIL() {
        return (EffectInfoViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        W28 w28 = this.LJLJJLL;
        if (w28 != null) {
            C47919IrL.LIZLLL(w28);
            this.LJLJJLL = null;
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public W20(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS161S0200000_14(this, C65352Pkq.LIZ(EffectInfoViewModel.class), 17));
        this.LJLJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 180));
        this.LJLJJI = (THU) diContainer.LJIIIIZZ(null, THU.class);
        this.LJLJJL = (InterfaceC81630W1y) diContainer.LJIIIIZZ(null, InterfaceC81630W1y.class);
        this.LJLJLJ = (I0N) diContainer.LJIIIIZZ(null, I0N.class);
    }

    public final void LLJILJILJ(Effect effect) {
        String str;
        View findViewById = findViewById(R.id.fib);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = findViewById(R.id.fgi);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
        View findViewById3 = findViewById(R.id.fgg);
        if (findViewById3 != null) {
            findViewById3.setVisibility(0);
        }
        TextView textView = (TextView) findViewById(R.id.fi7);
        UrlModel urlModel = null;
        if (textView != null) {
            if (effect != null) {
                str = effect.getName();
            } else {
                str = null;
            }
            textView.setText(str);
        }
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.fi6);
        if (smartImageView != null) {
            smartImageView.setVisibility(0);
            if (effect != null) {
                urlModel = effect.getIconUrl();
            }
            W5F LJII = W5U.LJII(W2T.LIZ(urlModel));
            LJII.LJIJ = smartImageView.getResources().getDrawable(R.drawable.s1, smartImageView.getContext().getTheme());
            LJII.LJJIIJ = smartImageView;
            LJII.LIZLLL(new W21(this));
        }
    }

    public final void LLJJ(boolean z, boolean z2) {
        OSZ osz;
        if (z2) {
            if (z) {
                osz = new OSZ(Integer.valueOf(R.attr.go), Integer.valueOf(R.string.bgf));
            } else {
                osz = new OSZ(Integer.valueOf(R.attr.gp), Integer.valueOf(R.string.bg3));
            }
            int intValue = ((Number) osz.getFirst()).intValue();
            int intValue2 = ((Number) osz.getSecond()).intValue();
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            Integer LJ = C79045V0n.LJ(intValue, requireSceneContext);
            if (LJ != null) {
                int intValue3 = LJ.intValue();
                TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.fif);
                if (tuxIconView != null) {
                    tuxIconView.setTintColor(intValue3);
                }
            }
            TextView textView = (TextView) findViewById(R.id.fig);
            if (textView != null) {
                textView.setText(requireSceneContext().getString(intValue2));
            }
            View findViewById = findViewById(R.id.fie);
            if (findViewById == null) {
                return;
            }
            findViewById.setVisibility(0);
            return;
        }
        View findViewById2 = findViewById(R.id.fie);
        if (findViewById2 == null) {
            return;
        }
        findViewById2.setVisibility(8);
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            LLJILJIL().Kv0(W2C.LIZ);
            return true;
        }
        return false;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        View findViewById;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ViewPagerBottomSheetBehavior<View> LIZ = ViewPagerBottomSheetBehavior.LIZ(findViewById(R.id.c8m));
        LIZ.setPeekHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT))));
        LIZ.LJII = true;
        LIZ.LJIIZILJ = new C81631W1z(this);
        this.LJLJL = LIZ;
        View findViewById2 = findViewById(R.id.fnf);
        if (findViewById2 != null) {
            findViewById2.setOnTouchListener(new IDTListenerS122S0100000_14(this, 3));
        }
        View findViewById3 = findViewById(R.id.fie);
        if (findViewById3 != null) {
            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 42), findViewById3);
        }
        View findViewById4 = findViewById(R.id.fhy);
        if (findViewById4 != null) {
            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 43), findViewById4);
        }
        View findViewById5 = findViewById(R.id.fkx);
        if (findViewById5 != null) {
            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 44), findViewById5);
        }
        View findViewById6 = findViewById(R.id.fgy);
        if (findViewById6 != null) {
            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 45), findViewById6);
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.fi4);
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS34S0100000_14(this, 46));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.fib);
        if (constraintLayout != null) {
            C16880lQ.LJIL(constraintLayout, new ACListenerS34S0100000_14(this, 47));
        }
        C47919IrL.LIZIZ(requireSceneContext());
        W28 w28 = new W28(this);
        this.LJLJJLL = w28;
        C47919IrL.LIZJ(w28);
        EffectInfoViewModel LLJILJIL = LLJILJIL();
        C73156SnQ.LJIIIIZZ(this, LLJILJIL, new TBT() { // from class: X.W26
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EffectInfoPanelState) obj).getEffect();
            }
        }, new AqS196S0100000_14(this, 21));
        C73156SnQ.LJIIIIZZ(this, LLJILJIL, new TBT() { // from class: X.W29
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EffectInfoPanelState) obj).getCreatorName();
            }
        }, new AqS195S0100000_13(this, 25));
        C73156SnQ.LJII(this, LLJILJIL, new TBT() { // from class: X.W23
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((EffectInfoPanelState) obj).isFavorite());
            }
        }, new TBT() { // from class: X.W24
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((EffectInfoPanelState) obj).isFavoriteVisible());
            }
        }, new IDqS437S0100000_13(this, 3));
        if (W2U.LIZ() && (findViewById = findViewById(R.id.ioq)) != null) {
            findViewById.setVisibility(0);
        }
        W25 w25 = new TBT() { // from class: X.W25
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((EffectInfoPanelState) obj).isDiscoverVisible());
            }
        };
        C73165SnZ c73165SnZ = new C73165SnZ();
        c73165SnZ.LJ = false;
        c73165SnZ.LIZLLL = true;
        C73297Sph.LJ(this, LLJILJIL, w25, c73165SnZ, new AqS195S0100000_13(this, 26));
        W22 w22 = new TBT() { // from class: X.W22
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((EffectInfoPanelState) obj).isReportAndBlockVisible());
            }
        };
        C73165SnZ c73165SnZ2 = new C73165SnZ();
        c73165SnZ2.LJ = false;
        c73165SnZ2.LIZLLL = true;
        C73297Sph.LJ(this, LLJILJIL, w22, c73165SnZ2, new AqS195S0100000_13(this, 24));
        LLJILJIL.LJZ.LIZLLL(LLJILJIL, new AObjectS89S0100000_14(this, 164));
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ccz, viewGroup, false, "inflater.inflate(\n      …ner,\n        false,\n    )");
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
    public final InterfaceC92693kP selectSubscribe(JediViewModel jediViewModel, TBW tbw, TBW tbw2, TBW tbw3, C73165SnZ c73165SnZ, InterfaceC88474Ynu interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC92693kP selectSubscribe(JediViewModel jediViewModel, TBW tbw, TBW tbw2, TBW tbw3, TBW tbw4, C73165SnZ c73165SnZ, InterfaceC88475Ynv interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
