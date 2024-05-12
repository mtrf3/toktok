package X;

import Y.AObjectS89S0100000_14;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AqS112S0101000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W1H extends WM7 implements InterfaceC143795kd {
    public static final boolean LJLJLLL;
    public static final int LJLL;
    public static final int LJLLI;
    public static final int LJLLILLLL;
    public static final int LJLLJ;
    public static final int LJLLL;
    public final C0IB<Boolean> LJLIL;
    public final W1O LJLILLLLZI;
    public final C29901Fi<W1T> LJLJI;
    public final C29901Fi<OSZ<Integer, Integer>> LJLJJI;
    public final C81243VuZ LJLJJL;
    public final java.util.Map<Integer, Integer> LJLJJLL;
    public W1U LJLJL;
    public WRQ LJLJLJ;

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
        WRQ wrq = this.LJLJLJ;
        if (wrq != null) {
            int i = W1L.LIZ[wrq.getSpeed().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return -1;
                            }
                            return LJLLL;
                        }
                        return LJLLJ;
                    }
                    return LJLLILLLL;
                }
                return LJLLI;
            }
            return LJLL;
        }
        o.LJIJI("cameraApiComponent");
        throw null;
    }

    static {
        int i;
        int i2;
        boolean LIZ = C53557L0f.LIZ();
        LJLJLLL = LIZ;
        int i3 = 4;
        if (LIZ) {
            i = 4;
        } else {
            i = 0;
        }
        LJLL = i;
        int i4 = 3;
        if (LIZ) {
            i2 = 3;
        } else {
            i2 = 1;
        }
        LJLLI = i2;
        LJLLILLLL = 2;
        if (LIZ) {
            i4 = 1;
        }
        LJLLJ = i4;
        if (LIZ) {
            i3 = 0;
        }
        LJLLL = i3;
    }

    public static final EnumC82528WaC LLJJ(int i) {
        if (i == LJLL) {
            return EnumC82528WaC.EPIC;
        }
        if (i == LJLLI) {
            return EnumC82528WaC.SLOW;
        }
        if (i == LJLLILLLL) {
            return EnumC82528WaC.NORMAL;
        }
        if (i == LJLLJ) {
            return EnumC82528WaC.FAST;
        }
        if (i == LJLLL) {
            return EnumC82528WaC.LAPSE;
        }
        return EnumC82528WaC.NORMAL;
    }

    public final void LLJILJIL(int i) {
        int LLJILJILJ = LLJILJILJ() + i;
        if (LLJILJILJ > this.LJLJJLL.size() - 1) {
            LLJILJILJ = this.LJLJJLL.size() - 1;
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
        WRQ wrq = this.LJLJLJ;
        if (wrq != null) {
            wrq.y90(LLJJ(i));
            this.LJLILLLLZI.LIZIZ(LLJJ(i));
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            new C61995OUt(requireSceneContext).LIZIZ(12, LiveTryModeCountDownThresholdSetting.DEFAULT);
            return;
        }
        o.LJIJI("cameraApiComponent");
        throw null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        C81019Vqx c81019Vqx;
        boolean z;
        int i;
        int i2;
        super.onActivityCreated(bundle);
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity");
        WRQ wrq = ((FTCVideoRecordNewActivity) activity).LLIIJI;
        o.LJIIIIZZ(wrq, "activity as FTCVideoRecordNewActivity).cameraApi");
        this.LJLJLJ = wrq;
        if (LJLJLLL) {
            C81243VuZ c81243VuZ = this.LJLJJL;
            if (c81243VuZ.LIZ != null) {
                View view = this.mView;
                if ((view instanceof C81019Vqx) && (c81019Vqx = (C81019Vqx) view) != null) {
                    c81019Vqx.LJFF(c81243VuZ);
                    Iterator it = ORZ.LLIL(this.LJLJJLL.keySet()).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        Integer num = this.LJLJJLL.get(Integer.valueOf(intValue));
                        o.LJI(num);
                        String string = getString(num.intValue());
                        o.LJIIIIZZ(string, "getString(speedTextMap[index]!!)");
                        if (intValue == LLJILJILJ()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (intValue == 0) {
                            if (z) {
                                i = R.drawable.v7;
                                i2 = R.color.ck;
                            } else {
                                i = R.drawable.v9;
                                i2 = R.color.acm;
                            }
                        } else {
                            if (intValue == this.LJLJJLL.size() - 1 && z) {
                                i = R.drawable.v3;
                            } else if (intValue == this.LJLJJLL.size() - 1) {
                                if (!z) {
                                    i = R.drawable.v4;
                                    i2 = R.color.acm;
                                }
                                i = R.drawable.v5;
                            } else {
                                if (!z) {
                                    i = R.drawable.v6;
                                    i2 = R.color.acm;
                                }
                                i = R.drawable.v5;
                            }
                            i2 = R.color.ck;
                        }
                        c81019Vqx.LIZ(i, i2, string, new AqS112S0101000_14(intValue, this, 0));
                    }
                }
            }
            this.LJLJI.LIZLLL(this, new AObjectS89S0100000_14(this, 67));
            this.LJLJJI.LIZLLL(this, new AObjectS89S0100000_14(this, 68));
            return;
        }
        View view2 = this.mView;
        o.LJII(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.record.DmtBgAnimRadioGroup");
        W1U w1u = (W1U) view2;
        this.LJLJL = w1u;
        Iterator it2 = ORZ.LLIL(this.LJLJJLL.keySet()).iterator();
        while (it2.hasNext()) {
            Integer num2 = this.LJLJJLL.get(Integer.valueOf(((Number) it2.next()).intValue()));
            o.LJI(num2);
            String string2 = getString(num2.intValue());
            o.LJIIIIZZ(string2, "getString(speedTextMap[index]!!)");
            w1u.LIZ(string2);
        }
        if (LLJILJILJ() != -1) {
            W1U w1u2 = this.LJLJL;
            if (w1u2 != null) {
                w1u2.setCurrentItem(LLJILJILJ());
            } else {
                o.LJIJI("speedRadioGroup");
                throw null;
            }
        } else {
            W1U w1u3 = this.LJLJL;
            if (w1u3 != null) {
                w1u3.setCurrentItem(LJLLILLLL);
            } else {
                o.LJIJI("speedRadioGroup");
                throw null;
            }
        }
        W1U w1u4 = this.LJLJL;
        if (w1u4 != null) {
            w1u4.setOnItemChangeListener(new W1J(this));
            this.LJLIL.LIZIZ(this, new AObjectS89S0100000_14(this, 69));
        } else {
            o.LJIJI("speedRadioGroup");
            throw null;
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (LJLJLLL) {
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

    public W1H(C0IB<Boolean> relayoutEvent, W1O recordSpeedListener, C29901Fi<W1T> speedPanelScrollEvent, C29901Fi<OSZ<Integer, Integer>> speedPanelHoverEvent, C81243VuZ c81243VuZ) {
        o.LJIIIZ(relayoutEvent, "relayoutEvent");
        o.LJIIIZ(recordSpeedListener, "recordSpeedListener");
        o.LJIIIZ(speedPanelScrollEvent, "speedPanelScrollEvent");
        o.LJIIIZ(speedPanelHoverEvent, "speedPanelHoverEvent");
        this.LJLIL = relayoutEvent;
        this.LJLILLLLZI = recordSpeedListener;
        this.LJLJI = speedPanelScrollEvent;
        this.LJLJJI = speedPanelHoverEvent;
        this.LJLJJL = c81243VuZ;
        this.LJLJJLL = C113554cx.LJJL(new OSZ(Integer.valueOf(LJLL), Integer.valueOf(R.string.tky)), new OSZ(Integer.valueOf(LJLLI), Integer.valueOf(R.string.rel)), new OSZ(Integer.valueOf(LJLLILLLL), Integer.valueOf(R.string.rkp)), new OSZ(Integer.valueOf(LJLLJ), Integer.valueOf(R.string.g_z)), new OSZ(Integer.valueOf(LJLLL), Integer.valueOf(R.string.tkw)));
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
