package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.o;

/* renamed from: X.5mp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145155mp extends AbstractC145165mq {
    public final InterfaceC152085y0 LIZ;
    public C145145mo LIZIZ;

    @Override // X.WXD
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    @Override // X.WXD
    public final boolean onScaleBegin() {
        return false;
    }

    @Override // X.WXD
    public final boolean setExposureSeekBarProgress(float f) {
        return false;
    }

    @Override // X.AbstractC145165mq
    public final void LIZIZ() {
        C147295qH c147295qH;
        C145145mo c145145mo = this.LIZIZ;
        if (c145145mo != null) {
            WM7 wm7 = c145145mo.LIZ.mParentScene;
            if ((wm7 instanceof C147295qH) && (c147295qH = (C147295qH) wm7) != null) {
                c147295qH.LLLI();
            }
        }
    }

    public C145155mp(InterfaceC152085y0 gestureService, final InterfaceC65784Pro<Rect> interfaceC65784Pro) {
        o.LJIIIZ(gestureService, "gestureService");
        this.LIZ = gestureService;
        final C6VB rootView = gestureService.getRootView();
        gestureService.LIZIZ(new C6V4(0, new C6V2(this, rootView, interfaceC65784Pro) { // from class: X.5mt
            public final View LIZ;
            public final AbstractC145165mq LIZIZ;
            public final int LIZJ;
            public final int LIZLLL;
            public final InterfaceC65784Pro<Rect> LJ;

            @Override // X.C6V2
            public final void LJIIIIZZ(MotionEvent motionEvent) {
            }

            @Override // X.C6V2
            public final boolean LJJIIZI(MotionEvent motionEvent) {
                return false;
            }

            @Override // X.C6V2
            public final boolean LJJIZ(float f) {
                return false;
            }

            @Override // X.C6V2
            public final boolean LJJJ(MotionEvent motionEvent) {
                return false;
            }

            @Override // X.C6V2
            public final boolean LJJJI() {
                return false;
            }

            @Override // X.C6V2
            public final boolean LJJJIL() {
                return false;
            }

            @Override // X.C6V2
            public final boolean LJJLIL(C82537WaL c82537WaL, float f, float f2) {
                return false;
            }

            @Override // X.C6V2
            public final boolean LJLI(C82537WaL c82537WaL) {
                return false;
            }

            @Override // X.C6V2
            public final boolean LJLJI(float f) {
                return false;
            }

            @Override // X.C6V2
            public final void LJLJJI(C82537WaL c82537WaL) {
            }

            @Override // X.C6V2
            public final boolean LLLLLLLZIL(C82536WaK c82536WaK) {
                return false;
            }

            @Override // X.C6V2
            public final boolean LLLLLLZ(float f) {
                return false;
            }

            @Override // X.C6V2
            public final boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // X.C6V2
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                return false;
            }

            @Override // X.C6V2
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return false;
            }

            @Override // X.C6V2
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // X.C6V2
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                return false;
            }

            @Override // X.C6V2
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return false;
            }

            {
                this.LIZIZ = this;
                this.LIZ = rootView;
                ViewConfiguration.get(C60903NvH.LJ).getScaledPagingTouchSlop();
                float f = C60903NvH.LJ.getResources().getDisplayMetrics().density;
                this.LIZJ = (int) (300 * f);
                this.LIZLLL = (int) (20 * f);
                this.LJ = interfaceC65784Pro;
            }

            @Override // X.C6V2
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                int i;
                if ((C00F.LIZ(31744, 0, "enable_mention_hashtag_sticker", true) != 1 && C00F.LIZ(31744, 0, "enable_mention_hashtag_sticker", true) != 3) || motionEvent == null || motionEvent2 == null || Math.abs(f2) < this.LIZJ) {
                    return false;
                }
                float y = motionEvent.getY();
                float y2 = motionEvent2.getY();
                int i2 = (int) y;
                int i3 = (int) y2;
                InterfaceC65784Pro<Rect> interfaceC65784Pro2 = this.LJ;
                if ((interfaceC65784Pro2 == null || (i2 >= (i = interfaceC65784Pro2.invoke().bottom + this.LIZLLL) && i3 >= i)) && y > y2 && Math.abs(y - y2) > C47959Irz.LIZ(motionEvent2, motionEvent.getX())) {
                    AbstractC145165mq abstractC145165mq = this.LIZIZ;
                    if (abstractC145165mq != null) {
                        abstractC145165mq.LIZIZ();
                    }
                    return true;
                }
                return false;
            }
        }));
    }
}
