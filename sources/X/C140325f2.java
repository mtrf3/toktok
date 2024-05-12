package X;

import Y.ALAdapterS1S0100000_2;
import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.TranslateAnimation;
import kotlin.jvm.internal.o;

/* renamed from: X.5f2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140325f2 {
    public final View LIZ;
    public final InterfaceC153045zY LIZIZ;
    public final InterfaceC88473Ynt<Float, Float, Float, C76800UCe> LIZJ;
    public final InterfaceC88472Yns<Float, C76800UCe> LIZLLL;
    public final InterfaceC88474Ynu<Integer, Integer, Integer, Integer, C76800UCe> LJ;
    public int LJFF;
    public float LJI;
    public final Activity LJII;
    public ValueAnimator LJIIIIZZ;
    public int LJIIIZ;

    public final void LIZ(int i, int i2, C140355f5 c140355f5, long j) {
        float f = i;
        float f2 = i2;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f, f2);
        translateAnimation.setDuration(j);
        translateAnimation.setFillAfter(true);
        this.LIZ.startAnimation(translateAnimation);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 19));
        ofFloat.addListener(new ALAdapterS1S0100000_2(c140355f5, 10));
        ofFloat.start();
    }

    public C140325f2(View view, InterfaceC153045zY interfaceC153045zY, C140225es c140225es, C140235et c140235et, C140245eu c140245eu) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
        this.LIZIZ = interfaceC153045zY;
        this.LIZJ = c140225es;
        this.LIZLLL = c140235et;
        this.LJ = c140245eu;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        o.LJI(LJIJJ);
        this.LJII = LJIJJ;
        this.LJIIIZ = Integer.MAX_VALUE;
    }
}
