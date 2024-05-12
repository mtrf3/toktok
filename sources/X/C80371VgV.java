package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VgV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80371VgV extends View {
    public static final int[] LJZL = {R.attr.bfy};
    public static final C80372VgW LL = new C80372VgW(Float.class);
    public Drawable LJLIL;
    public float LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public Rect LJLJJLL;
    public final RectF LJLJL;
    public boolean LJLJLJ;
    public ColorStateList LJLJLLL;
    public ObjectAnimator LJLL;
    public final Paint LJLLI;
    public final int LJLLILLLL;
    public InterfaceC80374VgY LJLLJ;
    public final int LJLLL;
    public final VelocityTracker LJLLLL;
    public int LJLLLLLL;
    public float LJLZ;
    public float LJZ;
    public boolean LJZI;

    private boolean getTargetCheckedState() {
        if (this.LJLILLLLZI > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f;
        if (C16310kV.LIZLLL(this) == 1) {
            f = 1.0f - this.LJLILLLLZI;
        } else {
            f = this.LJLILLLLZI;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        return getMeasuredWidth() - this.LJLJI;
    }

    public Drawable getThumbDrawable() {
        return this.LJLIL;
    }

    public Rect getThumbRect() {
        return this.LJLJJLL;
    }

    public int getTrackPadding() {
        return this.LJLJJI;
    }

    public int getTrackRadius() {
        return this.LJLJJL;
    }

    public ColorStateList getTrackTintList() {
        return this.LJLJLLL;
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.LJLJLJ) {
            View.mergeDrawableStates(onCreateDrawableState, LJZL);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int[] drawableState = getDrawableState();
        ColorStateList colorStateList = this.LJLJLLL;
        if (colorStateList != null) {
            this.LJLLI.setColor(colorStateList.getColorForState(drawableState, -65536));
        }
        RectF rectF = this.LJLJL;
        rectF.left = 0.0f;
        rectF.right = getMeasuredWidth();
        RectF rectF2 = this.LJLJL;
        rectF2.top = this.LJLJJI;
        rectF2.bottom = getMeasuredHeight() - this.LJLJJI;
        RectF rectF3 = this.LJLJL;
        int i = this.LJLJJL;
        canvas.drawRoundRect(rectF3, i, i, this.LJLLI);
        this.LJLJJLL.left = getThumbOffset();
        Rect rect = this.LJLJJLL;
        rect.right = rect.left + this.LJLJI;
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.setBounds(rect);
            this.LJLIL.setState(drawableState);
            this.LJLIL.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r0 != 3) goto L11;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80371VgV.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        if (this.LJLJLJ != z) {
            this.LJLJLJ = z;
            InterfaceC80374VgY interfaceC80374VgY = this.LJLLJ;
            if (interfaceC80374VgY != null) {
                interfaceC80374VgY.LIZ(z);
            }
        }
        refreshDrawableState();
        float f = 0.0f;
        if (getWindowToken() != null && C16330kX.LIZJ(this)) {
            if (z) {
                f = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, LL, f);
            this.LJLL = ofFloat;
            ofFloat.setDuration(250L);
            this.LJLL.setAutoCancel(true);
            this.LJLL.start();
            return;
        }
        ObjectAnimator objectAnimator = this.LJLL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z) {
            f = 1.0f;
        }
        setThumbPosition(f);
    }

    public void setEnableTouch(boolean z) {
        this.LJZI = z;
    }

    public void setOnCheckedChangeListener(InterfaceC80374VgY interfaceC80374VgY) {
        this.LJLLJ = interfaceC80374VgY;
    }

    public void setThumbDrawable(Drawable drawable) {
        this.LJLIL = drawable;
    }

    public void setThumbPosition(float f) {
        this.LJLILLLLZI = f;
        invalidate();
    }

    public void setThumbRect(Rect rect) {
        this.LJLJJLL = rect;
    }

    public void setTrackPadding(int i) {
        this.LJLJJI = i;
    }

    public void setTrackRadius(int i) {
        this.LJLJJL = i;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.LJLJLLL = colorStateList;
    }

    public C80371VgV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.LJLLI = paint;
        this.LJLLLL = VelocityTracker.obtain();
        this.LJZI = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.y7, R.attr.y8, R.attr.y9, R.attr.y_});
        this.LJLIL = obtainStyledAttributes.getDrawable(0);
        this.LJLJLLL = obtainStyledAttributes.getColorStateList(3);
        this.LJLJJI = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.LJLJJL = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        obtainStyledAttributes.recycle();
        paint.setAntiAlias(true);
        this.LJLJJLL = new Rect();
        this.LJLJL = new RectF();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LJLLILLLL = viewConfiguration.getScaledTouchSlop();
        this.LJLLL = viewConfiguration.getScaledMinimumFlingVelocity();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Drawable drawable = this.LJLIL;
        if (drawable == null) {
            super.onMeasure(i, i2);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = this.LJLIL.getIntrinsicHeight();
        Rect rect = this.LJLJJLL;
        rect.left = 0;
        rect.top = 0;
        rect.right = intrinsicWidth;
        this.LJLJI = intrinsicWidth;
        rect.bottom = intrinsicHeight;
        this.LJLIL.setBounds(rect);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            setMeasuredDimension(size, intrinsicHeight);
        } else {
            setMeasuredDimension(intrinsicWidth * 2, intrinsicHeight);
        }
    }
}
