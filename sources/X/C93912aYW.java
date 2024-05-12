package X;

import android.animation.ObjectAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.aYW, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93912aYW {
    public static void LIZ(View view, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.99f, 0.0f);
        ofFloat.setDuration(350L);
        ofFloat.setInterpolator(C94010aa6.LIZ());
        ofFloat.addListener(new C94319af5(interfaceC65784Pro));
        ofFloat.start();
    }
}
