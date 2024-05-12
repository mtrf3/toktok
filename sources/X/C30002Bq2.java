package X;

import Y.ALAdapterS4S0200000_5;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.Bq2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30002Bq2 {
    public final ImageView LIZ;
    public final C30020BqK LIZIZ;
    public final C30020BqK LIZJ;
    public final PropertyValuesHolder LIZLLL;
    public final PropertyValuesHolder LJ;
    public final AnimatorSet LJFF;
    public final /* synthetic */ C30003Bq3 LJI;

    public C30002Bq2(C30003Bq3 c30003Bq3) {
        this.LJI = c30003Bq3;
        ImageView imageView = new ImageView(c30003Bq3.getContext());
        this.LIZ = imageView;
        C30020BqK c30020BqK = new C30020BqK();
        this.LIZIZ = c30020BqK;
        C30020BqK c30020BqK2 = new C30020BqK();
        this.LIZJ = c30020BqK2;
        Property property = FrameLayout.X;
        Float valueOf = Float.valueOf(0.0f);
        PropertyValuesHolder ofObject = PropertyValuesHolder.ofObject(property, c30020BqK, valueOf, valueOf);
        o.LJIIIIZZ(ofObject, "ofObject(X, xBezierEvaluator, 0.0f, 0.0f)");
        this.LIZLLL = ofObject;
        PropertyValuesHolder ofObject2 = PropertyValuesHolder.ofObject(FrameLayout.Y, c30020BqK2, valueOf, valueOf);
        o.LJIIIIZZ(ofObject2, "ofObject(Y, yBezierEvaluator, 0.0f, 0.0f)");
        this.LJ = ofObject2;
        AnimatorSet animatorSet = new AnimatorSet();
        if (LiveLikeDegradeSettings.INSTANCE.disableAvatarAnim(c30003Bq3.LJLIL)) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofKeyframe(FrameLayout.SCALE_X, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.42857143f, 1.5f), Keyframe.ofFloat(0.71428573f, 1.36f), Keyframe.ofFloat(1.0f, 1.4f)), PropertyValuesHolder.ofKeyframe(FrameLayout.SCALE_Y, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.42857143f, 1.5f), Keyframe.ofFloat(0.71428573f, 1.36f), Keyframe.ofFloat(1.0f, 1.4f)));
            ofPropertyValuesHolder.setDuration(350L);
            animatorSet.playSequentially(ofPropertyValuesHolder);
        } else {
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofKeyframe(FrameLayout.SCALE_X, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.42857143f, 1.5f), Keyframe.ofFloat(0.71428573f, 1.36f), Keyframe.ofFloat(1.0f, 1.4f)), PropertyValuesHolder.ofKeyframe(FrameLayout.SCALE_Y, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.42857143f, 1.5f), Keyframe.ofFloat(0.71428573f, 1.36f), Keyframe.ofFloat(1.0f, 1.4f)));
            ofPropertyValuesHolder2.setDuration(350L);
            Property property2 = FrameLayout.ALPHA;
            Keyframe ofFloat = Keyframe.ofFloat(0.33333334f, 0.6f);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(property2, Keyframe.ofFloat(0.0f, 1.0f), ofFloat, Keyframe.ofFloat(1.0f, 0.0f));
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            ObjectAnimator ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(imageView, ofObject, ofObject2, ofKeyframe, PropertyValuesHolder.ofKeyframe(FrameLayout.SCALE_X, Keyframe.ofFloat(0.0f, 1.4f), Keyframe.ofFloat(0.16666667f, 0.5f), Keyframe.ofFloat(1.0f, 0.5f)), PropertyValuesHolder.ofKeyframe(FrameLayout.SCALE_Y, Keyframe.ofFloat(0.0f, 1.4f), Keyframe.ofFloat(0.16666667f, 0.5f), Keyframe.ofFloat(1.0f, 0.5f)));
            ofPropertyValuesHolder3.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder3.setDuration(1500L);
            animatorSet.playSequentially(ofPropertyValuesHolder2, ofPropertyValuesHolder3);
        }
        animatorSet.addListener(new ALAdapterS4S0200000_5(this, c30003Bq3, 8));
        this.LJFF = animatorSet;
    }
}
