package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.o;

/* renamed from: X.WaJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC82535WaJ extends AbstractC82538WaM {
    public final float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public int LJIIJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC82535WaJ(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        ViewConfiguration config = ViewConfiguration.get(context);
        o.LJIIIIZZ(config, "config");
        this.LJI = config.getScaledEdgeSlop();
    }

    @Override // X.AbstractC82538WaM
    public void LJ(MotionEvent curr) {
        float f;
        float f2;
        o.LJIIIZ(curr, "curr");
        super.LJ(curr);
        MotionEvent motionEvent = this.LIZ;
        o.LJI(motionEvent);
        float x = motionEvent.getX(0);
        float y = motionEvent.getY(0);
        if (motionEvent.getPointerCount() >= 2) {
            f = motionEvent.getX(1);
            f2 = motionEvent.getY(1);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.LJII = f - x;
        this.LJIIIIZZ = f2 - y;
        float x2 = curr.getX(0);
        float y2 = curr.getY(0);
        if (curr.getPointerCount() >= 2) {
            f = curr.getX(1);
            f2 = curr.getY(1);
        }
        this.LJIIIZ = f - x2;
        this.LJIIJ = f2 - y2;
    }

    public final boolean LJFF(MotionEvent event) {
        float f;
        boolean z;
        boolean z2;
        o.LJIIIZ(event, "event");
        Resources resources = this.LJFF.getResources();
        o.LJIIIIZZ(resources, "mContext.resources");
        float f2 = resources.getDisplayMetrics().widthPixels;
        float f3 = this.LJI;
        float f4 = f2 - f3;
        float f5 = r1.heightPixels - f3;
        float f6 = this.LJIIJJI;
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
        if (z2) {
            return true;
        }
        return false;
    }
}
