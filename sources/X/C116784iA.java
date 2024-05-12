package X;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* renamed from: X.4iA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116784iA {
    public static final /* synthetic */ int LIZ = 0;

    public static OSZ LIZ(View view, long j, long j2, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f, f2);
        ofFloat.setDuration(j);
        ofFloat.setStartDelay(j2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, f, f2);
        ofFloat2.setDuration(j);
        ofFloat2.setStartDelay(j2);
        return new OSZ(ofFloat, ofFloat2);
    }
}
