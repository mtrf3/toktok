package Y;

import X.C27740Aue;
import X.C56446MDi;
import X.C57186McQ;
import X.C57191McV;
import X.MQH;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.notification.creator.assem.CreatorResultLoadingStatusAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ALAdapterS2S0110000_9 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 1:
                onAnimationCancel$1(this, animator);
                return;
            case 2:
                onAnimationCancel$2(this, animator);
                return;
            case 3:
            default:
                super.onAnimationCancel(animator);
                return;
            case 4:
                onAnimationCancel$3(this, animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
                onAnimationStart$1(this, animator);
                return;
            case 2:
            default:
                super.onAnimationStart(animator);
                return;
            case 3:
                onAnimationStart$2(this, animator);
                return;
            case 4:
                onAnimationStart$3(this, animator);
                return;
        }
    }

    public ALAdapterS2S0110000_9(C57191McV c57191McV, int i) {
        this.$t = i;
        this.l0 = c57191McV;
    }

    public static final void onAnimationCancel$0(ALAdapterS2S0110000_9 aLAdapterS2S0110000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((VideoMusicCoverAssem) aLAdapterS2S0110000_9.l0).getClass();
    }

    public static final void onAnimationCancel$1(ALAdapterS2S0110000_9 aLAdapterS2S0110000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!aLAdapterS2S0110000_9.z1) {
            ((CreatorResultLoadingStatusAssem) aLAdapterS2S0110000_9.l0).A3().setVisibility(8);
        }
        ((CreatorResultLoadingStatusAssem) aLAdapterS2S0110000_9.l0).LJLJL = null;
    }

    public static final void onAnimationCancel$2(ALAdapterS2S0110000_9 aLAdapterS2S0110000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        aLAdapterS2S0110000_9.z1 = true;
    }

    public static final void onAnimationCancel$3(ALAdapterS2S0110000_9 aLAdapterS2S0110000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!aLAdapterS2S0110000_9.z1) {
            ((MQH) aLAdapterS2S0110000_9.l0).LJIILJJIL().setVisibility(8);
        }
        ((MQH) aLAdapterS2S0110000_9.l0).LJLJL = null;
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0110000_9 aLAdapterS2S0110000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (aLAdapterS2S0110000_9.z1) {
            Keva.getRepo("music_marquee_strategy_repo").storeInt(C57186McQ.LIZ("key_music_cover_animation_count"), Keva.getRepo("music_marquee_strategy_repo").getInt(C57186McQ.LIZ("key_music_cover_animation_count"), 0) + 1);
            Keva.getRepo("music_marquee_strategy_repo").storeLong(C57186McQ.LIZ("key_music_cover_animation_show_time"), System.currentTimeMillis());
        }
        ((VideoMusicCoverAssem) aLAdapterS2S0110000_9.l0).getClass();
        VideoMusicCoverAssem videoMusicCoverAssem = (VideoMusicCoverAssem) aLAdapterS2S0110000_9.l0;
        if (!videoMusicCoverAssem.LLIZLLLIL) {
            videoMusicCoverAssem.LLIZ = false;
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS2S0110000_9 aLAdapterS2S0110000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!aLAdapterS2S0110000_9.z1) {
            ((CreatorResultLoadingStatusAssem) aLAdapterS2S0110000_9.l0).A3().setVisibility(8);
        }
        ((CreatorResultLoadingStatusAssem) aLAdapterS2S0110000_9.l0).LJLJL = null;
    }

    public static final void onAnimationEnd$2(ALAdapterS2S0110000_9 aLAdapterS2S0110000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!aLAdapterS2S0110000_9.z1) {
            C27740Aue.LJIIIZ(4, ((C57191McV) aLAdapterS2S0110000_9.l0).getNumberText());
        }
        ((C57191McV) aLAdapterS2S0110000_9.l0).getNumberText().setAlpha(1.0f);
    }

    public static final void onAnimationEnd$3(ALAdapterS2S0110000_9 aLAdapterS2S0110000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (!aLAdapterS2S0110000_9.z1) {
            ((C56446MDi) aLAdapterS2S0110000_9.l0).LIZ.setVisibility(8);
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS2S0110000_9 aLAdapterS2S0110000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!aLAdapterS2S0110000_9.z1) {
            ((MQH) aLAdapterS2S0110000_9.l0).LJIILJJIL().setVisibility(8);
        }
        ((MQH) aLAdapterS2S0110000_9.l0).LJLJL = null;
    }

    public static final void onAnimationStart$0(ALAdapterS2S0110000_9 aLAdapterS2S0110000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        VideoMusicCoverAssem videoMusicCoverAssem = (VideoMusicCoverAssem) aLAdapterS2S0110000_9.l0;
        videoMusicCoverAssem.LLILZ = false;
        videoMusicCoverAssem.getClass();
    }

    public static final void onAnimationStart$1(ALAdapterS2S0110000_9 aLAdapterS2S0110000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS2S0110000_9.z1) {
            ((CreatorResultLoadingStatusAssem) aLAdapterS2S0110000_9.l0).A3().setVisibility(0);
            ((CreatorResultLoadingStatusAssem) aLAdapterS2S0110000_9.l0).A3().LJFF();
        }
    }

    public static final void onAnimationStart$2(ALAdapterS2S0110000_9 aLAdapterS2S0110000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        if (aLAdapterS2S0110000_9.z1) {
            ((C56446MDi) aLAdapterS2S0110000_9.l0).LIZ.setVisibility(0);
        }
    }

    public static final void onAnimationStart$3(ALAdapterS2S0110000_9 aLAdapterS2S0110000_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (aLAdapterS2S0110000_9.z1) {
            ((MQH) aLAdapterS2S0110000_9.l0).LJIILJJIL().setVisibility(0);
            ((MQH) aLAdapterS2S0110000_9.l0).LJIILJJIL().LJFF();
        }
    }

    public ALAdapterS2S0110000_9(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
