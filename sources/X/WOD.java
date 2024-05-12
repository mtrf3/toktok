package X;

import Y.ARunnableS18S0101000_14;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.ftc.countdown.FTCCountdownState;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WOD extends WMH implements InterfaceC143795kd {
    public final WOR LJLIL;
    public WOG LJLILLLLZI;
    public WOF LJLJI;
    public int LJLJJI;
    public long LJLJJL;
    public int LJLJJLL;
    public C78255UnT LJLJL;
    public final WOO LJLJLJ;
    public final WOE LJLJLLL;

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
    public final void onPause() {
        C29701Eo c29701Eo;
        MediaPlayer mediaPlayer;
        super.onPause();
        WOG wog = this.LJLILLLLZI;
        if (wog != null && (mediaPlayer = wog.LIZ) != null) {
            try {
                mediaPlayer.pause();
                ARunnableS18S0101000_14 aRunnableS18S0101000_14 = wog.LIZLLL;
                if (aRunnableS18S0101000_14 != null) {
                    wog.LIZIZ.removeCallbacks(aRunnableS18S0101000_14);
                }
            } catch (Exception unused) {
            }
        }
        WOF wof = this.LJLJI;
        if (wof != null && (c29701Eo = wof.LJLJJI) != null && wof.LJLJI != null && c29701Eo.isAnimating()) {
            wof.LJLJJI.cancelAnimation();
            wof.LJLJJI.setVisibility(8);
        }
        C78255UnT c78255UnT = this.LJLJL;
        if (c78255UnT != null) {
            c78255UnT.release();
        }
    }

    @Override // X.WM7
    public final void onResume() {
        MediaPlayer mediaPlayer;
        super.onResume();
        WOG wog = this.LJLILLLLZI;
        if (wog == null || (mediaPlayer = wog.LIZ) == null) {
            return;
        }
        try {
            mediaPlayer.start();
            ARunnableS18S0101000_14 aRunnableS18S0101000_14 = wog.LIZLLL;
            if (aRunnableS18S0101000_14 == null) {
                return;
            }
            wog.LIZIZ.post(aRunnableS18S0101000_14);
        } catch (Exception unused) {
        }
    }

    public WOD(WOR listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
        this.LJLJJL = LivePlayEnforceIntervalSetting.DEFAULT;
        this.LJLJLJ = new WOO(this);
        this.LJLJLLL = new WOE(this);
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        WOL wol = new WOL(this);
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        this.LJLJL = new C78255UnT(requireActivity);
        View view = this.mView;
        o.LJII(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        C78255UnT c78255UnT = this.LJLJL;
        o.LJI(c78255UnT);
        this.LJLJI = new WOF((FrameLayout) view, wol, c78255UnT);
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) ViewModelProviders.of(SceneExtensionsKt.LIZLLL(this)).get(ShortVideoContextViewModel.class)).LJLIL;
        this.LJLJJL = shortVideoContext.LJIILIIL();
        C44350Has c44350Has = new C44350Has(0);
        Activity requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        ((IVideoRecordPreferences) c44350Has.LIZ(requireActivity2, IVideoRecordPreferences.class)).setShouldShowCountDownNewTag(false);
        AVMusicWaveBean LIZIZ = WG0.LIZIZ(shortVideoContext.musicWaveBean);
        WOH woh = new WOH(this);
        WOC woc = new WOC(new FTCCountdownState(shortVideoContext.cameraComponentModel.mMusicPath, shortVideoContext.mWavFormUrl, shortVideoContext.LJIIIIZZ(), shortVideoContext.cameraComponentModel.LJI(), shortVideoContext.LJIIJJI(), shortVideoContext.LJIILIIL(), LIZIZ));
        woc.LJLILLLLZI = this.LJLJLLL;
        woc.LJLJI = woh;
        woc.LJZ = this.LJLJLJ;
        add(R.id.ir7, woc, "count_down");
        this.LJLIL.LIZLLL(true);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.az8, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
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
