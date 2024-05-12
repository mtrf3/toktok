package X;

import Y.IDAListenerS83S0100000_29;
import Y.IDLAdapterS3S0100000_29;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.ss.android.ugc.aweme.dsp.ugcCollect.MusicDspUGCButtonAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Zwg, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91566Zwg extends AbstractC65781Prl implements InterfaceC88471Ynr<MusicDspUGCButtonAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C91566Zwg LJLIL = new C91566Zwg();

    public C91566Zwg() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(MusicDspUGCButtonAssem musicDspUGCButtonAssem, C43I<? extends Boolean> c43i) {
        MusicDspUGCButtonAssem selectSubscribe = musicDspUGCButtonAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && o.LJ(c43i2.LIZ(), Boolean.TRUE)) {
            Animator animator = selectSubscribe.LLIIIL;
            if (animator == null || !animator.isRunning()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(selectSubscribe.Y3(), "alpha", 1.0f, 0.75f);
                ofFloat.setDuration(100L);
                ofFloat.addListener(new IDLAdapterS3S0100000_29(selectSubscribe, 1));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(selectSubscribe.LLFZ, "alpha", 1.0f, 0.0f);
                ofFloat2.setDuration(50L);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(selectSubscribe.LLFZ, "alpha", 0.0f, 1.0f);
                ofFloat3.setDuration(50L);
                ofFloat3.addListener(new IDLAdapterS3S0100000_29(selectSubscribe, 2));
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(selectSubscribe.Y3(), "alpha", 0.75f, 1.0f);
                ofFloat4.setDuration(50L);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(selectSubscribe.Y3(), "alpha", 1.0f, 0.75f);
                ofFloat5.setDuration(100L);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(selectSubscribe.LLFZ, "alpha", 1.0f, 0.0f);
                ofFloat6.setDuration(50L);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(selectSubscribe.LLFZ, "alpha", 0.0f, 1.0f);
                ofFloat7.setDuration(50L);
                ofFloat7.addListener(new IDLAdapterS3S0100000_29(selectSubscribe, 3));
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(selectSubscribe.Y3(), "alpha", 0.75f, 1.0f);
                ofFloat8.setDuration(50L);
                AnimatorSet animatorSet = new AnimatorSet();
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ofFloat3, ofFloat4);
                animatorSet.playSequentially(ofFloat, ofFloat2, animatorSet2);
                AnimatorSet animatorSet3 = new AnimatorSet();
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ofFloat7, ofFloat8);
                animatorSet3.playSequentially(ofFloat5, ofFloat6, animatorSet4);
                animatorSet3.setStartDelay(1000L);
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playSequentially(animatorSet, animatorSet3);
                selectSubscribe.LLIIIL = animatorSet5;
                animatorSet5.addListener(new IDAListenerS83S0100000_29(selectSubscribe, 7));
                Animator animator2 = selectSubscribe.LLIIIL;
                if (animator2 != null) {
                    animator2.start();
                }
            }
        } else {
            selectSubscribe.r4();
        }
        return C76800UCe.LIZ;
    }
}
