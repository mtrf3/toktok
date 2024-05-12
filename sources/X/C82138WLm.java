package X;

import Y.ACListenerS24S0101000_5;
import Y.ARunnableS11S0101000_7;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.WLm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82138WLm extends WM7 implements InterfaceC143795kd, InterfaceC30028BqS, InterfaceC82146WLu {
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLIL;
    public ShortVideoContext LJLILLLLZI;
    public C82141WLp LJLJI;
    public RepeatMusicPlayer LJLJJI;
    public String LJLJJL;
    public int LJLJJLL;
    public int LJLJL;

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
        View view;
        super.onDestroyView();
        C82141WLp c82141WLp = this.LJLJI;
        if (c82141WLp != null && (view = c82141WLp.LIZ) != null) {
            C16880lQ.LJLLLL(view, c82141WLp.LIZIZ);
            c82141WLp.LIZ = null;
        }
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
        RepeatMusicPlayer repeatMusicPlayer = this.LJLJJI;
        if (repeatMusicPlayer != null) {
            repeatMusicPlayer.LIZIZ();
        }
        this.LJLJJI = null;
    }

    public C82138WLm(AqS173S0100000_7 aqS173S0100000_7) {
        this.LJLIL = aqS173S0100000_7;
    }

    @Override // X.InterfaceC30028BqS
    public final void LJJIIJ(int i) {
        String str = this.LJLJJL;
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.LJLJL = i;
            LLJILJIL(i, this.LJLJJLL);
            return;
        }
        o.LJIJI("mMusicPath");
        throw null;
    }

    @Override // X.InterfaceC30028BqS
    public final void LJJIIZ(int i) {
        this.LJLJL = i;
        this.LJLIL.invoke(Integer.valueOf(i));
        RepeatMusicPlayer repeatMusicPlayer = this.LJLJJI;
        if (repeatMusicPlayer != null) {
            repeatMusicPlayer.LIZIZ();
        }
        this.LJLJJI = null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) ViewModelProviders.of((ActivityC45651qj) activity).get(ShortVideoContextViewModel.class)).LJLIL;
        o.LJIIIIZZ(shortVideoContext, "of(activity as FragmentA…s.java).shortVideoContext");
        this.LJLILLLLZI = shortVideoContext;
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        if (cameraComponentModel.curBackgroundVideo != null) {
            i = (int) C60903NvH.LJIIJJI().LJJIII().getMaxDurationResolver().getMaxShootingDuration();
            ShortVideoContext shortVideoContext2 = this.LJLILLLLZI;
            if (shortVideoContext2 != null) {
                if (!shortVideoContext2.cameraComponentModel.mCurrentDurationMode) {
                    i = 15000;
                }
            } else {
                o.LJIJI("shortVideoContext");
                throw null;
            }
        } else {
            i = (int) cameraComponentModel.mMaxDuration;
        }
        ShortVideoContext shortVideoContext3 = this.LJLILLLLZI;
        if (shortVideoContext3 != null) {
            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext3.creativeModel.musicBuzModel);
            if (extractAVMusic != null && extractAVMusic.getShootDuration() > 0) {
                i = Math.min(i, extractAVMusic.getShootDuration());
            }
            this.LJLJJLL = i;
            ShortVideoContext shortVideoContext4 = this.LJLILLLLZI;
            if (shortVideoContext4 != null) {
                CameraComponentModel cameraComponentModel2 = shortVideoContext4.cameraComponentModel;
                this.LJLJL = cameraComponentModel2.mMusicStart;
                String str = cameraComponentModel2.mMusicPath;
                o.LJIIIIZZ(str, "shortVideoContext.getmMusicPath()");
                this.LJLJJL = str;
                View view = this.mView;
                o.LJII(view, "null cannot be cast to non-null type android.widget.FrameLayout");
                FrameLayout frameLayout = (FrameLayout) view;
                C82141WLp c82141WLp = new C82141WLp(frameLayout, this);
                ShortVideoContext shortVideoContext5 = this.LJLILLLLZI;
                if (shortVideoContext5 != null) {
                    c82141WLp.LJ = shortVideoContext5.musicWaveBean;
                    int i2 = this.LJLJJLL;
                    int LJIIJJI = shortVideoContext5.LJIIJJI();
                    int i3 = this.LJLJL;
                    View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(frameLayout.getContext()), R.layout.v6, frameLayout, false);
                    c82141WLp.LIZ = LLLLIILL;
                    frameLayout.addView(LLLLIILL);
                    View view2 = c82141WLp.LIZ;
                    ViewOnTouchListenerC82139WLn viewOnTouchListenerC82139WLn = new ViewOnTouchListenerC82139WLn();
                    viewOnTouchListenerC82139WLn.LJLJLLL = i2;
                    viewOnTouchListenerC82139WLn.LJLL = i3;
                    viewOnTouchListenerC82139WLn.LJLLI = LJIIJJI;
                    viewOnTouchListenerC82139WLn.LJLJLJ = view2;
                    viewOnTouchListenerC82139WLn.LJLILLLLZI = (SY2) view2.findViewById(R.id.ff1);
                    viewOnTouchListenerC82139WLn.LJLJI = (TextView) view2.findViewById(R.id.ml4);
                    viewOnTouchListenerC82139WLn.LJLJJI = (TextView) view2.findViewById(R.id.m69);
                    viewOnTouchListenerC82139WLn.LJLJJLL = (WG4) view2.findViewById(R.id.c34);
                    viewOnTouchListenerC82139WLn.LJLJL = (RelativeLayout) view2.findViewById(R.id.k49);
                    viewOnTouchListenerC82139WLn.LJLJJL = view2.getContext().getResources().getString(R.string.sf7);
                    C16880lQ.LJIIJ(new ACListenerS24S0101000_5(3, viewOnTouchListenerC82139WLn, 9), view2.findViewById(R.id.f1e));
                    viewOnTouchListenerC82139WLn.LJLJJI.setText(C78605Ut7.LJIIL(viewOnTouchListenerC82139WLn.LJLLI));
                    viewOnTouchListenerC82139WLn.LJLJI.setText(viewOnTouchListenerC82139WLn.LJLJJL);
                    ImageView imageView = new ImageView(viewOnTouchListenerC82139WLn.LJLJLJ.getContext());
                    viewOnTouchListenerC82139WLn.LJLIL = imageView;
                    imageView.setImageResource(R.drawable.axn);
                    viewOnTouchListenerC82139WLn.LJLIL.setScaleType(ImageView.ScaleType.FIT_XY);
                    viewOnTouchListenerC82139WLn.LJLJL.addView(viewOnTouchListenerC82139WLn.LJLIL);
                    viewOnTouchListenerC82139WLn.LJLIL.setX(viewOnTouchListenerC82139WLn.LJLILLLLZI.getX() - (viewOnTouchListenerC82139WLn.LJLIL.getWidth() / 2));
                    viewOnTouchListenerC82139WLn.LJLILLLLZI.setLength(viewOnTouchListenerC82139WLn.LIZIZ());
                    viewOnTouchListenerC82139WLn.LJLIL.setOnTouchListener(viewOnTouchListenerC82139WLn);
                    WG4 wg4 = viewOnTouchListenerC82139WLn.LJLJJLL;
                    wg4.setBubbleTextViewAttribute(C81995WFz.LIZJ(wg4.getContext()));
                    viewOnTouchListenerC82139WLn.LJLJJLL.setScrollListener(new C82140WLo(viewOnTouchListenerC82139WLn));
                    viewOnTouchListenerC82139WLn.LJLJJLL.LIZIZ((viewOnTouchListenerC82139WLn.LJLL * 1.0f) / viewOnTouchListenerC82139WLn.LJLLI);
                    viewOnTouchListenerC82139WLn.LJLJJLL.setTimeBubble(viewOnTouchListenerC82139WLn.LJLL);
                    viewOnTouchListenerC82139WLn.LJLJLJ.bringToFront();
                    int i4 = viewOnTouchListenerC82139WLn.LJLLI;
                    int i5 = viewOnTouchListenerC82139WLn.LJLJLLL;
                    if (i4 > i5 && i4 < i5 + 1000) {
                        viewOnTouchListenerC82139WLn.LJLLL = true;
                    }
                    view2.post(new ARunnableS11S0101000_7(9, viewOnTouchListenerC82139WLn, 11));
                    InterfaceC82142WLq interfaceC82142WLq = viewOnTouchListenerC82139WLn.LJLLLLLL;
                    if (interfaceC82142WLq != null) {
                        ((C82141WLp) interfaceC82142WLq).LIZLLL.LJJIIJ(i3);
                    }
                    viewOnTouchListenerC82139WLn.LJLLLL = c82141WLp;
                    viewOnTouchListenerC82139WLn.LJLLLLLL = c82141WLp;
                    c82141WLp.LIZJ = viewOnTouchListenerC82139WLn;
                    AVMusicWaveBean LIZIZ = WG0.LIZIZ(c82141WLp.LJ);
                    WG0.LJI.LIZ(LIZIZ, i2, LJIIJJI);
                    WG0.LJ(LIZIZ);
                    if (LIZIZ != null && viewOnTouchListenerC82139WLn.LJLJJLL != null) {
                        viewOnTouchListenerC82139WLn.LIZJ(false);
                        viewOnTouchListenerC82139WLn.LJLJJLL.setAudioWaveViewData(LIZIZ);
                    } else {
                        viewOnTouchListenerC82139WLn.LIZJ(true);
                    }
                    c82141WLp.LIZ.setAlpha(0.0f);
                    c82141WLp.LIZ.animate().alpha(1.0f).setDuration(200L).start();
                    this.LJLJI = c82141WLp;
                    LLJILJIL(this.LJLJL, this.LJLJJLL);
                    return;
                }
                o.LJIJI("shortVideoContext");
                throw null;
            }
            o.LJIJI("shortVideoContext");
            throw null;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    @Override // X.InterfaceC82146WLu
    public final void onProgress(int i) {
        ViewOnTouchListenerC82139WLn viewOnTouchListenerC82139WLn;
        WG4 wg4;
        C82141WLp c82141WLp = this.LJLJI;
        if (c82141WLp != null && (viewOnTouchListenerC82139WLn = c82141WLp.LIZJ) != null && (wg4 = viewOnTouchListenerC82139WLn.LJLJJLL) != null && wg4.getVisibility() == 0) {
            viewOnTouchListenerC82139WLn.LJLJJLL.LIZJ(((i - viewOnTouchListenerC82139WLn.LJLL) * 1.0f) / viewOnTouchListenerC82139WLn.LJLLI);
        }
    }

    public final void LLJILJIL(int i, int i2) {
        String str = this.LJLJJL;
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (this.LJLJJI == null) {
                String str2 = this.LJLJJL;
                if (str2 != null) {
                    this.LJLJJI = new RepeatMusicPlayer(i2, this, str2);
                } else {
                    o.LJIJI("mMusicPath");
                    throw null;
                }
            }
            RepeatMusicPlayer repeatMusicPlayer = this.LJLJJI;
            o.LJI(repeatMusicPlayer);
            repeatMusicPlayer.LIZ(i);
            RepeatMusicPlayer repeatMusicPlayer2 = this.LJLJJI;
            o.LJI(repeatMusicPlayer2);
            repeatMusicPlayer2.LJLJLJ = this;
            return;
        }
        o.LJIJI("mMusicPath");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.aza, viewGroup, false, "inflater.inflate(R.layou…_scene, container, false)");
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
