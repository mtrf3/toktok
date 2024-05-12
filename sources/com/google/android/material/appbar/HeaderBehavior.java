package com.google.android.material.appbar;

import X.C16300kU;
import X.C45621qg;
import X.C78609UtB;
import X.C80214Vdy;
import X.RunnableC80208Vds;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* loaded from: classes15.dex */
public abstract class HeaderBehavior<V extends View> extends C80214Vdy<V> {
    public int activePointerId;
    public Runnable flingRunnable;
    public boolean isBeingDragged;
    public int lastMotionY;
    public OverScroller scroller;
    public int touchSlop;
    public VelocityTracker velocityTracker;

    public boolean canDragView(V v) {
        return false;
    }

    public void onFlingFinished(C45621qg c45621qg, V v) {
    }

    private void ensureVelocityTracker() {
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
    }

    public HeaderBehavior() {
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    public int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset();
    }

    public int getMaxDragOffset(V v) {
        return -v.getHeight();
    }

    public int getScrollRangeForDragFling(V v) {
        return v.getHeight();
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    @Override // X.C06C
    public boolean onInterceptTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(c45621qg.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.isBeingDragged) {
            int i = this.activePointerId;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.lastMotionY) > this.touchSlop) {
                this.lastMotionY = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.activePointerId = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (canDragView(v) && c45621qg.LJII(x, y2, v)) {
                z = true;
            } else {
                z = false;
            }
            this.isBeingDragged = z;
            if (z) {
                this.lastMotionY = y2;
                this.activePointerId = motionEvent.getPointerId(0);
                ensureVelocityTracker();
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0028 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    @Override // X.C06C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(X.C45621qg r18, V r19, android.view.MotionEvent r20) {
        /*
            r17 = this;
            r3 = r20
            int r1 = r3.getActionMasked()
            r4 = -1
            r2 = 1
            r10 = 0
            r6 = r18
            r5 = r17
            r7 = r19
            if (r1 == r2) goto L60
            r0 = 2
            if (r1 == r0) goto L45
            r0 = 3
            if (r1 == r0) goto L92
            r0 = 6
            if (r1 == r0) goto L2b
        L1a:
            r1 = 0
        L1b:
            android.view.VelocityTracker r0 = r5.velocityTracker
            if (r0 == 0) goto L22
            r0.addMovement(r3)
        L22:
            boolean r0 = r5.isBeingDragged
            if (r0 != 0) goto L28
            if (r1 == 0) goto L29
        L28:
            return r2
        L29:
            r2 = 0
            goto L28
        L2b:
            int r0 = r3.getActionIndex()
            if (r0 != 0) goto L43
            r1 = 1
        L32:
            int r0 = r3.getPointerId(r1)
            r5.activePointerId = r0
            float r1 = r3.getY(r1)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            r5.lastMotionY = r0
            goto L1a
        L43:
            r1 = 0
            goto L32
        L45:
            int r0 = r5.activePointerId
            int r0 = r3.findPointerIndex(r0)
            if (r0 != r4) goto L4e
            return r10
        L4e:
            float r0 = r3.getY(r0)
            int r0 = (int) r0
            int r8 = r5.lastMotionY
            int r8 = r8 - r0
            r5.lastMotionY = r0
            int r9 = r5.getMaxDragOffset(r7)
            r5.scroll(r6, r7, r8, r9, r10)
            goto L1a
        L60:
            android.view.VelocityTracker r0 = r5.velocityTracker
            if (r0 == 0) goto L92
            r0.addMovement(r3)
            android.view.VelocityTracker r1 = r5.velocityTracker
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r0)
            android.view.VelocityTracker r1 = r5.velocityTracker
            int r0 = r5.activePointerId
            float r16 = r1.getYVelocity(r0)
            int r0 = r5.getScrollRangeForDragFling(r7)
            int r14 = -r0
            r11 = r5
            r12 = r6
            r13 = r7
            r15 = r10
            r11.fling(r12, r13, r14, r15, r16)
            r1 = 1
        L83:
            r5.isBeingDragged = r10
            r5.activePointerId = r4
            android.view.VelocityTracker r0 = r5.velocityTracker
            if (r0 == 0) goto L1b
            r0.recycle()
            r0 = 0
            r5.velocityTracker = r0
            goto L1b
        L92:
            r1 = 0
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onTouchEvent(X.1qg, android.view.View, android.view.MotionEvent):boolean");
    }

    public int setHeaderTopBottomOffset(C45621qg c45621qg, V v, int i) {
        return setHeaderTopBottomOffset(c45621qg, v, i, LiveLayoutPreloadThreadPriority.DEFAULT, Integer.MAX_VALUE);
    }

    public final boolean fling(C45621qg c45621qg, V v, int i, int i2, float f) {
        Runnable runnable = this.flingRunnable;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.flingRunnable = null;
        }
        if (this.scroller == null) {
            this.scroller = new OverScroller(v.getContext());
        }
        this.scroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, i2);
        if (this.scroller.computeScrollOffset()) {
            RunnableC80208Vds runnableC80208Vds = new RunnableC80208Vds(this, c45621qg, v);
            this.flingRunnable = runnableC80208Vds;
            C16300kU.LJIIL(v, runnableC80208Vds);
            return true;
        }
        onFlingFinished(c45621qg, v);
        return false;
    }

    public final int scroll(C45621qg c45621qg, V v, int i, int i2, int i3) {
        return setHeaderTopBottomOffset(c45621qg, v, getTopBottomOffsetForScrollingSibling() - i, i2, i3);
    }

    public int setHeaderTopBottomOffset(C45621qg c45621qg, V v, int i, int i2, int i3) {
        int LJJIIZ;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i2 != 0 && topAndBottomOffset >= i2 && topAndBottomOffset <= i3 && topAndBottomOffset != (LJJIIZ = C78609UtB.LJJIIZ(i, i2, i3))) {
            setTopAndBottomOffset(LJJIIZ);
            return topAndBottomOffset - LJJIIZ;
        }
        return 0;
    }
}
