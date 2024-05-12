package X;

import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

/* loaded from: classes14.dex */
public final class UHR {
    public static boolean LIZ;

    public static void LIZ(ImageView imageView, float f, InterfaceC65784Pro interfaceC65784Pro, int i) {
        ViewPropertyAnimator animate;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        if (imageView != null && (animate = imageView.animate()) != null) {
            animate.scaleX(0.0f);
            animate.scaleY(0.0f);
            animate.setDuration(150L);
            animate.setStartDelay(0L);
            animate.setInterpolator(new DecelerateInterpolator(1.5f));
            animate.setListener(new UHQ(interfaceC65784Pro, animate, f));
            animate.start();
        }
    }
}
