package X;

import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.aRd, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93485aRd {
    public final EnumC93486aRe LIZ;
    public final MotionEvent LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93485aRd)) {
            return false;
        }
        C93485aRd c93485aRd = (C93485aRd) obj;
        return o.LJ(this.LIZ, c93485aRd.LIZ) && o.LJ(this.LIZIZ, c93485aRd.LIZIZ);
    }

    public final int hashCode() {
        EnumC93486aRe enumC93486aRe = this.LIZ;
        int hashCode = (enumC93486aRe != null ? enumC93486aRe.hashCode() : 0) * 31;
        MotionEvent motionEvent = this.LIZIZ;
        return hashCode + (motionEvent != null ? motionEvent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CanvasGestureOperateData(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", event=");
        LIZ.append(this.LIZIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C93485aRd(EnumC93486aRe type, MotionEvent event) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(event, "event");
        this.LIZ = type;
        this.LIZIZ = event;
    }
}
