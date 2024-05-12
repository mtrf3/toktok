package X;

import Y.ARunnableS12S0210000_13;
import Y.IDAListenerS43S0200000_13;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.TkN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75515TkN {
    public static boolean LIZ;
    public static ARunnableS12S0210000_13 LIZIZ;

    public static void LIZIZ(InterfaceC30237Btp interfaceC30237Btp, Runnable runnable, EnumC75468Tjc type) {
        o.LJIIIZ(type, "type");
        if (interfaceC30237Btp != null && type.getVisibility()) {
            type.setVisibility(false);
            ObjectAnimator duration = ObjectAnimator.ofFloat(interfaceC30237Btp.LJFF(), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(200L);
            o.LJIIIIZZ(duration, "ofFloat(view.anchorView,…0f).setDuration(DURATION)");
            duration.addListener(new IDAListenerS43S0200000_13(interfaceC30237Btp, runnable, 0));
            LIZ = true;
            duration.start();
        }
    }

    public static void LIZ(InterfaceC30237Btp interfaceC30237Btp, Runnable runnable, EnumC75468Tjc type, boolean z) {
        o.LJIIIZ(type, "type");
        if (interfaceC30237Btp != null && !type.getVisibility()) {
            type.setVisibility(true);
            ARunnableS12S0210000_13 aRunnableS12S0210000_13 = new ARunnableS12S0210000_13(runnable, interfaceC30237Btp, z, 0);
            if (LIZ) {
                LIZIZ = aRunnableS12S0210000_13;
            } else {
                aRunnableS12S0210000_13.run();
            }
        }
    }
}
