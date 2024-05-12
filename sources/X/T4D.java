package X;

import Y.ALAdapterS9S0100000_12;
import Y.AUListenerS72S0101000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T4D {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, View root) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(root, "root");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(root.getLayoutParams());
        layoutParams.gravity = 17;
        root.setLayoutParams(layoutParams);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new InterpolatorC61446O9q(0.25d, 0.1d, 0.25d));
        ofFloat.addUpdateListener(new AUListenerS72S0101000_12((int) C74275TDb.LIZIZ(context, 32.0f), root, 1));
        ofFloat.addListener(new ALAdapterS9S0100000_12(root, 9));
        ofFloat.start();
    }
}
