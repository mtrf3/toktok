package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* loaded from: classes9.dex */
public class KO7 extends FrameLayout {
    public int LJLIL;
    public VelocityTracker LJLILLLLZI;
    public int LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public int LJLLI;

    public void setOnScrollListener(KO8 ko8) {
    }

    public final void LIZ(MotionEvent motionEvent) {
        int i = this.LJLJL;
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex == -1) {
            this.LJLJL = -1;
        }
        if (i == -1 || findPointerIndex == -1) {
            return;
        }
        float x = motionEvent.getX(findPointerIndex);
        float abs = Math.abs(x - this.LJLJJI);
        float y = motionEvent.getY(findPointerIndex);
        float abs2 = Math.abs(y - this.LJLJJL);
        float f = this.LJLIL;
        if (abs2 > f && abs2 > abs) {
            this.LJLL = true;
            this.LJLJJI = x;
            this.LJLJJL = y;
        } else {
            if (abs <= f) {
                return;
            }
            this.LJLJLJ = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r1 = r5.getAction()
            r3 = -1
            r0 = 3
            r2 = 0
            if (r1 == r0) goto L12
            r0 = 1
            if (r1 == r0) goto L12
            if (r1 == 0) goto L23
            boolean r0 = r4.LJLJLJ
            if (r0 == 0) goto L43
        L12:
            r4.LJLL = r2
            r4.LJLJLJ = r2
            r4.LJLJL = r3
            android.view.VelocityTracker r0 = r4.LJLILLLLZI
            if (r0 == 0) goto L22
            r0.recycle()
            r0 = 0
            r4.LJLILLLLZI = r0
        L22:
            return r2
        L23:
            int r1 = r5.getActionIndex()
            int r0 = r5.getPointerId(r1)
            r4.LJLJL = r0
            if (r0 != r3) goto L30
            goto L4a
        L30:
            float r0 = r5.getX(r1)
            r4.LJLJJI = r0
            float r0 = r5.getY(r1)
            r4.LJLJJL = r0
            r4.LJLJJLL = r0
            r4.LJLL = r2
            r4.LJLJLJ = r2
            goto L4a
        L43:
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L23
            r0 = 2
            if (r1 == r0) goto L60
        L4a:
            boolean r0 = r4.LJLL
            if (r0 != 0) goto L5d
            android.view.VelocityTracker r0 = r4.LJLILLLLZI
            if (r0 != 0) goto L58
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.LJLILLLLZI = r0
        L58:
            android.view.VelocityTracker r0 = r4.LJLILLLLZI
            r0.addMovement(r5)
        L5d:
            boolean r0 = r4.LJLL
            return r0
        L60:
            int r0 = r4.LJLJL
            int r1 = r5.findPointerIndex(r0)
            if (r1 != r3) goto L6a
            r4.LJLJL = r3
        L6a:
            int r0 = r4.LJLJL
            if (r0 != r3) goto L6f
            goto L4a
        L6f:
            r5.getY(r1)
            r4.LIZ(r5)
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KO7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = VelocityTracker.obtain();
        }
        this.LJLILLLLZI.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                int findPointerIndex = motionEvent.findPointerIndex(this.LJLJL);
                                if (findPointerIndex == -1) {
                                    this.LJLJL = -1;
                                }
                                if (this.LJLJL != -1) {
                                    this.LJLJJL = motionEvent.getY(findPointerIndex);
                                    this.LJLJJI = motionEvent.getX(findPointerIndex);
                                }
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.LJLJJL = motionEvent.getY(actionIndex);
                            this.LJLJJI = motionEvent.getX(actionIndex);
                            this.LJLJL = motionEvent.getPointerId(actionIndex);
                        }
                    }
                } else {
                    if (!this.LJLL) {
                        LIZ(motionEvent);
                        if (this.LJLJLJ) {
                            return false;
                        }
                    }
                    if (this.LJLL) {
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.LJLJL);
                        if (findPointerIndex2 == -1) {
                            this.LJLJL = -1;
                        }
                        if (this.LJLJL != -1) {
                            float y = motionEvent.getY(findPointerIndex2);
                            float f = this.LJLJJL - y;
                            this.LJLJJL = y;
                            float f2 = this.LJLLI + f;
                            int i = (int) f2;
                            this.LJLJJI = (f2 - i) + this.LJLJJI;
                            this.LJLLI = i;
                        }
                    }
                }
            }
            if (this.LJLL) {
                VelocityTracker velocityTracker = this.LJLILLLLZI;
                velocityTracker.computeCurrentVelocity(1000, this.LJLJI);
                int yVelocity = (int) velocityTracker.getYVelocity(this.LJLJL);
                int findPointerIndex3 = motionEvent.findPointerIndex(this.LJLJL);
                if (findPointerIndex3 == -1) {
                    this.LJLJL = -1;
                }
                if (this.LJLJL != -1 && Math.abs((int) (motionEvent.getY(findPointerIndex3) - this.LJLJJLL)) > this.LJLJLLL) {
                    Math.abs(yVelocity);
                }
                this.LJLL = false;
                this.LJLJLJ = false;
                this.LJLJL = -1;
                VelocityTracker velocityTracker2 = this.LJLILLLLZI;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.LJLILLLLZI = null;
                }
            }
        } else {
            this.LJLJL = motionEvent.getPointerId(motionEvent.getActionIndex());
            float y2 = motionEvent.getY();
            this.LJLJJLL = y2;
            this.LJLJJL = y2;
            this.LJLJJI = motionEvent.getX();
        }
        return true;
    }

    public KO7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJL = -1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.LJLIL = viewConfiguration.getScaledTouchSlop();
        viewConfiguration.getScaledMinimumFlingVelocity();
        this.LJLJI = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LJLJLLL = (int) (getContext().getResources().getDisplayMetrics().density * 25.0f);
    }
}
