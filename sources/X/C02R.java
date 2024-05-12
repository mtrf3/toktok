package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;

/* renamed from: X.02R, reason: invalid class name */
/* loaded from: classes.dex */
public class C02R extends FrameLayout {
    public boolean LJLIL;
    public C013503n LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public Drawable LJLJJL;
    public Drawable LJLJJLL;
    public Drawable LJLJL;
    public final boolean LJLJLJ;
    public boolean LJLJLLL;
    public final int LJLL;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.LJLJJL;
        if (drawable != null && drawable.isStateful()) {
            this.LJLJJL.setState(getDrawableState());
        }
        Drawable drawable2 = this.LJLJJLL;
        if (drawable2 != null && drawable2.isStateful()) {
            this.LJLJJLL.setState(getDrawableState());
        }
        Drawable drawable3 = this.LJLJL;
        if (drawable3 != null && drawable3.isStateful()) {
            this.LJLJL.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.LJLJJL;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.LJLJJLL;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.LJLJL;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LJLJI = findViewById(R.id.nk);
        this.LJLJJI = findViewById(R.id.o6);
    }

    public View getTabContainer() {
        return this.LJLILLLLZI;
    }

    public static int LIZ(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLIL || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.LJLJJL;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.LJLJJL);
        }
        this.LJLJJL = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.LJLJI;
            if (view != null) {
                this.LJLJJL.setBounds(view.getLeft(), this.LJLJI.getTop(), this.LJLJI.getRight(), this.LJLJI.getBottom());
            }
        }
        boolean z = true;
        if (!this.LJLJLJ ? this.LJLJJL != null || this.LJLJJLL != null : this.LJLJL != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.LJLJL;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.LJLJL);
        }
        this.LJLJL = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.LJLJLJ && (drawable2 = this.LJLJL) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.LJLJLJ ? !(this.LJLJJL != null || this.LJLJJLL != null) : this.LJLJL == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2;
        Drawable drawable3 = this.LJLJJLL;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.LJLJJLL);
        }
        this.LJLJJLL = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.LJLJLLL && (drawable2 = this.LJLJJLL) != null) {
                drawable2.setBounds(this.LJLILLLLZI.getLeft(), this.LJLILLLLZI.getTop(), this.LJLILLLLZI.getRight(), this.LJLILLLLZI.getBottom());
            }
        }
        if (!this.LJLJLJ ? !(this.LJLJJL != null || this.LJLJJLL != null) : this.LJLJL == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(C013503n c013503n) {
        C013503n c013503n2 = this.LJLILLLLZI;
        if (c013503n2 != null) {
            if (C78996UzQ.LJJIIJZLJL(c013503n2)) {
                C78996UzQ.LJI();
            }
            removeView(c013503n2);
        }
        this.LJLILLLLZI = c013503n;
        if (c013503n != null) {
            addView(c013503n);
            ViewGroup.LayoutParams layoutParams = c013503n.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c013503n.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        int i;
        this.LJLIL = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.LJLJJL;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.LJLJJLL;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.LJLJL;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if ((drawable == this.LJLJJL && !this.LJLJLJ) || ((drawable == this.LJLJJLL && this.LJLJLLL) || ((drawable == this.LJLJL && this.LJLJLJ) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    public C02R(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C16300kU.LJIILLIIL(this, new Drawable(this) { // from class: X.034
            public final C02R LIZ;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return 0;
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
            }

            {
                this.LIZ = this;
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                C02R c02r = this.LIZ;
                if (c02r.LJLJLJ) {
                    Drawable drawable = c02r.LJLJL;
                    if (drawable != null) {
                        drawable.draw(canvas);
                        return;
                    }
                    return;
                }
                Drawable drawable2 = c02r.LJLJJL;
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
                C02R c02r2 = this.LIZ;
                Drawable drawable3 = c02r2.LJLJJLL;
                if (drawable3 == null || !c02r2.LJLJLLL) {
                    return;
                }
                drawable3.draw(canvas);
            }

            @Override // android.graphics.drawable.Drawable
            public final void getOutline(Outline outline) {
                C02R c02r = this.LIZ;
                if (c02r.LJLJLJ) {
                    Drawable drawable = c02r.LJLJL;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                        return;
                    }
                    return;
                }
                Drawable drawable2 = c02r.LJLJJL;
                if (drawable2 == null) {
                    return;
                }
                drawable2.getOutline(outline);
            }
        });
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.x8, R.attr.xi, R.attr.xj, R.attr.a70, R.attr.a71, R.attr.a72, R.attr.a73, R.attr.a74, R.attr.a75, R.attr.a8z, R.attr.a_9, R.attr.a_b, R.attr.ab6, R.attr.afg, R.attr.afo, R.attr.ag1, R.attr.ag2, R.attr.ag7, R.attr.ahg, R.attr.aj3, R.attr.ay3, R.attr.b1u, R.attr.b52, R.attr.b5w, R.attr.b5x, R.attr.bfi, R.attr.bfl, R.attr.bje, R.attr.bjt});
        boolean z = false;
        this.LJLJJL = obtainStyledAttributes.getDrawable(0);
        this.LJLJJLL = obtainStyledAttributes.getDrawable(2);
        this.LJLL = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.ka2) {
            this.LJLJLJ = true;
            this.LJLJL = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.LJLJLJ ? !(this.LJLJJL != null || this.LJLJJLL != null) : this.LJLJL == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.LJLJI == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i4 = this.LJLL) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i2)), LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        super.onMeasure(i, i2);
        if (this.LJLJI == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        C013503n c013503n = this.LJLILLLLZI;
        if (c013503n != null && c013503n.getVisibility() != 8 && mode != 1073741824) {
            View view = this.LJLJI;
            int i5 = 0;
            if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
                View view2 = this.LJLJJI;
                if (view2 != null && view2.getVisibility() != 8 && view2.getMeasuredHeight() != 0) {
                    i5 = LIZ(this.LJLJJI);
                }
            } else {
                i5 = LIZ(this.LJLJI);
            }
            if (mode == Integer.MIN_VALUE) {
                i3 = View.MeasureSpec.getSize(i2);
            } else {
                i3 = Integer.MAX_VALUE;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(LIZ(this.LJLILLLLZI) + i5, i3));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        if (r6 != null) goto L7;
     */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            super.onLayout(r8, r9, r10, r11, r12)
            X.03n r6 = r7.LJLILLLLZI
            r1 = 8
            r3 = 0
            if (r6 == 0) goto Lbc
            int r0 = r6.getVisibility()
            if (r0 == r1) goto Lbc
            r5 = 1
        L11:
            int r0 = r6.getVisibility()
            if (r0 == r1) goto L2e
            int r4 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r6.getMeasuredHeight()
            int r1 = r4 - r0
            int r0 = r2.bottomMargin
            int r1 = r1 - r0
            int r4 = r4 - r0
            r6.layout(r9, r1, r11, r4)
        L2e:
            boolean r0 = r7.LJLJLJ
            if (r0 == 0) goto L45
            android.graphics.drawable.Drawable r2 = r7.LJLJL
            if (r2 == 0) goto L44
            int r1 = r7.getMeasuredWidth()
            int r0 = r7.getMeasuredHeight()
            r2.setBounds(r3, r3, r1, r0)
        L41:
            r7.invalidate()
        L44:
            return
        L45:
            android.graphics.drawable.Drawable r0 = r7.LJLJJL
            if (r0 == 0) goto L6f
            android.view.View r0 = r7.LJLJI
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L8b
            android.graphics.drawable.Drawable r4 = r7.LJLJJL
            android.view.View r0 = r7.LJLJI
            int r3 = r0.getLeft()
            android.view.View r0 = r7.LJLJI
            int r2 = r0.getTop()
            android.view.View r0 = r7.LJLJI
            int r1 = r0.getRight()
            android.view.View r0 = r7.LJLJI
            int r0 = r0.getBottom()
            r4.setBounds(r3, r2, r1, r0)
        L6e:
            r3 = 1
        L6f:
            r7.LJLJLLL = r5
            if (r5 == 0) goto Lb9
            android.graphics.drawable.Drawable r4 = r7.LJLJJLL
            if (r4 == 0) goto Lb9
            int r3 = r6.getLeft()
            int r2 = r6.getTop()
            int r1 = r6.getRight()
            int r0 = r6.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            goto L41
        L8b:
            android.view.View r0 = r7.LJLJJI
            if (r0 == 0) goto Lb3
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lb3
            android.graphics.drawable.Drawable r4 = r7.LJLJJL
            android.view.View r0 = r7.LJLJJI
            int r3 = r0.getLeft()
            android.view.View r0 = r7.LJLJJI
            int r2 = r0.getTop()
            android.view.View r0 = r7.LJLJJI
            int r1 = r0.getRight()
            android.view.View r0 = r7.LJLJJI
            int r0 = r0.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            goto L6e
        Lb3:
            android.graphics.drawable.Drawable r0 = r7.LJLJJL
            r0.setBounds(r3, r3, r3, r3)
            goto L6e
        Lb9:
            if (r3 == 0) goto L44
            goto L41
        Lbc:
            r5 = 0
            if (r6 == 0) goto L2e
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02R.onLayout(boolean, int, int, int, int):void");
    }
}
