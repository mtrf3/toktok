package X;

import Y.IDLAdapterS3S0100000_29;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.seekbar.AudioSeekBarAssem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ZpU, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91120ZpU implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ AudioSeekBarAssem LJLIL;

    public C91120ZpU(AudioSeekBarAssem audioSeekBarAssem) {
        this.LJLIL = audioSeekBarAssem;
    }

    public final void LIZ(boolean z) {
        int i;
        int i2;
        Integer num;
        UrlModel urlModel;
        List<String> urlList;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        View view = this.LJLIL.LLIL;
        if (view != null) {
            view.setVisibility(i);
        }
        FrameLayout frameLayout = this.LJLIL.LLILII;
        if (frameLayout != null) {
            frameLayout.setVisibility(i);
        }
        TuxIconView tuxIconView = this.LJLIL.LLILIL;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(i);
        }
        C91395Ztv c91395Ztv = this.LJLIL.LLILZLL;
        if (c91395Ztv != null && (urlModel = c91395Ztv.LJLJLJ) != null && (urlList = urlModel.getUrlList()) != null && (!urlList.isEmpty())) {
            SmartAvatarImageView smartAvatarImageView = this.LJLIL.LLILL;
            if (smartAvatarImageView != null) {
                smartAvatarImageView.setVisibility(i);
            }
        } else {
            SmartAvatarImageView smartAvatarImageView2 = this.LJLIL.LLILL;
            if (smartAvatarImageView2 != null) {
                smartAvatarImageView2.setVisibility(8);
            }
        }
        TuxTextView tuxTextView = this.LJLIL.LLILLIZIL;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(i);
        }
        FrameLayout frameLayout2 = this.LJLIL.LLILLJJLI;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(i);
        }
        this.LJLIL.q4(i);
        this.LJLIL.m4(i);
        if (z) {
            AudioSeekBarAssem audioSeekBarAssem = this.LJLIL;
            View g4 = audioSeekBarAssem.g4();
            if (g4 != null) {
                i2 = g4.getVisibility();
            } else {
                i2 = 8;
            }
            audioSeekBarAssem.LLIFFJFJJ = i2;
            View g42 = this.LJLIL.g4();
            if (g42 != null) {
                g42.setVisibility(8);
            }
            AudioSeekBarAssem audioSeekBarAssem2 = this.LJLIL;
            View k4 = audioSeekBarAssem2.k4();
            if (k4 != null) {
                num = Integer.valueOf(k4.getVisibility());
            } else {
                num = null;
            }
            audioSeekBarAssem2.LLJ = num;
            View k42 = this.LJLIL.k4();
            if (k42 == null) {
                return;
            }
            k42.setVisibility(8);
            return;
        }
        View g43 = this.LJLIL.g4();
        if (g43 != null) {
            g43.setVisibility(this.LJLIL.LLIFFJFJJ);
        }
        AudioSeekBarAssem audioSeekBarAssem3 = this.LJLIL;
        Integer num2 = audioSeekBarAssem3.LLJ;
        if (num2 == null) {
            return;
        }
        int intValue = num2.intValue();
        View k43 = audioSeekBarAssem3.k4();
        if (k43 == null) {
            return;
        }
        k43.setVisibility(intValue);
    }

    public final void LIZIZ(boolean z) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        if (z) {
            LinearLayout linearLayout = this.LJLIL.LLIIL;
            if (linearLayout != null && (animate = linearLayout.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(200L)) != null && (listener = duration.setListener(new IDLAdapterS3S0100000_29(this.LJLIL, 0))) != null) {
                listener.start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.LJLIL.LLIIL;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setVisibility(8);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        o.LJIIIZ(seekBar, "seekBar");
        AudioSeekBarAssem audioSeekBarAssem = this.LJLIL;
        audioSeekBarAssem.LLFZ = true;
        audioSeekBarAssem.LLIIII = false;
        C91476ZvE c91476ZvE = audioSeekBarAssem.LLIIIL;
        if (c91476ZvE != null) {
            c91476ZvE.removeCallbacks(audioSeekBarAssem.LLIIIILZ);
        }
        C91476ZvE c91476ZvE2 = this.LJLIL.LLIIIL;
        if (c91476ZvE2 != null) {
            c91476ZvE2.setMode(EnumC91326Zso.DRAGGING);
        }
        LIZ(true);
        LIZIZ(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r1 == null) goto L18;
     */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopTrackingTouch(android.widget.SeekBar r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.seekbar.AudioSeekBarAssem r1 = r7.LJLIL
            boolean r0 = r1.LLFZ
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L51
            X.ZvE r0 = r1.LLIIIL
            if (r0 == 0) goto L51
            boolean r0 = r0.getHasMove()
            if (r0 != r5) goto L51
            if (r8 == 0) goto L51
            int r0 = r8.getProgress()
            long r1 = (long) r0
            com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.seekbar.AudioSeekBarAssem r6 = r7.LJLIL
            X.Ztv r3 = r6.LLILZLL
            int r0 = (int) r1
            boolean r0 = com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.seekbar.AudioSeekBarAssem.l4(r0, r3)
            if (r0 != 0) goto L26
            r6.LLFII = r1
        L26:
            com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility r0 = X.C91264Zro.LIZJ(r6)
            if (r0 == 0) goto L86
            X.Zx4 r3 = r0.HS()
            if (r3 == 0) goto L3d
            X.ZxJ r0 = r3.LJLILLLLZI
            r0.LJJI(r1)
            X.ZsY r1 = r3.LJIJI()
            if (r1 != 0) goto L3f
        L3d:
            X.ZsY r1 = X.EnumC91310ZsY.PLAYBACK_STATE_STOPPED
        L3f:
            boolean r0 = r1.isPauseState()
            java.lang.String r2 = "RESUME_FROM_SEEK"
            if (r0 == 0) goto L74
            if (r3 == 0) goto L51
            X.ZsN r0 = new X.ZsN
            r0.<init>(r2)
            r3.LJJ(r0)
        L51:
            com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.seekbar.AudioSeekBarAssem r0 = r7.LJLIL
            r0.LLFZ = r4
            r0.LLIIII = r5
            X.ZvE r1 = r0.LLIIIL
            if (r1 == 0) goto L60
            java.lang.Runnable r0 = r0.LLIIIILZ
            r1.removeCallbacks(r0)
        L60:
            com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.seekbar.AudioSeekBarAssem r0 = r7.LJLIL
            X.ZvE r3 = r0.LLIIIL
            if (r3 == 0) goto L6d
            java.lang.Runnable r2 = r0.LLIIIILZ
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r2, r0)
        L6d:
            r7.LIZ(r4)
            r7.LIZIZ(r4)
            return
        L74:
            boolean r0 = r1.isStopState()
            if (r0 == 0) goto L51
            if (r3 == 0) goto L51
            X.ZsN r1 = new X.ZsN
            r1.<init>(r2)
            r0 = 2
            X.C91287ZsB.LIZ(r3, r1, r0)
            goto L51
        L86:
            r3 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91120ZpU.onStopTrackingTouch(android.widget.SeekBar):void");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C91476ZvE c91476ZvE;
        AudioSeekBarAssem audioSeekBarAssem = this.LJLIL;
        if (audioSeekBarAssem.LLFZ && (c91476ZvE = audioSeekBarAssem.LLIIIL) != null && c91476ZvE.getHasMove()) {
            this.LJLIL.n4(i);
        }
    }
}
