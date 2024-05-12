package com.ss.android.ugc.aweme.shoutouts.player;

import X.AMD;
import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC86117Xqz;
import X.C157166Eu;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C222688oa;
import X.C224238r5;
import X.C47246IgU;
import X.C47689Ind;
import X.C51712KRg;
import X.C51713KRh;
import X.C51714KRi;
import X.C51715KRj;
import X.C51718KRm;
import X.C57092Lx;
import X.C61447O9r;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65803Ps7;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C8IC;
import X.EnumC47177IfN;
import X.HG3;
import X.IPG;
import X.IPH;
import X.IT4;
import X.ITW;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.RBX;
import X.TBW;
import X.TMG;
import X.W1T;
import X.X1D;
import Y.IDLListenerS9S0300000_8;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class ShoutoutsPlayActivity extends ActivityC86117Xqz implements OnUIPlayListener, InterfaceC151715xP, AMD<C51715KRj> {
    public boolean LJLJI;
    public boolean LJLJJI;
    public Video LJLJJL;
    public boolean LJLJJLL;
    public final lifecycleAwareLazy LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C51713KRh.LJLIL);
    public final boolean LJLILLLLZI = true;

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
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
    public final void onPausePlay(String str) {
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
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, IPH iph) {
        C222688oa.LJIIZILJ(this, str, iph);
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
    public final /* synthetic */ void onRenderFirstFrame(String str, IT4 it4) {
        C222688oa.LJJIJLIJ(this, str, it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C222688oa.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        C222688oa.LJJJJL(this, str, enumC47177IfN, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C222688oa.LJJJJLI(this, str, i, i2);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public ShoutoutsPlayActivity() {
        C65776Prg LIZ = C65352Pkq.LIZ(ShoutoutsPlayViewModel.class);
        this.LJLJL = new lifecycleAwareLazy(this, new AqS72S0400000_12(this, LIZ, C51718KRm.INSTANCE, LIZ, 22));
        this.LJLJLJ = C221108m2.LIZIZ(C51714KRi.LJLIL);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 338));
    }

    public final ShoutoutsPlayViewModel LLFZ() {
        return (ShoutoutsPlayViewModel) this.LJLJL.getValue();
    }

    public final VideoViewComponent LLII() {
        return (VideoViewComponent) this.LJLIL.getValue();
    }

    public final void LLIIIJ() {
        int i;
        int LJI;
        int i2;
        if (this.LJLJJLL && this.LJLJJL != null) {
            LLII().LJIIL(this.LJLJJL);
            Video video = this.LJLJJL;
            o.LJI(video);
            C47689Ind shoutouts_player_video_view = (C47689Ind) _$_findCachedViewById(R.id.jzj);
            o.LJIIIIZZ(shoutouts_player_video_view, "shoutouts_player_video_view");
            if (shoutouts_player_video_view.getWidth() == 0 || shoutouts_player_video_view.getHeight() == 0) {
                shoutouts_player_video_view.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS9S0300000_8(shoutouts_player_video_view, video, this, 1));
                return;
            }
            if (video.getWidth() <= 0 || video.getHeight() <= 0) {
                return;
            }
            C224238r5 c224238r5 = new C224238r5();
            int width = video.getWidth();
            int height = video.getHeight();
            C224238r5.LJFF(this);
            int i3 = C224238r5.LJFF;
            int i4 = C224238r5.LJI;
            double d = i3 / i4;
            int i5 = 0;
            if (d <= 0.5d) {
                C61447O9r c61447O9r = C57092Lx.LIZ;
                if (c61447O9r.LIZIZ == 0) {
                    if (c61447O9r.LJFF) {
                        LJI = C224238r5.LJI() - C61447O9r.LIZ();
                        i2 = 0;
                        c61447O9r.getClass();
                    } else {
                        LJI = C224238r5.LJI();
                        i2 = c61447O9r.LIZ;
                    }
                } else {
                    i = c61447O9r.LIZJ;
                    if (i == 0) {
                        LJI = C224238r5.LJI();
                        i2 = c61447O9r.LIZ;
                    }
                    c224238r5.LIZJ(shoutouts_player_video_view, width, height, i, C224238r5.LJFF, null);
                    return;
                }
                i = LJI - i2;
                if (!c61447O9r.LIZLLL) {
                    i -= c61447O9r.LIZIZ;
                }
                c224238r5.LIZJ(shoutouts_player_video_view, width, height, i, C224238r5.LJFF, null);
                return;
            }
            if (d >= 0.6666666666666666d) {
                c224238r5.LJIIJJI(shoutouts_player_video_view, width, height, i3, i4, null);
                return;
            }
            int i6 = C224238r5.LJIIIIZZ;
            C61447O9r c61447O9r2 = C57092Lx.LIZ;
            if (c61447O9r2.LJFF) {
                i5 = C61447O9r.LIZ();
            }
            c224238r5.LJIIJ(shoutouts_player_video_view, width, height, (i6 - i5) - c61447O9r2.LIZ, C224238r5.LJFF, null);
        }
    }

    @Override // X.AMD
    public final C51715KRj getViewModelFactory() {
        return (C51715KRj) this.LJLJLJ.getValue();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        if (LLII().LJFF()) {
            LLIIIILZ(false);
        }
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onResume", true);
        super.onResume();
        if (!LLII().LJFF() && this.LJLJJL != null && !this.LJLJJI) {
            LLIIIILZ(false);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onStart", true);
        super.onStart();
        LLII().LJIILJJIL((C47689Ind) _$_findCachedViewById(R.id.jzj));
        LLII().LIZ(this);
        C47246IgU.LIZJ((C47689Ind) _$_findCachedViewById(R.id.jzj)).N7(new C51712KRg(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        LLII().LLIIIILZ(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    public final void LLIIIILZ(boolean z) {
        if (_$_findCachedViewById(R.id.jzg).getVisibility() == 0) {
            return;
        }
        if (this.LJLJI) {
            if (!LLII().LJFF() && this.LJLJJL != null) {
                LLII().LJIIL(this.LJLJJL);
                ((ImageView) _$_findCachedViewById(R.id.jzi)).setVisibility(8);
                this.LJLJI = false;
                this.LJLJJI = false;
                return;
            }
            return;
        }
        if (!LLII().LJFF()) {
            return;
        }
        LLII().pause();
        ((ImageView) _$_findCachedViewById(R.id.jzi)).setVisibility(0);
        this.LJLJI = true;
        if (!z) {
            return;
        }
        this.LJLJJI = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0169, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L33;
     */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        if (!this.LJLILLLLZI) {
            finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("error_code = ");
        if (ipg != null) {
            str = ipg.toString();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C8IC c8ic = (C8IC) _$_findCachedViewById(R.id.jzg);
        if (c8ic == null) {
            return;
        }
        c8ic.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r3 == null) goto L17;
     */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRenderFirstFrame(X.IT4 r6) {
        /*
            r5 = this;
            r0 = 2131376085(0x7f0a37d5, float:1.8372336E38)
            android.view.View r1 = r5._$_findCachedViewById(r0)
            X.8IC r1 = (X.C8IC) r1
            r0 = 8
            r1.setVisibility(r0)
            r1 = 0
            r0 = 1
            X.7au r4 = LLFII(r5, r1, r0, r0)
            X.Yp3 r3 = X.C88545Yp3.LIZIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L20
            java.lang.String r1 = r3.LJ()
            if (r1 != 0) goto L23
        L20:
            r1 = r2
            if (r3 == 0) goto L50
        L23:
            boolean r0 = r3.isConnected()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L2b:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.LJIIIZ(r1, r0)
            if (r3 == 0) goto L3a
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L3d
        L3a:
            r1 = r2
            if (r3 == 0) goto L43
        L3d:
            java.lang.String r0 = r3.LJIILJJIL()
            if (r0 != 0) goto L4e
        L43:
            r4.LJIIIZ(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "video_play"
            X.FMX.LJIIL(r0, r1)
            return
        L4e:
            r2 = r0
            goto L43
        L50:
            r0 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity.onRenderFirstFrame(X.IT4):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("error_code = ");
        if (ipg != null) {
            num = Integer.valueOf(ipg.LJ);
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    public static C188727au LLFII(ShoutoutsPlayActivity shoutoutsPlayActivity, boolean z, boolean z2, int i) {
        String str;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        boolean LJ = o.LJ(C16880lQ.LLJJIJIIJIL(shoutoutsPlayActivity.getIntent(), "author_id"), ((RBX) HG3.LJIILL()).getCurUserId());
        C188727au c188727au = new C188727au();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(shoutoutsPlayActivity.getIntent(), "enter_from");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "chat";
        }
        c188727au.LJIIIZ("enter_from", LLJJIJIIJIL);
        c188727au.LJIIIZ("content_source", "shoutouts");
        if (LJ) {
            str = "creator";
        } else {
            str = "consumer";
        }
        c188727au.LJIIIZ("user_type", str);
        c188727au.LJIIIZ("author_id", C16880lQ.LLJJIJIIJIL(shoutoutsPlayActivity.getIntent(), "author_id"));
        c188727au.LJIIIZ("group_id", C16880lQ.LLJJIJIIJIL(shoutoutsPlayActivity.getIntent(), "aweme_id"));
        if (LJ && z2) {
            if (((Boolean) shoutoutsPlayActivity.LJLJLLL.getValue()).booleanValue()) {
                c188727au.LJIIIZ("video_status", "review");
            } else {
                c188727au.LJIIIZ("video_status", "finish");
            }
        }
        if (z) {
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(shoutoutsPlayActivity.getIntent(), "order_id");
            if (LLJJIJIIJIL2 == null) {
                LLJJIJIIJIL2 = "";
            }
            c188727au.LJIIIZ("order_id", LLJJIJIIJIL2);
        }
        return c188727au;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
