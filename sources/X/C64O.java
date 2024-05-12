package X;

import X.AbstractC61884OQm;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel.SerializeRectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.64O, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64O extends C6P6 {
    public final InterfaceC1544264g LIZ;
    public final List<C64U> LIZIZ;
    public final List<C64U> LIZJ;
    public C64N LIZLLL;
    public final boolean LJ;
    public int LJFF;
    public InterfaceC88472Yns<? super C64N, C76800UCe> LJI;
    public boolean LJII;

    @Override // X.C6P6, X.C6V2
    public final boolean LJJIIZI(MotionEvent event) {
        C64N c64n;
        o.LJIIIZ(event, "event");
        if (!this.LJII) {
            return false;
        }
        float y = event.getY() - this.LJFF;
        if (this.LJ && (c64n = this.LIZLLL) != null) {
            Iterator it = ((ArrayList) this.LIZJ).iterator();
            while (it.hasNext()) {
                ((C64U) it.next()).LIZ(c64n, event.getX(), y);
            }
        }
        if (this.LIZLLL == null) {
            return false;
        }
        event.getX();
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJIZ(float f) {
        C64N c64n;
        if (!this.LJII) {
            return false;
        }
        if (this.LJ && (c64n = this.LIZLLL) != null) {
            Iterator it = ((ArrayList) this.LIZJ).iterator();
            while (it.hasNext()) {
                if (((C64U) it.next()).LIZIZ(c64n, f)) {
                    return true;
                }
            }
        }
        C64N c64n2 = this.LIZLLL;
        if (c64n2 == null) {
            return false;
        }
        float degrees = (float) Math.toDegrees(f);
        if (Math.abs(degrees) > 10.0f) {
            return false;
        }
        c64n2.LIZJ().LJI(degrees);
        c64n2.LIZIZ().setRotation(c64n2.LIZJ().LIZIZ());
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJJ(MotionEvent motionEvent) {
        C64N c64n;
        if (!this.LJII || (c64n = this.LIZLLL) == null) {
            return false;
        }
        AqS152S0100000_2 aqS152S0100000_2 = c64n.LIZIZ;
        if (aqS152S0100000_2 != null) {
            aqS152S0100000_2.invoke();
        }
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJLI(C82537WaL detector) {
        C64N c64n;
        o.LJIIIZ(detector, "detector");
        if (!this.LJII) {
            return false;
        }
        if (this.LJ && (c64n = this.LIZLLL) != null) {
            Iterator it = ((ArrayList) this.LIZJ).iterator();
            while (it.hasNext()) {
                C64U c64u = (C64U) it.next();
                PointF pointF = detector.LJIIIZ;
                if (c64u.LIZJ(c64n, pointF.x, pointF.y)) {
                    return true;
                }
            }
        }
        C64N c64n2 = this.LIZLLL;
        if (c64n2 == null) {
            return false;
        }
        PointF pointF2 = detector.LJIIIZ;
        float f = pointF2.x;
        float f2 = pointF2.y;
        c64n2.LIZJ().LJFF(f, f2);
        SerializeRectF viewRectF = c64n2.LIZIZ().getViewRectF();
        viewRectF.left += f;
        viewRectF.right += f;
        viewRectF.top += f2;
        viewRectF.bottom += f2;
        c64n2.LIZIZ().setCenterX(viewRectF.LIZ().centerX());
        c64n2.LIZIZ().setCenterY(viewRectF.LIZ().centerY());
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LLLLLLLZIL(C82536WaK detector) {
        o.LJIIIZ(detector, "detector");
        if (!this.LJII) {
            return false;
        }
        return LJJII(detector.LJIILIIL, detector.LJIILJJIL);
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onDown(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (!this.LJII) {
            return false;
        }
        Iterator it = ((ArrayList) this.LIZJ).iterator();
        while (it.hasNext()) {
            C64U c64u = (C64U) it.next();
            if (c64u.LIZLLL()) {
                c64u.LJFF();
            }
        }
        this.LIZLLL = null;
        float y = event.getY() - this.LJFF;
        for (C64N c64n : this.LIZ.LIZ()) {
            if (LJJIFFI(c64n, event.getX(), y)) {
                event.getX();
                LJJIII(c64n, event.getX(), y);
                return true;
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScale(ScaleGestureDetector scaleFactor) {
        C64N c64n;
        o.LJIIIZ(scaleFactor, "scaleFactor");
        if (!this.LJII) {
            return false;
        }
        if (this.LJ && (c64n = this.LIZLLL) != null) {
            Iterator it = ((ArrayList) this.LIZJ).iterator();
            while (it.hasNext()) {
                if (((C64U) it.next()).LJ(c64n, scaleFactor.getScaleFactor())) {
                    return true;
                }
            }
        }
        C64N c64n2 = this.LIZLLL;
        if (c64n2 == null) {
            return false;
        }
        c64n2.LIZJ().LJII(scaleFactor.getScaleFactor());
        c64n2.LIZIZ().setScale(c64n2.LIZJ().LIZJ());
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScaleBegin(ScaleGestureDetector scaleFactor) {
        o.LJIIIZ(scaleFactor, "scaleFactor");
        if (!this.LJII) {
            return false;
        }
        return LJJII(scaleFactor.getFocusX(), scaleFactor.getFocusY());
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        C64N c64n;
        o.LJIIIZ(e, "e");
        if (!this.LJII) {
            return false;
        }
        if (this.LJ && (c64n = this.LIZLLL) != null) {
            Iterator it = ((ArrayList) this.LIZJ).iterator();
            while (it.hasNext()) {
                C64U c64u = (C64U) it.next();
                e.getX();
                e.getY();
                c64u.LJI(c64n);
            }
        }
        if (this.LIZLLL == null) {
            return false;
        }
        return true;
    }

    public C64O(C64Y mStickerManager, List list) {
        o.LJIIIZ(mStickerManager, "mStickerManager");
        this.LIZ = mStickerManager;
        this.LIZIZ = list;
        ArrayList arrayList = new ArrayList();
        this.LIZJ = arrayList;
        this.LJ = true;
        this.LJII = true;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public final boolean LJJII(float f, float f2) {
        if (this.LIZLLL != null) {
            return true;
        }
        float f3 = f2 - this.LJFF;
        List<C64N> LIZ = this.LIZ.LIZ();
        o.LJIIIZ(LIZ, "<this>");
        AbstractC61884OQm.b bVar = new AbstractC61884OQm.b();
        while (bVar.hasNext()) {
            C64N c64n = (C64N) bVar.next();
            if (LJJIFFI(c64n, f, f3)) {
                LJJIII(c64n, f, f3);
                return true;
            }
        }
        return false;
    }

    public static boolean LJJIFFI(C64N c64n, float f, float f2) {
        o.LJIIIZ(c64n, "<this>");
        if (!c64n.LIZLLL || !c64n.LIZJ().LIZLLL()) {
            return false;
        }
        return C77119UOl.LJIILL(f, f2, c64n.LIZJ().LIZ(), c64n.LIZJ().LIZIZ());
    }

    public final void LJJIII(C64N c64n, float f, float f2) {
        this.LIZ.LIZIZ(c64n);
        InterfaceC88472Yns<? super C64N, C76800UCe> interfaceC88472Yns = this.LJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c64n);
        }
        this.LIZLLL = c64n;
        if (this.LJ) {
            Iterator it = ((ArrayList) this.LIZJ).iterator();
            while (it.hasNext()) {
                ((C64U) it.next()).LJII(c64n, f, f2);
            }
        }
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJLIL(C82537WaL detector, float f, float f2) {
        o.LJIIIZ(detector, "detector");
        if (!this.LJII) {
            return false;
        }
        PointF pointF = detector.LJIIIIZZ;
        return LJJII(pointF.x, pointF.y);
    }
}
