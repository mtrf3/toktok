package com.bytedance.tux.input;

import X.C101273yF;
import X.C16880lQ;
import X.C224658rl;
import X.C224668rm;
import X.C224688ro;
import X.C74247TBz;
import X.InterfaceC224678rn;
import X.TC0;
import Y.ARunnableS22S0200000_3;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TuxTextLayoutView extends View {
    public Layout LJLIL;
    public C74247TBz LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public C224658rl LJLJJLL;
    public C224668rm LJLJL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TuxTextLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void LIZJ() {
        C224668rm c224668rm = this.LJLJL;
        if (c224668rm == null) {
            return;
        }
        c224668rm.LIZ.LIZLLL(this, c224668rm.LIZIZ);
        this.LJLJL = null;
        invalidate();
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        Layout layout = this.LJLIL;
        if (layout != null) {
            return layout.getHeight();
        }
        return super.computeVerticalScrollRange();
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        Layout layout = this.LJLIL;
        if (layout == null) {
            return 0.0f;
        }
        if (getScrollY() >= layout.getHeight() - ((getHeight() - getPaddingTop()) - getPaddingBottom())) {
            return 0.0f;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLJJI = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLJJI = true;
    }

    public final Layout getTextLayout() {
        return this.LJLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LIZ(MotionEvent motionEvent) {
        Integer valueOf;
        Layout layout = this.LJLIL;
        boolean z = false;
        if (layout == null) {
            return false;
        }
        CharSequence text = layout.getText();
        if (!(text instanceof Spanned)) {
            return LIZIZ(motionEvent);
        }
        InterfaceC224678rn interfaceC224678rn = null;
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null && (valueOf.intValue() == 1 || valueOf.intValue() == 0)) {
            int LLLLLLL = C16880lQ.LLLLLLL(layout, layout.getLineForVertical(getScrollY() + ((int) motionEvent.getY())), getScrollX() + ((int) motionEvent.getX()));
            Spanned spanned = (Spanned) text;
            ClickableSpan[] links = (ClickableSpan[]) spanned.getSpans(LLLLLLL, LLLLLLL, ClickableSpan.class);
            o.LJIIIIZZ(links, "links");
            if (links.length == 0) {
                if (text instanceof Spannable) {
                    Selection.removeSelection((Spannable) text);
                }
            } else {
                C101273yF c101273yF = links[0];
                if (c101273yF instanceof InterfaceC224678rn) {
                    int intValue = valueOf.intValue();
                    if (intValue != 0) {
                        if (intValue == 1) {
                            ((InterfaceC224678rn) c101273yF).LIZLLL(this, spanned);
                        }
                    } else {
                        InterfaceC224678rn interfaceC224678rn2 = (InterfaceC224678rn) c101273yF;
                        interfaceC224678rn2.LIZJ(this, spanned);
                        this.LJLJL = new C224668rm(interfaceC224678rn2, spanned, LLLLLLL);
                    }
                    z = true;
                }
                if (valueOf.intValue() == 1) {
                    C224668rm c224668rm = this.LJLJL;
                    if (c224668rm != null) {
                        interfaceC224678rn = c224668rm.LIZ;
                    }
                    if (!o.LJ(c101273yF, interfaceC224678rn)) {
                        LIZJ();
                    }
                }
                if (valueOf.intValue() == 1) {
                    c101273yF.onClick(this);
                }
                if (z) {
                    invalidate();
                }
                return true;
            }
        }
        return false;
    }

    public final boolean LIZIZ(MotionEvent motionEvent) {
        Layout layout;
        C224658rl c224658rl;
        if (motionEvent == null || (layout = this.LJLIL) == null || layout.getHeight() <= this.LJLJJL) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2 && (c224658rl = this.LJLJJLL) != null) {
                    if (!c224658rl.LJ) {
                        float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() / 4;
                        if (Math.abs(motionEvent.getX() - c224658rl.LIZ) >= scaledTouchSlop || Math.abs(motionEvent.getY() - c224658rl.LIZIZ) >= scaledTouchSlop) {
                            c224658rl.LJ = true;
                        }
                    }
                    if (c224658rl.LJ) {
                        c224658rl.LJFF = true;
                        float x = c224658rl.LIZ - motionEvent.getX();
                        float y = c224658rl.LIZIZ - motionEvent.getY();
                        c224658rl.LIZ = motionEvent.getX();
                        c224658rl.LIZIZ = motionEvent.getY();
                        int scrollX = getScrollX() + ((int) x);
                        int scrollY = getScrollY() + ((int) y);
                        int paddingBottom = getPaddingBottom() + getPaddingTop();
                        int paddingRight = getPaddingRight() + getPaddingLeft();
                        int height = layout.getHeight() - (getHeight() - paddingBottom);
                        if (scrollY > height) {
                            scrollY = height;
                        }
                        if (scrollY < 0) {
                            scrollY = 0;
                        }
                        int width = layout.getWidth() - (getWidth() - paddingRight);
                        if (scrollX > width) {
                            scrollX = width;
                        }
                        if (scrollX < 0) {
                            scrollX = 0;
                        }
                        int scrollX2 = getScrollX();
                        int scrollY2 = getScrollY();
                        if ((scrollY == 0 && y < 0.0f) || (scrollY == height && y > 0.0f)) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        } else {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        scrollTo(scrollX, scrollY);
                        if (scrollX2 != getScrollX() || scrollY2 != getScrollY()) {
                            cancelLongPress();
                        }
                        return true;
                    }
                }
                return false;
            }
            C224658rl c224658rl2 = this.LJLJJLL;
            this.LJLJJLL = null;
            if (c224658rl2 == null || !c224658rl2.LJFF) {
                return false;
            }
            LIZJ();
            invalidate();
            return true;
        }
        this.LJLJJLL = new C224658rl(motionEvent.getX(), motionEvent.getY(), getScrollX(), getScrollY());
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        canvas.save();
        Layout layout = this.LJLIL;
        if (layout != null) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
            layout.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo == null) {
            return;
        }
        accessibilityNodeInfo.setClassName("com.bytedance.tux.input.TuxTextLayoutView");
        Layout layout = this.LJLIL;
        if (layout == null || (charSequence = layout.getText()) == null) {
            charSequence = "";
        }
        accessibilityNodeInfo.setText(charSequence);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    LIZJ();
                    this.LJLJJLL = null;
                    return super.onTouchEvent(motionEvent);
                }
                boolean LIZIZ = LIZIZ(motionEvent);
                if (!super.onTouchEvent(motionEvent) && !LIZIZ) {
                    return false;
                }
                return true;
            }
            if (LIZIZ(motionEvent) || LIZ(motionEvent)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        boolean LIZIZ2 = LIZIZ(motionEvent);
        if (LIZ(motionEvent) || LIZIZ2) {
            z = true;
        } else {
            z = false;
        }
        if (!super.onTouchEvent(motionEvent) && !z) {
            return false;
        }
        return true;
    }

    public final void setMaxHeight(int i) {
        this.LJLJJL = i;
    }

    public final void setTextLayout(Layout layout) {
        this.LJLILLLLZI = null;
        this.LJLJL = null;
        this.LJLJJLL = null;
        setScrollX(0);
        setScrollY(0);
        if (!o.LJ(this.LJLIL, layout)) {
            this.LJLIL = layout;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C74247TBz c74247TBz = this.LJLILLLLZI;
        if (c74247TBz != null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            TC0 tc0 = c74247TBz.LIZIZ;
            if (tc0.LIZLLL != size || tc0.LIZJ != mode) {
                tc0.LIZLLL = size;
                tc0.LIZJ = mode;
                if (this.LJLJI) {
                    this.LJLJJI = true;
                    this.LJLIL = c74247TBz.LIZ();
                } else {
                    this.LJLJI = true;
                    ((ExecutorService) C224688ro.LIZ.getValue()).execute(new ARunnableS22S0200000_3(this, c74247TBz, 70));
                }
            }
        }
        Layout layout = this.LJLIL;
        if (layout != null) {
            int width = layout.getWidth() + getPaddingRight() + getPaddingLeft();
            int height = layout.getHeight() + getPaddingBottom() + getPaddingTop();
            int i3 = this.LJLJJL;
            if (height > i3) {
                height = i3;
            }
            setMeasuredDimension(width, height);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TuxTextLayoutView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            r1 = 2
            r0 = r10 & 2
            if (r0 == 0) goto L6
            r9 = 0
        L6:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r8, r0)
            r4 = 0
            r7.<init>(r8, r9, r4)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r7.LJLJJL = r2
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x0074: FILL_ARRAY_DATA , data: [16842904, 16843040, 16843087, 2130971874, 2130971992, 2130971993} // fill-array
            android.content.res.TypedArray r3 = r8.obtainStyledAttributes(r9, r0, r4, r4)
            java.lang.String r0 = "context.obtainStyledAttr…outView, defStyleAttr, 0)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            java.lang.String r0 = X.C16880lQ.LLLZLZ(r3, r1)
            r1 = 1
            if (r0 == 0) goto L60
            X.TBz r5 = new X.TBz
            r5.<init>()
            r5.LIZLLL(r0)
            r6 = 3
            boolean r0 = r3.hasValue(r6)
            if (r0 == 0) goto L41
            r0 = -1
            int r0 = r3.getInt(r6, r0)
            r5.LIZJ(r0)
        L41:
            boolean r0 = r3.hasValue(r4)
            if (r0 == 0) goto L50
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r3.getColor(r4, r0)
            r5.LJ(r0)
        L50:
            r0 = 4
            boolean r0 = r3.getBoolean(r0, r1)
            r5.LIZLLL = r0
            r0 = 5
            boolean r0 = r3.getBoolean(r0, r4)
            r5.LJ = r0
            r7.LJLILLLLZI = r5
        L60:
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L6c
            int r0 = r3.getDimensionPixelSize(r1, r2)
            r7.LJLJJL = r0
        L6c:
            r3.recycle()
            r7.setFocusable(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.input.TuxTextLayoutView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.LJLJI = false;
    }
}
