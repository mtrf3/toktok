package X;

import android.view.MotionEvent;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.WVx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82409WVx extends WXA {
    public final /* synthetic */ C82410WVy LJLIL;

    public C82409WVx(C82410WVy c82410WVy) {
        this.LJLIL = c82410WVy;
    }

    @Override // X.WXB, X.WXG
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        TEZ LLLLL;
        if (C53558L0g.LIZIZ().tapOpen && C53558L0g.LIZIZ().supportCancel) {
            ShortVideoContext shortVideoContext = this.LJLIL.getShortVideoContext();
            o.LJIIIZ(shortVideoContext, "<this>");
            if (shortVideoContext.shootMode != 19) {
                if (o.LJ(this.LJLIL.getRecordControlApi().isRecording().LIZ(), Boolean.TRUE) || this.LJLIL.AO() || o.LJ(this.LJLIL.getBottomTabApiComponent().getCurrentBottomTag(), "RecordLiveScene") || this.LJLIL.getPlanCUIApiComponent().ez()) {
                    return this instanceof W17;
                }
                I0N LLF = this.LJLIL.LLF();
                if (LLF != null && (LLLLL = LLF.LLLLL()) != null) {
                    LLLLL.LJJIJIL(System.currentTimeMillis());
                }
                C82130WLe.LIZ(this.LJLIL, true, false, true, "click_screen", false, 38);
                return false;
            }
        }
        return this instanceof W17;
    }

    public final boolean LJI(MotionEvent e1, MotionEvent e2) {
        LiveEvent<Boolean> sF;
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        if (C53558L0g.LIZIZ().supportUpGesture && this.LJLIL.LJJLIIIJJI() && e2.getY() > e1.getY() && C1I1.LIZIZ(e2, e1.getY()) > C47959Irz.LIZ(e2, e1.getX())) {
            C82130WLe.LIZ(this.LJLIL, false, false, false, "slide_down", false, 46);
            return true;
        }
        if (this.LJLIL.LJJLIIIJJI() && e2.getY() < e1.getY() && C1I1.LIZIZ(e2, e1.getY()) > C47959Irz.LIZ(e2, e1.getX())) {
            if (this.LJLIL.AO()) {
                I0N LLF = this.LJLIL.LLF();
                if ((LLF == null || (sF = LLF.sF()) == null || !o.LJ(sF.LIZJ(), Boolean.TRUE)) && C53558L0g.LIZIZ().supportUpslideOpenPanel) {
                    I0N LLF2 = this.LJLIL.LLF();
                    if (LLF2 != null) {
                        LLF2.W90(true, "carousal_swipe_up");
                    }
                    C82130WLe.LIZ(this.LJLIL, false, false, false, null, false, 62);
                    this.LJLIL.LLF = true;
                    return true;
                }
            } else if (C53558L0g.LIZIZ().supportUpGesture) {
                C82130WLe.LIZ(this.LJLIL, true, false, true, "carousal_swipe_up", false, 38);
                return true;
            }
            return false;
        }
        if (C53558L0g.LIZIZ().supportLeftRightGesture && this.LJLIL.AO() && this.LJLIL.LJJLIIIJJI() && e2.getX() > e1.getX() && C47959Irz.LIZ(e2, e1.getX()) > C1I1.LIZIZ(e2, e1.getY())) {
            WW1 LJLLL = this.LJLIL.LJLLL();
            AbstractC77369UYb abstractC77369UYb = LJLLL.LLIIL;
            if (abstractC77369UYb != null) {
                WW1.LLJLLL(LJLLL, false, abstractC77369UYb);
            } else {
                WW1.LLJLLL(LJLLL, false, C77378UYk.LIZ);
            }
            return true;
        }
        if (!C53558L0g.LIZIZ().supportLeftRightGesture || !this.LJLIL.AO() || !this.LJLIL.LJJLIIIJJI() || e2.getX() >= e1.getX() || C47959Irz.LIZ(e2, e1.getX()) <= C1I1.LIZIZ(e2, e1.getY())) {
            return false;
        }
        WW1 LJLLL2 = this.LJLIL.LJLLL();
        AbstractC77369UYb abstractC77369UYb2 = LJLLL2.LLIIL;
        if (abstractC77369UYb2 != null) {
            WW1.LLJLLL(LJLLL2, true, abstractC77369UYb2);
        } else {
            WW1.LLJLLL(LJLLL2, true, C77378UYk.LIZ);
        }
        return true;
    }

    @Override // X.WXB, X.WXG
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        WXA Zh;
        WXA Zh2;
        WXA Zh3;
        if (motionEvent == null || motionEvent2 == null || !C53558L0g.LIZIZ().supportUpslideOpenPanel) {
            return this instanceof W17;
        }
        Boolean LIZ = this.LJLIL.getRecordControlApi().isRecording().LIZ();
        o.LJIIIIZZ(LIZ, "recordControlApi.isRecording.value");
        if (LIZ.booleanValue()) {
            return false;
        }
        InterfaceC82353WTt gestureApiComponent = this.LJLIL.getGestureApiComponent();
        WXA wxa = null;
        if (gestureApiComponent != null) {
            wxa = gestureApiComponent.Zh(17);
        }
        if (wxa != null && wxa.onFling(motionEvent, motionEvent2, f, f2)) {
            return true;
        }
        InterfaceC82353WTt gestureApiComponent2 = this.LJLIL.getGestureApiComponent();
        if (gestureApiComponent2 != null && (Zh3 = gestureApiComponent2.Zh(1)) != null && Zh3.onFling(motionEvent, motionEvent2, f, f2)) {
            if (!this.LJLIL.LJJLIIJ()) {
                LJI(motionEvent, motionEvent2);
            }
            return true;
        }
        InterfaceC82353WTt gestureApiComponent3 = this.LJLIL.getGestureApiComponent();
        if (gestureApiComponent3 != null && (Zh2 = gestureApiComponent3.Zh(6)) != null && Zh2.onFling(motionEvent, motionEvent2, f, f2)) {
            return true;
        }
        InterfaceC82353WTt gestureApiComponent4 = this.LJLIL.getGestureApiComponent();
        if (gestureApiComponent4 != null && (Zh = gestureApiComponent4.Zh(16)) != null && Zh.onFling(motionEvent, motionEvent2, f, f2)) {
            return true;
        }
        return LJI(motionEvent, motionEvent2);
    }
}
