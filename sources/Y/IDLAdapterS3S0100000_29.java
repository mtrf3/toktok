package Y;

import X.C51029K0z;
import X.C91249ZrZ;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.seekbar.AudioSeekBarAssem;
import com.ss.android.ugc.aweme.dsp.ugcCollect.MusicDspUGCButtonAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public class IDLAdapterS3S0100000_29 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

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
                onAnimationStart$2(this, animator);
                return;
            case 3:
                onAnimationStart$3(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public IDLAdapterS3S0100000_29(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationStart$0(IDLAdapterS3S0100000_29 iDLAdapterS3S0100000_29, Animator animation) {
        o.LJIIIZ(animation, "animation");
        LinearLayout linearLayout = ((AudioSeekBarAssem) iDLAdapterS3S0100000_29.l0).LLIIL;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = ((AudioSeekBarAssem) iDLAdapterS3S0100000_29.l0).LLIIL;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setAlpha(0.0f);
    }

    public static final void onAnimationStart$1(IDLAdapterS3S0100000_29 iDLAdapterS3S0100000_29, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0).Y3().setAlpha(1.0f);
        LinearLayout linearLayout = ((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0).LLFZ;
        if (linearLayout != null) {
            linearLayout.setAlpha(1.0f);
        }
        TuxIconView tuxIconView = ((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0).LLIFFJFJJ;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(0);
        }
        TuxIconView tuxIconView2 = ((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0).LLIFFJFJJ;
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(R.raw.icon_bookmark);
        }
        TuxIconView tuxIconView3 = ((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0).LLII;
        if (tuxIconView3 != null) {
            tuxIconView3.setVisibility(8);
        }
        TuxTextView tuxTextView = ((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0).LLI;
        if (tuxTextView != null) {
            tuxTextView.setText(R.string.igq);
        }
    }

    public static final void onAnimationStart$2(IDLAdapterS3S0100000_29 iDLAdapterS3S0100000_29, Animator animation) {
        o.LJIIIZ(animation, "animation");
        LinearLayout linearLayout = ((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0).LLFZ;
        if (linearLayout != null) {
            linearLayout.setAlpha(1.0f);
        }
        TuxIconView tuxIconView = ((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0).LLIFFJFJJ;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(0);
        }
        TuxIconView tuxIconView2 = ((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0).LLIFFJFJJ;
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(R.raw.icon_bookmark_fill);
        }
        TuxIconView tuxIconView3 = ((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0).LLII;
        if (tuxIconView3 != null) {
            tuxIconView3.setVisibility(8);
        }
        TuxTextView tuxTextView = ((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0).LLI;
        if (tuxTextView != null) {
            tuxTextView.setText(R.string.igr);
        }
        C91249ZrZ.LJIIL("added_to_favorite", ((VideoItemParams) C51029K0z.LJIILLIIL((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0)).getAweme().getAid(), ((VideoItemParams) C51029K0z.LJIILLIIL((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0)).mRequestId.optString("request_id"), null, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
    }

    public static final void onAnimationStart$3(IDLAdapterS3S0100000_29 iDLAdapterS3S0100000_29, Animator animation) {
        o.LJIIIZ(animation, "animation");
        TuxTextView tuxTextView = ((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0).LLI;
        if (tuxTextView != null) {
            tuxTextView.setAlpha(1.0f);
        }
        TuxIconView tuxIconView = ((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0).LLIFFJFJJ;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
        }
        TuxIconView tuxIconView2 = ((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0).LLII;
        if (tuxIconView2 != null) {
            tuxIconView2.setVisibility(0);
        }
        TuxTextView tuxTextView2 = ((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0).LLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(R.string.ihi);
        }
        C91249ZrZ.LJIIL("play_favorite_song", ((VideoItemParams) C51029K0z.LJIILLIIL((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0)).getAweme().getAid(), ((VideoItemParams) C51029K0z.LJIILLIIL((MusicDspUGCButtonAssem) iDLAdapterS3S0100000_29.l0)).mRequestId.optString("request_id"), null, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
    }
}
