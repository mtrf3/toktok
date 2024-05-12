package X;

import android.graphics.PointF;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.ss.android.vesdk.VETouchPointer;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W14 extends WXA {
    public final InterfaceC83727WtX LJLIL;
    public final ViewGroup.MarginLayoutParams LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public boolean LJLJJL;
    public final PointF LJLJJLL;
    public float LJLJL;
    public final PointF LJLJLJ;
    public Pair<Float, Float> LJLJLLL;

    @Override // X.WXB, X.WXG
    public final boolean LJJIIZI(MotionEvent event) {
        o.LJIIIZ(event, "event");
        LJI(event.getX(), event.getY());
        InterfaceC83727WtX interfaceC83727WtX = this.LJLIL;
        PointF pointF = this.LJLJLJ;
        interfaceC83727WtX.ka(pointF.x / this.LJLJI, pointF.y / this.LJLJJI, 2, 1);
        this.LJLJJL = false;
        return false;
    }

    @Override // X.WXB, X.WXG
    public final boolean onDown(MotionEvent event) {
        o.LJIIIZ(event, "event");
        LJI(event.getX(), event.getY());
        InterfaceC83727WtX interfaceC83727WtX = this.LJLIL;
        PointF pointF = this.LJLJLJ;
        interfaceC83727WtX.ka(pointF.x / this.LJLJI, pointF.y / this.LJLJJI, 0, 0);
        this.LJLJJL = true;
        return false;
    }

    public W14(InterfaceC83727WtX effectController, ViewGroup.MarginLayoutParams marginLayoutParams) {
        o.LJIIIZ(effectController, "effectController");
        this.LJLIL = effectController;
        this.LJLILLLLZI = marginLayoutParams;
        Float valueOf = Float.valueOf(-2.0f);
        this.LJLJJLL = new PointF(-2.0f, -2.0f);
        this.LJLJLJ = new PointF();
        this.LJLJLLL = new Pair<>(valueOf, valueOf);
        this.LJLJI = marginLayoutParams.width;
        this.LJLJJI = marginLayoutParams.height;
    }

    @Override // X.WXA
    public final void LJFF(VETouchPointer vETouchPointer, int i) {
        LJI(vETouchPointer.getX(), vETouchPointer.getY());
        vETouchPointer.setX(this.LJLJLJ.x / this.LJLJI);
        vETouchPointer.setY(this.LJLJLJ.y / this.LJLJJI);
        this.LJLIL.J9(vETouchPointer, i);
    }

    public final void LJI(float f, float f2) {
        this.LJLJLJ.set(f, f2);
        this.LJLJLJ.offset(-this.LJLILLLLZI.getMarginStart(), -this.LJLILLLLZI.topMargin);
    }

    @Override // X.WXA, X.WXG
    public final void LLLLLZL(MotionEvent event, int[] location) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(location, "location");
        if (event.getPointerCount() != 2) {
            return;
        }
        LJI(event.getX(1) + location[0], event.getY(1) + location[1]);
        InterfaceC83727WtX interfaceC83727WtX = this.LJLIL;
        PointF pointF = this.LJLJLJ;
        interfaceC83727WtX.ka(pointF.x / this.LJLJI, pointF.y / this.LJLJJI, 2, 0);
        this.LJLJJL = false;
    }

    @Override // X.WXA, X.WXG
    public final void LLLLZ(MotionEvent event, int[] location) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(location, "location");
        if (event.getPointerCount() != 2) {
            return;
        }
        if (this.LJLJJL) {
            this.LJLJJLL.x = ((Number) this.LJLJLLL.first).floatValue() + location[0];
            this.LJLJJLL.y = ((Number) this.LJLJLLL.second).floatValue() + location[1];
            this.LJLJJL = false;
        }
        float x = (event.getX(1) + location[0]) - this.LJLJJLL.x;
        float y = (event.getY(1) + location[1]) - this.LJLJJLL.y;
        LJI(event.getX(1) + location[0], event.getY(1) + location[1]);
        InterfaceC83727WtX interfaceC83727WtX = this.LJLIL;
        PointF pointF = this.LJLJLJ;
        float f = pointF.x;
        int i = this.LJLJI;
        float f2 = pointF.y;
        int i2 = this.LJLJJI;
        interfaceC83727WtX.ba(f / i, f2 / i2, x / i, y / i2, 1.0f);
        this.LJLJJLL.x = event.getX(1) + location[0];
        this.LJLJJLL.y = event.getY(1) + location[1];
        if (((Number) this.LJLJLLL.first).floatValue() + location[0] == this.LJLJL) {
            return;
        }
        this.LJLJL = ((Number) this.LJLJLLL.first).floatValue() + location[0];
    }

    @Override // X.WXA, X.WXG
    public final void LLLLZI(MotionEvent event, int[] location) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(location, "location");
        if (event.getPointerCount() != 2) {
            return;
        }
        LJI(event.getX(1) + location[0], event.getY(1) + location[1]);
        InterfaceC83727WtX interfaceC83727WtX = this.LJLIL;
        PointF pointF = this.LJLJLJ;
        interfaceC83727WtX.ka(pointF.x / this.LJLJI, pointF.y / this.LJLJJI, 0, 0);
        this.LJLJJL = true;
        this.LJLJLLL = new Pair<>(Float.valueOf(event.getX(1)), Float.valueOf(event.getY(1)));
    }

    @Override // X.WXB, X.WXG
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e2, "e2");
        if (this.LJLJJL) {
            PointF pointF = this.LJLJJLL;
            o.LJI(motionEvent);
            pointF.x = motionEvent.getX();
            this.LJLJJLL.y = motionEvent.getY();
            this.LJLJJL = false;
        }
        float x = e2.getX() - this.LJLJJLL.x;
        float y = e2.getY() - this.LJLJJLL.y;
        LJI(e2.getX(), e2.getY());
        InterfaceC83727WtX interfaceC83727WtX = this.LJLIL;
        PointF pointF2 = this.LJLJLJ;
        float f3 = pointF2.x;
        float f4 = this.LJLJI;
        float f5 = pointF2.y;
        float f6 = this.LJLJJI;
        interfaceC83727WtX.ba(f3 / f4, f5 / f6, x / f4, y / f6, 1.0f);
        this.LJLJJLL.x = e2.getX();
        this.LJLJJLL.y = e2.getY();
        if (motionEvent != null && motionEvent.getX() != this.LJLJL) {
            this.LJLJL = motionEvent.getX();
        }
        return false;
    }
}
