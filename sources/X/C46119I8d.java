package X;

import Y.ACListenerS27S0100000_7;
import Y.AObjectS43S0110000_7;
import Y.AObjectS86S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.animation.Animator;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I8d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46119I8d extends WM7 implements InterfaceC143795kd {
    public final C82622Wbi LJLIL;
    public final I8D LJLILLLLZI;
    public final C0IB<Boolean> LJLJI;
    public final TEZ LJLJJI;
    public final ShortVideoContext LJLJJL;
    public final boolean LJLJJLL;
    public C44293HZx LJLJL;
    public InterfaceC82683Wch LJLJLJ;
    public ShortVideoContextViewModel LJLJLLL;
    public TuxIconView LJLL;
    public TuxIconView LJLLI;
    public TextView LJLLILLLL;
    public RelativeLayout LJLLJ;
    public View LJLLL;
    public Animator LJLLLL;
    public View LJLLLLLL;
    public boolean LJLZ;
    public AnonymousClass607 LJZ;
    public final C62822Ol8 LJZI;

    public final boolean LLJJ() {
        return IMService.createIIMServicebyMonsterPlugin(false).getCameraService().LIZ() && this.LJLJJL.creativeModel.initialModel.dmCameraModel.enterFromDM;
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

    public final SafeHandler LLJILJILJ() {
        return (SafeHandler) this.LJZI.getValue();
    }

    public final void LLJJIJIIJIL() {
        if (this.LJLILLLLZI.LJLJL.LIZJ() != null && !this.LJLJJL.LJJIJIIJIL() && (!this.LJLJJL.LJJIJIIJI() || !this.LJLJJL.LJJJIL())) {
            AnonymousClass607 anonymousClass607 = this.LJZ;
            if (anonymousClass607 != null) {
                anonymousClass607.LIZLLL(AnonymousClass609.DARK_COLOR_WITH_CANCEL_BUTTON);
                return;
            }
            return;
        }
        AnonymousClass607 anonymousClass6072 = this.LJZ;
        if (anonymousClass6072 == null) {
            return;
        }
        anonymousClass6072.LIZLLL(AnonymousClass609.DARK_COLOR_WITHOUT_CANCEL_BUTTON);
    }

    public final void LLJJIJIL() {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_paperplane_fill;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        TuxIconView tuxIconView = this.LJLL;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c2068389v);
        }
        TuxIconView tuxIconView2 = this.LJLLI;
        if (tuxIconView2 != null) {
            tuxIconView2.setTuxIcon(c2068389v);
        }
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        Animator animator = this.LJLLLL;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // X.WM7
    public final void onResume() {
        C8HF chooseMusicTextView;
        super.onResume();
        TextView textView = this.LJLLILLLL;
        if (textView != null) {
            textView.requestFocus();
        }
        AnonymousClass607 anonymousClass607 = this.LJZ;
        if (anonymousClass607 != null && (chooseMusicTextView = anonymousClass607.getChooseMusicTextView()) != null) {
            chooseMusicTextView.requestFocus();
        }
    }

    public static final String LLJILJIL(AVMusic aVMusic) {
        String name = aVMusic.getName();
        if (name == null || name.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(aVMusic.getName());
        String singer = aVMusic.getSinger();
        if (singer != null && singer.length() != 0) {
            sb.append('-');
            sb.append(aVMusic.getSinger());
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        return sb2;
    }

    public final void LLJJI(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        View view = this.LJLLLLLL;
        if (view != null) {
            view.setVisibility(i);
        }
        AnonymousClass607 anonymousClass607 = this.LJZ;
        if (anonymousClass607 != null) {
            anonymousClass607.LIZJ(z);
        }
        AnonymousClass607 anonymousClass6072 = this.LJZ;
        if (anonymousClass6072 != null) {
            anonymousClass6072.setUpCutVisibilityAB(false);
        }
    }

    public final void LLJJIII(boolean z) {
        AnonymousClass607 anonymousClass607 = this.LJZ;
        if (anonymousClass607 != null) {
            if (z) {
                C8HF chooseMusicTextView = anonymousClass607.getChooseMusicTextView();
                if (chooseMusicTextView != null) {
                    chooseMusicTextView.setVisibility(0);
                }
                LLJILJILJ().postDelayed(new ARunnableS43S0100000_7(anonymousClass607, 67), 100L);
                return;
            }
            C8HF chooseMusicTextView2 = anonymousClass607.getChooseMusicTextView();
            if (chooseMusicTextView2 == null) {
                return;
            }
            chooseMusicTextView2.setVisibility(8);
            return;
        }
        if (z && this.LJLJJLL) {
            TextView textView = this.LJLLILLLL;
            if (textView != null) {
                textView.setVisibility(0);
            }
            LLJILJILJ().post(new ARunnableS43S0100000_7(this, 68));
            return;
        }
        TextView textView2 = this.LJLLILLLL;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    public final void LLJJIJI(boolean z) {
        RelativeLayout relativeLayout = this.LJLLJ;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        LLJILJILJ().post(new ARunnableS43S0100000_7(this, 69));
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        C8HF c8hf;
        AnonymousClass607 anonymousClass607;
        boolean z;
        TextView textView;
        TextView textView2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLLJ = (RelativeLayout) findViewById(R.id.j53);
        this.LJLL = (TuxIconView) findViewById(R.id.f07);
        this.LJLLI = (TuxIconView) findViewById(R.id.bb4);
        this.LJLLILLLL = (TextView) findViewById(R.id.mok);
        if (LLJJ()) {
            TextView textView3 = this.LJLLILLLL;
            if (textView3 != null) {
                String string = getString(R.string.em_);
                o.LJIIIIZZ(string, "getString(R.string.dm_cam_camera_toplabel)");
                Object[] objArr = new Object[1];
                String str = this.LJLJJL.creativeModel.initialModel.dmCameraModel.receiverNickname;
                if (str == null) {
                    str = "";
                }
                objArr[0] = str;
                C67981Qm9.LIZIZ(objArr, 1, string, "format(format, *args)", textView3);
            }
            LLJJIJIL();
        } else {
            TextView textView4 = this.LJLLILLLL;
            if (textView4 != null) {
                textView4.setText(R.string.r8p);
            }
        }
        if (C46122I8g.LIZ() == 2) {
            TextView textView5 = this.LJLLILLLL;
            if (textView5 != null) {
                textView5.setEllipsize(TextUtils.TruncateAt.END);
            }
        } else if (C46122I8g.LIZ() == 1) {
            TextView textView6 = this.LJLLILLLL;
            if (textView6 != null) {
                textView6.setEllipsize(null);
            }
            TextView textView7 = this.LJLLILLLL;
            if ((textView7 instanceof C8HF) && (c8hf = (C8HF) textView7) != null) {
                c8hf.setOnlyMarqueeOnce(true);
            }
        }
        if (C46126I8k.LIZ() == 4 && (textView2 = this.LJLLILLLL) != null) {
            textView2.setMinWidth(0);
        }
        this.LJLLL = findViewById(R.id.f0_);
        View findViewById = findViewById(R.id.g24);
        this.LJLLLLLL = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        if (view instanceof AnonymousClass607) {
            anonymousClass607 = (AnonymousClass607) view;
        } else {
            anonymousClass607 = null;
        }
        this.LJZ = anonymousClass607;
        if (anonymousClass607 != null) {
            anonymousClass607.setChooseMusicDockerContentView(anonymousClass607.findViewById(R.id.baz));
            anonymousClass607.setChooseMusicClickContainer(anonymousClass607.findViewById(R.id.bb6));
            anonymousClass607.setChooseMusicTextView((C8HF) anonymousClass607.findViewById(R.id.mok));
            anonymousClass607.setChooseMusicIconView((TuxIconView) anonymousClass607.findViewById(R.id.bb4));
            anonymousClass607.setCancelMusicClickContainer(anonymousClass607.findViewById(R.id.bay));
            anonymousClass607.setChooseMusicLoadingView((ImageView) anonymousClass607.findViewById(R.id.f0a));
            anonymousClass607.setCutMusicClickContainer(anonymousClass607.findViewById(R.id.bb3));
        }
        LLJJIJIIJIL();
        this.LJLJLLL = (ShortVideoContextViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(ShortVideoContextViewModel.class);
        Typeface LIZLLL = C8HI.LIZJ().LIZLLL("medium");
        if (LIZLLL != null && (textView = this.LJLLILLLL) != null) {
            textView.setTypeface(LIZLLL);
        }
        this.LJLJI.LIZIZ(this, new AObjectS86S0100000_7(this, 145));
        if (!LLJJ()) {
            this.LJLILLLLZI.LJLLILLLL.LIZIZ(this, new AObjectS86S0100000_7(this, 146));
        }
        if (((Boolean) C52917Kpl.LIZJ.getValue()).booleanValue() || ((((Boolean) C52917Kpl.LIZ.getValue()).booleanValue() && o.LJ(this.LJLJJL.shootWay, "single_song")) || (((Boolean) C52917Kpl.LIZIZ.getValue()).booleanValue() && (o.LJ(this.LJLJJL.shootWay, "prop_reuse") || o.LJ(this.LJLJJL.shootWay, "prop_page"))))) {
            z = true;
        } else {
            z = false;
        }
        if (!LLJJ()) {
            this.LJLILLLLZI.LJLLJ.LIZLLL(this, new AObjectS43S0110000_7(z, this, 0));
        }
        this.LJLILLLLZI.LJLJJLL.LIZIZ(this, new AObjectS86S0100000_7(this, 147));
        this.LJLILLLLZI.LJLJL.LIZLLL(this, new AObjectS86S0100000_7(this, 148));
        this.LJLILLLLZI.LJLJJL.LIZLLL(this, new AObjectS86S0100000_7(this, 149));
        this.LJLILLLLZI.LJLILLLLZI.LIZIZ(this, new AObjectS86S0100000_7(this, 150));
        this.LJLILLLLZI.LJLJI.LIZIZ(this, new AObjectS86S0100000_7(this, 151));
        this.LJLILLLLZI.LJLLL.LIZLLL(this, new AObjectS86S0100000_7(this, UserLevelGeckoUpdateSetting.DEFAULT));
        ShortVideoContextViewModel shortVideoContextViewModel = this.LJLJLLL;
        if (shortVideoContextViewModel != null) {
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.LJLIL;
            if (shortVideoContext.isPhotoMvMode && shortVideoContext.mIsFromDraft) {
                LLJJIII(false);
                AnonymousClass607 anonymousClass6072 = this.LJZ;
                if (anonymousClass6072 != null) {
                    anonymousClass6072.setVisibility(8);
                }
            }
            this.LJLILLLLZI.LJLJLJ.LIZLLL(this, new AObjectS86S0100000_7(this, 141));
            this.LJLILLLLZI.LJLLI.LIZLLL(this, new AObjectS86S0100000_7(this, 142));
            this.LJLILLLLZI.LJLLLLLL.LIZIZ(this, new AObjectS86S0100000_7(this, 143));
            this.LJLILLLLZI.LJZ.LIZLLL(this, new AObjectS86S0100000_7(this, 144));
            View view2 = this.LJLLLLLL;
            if (view2 != null) {
                C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 70), view2);
            }
            AnonymousClass607 anonymousClass6073 = this.LJZ;
            if (anonymousClass6073 != null) {
                anonymousClass6073.setCancelMusicLayerListener(new ACListenerS27S0100000_7(this, 71));
            }
            AnonymousClass607 anonymousClass6074 = this.LJZ;
            if (anonymousClass6074 != null) {
                C82622Wbi c82622Wbi = this.LJLIL;
                if (L2L.LIZ(c82622Wbi)) {
                    ((C1EP) c82622Wbi.LJ(C1EP.class, null)).m3(InterfaceC46131I8p.class, new AqS173S0100000_7(anonymousClass6074, 188));
                    return;
                }
                C0I6 c0i6 = (C0I6) c82622Wbi.LJIIIIZZ(null, InterfaceC46131I8p.class);
                if (c0i6 == null) {
                    return;
                }
                ((InterfaceC46131I8p) c0i6).JX(anonymousClass6074);
                return;
            }
            return;
        }
        o.LJIJI("shortVideoContextViewModel");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        int i;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (C46126I8k.LIZ() == 4) {
            i = R.layout.drq;
        } else {
            i = R.layout.drp;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, container, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(getLayo…esId(), container, false)");
        return LLLLIILL;
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

    public C46119I8d(C82622Wbi diContainer, I8D states, C0IB<Boolean> enableTopMarginEvent, TEZ tez, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(states, "states");
        o.LJIIIZ(enableTopMarginEvent, "enableTopMarginEvent");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = states;
        this.LJLJI = enableTopMarginEvent;
        this.LJLJJI = tez;
        this.LJLJJL = shortVideoContext;
        this.LJLJJLL = true;
        this.LJZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 366));
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
