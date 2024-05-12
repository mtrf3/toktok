package X;

import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.WSs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82326WSs extends WXA {
    public final /* synthetic */ C82328WSu LJLIL;

    public C82326WSs(C82328WSu c82328WSu) {
        this.LJLIL = c82328WSu;
    }

    @Override // X.WXB, X.WXG
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer LIZ;
        if (this.LJLIL.getCameraApiComponent().e8().LLZLLLL() || this.LJLIL.getCameraApiComponent().vf() || this.LJLIL.LJLJJLL.ez() || (LIZ = this.LJLIL.LL.LIZ()) == null || LIZ.intValue() != 0) {
            return false;
        }
        if (motionEvent == null || motionEvent2 == null) {
            return this instanceof W17;
        }
        if (this.LJLIL.getShortVideoContext().LJIIIIZZ() != 0) {
            return false;
        }
        WXA Zh = this.LJLIL.getGestureApiComponent().Zh(1);
        if (Zh != null && Zh.onFling(motionEvent, motionEvent2, f, f2)) {
            return true;
        }
        WXA Zh2 = this.LJLIL.getGestureApiComponent().Zh(6);
        if (Zh2 != null && Zh2.onFling(motionEvent, motionEvent2, f, f2)) {
            return true;
        }
        C82328WSu c82328WSu = this.LJLIL;
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = c82328WSu.LLIFFJFJJ.LJLJLJ;
        if (viewOnTouchListenerC81419VxP != null) {
            C90193gN.LIZIZ(C78688UuS.LJIJJ(c82328WSu));
            if (motionEvent2.getX() > motionEvent.getX() && C47959Irz.LIZ(motionEvent2, motionEvent.getX()) > C1I1.LIZIZ(motionEvent2, motionEvent.getY())) {
                this.LJLIL.LJJLIIIJJI(viewOnTouchListenerC81419VxP);
                return true;
            }
            if (motionEvent.getX() <= motionEvent2.getX() || C47959Irz.LIZ(motionEvent, motionEvent2.getX()) <= C1I1.LIZIZ(motionEvent2, motionEvent.getY())) {
                return false;
            }
            this.LJLIL.LJJLJLI(viewOnTouchListenerC81419VxP);
            return true;
        }
        o.LJIJI("tabHost");
        throw null;
    }

    @Override // X.WXB, X.WXG
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer LIZ;
        if (this.LJLIL.getCameraApiComponent().e8().LLZLLLL() || this.LJLIL.getCameraApiComponent().vf() || this.LJLIL.LJLJJLL.ez() || (LIZ = this.LJLIL.LL.LIZ()) == null || LIZ.intValue() != 0 || motionEvent == null || motionEvent2 == null || this.LJLIL.getShortVideoContext().LJIIIIZZ() != 0) {
            return false;
        }
        WXA Zh = this.LJLIL.getGestureApiComponent().Zh(1);
        if (Zh != null && Zh.onScroll(motionEvent, motionEvent2, f, f2)) {
            return true;
        }
        WXA Zh2 = this.LJLIL.getGestureApiComponent().Zh(6);
        if ((Zh2 == null || !Zh2.onScroll(motionEvent, motionEvent2, f, f2)) && C47959Irz.LIZ(motionEvent2, motionEvent.getX()) <= C1I1.LIZIZ(motionEvent2, motionEvent.getY())) {
            return false;
        }
        return true;
    }
}
