package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import org.json.JSONObject;

/* renamed from: X.IPj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46567IPj implements OnUIPlayListener {
    public final /* synthetic */ C46579IPv LJLIL;

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C222688oa.LIZ(this);
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
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, java.util.Map map) {
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

    public C46567IPj(C46579IPv c46579IPv) {
        this.LJLIL = c46579IPv;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        if (z) {
            C46579IPv c46579IPv = this.LJLIL;
            if (!c46579IPv.LJIIJJI) {
                C73062Slu c73062Slu = c46579IPv.LJ;
                if (c73062Slu != null) {
                    c73062Slu.onBuffering(true);
                }
                this.LJLIL.LJIIJJI = true;
                return;
            }
            return;
        }
        C46579IPv c46579IPv2 = this.LJLIL;
        if (!c46579IPv2.LJIIJJI) {
            return;
        }
        C73062Slu c73062Slu2 = c46579IPv2.LJ;
        if (c73062Slu2 != null) {
            c73062Slu2.onBuffering(false);
        }
        this.LJLIL.LJIIJJI = false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        LiveOuterService.LJJJLL().LJJJIL();
        C78473Uqz.LIZIZ(false);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        InterfaceC46568IPk interfaceC46568IPk = this.LJLIL.LJIIZILJ;
        if (interfaceC46568IPk != null) {
            interfaceC46568IPk.onComplete();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        C73062Slu c73062Slu = this.LJLIL.LJ;
        if (c73062Slu != null) {
            c73062Slu.LIZJ(String.valueOf(ipg));
        }
        InterfaceC46568IPk interfaceC46568IPk = this.LJLIL.LJIIZILJ;
        if (interfaceC46568IPk != null) {
            interfaceC46568IPk.onFailed();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPlayProgressChange(float r5) {
        /*
            r4 = this;
            X.IPv r1 = r4.LJLIL     // Catch: java.lang.Exception -> L12
            com.ss.android.ugc.aweme.feed.model.Video r0 = r1.LJFF     // Catch: java.lang.Exception -> L12
            if (r0 == 0) goto L12
            int r1 = r1.LJIIL     // Catch: java.lang.Exception -> L12
            int r0 = r0.getVideoLength()     // Catch: java.lang.Exception -> L12
            int r1 = r1 / r0
            float r2 = (float) r1     // Catch: java.lang.Exception -> L12
            r0 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r0
            goto L13
        L12:
            r2 = 0
        L13:
            X.IPv r1 = r4.LJLIL
            boolean r0 = r1.LJIILIIL
            r3 = 0
            if (r0 == 0) goto L27
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            X.Slu r0 = r1.LIZ
            r0.LJIIL()
            X.IPv r0 = r4.LJLIL
            r0.LJIILIIL = r3
        L27:
            X.IPv r1 = r4.LJLIL
            boolean r0 = r1.LJIILJJIL
            if (r0 == 0) goto L34
            r1.LIZIZ()
            X.IPv r0 = r4.LJLIL
            r0.LJIILJJIL = r3
        L34:
            X.IPv r0 = r4.LJLIL
            X.Slu r0 = r0.LJ
            if (r0 == 0) goto L3d
            r0.onPlayProgressChange(r5)
        L3d:
            X.IPv r2 = r4.LJLIL
            float r0 = r2.LJIIIZ
            r1 = 1
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L64
            int r0 = r2.LJIIJ
            int r0 = r0 + 1
            r2.LJIIJ = r0
        L4c:
            int r0 = r2.LJIIJ
            if (r0 <= r1) goto L60
            r4.onBuffering(r1)
        L53:
            X.IPv r0 = r4.LJLIL
            r0.LJIIIZ = r5
            X.SK0 r0 = r0.LIZIZ
            if (r0 != 0) goto L5c
        L5b:
            return
        L5c:
            r0.setVisibility(r3)
            goto L5b
        L60:
            r4.onBuffering(r3)
            goto L53
        L64:
            r2.LJIIJ = r3
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46567IPj.onPlayProgressChange(float):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        this.LJLIL.LJI = SystemClock.elapsedRealtime();
        C46579IPv c46579IPv = this.LJLIL;
        if (c46579IPv.LJIILJJIL) {
            c46579IPv.LIZIZ();
            this.LJLIL.LJIILJJIL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        C73062Slu c73062Slu = this.LJLIL.LJ;
        if (c73062Slu != null) {
            c73062Slu.LIZ();
        }
        C46579IPv c46579IPv = this.LJLIL;
        if (c46579IPv.LJI != 0) {
            c46579IPv.LJI = 0L;
        }
        LiveOuterService.LJJJLL().LJJJIL();
        C78473Uqz.LIZIZ(true);
        C46579IPv c46579IPv2 = this.LJLIL;
        if (c46579IPv2.LJIILJJIL) {
            c46579IPv2.LIZIZ();
            this.LJLIL.LJIILJJIL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        LiveOuterService.LJJJLL().LJJJIL();
        C78473Uqz.LIZIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        C73062Slu c73062Slu = this.LJLIL.LJ;
        if (c73062Slu != null) {
            c73062Slu.LJIILL(String.valueOf(ipg));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        C73062Slu c73062Slu = this.LJLIL.LJ;
        if (c73062Slu != null) {
            c73062Slu.LIZIZ(i);
        }
    }
}
