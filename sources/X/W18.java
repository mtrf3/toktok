package X;

import android.graphics.PointF;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import com.ss.android.vesdk.VETouchPointer;

/* loaded from: classes15.dex */
public final class W18 extends WXA {
    public final InterfaceC83586WrG LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public float LJLJLJ;
    public boolean LJLJLLL;
    public Pair<Float, Float> LJLLILLLL;
    public float LJLJJLL = 1.0f;
    public float LJLJL = 1.0f;
    public final PointF LJLL = new PointF(-2.0f, -2.0f);
    public final PointF LJLLI = new PointF();

    @Override // X.WXA
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.WXB, X.WXG
    public final boolean LLLLLLLZIL(C82536WaK c82536WaK) {
        return true;
    }

    @Override // X.WXB, X.WXG
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // X.WXB, X.WXG
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // X.WXB, X.WXG
    public final boolean LJJIIZI(MotionEvent motionEvent) {
        LJII(motionEvent.getX(), motionEvent.getY());
        InterfaceC83586WrG interfaceC83586WrG = this.LJLIL;
        PointF pointF = this.LJLLI;
        ((C83576Wr6) interfaceC83586WrG).LJFF(pointF.x / this.LJLILLLLZI, pointF.y / this.LJLJI, 2, 0);
        this.LJLJLLL = false;
        return false;
    }

    @Override // X.WXB, X.WXG
    public final boolean LJJIZ(float f) {
        float f2 = -f;
        InterfaceC83727WtX interfaceC83727WtX = ((C83576Wr6) this.LJLIL).LIZ;
        if (interfaceC83727WtX != null) {
            interfaceC83727WtX.X9(f2, 6.0f);
            return true;
        }
        return true;
    }

