package X;

import Y.IDAListenerS2S0110000_4;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.APt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26193APt {
    public AnimatorSet LIZ;
    public AnimatorSet LIZIZ;
    public AnimatorSet LIZJ;
    public AnimatorSet LIZLLL;

    public static AnimatorSet LIZIZ(View centerView) {
        o.LJIIIZ(centerView, "centerView");
        float alpha = centerView.getAlpha();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(centerView, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.setStartDelay(500L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(centerView, "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(200L);
        ofFloat2.setStartDelay(4400L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new C26199APz(centerView, alpha));
        animatorSet.addListener(new AQ0(centerView, alpha));
        return animatorSet;
    }

    public static void LIZ(SmartAvatarImageView smartAvatarImageView, ArrayList arrayList, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(smartAvatarImageView, "alpha", 0.0f, 1.0f);
        ofFloat.setStartDelay(1700L);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(C55953Lxd.LJ());
        arrayList.add(ofFloat);
        ofFloat.addListener(new IDAListenerS2S0110000_4(smartAvatarImageView, z, 1));
    }
}
