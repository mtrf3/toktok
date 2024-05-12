package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SXx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72269SXx extends C72271SXz {
    public int LJLJLLL;
    public final C62822Ol8 LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public final int LJLZ;
    public int LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;

    private final View getDraggableView() {
        return (View) this.LJLL.getValue();
    }

    private final Paint getIllegalLinePaint() {
        return (Paint) this.LJZL.getValue();
    }

    private final Rect getIllegalLineRect() {
        return (Rect) this.LJZI.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (r2 != r8.LJZ) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZ(boolean r9) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72269SXx.LJJZ(boolean):void");
    }

    @Override // X.C72271SXz, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null || this.LJZ == 0 || getHighlightRect() == null) {
            return;
        }
        canvas.drawLine(getIllegalLineRect().left, getIllegalLineRect().top, getIllegalLineRect().right, getIllegalLineRect().bottom, getIllegalLinePaint());
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        View draggableView = getDraggableView();
        if (draggableView != null) {
            int action = event.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            if (!this.LJLLILLLL && !super.onInterceptTouchEvent(event)) {
                                return false;
                            }
                            return true;
                        }
                    } else {
                        if (this.LJLLILLLL) {
                            return true;
                        }
                        if (!this.LJLLI) {
                            return super.onInterceptTouchEvent(event);
                        }
                        float abs = Math.abs(event.getX() - this.LJLLJ);
                        float abs2 = Math.abs(event.getY() - this.LJLLL);
                        float f = this.LJLZ;
                        if (abs >= f || abs2 >= f) {
                            this.LJLLLL = event.getX();
                            this.LJLLLLLL = event.getY();
                            this.LJLLILLLL = true;
                        }
                        if (!this.LJLLILLLL && !super.onInterceptTouchEvent(event)) {
                            return false;
                        }
                        return true;
                    }
                }
                if (!this.LJLLILLLL) {
                    this.LJLLLLLL = -1.0f;
                    this.LJLLLL = -1.0f;
                    this.LJLLL = -1.0f;
                    this.LJLLJ = -1.0f;
                    this.LJLLILLLL = false;
                    this.LJLLI = false;
                }
                if (!this.LJLLILLLL && !super.onInterceptTouchEvent(event)) {
                    return false;
                }
                return true;
            }
            this.LJLLLLLL = -1.0f;
            this.LJLLLL = -1.0f;
            this.LJLLL = -1.0f;
            this.LJLLJ = -1.0f;
            this.LJLLILLLL = false;
            this.LJLLI = false;
            float x = event.getX();
            float y = event.getY();
            if (x >= draggableView.getX() && x <= draggableView.getX() + draggableView.getMeasuredWidth() && y >= draggableView.getY() && y <= draggableView.getY() + draggableView.getMeasuredHeight()) {
                this.LJLLJ = event.getX();
                this.LJLLL = event.getY();
                this.LJLLI = true;
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return super.onInterceptTouchEvent(event);
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Rect rect;
        View draggableView;
        o.LJIIIZ(event, "event");
        if (this.LJLLILLLL) {
            rect = getHighlightRect();
        } else {
            rect = null;
        }
        if (this.LJLLILLLL && rect != null && (draggableView = getDraggableView()) != null) {
            int action = event.getAction();
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return true;
                    }
                } else {
                    float x = event.getX() - this.LJLLLL;
                    float y = event.getY() - this.LJLLLLLL;
                    float x2 = draggableView.getX() + x;
                    float f = rect.left;
                    if (x2 < f) {
                        x2 = f;
                    }
                    float measuredWidth = draggableView.getMeasuredWidth() + x2;
                    int i = rect.right;
                    if (measuredWidth > i) {
                        x2 = i - draggableView.getMeasuredWidth();
                    }
                    if (x2 != draggableView.getX()) {
                        draggableView.setX(x2);
                        this.LJLLLL = event.getX();
                    }
                    float y2 = draggableView.getY() + y;
                    float f2 = rect.top;
                    if (y2 < f2) {
                        y2 = f2;
                    }
                    float measuredHeight = draggableView.getMeasuredHeight() + y2;
                    int i2 = rect.bottom;
                    if (measuredHeight > i2) {
                        y2 = i2 - draggableView.getMeasuredHeight();
                    }
                    if (y2 != draggableView.getY()) {
                        draggableView.setY(y2);
                        this.LJLLLLLL = event.getY();
                    }
                    LJJZ(true);
                    return true;
                }
            }
            this.LJLLLLLL = -1.0f;
            this.LJLLLL = -1.0f;
            this.LJLLL = -1.0f;
            this.LJLLJ = -1.0f;
            this.LJLLILLLL = false;
            this.LJLLI = false;
            LJJZ(false);
            return true;
        }
        return super.onTouchEvent(event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72269SXx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJLLL = -1;
        this.LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 625));
        this.LJLZ = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJZI = C221108m2.LIZIZ(C72270SXy.LJLIL);
        this.LJZL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 626));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a_w});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.DragChildLayout)");
            this.LJLJLLL = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // X.C72271SXz
    public final boolean LJJLJLI(int i, Rect rect) {
        View draggableView;
        if (rect != null && !o.LJ(getHighlightRect(), rect) && (draggableView = getDraggableView()) != null && (draggableView.getX() != 0.0f || draggableView.getY() != 0.0f)) {
            float x = draggableView.getX();
            float f = rect.left;
            if (x < f) {
                x = f;
            }
            float measuredWidth = draggableView.getMeasuredWidth() + x;
            int i2 = rect.right;
            if (measuredWidth > i2) {
                x = i2 - draggableView.getMeasuredWidth();
            }
            if (x != draggableView.getX()) {
                draggableView.setX(x);
            }
            float y = draggableView.getY();
            float f2 = rect.top;
            if (y < f2) {
                y = f2;
            }
            float measuredHeight = draggableView.getMeasuredHeight() + y;
            int i3 = rect.bottom;
            if (measuredHeight > i3) {
                y = i3 - draggableView.getMeasuredHeight();
            }
            if (y != draggableView.getY()) {
                draggableView.setY(y);
            }
        }
        return super.LJJLJLI(i, rect);
    }
}
