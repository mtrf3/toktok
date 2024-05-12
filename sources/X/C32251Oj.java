package X;

import Y.IDCListenerS135S0100000;
import Y.IDRunnableS85S0100000;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.1Oj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32251Oj implements InterfaceC08170Tt {
    public final ViewGroup LIZ;
    public final InterfaceC65784Pro<OSZ<Integer, Integer>> LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public String LJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final View LJIIIZ;
    public final IDRunnableS85S0100000 LJIIJ;

    public final void LIZ() {
        OSZ<Integer, Integer> invoke = this.LIZIZ.invoke();
        int intValue = invoke.getFirst().intValue();
        int intValue2 = invoke.getSecond().intValue();
        int width = this.LIZ.getWidth();
        int height = this.LIZ.getHeight();
        if (intValue == 0 || intValue2 == 0 || width == 0 || height == 0) {
            return;
        }
        float f = intValue / intValue2;
        if (width / height > f) {
            this.LIZLLL = width;
            this.LIZJ = (int) (width / f);
        } else {
            this.LIZJ = height;
            this.LIZLLL = (int) (height * f);
        }
    }

    public static void LIZJ(boolean z) {
        String str;
        BZI LIZ = C28787BRn.LIZ("livesdk_gesture_effect_user");
        if (z) {
            str = "click";
        } else {
            str = "show";
        }
        LIZ.LIZJ(str);
        LIZ.LJJIIJZLJL();
    }

    public C32251Oj(ViewGroup containerView, C41561k8 c41561k8) {
        o.LJIIIZ(containerView, "containerView");
        this.LIZ = containerView;
        this.LIZIZ = c41561k8;
        this.LJ = "";
        this.LJII = true;
        View view = new View(containerView.getContext());
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 69), view);
        view.setBackgroundColor(0);
        this.LJIIIZ = view;
        this.LJIIJ = new IDRunnableS85S0100000(this, 82);
    }

    public final void LIZIZ(int i, double d, double d2, double d3, double d4) {
        float f;
        int intValue = this.LIZIZ.invoke().getFirst().intValue();
        int intValue2 = this.LIZIZ.invoke().getSecond().intValue();
        if (intValue2 == 0) {
            f = 1.0f;
        } else {
            f = this.LIZJ / intValue2;
        }
        double d5 = intValue * d3;
        double d6 = f;
        double width = ((this.LIZLLL * d) - (d5 * d6)) - ((r0 - this.LIZ.getWidth()) / 2);
        double d7 = intValue2 * d4;
        double height = ((this.LIZJ * d2) - (d7 * d6)) - ((this.LIZJ - this.LIZ.getHeight()) / 2);
        double d8 = 2;
        int i2 = (int) (d5 * d8 * d6);
        int i3 = (int) (d7 * d8 * d6);
        if (i2 != this.LJFF || i3 != this.LJI) {
            this.LJIIIZ.setLayoutParams(new ViewGroup.LayoutParams(i2, i3));
        }
        this.LJFF = i2;
        this.LJI = i3;
        if (this.LIZ.indexOfChild(this.LJIIIZ) == -1) {
            this.LIZ.addView(this.LJIIIZ, 0);
        }
        this.LJIIIZ.setTranslationX((float) width);
        this.LJIIIZ.setTranslationY((float) height);
        Handler LIZ = C15610jN.LIZ();
        LIZ.removeCallbacks(this.LJIIJ);
        LIZ.postDelayed(this.LJIIJ, (i + 1) * 1000);
    }
}
