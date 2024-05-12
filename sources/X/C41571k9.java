package X;

import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;

/* renamed from: X.1k9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41571k9 extends C1QA {
    @Override // X.YLK
    public final void processLongPressEvent(float f, float f2) {
        Object obj = this.LIZ;
        if (obj != null) {
            ((IFilterManager) obj).processLongPressEvent(f, f2);
        }
    }

    @Override // X.YLK
    public final void processRotationEvent(float f, float f2) {
        Object obj = this.LIZ;
        if (obj != null) {
            ((IFilterManager) obj).processRotationEvent(-f, f2);
        }
    }

    @Override // X.YLK
    public final void processScaleEvent(float f, float f2) {
        Object obj = this.LIZ;
        if (obj != null) {
            ((IFilterManager) obj).processScaleEvent(f, f2);
        }
    }

    @Override // X.YLK
    public final void processTouchEvent(float f, float f2) {
        Object obj = this.LIZ;
        if (obj != null) {
            ((IFilterManager) obj).processTouchEvent(f, f2);
        }
    }

    @Override // X.YLK
    public final void processTouchDownEvent(float f, float f2, int i) {
        Object obj = this.LIZ;
        if (obj != null) {
            ((IFilterManager) obj).processTouchDownEvent(f, f2, i);
        }
    }

    @Override // X.YLK
    public final void processTouchUpEvent(float f, float f2, int i) {
        Object obj = this.LIZ;
        if (obj != null) {
            ((IFilterManager) obj).processTouchUpEvent(f, f2, i);
        }
    }

    @Override // X.YLK
    public final void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        Object obj = this.LIZ;
        if (obj != null) {
            ((IFilterManager) obj).processPanEvent(f, f2, f3, f4, f5);
        }
    }

    @Override // X.YLK
    public final void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2) {
        Object obj = this.LIZ;
        if (obj != null) {
            ((IFilterManager) obj).processTouchEventWithTouchType(j, f, f2, f3, f4, i, i2);
        }
    }
}
