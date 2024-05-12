package Y;

import X.C174596tD;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ALAdapterS1S0201000_3 extends AnimatorListenerAdapter {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationStart$0(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0201000_3 aLAdapterS1S0201000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C174596tD) aLAdapterS1S0201000_3.l0).LIZ();
        ViewGroup.LayoutParams layoutParams = ((ViewGroup) aLAdapterS1S0201000_3.l1).getLayoutParams();
        layoutParams.height = aLAdapterS1S0201000_3.i2;
        ((ViewGroup) aLAdapterS1S0201000_3.l1).setLayoutParams(layoutParams);
        ((ViewGroup) aLAdapterS1S0201000_3.l1).setAlpha(1.0f);
        SmartImageView smartImageView = ((C174596tD) aLAdapterS1S0201000_3.l0).LJI;
        if (smartImageView == null) {
            return;
        }
        smartImageView.setAlpha(1.0f);
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0201000_3 aLAdapterS1S0201000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((VideoExposeSharerInformationAssem) aLAdapterS1S0201000_3.l0).Y3().findViewById(R.id.m71).setVisibility(8);
        ((VideoExposeSharerInformationAssem) aLAdapterS1S0201000_3.l0).Y3().findViewById(R.id.m71).setAlpha(1.0f);
        ((VideoExposeSharerInformationAssem) aLAdapterS1S0201000_3.l0).u4(aLAdapterS1S0201000_3.i2, true);
        ((ObjectAnimator) aLAdapterS1S0201000_3.l1).start();
    }

    public static final void onAnimationStart$0(ALAdapterS1S0201000_3 aLAdapterS1S0201000_3, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((VideoExposeSharerInformationAssem) aLAdapterS1S0201000_3.l0).Y3().findViewById(R.id.m71).setVisibility(0);
    }

    public ALAdapterS1S0201000_3(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
