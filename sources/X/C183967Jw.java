package X;

import Y.AUListenerS92S0100000_3;
import Y.IDAListenerS4S0300000_3;
import Y.IDAListenerS72S0100000_3;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.7Jw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183967Jw {
    public static final /* synthetic */ int LIZ = 0;

    public static Animator LIZIZ(AbstractC183947Ju abstractC183947Ju) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new AUListenerS92S0100000_3(abstractC183947Ju, 21));
        ofFloat.addListener(new IDAListenerS72S0100000_3(abstractC183947Ju, 33));
        ofFloat.addListener(new IDAListenerS72S0100000_3(abstractC183947Ju, 32));
        ofFloat.addListener(new IDAListenerS72S0100000_3(abstractC183947Ju, 31));
        return ofFloat;
    }

    public static Animator LIZ(AbstractC183947Ju abstractC183947Ju, Runnable runnable, InterfaceC88471Ynr interfaceC88471Ynr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new AUListenerS92S0100000_3(abstractC183947Ju, 20));
        ofFloat.addListener(new IDAListenerS4S0300000_3(abstractC183947Ju, runnable, interfaceC88471Ynr, 1));
        ofFloat.addListener(new IDAListenerS72S0100000_3(abstractC183947Ju, 30));
        ofFloat.addListener(new IDAListenerS72S0100000_3(abstractC183947Ju, 29));
        return ofFloat;
    }
}
