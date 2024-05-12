package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YKU extends WXC {
    public final EditTextStickerViewModel LIZ;

    public YKU(EditTextStickerViewModel editTextStickerViewModel) {
        this.LIZ = editTextStickerViewModel;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJIIZI(MotionEvent event) {
        o.LJIIIZ(event, "event");
        return this.LIZ.LJJIIZI(event);
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJIZ(float f) {
        return this.LIZ.LJJIZ(f);
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJLI(C82537WaL detector) {
        o.LJIIIZ(detector, "detector");
        return this.LIZ.LJLI(detector);
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJLJI(float f) {
        return this.LIZ.LJLJI(f);
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LLLLLLLZIL(C82536WaK detector) {
        o.LJIIIZ(detector, "detector");
        return this.LIZ.LLLLLLLZIL(detector);
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onDown(MotionEvent event) {
        o.LJIIIZ(event, "event");
        return this.LIZ.onDown(event);
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScale(ScaleGestureDetector scaleFactor) {
        o.LJIIIZ(scaleFactor, "scaleFactor");
        return this.LIZ.onScale(scaleFactor);
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScaleBegin(ScaleGestureDetector scaleFactor) {
        o.LJIIIZ(scaleFactor, "scaleFactor");
        return this.LIZ.onScaleBegin(scaleFactor);
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        o.LJIIIZ(e, "e");
        return this.LIZ.onSingleTapConfirmed(e);
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJLIL(C82537WaL detector, float f, float f2) {
        o.LJIIIZ(detector, "detector");
        return this.LIZ.LJJLIL(detector, f, f2);
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        return this.LIZ.onFling(e1, e2, f, f2);
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        return this.LIZ.onScroll(e1, e2, f, f2);
    }
}
