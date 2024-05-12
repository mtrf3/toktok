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
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.countdown.CountdownState;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WNz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82203WNz extends WMH implements InterfaceC143795kd {
    public final WO6 LJLIL;
    public WO2 LJLILLLLZI;
    public WO1 LJLJI;
    public int LJLJJI;
    public long LJLJJL;
    public int LJLJJLL;
    public C78256UnU LJLJL;
    public final WO5 LJLJLJ;
    public final WO0 LJLJLLL;

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
        WO2 wo2 = this.LJLILLLLZI;
        if (wo2 != null && (mediaPlayer = wo2.LIZ) != null) {
            try {
                mediaPlayer.pause();
                ARunnableS18S0101000_14 aRunnableS18S0101000_14 = wo2.LIZLLL;
                if (aRunnableS18S0101000_14 != null) {
                    wo2.LIZIZ.removeCallbacks(aRunnableS18S0101000_14);
                }
            } catch (Exception unused) {
            }
        }
        WO1 wo1 = this.LJLJI;
        if (wo1 != null && (c29701Eo = wo1.LJLJJI) != null && wo1.LJLJI != null && c29701Eo.isAnimating()) {
            wo1.LJLJJI.cancelAnimation();
            wo1.LJLJJI.setVisibility(8);
        }
        C78256UnU c78256UnU = this.LJLJL;
        if (c78256UnU != null) {
            c78256UnU.release();
        }
    }

    @Override // X.WM7
    public final void onResume() {
        MediaPlayer mediaPlayer;
        super.onResume();
        WO2 wo2 = this.LJLILLLLZI;
        if (wo2 == null || (mediaPlayer = wo2.LIZ) == null) {
            return;
        }
        try {
            mediaPlayer.start();
            ARunnableS18S0101000_14 aRunnableS18S0101000_14 = wo2.LIZLLL;
            if (aRunnableS18S0101000_14 == null) {
                return;
            }
            wo2.LIZIZ.post(aRunnableS18S0101000_14);
        } catch (Exception unused) {
        }
    }

    public C82203WNz(WO6 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
        this.LJLJJL = LivePlayEnforceIntervalSetting.DEFAULT;
        this.LJLJLJ = new WO5(this);
        this.LJLJLLL = new WO0(this);
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        WO4 wo4 = new WO4(this);
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        this.LJLJL = new C78256UnU(requireActivity);
        View view = this.mView;
        o.LJII(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) view;
        C78256UnU c78256UnU = this.LJLJL;
        if (c78256UnU != null) {
            this.LJLJI = new WO1(frameLayout, wo4, c78256UnU);
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(ShortVideoContextViewModel.class)).LJLIL;
            this.LJLJJL = shortVideoContext.LJIILIIL();
            C44350Has c44350Has = new C44350Has(0);
            Activity requireActivity2 = requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            ((IVideoRecordPreferences) c44350Has.LIZ(requireActivity2, IVideoRecordPreferences.class)).setShouldShowCountDownNewTag(false);
            AVMusicWaveBean LIZIZ = WG0.LIZIZ(shortVideoContext.musicWaveBean);
            WO3 wo3 = new WO3(this);
            WOB wob = new WOB(new CountdownState(shortVideoContext.cameraComponentModel.mMusicPath, shortVideoContext.mWavFormUrl, shortVideoContext.LJIIIIZZ(), shortVideoContext.cameraComponentModel.LJI(), shortVideoContext.LJIIJJI(), shortVideoContext.LJIILIIL(), shortVideoContext.LJJIJIIJIL(), LIZIZ));
            wob.LJLJI = this.LJLJLLL;
            wob.LJLJJI = wo3;
            wob.LJZL = this.LJLJLJ;
            add(R.id.ir7, wob, "count_down");
            this.LJLIL.LIZLLL(true);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ds1, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
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
