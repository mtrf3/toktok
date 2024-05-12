package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.search.ISearchVideoPlayTaskManager;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.ss.android.ugc.aweme.commercialize.measurement.MeasurementServiceImpl;
import com.ss.android.ugc.aweme.commercialize.utils.video.SearchVideoPlayTaskManager;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NIV implements JGL {
    public JGO LIZ;
    public NIY LIZIZ;
    public Aweme LIZJ;
    public AwemeRawAd LIZLLL;
    public AwemeSearchAdModel LJ;
    public long LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public boolean LJIIJJI;
    public Integer LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public long LJIJI;
    public View LJIJJ;
    public Context LJIJJLI;
    public boolean LJIL;
    public IVK LJJII;
    public Integer LJIIIZ = 0;
    public boolean LJIIJ = true;
    public final C62822Ol8 LJIILLIIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 536));
    public final C62822Ol8 LJIIZILJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 538));
    public final C62822Ol8 LJIJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 537));
    public final NIW LJJ = SearchAdMainService.LJIIJJI().LJII();
    public final NIP LJJI = SearchAdMainService.LJIIJJI().LJIIIIZZ();
    public final Handler LJJIFFI = new Handler(C16880lQ.LLJJJJ());
    public final C62822Ol8 LJJIII = C221108m2.LIZIZ(new AqS160S0100000_10(this, 540));

    @Override // X.JGL
    public final void LLLL() {
    }

    @Override // X.JGL
    public final void onDestroy() {
    }

    @Override // X.JGL
    public final void onPlayStop(String str) {
    }

    public static IVideoPlayTaskManager LJJIL() {
        ISearchVideoPlayTaskManager searchVideoPlayTaskManager;
        Object LIZ = C58096Mr6.LIZ(ISearchVideoPlayTaskManager.class, false);
        if (LIZ != null) {
            searchVideoPlayTaskManager = (ISearchVideoPlayTaskManager) LIZ;
        } else {
            searchVideoPlayTaskManager = new SearchVideoPlayTaskManager();
        }
        return searchVideoPlayTaskManager.LIZ();
    }

    public final void LJJIIZI() {
        if (this.LJIILL || LJJJJZ() || LJJJJI()) {
            return;
        }
        NIY niy = this.LIZIZ;
        if (niy != null) {
            niy.LIZJ();
        }
        this.LJJI.LJIILIIL(3, this.LIZJ);
        this.LJIILL = true;
    }

    public final IVideoPlayTaskManager LJJIJIIJI() {
        return (IVideoPlayTaskManager) this.LJIILLIIL.getValue();
    }

    public final IVideoPlayTaskManager LJJIJIIJIL() {
        return (IVideoPlayTaskManager) this.LJIJ.getValue();
    }

    public final IVideoPlayTaskManager LJJIJIL() {
        return (IVideoPlayTaskManager) this.LJIIZILJ.getValue();
    }

    public final long LJJIJL() {
        if (this.LIZIZ != null) {
            return r0.getCurrentPosition();
        }
        return 0L;
    }

    public final C59116NIa LJJIJLIJ() {
        return (C59116NIa) this.LJJIII.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0116, code lost:
    
        if (r0.intValue() > 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0118, code lost:
    
        r0 = r9.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x011a, code lost:
    
        if (r0 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011c, code lost:
    
        r0.LIZLLL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011f, code lost:
    
        r9.LJIIJJI = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fa, code lost:
    
        if (r0.intValue() > 0) goto L73;
     */
    @Override // X.JGL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJ() {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NIV.LJJJ():void");
    }

    public final boolean LJJJJI() {
        Integer num;
        if (!this.LJIILIIL || (num = this.LJIIL) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJJJIZL() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LIZJ
            r2 = 0
            if (r0 == 0) goto L4a
            r1 = 0
            boolean r0 = r0.isAd()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LIZJ
            if (r0 == 0) goto L73
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L73
            java.lang.String r0 = r0.getWebUrl()
        L25:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L3f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LIZJ
            if (r0 == 0) goto L39
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L39
            java.lang.String r1 = r0.getOpenUrl()
        L39:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L4a
        L3f:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LIZJ
            r1 = 1
            if (r0 == 0) goto L4b
            boolean r0 = X.O5Y.LJIILL(r0)
            if (r0 != r1) goto L4b
        L4a:
            return r2
        L4b:
            com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel r0 = r3.LJ
            if (r0 == 0) goto L55
            java.lang.Integer r0 = r0.getAnimationType()
            if (r0 != 0) goto L56
        L55:
            return r2
        L56:
            int r0 = r0.intValue()
            if (r0 != r1) goto L55
            boolean r0 = r3.LJJJJI()
            if (r0 != 0) goto L4a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LIZJ
            boolean r0 = X.O5Y.LJJIJLIJ(r0)
            if (r0 != 0) goto L4a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LIZJ
            boolean r0 = X.O5Y.LJJIJ(r0)
            if (r0 == 0) goto L75
            goto L4a
        L73:
            r0 = r1
            goto L25
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NIV.LJJJJIZL():boolean");
    }

    public final boolean LJJJJJ() {
        Aweme aweme;
        Aweme aweme2 = this.LIZJ;
        if (aweme2 != null && O5Y.LJIILL(aweme2) && ((aweme = this.LIZJ) == null || !C63081OpJ.LJLJLJ(aweme))) {
            return true;
        }
        return false;
    }

    @Override // X.JGL
    public final void LJJJJL() {
        if (!this.LJIL) {
            this.LJIJI = LJJIJL();
            JHI.LIZ().LJIIL = Long.valueOf(this.LJIJI);
        }
    }

    public final void LJJJJLI() {
        boolean z;
        NIW niw = this.LJJ;
        AwemeRawAd awemeRawAd = this.LIZLLL;
        int i = this.LJI;
        NIY niy = this.LIZIZ;
        if (niy != null) {
            z = niy.LJJJJLL();
        } else {
            z = false;
        }
        niw.LJJII(awemeRawAd, i, z, C59406NTe.LJI(this.LIZJ));
    }

    public final boolean LJJJJZ() {
        Integer num;
        if (!this.LJJI.LIZ() || this.LJIIIIZZ != 0) {
            return false;
        }
        if (this.LJIILIIL && (num = this.LJIIL) != null && num.intValue() == 0) {
            return false;
        }
        return true;
    }

    @Override // X.JGL
    public final void LLLJIL() {
        NIY niy = this.LIZIZ;
        if (niy != null && o.LJ(niy.LIZ(), Boolean.TRUE)) {
            NIY niy2 = this.LIZIZ;
            if (niy2 != null) {
                niy2.LJFF();
            }
            this.LJIILJJIL = true;
            LJJJJLI();
            LJJJJJL(false);
        }
    }

    @Override // X.JGL
    public final void LLLJL() {
        NIY niy;
        AwemeRawAd awemeRawAd = this.LIZLLL;
        if (awemeRawAd != null && O5Y.LJIILLIIL(awemeRawAd) && (niy = this.LIZIZ) != null) {
            niy.LJLLJ();
        }
        this.LJJIFFI.postDelayed(new ARunnableS46S0100000_10(this, 181), 500L);
        LJJIJIIJI().reset();
        LJJIJIL().LJLJL();
        LJJIJIIJIL().LJLJL();
        this.LJJI.LJIIZILJ(false);
    }

    @Override // X.JGL
    public final void onAttachedToWindow() {
        NIY niy = this.LIZIZ;
        if (niy != null) {
            niy.LJLLJ();
        }
        LJJIJIIJI().LJLJJLL();
        LJJIJIIJIL().LJLJJLL();
        LJJIJIL().LJLJJLL();
        this.LJIL = false;
    }

    @Override // X.JGL
    public final void onDetachedFromWindow() {
        NIY niy;
        if (!this.LJIILIIL && LJJIJL() >= 0) {
            this.LJIJI = LJJIJL();
            JHI.LIZ().LJIIL = Long.valueOf(this.LJIJI);
        }
        NIY niy2 = this.LIZIZ;
        if (niy2 != null) {
            niy2.LJLLJ();
        }
        NIY niy3 = this.LIZIZ;
        if (niy3 != null && o.LJ(niy3.LIZ(), Boolean.TRUE) && (niy = this.LIZIZ) != null) {
            niy.LJFF();
        }
        LJJIJIIJI().LJLJL();
        LJJIJIIJIL().LJLJL();
        LJJIJIL().LJLJL();
        LJJIJIIJI().reset();
        this.LJIL = true;
    }

    public final void LJJJI() {
        LJJIJIL().LJLJJI(100L);
        long j = this.LJFF;
        double d = j;
        LJJIZ(j);
        IVideoPlayTaskManager LJJIJIL = LJJIJIL();
        N68 n68 = new N68("searchVideoFirstQuartileTimingTask");
        n68.LIZIZ(this.LJFF);
        n68.LIZJ = (int) (0.25d * d);
        n68.LIZLLL = new ARunnableS46S0100000_10(this, 176);
        n68.LJ = true;
        LJJIJIL.LJLJLJ(n68.LIZ());
        IVideoPlayTaskManager LJJIJIL2 = LJJIJIL();
        N68 n682 = new N68("searchVideoMidQuartileTimingTask");
        n682.LIZIZ(this.LJFF);
        n682.LIZJ = (int) (0.5d * d);
        n682.LIZLLL = new ARunnableS46S0100000_10(this, 177);
        n682.LJ = true;
        LJJIJIL2.LJLJLJ(n682.LIZ());
        IVideoPlayTaskManager LJJIJIL3 = LJJIJIL();
        N68 n683 = new N68("searchVideoThirdQuartileTimingTask");
        n683.LIZIZ(this.LJFF);
        n683.LIZJ = (int) (d * 0.75d);
        n683.LIZLLL = new ARunnableS46S0100000_10(this, 178);
        n683.LJ = true;
        LJJIJIL3.LJLJLJ(n683.LIZ());
    }

    public final void LJJJIL() {
        if ((!LJJJJIZL() && !LJJJJJ()) || this.LJIILIIL) {
            return;
        }
        if (NPC.LJIIIIZZ() && this.LJIIIIZZ == 0) {
            return;
        }
        LJJIJIIJI().LJLJJI(100L);
        IVideoPlayTaskManager LJJIJIIJI = LJJIJIIJI();
        N68 n68 = new N68("transformBtnChangeColor");
        n68.LIZIZ(this.LJFF);
        n68.LIZJ = this.LJIIIIZZ;
        n68.LIZLLL = new ARunnableS46S0100000_10(this, 179);
        n68.LJ = false;
        LJJIJIIJI.LJLJLJ(n68.LIZ());
    }

    public final void LJJJJ() {
        if (!LJJJJIZL() && !LJJJJJ()) {
            return;
        }
        LJJIJIIJI().LJLJJI(100L);
        IVideoPlayTaskManager LJJIJIIJI = LJJIJIIJI();
        N68 n68 = new N68("transformBtnShow");
        n68.LIZIZ(this.LJFF);
        n68.LIZJ = this.LJII;
        n68.LIZLLL = new ARunnableS46S0100000_10(this, 180);
        n68.LJ = false;
        LJJIJIIJI.LJLJLJ(n68.LIZ());
    }

    public static long LJJIJ(Aweme aweme) {
        Video video;
        Video video2;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        if (video == null || aweme == null || (video2 = aweme.getVideo()) == null) {
            return 1L;
        }
        video2.getDuration();
        return aweme.getVideo().getDuration();
    }

    public final void LJJIZ(long j) {
        if (j >= 2000) {
            IVideoPlayTaskManager LJJIJIL = LJJIJIL();
            N68 LIZIZ = C1DD.LIZIZ("SearchAd2sPlayProgressTrack", j);
            LIZIZ.LIZJ = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            LIZIZ.LIZLLL = new ARunnableS46S0100000_10(this, 174);
            LIZIZ.LJ = true;
            LJJIJIL.LJLJLJ(LIZIZ.LIZ());
        }
        if (j >= 6000) {
            IVideoPlayTaskManager LJJIJIL2 = LJJIJIL();
            N68 LIZIZ2 = C1DD.LIZIZ("SearchAd6sPlayProgressTrack", j);
            LIZIZ2.LIZJ = LiveEffectMusicFadeDurationSetting.DEFAULT;
            LIZIZ2.LIZLLL = new ARunnableS46S0100000_10(this, 175);
            LIZIZ2.LJ = true;
            LJJIJIL2.LJLJLJ(LIZIZ2.LIZ());
        }
    }

    public final void LJJJJJL(boolean z) {
        View view;
        IVK ivk;
        this.LJJ.LJJIIZI(this.LIZLLL, this.LJI, z);
        Aweme aweme = this.LIZJ;
        Context context = this.LJIJJLI;
        NIY niy = this.LIZIZ;
        if (niy != null) {
            view = niy.LJ();
        } else {
            view = null;
        }
        if (aweme != null && context != null && view != null && (ivk = this.LJJII) != null) {
            ivk.LJII(this.LJI, context, view, aweme);
        }
    }

    public final void LJJJJLL(String str) {
        if (o.LJ(str, "SearchAd2sPlayProgressTrack")) {
            java.util.Set<String> LIZJ = this.LJJI.LIZJ(this.LIZJ);
            if (LIZJ == null || !LIZJ.contains("play_2s")) {
                this.LJJ.LJJI(this.LJI, this.LIZLLL);
                return;
            }
            return;
        }
        if (!o.LJ(str, "SearchAd6sPlayProgressTrack")) {
            return;
        }
        java.util.Set<String> LIZJ2 = this.LJJI.LIZJ(this.LIZJ);
        if (LIZJ2 != null && LIZJ2.contains("play_6s")) {
            return;
        }
        this.LJJ.LJJIIJ(this.LJI, this.LIZLLL);
    }

    @Override // X.JGL
    public final void LLLLII(boolean z) {
        if (LJJIJL() > 500) {
            if (NPC.LJIIIIZZ()) {
                LJJJJJL(z);
            } else {
                LJJJJJL(false);
            }
        }
    }

    @Override // X.JGL
    public final void LLLLIIIILLL(boolean z) {
        NIY niy = this.LIZIZ;
        if (niy != null && o.LJ(niy.LIZ(), Boolean.TRUE)) {
            return;
        }
        this.LJJ.LJJIFFI(this.LIZLLL, JHI.LIZ().LJ, z);
    }

    @Override // X.JGL
    public final void LLLLIIL(String str) {
        long j;
        View view;
        if (str != null && o.LJ(str, JHI.LIZ().LJIILIIL)) {
            this.LJI = JHI.LIZ().LJ;
            if (C46279IEh.LIZ()) {
                Aweme aweme = this.LIZJ;
                Context context = this.LJIJJLI;
                NIY niy = this.LIZIZ;
                if (niy != null) {
                    view = niy.LJ();
                } else {
                    view = null;
                }
                if (aweme != null && context != null && view != null) {
                    SearchAdMainService.LJIIJJI().LJI(view, context, aweme, new AqS157S0200000_10(this, aweme, 42), new AqS160S0100000_10(this, 539), false);
                }
            }
            if (LJJIJIL().LJLJJL() == 0) {
                LJJIJIL().reset();
                LJJJI();
                LJJIZ(LJJIJ(this.LIZJ));
                LJJIJIL().LJLIL(LJJIJLIJ());
            }
            if (LJJJJZ() || LJJJJI()) {
                this.LJJI.LJIILIIL(3, this.LIZJ);
            } else {
                this.LJIILL = false;
                LJJIJIIJI().LJLIL(LJJIJLIJ());
                Aweme aweme2 = this.LIZJ;
                if (aweme2 != null && O5Y.LJJIJL(aweme2)) {
                    Handler handler = this.LJJIFFI;
                    ARunnableS46S0100000_10 aRunnableS46S0100000_10 = new ARunnableS46S0100000_10(this, 182);
                    if (this.LJJI.LJIILLIIL()) {
                        j = 300;
                    } else {
                        j = 0;
                    }
                    handler.postDelayed(aRunnableS46S0100000_10, j);
                } else {
                    LJJJJ();
                }
                Aweme aweme3 = this.LIZJ;
                if (aweme3 != null && O5Y.LJJIJIL(aweme3)) {
                    LJJIIZI();
                } else {
                    LJJJIL();
                }
            }
            LJJIJIIJI().LJLJJLL();
            LJJIJIIJIL().LJLJJLL();
            LJJIJIL().LJLJJLL();
        }
    }

    @Override // X.InterfaceC48872JGa
    public final void init(JGV adSceneDepend) {
        AwemeRawAd awemeRawAd;
        Aweme aweme;
        Context context;
        AwemeSearchAdModel awemeSearchAdModel;
        int i;
        boolean z;
        float f;
        Float singleBtnColorShowSeconds;
        Boolean isCiAd;
        Boolean isPreciseAd;
        o.LJIIIZ(adSceneDepend, "adSceneDepend");
        JGO jgo = (JGO) adSceneDepend;
        this.LIZ = jgo;
        InterfaceC48875JGd interfaceC48875JGd = jgo.LIZ;
        o.LJII(interfaceC48875JGd, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.search.search_player.ISearchAdVideoPlayerSceneCallBack");
        NIY niy = (NIY) interfaceC48875JGd;
        this.LIZIZ = niy;
        JGO jgo2 = this.LIZ;
        Integer num = null;
        if (jgo2 != null) {
            awemeRawAd = jgo2.LIZIZ;
        } else {
            awemeRawAd = null;
        }
        this.LIZLLL = awemeRawAd;
        if (jgo2 != null) {
            aweme = jgo2.LIZJ;
        } else {
            aweme = null;
        }
        this.LIZJ = aweme;
        if (jgo2 != null) {
            context = jgo2.LIZLLL;
        } else {
            context = null;
        }
        this.LJIJJLI = context;
        this.LJIJJ = niy.LJ();
        AwemeRawAd awemeRawAd2 = this.LIZLLL;
        if (awemeRawAd2 != null) {
            awemeSearchAdModel = awemeRawAd2.getSearchAdInfo();
        } else {
            awemeSearchAdModel = null;
        }
        this.LJ = awemeSearchAdModel;
        this.LJFF = LJJIJ(this.LIZJ);
        AwemeSearchAdModel awemeSearchAdModel2 = this.LJ;
        if (awemeSearchAdModel2 == null || (i = awemeSearchAdModel2.getPreciseAdCTAPosition()) == null) {
            i = 1;
        }
        this.LJIIL = i;
        AwemeSearchAdModel awemeSearchAdModel3 = this.LJ;
        if (awemeSearchAdModel3 != null && (isPreciseAd = awemeSearchAdModel3.isPreciseAd()) != null) {
            z = isPreciseAd.booleanValue();
        } else {
            z = false;
        }
        this.LJIILIIL = z;
        AwemeSearchAdModel awemeSearchAdModel4 = this.LJ;
        if (awemeSearchAdModel4 != null && (isCiAd = awemeSearchAdModel4.isCiAd()) != null) {
            isCiAd.booleanValue();
        }
        AwemeSearchAdModel awemeSearchAdModel5 = this.LJ;
        float f2 = 0.0f;
        if (awemeSearchAdModel5 != null) {
            f = awemeSearchAdModel5.getShowButtonSeconds();
        } else {
            f = 0.0f;
        }
        this.LJII = (int) (f * 1000.0f);
        if (NPC.LJIIIIZZ()) {
            AwemeSearchAdModel awemeSearchAdModel6 = this.LJ;
            if (awemeSearchAdModel6 != null && (singleBtnColorShowSeconds = awemeSearchAdModel6.getSingleBtnColorShowSeconds()) != null) {
                f2 = singleBtnColorShowSeconds.floatValue();
            }
        } else {
            AwemeSearchAdModel awemeSearchAdModel7 = this.LJ;
            if (awemeSearchAdModel7 != null) {
                f2 = awemeSearchAdModel7.getButtonColorShowSeconds();
            }
        }
        this.LJIIIIZZ = (int) (f2 * 1000.0f);
        AwemeSearchAdModel awemeSearchAdModel8 = this.LJ;
        if (awemeSearchAdModel8 != null) {
            num = awemeSearchAdModel8.getShowMaskTimes();
        }
        this.LJIIIZ = num;
        if (C46279IEh.LIZ()) {
            this.LJJII = MeasurementServiceImpl.LJ().LIZJ();
        }
    }

    @Override // X.JGL
    public final void onRenderReady(IPH playerEvent) {
        View view;
        IVK ivk;
        o.LJIIIZ(playerEvent, "playerEvent");
        JHI.LIZ().LJ = 0;
        JHI.LIZ().getClass();
        JHI.LIZ().LJIIJ = false;
        long j = 0;
        JHI.LIZ().LJIIL = 0L;
        this.LJIIJJI = false;
        this.LJIILL = false;
        this.LJIIJ = true;
        this.LJI = 0;
        NIY niy = this.LIZIZ;
        if (niy != null) {
            niy.LJLLJ();
        }
        LJJJJLI();
        this.LJJI.LIZLLL(this.LIZJ);
        LJJIJIIJI().reset();
        LJJIJIIJIL().reset();
        LJJIJIL().reset();
        LJJJJ();
        LJJJIL();
        LJJJI();
        LJJIJIIJIL().reset();
        LJJIJIIJIL().LJLJJI(1000L);
        long LJIJI = C78939UyV.LJIJI(0L, this.LJFF, 1000L);
        if (0 <= LJIJI) {
            while (true) {
                IVideoPlayTaskManager LJJIJIIJIL = LJJIJIIJIL();
                N68 n68 = new N68("startMonitorPlayProgress");
                n68.LIZIZ(this.LJFF);
                n68.LIZJ = (int) j;
                n68.LIZLLL = new ARunnableS46S0100000_10(this, 183);
                n68.LJ = true;
                LJJIJIIJIL.LJLJLJ(n68.LIZ());
                if (j == LJIJI) {
                    break;
                } else {
                    j += 1000;
                }
            }
        }
        LJJIJIIJIL().LJLIL(LJJIJLIJ());
        LJJIJIIJIL().LJLIIL();
        LJJIJIIJI().LJLIL(LJJIJLIJ());
        LJJIJIIJI().LJLIIL();
        LJJIJIL().LJLIL(LJJIJLIJ());
        LJJIJIL().LJLIIL();
        if (!LJJJJZ() && !LJJJJI()) {
            Aweme aweme = this.LIZJ;
            if (aweme != null) {
                O5Y.LJJJLL(aweme);
            }
        } else {
            this.LJJI.LJIILIIL(3, this.LIZJ);
        }
        IVK ivk2 = this.LJJII;
        if (ivk2 != null) {
            ivk2.LJIIIIZZ(new AqS160S0100000_10(this, 534));
            ivk2.LJIILLIIL(new AqS160S0100000_10(this, 535));
        }
        Aweme aweme2 = this.LIZJ;
        Context context = this.LJIJJLI;
        NIY niy2 = this.LIZIZ;
        if (niy2 != null) {
            view = niy2.LJ();
        } else {
            view = null;
        }
        if (aweme2 != null && context != null && view != null && (ivk = this.LJJII) != null) {
            ivk.LJIIZILJ(this.LJI, context, view, aweme2);
        }
    }
}
