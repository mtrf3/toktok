package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class YLG extends YLJ {
    public final float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YLG(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJI = ViewConfiguration.get(context).getScaledEdgeSlop();
    }

    public final boolean LIZ(MotionEvent event) {
        float f;
        boolean z;
        boolean z2;
        o.LJIIIZ(event, "event");
        float f2 = this.LIZ.getResources().getDisplayMetrics().widthPixels;
        float f3 = this.LJI;
        float f4 = f2 - f3;
        float f5 = r1.heightPixels - f3;
        float f6 = 0;
        float f7 = f3 - f6;
        float f8 = f4 + f6;
        float f9 = f5 + f6;
        float rawX = event.getRawX();
        float rawY = event.getRawY();
        float x = event.getX() - event.getRawX();
        float f10 = 0.0f;
        if (1 < event.getPointerCount()) {
            f = event.getX(1) - x;
        } else {
            f = 0.0f;
        }
        float y = event.getY() - event.getRawY();
        if (1 < event.getPointerCount()) {
            f10 = event.getY(1) - y;
        }
        if (rawX < f7 || rawY < f7 || rawX > f8 || rawY > f9) {
            z = true;
        } else {
            z = false;
        }
        if (f < f7 || f10 < f7 || f > f8 || f10 > f9) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            return z2 ? true : true;
        }
        if (!z2) {
            return false;
        }
        return true;
    }
}
