package X;

import Y.ACListenerS29S0100000_9;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.experiments.LandscapeOptExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.MDj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C56447MDj implements InterfaceC56456MDs, InterfaceC2301191j {
    public final C56448MDk LIZ;
    public final ViewGroup LIZIZ;
    public final TuxTextView LIZJ;
    public final TuxTextView LIZLLL;
    public final TuxIconView LJ;
    public final ImageView LJFF;
    public final DataCenter LJII;
    public final Handler LJIIIZ;
    public Aweme LJIIJ;
    public Aweme LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public long LJIILLIIL;
    public IDR LJIIZILJ;
    public String LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public final boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public int LJJIFFI;
    public int LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public C73701SwD LJJIIZ;
    public C40883G2t LJJIIZI;
    public final ARunnableS45S0100000_9 LJJIJ;
    public final ScrollSwitchStateManager LJI = null;
    public final String LJIIIIZZ = "LandscapeCommonControl";

    public static int LIZJ() {
        C2308494e.LIZ.getClass();
        if (C2308494e.LIZIZ) {
            return 102;
        }
        return 100;
    }

    public final C40883G2t LIZIZ() {
        C40883G2t c40883G2t = this.LJJIIZI;
        if (c40883G2t != null) {
            return c40883G2t;
        }
        o.LJIJI("collaboratorContainer");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [X.Yns, X.Prl] */
    public final void LJI() {
        int i;
        int i2;
        Aweme aweme;
        Video video;
        Video video2;
        if (!this.LJIJJLI) {
            Context context = this.LIZ.getContext();
            o.LJIIIIZZ(context, "seekBar.context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null) {
                this.LJIJJLI = true;
                ScrollSwitchStateManager scrollSwitchStateManager = this.LJI;
                if (scrollSwitchStateManager != null) {
                    scrollSwitchStateManager.qv0(LJJIFFI, new AObserverS77S0100000_9(this, 113));
                }
                ScrollSwitchStateManager scrollSwitchStateManager2 = this.LJI;
                if (scrollSwitchStateManager2 != null) {
                    scrollSwitchStateManager2.LL.observe(LJJIFFI, new AObserverS77S0100000_9(this, 114));
                }
            }
        }
        this.LIZ.setProgress(0.0f);
        this.LIZ.setPageType(this.LJIJI);
        this.LIZJ.setText(C56451MDn.LIZ(0, false));
        TuxTextView tuxTextView = this.LIZLLL;
        Aweme aweme2 = this.LJIIJ;
        if (aweme2 != null && (video2 = aweme2.getVideo()) != null) {
            i = video2.getDuration();
        } else {
            i = 0;
        }
        tuxTextView.setText(C56451MDn.LIZ(C56451MDn.LIZJ(i), false));
        this.LIZ.setAlpha(1.0f);
        this.LIZ.setVisibility(0);
        String LIZLLL = LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("show progressbar:");
        Aweme aweme3 = this.LJIIJ;
        String str = null;
        if (aweme3 != null) {
            str = aweme3.getAid();
        }
        LIZ.append(str);
        C36922EeM.LIZLLL(6, LIZLLL, X1D.LIZIZ(LIZ));
        LIZIZ().LIZIZ();
        Aweme aweme4 = this.LJIIJ;
        if (aweme4 != null && (video = aweme4.getVideo()) != null) {
            i2 = video.getDuration();
        } else {
            i2 = 0;
        }
        this.LJIIL = C56451MDn.LIZJ(i2);
        Aweme aweme5 = this.LJIIJ;
        if ((aweme5 == null || C86670Xzu.LJIIIIZZ(aweme5) == null) && (aweme = this.LJIIJ) != null) {
            C86670Xzu.LJIIL(aweme);
        }
        for (C56455MDr c56455MDr : (C56455MDr[]) LIZIZ().LIZ) {
            ?? r1 = c56455MDr.LIZJ;
            if (r1 != 0) {
                r1.invoke(c56455MDr.LIZ);
            }
        }
        this.LIZ.LIZIZ(0.0f);
        this.LIZ.setSeekBarShowType(LIZJ());
    }

    public String LIZLLL() {
        return this.LJIIIIZZ;
    }

    public final void LJ(Aweme aweme) {
        String str;
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        Aweme aweme2 = this.LJIIJJI;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        }
        if (!TextUtils.equals(str, str2)) {
            this.LJIIJJI = aweme;
            LJI();
        }
    }

    @Override // X.InterfaceC2301191j
    public final void LLZL(Aweme aweme) {
        this.LJIIJ = aweme;
    }

    @QD3
    public final void onFullFeedFragmentPageStateChangeEvent(C2QA event) {
        o.LJIIIZ(event, "event");
        LJFF(event.LJLIL, event.LJLILLLLZI, true);
    }

    @QD3
    public final void onFullFeedVideoChangeEvent(C55391LoZ event) {
        o.LJIIIZ(event, "event");
        String str = event.LJLILLLLZI;
        if (str == null) {
            str = "";
        }
        this.LJIJ = str;
        this.LJIJI = event.LJLJI;
        this.LJIIZILJ = event.LJLJJI;
        this.LJIILL = 0;
        if (!this.LJIL) {
            this.LJJI = false;
        }
        if (o.LJ(this.LJIIJ, event.LJLIL) && !LandscapeOptExperiment.LIZIZ()) {
            LJI();
        }
    }

    @QD3
    public final void onPlayerControllerVideoPlayProgressChange(C46361IHl event) {
        o.LJIIIZ(event, "event");
        if (this.LJIILIIL || !o.LJ(this.LJIIJ, event.LJLIL)) {
            return;
        }
        if (this.LJIIJJI == null && o.LJ(this.LJIIJ, event.LJLIL)) {
            LJ(event.LJLIL);
        }
        if (this.LJIILL == 1) {
            int i = this.LJJIFFI + 1;
            this.LJJIFFI = i;
            if (i > 3) {
                this.LJJIFFI = 0;
                this.LIZ.setSeekBarShowType(LIZJ());
            }
        }
        if (this.LJIILLIIL == 0 || SystemClock.elapsedRealtime() > this.LJIILLIIL + 600) {
            float f = event.LJLJI;
            Aweme aweme = event.LJLIL;
            String str = null;
            if (aweme != null) {
                str = aweme.getAid();
            }
            IGZ.LIZ(str, event.LJLILLLLZI, "seekBar_setProgress", f);
            this.LIZ.LIZIZ(event.LJLJI);
            TuxTextView tuxTextView = this.LIZJ;
            if (!(tuxTextView instanceof TuxTextView) || tuxTextView == null) {
                return;
            }
            tuxTextView.setText(C56451MDn.LIZLLL(event.LJLJI, this.LJIIL));
        }
    }

    @QD3
    public final void onPlayerControllerVideoStatusEvent(C46288IEq event) {
        o.LJIIIZ(event, "event");
        if (!o.LJ(this.LJIIJ, event.LJLIL)) {
            return;
        }
        boolean z = event.LJLJJL;
        int i = event.LJLJI;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.LJIILL = 2;
            this.LIZ.setPauseStatus(false);
            if (this.LJIL && !this.LJJ) {
                this.LIZ.setSeekBarShowType(LIZJ());
            }
            this.LJ.setIconRes(R.raw.icon_pause_fill1);
            return;
        }
        if (z) {
            this.LIZ.setVisibility(0);
        }
        this.LJIILL = 1;
        this.LJJIFFI = 0;
        this.LIZ.setPauseStatus(true);
        this.LIZ.setSeekBarShowType(LIZJ());
        this.LJIIIZ.removeCallbacks(this.LJJIJ);
        this.LJJ = false;
        this.LJ.setIconRes(R.raw.icon_play_fill);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ynr, X.Prl] */
    @Override // X.InterfaceC56456MDs
    public final void onProgressChanged(int i) {
        if (this.LJIILIIL) {
            for (C56455MDr c56455MDr : (C56455MDr[]) LIZIZ().LIZ) {
                ?? r2 = c56455MDr.LIZIZ;
                if (r2 != 0) {
                    r2.invoke(Integer.valueOf(i), c56455MDr.LIZ);
                }
            }
        }
    }

    @QD3
    public final void onRenderFirstFrame(C46272IEa event) {
        o.LJIIIZ(event, "event");
        LJ(event.LJLIL);
        LJI();
    }

    @Override // X.InterfaceC56456MDs
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i;
        IDR idr;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator alpha2;
        ViewPropertyAnimator duration2;
        this.LJIILJJIL = true;
        if (!this.LJJIII) {
            C2U8.LIZ(new C51689KQj(true, this.LJIIJ, this.LJIIZILJ));
            this.LJJIII = true;
        }
        if (C54840Lfg.LJJZ(this.LJIIJ) && this.LIZIZ.getVisibility() != 0 && this.LIZ.getVisibility() == 0) {
            LIZIZ().LJ();
            this.LIZIZ.setAlpha(0.0f);
            ViewPropertyAnimator animate = this.LIZIZ.animate();
            if (animate != null && (alpha2 = animate.alpha(1.0f)) != null && (duration2 = alpha2.setDuration(200L)) != null) {
                duration2.start();
            }
            this.LJFF.setAlpha(0.0f);
            ViewPropertyAnimator animate2 = this.LJFF.animate();
            if (animate2 != null && (alpha = animate2.alpha(1.0f)) != null && (duration = alpha.setDuration(200L)) != null) {
                duration.start();
            }
        }
        this.LJIILIIL = true;
        if (seekBar != null) {
            i = seekBar.getProgress();
        } else {
            i = 0;
        }
        this.LJJII = i;
        if (this.LJIILL == 1 && (idr = this.LJIIZILJ) != null) {
            idr.hideIvPlay();
        }
        if (seekBar != null) {
            this.LJIJJ = seekBar.getProgress();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0223, code lost:
    
        if (r2 == null) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    @Override // X.InterfaceC56456MDs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStopTrackingTouch(android.widget.SeekBar r11) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56447MDj.onStopTrackingTouch(android.widget.SeekBar):void");
    }

    @QD3
    public final void onVideoBufferProgressChange(C46261IDp event) {
        o.LJIIIZ(event, "event");
        C2308494e.LIZ.getClass();
        if (!C2308494e.LIZIZ || !o.LJ(this.LJIIJ, event.LJLIL)) {
            return;
        }
        if (this.LJJIIJZLJL) {
            this.LJJIIJZLJL = false;
        } else {
            this.LIZ.setSecondaryProgress((int) event.LJLILLLLZI);
        }
    }

    @QD3
    public final void onVideoMaskEvent(C8JF event) {
        String str;
        o.LJIIIZ(event, "event");
        String str2 = event.LJLILLLLZI;
        Aweme aweme = this.LJIIJ;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(str2, str)) {
            if (event.LJLIL) {
                C56448MDk c56448MDk = this.LIZ;
                C178596zf.LIZ(c56448MDk.getAlpha(), 0.0f, c56448MDk);
            } else {
                C178596zf.LIZ(0.0f, 1.0f, this.LIZ);
            }
        }
        if (event.LJLJI) {
            C56448MDk c56448MDk2 = this.LIZ;
            C178596zf.LIZ(c56448MDk2.getAlpha(), 0.0f, c56448MDk2);
            LIZIZ().LIZIZ();
        }
    }

    @QD3
    public final void onVideoProgressVolumeKeyEvent(C55392Loa event) {
        o.LJIIIZ(event, "event");
        if (this.LJIL) {
            if (event.LJLJI) {
                this.LIZ.setVisibility(4);
            } else {
                this.LIZ.setVisibility(0);
            }
        }
    }

    @Override // X.InterfaceC2301191j
    public final void LIZ(float f, boolean z) {
        int i;
        float f2;
        C81238VuU mutableSeekBar;
        if (!this.LJJIII) {
            C2U8.LIZ(new C51689KQj(true, this.LJIIJ, this.LJIIZILJ));
            this.LJJIII = true;
        }
        this.LJJIIJ = false;
        C56448MDk c56448MDk = this.LIZ;
        C2308494e.LIZ.getClass();
        if (C2308494e.LIZIZ) {
            i = 102;
        } else {
            i = 101;
        }
        c56448MDk.setSeekBarShowType(i);
        float LJIIJJI = (f / KL2.LJIIJJI(this.LIZ.getContext())) * 100.0f;
        C56448MDk c56448MDk2 = this.LIZ;
        float f3 = 0.0f;
        if (c56448MDk2 != null && (mutableSeekBar = c56448MDk2.getMutableSeekBar()) != null) {
            f2 = mutableSeekBar.getProgress() / 100.0f;
        } else {
            f2 = 0.0f;
        }
        float f4 = f2 + LJIIJJI;
        if (f4 >= 0.0f) {
            if (f4 > 100.0f) {
                f3 = 100.0f;
            } else {
                f3 = f4;
            }
        }
        this.LIZ.setProgress(f3);
        if (!this.LJIILIIL) {
            onStartTrackingTouch(this.LIZ.getMutableSeekBar());
        }
        this.LIZ.getMutableSeekBar();
        onProgressChanged((int) (f3 * 100.0f));
        if (z) {
            onStopTrackingTouch(this.LIZ.getMutableSeekBar());
            this.LJJIIJ = true;
        }
    }

    public final void LJFF(Aweme aweme, int i, boolean z) {
        if (!z) {
            this.LIZ.setVisibility(4);
            return;
        }
        if (i == 0) {
            this.LIZ.setVisibility(0);
            this.LJIILL = 2;
            if (this.LJIILIIL) {
                LIZIZ().LJ();
                return;
            }
        } else {
            this.LIZ.setVisibility(4);
        }
        LIZIZ().LIZIZ();
    }

    public C56447MDj(C56448MDk c56448MDk, ViewGroup viewGroup, TuxTextView tuxTextView, TuxTextView tuxTextView2, TuxIconView tuxIconView, ImageView imageView, DataCenter dataCenter) {
        this.LIZ = c56448MDk;
        this.LIZIZ = viewGroup;
        this.LIZJ = tuxTextView;
        this.LIZLLL = tuxTextView2;
        this.LJ = tuxIconView;
        this.LJFF = imageView;
        this.LJII = dataCenter;
        C56449MDl c56449MDl = (C56449MDl) this;
        C221108m2.LIZIZ(new AqS159S0100000_9(c56449MDl, 1002));
        C221108m2.LIZIZ(new AqS159S0100000_9(c56449MDl, 1001));
        C221108m2.LIZIZ(IQO.LJLIL);
        this.LJIIIZ = new Handler(C16880lQ.LLJJJJ());
        C221108m2.LIZIZ(new AqS159S0100000_9(c56449MDl, 1004));
        this.LJIJ = "";
        this.LJIJI = -1;
        this.LJIL = true;
        this.LJJI = true;
        this.LJJIIJ = true;
        c56448MDk.setOnSeekBarChangeListener(this);
        EventBus.LIZJ().LJIILJJIL(this);
        C16880lQ.LJJJ(tuxIconView, new ACListenerS29S0100000_9(c56449MDl, 174));
        C56455MDr c56455MDr = new C56455MDr(viewGroup.findViewById(R.id.c11));
        new AqS175S0100000_9(c56449MDl, 593).invoke(c56455MDr);
        C56455MDr c56455MDr2 = new C56455MDr(viewGroup.findViewById(R.id.lit));
        new AqS175S0100000_9(c56449MDl, 595).invoke(c56455MDr2);
        C56455MDr c56455MDr3 = new C56455MDr(viewGroup.findViewById(R.id.c12));
        new AqS175S0100000_9(c56449MDl, 596).invoke(c56455MDr3);
        C56455MDr c56455MDr4 = new C56455MDr(imageView);
        new AqS175S0100000_9(c56449MDl, 598).invoke(c56455MDr4);
        this.LJJIIZI = new C40883G2t(new C56455MDr[]{new C56455MDr(viewGroup), c56455MDr, c56455MDr2, c56455MDr3, c56455MDr4});
        LIZIZ().LIZIZ();
        this.LJJIJ = new ARunnableS45S0100000_9(c56449MDl, 222);
    }
}
