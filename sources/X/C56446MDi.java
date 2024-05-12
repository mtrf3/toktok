package X;

import Y.ALAdapterS2S0110000_9;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS45S0100000_9;
import Y.AUListenerS97S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility;
import com.ss.android.ugc.aweme.casting.api.ICastingPlayerService;
import com.ss.android.ugc.aweme.experiment.SeekBarEdgeOptiExp;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS24S0010000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.MDi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C56446MDi implements InterfaceC56456MDs, InterfaceC55370LoE, C34N {
    public static int LJJJIL;
    public final C56448MDk LIZ;
    public final ViewGroup LIZIZ;
    public final View LIZJ;
    public final ImageView LIZLLL;
    public final ScrollSwitchStateManager LJ;
    public final VideoSeekBarMaskView LJFF;
    public final String LJI = "CommonControl";
    public final IHZ LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final int LJIIL;
    public final Handler LJIILIIL;
    public Aweme LJIILJJIL;
    public int LJIILL;
    public Aweme LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public long LJIJJLI;
    public IDR LJIL;
    public String LJJ;
    public String LJJI;
    public int LJJIFFI;
    public int LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public int LJJIIZI;
    public boolean LJJIJ;
    public int LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public int LJJIJL;
    public long LJJIJLIJ;
    public boolean LJJIL;
    public C73701SwD LJJIZ;
    public C40883G2t LJJJ;
    public final ARunnableS45S0100000_9 LJJJI;

    public void LIZIZ() {
    }

    public void LIZLLL() {
    }

    public boolean LJIILIIL(Object event) {
        o.LJIIIZ(event, "event");
        return true;
    }

    public final C40883G2t LJIIIZ() {
        C40883G2t c40883G2t = this.LJJJ;
        if (c40883G2t != null) {
            return c40883G2t;
        }
        o.LJIJI("collaboratorContainer");
        throw null;
    }

    public final int LJIIJ() {
        if (this.LJIIZILJ >= 30) {
            return 0;
        }
        Aweme aweme = this.LJIILJJIL;
        if (aweme != null && Z9N.LIZIZ.LIZ.LLLF(aweme)) {
            return 0;
        }
        return 4;
    }

    public final boolean LJIIL() {
        InterfaceC46330IGg LJJLIIIIJ;
        IDR idr = this.LJIL;
        if (idr == null || (LJJLIIIIJ = idr.getPlayerManager()) == null) {
            LJJLIIIIJ = IWF.LJJLIIIIJ();
        }
        return LJJLIIIIJ.isPaused();
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [X.Yns, X.Prl] */
    public final void LJIJ() {
        String str;
        int i;
        Aweme aweme;
        boolean z;
        int LJIIJ;
        String str2;
        Video video;
        if (!this.LJJIII) {
            Context context = this.LIZ.getContext();
            o.LJIIIIZZ(context, "seekBar.context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null) {
                this.LJJIII = true;
                ScrollSwitchStateManager scrollSwitchStateManager = this.LJ;
                if (scrollSwitchStateManager != null) {
                    scrollSwitchStateManager.qv0(LJJIFFI, new AObserverS77S0100000_9(this, 74));
                }
                ScrollSwitchStateManager scrollSwitchStateManager2 = this.LJ;
                if (scrollSwitchStateManager2 != null) {
                    scrollSwitchStateManager2.LL.observe(LJJIFFI, new AObserverS77S0100000_9(this, 75));
                }
            }
        }
        this.LIZ.setProgress(0.0f);
        String str3 = null;
        if (!LJII(this.LJIILJJIL)) {
            this.LIZ.setVisibility(8);
            LJIIIZ().LIZIZ();
            IHZ ihz = this.LJII;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("hide progressbar:");
            Aweme aweme2 = this.LJIILJJIL;
            if (aweme2 != null) {
                str3 = aweme2.getAid();
            }
            LIZ.append(str3);
            LIZ.append(", isReverseEnable: ");
            C52452KiG c52452KiG = C52452KiG.LIZ;
            Aweme aweme3 = this.LJIILJJIL;
            c52452KiG.getClass();
            LIZ.append(C52452KiG.LIZ(aweme3));
            ihz.LIZLLL(X1D.LIZIZ(LIZ));
            return;
        }
        this.LIZ.setAlpha(1.0f);
        this.LIZ.setVisibility(0);
        IHZ ihz2 = this.LJII;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("show progressbar:");
        Aweme aweme4 = this.LJIILJJIL;
        if (aweme4 != null) {
            str = aweme4.getAid();
        } else {
            str = null;
        }
        LIZ2.append(str);
        ihz2.LIZLLL(X1D.LIZIZ(LIZ2));
        LJIIIZ().LIZIZ();
        Aweme aweme5 = this.LJIILJJIL;
        if (aweme5 != null && (video = aweme5.getVideo()) != null) {
            i = video.getDuration();
        } else {
            i = 0;
        }
        this.LJIIZILJ = C56451MDn.LIZJ(i);
        Aweme aweme6 = this.LJIILJJIL;
        if ((aweme6 != null && C86670Xzu.LJIIIIZZ(aweme6) != null) || ((aweme = this.LJIILJJIL) != null && C86670Xzu.LJIIL(aweme) != null)) {
            z = true;
        } else {
            z = false;
        }
        this.LJJIJIL = z;
        for (C56455MDr c56455MDr : (C56455MDr[]) LJIIIZ().LIZ) {
            ?? r1 = c56455MDr.LIZJ;
            if (r1 != 0) {
                r1.invoke(c56455MDr.LIZ);
            }
        }
        this.LIZ.LIZIZ(0.0f);
        C56448MDk c56448MDk = this.LIZ;
        if (this.LJJIJ && LJIIL()) {
            LJIIJ = 1;
        } else {
            LJIIJ = LJIIJ();
        }
        c56448MDk.setSeekBarShowType(LJIIJ);
        Aweme aweme7 = this.LJIILJJIL;
        if (C79081V1x.LJIJJ(aweme7)) {
            C61798ONe LIZ3 = C55016LiW.LIZ();
            if (aweme7 != null) {
                str2 = aweme7.getAid();
            } else {
                str2 = null;
            }
            if (LIZ3.LIZJ(OBQ.BACKGROUND.getType(), str2)) {
                IHZ ihz3 = this.LJII;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("can not show seekbar, hide state:{9}, aid: ");
                Aweme aweme8 = this.LJIILJJIL;
                if (aweme8 != null) {
                    str3 = aweme8.getAid();
                }
                LIZ4.append(str3);
                ihz3.LJIIL(X1D.LIZIZ(LIZ4));
                this.LIZ.setVisibility(8);
            }
        }
    }

    @Override // X.InterfaceC55370LoE
    public final void onDestroy() {
        EventBus.LIZJ().LJIJ(this);
        this.LJIL = null;
        this.LJIILIIL.removeCallbacks(this.LJJJI);
        C73701SwD c73701SwD = this.LJJIZ;
        if (c73701SwD != null) {
            InterfaceC73651SvP interfaceC73651SvP = c73701SwD.LJIIJ;
            if (interfaceC73651SvP != null) {
                interfaceC73651SvP.cancel();
            }
            c73701SwD.LJIIIZ = null;
            c73701SwD.LJI = null;
        }
    }

    public String LJIIJJI() {
        return this.LJI;
    }

    @Override // X.C34N
    public final void LJFF(Aweme aweme) {
        if (aweme != null) {
            this.LJIILJJIL = aweme;
            LJIILJJIL(aweme);
            LJIJ();
        }
    }

    public final boolean LJII(Aweme aweme) {
        String str;
        if (1 != this.LJIILL) {
            this.LJII.LJII(aweme, "can not show seekbar, state: 1, not in resume");
            return false;
        }
        if (!C54840Lfg.LJJZ(aweme)) {
            this.LJII.LJII(aweme, "can not show seekbar, state: 2, can not drag");
            return false;
        }
        if (!this.LJJIJ) {
            Aweme aweme2 = this.LJIILLIIL;
            String str2 = null;
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            if (aweme != null) {
                str2 = aweme.getAid();
            }
            if (!C38354F3m.LIZJ(str, str2)) {
                this.LJII.LJII(aweme, "can not show seekbar, state: 3, not current aweme");
                return false;
            }
        }
        if (!C54840Lfg.LJJZZI(aweme)) {
            this.LJII.LJII(aweme, "can not show seekbar, state: 4, can not show progressbar");
            return false;
        }
        if (C54838Lfe.LJJI(aweme)) {
            this.LJII.LJII(aweme, "can not show seekbar, state: 5, is story video");
            return false;
        }
        C52452KiG.LIZ.getClass();
        if (!C52452KiG.LIZ(aweme)) {
            this.LJII.LJIIL("can not show seekbar, state: 6, hit inverse expriment");
            return false;
        }
        if (C220858ld.LJIIIIZZ(aweme)) {
            this.LJII.LJIIL("can not show seekbar, state: 7, video has mask");
            return false;
        }
        if (!this.LJJIL) {
            return true;
        }
        this.LJII.LJIIL("can not show seekbar, state: 8, desc is expanding");
        return false;
    }

    public final int LJIIIIZZ(int i) {
        return (int) (((i / 100.0f) * this.LJIIZILJ) / 100);
    }

    public final void LJIILJJIL(Aweme aweme) {
        String str;
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        Aweme aweme2 = this.LJIILLIIL;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        }
        if (!TextUtils.equals(str, str2)) {
            this.LJIILLIIL = aweme;
            LJIJ();
        }
    }

    public final void LJIILL(boolean z) {
        if (z) {
            C56448MDk c56448MDk = this.LIZ;
            C178596zf.LIZ(c56448MDk.getAlpha(), 0.0f, c56448MDk);
        } else {
            C56448MDk c56448MDk2 = this.LIZ;
            C178596zf.LIZ(c56448MDk2.getAlpha(), 1.0f, c56448MDk2);
        }
    }

    @QD3
    public final void onBackgroundSurveyEvent(C56458MDu event) {
        String str;
        o.LJIIIZ(event, "event");
        String str2 = event.LJLILLLLZI;
        Aweme aweme = this.LJIILJJIL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(str2, str)) {
            LJIILL(event.LJLIL);
            if (event.LJLIL) {
                this.LJII.LJIIJ(new AqS159S0100000_9(event, 842));
                this.LIZ.setVisibility(8);
            } else {
                if (!LJII(this.LJIILJJIL)) {
                    return;
                }
                this.LIZ.setVisibility(0);
            }
        }
    }

    @QD3
    public final void onFullFeedFragmentPageStateChangeEvent(C2QA event) {
        o.LJIIIZ(event, "event");
        if (LJIILIIL(event) && LJII(event.LJLIL)) {
            LJIIZILJ(event.LJLIL, event.LJLILLLLZI, true);
        }
    }

    @QD3
    public final void onFullFeedVideoChangeEvent(C55391LoZ event) {
        o.LJIIIZ(event, "event");
        IDR idr = event.LJLJJI;
        IHZ ihz = this.LJII;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFullFeedVideoChangeEvent, mIsTrackingTouch=");
        LIZ.append(this.LJIJ);
        LIZ.append(", panel.pageResumed=");
        LIZ.append(idr.getPageResumed());
        ihz.LJII(event.LJLIL, X1D.LIZIZ(LIZ));
        this.LJJIL = false;
        if (idr.getPageResumed() && LJIILIIL(event)) {
            Aweme aweme = event.LJLIL;
            this.LJIILJJIL = aweme;
            String str = event.LJLILLLLZI;
            if (str == null) {
                str = "";
            }
            this.LJJ = str;
            this.LJJIFFI = event.LJLJI;
            this.LJIL = idr;
            if (!this.LJJIIJ) {
                this.LJJIIZ = false;
            }
            if (JAY.LJI && C1DJ.LJIJJLI(aweme)) {
                LJIILJJIL(event.LJLIL);
            }
            LJIJ();
        }
    }

    @QD3
    public final void onPlayerControllerVideoPlayProgressChange(C46361IHl event) {
        o.LJIIIZ(event, "event");
        LJIILLIIL(event.LJLJJLL, LJIILIIL(event), event.LJLIL, event.LJLJI, event.LJLILLLLZI);
    }

    @QD3
    public final void onPlayerControllerVideoStatusEvent(C46288IEq event) {
        o.LJIIIZ(event, "event");
        this.LJJIJ = event.LJLJJL;
        if (!LJIILIIL(event) || !LJII(event.LJLIL)) {
            return;
        }
        int i = event.LJLJI;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.LIZ.setPauseStatus(false);
            if (!this.LJJIIJ || this.LJJIIJZLJL) {
                return;
            }
            this.LIZ.setSeekBarShowType(LJIIJ());
            return;
        }
        if (this.LJJIJ) {
            this.LIZ.setVisibility(0);
        }
        this.LJJIIZI = 0;
        this.LIZ.setPauseStatus(true);
        this.LIZ.setSeekBarShowType(1);
        this.LJIILIIL.removeCallbacks(this.LJJJI);
        this.LJJIIJZLJL = false;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.Ynr, X.Prl] */
    @Override // X.InterfaceC56456MDs
    public final void onProgressChanged(int i) {
        InterfaceC56460MDw interfaceC56460MDw;
        if (this.LJIJ) {
            int LJIIIIZZ = LJIIIIZZ(i);
            if (C91L.LIZ() && (interfaceC56460MDw = (InterfaceC56460MDw) this.LJIIJJI.getValue()) != null) {
                interfaceC56460MDw.Jl0(LJIIIIZZ * 1000);
            }
            for (C56455MDr c56455MDr : (C56455MDr[]) LJIIIZ().LIZ) {
                ?? r2 = c56455MDr.LIZIZ;
                if (r2 != 0) {
                    r2.invoke(Integer.valueOf(i), c56455MDr.LIZ);
                }
            }
        }
    }

    @QD3
    public final void onRenderFirstFrame(C46272IEa event) {
        long j;
        LruCache<String, Long> lruCache;
        Long l;
        String str;
        o.LJIIIZ(event, "event");
        if (LJIILIIL(event)) {
            Aweme aweme = this.LJIILLIIL;
            LJIILJJIL(event.LJLIL);
            this.LJII.LJII(this.LJIILLIIL, "onRenderFirstFrame, set renderAweme");
            String str2 = null;
            if (((Boolean) C52321Kg9.LIZ.getValue()).booleanValue()) {
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                Aweme aweme2 = this.LJIILLIIL;
                if (aweme2 != null) {
                    str2 = aweme2.getAid();
                }
                if (TextUtils.equals(str, str2)) {
                    LJIJ();
                }
            } else {
                LJIJ();
            }
            this.LJJIJL = 0;
            Aweme aweme3 = this.LJIILJJIL;
            String str3 = this.LJJ;
            if (aweme3 == null || aweme3.getAid() == null || (lruCache = J8M.LIZ.get(str3)) == null || (l = lruCache.get(aweme3.getAid())) == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            this.LJJIJLIJ = j;
        }
    }

    @Override // X.InterfaceC56456MDs
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i;
        IDR idr;
        Context context;
        InterfaceC46330IGg LJJLIIIIJ;
        IFeedPanelPlatformAbility feedPanelPlatformAbility;
        InterfaceC55235Lm3 vScope;
        IMidAdAbility iMidAdAbility;
        IMidAdCellAbility FT;
        this.LJIJ = true;
        FypAutoScrollServiceImpl.LJIIZILJ().LJI(true);
        IDR idr2 = this.LJIL;
        ActivityC45651qj activityC45651qj = null;
        if (idr2 != null && (feedPanelPlatformAbility = idr2.getFeedPanelPlatformAbility()) != null && (vScope = feedPanelPlatformAbility.getVScope()) != null && (iMidAdAbility = (IMidAdAbility) C55096Ljo.LIZ(vScope, IMidAdAbility.class, null)) != null && (FT = iMidAdAbility.FT()) != null) {
            FT.Us0(true);
        }
        if (seekBar != null) {
            i = seekBar.getProgress();
        } else {
            i = 0;
        }
        this.LJJIJIIJI = i;
        if (!this.LJJIJIIJIL) {
            this.LJII.LJIIIZ(LJIIJJI(), null, "attach drag hint view");
            this.LJJIJIIJIL = true;
            Object value = this.LJIIJ.getValue();
            o.LJIIIIZZ(value, "<get-captionService>(...)");
            ICLACaptionService iCLACaptionService = (ICLACaptionService) value;
            if (seekBar != null) {
                context = seekBar.getContext();
            } else {
                context = null;
            }
            if (context instanceof ActivityC45651qj) {
                activityC45651qj = (ActivityC45651qj) context;
            }
            ViewGroup viewGroup = this.LIZIZ;
            IDR idr3 = this.LJIL;
            if (idr3 == null || (LJJLIIIIJ = idr3.getPlayerManager()) == null) {
                LJJLIIIIJ = IWF.LJJLIIIIJ();
            }
            iCLACaptionService.LJI(activityC45651qj, viewGroup, LJJLIIIIJ);
        }
        InterfaceC56460MDw interfaceC56460MDw = (InterfaceC56460MDw) this.LJIIJJI.getValue();
        if (interfaceC56460MDw != null) {
            interfaceC56460MDw.dR(LJIIIIZZ(this.LJJIJIIJI) * 1000);
        }
        if (LJIIL() && (idr = this.LJIL) != null) {
            idr.hideIvPlay();
        }
        if (seekBar != null) {
            this.LJJII = seekBar.getProgress();
        }
        IHZ ihz = this.LJII;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStartTrackingTouch, start progress=");
        LIZ.append(this.LJJII);
        ihz.LIZLLL(X1D.LIZIZ(LIZ));
        this.LJIILIIL.removeCallbacks(this.LJJJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0178 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
    @Override // X.InterfaceC56456MDs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStopTrackingTouch(android.widget.SeekBar r14) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56446MDi.onStopTrackingTouch(android.widget.SeekBar):void");
    }

    @QD3
    public final void onVideoEvent(C50420Jqa event) {
        C2KK c2kk;
        int i;
        C56457MDt c56457MDt;
        o.LJIIIZ(event, "event");
        int i2 = event.LJLIL;
        if (i2 != 72) {
            if (i2 != 76 || !C8OB.LIZ()) {
                return;
            }
            Object obj = event.LJLILLLLZI;
            if ((obj instanceof C56457MDt) && (c56457MDt = (C56457MDt) obj) != null) {
                boolean z = c56457MDt.LJLIL;
                VideoSeekBarMaskView videoSeekBarMaskView = this.LJFF;
                if (videoSeekBarMaskView != null) {
                    videoSeekBarMaskView.setDisableSeekTouch(z);
                }
                this.LIZ.setDisableSeekTouch(z);
                this.LJII.LJIIJ(new AqS24S0010000_9(z, 1));
                return;
            }
            return;
        }
        if (!AnonymousClass843.LIZ()) {
            return;
        }
        Object obj2 = event.LJLILLLLZI;
        if (!(obj2 instanceof C2KK) || (c2kk = (C2KK) obj2) == null) {
            return;
        }
        this.LJJIL = c2kk.LJLIL;
        C56448MDk c56448MDk = this.LIZ;
        if (LJII(this.LJIILJJIL)) {
            i = 0;
        } else {
            i = 8;
        }
        c56448MDk.setVisibility(i);
    }

    @QD3
    public final void onVideoMaskEvent(C8JF event) {
        String str;
        o.LJIIIZ(event, "event");
        String str2 = event.LJLILLLLZI;
        Aweme aweme = this.LJIILJJIL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(str2, str)) {
            this.LJII.LJIIJ(new AqS159S0100000_9(event, 843));
            LJIILL(event.LJLIL);
        }
        if (event.LJLJI) {
            LJIILL(true);
            LJIIIZ().LIZIZ();
        }
    }

    @QD3
    public final void onVideoProgressVolumeKeyEvent(C55392Loa event) {
        o.LJIIIZ(event, "event");
        if (LJIILIIL(event) && LJII(event.LJLIL) && this.LJJIIJ) {
            if (event.LJLJI) {
                this.LIZ.setVisibility(4);
            } else {
                this.LIZ.setVisibility(0);
            }
        }
    }

    public void LIZ(float f, boolean z) {
        float f2;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator alpha2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator alpha3;
        ViewPropertyAnimator duration3;
        this.LIZ.setSeekBarShowType(2);
        this.LJJIIJ = false;
        float f3 = (f / this.LJIIL) * 100.0f;
        Float mProgress = this.LIZ.getMProgress();
        if (mProgress != null) {
            f2 = mProgress.floatValue();
        } else {
            f2 = 0.0f;
        }
        float f4 = f2 + f3;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        } else if (f4 > 100.0f) {
            f4 = 100.0f;
        }
        this.LJIJI = true;
        this.LIZ.setProgress(f4);
        if (C54840Lfg.LJJZ(this.LJIILJJIL) && this.LIZIZ.getVisibility() != 0 && this.LIZ.getVisibility() == 0) {
            LJIIIZ().LJ();
            this.LIZIZ.setAlpha(0.0f);
            ViewPropertyAnimator animate = this.LIZIZ.animate();
            if (animate != null && (alpha3 = animate.alpha(1.0f)) != null && (duration3 = alpha3.setDuration(100L)) != null) {
                duration3.start();
            }
            this.LIZLLL.setAlpha(0.0f);
            ViewPropertyAnimator animate2 = this.LIZLLL.animate();
            if (animate2 != null && (alpha2 = animate2.alpha(1.0f)) != null && (duration2 = alpha2.setDuration(100L)) != null) {
                duration2.start();
            }
            this.LIZJ.setAlpha(0.0f);
            ViewPropertyAnimator animate3 = this.LIZJ.animate();
            if (animate3 != null && (alpha = animate3.alpha(1.0f)) != null && (duration = alpha.setDuration(100L)) != null) {
                duration.start();
            }
        }
        if (!this.LJIJ) {
            onStartTrackingTouch(this.LIZ.getMutableSeekBar());
        }
        this.LIZ.getMutableSeekBar();
        onProgressChanged((int) (f4 * 100.0f));
        if (z) {
            this.LJJIIJ = true;
            onStopTrackingTouch(this.LIZ.getMutableSeekBar());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(android.widget.SeekBar r11, X.C232719Bj r12) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56446MDi.LJIJI(android.widget.SeekBar, X.9Bj):void");
    }

    @Override // X.InterfaceC55370LoE
    public final void LJI(boolean z, Aweme aweme, ValueAnimator valueAnimator) {
        int i;
        this.LJIILJJIL = aweme;
        if (z && !LJII(aweme)) {
            return;
        }
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new AUListenerS97S0100000_9(this, 31));
            valueAnimator.addListener(new ALAdapterS2S0110000_9(this, z, 3));
            valueAnimator.start();
        } else {
            C56448MDk c56448MDk = this.LIZ;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            c56448MDk.setVisibility(i);
        }
    }

    public final void LJIIZILJ(Aweme aweme, int i, boolean z) {
        if (!LJII(aweme) || !z) {
            this.LJII.LJII(aweme, "updateSeekBarByPageChange can't show seekbar");
            this.LIZ.setVisibility(4);
            return;
        }
        if (i == 0) {
            this.LIZ.setVisibility(0);
            if (this.LJIJ) {
                LJIIIZ().LJ();
                return;
            }
        } else {
            this.LIZ.setVisibility(4);
        }
        LJIIIZ().LIZIZ();
    }

    @Override // X.C34N
    public final void LIZJ(Aweme aweme, long j, long j2, String eventType) {
        o.LJIIIZ(eventType, "eventType");
        LJIILLIIL(true, true, aweme, (((float) j2) / ((float) j)) * 100, eventType);
    }

    @Override // X.InterfaceC55370LoE
    public final void LJ(Aweme aweme, String str, String str2, int i) {
        LJIILJJIL(aweme);
        this.LJIILJJIL = aweme;
        this.LJJ = str;
        this.LJJIFFI = i;
        this.LJJI = str2;
        LJIJ();
    }

    public final void LJIILLIIL(boolean z, boolean z2, Aweme aweme, float f, String str) {
        String str2;
        this.LJJIJ = z;
        if (z2 && LJII(aweme) && !this.LJIJ) {
            if (this.LJIILLIIL == null && o.LJ(this.LJIILJJIL, aweme)) {
                LJIILJJIL(aweme);
            }
            if (LJIIL()) {
                int i = this.LJJIIZI + 1;
                this.LJJIIZI = i;
                if (i > 3) {
                    this.LJJIIZI = 0;
                    this.LIZ.setSeekBarShowType(LJIIJ());
                }
            }
            if (this.LJIJJLI == 0 || SystemClock.elapsedRealtime() > this.LJIJJLI + 600) {
                if (aweme != null) {
                    str2 = aweme.getAid();
                } else {
                    str2 = null;
                }
                IGZ.LIZ(str2, str, "seekBar_setProgress", f);
                this.LIZ.LIZIZ(f);
            }
        }
    }

    public C56446MDi(C56448MDk c56448MDk, ViewGroup viewGroup, C71898SJq c71898SJq, ImageView imageView, ScrollSwitchStateManager scrollSwitchStateManager, VideoSeekBarMaskView videoSeekBarMaskView) {
        ICastingPlayerService LIZLLL;
        this.LIZ = c56448MDk;
        this.LIZIZ = viewGroup;
        this.LIZJ = c71898SJq;
        this.LIZLLL = imageView;
        this.LJ = scrollSwitchStateManager;
        this.LJFF = videoSeekBarMaskView;
        IHZ ihz = new IHZ(LJIIJJI());
        this.LJII = ihz;
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 846));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 844));
        this.LJIIJ = C221108m2.LIZIZ(IQN.LJLIL);
        this.LJIIJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 845));
        this.LJIIL = KL2.LJIIJJI(c56448MDk.getContext());
        this.LJIILIIL = new Handler(C16880lQ.LLJJJJ());
        C221108m2.LIZIZ(new AqS159S0100000_9(this, 849));
        this.LJIILL = 1;
        this.LJJ = "";
        this.LJJI = "";
        this.LJJIFFI = -1;
        this.LJJIIJ = true;
        this.LJJIIZ = true;
        c56448MDk.setVisibility(8);
        c56448MDk.setOnSeekBarChangeListener(this);
        EventBus.LIZJ().LJIILJJIL(this);
        C56455MDr c56455MDr = new C56455MDr(viewGroup.findViewById(R.id.c11));
        new AqS175S0100000_9(this, 442).invoke(c56455MDr);
        C56455MDr c56455MDr2 = new C56455MDr(c71898SJq);
        C56454MDq action = C56454MDq.LJLIL;
        o.LJIIIZ(action, "action");
        action.invoke(c56455MDr2);
        C56455MDr c56455MDr3 = new C56455MDr(viewGroup.findViewById(R.id.lit));
        new AqS175S0100000_9(this, 444).invoke(c56455MDr3);
        C56455MDr c56455MDr4 = new C56455MDr(viewGroup.findViewById(R.id.c12));
        new AqS175S0100000_9(this, 446).invoke(c56455MDr4);
        C56455MDr c56455MDr5 = new C56455MDr(imageView);
        new AqS175S0100000_9(this, 448).invoke(c56455MDr5);
        C56455MDr c56455MDr6 = new C56455MDr(viewGroup.findViewById(R.id.b57));
        new AqS175S0100000_9(this, 449).invoke(c56455MDr6);
        this.LJJJ = new C40883G2t(new C56455MDr[]{new C56455MDr(viewGroup), c56455MDr, c56455MDr2, c56455MDr3, c56455MDr4, c56455MDr5, c56455MDr6});
        LJIIIZ().LIZIZ();
        C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
        if (c88545Yp3 != null && (LIZLLL = c88545Yp3.LIZLLL()) != null) {
            LIZLLL.addSeekListener(this);
        }
        ihz.LJIIIIZZ("video seekbar has been created");
        if (SeekBarEdgeOptiExp.INSTANCE.edgeOptimized()) {
            c56448MDk.setHorizontalMargin(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        }
        this.LJJJI = new ARunnableS45S0100000_9(this, 158);
    }
}
