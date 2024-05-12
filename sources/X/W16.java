package X;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.ss.android.vesdk.VETouchPointer;

/* loaded from: classes15.dex */
public final class W16 extends WXA {
    public final InterfaceC83727WtX LJLIL;
    public final int LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public final PointF LJLJJL = new PointF(-2.0f, -2.0f);
    public final PointF LJLJJLL = new PointF();

    @Override // X.WXA
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.WXB, X.WXG
    public final boolean LJJIIZI(MotionEvent motionEvent) {
        LJI(motionEvent.getX(), motionEvent.getY());
        InterfaceC83727WtX interfaceC83727WtX = this.LJLIL;
        PointF pointF = this.LJLJJLL;
        interfaceC83727WtX.ka(pointF.x / this.LJLILLLLZI, pointF.y / this.LJLJI, 2, 1);
        this.LJLJJI = false;
        return false;
    }

    @Override // X.WXB, X.WXG
    public final boolean onDown(MotionEvent motionEvent) {
        LJI(motionEvent.getX(), motionEvent.getY());
        InterfaceC83727WtX interfaceC83727WtX = this.LJLIL;
        PointF pointF = this.LJLJJLL;
        interfaceC83727WtX.ka(pointF.x / this.LJLILLLLZI, pointF.y / this.LJLJI, 0, 1);
        this.LJLJJI = true;
        return false;
    }

    @Override // X.WXB, X.WXG
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        LJI(motionEvent.getX(), motionEvent.getY());
        InterfaceC83727WtX interfaceC83727WtX = this.LJLIL;
        PointF pointF = this.LJLJJLL;
        interfaceC83727WtX.processTouchEvent(pointF.x / this.LJLILLLLZI, pointF.y / this.LJLJI);
        return true;
    }

    public W16(ActivityC45651qj activityC45651qj, InterfaceC83727WtX interfaceC83727WtX) {
        this.LJLILLLLZI = C60996Nwm.LJIIIIZZ(activityC45651qj);
        this.LJLIL = interfaceC83727WtX;
    }

    @Override // X.WXA
    public final void LJFF(VETouchPointer vETouchPointer, int i) {
        LJI(vETouchPointer.getX(), vETouchPointer.getY());
        vETouchPointer.setX(this.LJLJJLL.x / this.LJLILLLLZI);
        vETouchPointer.setY(this.LJLJJLL.y / this.LJLJI);
        this.LJLIL.J9(vETouchPointer, i);
    }

    public final void LJI(float f, float f2) {
        this.LJLJI = AnonymousClass668.LIZIZ().LJFF();
        int LIZ = AnonymousClass668.LIZIZ().LIZ();
        this.LJLJJLL.set(f, f2);
        this.LJLJJLL.offset(0.0f, -LIZ);
    }

    @Override // X.WXB, X.WXG
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.LJLJJI) {
            this.LJLJJL.x = motionEvent.getX();
            this.LJLJJL.y = motionEvent.getY();
            this.LJLJJI = false;
        }
        float x = motionEvent2.getX() - this.LJLJJL.x;
        float y = motionEvent2.getY() - this.LJLJJL.y;
        LJI(motionEvent2.getX(), motionEvent2.getY());
        InterfaceC83727WtX interfaceC83727WtX = this.LJLIL;
        PointF pointF = this.LJLJJLL;
        float f3 = pointF.x;
        float f4 = this.LJLILLLLZI;
        float f5 = pointF.y;
        float f6 = this.LJLJI;
        interfaceC83727WtX.ba(f3 / f4, f5 / f6, x / f4, y / f6, 1.0f);
        this.LJLJJL.x = motionEvent2.getX();
        this.LJLJJL.y = motionEvent2.getY();
        return true;
    }
}
