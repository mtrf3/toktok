package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W1I extends WM7 implements InterfaceC143795kd {
    public static final boolean LJLLI;
    public static final int LJLLILLLL;
    public static final int LJLLJ;
    public static final int LJLLL;
    public static final int LJLLLL;
    public static final int LJLLLLLL;
    public final C0IB<Boolean> LJLIL;
    public final C46611sH<Integer> LJLILLLLZI;
    public final W1P LJLJI;
    public final C29901Fi<W1T> LJLJJI;
    public final C29901Fi<OSZ<Integer, Integer>> LJLJJL;
    public final C81243VuZ LJLJJLL;
    public final InterfaceC82086WJm LJLJL;
    public final java.util.Map<Integer, Integer> LJLJLJ;
    public W1U LJLJLLL;
    public final int LJLL;

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

    public final int LLJILJILJ() {
        int i = W1M.LIZ[this.LJLJL.getSpeed().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return -1;
                        }
                        return LJLLLLLL;
                    }
                    return LJLLLL;
                }
                return LJLLL;
            }
            return LJLLJ;
        }
        return LJLLILLLL;
    }

    static {
        int i;
        int i2;
        boolean LIZ = C53557L0f.LIZ();
        LJLLI = LIZ;
        int i3 = 0;
        if (LIZ) {
            i = 4;
        } else {
            i = 0;
        }
        LJLLILLLL = i;
        int i4 = 1;
        if (LIZ) {
            i2 = 3;
        } else {
            i2 = 1;
        }
        LJLLJ = i2;
        LJLLL = 2;
        if (!LIZ) {
            i4 = 3;
        }
        LJLLLL = i4;
        if (!LIZ) {
            i3 = 4;
        }
        LJLLLLLL = i3;
    }

    public static final EnumC82528WaC LLJJ(int i) {
        if (i == LJLLILLLL) {
            return EnumC82528WaC.EPIC;
        }
        if (i == LJLLJ) {
            return EnumC82528WaC.SLOW;
        }
        if (i == LJLLL) {
            return EnumC82528WaC.NORMAL;
        }
        if (i == LJLLLL) {
            return EnumC82528WaC.FAST;
        }
        if (i == LJLLLLLL) {
            return EnumC82528WaC.LAPSE;
        }
        return EnumC82528WaC.NORMAL;
    }

    public final void LLJILJIL(int i) {
        int LLJILJILJ = LLJILJILJ() + i;
        if (LLJILJILJ > this.LJLJLJ.size() - 1) {
            LLJILJILJ = this.LJLJLJ.size() - 1;
        }
        if (LLJILJILJ < 0) {
            LLJILJILJ = 0;
        }
        LLJJI(LLJILJILJ);
    }

    public final void LLJJI(int i) {
        C81019Vqx c81019Vqx;
        if (i == LLJILJILJ()) {
            return;
        }
        View view = this.mView;
        if ((view instanceof C81019Vqx) && (c81019Vqx = (C81019Vqx) view) != null) {
            c81019Vqx.LJII(i);
        }
        this.LJLJL.y90(LLJJ(i));
        this.LJLJI.LIZIZ(LLJJ(i));
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        new C61995OUt(requireSceneContext).LIZIZ(12, LiveTryModeCountDownThresholdSetting.DEFAULT);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x010b, code lost:
    
        if (X.C1DG.LJIIIIZZ() == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0209  */
    @Override // X.WM7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1I.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (LJLLI) {
            View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dsa, container, false);
            o.LJIIIIZZ(LLLLIILL, "{\n            inflater.i…ntainer, false)\n        }");
            return LLLLIILL;
        }
        View LLLLIILL2 = C16880lQ.LLLLIILL(inflater, R.layout.ds_, container, false);
        o.LJIIIIZZ(LLLLIILL2, "{\n            inflater.i…ntainer, false)\n        }");
        return LLLLIILL2;
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

    public W1I(C0IB<Boolean> relayoutEvent, C46611sH<Integer> translationY, W1P recordSpeedListener, C29901Fi<W1T> speedPanelScrollEvent, C29901Fi<OSZ<Integer, Integer>> speedPanelHoverEvent, C81243VuZ c81243VuZ, InterfaceC82086WJm cameraApiComponent) {
        o.LJIIIZ(relayoutEvent, "relayoutEvent");
        o.LJIIIZ(translationY, "translationY");
        o.LJIIIZ(recordSpeedListener, "recordSpeedListener");
        o.LJIIIZ(speedPanelScrollEvent, "speedPanelScrollEvent");
        o.LJIIIZ(speedPanelHoverEvent, "speedPanelHoverEvent");
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LJLIL = relayoutEvent;
        this.LJLILLLLZI = translationY;
        this.LJLJI = recordSpeedListener;
        this.LJLJJI = speedPanelScrollEvent;
        this.LJLJJL = speedPanelHoverEvent;
        this.LJLJJLL = c81243VuZ;
        this.LJLJL = cameraApiComponent;
        this.LJLJLJ = C113554cx.LJJL(new OSZ(Integer.valueOf(LJLLILLLL), Integer.valueOf(R.string.tky)), new OSZ(Integer.valueOf(LJLLJ), Integer.valueOf(R.string.rel)), new OSZ(Integer.valueOf(LJLLL), Integer.valueOf(R.string.rkp)), new OSZ(Integer.valueOf(LJLLLL), Integer.valueOf(R.string.g_z)), new OSZ(Integer.valueOf(LJLLLLLL), Integer.valueOf(R.string.tkw)));
        this.LJLL = 28;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
