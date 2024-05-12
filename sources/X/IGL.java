package X;

import Y.ACallableS35S1100000_8;
import Y.ACallableS3S1301000_8;
import Y.ARunnableS2S0010000_8;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IGL implements OnUIPlayListener {
    public final IWK LJLIL;
    public final InterfaceC46645ISj LJLILLLLZI;
    public OnUIPlayListener LJLJI;
    public HashMap<String, Object> LJLJJL;
    public final IGK LJLJJI = IGK.LJLIL;
    public final C35751E1j<String, Long> LJLJJLL = new C35751E1j<>(20);
    public final C35751E1j<String, Boolean> LJLJL = new C35751E1j<>(20);
    public final C35751E1j<String, Boolean> LJLJLJ = new C35751E1j<>(20);
    public final C35751E1j<String, Boolean> LJLJLLL = new C35751E1j<>(20);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z) {
        C222688oa.LIZLLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
        C222688oa.LJII(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, java.util.Map map) {
        C222688oa.LJIIJ(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str) {
        C222688oa.LJIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C222688oa.LJIILLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg) {
        C222688oa.LJIJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
        C222688oa.LJJIIJ(this, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str) {
        C222688oa.LJJIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        C222688oa.LJJIJIIJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(IT4 it4) {
        C222688oa.LJJIL(this, it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str) {
        C222688oa.LJJJI(this, str);
    }

    public final boolean LIZ() {
        IGM igm;
        IWK iwk = this.LJLIL;
        if (iwk != null && (igm = iwk.LIZIZ) != null && igm.LIZ()) {
            return true;
        }
        return false;
    }

    public final IP0 LIZIZ() {
        IWK iwk = this.LJLIL;
        if (iwk != null) {
            return iwk.LIZJ;
        }
        return null;
    }

    public final IGM LIZJ() {
        IGM igm;
        IWK iwk = this.LJLIL;
        if (iwk != null && (igm = iwk.LIZIZ) != null) {
            return igm;
        }
        return new IGN();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onDecoderBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompleted(str);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed(ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayPause(str);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onPlayPause(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayPrepare(str);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onPlayPrepare(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepared(String str) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayPrepared(str);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            C222688oa.LJJ(igk, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayRelease(str);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onPlayRelease(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayStop(str);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onPlayStop(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRenderFirstFrameFromResume(str);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onRenderFirstFrameFromResume(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRenderReady(iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRetryOnError(ipg);
        }
    }

    public IGL(IUE iue, IWK iwk) {
        this.LJLILLLLZI = iue;
        this.LJLIL = iwk;
    }

    public final void LIZLLL(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.LJLJL.put(str, Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBufferedTimeMs(str, j);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onBufferedTimeMs(str, j);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onCompleteLoaded(str, z);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onCompleteLoaded(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onMaskInfoCallback(String str, ITW itw) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onMaskInfoCallback(str, itw);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onMaskInfoCallback(str, itw);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(final String str, final IPH iph) {
        Boolean bool;
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPausePlay(str, iph);
            this.LJLJI.onPausePlay(str);
            if (LIZ() && ((LIZJ().LJIILJJIL() || iph.LJI) && !TextUtils.isEmpty(str) && this.LJLJL.containsKey(str) && (bool = this.LJLJL.get(str)) != null && bool.booleanValue())) {
                LIZLLL(str, false);
                final IGM LIZJ = LIZJ();
                final IP0 LIZIZ = LIZIZ();
                final InterfaceC46645ISj interfaceC46645ISj = this.LJLILLLLZI;
                final HashMap<String, Object> hashMap = this.LJLJJL;
                final Long l = IL4.LIZ.get(str);
                final ILN LIZ = IL4.LIZ(LIZJ);
                final SimVideoUrlModel LJI = IL4.LJI(interfaceC46645ISj, str);
                ILI.LIZ().reportVideoPause(str, new Callable() { // from class: X.IOu
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v0 */
                    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
                    /* JADX WARN: Type inference failed for: r1v10 */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ?? r1;
                        int i;
                        String LIZIZ2;
                        int i2;
                        IP0 ip0 = IP0.this;
                        SimVideoUrlModel simVideoUrlModel = LJI;
                        ILN type = LIZ;
                        InterfaceC46645ISj interfaceC46645ISj2 = interfaceC46645ISj;
                        String str2 = str;
                        Long l2 = l;
                        IPH iph2 = iph;
                        IGM igm = LIZJ;
                        HashMap hashMap2 = hashMap;
                        int i3 = 0;
                        if (ip0 != null) {
                            r1 = ip0.isCache(simVideoUrlModel);
                        } else {
                            r1 = 0;
                        }
                        C46555IOx c46555IOx = new C46555IOx();
                        c46555IOx.LIZ.LIZ = r1;
                        o.LJIIIZ(type, "type");
                        c46555IOx.LIZ.getClass();
                        c46555IOx.LIZ.LJIIIIZZ = IL4.LIZLLL(interfaceC46645ISj2);
                        if (ip0 != null) {
                            i = ip0.LIZLLL();
                        } else {
                            i = 0;
                        }
                        c46555IOx.LIZ.LJ = i;
                        if (interfaceC46645ISj2 != null) {
                            i3 = interfaceC46645ISj2.LJIILL();
                        }
                        c46555IOx.LIZ.LIZIZ = i3;
                        if (IZ8.LJJJJJL()) {
                            LIZIZ2 = IL4.LJFF(str2);
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(l2);
                            LIZ2.append("");
                            LIZIZ2 = X1D.LIZIZ(LIZ2);
                        }
                        C46554IOw c46554IOw = c46555IOx.LIZ;
                        c46554IOw.LJII = LIZIZ2;
                        if (ILN.T_FEED == type) {
                            if (iph2 == null) {
                                i2 = -1;
                            } else {
                                i2 = iph2.LJIIIZ;
                            }
                            c46554IOw.LIZ(Integer.valueOf(i2), "url_type");
                        }
                        if (igm != null) {
                            c46554IOw.LIZ(igm.LJI(), "play_type");
                            c46554IOw.LIZIZ(igm.LJFF(str2, true));
                        }
                        c46554IOw.LIZIZ(hashMap2);
                        return c46554IOw;
                    }
                }, null);
            }
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onPausePlay(str, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
        if (str != null && i > 0) {
            IL4.LIZJ.put(str, Integer.valueOf(i));
        }
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompleted(str, i);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onPlayCompleted(str, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str, IPH iph) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompletedFirstTime(str, iph);
            this.LJLJI.onPlayCompletedFirstTime(str);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onPlayCompletedFirstTime(str, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayStop(str, z);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onPlayStop(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str, IPH iph) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlaying(str, iph);
            this.LJLJI.onPlaying(str);
            if (LIZ() && (LIZJ().LIZIZ() || iph.LJI)) {
                ILI.LIZ().reportVideoPlaying(str);
            }
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onPlaying(str, iph);
            this.LJLJJI.onPlaying(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(final String str, final IPH iph) {
        long j;
        InterfaceC46645ISj interfaceC46645ISj;
        int i;
        if (this.LJLJI != null) {
            if (LIZ() && (LIZJ().LJIIZILJ() || iph.LJI)) {
                LIZLLL(str, true);
                if (!TextUtils.isEmpty(str)) {
                    this.LJLJLJ.put(str, Boolean.TRUE);
                }
                if (!TextUtils.isEmpty(str)) {
                    this.LJLJLLL.put(str, Boolean.TRUE);
                }
                if (TextUtils.isEmpty(str) || (interfaceC46645ISj = this.LJLILLLLZI) == null) {
                    j = -1;
                } else {
                    SimVideoUrlModel LJIILJJIL = interfaceC46645ISj.LJIILJJIL(str);
                    IP0 LIZIZ = LIZIZ();
                    if (LJIILJJIL != null && LIZIZ != null) {
                        i = LIZIZ.LIZ(LJIILJJIL);
                    } else {
                        i = -1;
                    }
                    j = i;
                    this.LJLJJLL.put(str, Long.valueOf(j));
                }
                final IGM LIZJ = LIZJ();
                final IP0 LIZIZ2 = LIZIZ();
                final InterfaceC46645ISj interfaceC46645ISj2 = this.LJLILLLLZI;
                final int i2 = (int) j;
                final HashMap<String, Object> hashMap = this.LJLJJL;
                final Long valueOf = Long.valueOf(System.currentTimeMillis());
                if (!IZ8.LJJJJ()) {
                    C46982IcE.LIZLLL.execute(new ARunnableS2S0010000_8(false, 1));
                }
                IL4.LIZ.put(str, valueOf);
                IL4.LIZLLL.put(str, Boolean.FALSE);
                IL4.LJ.put(str, 1);
                final ILN LIZ = IL4.LIZ(LIZJ);
                final SimVideoUrlModel LJI = IL4.LJI(interfaceC46645ISj2, str);
                ILI.LIZ().reportVideoPlayStart(str, new Callable() { // from class: X.ISL
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i3;
                        int i4;
                        int i5;
                        int i6;
                        String LIZIZ3;
                        long j2;
                        int i7;
                        int i8;
                        int i9;
                        String str2 = str;
                        ILN type = LIZ;
                        SimVideoUrlModel simVideoUrlModel = LJI;
                        InterfaceC46645ISj interfaceC46645ISj3 = interfaceC46645ISj2;
                        IP0 ip0 = LIZIZ2;
                        Long l = valueOf;
                        IPH iph2 = iph;
                        int i10 = i2;
                        IGM igm = LIZJ;
                        HashMap hashMap2 = hashMap;
                        IYN LJIIJJI = C46664ITc.LJIJ.LJIIJJI(str2);
                        ISN isn = new ISN();
                        isn.LIZ.LIZIZ = str2;
                        o.LJIIIZ(type, "type");
                        ISM ism = isn.LIZ;
                        ism.getClass();
                        ism.LJIJJ = type;
                        isn.LIZ.LJIILIIL = IL4.LJII(simVideoUrlModel);
                        isn.LIZ.LJIILL = IL4.LIZIZ(simVideoUrlModel);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(C46982IcE.LIZIZ().getAppID());
                        LIZ2.append("");
                        isn.LIZ.LIZ = X1D.LIZIZ(LIZ2);
                        isn.LIZ.LIZJ = C46982IcE.LIZIZ().getAppVersion();
                        isn.LIZ.LJ = IXN.LIZJ.getPreloadType();
                        isn.LIZ.LJIILJJIL = IL4.LJIIIIZZ(interfaceC46645ISj3, str2);
                        isn.LIZ.LJIILLIIL = IL4.LIZJ(interfaceC46645ISj3, str2);
                        if (ip0 != null) {
                            i3 = ip0.LIZLLL();
                        } else {
                            i3 = 0;
                        }
                        isn.LIZ.LJIIZILJ = i3;
                        if (LJIIJJI != null && (LJIIJJI.getHdrType() == 1 || LJIIJJI.getHdrType() == 2)) {
                            i4 = 1;
                        } else if (simVideoUrlModel != null && simVideoUrlModel.isHaveHdr() && LJIIJJI != null && LJIIJJI.getHdrType() == 0) {
                            i4 = -1;
                        } else {
                            i4 = 0;
                        }
                        isn.LIZ.LJIJ = i4;
                        if (interfaceC46645ISj3 != null) {
                            i5 = interfaceC46645ISj3.LJIIJ();
                        } else {
                            i5 = -1;
                        }
                        isn.LIZ.LJIIJ = i5;
                        if (simVideoUrlModel != null) {
                            i6 = (int) simVideoUrlModel.getDuration();
                        } else {
                            i6 = -1;
                        }
                        isn.LIZ.LIZLLL = i6;
                        if (IZ8.LJJJJJL()) {
                            LIZIZ3 = IL4.LJFF(str2);
                        } else {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(l);
                            LIZ3.append("");
                            LIZIZ3 = X1D.LIZIZ(LIZ3);
                        }
                        isn.LIZ.LJFF = LIZIZ3;
                        if (interfaceC46645ISj3 != null) {
                            j2 = (int) interfaceC46645ISj3.getBitrate();
                        } else {
                            j2 = -1;
                        }
                        isn.LIZ.LJIIL = j2;
                        if (interfaceC46645ISj3 != null) {
                            i7 = interfaceC46645ISj3.LJ();
                        } else {
                            i7 = -1;
                        }
                        isn.LIZ.LJIIJJI = String.valueOf(i7);
                        String networkTypeDetail = C46982IcE.LIZIZ().getNetworkTypeDetail(C16880lQ.LLLLJI(C46982IcE.LIZ));
                        ISM ism2 = isn.LIZ;
                        ism2.LJI = networkTypeDetail;
                        Integer valueOf2 = Integer.valueOf(iph2.LJIILJJIL);
                        if (valueOf2 != null) {
                            ism2.LJIJI.put("model_type", valueOf2);
                        }
                        if (ILN.DEFAULT == type || ILN.D_FEED == type) {
                            ISM ism3 = isn.LIZ;
                            ism3.LJIIIZ = i10;
                            if (i10 > 0) {
                                i8 = 1;
                            } else {
                                i8 = 0;
                            }
                            ism3.LJII = i8;
                        }
                        if (igm != null) {
                            ILO LJI2 = igm.LJI();
                            if (LJI2 != null) {
                                ism2.LJIJI.put("play_type", LJI2);
                            }
                            ism2.LIZ(igm.LJIIIIZZ(str2));
                        }
                        ism2.LIZ(hashMap2);
                        ism2.LIZ(iph2.LJIIL);
                        if (iph2.LJIIJ == 2 && iph2.LJIIJJI != 1) {
                            i9 = 1;
                        } else {
                            i9 = 0;
                        }
                        if (l != null) {
                            ism2.LJIJI.put("request_t", l);
                        }
                        Integer valueOf3 = Integer.valueOf(i9);
                        if (valueOf3 != null) {
                            ism2.LJIJI.put("is_prerender", valueOf3);
                        }
                        Integer valueOf4 = Integer.valueOf(i10);
                        if (valueOf4 != null) {
                            ism2.LJIJI.put("pre_cache_size", valueOf4);
                        }
                        return ism2;
                    }
                });
            }
            this.LJLJI.onPreparePlay(str, iph);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onPreparePlay(str, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, final IT4 it4) {
        Boolean bool;
        long j;
        boolean z;
        Long l;
        if (this.LJLJI != null) {
            if (LIZ() && !TextUtils.isEmpty(str) && this.LJLJLLL.containsKey(str) && (bool = this.LJLJLLL.get(str)) != null && bool.booleanValue()) {
                if (LIZJ().LIZJ() || it4.isPlayerSdkEventTrackingEnabled()) {
                    if (TextUtils.isEmpty(str) || !this.LJLJJLL.containsKey(str) || (l = this.LJLJJLL.get(str)) == null) {
                        j = -1;
                    } else {
                        j = l.longValue();
                    }
                    final IGM LIZJ = LIZJ();
                    final IP0 LIZIZ = LIZIZ();
                    final InterfaceC46645ISj interfaceC46645ISj = this.LJLILLLLZI;
                    final int i = (int) j;
                    final HashMap<String, Object> hashMap = this.LJLJJL;
                    final String id = it4.getId();
                    C35751E1j<String, Long> c35751E1j = IL4.LIZ;
                    Long l2 = c35751E1j.get(id);
                    if (l2 == null) {
                        l2 = Long.valueOf(System.currentTimeMillis());
                        c35751E1j.put(id, l2);
                    }
                    IL4.LIZLLL.put(id, Boolean.TRUE);
                    IL4.LJ.put(id, 2);
                    final int LJIIIIZZ = IL4.LJIIIIZZ(interfaceC46645ISj, id);
                    final int LIZJ2 = IL4.LIZJ(interfaceC46645ISj, id);
                    if (!IZ8.LJJJJ()) {
                        C46982IcE.LIZLLL.execute(new ARunnableS2S0010000_8(true, 1));
                    }
                    final ILN LIZ = IL4.LIZ(LIZJ);
                    final SimVideoUrlModel LJI = IL4.LJI(interfaceC46645ISj, id);
                    final long currentTimeMillis = System.currentTimeMillis();
                    final Long l3 = l2;
                    Callable<IT2> callable = new Callable() { // from class: X.IT0
                        /* JADX WARN: Code restructure failed: missing block: B:9:0x0491, code lost:
                        
                            if (r4 < 0) goto L207;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:121:0x02e6  */
                        /* JADX WARN: Removed duplicated region for block: B:128:0x0319  */
                        /* JADX WARN: Removed duplicated region for block: B:133:0x032d A[LOOP:1: B:131:0x0327->B:133:0x032d, LOOP_END] */
                        /* JADX WARN: Removed duplicated region for block: B:140:0x01fb  */
                        /* JADX WARN: Removed duplicated region for block: B:143:0x0209  */
                        /* JADX WARN: Removed duplicated region for block: B:153:0x023d A[ADDED_TO_REGION] */
                        /* JADX WARN: Removed duplicated region for block: B:156:0x0343  */
                        /* JADX WARN: Removed duplicated region for block: B:158:0x034f  */
                        /* JADX WARN: Removed duplicated region for block: B:160:0x035b  */
                        /* JADX WARN: Removed duplicated region for block: B:164:0x0370  */
                        /* JADX WARN: Removed duplicated region for block: B:165:0x0373  */
                        /* JADX WARN: Removed duplicated region for block: B:166:0x0376  */
                        /* JADX WARN: Removed duplicated region for block: B:168:0x037c  */
                        /* JADX WARN: Removed duplicated region for block: B:169:0x0380  */
                        /* JADX WARN: Removed duplicated region for block: B:170:0x0383  */
                        /* JADX WARN: Removed duplicated region for block: B:171:0x0397  */
                        /* JADX WARN: Removed duplicated region for block: B:172:0x039a  */
                        /* JADX WARN: Removed duplicated region for block: B:173:0x039d  */
                        /* JADX WARN: Removed duplicated region for block: B:177:0x03b2  */
                        /* JADX WARN: Removed duplicated region for block: B:187:0x03e1 A[ADDED_TO_REGION] */
                        /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[ADDED_TO_REGION] */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
                        /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
                        /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
                        /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
                        /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
                        /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
                        /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
                        /* JADX WARN: Removed duplicated region for block: B:54:0x012a A[ADDED_TO_REGION] */
                        /* JADX WARN: Removed duplicated region for block: B:58:0x0138  */
                        /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
                        /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
                        /* JADX WARN: Removed duplicated region for block: B:67:0x015e A[ADDED_TO_REGION] */
                        /* JADX WARN: Removed duplicated region for block: B:80:0x01dd  */
                        /* JADX WARN: Removed duplicated region for block: B:84:0x0259  */
                        @Override // java.util.concurrent.Callable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object call() {
                            /*
                                Method dump skipped, instructions count: 1207
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.IT0.call():java.lang.Object");
                        }
                    };
                    ACallableS3S1301000_8 aCallableS3S1301000_8 = new ACallableS3S1301000_8(LIZJ, i, id, LIZ, it4, 0);
                    if (LIZJ.LIZLLL()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ILI.LIZ().reportRenderFirstFrame(id, callable, hashMap, aCallableS3S1301000_8, z);
                }
                if (!TextUtils.isEmpty(str)) {
                    this.LJLJLLL.put(str, Boolean.FALSE);
                }
            }
            this.LJLJI.onRenderFirstFrame(it4);
            this.LJLJI.onRenderFirstFrame(str, it4);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onRenderFirstFrame(str, it4);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str, IPH iph) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onResumePlay(str, iph);
            this.LJLJI.onResumePlay(str);
            if (LIZ() && (LIZJ().LJIILIIL() || iph.LJI)) {
                LIZLLL(str, true);
                ILI.LIZ().reportVideoOnResume(str, null);
            }
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onResumePlay(str, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, IPG ipg) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRetryOnError(str, ipg);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onRetryOnError(str, ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        Integer num;
        int intValue;
        if (str != null) {
            C35751E1j<String, Integer> c35751E1j = IL4.LIZIZ;
            if (!c35751E1j.containsKey(str) || (num = c35751E1j.get(str)) == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            int i = intValue + 1;
            if (str != null && i > 0) {
                IL4.LIZIZ.put(str, Integer.valueOf(i));
            }
        }
        ILI.LIZ().reportSeekEnd(str);
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onSeekEnd(str, z);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onSeekEnd(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSpeedChanged(String str, float f) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onSpeedChanged(str, f);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onSpeedChanged(str, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBufferedPercent(str, j, i);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onBufferedPercent(str, j, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z, IPH iph) {
        if (this.LJLJI != null) {
            if (LIZ() && (LIZJ().LJIILL() || iph.LJI)) {
                IL4.LJIIIZ(LIZJ(), LIZIZ(), this.LJLILLLLZI, str, z, iph, true, this.LJLJJL);
            }
            this.LJLJI.onBuffering(str, z, iph);
            this.LJLJI.onBuffering(str, z);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onBuffering(str, z, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z, IPH iph) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onDecoderBuffering(str, z, iph);
            this.LJLJI.onDecoderBuffering(str, z);
            if (LIZ() && (LIZJ().LJIILL() || iph.LJI)) {
                IL4.LJIIIZ(LIZJ(), LIZIZ(), this.LJLILLLLZI, str, z, iph, false, this.LJLJJL);
            }
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onDecoderBuffering(str, z, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(final String str, final IPG ipg, final IPH iph) {
        boolean z;
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed(str, ipg, iph);
            this.LJLJI.onPlayFailed(str, ipg);
            if (LIZ() && (LIZJ().LJIIIZ() || iph.LJI)) {
                final IGM LIZJ = LIZJ();
                final IP0 LIZIZ = LIZIZ();
                final InterfaceC46645ISj interfaceC46645ISj = this.LJLILLLLZI;
                final HashMap<String, Object> hashMap = this.LJLJJL;
                final Long l = IL4.LIZ.get(str);
                final ILN LIZ = IL4.LIZ(LIZJ);
                final SimVideoUrlModel LJI = IL4.LJI(interfaceC46645ISj, str);
                final long currentTimeMillis = System.currentTimeMillis();
                C35751E1j<String, Integer> c35751E1j = IL4.LJ;
                Integer num = c35751E1j.get(str);
                if (num != null) {
                    if (num.intValue() >= 2 && num.intValue() != 3) {
                        c35751E1j.put(str, 4);
                    } else if (num.intValue() == 1) {
                        c35751E1j.put(str, 3);
                    }
                }
                Callable<IPA> callable = new Callable() { // from class: X.IP8
                    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a6, code lost:
                    
                        if (r1 == null) goto L13;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c6, code lost:
                    
                        if (r2 <= 0) goto L21;
                     */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object call() {
                        /*
                            Method dump skipped, instructions count: 410
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.IP8.call():java.lang.Object");
                    }
                };
                ACallableS35S1100000_8 aCallableS35S1100000_8 = new ACallableS35S1100000_8(LIZ, LIZJ, str, 1);
                if (LIZJ.LIZLLL()) {
                    z = true;
                } else {
                    z = false;
                }
                ILI.LIZ().reportPlayFailed(str, callable, hashMap, aCallableS35S1100000_8, z);
            }
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onPlayFailed(str, ipg, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayProgressChange(str, j, j2);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onPlayProgressChange(str, j, j2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0080, code lost:
    
        if (r11 == null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPlayStop(java.lang.String r25, final org.json.JSONObject r26, final X.IPH r27) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IGL.onPlayStop(java.lang.String, org.json.JSONObject, X.IPH):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayerInternalEvent(str, i, jSONObject);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onPlayerInternalEvent(str, i, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        ILI.LIZ().reportSeekStart(str, i);
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onSeekStart(str, i, f);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onSeekStart(str, i, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onVideoBitrateChanged(str, enumC47177IfN, i);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onVideoBitrateChanged(str, enumC47177IfN, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
        OnUIPlayListener onUIPlayListener = this.LJLJI;
        if (onUIPlayListener != null) {
            onUIPlayListener.onVideoSizeChanged(str, i, i2);
        }
        IGK igk = this.LJLJJI;
        if (igk != null) {
            igk.onVideoSizeChanged(str, i, i2);
        }
    }
}
