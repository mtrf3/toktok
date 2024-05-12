package X;

import Y.ARunnableS49S0100000_13;
import Y.IDAListenerS237S0100000_13;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardAssem;
import com.ss.android.ugc.aweme.relation.experiment.RecMoreExperiment;
import kotlin.jvm.internal.o;

/* renamed from: X.UuK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78680UuK extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoUserCardAssem, Boolean, C76800UCe> {
    public static final C78680UuK LJLIL = new C78680UuK();

    public C78680UuK() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoUserCardAssem videoUserCardAssem, Boolean bool) {
        boolean z;
        Integer num;
        VideoUserCardAssem selectSubscribe = videoUserCardAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set isVisible: ");
        LIZ.append(booleanValue);
        C221018lt.LJFF("VideoRecUser", X1D.LIZIZ(LIZ));
        int i = 0;
        if (selectSubscribe.Y3().getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z != booleanValue) {
            selectSubscribe.Y3().clearAnimation();
            if (booleanValue) {
                AnimationSet animationSet = new AnimationSet(false);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setDuration(100L);
                alphaAnimation.setInterpolator(VideoUserCardAssem.LLIIII);
                animationSet.addAnimation(alphaAnimation);
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.06f, 1, 0.0f);
                translateAnimation.setFillEnabled(true);
                translateAnimation.setFillAfter(true);
                translateAnimation.setDuration(300L);
                translateAnimation.setInterpolator(C55953Lxd.LIZIZ());
                animationSet.addAnimation(translateAnimation);
                animationSet.setAnimationListener(new IDAListenerS237S0100000_13(selectSubscribe, 2));
                animationSet.setFillAfter(true);
                selectSubscribe.Y3().startAnimation(animationSet);
                selectSubscribe.q4(true, true);
                RecMoreExperiment.VideoStrategy videoStrategy = RecMoreExperiment.LJI().videoStrategy;
                if (videoStrategy != null && (num = videoStrategy.maxShowCount) != null) {
                    int intValue = num.intValue();
                    Keva keva = RecMoreExperiment.LIZJ;
                    int i2 = keva.getInt(RecMoreExperiment.LJFF(), 0) + 1;
                    if (i2 >= intValue) {
                        C221018lt.LJFF("RecMore", "record video, limit max show cnt!");
                        keva.storeInt(RecMoreExperiment.LJ(), SU4.LIZ(System.currentTimeMillis()));
                    } else {
                        i = i2;
                    }
                    keva.storeInt(RecMoreExperiment.LJFF(), i);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("record video, rec user show! cnt: ");
                    LIZ2.append(i);
                    C221018lt.LJFF("RecMore", X1D.LIZIZ(LIZ2));
                }
            } else {
                selectSubscribe.Y3().animate().alpha(0.0f).setDuration(150L).setInterpolator(VideoUserCardAssem.LLIIII).withEndAction(new ARunnableS49S0100000_13(selectSubscribe, 79)).start();
            }
        }
        return C76800UCe.LIZ;
    }
}
