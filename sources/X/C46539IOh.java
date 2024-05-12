package X;

import Y.ACallableS111S0100000_8;
import Y.ARunnableS2S0010000_8;
import Y.ARunnableS9S1100000_8;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfig;
import com.ss.android.ugc.aweme.video.preload.PreloadSessionManager;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.IOh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46539IOh implements OnUIPlayListener, OnPreRenderListener {
    public static final ExecutorService LJLL = C16880lQ.LLLLZLLIL();
    public static final C35736E0u LJLLI = new C35736E0u();
    public int LJLIL;
    public HashMap<String, Object> LJLILLLLZI;
    public InterfaceC46540IOi LJLJI;
    public final List<InterfaceC46540IOi> LJLJJI = new CopyOnWriteArrayList();
    public InterfaceC46541IOj LJLJJL;
    public final InterfaceC197777pV LJLJJLL;
    public final IWH LJLJL;
    public final InterfaceC46645ISj LJLJLJ;
    public boolean LJLJLLL;

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C222688oa.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJ(this, str, z, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJIIIIZZ(this, str, z, iph);
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
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, IPH iph) {
        C222688oa.LJIIZILJ(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg, IPH iph) {
        C222688oa.LJIJI(this, str, ipg, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C222688oa.LJJ(this, str);
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
    public final /* synthetic */ void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C222688oa.LJJJJJL(this, str, f);
    }

    public static HashMap LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        return LJLLI.get(str);
    }

    public final void LIZ(InterfaceC46540IOi interfaceC46540IOi) {
        if (!this.LJLJJI.contains(interfaceC46540IOi)) {
            this.LJLJJI.add(interfaceC46540IOi);
        }
    }

    public final void LIZJ(InterfaceC46540IOi interfaceC46540IOi) {
        ((CopyOnWriteArrayList) this.LJLJJI).remove(interfaceC46540IOi);
    }

    public final void LIZLLL(String str) {
        SimVideoUrlModel LJIILJJIL;
        int i;
        InterfaceC46645ISj interfaceC46645ISj = this.LJLJLJ;
        if (interfaceC46645ISj != null) {
            SimVideoUrlModel LJIILJJIL2 = interfaceC46645ISj.LJIILJJIL(str);
            if (C47242IgQ.LIZ().isCache(LJIILJJIL2)) {
                i = C47242IgQ.LIZ().LIZLLL(LJIILJJIL2);
            } else if (PreloadSessionManager.LIZIZ.LIZ(str) == null) {
                i = -2;
            } else {
                i = -1;
            }
            this.LJLIL = i;
        }
        InterfaceC46541IOj interfaceC46541IOj = this.LJLJJL;
        if (interfaceC46541IOj != null) {
            interfaceC46541IOj.LIZ();
            HashMap<String, Object> LIZIZ = LIZIZ(str);
            if (LIZIZ != null) {
                this.LJLILLLLZI = LIZIZ;
            }
            int i2 = this.LJLIL;
            HashMap<String, Object> hashMap = this.LJLILLLLZI;
            try {
                Long valueOf = Long.valueOf(System.currentTimeMillis());
                C123734tN.LIZ.put(str, valueOf);
                InterfaceC46645ISj interfaceC46645ISj2 = this.LJLJLJ;
                if (interfaceC46645ISj2 == null) {
                    LJIILJJIL = null;
                } else {
                    LJIILJJIL = interfaceC46645ISj2.LJIILJJIL(str);
                }
                ILI.LIZ().reportVideoPlayStart(str, new ISK(str, valueOf, i2, LJIILJJIL, this, hashMap));
            } catch (Exception e) {
                if (!C79146V4k.LJJJJIZL()) {
                } else {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onBuffering(z);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onDecoderBuffering(z);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onDecoderBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        InterfaceC46645ISj interfaceC46645ISj = this.LJLJLJ;
        if (interfaceC46645ISj != null) {
            interfaceC46645ISj.LJJJZ();
        }
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPausePlay(str);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onPausePlay(str);
        }
        InterfaceC46541IOj interfaceC46541IOj = this.LJLJJL;
        if (interfaceC46541IOj != null) {
            interfaceC46541IOj.LIZ();
            ILI.LIZ().reportVideoPause(str, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPlayCompleted(str);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onPlayCompleted(str);
        }
        InterfaceC46631IRv superResolutionStrategy = C1DG.LIZ().getConfig().getCommonConfig().getSuperResolutionStrategy();
        if (superResolutionStrategy == null) {
            return;
        }
        superResolutionStrategy.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPlayCompletedFirstTime(str);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        InterfaceC46645ISj interfaceC46645ISj = this.LJLJLJ;
        if (interfaceC46645ISj != null) {
            interfaceC46645ISj.LJJJZ();
        }
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPlayFailed(ipg);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onPlayFailed(ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPlayPause(str);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onPlayPause(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        C1JX.LJIIIIZZ("onPlayPrepare: ", str);
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPlayPrepare(str);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onPlayPrepare(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPlayProgressChange(f);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPlayRelease(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPlayStop(str);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onPlayStop(str);
        }
        InterfaceC46541IOj interfaceC46541IOj = this.LJLJJL;
        if (interfaceC46541IOj != null) {
            interfaceC46541IOj.LIZ();
            SimVideoUrlModel simVideoUrlModel = null;
            if (TextUtils.equals(str, null) && !this.LJLJLLL) {
                HashMap<String, Object> LIZIZ = LIZIZ(str);
                if (LIZIZ != null) {
                    this.LJLILLLLZI = LIZIZ;
                }
                HashMap<String, Object> hashMap = this.LJLILLLLZI;
                try {
                    ISP isp = new ISP();
                    Long l = C123734tN.LIZ.get(str);
                    InterfaceC46645ISj interfaceC46645ISj = this.LJLJLJ;
                    if (interfaceC46645ISj != null) {
                        simVideoUrlModel = interfaceC46645ISj.LJIILJJIL(str);
                    }
                    ILI.LIZ().reportVideoStop(str, new CallableC46646ISk(interfaceC46645ISj, simVideoUrlModel, this, str, isp, l, hashMap), hashMap, new ACallableS111S0100000_8(this, str, 17), true);
                } catch (Exception e) {
                    if (C79146V4k.LJJJJIZL()) {
                        throw new RuntimeException(e);
                    }
                }
                this.LJLJLLL = true;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPlaying(str);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onPlaying(str);
        }
        InterfaceC46541IOj interfaceC46541IOj = this.LJLJJL;
        if (interfaceC46541IOj != null) {
            interfaceC46541IOj.LIZ();
            ILI.LIZ().reportVideoPlaying(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
    public final void onPreRenderReady(String str) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPreRenderReady(str);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((OnPreRenderListener) it.next()).onPreRenderReady(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPreparePlay(str);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onPreparePlay(str);
        }
        ExecutorService executorService = LJLL;
        if (executorService != null) {
            Object value = IZ8.L.getValue();
            o.LJIIIIZZ(value, "<get-isAsyncReportEvent>(...)");
            if (((Boolean) value).booleanValue()) {
                executorService.execute(new ARunnableS9S1100000_8(this, str, 6));
                return;
            }
        }
        LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        InterfaceC46645ISj interfaceC46645ISj = this.LJLJLJ;
        if (interfaceC46645ISj != null) {
            interfaceC46645ISj.LJJJLIIL();
        }
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onRenderFirstFrame(it4);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onRenderFirstFrame(it4);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
        C1JX.LJIIIIZZ("onRenderFirstFrameFromResume: ", str);
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onRenderFirstFrameFromResume(str);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onRenderFirstFrameFromResume(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onRenderReady(iph);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onRenderReady(iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        InterfaceC46645ISj interfaceC46645ISj = this.LJLJLJ;
        if (interfaceC46645ISj != null) {
            interfaceC46645ISj.LJJJLIIL();
        }
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onResumePlay(str);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onResumePlay(str);
        }
        InterfaceC46541IOj interfaceC46541IOj = this.LJLJJL;
        if (interfaceC46541IOj != null) {
            interfaceC46541IOj.LIZ();
            ILI.LIZ().reportVideoOnResume(str, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onRetryOnError(ipg);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onRetryOnError(ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onBufferedTimeMs(str, j);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onBufferedTimeMs(str, j);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        SimVideoUrlModel LJIILJJIL;
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onBuffering(str, z);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onBuffering(str, z);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBuffering: ");
        LIZ.append(str);
        LIZ.append(", start:");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        InterfaceC46541IOj interfaceC46541IOj = this.LJLJJL;
        if (interfaceC46541IOj != null) {
            interfaceC46541IOj.LIZ();
            HashMap<String, Object> LIZIZ = LIZIZ(str);
            if (LIZIZ != null) {
                this.LJLILLLLZI = LIZIZ;
            }
            HashMap<String, Object> hashMap = this.LJLILLLLZI;
            try {
                Long l = C123734tN.LIZ.get(str);
                InterfaceC46645ISj interfaceC46645ISj = this.LJLJLJ;
                if (interfaceC46645ISj == null) {
                    LJIILJJIL = null;
                } else {
                    LJIILJJIL = interfaceC46645ISj.LJIILJJIL(str);
                }
                ILI.LIZ().reportVideoBuffering(str, true, z, new CallableC46551IOt(LJIILJJIL, str, l, interfaceC46645ISj, this, hashMap));
            } catch (Exception e) {
                if (!C79146V4k.LJJJJIZL()) {
                } else {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onCompleteLoaded(str, z);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onCompleteLoaded(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onDecoderBuffering(str, z);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onDecoderBuffering(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPlayCompleted(str, i);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onPlayCompleted(str, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg) {
        SimVideoUrlModel LJIILJJIL;
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPlayFailed(str, ipg);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onPlayFailed(str, ipg);
        }
        InterfaceC46645ISj interfaceC46645ISj = this.LJLJLJ;
        if (interfaceC46645ISj != null) {
            interfaceC46645ISj.LJJJZ();
        }
        InterfaceC46541IOj interfaceC46541IOj = this.LJLJJL;
        if (interfaceC46541IOj != null) {
            interfaceC46541IOj.LIZ();
            HashMap<String, Object> LIZIZ = LIZIZ(str);
            if (LIZIZ != null) {
                this.LJLILLLLZI = LIZIZ;
            }
            HashMap<String, Object> hashMap = this.LJLILLLLZI;
            try {
                IPB ipb = new IPB();
                Long l = C123734tN.LIZ.get(str);
                InterfaceC46645ISj interfaceC46645ISj2 = this.LJLJLJ;
                if (interfaceC46645ISj2 == null) {
                    LJIILJJIL = null;
                } else {
                    LJIILJJIL = interfaceC46645ISj2.LJIILJJIL(str);
                }
                ILI.LIZ().reportPlayFailed(str, new IP9(ipb, ipg, str, LJIILJJIL, interfaceC46645ISj2, l, this, hashMap), hashMap, new ACallableS111S0100000_8(this, str, 15), true);
            } catch (Exception e) {
                if (!C79146V4k.LJJJJIZL()) {
                } else {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPlayStop(str, jSONObject);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onPlayStop(str, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, IT4 it4) {
        SimVideoUrlModel LJIILJJIL;
        InterfaceC46631IRv superResolutionStrategy;
        C1JX.LJIIIIZZ("onRenderFirstFrame: ", str);
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onRenderFirstFrame(str, it4);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onRenderFirstFrame(str, it4);
        }
        IWH iwh = this.LJLJL;
        if (iwh != null) {
            int LIZJ = (int) iwh.LIZJ().LIZJ();
            Session LJFF = C46664ITc.LJIJ.LJFF();
            o.LJIIIIZZ(LJFF, "getInstance().current");
            if (LJFF.isOpenSuperResolution) {
                try {
                    SuperResolutionStrategyConfig superResolutionStrategyConfig = C1DG.LIZ().getConfig().getCommonConfig().getSuperResolutionStrategyConfig();
                    if (superResolutionStrategyConfig != null && LIZJ > superResolutionStrategyConfig.fpsThreshold && (superResolutionStrategy = C1DG.LIZ().getConfig().getCommonConfig().getSuperResolutionStrategy()) != null) {
                        superResolutionStrategy.LIZLLL();
                    }
                } catch (Throwable unused) {
                }
            }
        }
        InterfaceC46645ISj interfaceC46645ISj = this.LJLJLJ;
        if (interfaceC46645ISj != null) {
            interfaceC46645ISj.LJJJLIIL();
        }
        InterfaceC46541IOj interfaceC46541IOj = this.LJLJJL;
        if (interfaceC46541IOj != null) {
            interfaceC46541IOj.LIZ();
            HashMap<String, Object> LIZIZ = LIZIZ(str);
            if (LIZIZ != null) {
                this.LJLILLLLZI = LIZIZ;
            }
            int i = this.LJLIL;
            HashMap<String, Object> hashMap = this.LJLILLLLZI;
            try {
                String id = it4.getId();
                int codecType = it4.getCodecType();
                C123714tL c123714tL = C123734tN.LIZ;
                Long l = c123714tL.get(id);
                if (l == null) {
                    l = Long.valueOf(System.currentTimeMillis());
                    c123714tL.put(id, l);
                }
                C123734tN.LIZIZ.put(id, id);
                C46982IcE.LIZLLL.execute(new ARunnableS2S0010000_8(true, 1));
                InterfaceC46645ISj interfaceC46645ISj2 = this.LJLJLJ;
                if (interfaceC46645ISj2 == null) {
                    LJIILJJIL = null;
                } else {
                    LJIILJJIL = interfaceC46645ISj2.LJIILJJIL(id);
                }
                ILI.LIZ().reportRenderFirstFrame(id, new IT1(LJIILJJIL, interfaceC46645ISj2, it4, id, i, codecType, l, this, hashMap), hashMap, new ACallableS111S0100000_8(this, id, 16), true);
            } catch (Exception e) {
                if (!C79146V4k.LJJJJIZL()) {
                } else {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, IPG ipg) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onRetryOnError(str, ipg);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onRetryOnError(str, ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onSeekEnd(str, z);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onSeekEnd(str, z);
        }
    }

    public C46539IOh(InterfaceC46540IOi interfaceC46540IOi, IWH iwh, InterfaceC197777pV interfaceC197777pV) {
        this.LJLJI = interfaceC46540IOi;
        this.LJLJL = iwh;
        this.LJLJJLL = interfaceC197777pV;
        if (iwh != null) {
            this.LJLJLJ = iwh.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        if (i % 20 == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onBufferedPercent: ");
            LIZ.append(str);
            LIZ.append(", percent:");
            LIZ.append(i);
            X1D.LIZIZ(LIZ);
        }
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onBufferedPercent(str, j, i);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onBufferedPercent(str, j, i);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onBufferedPercent: ");
        LIZ2.append(str);
        LIZ2.append(", percent:");
        LIZ2.append(i);
        X1D.LIZIZ(LIZ2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPlayProgressChange(str, j, j2);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onPlayProgressChange(str, j, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlayerInternalEvent: ");
        LIZ.append(str);
        LIZ.append(", what:");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onPlayerInternalEvent(str, i, jSONObject);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onPlayerInternalEvent(str, i, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onSeekStart(str, i, f);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onSeekStart(str, i, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onVideoBitrateChanged(str, enumC47177IfN, i);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onVideoBitrateChanged(str, enumC47177IfN, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
        InterfaceC46540IOi interfaceC46540IOi = this.LJLJI;
        if (interfaceC46540IOi != null) {
            interfaceC46540IOi.onVideoSizeChanged(str, i, i2);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC46540IOi) it.next()).onVideoSizeChanged(str, i, i2);
        }
    }
}
