package X;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* renamed from: X.An6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27272An6 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view) {
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.5f);
            ofFloat.setRepeatCount(1);
            ofFloat.setDuration(300L);
            ofFloat.setRepeatMode(2);
            ofFloat.start();
        }
    }
}
