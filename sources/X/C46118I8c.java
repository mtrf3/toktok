package X;

import Y.ACListenerS27S0100000_7;
import Y.AObjectS43S0110000_7;
import Y.AObjectS86S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I8c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46118I8c extends AbstractC56042Hw implements InterfaceC143795kd {
    public final C82622Wbi LJLJI;
    public final I8D LJLJJI;
    public final C0IB<Boolean> LJLJJL;
    public final TEZ LJLJJLL;
    public final ShortVideoContext LJLJL;
    public final boolean LJLJLJ;
    public C44293HZx LJLJLLL;
    public InterfaceC82683Wch LJLL;
    public ShortVideoContextViewModel LJLLI;
    public TuxIconView LJLLILLLL;
    public TuxIconView LJLLJ;
    public TextView LJLLL;
    public RelativeLayout LJLLLL;
    public View LJLLLLLL;
    public Animator LJLZ;
    public View LJZ;
    public boolean LJZI;
    public AnonymousClass607 LJZL;
    public final C29901Fi<C76800UCe> LL;
    public final C29901Fi LLD;
    public final C62822Ol8 LLF;

    public final boolean LLJJJ() {
        return IMService.createIIMServicebyMonsterPlugin(false).getCameraService().LIZ() && this.LJLJL.creativeModel.initialModel.dmCameraModel.enterFromDM;
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
    public final void LLJJI() {
        Animator animator = this.LJLZ;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // X.AbstractC56042Hw
    public final void LLJJIII() {
        C8HF chooseMusicTextView;
        TextView textView = this.LJLLL;
        if (textView != null) {
            textView.requestFocus();
        }
        AnonymousClass607 anonymousClass607 = this.LJZL;
        if (anonymousClass607 != null && (chooseMusicTextView = anonymousClass607.getChooseMusicTextView()) != null) {
            chooseMusicTextView.requestFocus();
        }
    }

    public final SafeHandler LLJJIJIL() {
        return (SafeHandler) this.LLF.getValue();
    }

    public final void LLJJLIIIJLLLLLLLZ() {
        if (this.LJLJJI.LJLJL.LIZJ() != null && !this.LJLJL.LJJIJIIJIL() && (!this.LJLJL.LJJIJIIJI() || !this.LJLJL.LJJJIL())) {
            AnonymousClass607 anonymousClass607 = this.LJZL;
            if (anonymousClass607 != null) {
                anonymousClass607.LIZLLL(AnonymousClass609.DARK_COLOR_WITH_CANCEL_BUTTON);
                return;
            }
            return;
        }
        AnonymousClass607 anonymousClass6072 = this.LJZL;
        if (anonymousClass6072 == null) {
            return;
        }
        anonymousClass6072.LIZLLL(AnonymousClass609.DARK_COLOR_WITHOUT_CANCEL_BUTTON);
    }

    public final void LLJLIL() {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_paperplane_fill;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        TuxIconView tuxIconView = this.LJLLILLLL;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c2068389v);
        }
        TuxIconView tuxIconView2 = this.LJLLJ;
        if (tuxIconView2 != null) {
            tuxIconView2.setTuxIcon(c2068389v);
        }
    }

    @Override // X.AbstractC56042Hw
    public final int LLJILJILJ() {
        if (C46126I8k.LIZ() == 4) {
            return R.layout.drq;
        }
        return R.layout.drp;
    }

    public static final String LLJJIJIIJIL(AVMusic aVMusic) {
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

    @Override // X.AbstractC56042Hw
    public final C0R5 LLJILJIL(LayoutInflater inflater) {
        o.LJIIIZ(inflater, "inflater");
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        return new C30981Jm(requireSceneContext);
    }

    @Override // X.AbstractC56042Hw
    public final void LLJJIJI(View view) {
        C8HF c8hf;
        AnonymousClass607 anonymousClass607;
        boolean z;
        TextView textView;
        TextView textView2;
        this.LJLLLL = (RelativeLayout) findViewById(R.id.j53);
        this.LJLLILLLL = (TuxIconView) findViewById(R.id.f07);
        this.LJLLJ = (TuxIconView) findViewById(R.id.bb4);
        this.LJLLL = (TextView) findViewById(R.id.mok);
        if (LLJJJ()) {
            TextView textView3 = this.LJLLL;
            if (textView3 != null) {
                String string = getString(R.string.em_);
                o.LJIIIIZZ(string, "getString(R.string.dm_cam_camera_toplabel)");
                Object[] objArr = new Object[1];
                String str = this.LJLJL.creativeModel.initialModel.dmCameraModel.receiverNickname;
                if (str == null) {
                    str = "";
                }
                objArr[0] = str;
                C67981Qm9.LIZIZ(objArr, 1, string, "format(format, *args)", textView3);
            }
            LLJLIL();
        } else {
            TextView textView4 = this.LJLLL;
            if (textView4 != null) {
                textView4.setText(R.string.r8p);
            }
        }
        if (C46122I8g.LIZ() == 2) {
            TextView textView5 = this.LJLLL;
            if (textView5 != null) {
                textView5.setEllipsize(TextUtils.TruncateAt.END);
            }
        } else if (C46122I8g.LIZ() == 1) {
            TextView textView6 = this.LJLLL;
            if (textView6 != null) {
                textView6.setEllipsize(null);
            }
            TextView textView7 = this.LJLLL;
            if ((textView7 instanceof C8HF) && (c8hf = (C8HF) textView7) != null) {
                c8hf.setOnlyMarqueeOnce(true);
            }
        }
        if (C46126I8k.LIZ() == 4 && (textView2 = this.LJLLL) != null) {
            textView2.setMinWidth(0);
        }
        this.LJLLLLLL = findViewById(R.id.f0_);
        View findViewById = findViewById(R.id.g24);
        this.LJZ = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = findViewById(R.id.bb2);
        if (findViewById2 instanceof AnonymousClass607) {
            anonymousClass607 = (AnonymousClass607) findViewById2;
        } else {
            anonymousClass607 = null;
        }
        this.LJZL = anonymousClass607;
        if (anonymousClass607 != null) {
            anonymousClass607.setChooseMusicDockerContentView(anonymousClass607.findViewById(R.id.baz));
            anonymousClass607.setChooseMusicClickContainer(anonymousClass607.findViewById(R.id.bb6));
            anonymousClass607.setChooseMusicTextView((C8HF) anonymousClass607.findViewById(R.id.mok));
            anonymousClass607.setChooseMusicIconView((TuxIconView) anonymousClass607.findViewById(R.id.bb4));
            anonymousClass607.setCancelMusicClickContainer(anonymousClass607.findViewById(R.id.bay));
            anonymousClass607.setChooseMusicLoadingView((ImageView) anonymousClass607.findViewById(R.id.f0a));
            anonymousClass607.setCutMusicClickContainer(anonymousClass607.findViewById(R.id.bb3));
        }
        LLJJLIIIJLLLLLLLZ();
        this.LJLLI = (ShortVideoContextViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(ShortVideoContextViewModel.class);
        Typeface LIZLLL = C8HI.LIZJ().LIZLLL("medium");
        if (LIZLLL != null && (textView = this.LJLLL) != null) {
            textView.setTypeface(LIZLLL);
        }
        this.LJLJJL.LIZIZ(this, new AObjectS86S0100000_7(this, 138));
        if (!LLJJJ()) {
            this.LJLJJI.LJLLILLLL.LIZIZ(this, new AObjectS86S0100000_7(this, 139));
        }
        if (((Boolean) C52917Kpl.LIZJ.getValue()).booleanValue() || ((((Boolean) C52917Kpl.LIZ.getValue()).booleanValue() && o.LJ(this.LJLJL.shootWay, "single_song")) || (((Boolean) C52917Kpl.LIZIZ.getValue()).booleanValue() && (o.LJ(this.LJLJL.shootWay, "prop_reuse") || o.LJ(this.LJLJL.shootWay, "prop_page"))))) {
            z = true;
        } else {
            z = false;
        }
        if (!LLJJJ()) {
            this.LJLJJI.LJLLJ.LIZLLL(this, new AObjectS43S0110000_7(z, this, 1));
        }
        this.LJLJJI.LJLJJLL.LIZIZ(this, new AObjectS86S0100000_7(this, 156));
        this.LJLJJI.LJLJL.LIZLLL(this, new AObjectS86S0100000_7(this, 157));
        this.LJLJJI.LJLJJL.LIZLLL(this, new AObjectS86S0100000_7(this, 158));
        this.LJLJJI.LJLILLLLZI.LIZIZ(this, new AObjectS86S0100000_7(this, 159));
        this.LJLJJI.LJLJI.LIZIZ(this, new AObjectS86S0100000_7(this, 160));
        this.LJLJJI.LJLLL.LIZLLL(this, new AObjectS86S0100000_7(this, 108));
        ShortVideoContextViewModel shortVideoContextViewModel = this.LJLLI;
        if (shortVideoContextViewModel != null) {
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.LJLIL;
            if (shortVideoContext.isPhotoMvMode && shortVideoContext.mIsFromDraft) {
                LLJJJJ(false);
                AnonymousClass607 anonymousClass6072 = this.LJZL;
                if (anonymousClass6072 != null) {
                    anonymousClass6072.setVisibility(8);
                }
            }
            this.LJLJJI.LJLJLJ.LIZLLL(this, new AObjectS86S0100000_7(this, 134));
            this.LJLJJI.LJLLI.LIZLLL(this, new AObjectS86S0100000_7(this, 135));
            this.LJLJJI.LJLLLLLL.LIZIZ(this, new AObjectS86S0100000_7(this, 136));
            this.LJLJJI.LJZ.LIZLLL(this, new AObjectS86S0100000_7(this, 137));
            View view2 = this.LJZ;
            if (view2 != null) {
                C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 68), view2);
            }
            AnonymousClass607 anonymousClass6073 = this.LJZL;
            if (anonymousClass6073 != null) {
                anonymousClass6073.setCancelMusicLayerListener(new ACListenerS27S0100000_7(this, 69));
            }
            AnonymousClass607 anonymousClass6074 = this.LJZL;
            if (anonymousClass6074 != null) {
                C82622Wbi c82622Wbi = this.LJLJI;
                if (L2L.LIZ(c82622Wbi)) {
                    ((C1EP) c82622Wbi.LJ(C1EP.class, null)).m3(InterfaceC46131I8p.class, new AqS173S0100000_7(anonymousClass6074, 184));
                } else {
                    C0I6 c0i6 = (C0I6) c82622Wbi.LJIIIIZZ(null, InterfaceC46131I8p.class);
                    if (c0i6 != null) {
                        ((InterfaceC46131I8p) c0i6).JX(anonymousClass6074);
                    }
                }
            }
            this.LL.LJII(C76800UCe.LIZ);
            return;
        }
        o.LJIJI("shortVideoContextViewModel");
        throw null;
    }

    public final void LLJJJIL(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        View view = this.LJZ;
        if (view != null) {
            view.setVisibility(i);
        }
        AnonymousClass607 anonymousClass607 = this.LJZL;
        if (anonymousClass607 != null) {
            anonymousClass607.LIZJ(z);
        }
        AnonymousClass607 anonymousClass6072 = this.LJZL;
        if (anonymousClass6072 != null) {
            anonymousClass6072.setUpCutVisibilityAB(false);
        }
    }

    public final void LLJJJJ(boolean z) {
        AnonymousClass607 anonymousClass607 = this.LJZL;
        if (anonymousClass607 != null) {
            if (z) {
                C8HF chooseMusicTextView = anonymousClass607.getChooseMusicTextView();
                if (chooseMusicTextView != null) {
                    chooseMusicTextView.setVisibility(0);
                }
                LLJJIJIL().postDelayed(new ARunnableS43S0100000_7(anonymousClass607, 59), 100L);
                return;
            }
            C8HF chooseMusicTextView2 = anonymousClass607.getChooseMusicTextView();
            if (chooseMusicTextView2 == null) {
                return;
            }
            chooseMusicTextView2.setVisibility(8);
            return;
        }
        if (z && this.LJLJLJ) {
            TextView textView = this.LJLLL;
            if (textView != null) {
                textView.setVisibility(0);
            }
            LLJJIJIL().post(new ARunnableS43S0100000_7(this, 60));
            return;
        }
        TextView textView2 = this.LJLLL;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    public final void LLJJL(boolean z) {
        RelativeLayout relativeLayout = this.LJLLLL;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        LLJJIJIL().post(new ARunnableS43S0100000_7(this, 61));
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

    public C46118I8c(C82622Wbi diContainer, I8D states, C0IB<Boolean> enableTopMarginEvent, TEZ tez, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(states, "states");
        o.LJIIIZ(enableTopMarginEvent, "enableTopMarginEvent");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJLJI = diContainer;
        this.LJLJJI = states;
        this.LJLJJL = enableTopMarginEvent;
        this.LJLJJLL = tez;
        this.LJLJL = shortVideoContext;
        this.LJLJLJ = true;
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LL = c29901Fi;
        this.LLD = c29901Fi;
        this.LLF = C221108m2.LIZIZ(new AqS157S0100000_7(this, 354));
        this.LJLIL = e1.LIZ(31744, "record_choose_music_async_layout_inflater_scene_enabled", true, false);
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
