package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import kotlin.jvm.internal.o;

/* renamed from: X.6V3, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6V3 implements C6V2 {
    public final /* synthetic */ C6V2 LIZ;

    @Override // X.C6V2
    public final void LJIIIIZZ(MotionEvent motionEvent) {
        this.LIZ.LJIIIIZZ(motionEvent);
    }

    @Override // X.C6V2
    public boolean LJJIIZI(MotionEvent motionEvent) {
        return this.LIZ.LJJIIZI(motionEvent);
    }

    @Override // X.C6V2
    public final boolean LJJIZ(float f) {
        return this.LIZ.LJJIZ(f);
    }

    @Override // X.C6V2
    public final boolean LJJJ(MotionEvent motionEvent) {
        return this.LIZ.LJJJ(motionEvent);
    }

    @Override // X.C6V2
    public final boolean LJJJI() {
        return this.LIZ.LJJJI();
    }

    @Override // X.C6V2
    public final boolean LJJJIL() {
        return this.LIZ.LJJJIL();
    }

    @Override // X.C6V2
    public final boolean LJJLIL(C82537WaL c82537WaL, float f, float f2) {
        return this.LIZ.LJJLIL(c82537WaL, f, f2);
    }

    @Override // X.C6V2
    public boolean LJLI(C82537WaL c82537WaL) {
        return this.LIZ.LJLI(c82537WaL);
    }

    @Override // X.C6V2
    public final boolean LJLJI(float f) {
        return this.LIZ.LJLJI(f);
    }

    @Override // X.C6V2
    public final void LJLJJI(C82537WaL c82537WaL) {
        this.LIZ.LJLJJI(c82537WaL);
    }

    @Override // X.C6V2
    public final boolean LLLLLLLZIL(C82536WaK c82536WaK) {
        return this.LIZ.LLLLLLLZIL(c82536WaK);
    }

    @Override // X.C6V2
    public final boolean LLLLLLZ(float f) {
        return this.LIZ.LLLLLLZ(f);
    }

    @Override // X.C6V2
    public final boolean onDown(MotionEvent motionEvent) {
        return this.LIZ.onDown(motionEvent);
    }

    @Override // X.C6V2
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.LIZ.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // X.C6V2
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return this.LIZ.onScale(scaleGestureDetector);
    }

    @Override // X.C6V2
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return this.LIZ.onScaleBegin(scaleGestureDetector);
    }

    @Override // X.C6V2
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.LIZ.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // X.C6V2
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return this.LIZ.onSingleTapConfirmed(motionEvent);
    }

    @Override // X.C6V2
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.LIZ.onSingleTapUp(motionEvent);
    }

    public C6V3(C6V2 delegate) {
        o.LJIIIZ(delegate, "delegate");
        this.LIZ = delegate;
    }
}
