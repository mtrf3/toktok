package X;

import Y.ALAdapterS3S0100000_4;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.9Ac, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C232389Ac {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C72787ShT c72787ShT, boolean z, InterfaceC65784Pro interfaceC65784Pro) {
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (!z) {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c72787ShT, "alpha", fArr);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addListener(new ALAdapterS3S0100000_4(interfaceC65784Pro, 18));
        ofFloat.start();
    }
}
