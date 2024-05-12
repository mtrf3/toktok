package X;

import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.WSl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82319WSl extends WXA {
    public final /* synthetic */ C82317WSj LJLIL;

    public C82319WSl(C82317WSj c82317WSj) {
        this.LJLIL = c82317WSj;
    }

    @Override // X.WXB, X.WXG
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer LIZ;
        if (this.LJLIL.getCameraApiComponent().e8().LLZLLLL() || this.LJLIL.getCameraApiComponent().vf() || this.LJLIL.getPlanCUIApiComponent().ez()) {
            return false;
        }
        C82317WSj c82317WSj = this.LJLIL;
        if (!c82317WSj.LLFF || (LIZ = c82317WSj.LJZ.LIZ()) == null || LIZ.intValue() != 0) {
            return false;
        }
        C81433Vxd c81433Vxd = this.LJLIL.LLFZ;
        if (c81433Vxd != null) {
            if (!c81433Vxd.LLJILJILJ().LJLJJI) {
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
            C81433Vxd c81433Vxd2 = this.LJLIL.LLFZ;
            if (c81433Vxd2 != null) {
                ViewOnTouchListenerC81419VxP LLJILJILJ = c81433Vxd2.LLJILJILJ();
                C90193gN.LIZIZ(C78688UuS.LJIJJ(this.LJLIL));
                if (motionEvent2.getX() > motionEvent.getX() && C47959Irz.LIZ(motionEvent2, motionEvent.getX()) > C1I1.LIZIZ(motionEvent2, motionEvent.getY())) {
                    if (LLJILJILJ.getCurrentIndex() > 0) {
                        LLJILJILJ.LJII(LLJILJILJ.getCurrentIndex() - 1, 3, true);
                    }
                    return true;
                }
                if (motionEvent.getX() <= motionEvent2.getX() || C47959Irz.LIZ(motionEvent, motionEvent2.getX()) <= C1I1.LIZIZ(motionEvent2, motionEvent.getY())) {
                    return false;
                }
                if (LLJILJILJ.getCurrentIndex() < LLJILJILJ.getTabCount() - 1) {
                    LLJILJILJ.LJII(LLJILJILJ.getCurrentIndex() + 1, 3, true);
                }
                return true;
            }
            o.LJIJI("splitShootScene");
            throw null;
        }
        o.LJIJI("splitShootScene");
        throw null;
    }

    @Override // X.WXB, X.WXG
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer LIZ;
        if (this.LJLIL.getCameraApiComponent().e8().LLZLLLL() || this.LJLIL.getCameraApiComponent().vf() || this.LJLIL.getPlanCUIApiComponent().ez()) {
            return false;
        }
        C82317WSj c82317WSj = this.LJLIL;
        if (c82317WSj.LLFF && (LIZ = c82317WSj.LJZ.LIZ()) != null && LIZ.intValue() == 0 && motionEvent != null && motionEvent2 != null) {
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
