package com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.play;

import X.AbstractC72775ShH;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C1DH;
import X.C221108m2;
import X.C222688oa;
import X.C42470Gle;
import X.C43001GuD;
import X.C47246IgU;
import X.C47689Ind;
import X.C48963JJn;
import X.C48964JJo;
import X.C48965JJp;
import X.C62822Ol8;
import X.C74263TCp;
import X.C87277YNd;
import X.EnumC47177IfN;
import X.HQU;
import X.IPG;
import X.IPH;
import X.IT4;
import X.ITW;
import X.InterfaceC44059HQx;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS27S0100000_7;
import Y.ARunnableS43S0100000_7;
import Y.ARunnableS44S0100000_8;
import Y.ARunnableS8S1100000_7;
import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class PlayViewComponent implements GenericLifecycleObserver, OnUIPlayListener, InterfaceC44059HQx {
    public final ViewGroup LJLIL;
    public final HQU LJLILLLLZI;
    public ActivityC86117Xqz LJLJI;
    public boolean LJLJJLL;
    public boolean LJLJLJ;
    public long LJLJLLL;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C48964JJo.LJLIL);
    public final Handler LJLJJL = new Handler(C16880lQ.LLJJJJ());
    public boolean LJLJL = true;
    public final ARunnableS43S0100000_7 LJLL = new ARunnableS43S0100000_7(this, 54);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C222688oa.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
        C222688oa.LIZIZ(this, str, j, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
        C222688oa.LIZJ(this, str, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z) {
        C222688oa.LIZLLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJ(this, str, z, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(boolean z) {
        C222688oa.LJFF(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
        C222688oa.LJI(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
        C222688oa.LJII(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJIIIIZZ(this, str, z, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C222688oa.LJIIIZ(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C222688oa.LJIIJ(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, ITW itw) {
        C222688oa.LJIIJJI(this, str, itw);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str) {
        C222688oa.LJIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, IPH iph) {
        C222688oa.LJIILIIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C222688oa.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C222688oa.LJIILLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, IPH iph) {
        C222688oa.LJIIZILJ(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(IPG ipg) {
        C222688oa.LJIJJ(this, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg, IPH iph) {
        C222688oa.LJIJI(this, str, ipg, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPause(String str) {
        C222688oa.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepare(String str) {
        C222688oa.LJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C222688oa.LJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C222688oa.LJJI(this, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C222688oa.LJJIFFI(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C222688oa.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str) {
        C222688oa.LJJIII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
        C222688oa.LJJIIJ(this, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, IPH iph) {
        C222688oa.LJJIIJZLJL(this, str, jSONObject, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, boolean z) {
        C222688oa.LJJIIZ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C222688oa.LJJIIZI(this, str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str) {
        C222688oa.LJJIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str, IPH iph) {
        C222688oa.LJJIJIIJI(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        C222688oa.LJJIJIIJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, IPH iph) {
        C222688oa.LJJIJL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(String str, IT4 it4) {
        C222688oa.LJJIJLIJ(this, str, it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C222688oa.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(IPH iph) {
        C222688oa.LJJJ(this, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str) {
        C222688oa.LJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(IPG ipg) {
        C222688oa.LJJJJI(this, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, IPG ipg) {
        C222688oa.LJJJJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        C222688oa.LJJJJJ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C222688oa.LJJJJJL(this, str, f);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        C222688oa.LJJJJL(this, str, enumC47177IfN, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C222688oa.LJJJJLI(this, str, i, i2);
    }

    public final VideoViewComponent LIZ() {
        return (VideoViewComponent) this.LJLJJI.getValue();
    }

    public final void LIZIZ() {
        this.LJLJJL.removeCallbacks(this.LJLL);
        this.LJLJJL.postDelayed(this.LJLL, 300L);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        if (this.LJLILLLLZI.LIZ().getVideo() == null) {
            ActivityC86117Xqz activityC86117Xqz = this.LJLJI;
            if (activityC86117Xqz != null) {
                activityC86117Xqz.finish();
            } else {
                o.LJIJI("activity");
                throw null;
            }
        }
        this.LJLJLLL = System.currentTimeMillis();
        int i = 1;
        this.LJLIL.setClipToOutline(true);
        this.LJLIL.setOutlineProvider(new C74263TCp(C48965JJp.LIZ));
        this.LJLIL.findViewById(R.id.n4_).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS27S0100000_7(this, 63)));
        Video video = this.LJLILLLLZI.LIZ().getVideo();
        if (video != null && video.getWidth() > 0 && video.getHeight() > 0) {
            FixedRatioFrameLayout fixedRatioFrameLayout = (FixedRatioFrameLayout) this.LJLIL.findViewById(R.id.hrg);
            if (video.getWidth() < video.getHeight()) {
                i = 0;
            }
            fixedRatioFrameLayout.setMode(i);
            ((FixedRatioFrameLayout) this.LJLIL.findViewById(R.id.hrg)).setWhRatio(video.getWidth() / video.getHeight());
        }
        C1DH.LJJIJIIJIL(500L, new ARunnableS44S0100000_8(this, 55));
        LIZIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        ActivityC86117Xqz activityC86117Xqz = this.LJLJI;
        if (activityC86117Xqz != null) {
            activityC86117Xqz.getLifecycle().removeObserver(this);
            this.LJLJJL.removeCallbacks(this.LJLL);
        } else {
            o.LJIJI("activity");
            throw null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (!this.LJLJL) {
            ka(false);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        String str;
        if (!this.LJLJJLL && this.LJLJL) {
            play();
        }
        Activity LIZ = C42470Gle.LIZ();
        if (LIZ != null) {
            str = LIZ.getLocalClassName();
        } else {
            str = null;
        }
        this.LJLJJL.postDelayed(new ARunnableS8S1100000_7(this, str, 3), 500L);
    }

    @Override // X.InterfaceC44059HQx
    public final void play() {
        if (this.LJLJL) {
            LIZ().LJIIL(this.LJLILLLLZI.LIZ().getVideo());
            ((ImageView) this.LJLIL.findViewById(R.id.hj9)).setVisibility(8);
            this.LJLJL = false;
            this.LJLJJLL = false;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        LIZ().LJIILJJIL((C47689Ind) this.LJLIL.findViewById(R.id.n4_));
        LIZ().LIZ(this);
        C47246IgU.LIZJ((C47689Ind) this.LJLIL.findViewById(R.id.n4_)).N7(new C48963JJn(this));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        LIZ().LLIIIILZ(this);
    }

    @Override // X.InterfaceC44059HQx
    public final boolean isPaused() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC44059HQx
    public final void h30(double d) {
        LIZ().LJIIJ((float) (((d * 1000) / LIZ().LJ()) * 100));
        this.LJLJJL.removeCallbacks(this.LJLL);
        this.LJLJJL.postDelayed(this.LJLL, 1500L);
    }

    @Override // X.InterfaceC44059HQx
    public final void ka(boolean z) {
        if (!this.LJLJL) {
            LIZ().pause();
            ((ImageView) this.LJLIL.findViewById(R.id.hj9)).setVisibility(0);
            this.LJLJL = true;
            if (z) {
                this.LJLJJLL = true;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        ActivityC86117Xqz activityC86117Xqz = this.LJLJI;
        if (activityC86117Xqz != null) {
            if (!activityC86117Xqz.isActive()) {
                ka(false);
                LIZ().pause();
                return;
            }
            return;
        }
        o.LJIJI("activity");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        this.LJLJLJ = true;
        C43001GuD.LJIIZILJ(0, this.LJLILLLLZI.LIZ().getAid(), "", this.LJLJLLL, this.LJLILLLLZI.LIZJ());
        ((AbstractC72775ShH) this.LJLIL.findViewById(R.id.g7x)).setLoading(false);
        View findViewById = this.LJLIL.findViewById(R.id.g7u);
        o.LJIIIIZZ(findViewById, "rootView.loadingIconView");
        C87277YNd.LJJIJIIJI(findViewById, false);
    }

    public PlayViewComponent(ViewGroup viewGroup, HQU hqu) {
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = hqu;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg) {
        int i;
        Integer num;
        long j = this.LJLJLLL;
        if (ipg != null) {
            i = ipg.LJ;
            num = Integer.valueOf(ipg.LJFF);
        } else {
            i = -1;
            num = null;
        }
        C43001GuD.LJIIZILJ(i, str, String.valueOf(num), j, this.LJLILLLLZI.LIZJ());
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        LIZIZ();
    }
}