    @Override // X.WXB, X.WXG
    public final boolean LJJJ(MotionEvent motionEvent) {
        LJII(motionEvent.getX(), motionEvent.getY());
        PointF pointF = this.LJLLI;
        PointF LJI = LJI(pointF.x, pointF.y);
        InterfaceC83586WrG interfaceC83586WrG = this.LJLIL;
        if (interfaceC83586WrG != null) {
            float f = LJI.x;
            float f2 = LJI.y;
            InterfaceC83727WtX interfaceC83727WtX = ((C83576Wr6) interfaceC83586WrG).LIZ;
            if (interfaceC83727WtX != null) {
                interfaceC83727WtX.Y9(f, f2);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // X.WXB, X.WXG
    public final boolean LJLJI(float f) {
        this.LJLJJLL = 1.0f;
        this.LJLJL = 1.0f;
        return true;
    }

    @Override // X.WXB, X.WXG
    public final boolean LLLLLLZ(float f) {
        float f2 = -f;
        InterfaceC83727WtX interfaceC83727WtX = ((C83576Wr6) this.LJLIL).LIZ;
        if (interfaceC83727WtX != null) {
            interfaceC83727WtX.X9(f2, 6.0f);
            return true;
        }
        return true;
    }

    @Override // X.WXB, X.WXG
    public final boolean onDown(MotionEvent motionEvent) {
        LJII(motionEvent.getX(), motionEvent.getY());
        InterfaceC83586WrG interfaceC83586WrG = this.LJLIL;
        PointF pointF = this.LJLLI;
        ((C83576Wr6) interfaceC83586WrG).LJFF(pointF.x / this.LJLILLLLZI, pointF.y / this.LJLJI, 0, 0);
        this.LJLJLLL = true;
        return false;
    }

    @Override // X.WXB, X.WXG
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.LJLJL;
        this.LJLJL = scaleFactor;
        float f = scaleFactor / this.LJLJJLL;
        InterfaceC83727WtX interfaceC83727WtX = ((C83576Wr6) this.LJLIL).LIZ;
        if (interfaceC83727WtX != null) {
            interfaceC83727WtX.Z9(f, 3.0f);
        }
        this.LJLJJLL = this.LJLJL;
        return true;
    }

    @Override // X.WXB, X.WXG
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        LJII(motionEvent.getX(), motionEvent.getY());
        PointF pointF = this.LJLLI;
        PointF LJI = LJI(pointF.x, pointF.y);
        InterfaceC83586WrG interfaceC83586WrG = this.LJLIL;
        float f = LJI.x;
        float f2 = LJI.y;
        InterfaceC83727WtX interfaceC83727WtX = ((C83576Wr6) interfaceC83586WrG).LIZ;
        if (interfaceC83727WtX != null) {
            interfaceC83727WtX.ma(f, f2);
            return true;
        }
        return true;
    }

    public W18(InterfaceC83586WrG interfaceC83586WrG, ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.LJLIL = interfaceC83586WrG;
        this.LJLILLLLZI = marginLayoutParams.width;
        this.LJLJI = marginLayoutParams.height;
        this.LJLJJI = marginLayoutParams.getMarginStart();
        this.LJLJJL = marginLayoutParams.topMargin;
    }

    @Override // X.WXA
    public final void LJFF(VETouchPointer vETouchPointer, int i) {
        LJII(vETouchPointer.getX(), vETouchPointer.getY());
        vETouchPointer.setX(this.LJLLI.x / this.LJLILLLLZI);
        vETouchPointer.setY(this.LJLLI.y / this.LJLJI);
        InterfaceC83727WtX interfaceC83727WtX = ((C83576Wr6) this.LJLIL).LIZ;
        if (interfaceC83727WtX != null) {
            interfaceC83727WtX.J9(vETouchPointer, i);
        }
    }

    public final PointF LJI(float f, float f2) {
        PointF pointF = new PointF();
        pointF.x = f / this.LJLILLLLZI;
        pointF.y = f2 / this.LJLJI;
        return pointF;
    }

    public final void LJII(float f, float f2) {
        this.LJLLI.set(f, f2);
        this.LJLLI.offset(-this.LJLJJI, -this.LJLJJL);
    }

    @Override // X.WXA, X.WXG
    public final void LLLLLZ(MotionEvent motionEvent, int[] iArr) {
        LIZLLL(motionEvent, iArr);
        if (motionEvent.getPointerCount() != 2) {
            return;
        }
        LJII(motionEvent.getX(1) + iArr[0], motionEvent.getY(1) + iArr[1]);
        PointF pointF = this.LJLLI;
        PointF LJI = LJI(pointF.x, pointF.y);
        InterfaceC83586WrG interfaceC83586WrG = this.LJLIL;
        float f = LJI.x;
        float f2 = LJI.y;
        InterfaceC83727WtX interfaceC83727WtX = ((C83576Wr6) interfaceC83586WrG).LIZ;
        if (interfaceC83727WtX != null) {
            interfaceC83727WtX.ma(f, f2);
        }
    }

    @Override // X.WXA, X.WXG
    public final void LLLLLZL(MotionEvent motionEvent, int[] iArr) {
        LIZLLL(motionEvent, iArr);
        if (motionEvent.getPointerCount() != 2) {
            return;
        }
        LJII(motionEvent.getX(1) + iArr[0], motionEvent.getY(1) + iArr[1]);
        InterfaceC83586WrG interfaceC83586WrG = this.LJLIL;
        PointF pointF = this.LJLLI;
        ((C83576Wr6) interfaceC83586WrG).LJFF(pointF.x / this.LJLILLLLZI, pointF.y / this.LJLJI, 2, 0);
        this.LJLJLLL = false;
    }

    @Override // X.WXA, X.WXG
    public final void LLLLZ(MotionEvent motionEvent, int[] iArr) {
        Pair<Float, Float> pair;
        LIZLLL(motionEvent, iArr);
        if (motionEvent.getPointerCount() != 2) {
            return;
        }
        if (this.LJLJLLL && (pair = this.LJLLILLLL) != null) {
            this.LJLL.x = ((Float) pair.first).floatValue() + iArr[0];
            this.LJLL.y = ((Float) this.LJLLILLLL.second).floatValue() + iArr[1];
            this.LJLJLLL = false;
        }
        float x = (motionEvent.getX(1) + iArr[0]) - this.LJLL.x;
        float y = (motionEvent.getY(1) + iArr[1]) - this.LJLL.y;
        LJII(motionEvent.getX(1) + iArr[0], motionEvent.getY(1) + iArr[1]);
        InterfaceC83586WrG interfaceC83586WrG = this.LJLIL;
        PointF pointF = this.LJLLI;
        float f = pointF.x;
        int i = this.LJLILLLLZI;
        float f2 = pointF.y;
        int i2 = this.LJLJI;
        ((C83576Wr6) interfaceC83586WrG).LJ(f / i, f2 / i2, x / i, y / i2, 1.0f);
        this.LJLL.x = motionEvent.getX(1) + iArr[0];
        this.LJLL.y = motionEvent.getY(1) + iArr[1];
        Pair<Float, Float> pair2 = this.LJLLILLLL;
        if (pair2 != null && ((Float) pair2.first).floatValue() + iArr[0] != this.LJLJLJ) {
            this.LJLJLJ = ((Float) this.LJLLILLLL.first).floatValue() + iArr[0];
        }
    }

    @Override // X.WXA, X.WXG
    public final void LLLLZI(MotionEvent motionEvent, int[] iArr) {
        LIZLLL(motionEvent, iArr);
        if (motionEvent.getPointerCount() != 2) {
            return;
        }
        LJII(motionEvent.getX(1) + iArr[0], motionEvent.getY(1) + iArr[1]);
        InterfaceC83586WrG interfaceC83586WrG = this.LJLIL;
        PointF pointF = this.LJLLI;
        ((C83576Wr6) interfaceC83586WrG).LJFF(pointF.x / this.LJLILLLLZI, pointF.y / this.LJLJI, 0, 0);
        this.LJLJLLL = true;
        this.LJLLILLLL = new Pair<>(Float.valueOf(motionEvent.getX(1)), Float.valueOf(motionEvent.getY(1)));
    }

    @Override // X.WXB, X.WXG
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.LJLJLLL) {
            this.LJLL.x = motionEvent.getX();
            this.LJLL.y = motionEvent.getY();
            this.LJLJLLL = false;
        }
        float x = motionEvent2.getX() - this.LJLL.x;
        float y = motionEvent2.getY() - this.LJLL.y;
        LJII(motionEvent2.getX(), motionEvent2.getY());
        InterfaceC83586WrG interfaceC83586WrG = this.LJLIL;
        PointF pointF = this.LJLLI;
        float f3 = pointF.x;
        float f4 = this.LJLILLLLZI;
        float f5 = pointF.y;
        float f6 = this.LJLJI;
        ((C83576Wr6) interfaceC83586WrG).LJ(f3 / f4, f5 / f6, x / f4, y / f6, 1.0f);
        this.LJLL.x = motionEvent2.getX();
        this.LJLL.y = motionEvent2.getY();
        if (motionEvent != null && motionEvent.getX() != this.LJLJLJ) {
            this.LJLJLJ = motionEvent.getX();
            return true;
        }
        return true;
    }
}
