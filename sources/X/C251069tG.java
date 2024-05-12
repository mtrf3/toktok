package X;

import Y.ALAdapterS1S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.9tG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251069tG {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C72832SiC lottieView) {
        o.LJIIIZ(lottieView, "lottieView");
        try {
            lottieView.setMinAndMaxFrame(0, Integer.MAX_VALUE);
            lottieView.setRepeatCount(Integer.MAX_VALUE);
            lottieView.setRepeatMode(-1);
            lottieView.addAnimatorListener(new ALAdapterS1S0100000_2(20));
            lottieView.playAnimation();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
