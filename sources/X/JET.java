package X;

import Y.ALAdapterS6S0100000_8;
import Y.ALAdapterS6S0200000_8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JET extends FrameLayout {
    public float LJLIL;
    public int LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public final int LJLJJL;
    public final /* synthetic */ JEG LJLJJLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        int actionMasked = ev.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 2 || C47959Irz.LIZ(ev, this.LJLIL) < this.LJLJJL) {
                return false;
            }
            return true;
        }
        this.LJLILLLLZI = ev.getPointerId(ev.getActionIndex());
        this.LJLIL = ev.getX(ev.getActionIndex());
        ev.getY(ev.getActionIndex());
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        int i;
        int i2;
        int rawX;
        o.LJIIIZ(ev, "ev");
        int actionMasked = ev.getActionMasked();
        if (actionMasked != 0) {
            boolean z = false;
            int rawY = 0;
            if (actionMasked != 1) {
                if (actionMasked == 2 && ev.findPointerIndex(this.LJLILLLLZI) >= 0) {
                    if (this.LJLJI < 0.0f) {
                        rawX = 0;
                    } else {
                        rawX = (int) (((int) ev.getRawX()) - this.LJLJI);
                    }
                    if (this.LJLJJI >= 0.0f) {
                        rawY = (int) (((int) ev.getRawY()) - this.LJLJJI);
                    }
                    JEG jeg = this.LJLJJLL;
                    jeg.getClass();
                    Point point = new Point(jeg.LJIIIIZZ);
                    point.offset(rawX, rawY);
                    jeg.LJI(point);
                    this.LJLJI = ev.getRawX();
                    this.LJLJJI = ev.getRawY();
                }
            } else {
                this.LJLJI = -1.0f;
                this.LJLJJI = -1.0f;
                JEG jeg2 = this.LJLJJLL;
                int i3 = jeg2.LJIIIIZZ.x;
                C48811JDr c48811JDr = jeg2.LIZJ;
                if (c48811JDr != null) {
                    if ((c48811JDr.LIZJ() / 2) + i3 <= jeg2.LJIIJ / 2) {
                        z = true;
                        i = jeg2.LJIIIIZZ.x;
                        i2 = jeg2.LIZLLL.left;
                    } else {
                        i = jeg2.LIZLLL.right;
                        i2 = jeg2.LJIIIIZZ.x;
                    }
                    Point point2 = new Point(jeg2.LJIIIIZZ);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
                    duration.setInterpolator(C55953Lxd.LIZLLL());
                    duration.addUpdateListener(new JEU(z, jeg2, point2, i - i2));
                    duration.addListener(new ALAdapterS6S0100000_8(jeg2, 0));
                    duration.addListener(new ALAdapterS6S0200000_8(jeg2, duration, 0));
                    duration.start();
                    jeg2.LJIIIZ = z;
                } else {
                    o.LJIJI("currentWindowSize");
                    throw null;
                }
            }
        } else {
            this.LJLILLLLZI = ev.getPointerId(ev.getActionIndex());
        }
        return super.onTouchEvent(ev);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JET(JEF jef, Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJLJJLL = jef;
        new LinkedHashMap();
        this.LJLJI = -1.0f;
        this.LJLJJI = -1.0f;
        this.LJLJJL = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLJJLL.LJIIIIZZ(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLJJLL.LJIIIIZZ(i, i2);
    }
}
