package com.ss.android.ugc.aweme.commercialize.widget;

import X.C16880lQ;
import X.C221108m2;
import X.C222688oa;
import X.C58655N0h;
import X.C58704N2e;
import X.C59127NIl;
import X.C59128NIm;
import X.C59129NIn;
import X.C59672NbQ;
import X.C62822Ol8;
import X.C78983UzD;
import X.EnumC47177IfN;
import X.IPG;
import X.IPH;
import X.IQF;
import X.IQG;
import X.IQR;
import X.IT4;
import X.ITW;
import X.IWF;
import X.InterfaceC46330IGg;
import X.KL2;
import X.KRF;
import X.KRH;
import X.NN1;
import X.QD3;
import X.Z8A;
import Y.ACListenerS28S0100000_8;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.ss.android.ugc.aweme.commercialize.utils.ViewWrapper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class AdFakeUserProfileVideoPlayWidget extends AbsAdProfileWidget implements OnUIPlayListener {
    public IQF LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLLLL;
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 41));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 42));
    public final KRF LJLLLL = new KRF();
    public final Handler LJLZ = new Handler(C16880lQ.LLJJJJ());

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
    public final void onBuffering(boolean z) {
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
    public final void onDecoderBuffering(boolean z) {
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
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, IPH iph) {
        C222688oa.LJIIZILJ(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg) {
        C222688oa.LJIJ(this, str, ipg);
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
    public final void onPlayProgressChange(float f) {
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
    public final void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, IPH iph) {
        C222688oa.LJJIJL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
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
    public final /* synthetic */ void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, IPG ipg) {
        C222688oa.LJJJJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekEnd(String str, boolean z) {
        C222688oa.LJJJJIZL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        C222688oa.LJJJJJ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C222688oa.LJJJJJL(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        C222688oa.LJJJJL(this, str, enumC47177IfN, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C222688oa.LJJJJLI(this, str, i, i2);
    }

    public final void LJIIZILJ() {
        ImageView imageView = (ImageView) this.LJLLILLLL.getValue();
        if (imageView != null) {
            imageView.animate().alpha(0.0f).scaleX(2.5f).scaleY(2.5f).withEndAction(new ARunnableS44S0100000_8(imageView, 18)).setDuration(100L).start();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        IQG iqg;
        IWF iwf;
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        IQF iqf = this.LJLLJ;
        if (iqf != null) {
            if (iqf.LJLJJLL.LJJLIIIJLJLI(iqf) && (iwf = (iqg = iqf.LJLJJL).LJFF) != null && iwf.LJJLIIIJLJLI(iqg.LIZLLL)) {
                iqg.LJFF.LJJJLL(null);
            }
            iqf.LJLJJI.LJLJI.R7(iqf.LJLJLJ);
            iqf.LJLILLLLZI.clear();
            try {
                iqf.LJLJJLL.LJJIIZ();
                iqf.LJLJJLL.release();
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
            }
        }
        Context context = this.LJLIL;
        Aweme aweme = this.LJLJLJ;
        long j = this.LJLLLL.LIZ;
        C59127NIl LIZ = C59128NIm.LIZ();
        LIZ.LIZ = "homepage_ad";
        LIZ.LIZIZ = "play_break";
        C59129NIn c59129NIn = LIZ.LJ;
        c59129NIn.getClass();
        try {
            if (c59129NIn.LIZ == null) {
                c59129NIn.LIZ = new JSONObject();
            }
            c59129NIn.LIZ.put("duration", j);
        } catch (JSONException unused) {
        }
        LIZ.LJ(aweme);
        LIZ.LJIIIZ(context);
        if (aweme != null) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("homepage_ad", "play_break", aweme.getAwemeRawAd());
            LIZLLL.LIZJ(Long.valueOf(j), "duration");
            LIZLLL.LJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        super.onPause();
        if (this.LJLLL) {
            IQF iqf = this.LJLLJ;
            if (iqf != null) {
                iqf.LIZ();
            }
            LJIIZILJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        IQF iqf;
        super.onResume();
        if (this.LJLLL && !this.LJLLLLLL && (iqf = this.LJLLJ) != null && iqf.LJLJI.LIZ != 0) {
            iqf.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIILJJIL(C59672NbQ c59672NbQ) {
        Video video;
        ViewGroup viewGroup;
        IWF iwf;
        super.LJIILJJIL(c59672NbQ);
        Aweme aweme = this.LJLJLJ;
        if (aweme == null || (video = aweme.getVideo()) == null || (viewGroup = (ViewGroup) this.LJLLI.getValue()) == null) {
            return;
        }
        LJIJ(video.getWidth(), video.getHeight(), viewGroup);
        IQF iqf = new IQF(viewGroup, this.LJLJLJ);
        this.LJLLJ = iqf;
        if (!iqf.LJLILLLLZI.contains(this)) {
            iqf.LJLILLLLZI.add(this);
        }
        IQF iqf2 = this.LJLLJ;
        if (iqf2 != null && (iwf = iqf2.LJLJJLL) != null) {
            IQR.LIZIZ = new WeakReference<>(iwf);
        }
        View view = this.LJLJI;
        if (view == null) {
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS28S0100000_8(this, 59), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        if (r9 != false) goto L5;
     */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(boolean r9) {
        /*
            r8 = this;
            r8.LJLLL = r9
            java.lang.ref.WeakReference<X.IGg> r7 = X.IQR.LIZ
            java.lang.Object r1 = r7.get()
            X.IDV r1 = (X.IDV) r1
            if (r1 != 0) goto Lb2
        Lc:
            if (r9 == 0) goto Lde
        Le:
            X.IQF r1 = r8.LJLLJ
            r3 = 1
            if (r1 == 0) goto Lae
            X.2Jm r0 = r1.LJLJI
            int r0 = r0.LIZ
            if (r0 != 0) goto Lab
            java.lang.Object r0 = r7.get()
            X.IDV r0 = (X.IDV) r0
            if (r0 == 0) goto La8
            long r0 = r0.getCurrentPosition()
            int r2 = (int) r0
        L26:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.LJLJLJ
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.commercialize.model.FakeAuthor r0 = r0.getFakeAuthor()
            if (r0 == 0) goto L3c
            java.lang.Integer r0 = r0.getFakeAuthorVersion()
            if (r0 != 0) goto L58
        L3c:
            X.Z8A r0 = X.Z8A.LIZIZ
            boolean r0 = r0.getAdFakeUserProfileBugfixSetting()
            if (r0 != 0) goto L4c
            X.IQF r0 = r8.LJLLJ
            if (r0 == 0) goto L4b
            r0.LIZJ(r2)
        L4b:
            return
        L4c:
            android.os.Handler r3 = r8.LJLZ
            Y.ARunnableS12S0101000_8 r1 = new Y.ARunnableS12S0101000_8
            r0 = 7
            r1.<init>(r2, r8, r0)
            r3.post(r1)
            goto L4b
        L58:
            int r0 = r0.intValue()
            if (r0 != r3) goto L3c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.LJLJLJ
            r1 = 0
            if (r0 == 0) goto La6
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto La6
            java.lang.String r0 = r0.getOpenUrl()
        L6d:
            boolean r0 = X.NPC.LJI(r0)
            if (r0 != 0) goto L3c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.LJLJLJ
            if (r0 == 0) goto L81
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L81
            java.lang.String r1 = r0.getType()
        L81:
            java.lang.String r0 = "app"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L3c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.LJLJLJ
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.commercialize.model.FakeAuthor r0 = r0.getFakeAuthor()
            if (r0 == 0) goto L3c
            java.lang.Boolean r1 = r0.getAutoShowWebview()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L3c
            goto L4b
        La6:
            r0 = r1
            goto L6d
        La8:
            r2 = 0
            goto L26
        Lab:
            r1.LIZIZ()
        Lae:
            r8.LJIIZILJ()
            goto L4b
        Lb2:
            java.lang.ref.WeakReference<X.IGg> r0 = X.IQR.LIZIZ
            java.lang.Object r6 = r0.get()
            X.IGg r6 = (X.InterfaceC46330IGg) r6
            if (r6 != 0) goto Lbe
            goto Lc
        Lbe:
            long r2 = r1.getDuration()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto Lca
            goto Lc
        Lca:
            if (r9 == 0) goto Lde
            long r4 = r1.getCurrentPosition()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 - r0
            float r1 = (float) r4
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            float r0 = (float) r2
            float r1 = r1 / r0
            r6.LJI(r1)
            goto Le
        Lde:
            X.IQF r0 = r8.LJLLJ
            if (r0 == 0) goto Le5
            r0.LIZ()
        Le5:
            r8.LJIIZILJ()
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget.LJIILLIIL(boolean):void");
    }

    @QD3
    public final void onAdPopupWebPageEvent(KRH event) {
        o.LJIIIZ(event, "event");
        boolean z = event.LJLIL;
        this.LJLLLLLL = z;
        int i = 0;
        if (z) {
            IQF iqf = this.LJLLJ;
            if (iqf == null || iqf.LJLJI.LIZ == 3 || iqf.LJLJI.LIZ == 0) {
                return;
            }
            iqf.LIZ();
            return;
        }
        if (!this.LJLLL) {
            return;
        }
        IQF iqf2 = this.LJLLJ;
        if (iqf2 != null) {
            if (iqf2.LJLJI.LIZ == 0) {
                InterfaceC46330IGg interfaceC46330IGg = IQR.LIZ.get();
                if (interfaceC46330IGg != null) {
                    i = (int) interfaceC46330IGg.getCurrentPosition();
                }
                if (!Z8A.LIZIZ.getAdFakeUserProfileBugfixSetting()) {
                    IQF iqf3 = this.LJLLJ;
                    if (iqf3 == null) {
                        return;
                    }
                    iqf3.LIZJ(i);
                    return;
                }
                this.LJLZ.post(new ARunnableS12S0101000_8(i, this, 6));
                return;
            }
            iqf2.LIZIZ();
        }
        LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        Context context = this.LJLIL;
        Aweme aweme = this.LJLJLJ;
        C59127NIl LIZ = C59128NIm.LIZ();
        LIZ.LIZ = "homepage_ad";
        LIZ.LIZIZ = "pause";
        LIZ.LJ(aweme);
        LIZ.LJIIIZ(context);
        if (aweme != null) {
            C58704N2e.LIZLLL("homepage_ad", "pause", aweme.getAwemeRawAd()).LJII();
        }
        KRF krf = this.LJLLLL;
        if (!krf.LIZLLL) {
            return;
        }
        krf.LIZLLL = false;
        krf.LIZJ = System.currentTimeMillis();
        if (krf.LIZJ <= 0 || krf.LIZIZ <= 0 || krf.LIZJ - krf.LIZIZ <= 0) {
            return;
        }
        krf.LIZ = (krf.LIZJ - krf.LIZIZ) + krf.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
        IWF iwf;
        View view;
        IQF iqf = this.LJLLJ;
        if (iqf != null && (iwf = iqf.LJLJJLL) != null && (view = (View) this.LJLLI.getValue()) != null) {
            LJIJ(iwf.getVideoWidth(), iwf.getVideoHeight(), view);
        }
        KRF krf = this.LJLLLL;
        if (!krf.LIZLLL) {
            krf.LIZLLL = true;
            krf.LIZIZ = System.currentTimeMillis();
        }
        NN1.LJJIZ(this.LJLIL, this.LJLJLJ);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        NN1.LJJIZ(this.LJLIL, this.LJLJLJ);
        KRF krf = this.LJLLLL;
        if (krf.LIZLLL) {
            return;
        }
        krf.LIZLLL = true;
        krf.LIZIZ = System.currentTimeMillis();
    }

    public final void LJIJ(int i, int i2, View view) {
        if (i > 0 && i2 > 0) {
            ViewWrapper viewWrapper = new ViewWrapper(view);
            viewWrapper.setWidth(KL2.LJIIJJI(this.LJLIL));
            viewWrapper.setHeight((int) ((viewWrapper.getWidth() * i2) / i));
            DataCenter dataCenter = this.LJLJJI;
            if (dataCenter != null) {
                dataCenter.jv0(null, "ON_VIDEO_CONTAINER_SIZE_CHANGE");
            }
        }
    }
}
