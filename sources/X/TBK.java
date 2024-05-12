package X;

import Y.AUListenerS99S0100000_12;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.tools.beauty.views.SwitchButton$SavedState;

/* loaded from: classes13.dex */
public class TBK extends CompoundButton {
    public static final int[] LLJIJIL = {R.attr.state_checked, R.attr.state_enabled, R.attr.state_pressed};
    public static final int[] LLJILJIL = {-16842912, R.attr.state_enabled, R.attr.state_pressed};
    public Drawable LJLIL;
    public Drawable LJLILLLLZI;
    public ColorStateList LJLJI;
    public ColorStateList LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public RectF LJLJL;
    public float LJLJLJ;
    public long LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public int LJZL;
    public Drawable LL;
    public Drawable LLD;
    public RectF LLF;
    public RectF LLFF;
    public RectF LLFFF;
    public RectF LLFII;
    public RectF LLFZ;
    public Paint LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public ValueAnimator LLIIIILZ;
    public float LLIIIJ;
    public RectF LLIIIL;
    public float LLIIIZ;
    public float LLIIJI;
    public float LLIIJLIL;
    public int LLIIL;
    public int LLIILII;
    public Paint LLIILZL;
    public CharSequence LLIIZ;
    public CharSequence LLIL;
    public TextPaint LLILII;
    public Layout LLILIL;
    public Layout LLILL;
    public float LLILLIZIL;
    public float LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public TBL LLJ;
    public CompoundButton.OnCheckedChangeListener LLJI;

