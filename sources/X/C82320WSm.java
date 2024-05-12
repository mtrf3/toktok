package X;

import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.WSm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82320WSm extends WXA {
    public final /* synthetic */ C82318WSk LJLIL;

    public C82320WSm(C82318WSk c82318WSk) {
        this.LJLIL = c82318WSk;
    }

    @Override // X.WXB, X.WXG
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer LIZ;
        if (this.LJLIL.getCameraApiComponent().e8().LLZLLLL()) {
            return false;
        }
        C82318WSk c82318WSk = this.LJLIL;
        if (!c82318WSk.LLD || (LIZ = c82318WSk.LJLLLLLL.LIZ()) == null || LIZ.intValue() != 0) {
            return false;
        }
        if (motionEvent == null || motionEvent2 == null) {
            return this instanceof W17;
        }
        WXA Zh = this.LJLIL.getGestureApiComponent().Zh(1);
        if (Zh != null && Zh.onFling(motionEvent, motionEvent2, f, f2)) {
            return true;
        }
        WXA Zh2 = this.LJLIL.getGestureApiComponent().Zh(6);
        if (Zh2 != null && Zh2.onFling(motionEvent, motionEvent2, f, f2)) {
            return true;
        }
        C81431Vxb c81431Vxb = this.LJLIL.LLFFF;
        if (c81431Vxb != null) {
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = c81431Vxb.LJLJLLL;
            if (viewOnTouchListenerC81419VxP != null) {
                if (motionEvent2.getX() > motionEvent.getX() && C47959Irz.LIZ(motionEvent2, motionEvent.getX()) > C1I1.LIZIZ(motionEvent2, motionEvent.getY())) {
                    if (viewOnTouchListenerC81419VxP.getCurrentIndex() > 0) {
                        viewOnTouchListenerC81419VxP.LJII(viewOnTouchListenerC81419VxP.getCurrentIndex() - 1, 3, true);
                    }
                    return true;
                }
                if (motionEvent.getX() <= motionEvent2.getX() || C47959Irz.LIZ(motionEvent, motionEvent2.getX()) <= C1I1.LIZIZ(motionEvent2, motionEvent.getY())) {
                    return false;
                }
                if (viewOnTouchListenerC81419VxP.getCurrentIndex() < viewOnTouchListenerC81419VxP.getTabCount() - 1) {
                    viewOnTouchListenerC81419VxP.LJII(viewOnTouchListenerC81419VxP.getCurrentIndex() + 1, 3, true);
                }
                return true;
            }
            o.LJIJI("tabHost");
            throw null;
        }
        o.LJIJI("splitShootScene");
        throw null;
    }

    @Override // X.WXB, X.WXG
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer LIZ;
        if (this.LJLIL.getCameraApiComponent().e8().LLZLLLL()) {
            return false;
        }
        C82318WSk c82318WSk = this.LJLIL;
        if (c82318WSk.LLD && (LIZ = c82318WSk.LJLLLLLL.LIZ()) != null && LIZ.intValue() == 0 && motionEvent != null && motionEvent2 != null) {
            WXA Zh = this.LJLIL.getGestureApiComponent().Zh(1);
            if (Zh != null && Zh.onScroll(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
            WXA Zh2 = this.LJLIL.getGestureApiComponent().Zh(6);
            if ((Zh2 != null && Zh2.onScroll(motionEvent, motionEvent2, f, f2)) || C47959Irz.LIZ(motionEvent2, motionEvent.getX()) > C1I1.LIZIZ(motionEvent2, motionEvent.getY())) {
                return true;
            }
        }
        return false;
    }
}
