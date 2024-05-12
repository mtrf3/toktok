package X;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;

/* renamed from: X.Ve4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80220Ve4 {
    public static final int[] LIZ = {R.attr.stateListAnimator};

    public static void LIZ(View view, float f) {
        int integer = view.getResources().getInteger(com.zhiliaoapp.musically.R.integer.ae);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, com.zhiliaoapp.musically.R.attr.ber, -2130971424}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