    public final void LIZLLL() {
        int i;
        float max;
        float max2;
        if (this.LJLLILLLL == 0 || (i = this.LJLLJ) == 0 || this.LJLLL == 0 || this.LJLLLL == 0) {
            return;
        }
        if (this.LJLJJL == -1.0f) {
            this.LJLJJL = Math.min(r3, i) / 2.0f;
        }
        if (this.LJLJJLL == -1.0f) {
            this.LJLJJLL = Math.min(this.LJLLL, this.LJLLLL) / 2.0f;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int ceil = (int) Math.ceil((this.LJLLL - Math.min(0.0f, this.LJLJL.left)) - Math.min(0.0f, this.LJLJL.right));
        if (measuredHeight <= ((int) Math.ceil((this.LJLLLL - Math.min(0.0f, this.LJLJL.top)) - Math.min(0.0f, this.LJLJL.bottom)))) {
            max = Math.max(0.0f, this.LJLJL.top) + getPaddingTop();
        } else {
            max = (((measuredHeight - r9) + 1) / 2.0f) + Math.max(0.0f, this.LJLJL.top) + getPaddingTop();
        }
        if (measuredWidth <= this.LJLLL) {
            max2 = Math.max(0.0f, this.LJLJL.left) + getPaddingLeft();
        } else {
            max2 = (((measuredWidth - ceil) + 1) / 2.0f) + Math.max(0.0f, this.LJLJL.left) + getPaddingLeft();
        }
        this.LLF.set(max2, max, this.LJLLILLLL + max2, this.LJLLJ + max);
        RectF rectF = this.LLF;
        float f = rectF.left;
        RectF rectF2 = this.LJLJL;
        float f2 = f - rectF2.left;
        RectF rectF3 = this.LLFF;
        float f3 = rectF.top;
        float f4 = rectF2.top;
        rectF3.set(f2, f3 - f4, this.LJLLL + f2, (f3 - f4) + this.LJLLLL);
        RectF rectF4 = this.LLFFF;
        RectF rectF5 = this.LLF;
        rectF4.set(rectF5.left, 0.0f, (this.LLFF.right - this.LJLJL.right) - rectF5.width(), 0.0f);
        this.LJLJJLL = Math.min(Math.min(this.LLFF.width(), this.LLFF.height()) / 2.0f, this.LJLJJLL);
        Drawable drawable = this.LJLILLLLZI;
        if (drawable != null) {
            RectF rectF6 = this.LLFF;
            drawable.setBounds((int) rectF6.left, (int) rectF6.top, (int) Math.ceil(rectF6.right), (int) Math.ceil(this.LLFF.bottom));
        }
        if (this.LLILIL != null) {
            RectF rectF7 = this.LLFF;
            float LIZ = C1I0.LIZ(((rectF7.width() + this.LLILLL) - this.LJLLILLLL) - this.LJLJL.right, this.LLILIL.getWidth(), 2.0f, rectF7.left) - this.LLILZIL;
            RectF rectF8 = this.LLFF;
            float LIZ2 = C1I0.LIZ(rectF8.height(), this.LLILIL.getHeight(), 2.0f, rectF8.top);
            this.LLFII.set(LIZ, LIZ2, this.LLILIL.getWidth() + LIZ, this.LLILIL.getHeight() + LIZ2);
        }
        if (this.LLILL != null) {
            RectF rectF9 = this.LLFF;
            float width = ((rectF9.right - (((((rectF9.width() + this.LLILLL) - this.LJLLILLLL) - this.LJLJL.left) - this.LLILL.getWidth()) / 2.0f)) - this.LLILL.getWidth()) + this.LLILZIL;
            RectF rectF10 = this.LLFF;
            float LIZ3 = C1I0.LIZ(rectF10.height(), this.LLILL.getHeight(), 2.0f, rectF10.top);
            this.LLFZ.set(width, LIZ3, this.LLILL.getWidth() + width, this.LLILL.getHeight() + LIZ3);
        }
        this.LLIZ = true;
    }

    public PointF getBackSizeF() {
        return new PointF(this.LLFF.width(), this.LLFF.height());
    }

    public float getThumbHeight() {
        return this.LJLLJ;
    }

    public float getThumbWidth() {
        return this.LJLLILLLL;
    }

    private boolean getStatusBasedOnPos() {
        if (getProgress() > 0.5f) {
            return true;
        }
        return false;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int[] iArr;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        super.drawableStateChanged();
        if (!this.LLIFFJFJJ && (colorStateList2 = this.LJLJJI) != null) {
            this.LJLLLLLL = colorStateList2.getColorForState(getDrawableState(), this.LJLLLLLL);
        } else {
            setDrawableState(this.LJLIL);
        }
        boolean isChecked = isChecked();
        int[] iArr2 = LLJILJIL;
        int[] iArr3 = LLJIJIL;
        if (isChecked) {
            iArr = iArr2;
        } else {
            iArr = iArr3;
        }
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            int defaultColor = textColors.getDefaultColor();
            this.LJZI = textColors.getColorForState(iArr3, defaultColor);
            this.LJZL = textColors.getColorForState(iArr2, defaultColor);
        }
        if (!this.LLII && (colorStateList = this.LJLJI) != null) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), this.LJLZ);
            this.LJLZ = colorForState;
            this.LJZ = this.LJLJI.getColorForState(iArr, colorForState);
            return;
        }
        Drawable drawable = this.LJLILLLLZI;
        if ((drawable instanceof StateListDrawable) && this.LJLL) {
            drawable.setState(iArr);
            this.LLD = this.LJLILLLLZI.getCurrent().mutate();
        } else {
            this.LLD = null;
        }
        setDrawableState(this.LJLILLLLZI);
        Drawable drawable2 = this.LJLILLLLZI;
        if (drawable2 == null) {
            return;
        }
        this.LL = drawable2.getCurrent().mutate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SwitchButton$SavedState switchButton$SavedState = new SwitchButton$SavedState(super.onSaveInstanceState());
        switchButton$SavedState.LJLIL = this.LLIIZ;
        switchButton$SavedState.LJLILLLLZI = this.LLIL;
        return switchButton$SavedState;
    }

    private float getProgress() {
        return this.LLIIIJ;
    }

    public long getAnimationDuration() {
        return this.LJLJLLL;
    }

    public ColorStateList getBackColor() {
        return this.LJLJI;
    }

    public Drawable getBackDrawable() {
        return this.LJLILLLLZI;
    }

    public float getBackRadius() {
        return this.LJLJJLL;
    }

    public CharSequence getTextOff() {
        return this.LLIL;
    }

    public CharSequence getTextOn() {
        return this.LLIIZ;
    }

    public ColorStateList getThumbColor() {
        return this.LJLJJI;
    }

    public Drawable getThumbDrawable() {
        return this.LJLIL;
    }

    public RectF getThumbMargin() {
        return this.LJLJL;
    }

    public float getThumbRadius() {
        return this.LJLJJL;
    }

    public float getThumbRangeRatio() {
        return this.LJLJLJ;
    }

    public int getTintColor() {
        return this.LJLLI;
    }

    private void setDrawableState(Drawable drawable) {
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    private void setProgress(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.LLIIIJ = f;
        invalidate();
    }

    public final void LIZIZ(boolean z) {
        ValueAnimator valueAnimator = this.LLIIIILZ;
        if (valueAnimator == null) {
            return;
        }
        if (valueAnimator.isRunning()) {
            this.LLIIIILZ.cancel();
        }
        this.LLIIIILZ.setDuration(this.LJLJLLL);
        if (z) {
            this.LLIIIILZ.setFloatValues(this.LLIIIJ, 1.0f);
        } else {
            this.LLIIIILZ.setFloatValues(this.LLIIIJ, 0.0f);
        }
        this.LLIIIILZ.start();
    }

    public final Layout LIZJ(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT > 23) {
            return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.LLILII, (int) Math.ceil(Layout.getDesiredWidth(charSequence, r4))).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(1.1f, 0.0f).setIncludePad(false).build();
        }
        return null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        Layout layout;
        RectF rectF;
        RectF rectF2;
        float f;
        int i3;
        Drawable drawable;
        Drawable drawable2;
        super.onDraw(canvas);
        if (!this.LLIZ) {
            LIZLLL();
        }
        if (!this.LLIZ) {
            return;
        }
        if (this.LLII) {
            if (this.LJLL && this.LL != null && this.LLD != null) {
                if (isChecked()) {
                    drawable = this.LL;
                } else {
                    drawable = this.LLD;
                }
                if (isChecked()) {
                    drawable2 = this.LLD;
                } else {
                    drawable2 = this.LL;
                }
                int progress = (int) (getProgress() * 255.0f);
                drawable.setAlpha(progress);
                drawable.draw(canvas);
                drawable2.setAlpha(255 - progress);
                drawable2.draw(canvas);
            } else {
                this.LJLILLLLZI.setAlpha(255);
                this.LJLILLLLZI.draw(canvas);
            }
        } else if (this.LJLL) {
            if (isChecked()) {
                i = this.LJLZ;
            } else {
                i = this.LJZ;
            }
            if (isChecked()) {
                i2 = this.LJZ;
            } else {
                i2 = this.LJLZ;
            }
            int progress2 = (int) (getProgress() * 255.0f);
            this.LLI.setARGB((Color.alpha(i) * progress2) / 255, Color.red(i), Color.green(i), Color.blue(i));
            RectF rectF3 = this.LLFF;
            float f2 = this.LJLJJLL;
            canvas.drawRoundRect(rectF3, f2, f2, this.LLI);
            this.LLI.setARGB((Color.alpha(i2) * (255 - progress2)) / 255, Color.red(i2), Color.green(i2), Color.blue(i2));
            RectF rectF4 = this.LLFF;
            float f3 = this.LJLJJLL;
            canvas.drawRoundRect(rectF4, f3, f3, this.LLI);
            this.LLI.setAlpha(255);
        } else {
            this.LLI.setColor(this.LJLZ);
            RectF rectF5 = this.LLFF;
            float f4 = this.LJLJJLL;
            canvas.drawRoundRect(rectF5, f4, f4, this.LLI);
        }
        if (getProgress() > 0.5d) {
            layout = this.LLILIL;
        } else {
            layout = this.LLILL;
        }
        if (getProgress() > 0.5d) {
            rectF = this.LLFII;
        } else {
            rectF = this.LLFZ;
        }
        if (layout != null && rectF != null) {
            if (getProgress() < 0.25d) {
                f = 1.0f - (getProgress() * 4.0f);
            } else {
                f = 0.0f;
            }
            if (getProgress() >= 0.75d) {
                f = (getProgress() * 4.0f) - 3.0f;
            }
            int i4 = (int) (f * 255.0f);
            if (getProgress() > 0.5d) {
                i3 = this.LJZI;
            } else {
                i3 = this.LJZL;
            }
            layout.getPaint().setARGB((Color.alpha(i3) * i4) / 255, Color.red(i3), Color.green(i3), Color.blue(i3));
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            layout.draw(canvas);
            canvas.restore();
        }
        this.LLIIIL.set(this.LLF);
        this.LLIIIL.offset(this.LLFFF.width() * this.LLIIIJ, 0.0f);
        if (this.LLIFFJFJJ) {
            Drawable drawable3 = this.LJLIL;
            RectF rectF6 = this.LLIIIL;
            drawable3.setBounds((int) rectF6.left, (int) rectF6.top, (int) Math.ceil(rectF6.right), (int) Math.ceil(this.LLIIIL.bottom));
            this.LJLIL.draw(canvas);
        } else {
            this.LLI.setColor(this.LJLLLLLL);
            RectF rectF7 = this.LLIIIL;
            float f5 = this.LJLJJL;
            canvas.drawRoundRect(rectF7, f5, f5, this.LLI);
        }
        if (this.LLIIII) {
            this.LLIILZL.setColor(ColorProtector.parseColor("#AA0000"));
            canvas.drawRect(this.LLFF, this.LLIILZL);
            this.LLIILZL.setColor(ColorProtector.parseColor("#0000FF"));
            canvas.drawRect(this.LLIIIL, this.LLIILZL);
            this.LLIILZL.setColor(ColorProtector.parseColor("#000000"));
            RectF rectF8 = this.LLFFF;
            float f6 = rectF8.left;
            float f7 = this.LLF.top;
            canvas.drawLine(f6, f7, rectF8.right, f7, this.LLIILZL);
            this.LLIILZL.setColor(ColorProtector.parseColor("#00CC00"));
            if (getProgress() > 0.5d) {
                rectF2 = this.LLFII;
            } else {
                rectF2 = this.LLFZ;
            }
            canvas.drawRect(rectF2, this.LLIILZL);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SwitchButton$SavedState switchButton$SavedState = (SwitchButton$SavedState) parcelable;
        CharSequence charSequence = switchButton$SavedState.LJLIL;
        CharSequence charSequence2 = switchButton$SavedState.LJLILLLLZI;
        this.LLIIZ = charSequence;
        this.LLIL = charSequence2;
        this.LLILIL = null;
        this.LLILL = null;
        this.LLIZ = false;
        requestLayout();
        invalidate();
        this.LLILZLL = true;
        super.onRestoreInstanceState(switchButton$SavedState.getSuperState());
        this.LLILZLL = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r1 != 3) goto L18;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TBK.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnimationDuration(long j) {
        this.LJLJLLL = j;
    }

    public void setBackColor(ColorStateList colorStateList) {
        this.LJLJI = colorStateList;
        if (colorStateList != null) {
            setBackDrawable(null);
        }
        invalidate();
    }

    public void setBackColorRes(int i) {
        setBackColor(C04330Ez.LIZJ(i, getContext()));
    }

    public void setBackDrawable(Drawable drawable) {
        boolean z;
        this.LJLILLLLZI = drawable;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        this.LLII = z;
        refreshDrawableState();
        this.LLIZ = false;
        requestLayout();
        invalidate();
    }

    public void setBackDrawableRes(int i) {
        setBackDrawable(C04270Et.LIZIZ(getContext(), i));
    }

    public void setBackRadius(float f) {
        this.LJLJJLL = f;
        if (!this.LLII) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (isChecked() != z) {
            LIZIZ(z);
        }
        if (this.LLILZLL) {
            setCheckedImmediatelyNoEvent(z);
        } else {
            super.setChecked(z);
        }
    }

    public void setCheckedImmediately(boolean z) {
        float f;
        super.setChecked(z);
        ValueAnimator valueAnimator = this.LLIIIILZ;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LLIIIILZ.cancel();
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        setProgress(f);
        invalidate();
    }

    public void setCheckedImmediatelyNoEvent(boolean z) {
        if (this.LLJI == null) {
            setCheckedImmediately(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setCheckedImmediately(z);
        super.setOnCheckedChangeListener(this.LLJI);
    }

    public void setCheckedNoEvent(boolean z) {
        if (this.LLJI == null) {
            setChecked(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(z);
        super.setOnCheckedChangeListener(this.LLJI);
    }

    public void setDrawDebugRect(boolean z) {
        this.LLIIII = z;
        invalidate();
    }

    public void setFadeBack(boolean z) {
        this.LJLL = z;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.LLJI = onCheckedChangeListener;
    }

    public void setTextAdjust(int i) {
        this.LLILZIL = i;
        this.LLIZ = false;
        requestLayout();
        invalidate();
    }

    public void setTextExtra(int i) {
        this.LLILZ = i;
        this.LLIZ = false;
        requestLayout();
        invalidate();
    }

    public void setTextThumbInset(int i) {
        this.LLILLL = i;
        this.LLIZ = false;
        requestLayout();
        invalidate();
    }

    public void setThumbColor(ColorStateList colorStateList) {
        this.LJLJJI = colorStateList;
        if (colorStateList != null) {
            setThumbDrawable(null);
        }
        invalidate();
    }

    public void setThumbColorRes(int i) {
        setThumbColor(C04330Ez.LIZJ(i, getContext()));
    }

    public void setThumbDrawable(Drawable drawable) {
        boolean z;
        this.LJLIL = drawable;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        this.LLIFFJFJJ = z;
        refreshDrawableState();
        this.LLIZ = false;
        requestLayout();
        invalidate();
    }

    public void setThumbDrawableRes(int i) {
        setThumbDrawable(C04270Et.LIZIZ(getContext(), i));
    }

    public void setThumbMargin(RectF rectF) {
        if (rectF == null) {
            this.LJLJL.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.LLIZ = false;
            requestLayout();
            return;
        }
        this.LJLJL.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.LLIZ = false;
        requestLayout();
    }

    public void setThumbRadius(float f) {
        this.LJLJJL = f;
        if (!this.LLIFFJFJJ) {
            invalidate();
        }
    }

    public void setThumbRangeRatio(float f) {
        this.LJLJLJ = f;
        this.LLIZ = false;
        requestLayout();
    }

    public void setTintColor(int i) {
        this.LJLLI = i;
        this.LJLJJI = TBM.LIZIZ(i);
        this.LJLJI = TBM.LIZ(this.LJLLI);
        this.LLII = false;
        this.LLIFFJFJJ = false;
        refreshDrawableState();
        invalidate();
    }

    public TBK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes;
        Drawable drawable;
        ColorStateList colorStateList;
        float dimension;
        float dimension2;
        float dimension3;
        float dimension4;
        float dimension5;
        float dimension6;
        float dimension7;
        float dimension8;
        Drawable drawable2;
        ColorStateList colorStateList2;
        float f;
        int integer;
        boolean z;
        int color;
        String LLLZLZ;
        String LLLZLZ2;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        TypedArray obtainStyledAttributes2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        this.LLIIL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.LLIILII = ViewConfiguration.getTapTimeout() + ViewConfiguration.getPressedStateDuration();
        this.LLI = new Paint(1);
        Paint paint = new Paint(1);
        this.LLIILZL = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.LLIILZL.setStrokeWidth(getResources().getDisplayMetrics().density);
        this.LLILII = getPaint();
        this.LLF = new RectF();
        this.LLFF = new RectF();
        this.LLFFF = new RectF();
        this.LJLJL = new RectF();
        this.LLFII = new RectF();
        this.LLFZ = new RectF();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 0.0f).setDuration(250L);
        this.LLIIIILZ = duration;
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        this.LLIIIILZ.addUpdateListener(new AUListenerS99S0100000_12(this, 16));
        this.LLIIIL = new RectF();
        float f2 = getResources().getDisplayMetrics().density * 2.0f;
        if (attributeSet == null || (obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{com.zhiliaoapp.musically.R.attr.ajy, com.zhiliaoapp.musically.R.attr.ajz, com.zhiliaoapp.musically.R.attr.ak0, com.zhiliaoapp.musically.R.attr.ak1, com.zhiliaoapp.musically.R.attr.ak2, com.zhiliaoapp.musically.R.attr.ak3, com.zhiliaoapp.musically.R.attr.ak4, com.zhiliaoapp.musically.R.attr.ak5, com.zhiliaoapp.musically.R.attr.ak6, com.zhiliaoapp.musically.R.attr.ak7, com.zhiliaoapp.musically.R.attr.ak8, com.zhiliaoapp.musically.R.attr.ak9, com.zhiliaoapp.musically.R.attr.ak_, com.zhiliaoapp.musically.R.attr.aka, com.zhiliaoapp.musically.R.attr.akb, com.zhiliaoapp.musically.R.attr.akc, com.zhiliaoapp.musically.R.attr.akd, com.zhiliaoapp.musically.R.attr.ake, com.zhiliaoapp.musically.R.attr.akf, com.zhiliaoapp.musically.R.attr.akg, com.zhiliaoapp.musically.R.attr.akh, com.zhiliaoapp.musically.R.attr.aki})) == null) {
            LLLZLZ = null;
            LLLZLZ2 = null;
            dimensionPixelSize = 0;
            dimensionPixelSize2 = 0;
            dimensionPixelSize3 = 0;
            color = 0;
            drawable = null;
            colorStateList2 = null;
            dimension3 = 0.0f;
            drawable2 = null;
            dimension = 0.0f;
            dimension5 = 0.0f;
            dimension6 = 0.0f;
            colorStateList = null;
            z = true;
            integer = LiveCoverMinSizeSetting.DEFAULT;
            dimension8 = -1.0f;
            dimension7 = -1.0f;
            f = 1.8f;
            dimension4 = 0.0f;
            dimension2 = 0.0f;
        } else {
            drawable = obtainStyledAttributes.getDrawable(11);
            colorStateList = obtainStyledAttributes.getColorStateList(10);
            float dimension9 = obtainStyledAttributes.getDimension(13, f2);
            dimension = obtainStyledAttributes.getDimension(15, dimension9);
            dimension2 = obtainStyledAttributes.getDimension(16, dimension9);
            dimension3 = obtainStyledAttributes.getDimension(17, dimension9);
            dimension4 = obtainStyledAttributes.getDimension(14, dimension9);
            dimension5 = obtainStyledAttributes.getDimension(20, 0.0f);
            dimension6 = obtainStyledAttributes.getDimension(12, 0.0f);
            dimension7 = obtainStyledAttributes.getDimension(18, -1.0f);
            dimension8 = obtainStyledAttributes.getDimension(3, -1.0f);
            drawable2 = obtainStyledAttributes.getDrawable(2);
            colorStateList2 = obtainStyledAttributes.getColorStateList(1);
            f = obtainStyledAttributes.getFloat(19, 1.8f);
            integer = obtainStyledAttributes.getInteger(0, LiveCoverMinSizeSetting.DEFAULT);
            z = obtainStyledAttributes.getBoolean(4, true);
            color = obtainStyledAttributes.getColor(21, 0);
            LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 8);
            LLLZLZ2 = C16880lQ.LLLZLZ(obtainStyledAttributes, 7);
            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(9, 0);
            dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            obtainStyledAttributes.recycle();
        }
        if (attributeSet == null || (obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.focusable, R.attr.clickable})) == null) {
            z2 = true;
            setFocusable(true);
            setClickable(true);
        } else {
            z2 = true;
            boolean z5 = obtainStyledAttributes2.getBoolean(0, true);
            boolean z6 = obtainStyledAttributes2.getBoolean(1, z5);
            setFocusable(z5);
            setClickable(z6);
            obtainStyledAttributes2.recycle();
        }
        this.LLIIZ = LLLZLZ;
        this.LLIL = LLLZLZ2;
        this.LLILLL = dimensionPixelSize;
        this.LLILZ = dimensionPixelSize2;
        this.LLILZIL = dimensionPixelSize3;
        this.LJLIL = drawable;
        this.LJLJJI = colorStateList;
        if (drawable != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLIFFJFJJ = z3;
        this.LJLLI = color;
        if (color == 0) {
            Context context2 = getContext();
            TypedValue typedValue = new TypedValue();
            if (context2.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, z2)) {
                i = typedValue.data;
            } else {
                i = 3309506;
            }
            this.LJLLI = i;
        }
        if (!this.LLIFFJFJJ && this.LJLJJI == null) {
            ColorStateList LIZIZ = TBM.LIZIZ(this.LJLLI);
            this.LJLJJI = LIZIZ;
            this.LJLLLLLL = LIZIZ.getDefaultColor();
        }
        this.LJLLILLLL = (int) Math.ceil(dimension5);
        this.LJLLJ = (int) Math.ceil(dimension6);
        this.LJLILLLLZI = drawable2;
        this.LJLJI = colorStateList2;
        if (drawable2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.LLII = z4;
        if (!z4 && colorStateList2 == null) {
            ColorStateList LIZ = TBM.LIZ(this.LJLLI);
            this.LJLJI = LIZ;
            int defaultColor = LIZ.getDefaultColor();
            this.LJLZ = defaultColor;
            this.LJZ = this.LJLJI.getColorForState(LLJIJIL, defaultColor);
        }
        this.LJLJL.set(dimension, dimension3, dimension2, dimension4);
        this.LJLJLJ = this.LJLJL.width() >= 0.0f ? Math.max(f, 1.0f) : f;
        this.LJLJJL = dimension7;
        this.LJLJJLL = dimension8;
        long j = integer;
        this.LJLJLLL = j;
        this.LJLL = z;
        this.LLIIIILZ.setDuration(j);
        if (isChecked()) {
            setProgress(1.0f);
        }
    }

    public static /* synthetic */ void LIZ(TBK tbk, ValueAnimator valueAnimator) {
        tbk.getClass();
        tbk.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        if (this.LLILIL == null && !TextUtils.isEmpty(this.LLIIZ)) {
            this.LLILIL = LIZJ(this.LLIIZ);
        }
        if (this.LLILL == null && !TextUtils.isEmpty(this.LLIL)) {
            this.LLILL = LIZJ(this.LLIL);
        }
        Layout layout = this.LLILIL;
        if (layout != null) {
            f = layout.getWidth();
        } else {
            f = 0.0f;
        }
        Layout layout2 = this.LLILL;
        if (layout2 != null) {
            f2 = layout2.getWidth();
        } else {
            f2 = 0.0f;
        }
        if (f != 0.0f || f2 != 0.0f) {
            this.LLILLIZIL = Math.max(f, f2);
        } else {
            this.LLILLIZIL = 0.0f;
        }
        Layout layout3 = this.LLILIL;
        if (layout3 != null) {
            f3 = layout3.getHeight();
        } else {
            f3 = 0.0f;
        }
        Layout layout4 = this.LLILL;
        if (layout4 != null) {
            f4 = layout4.getHeight();
        } else {
            f4 = 0.0f;
        }
        if (f3 != 0.0f || f4 != 0.0f) {
            this.LLILLJJLI = Math.max(f3, f4);
        } else {
            this.LLILLJJLI = 0.0f;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (this.LJLLILLLL == 0 && this.LLIFFJFJJ) {
            this.LJLLILLLL = this.LJLIL.getIntrinsicWidth();
        }
        int ceil = (int) Math.ceil(this.LLILLIZIL);
        if (this.LJLJLJ == 0.0f) {
            this.LJLJLJ = 1.8f;
        }
        if (mode == 1073741824) {
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            if (this.LJLLILLLL != 0) {
                int ceil2 = (int) Math.ceil(r0 * this.LJLJLJ);
                int i3 = this.LLILZ + ceil;
                int i4 = ceil2 - this.LJLLILLLL;
                RectF rectF = this.LJLJL;
                int ceil3 = i3 - (i4 + ((int) Math.ceil(Math.max(rectF.left, rectF.right))));
                float f5 = ceil2;
                RectF rectF2 = this.LJLJL;
                int ceil4 = (int) Math.ceil(rectF2.left + f5 + rectF2.right + Math.max(ceil3, 0));
                this.LJLLL = ceil4;
                if (ceil4 < 0) {
                    this.LJLLILLLL = 0;
                }
                if (Math.max(this.LJLJL.right, 0.0f) + Math.max(this.LJLJL.left, 0.0f) + f5 + Math.max(ceil3, 0) > paddingLeft) {
                    this.LJLLILLLL = 0;
                }
            }
            int ceil5 = (int) Math.ceil((((size - getPaddingLeft()) - getPaddingRight()) - Math.max(this.LJLJL.left, 0.0f)) - Math.max(this.LJLJL.right, 0.0f));
            if (ceil5 < 0) {
                this.LJLLILLLL = 0;
                this.LJLLL = 0;
            } else {
                float f6 = ceil5;
                this.LJLLILLLL = (int) Math.ceil(f6 / this.LJLJLJ);
                RectF rectF3 = this.LJLJL;
                int ceil6 = (int) Math.ceil(f6 + rectF3.left + rectF3.right);
                this.LJLLL = ceil6;
                if (ceil6 < 0) {
                    this.LJLLILLLL = 0;
                    this.LJLLL = 0;
                } else {
                    int i5 = ceil + this.LLILZ;
                    int i6 = ceil5 - this.LJLLILLLL;
                    RectF rectF4 = this.LJLJL;
                    int ceil7 = i5 - (i6 + ((int) Math.ceil(Math.max(rectF4.left, rectF4.right))));
                    if (ceil7 > 0) {
                        this.LJLLILLLL -= ceil7;
                    }
                    if (this.LJLLILLLL < 0) {
                        this.LJLLILLLL = 0;
                        this.LJLLL = 0;
                    }
                }
            }
        } else {
            if (this.LJLLILLLL == 0) {
                this.LJLLILLLL = (int) Math.ceil(getResources().getDisplayMetrics().density * 20.0f);
            }
            if (this.LJLJLJ == 0.0f) {
                this.LJLJLJ = 1.8f;
            }
            int ceil8 = (int) Math.ceil(this.LJLLILLLL * this.LJLJLJ);
            float f7 = ceil + this.LLILZ;
            float f8 = ceil8 - this.LJLLILLLL;
            RectF rectF5 = this.LJLJL;
            int ceil9 = (int) Math.ceil(f7 - ((Math.max(rectF5.left, rectF5.right) + f8) + this.LLILLL));
            float f9 = ceil8;
            RectF rectF6 = this.LJLJL;
            int ceil10 = (int) Math.ceil(rectF6.left + f9 + rectF6.right + Math.max(0, ceil9));
            this.LJLLL = ceil10;
            if (ceil10 < 0) {
                this.LJLLILLLL = 0;
                this.LJLLL = 0;
            } else {
                int ceil11 = (int) Math.ceil(Math.max(0.0f, this.LJLJL.right) + Math.max(0.0f, this.LJLJL.left) + f9 + Math.max(0, ceil9));
                size = Math.max(ceil11, getPaddingRight() + getPaddingLeft() + ceil11);
            }
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.LJLLJ == 0 && this.LLIFFJFJJ) {
            this.LJLLJ = this.LJLIL.getIntrinsicHeight();
        }
        if (mode2 == 1073741824) {
            if (this.LJLLJ != 0) {
                RectF rectF7 = this.LJLJL;
                this.LJLLLL = (int) Math.ceil(r0 + rectF7.top + rectF7.bottom);
                this.LJLLLL = (int) Math.ceil(Math.max(r2, this.LLILLJJLI));
                if (((getPaddingBottom() + (getPaddingTop() + r2)) - Math.min(0.0f, this.LJLJL.top)) - Math.min(0.0f, this.LJLJL.bottom) > size2) {
                    this.LJLLJ = 0;
                }
            }
            int ceil12 = (int) Math.ceil(Math.min(0.0f, this.LJLJL.bottom) + Math.min(0.0f, this.LJLJL.top) + ((size2 - getPaddingTop()) - getPaddingBottom()));
            this.LJLLLL = ceil12;
            if (ceil12 < 0) {
                this.LJLLLL = 0;
                this.LJLLJ = 0;
            } else {
                RectF rectF8 = this.LJLJL;
                int ceil13 = (int) Math.ceil((ceil12 - rectF8.top) - rectF8.bottom);
                this.LJLLJ = ceil13;
                if (ceil13 < 0) {
                    this.LJLLLL = 0;
                    this.LJLLJ = 0;
                }
            }
        } else {
            if (this.LJLLJ == 0) {
                this.LJLLJ = (int) Math.ceil(getResources().getDisplayMetrics().density * 20.0f);
            }
            float f10 = this.LJLLJ;
            RectF rectF9 = this.LJLJL;
            int ceil14 = (int) Math.ceil(f10 + rectF9.top + rectF9.bottom);
            this.LJLLLL = ceil14;
            if (ceil14 < 0) {
                this.LJLLLL = 0;
                this.LJLLJ = 0;
            } else {
                int ceil15 = (int) Math.ceil(this.LLILLJJLI - ceil14);
                if (ceil15 > 0) {
                    this.LJLLLL += ceil15;
                    this.LJLLJ += ceil15;
                }
                int max = Math.max(this.LJLLJ, this.LJLLLL);
                size2 = Math.max(Math.max(max, getPaddingBottom() + getPaddingTop() + max), getSuggestedMinimumHeight());
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            LIZLLL();
        }
    }
}
