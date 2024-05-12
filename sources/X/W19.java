package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* loaded from: classes15.dex */
public final class W19 extends WXA {
    public final InterfaceC83586WrG LJLIL;
    public final int LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public final PointF LJLJJL = new PointF(-2.0f, -2.0f);
    public final PointF LJLJJLL = new PointF();

    @Override // X.WXB, X.WXG
    public final boolean LJJIIZI(MotionEvent motionEvent) {
        LJI(motionEvent.getX(), motionEvent.getY());
        InterfaceC83586WrG interfaceC83586WrG = this.LJLIL;
        PointF pointF = this.LJLJJLL;
        ((C83576Wr6) interfaceC83586WrG).LJFF(pointF.x / this.LJLILLLLZI, pointF.y / this.LJLJI, 2, 1);
        this.LJLJJI = false;
        return false;
    }

    @Override // X.WXB, X.WXG
    public final boolean onDown(MotionEvent motionEvent) {
        LJI(motionEvent.getX(), motionEvent.getY());
        InterfaceC83586WrG interfaceC83586WrG = this.LJLIL;
        PointF pointF = this.LJLJJLL;
        ((C83576Wr6) interfaceC83586WrG).LJFF(pointF.x / this.LJLILLLLZI, pointF.y / this.LJLJI, 0, 1);
        this.LJLJJI = true;
        return false;
    }

    @Override // X.WXB, X.WXG
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        LJI(motionEvent.getX(), motionEvent.getY());
        InterfaceC83586WrG interfaceC83586WrG = this.LJLIL;
        PointF pointF = this.LJLJJLL;
        float f = pointF.x / this.LJLILLLLZI;
        float f2 = pointF.y / this.LJLJI;
        InterfaceC83727WtX interfaceC83727WtX = ((C83576Wr6) interfaceC83586WrG).LIZ;
        if (interfaceC83727WtX != null) {
            interfaceC83727WtX.processTouchEvent(f, f2);
            return true;
        }
        return true;
    }

    public W19(Context context, InterfaceC83586WrG interfaceC83586WrG) {
        this.LJLILLLLZI = C60996Nwm.LJIIIIZZ(context);
        this.LJLIL = interfaceC83586WrG;
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
        InterfaceC83586WrG interfaceC83586WrG = this.LJLIL;
        PointF pointF = this.LJLJJLL;
        float f3 = pointF.x;
        float f4 = this.LJLILLLLZI;
        float f5 = pointF.y;
        float f6 = this.LJLJI;
        ((C83576Wr6) interfaceC83586WrG).LJ(f3 / f4, f5 / f6, x / f4, y / f6, 1.0f);
        this.LJLJJL.x = motionEvent2.getX();
        this.LJLJJL.y = motionEvent2.getY();
        return true;
    }
}
