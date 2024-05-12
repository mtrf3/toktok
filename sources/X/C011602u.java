package X;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.appcompat.widget.a0;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Locale;
import o3.h0;

/* renamed from: X.02u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C011602u extends CompoundButton {
    public static final C011502t LLIL;
    public static final int[] LLILII = {R.attr.state_checked};
    public Drawable LJLIL;
    public ColorStateList LJLILLLLZI;
    public PorterDuff.Mode LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public Drawable LJLJJLL;
    public ColorStateList LJLJL;
    public PorterDuff.Mode LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public CharSequence LJLLLL;
    public CharSequence LJLLLLLL;
    public CharSequence LJLZ;
    public CharSequence LJZ;
    public boolean LJZI;
    public int LJZL;
    public final int LL;
    public float LLD;
    public float LLF;
    public final VelocityTracker LLFF;
    public final int LLFFF;
    public float LLFII;
    public int LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public final TextPaint LLIIIJ;
    public ColorStateList LLIIIL;
    public Layout LLIIIZ;
    public Layout LLIIJI;
    public C24310xP LLIIJLIL;
    public ObjectAnimator LLIIL;
    public C012203a LLIILII;
    public AnonymousClass196 LLIILZL;
    public final Rect LLIIZ;
    public int mSwitchWidth;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.02t] */
    static {
        final Class<Float> cls = Float.class;
        LLIL = new Property<C011602u, Float>(cls) { // from class: X.02t
            @Override // android.util.Property
            public final Float get(C011602u c011602u) {
                return Float.valueOf(c011602u.LLFII);
            }

            @Override // android.util.Property
            public final void set(C011602u c011602u, Float f) {
                c011602u.setThumbPosition(f.floatValue());
            }
        };
    }

    private C012203a getEmojiTextViewHelper() {
        if (this.LLIILII == null) {
            this.LLIILII = new C012203a(this);
        }
        return this.LLIILII;
    }

    private boolean getTargetCheckedState() {
        if (this.LLFII > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.LJLJJLL;
        if (drawable != null) {
            Rect rect2 = this.LLIIZ;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.LJLIL;
            if (drawable2 != null) {
                rect = C03D.LIZJ(drawable2);
            } else {
                rect = C03D.LIZJ;
            }
            return ((((this.mSwitchWidth - this.LLI) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    public final void LIZ() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            if (this.LJLJJI || this.LJLJJL) {
                Drawable mutate = C07840Sm.LJFF(drawable).mutate();
                this.LJLIL = mutate;
                if (this.LJLJJI) {
                    C07820Sk.LJII(mutate, this.LJLILLLLZI);
                }
                if (this.LJLJJL) {
                    C07820Sk.LJIIIIZZ(this.LJLIL, this.LJLJI);
                }
                if (this.LJLIL.isStateful()) {
                    this.LJLIL.setState(getDrawableState());
                }
            }
        }
    }

    public final void LIZIZ() {
        Drawable drawable = this.LJLJJLL;
        if (drawable != null) {
            if (this.LJLJLLL || this.LJLL) {
                Drawable mutate = C07840Sm.LJFF(drawable).mutate();
                this.LJLJJLL = mutate;
                if (this.LJLJLLL) {
                    C07820Sk.LJII(mutate, this.LJLJL);
                }
                if (this.LJLL) {
                    C07820Sk.LJIIIIZZ(this.LJLJJLL, this.LJLJLJ);
                }
                if (this.LJLJJLL.isStateful()) {
                    this.LJLJJLL.setState(getDrawableState());
                }
            }
        }
    }

    public final void LIZLLL() {
        setTextOnInternal(this.LJLLLL);
        setTextOffInternal(this.LJLZ);
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.196, X.089] */
    public final void LJ() {
        if (this.LLIILZL != null || !this.LLIILII.LIZIZ.LIZ.LIZIZ() || !f.LIZJ()) {
            return;
        }
        f LIZ = f.LIZ();
        int LIZIZ = LIZ.LIZIZ();
        if (LIZIZ != 3 && LIZIZ != 0) {
            return;
        }
        ?? r0 = new AnonymousClass089(this) { // from class: X.196
            public final Reference<C011602u> LIZ;

            @Override // X.AnonymousClass089
            public final void LIZ() {
                C011602u c011602u = this.LIZ.get();
                if (c011602u != null) {
                    c011602u.LIZLLL();
                }
            }

            @Override // X.AnonymousClass089
            public final void LIZIZ() {
                C011602u c011602u = this.LIZ.get();
                if (c011602u != null) {
                    c011602u.LIZLLL();
                }
            }

            {
                this.LIZ = new WeakReference(this);
            }
        };
        this.LLIILZL = r0;
        LIZ.LJII(r0);
    }

    private int getThumbOffset() {
        float f;
        if (C03Q.LIZ(this)) {
            f = 1.0f - this.LLFII;
        } else {
            f = this.LLFII;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.LJLIL;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.LJLJJLL;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C03Q.LIZ(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.LJLLJ;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C03Q.LIZ(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.LJLLJ;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C023107f.LJIIIIZZ(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.LJLJJLL;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.LLIIL;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.LLIIL.end();
            this.LLIIL = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean getShowText() {
        return this.LJZI;
    }

    public boolean getSplitTrack() {
        return this.LJLLL;
    }

    public int getSwitchMinWidth() {
        return this.LJLLILLLL;
    }

    public int getSwitchPadding() {
        return this.LJLLJ;
    }

    public CharSequence getTextOff() {
        return this.LJLZ;
    }

    public CharSequence getTextOn() {
        return this.LJLLLL;
    }

    public Drawable getThumbDrawable() {
        return this.LJLIL;
    }

    public int getThumbTextPadding() {
        return this.LJLLI;
    }

    public ColorStateList getThumbTintList() {
        return this.LJLILLLLZI;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.LJLJI;
    }

    public Drawable getTrackDrawable() {
        return this.LJLJJLL;
    }

    public ColorStateList getTrackTintList() {
        return this.LJLJL;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.LJLJLJ;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.LJLZ = charSequence;
        C012203a emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod LJ = emojiTextViewHelper.LIZIZ.LIZ.LJ(this.LLIIJLIL);
        if (LJ != null) {
            charSequence = LJ.getTransformation(charSequence, this);
        }
        this.LJZ = charSequence;
        this.LLIIJI = null;
        if (this.LJZI) {
            LJ();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.LJLLLL = charSequence;
        C012203a emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod LJ = emojiTextViewHelper.LIZIZ.LIZ.LJ(this.LLIIJLIL);
        if (LJ != null) {
            charSequence = LJ.getTransformation(charSequence, this);
        }
        this.LJLLLLLL = charSequence;
        this.LLIIIZ = null;
        if (this.LJZI) {
            LJ();
        }
    }

    public final Layout LIZJ(CharSequence charSequence) {
        int i;
        TextPaint textPaint = this.LLIIIJ;
        if (charSequence != null) {
            i = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.LLIIZ;
        int i3 = this.LLIFFJFJJ;
        int i4 = this.LLII;
        int i5 = this.LLIIII;
        int i6 = this.LLIIIILZ;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            rect = C03D.LIZJ(drawable);
        } else {
            rect = C03D.LIZJ;
        }
        Drawable drawable2 = this.LJLJJLL;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                if (i9 > i10) {
                    i = (i9 - i10) + i4;
                } else {
                    i = i4;
                }
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.LJLJJLL.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.LJLJJLL.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.LJLIL;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.LLI + rect2.right;
            this.LJLIL.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C07820Sk.LJFF(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, LLILII);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.LLIIZ;
        Drawable drawable = this.LJLJJLL;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.LLII;
        int i2 = this.LLIIIILZ;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.LJLIL;
        if (drawable != null) {
            if (this.LJLLL && drawable2 != null) {
                Rect LIZJ = C03D.LIZJ(drawable2);
                drawable2.copyBounds(rect);
                rect.left += LIZJ.left;
                rect.right -= LIZJ.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.LLIIIZ;
        } else {
            layout = this.LLIIJI;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.LLIIIL;
            if (colorStateList != null) {
                this.LLIIIJ.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.LLIIIJ.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.LJLLLL;
            } else {
                charSequence = this.LJLZ;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.LJLLLL;
        } else {
            charSequence = this.LJLZ;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r0 != 3) goto L8;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C011602u.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().LIZJ(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                CharSequence charSequence = this.LJLLLL;
                if (charSequence == null) {
                    charSequence = getResources().getString(com.zhiliaoapp.musically.R.string.a6v);
                }
                h0.LJJII(this, charSequence);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.LJLZ;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(com.zhiliaoapp.musically.R.string.a6u);
            }
            h0.LJJII(this, charSequence2);
        }
        float f = 0.0f;
        if (getWindowToken() != null && C16330kX.LIZJ(this)) {
            if (isChecked) {
                f = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, LLIL, f);
            this.LLIIL = ofFloat;
            ofFloat.setDuration(250L);
            this.LLIIL.setAutoCancel(true);
            this.LLIIL.start();
            return;
        }
        ObjectAnimator objectAnimator = this.LLIIL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f = 1.0f;
        }
        setThumbPosition(f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C023107f.LJIIIZ(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().LIZLLL(z);
        setTextOnInternal(this.LJLLLL);
        setTextOffInternal(this.LJLZ);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().LIZ(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.LJZI != z) {
            this.LJZI = z;
            requestLayout();
            if (z) {
                LJ();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.LJLLL = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.LJLLILLLL = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.LJLLJ = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.LLIIIJ.getTypeface() != null && !this.LLIIIJ.getTypeface().equals(typeface)) || (this.LLIIIJ.getTypeface() == null && typeface != null)) {
            this.LLIIIJ.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.LJLZ;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(com.zhiliaoapp.musically.R.string.a6u);
            }
            h0.LJJII(this, charSequence2);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.LJLLLL;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(com.zhiliaoapp.musically.R.string.a6v);
            }
            h0.LJJII(this, charSequence2);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.LJLIL;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.LJLIL = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.LLFII = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C20110qd.LIZ(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.LJLLI = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.LJLILLLLZI = colorStateList;
        this.LJLJJI = true;
        LIZ();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.LJLJI = mode;
        this.LJLJJL = true;
        LIZ();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.LJLJJLL;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.LJLJJLL = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C20110qd.LIZ(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.LJLJL = colorStateList;
        this.LJLJLLL = true;
        LIZIZ();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.LJLJLJ = mode;
        this.LJLL = true;
        LIZIZ();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.LJLIL || drawable == this.LJLJJLL) {
            return true;
        }
        return false;
    }

    public C011602u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.zhiliaoapp.musically.R.attr.bfw);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            C07820Sk.LJ(drawable, f, f2);
        }
        Drawable drawable2 = this.LJLJJLL;
        if (drawable2 != null) {
            C07820Sk.LJ(drawable2, f, f2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.LJZI) {
            if (this.LLIIIZ == null) {
                this.LLIIIZ = LIZJ(this.LJLLLLLL);
            }
            if (this.LLIIJI == null) {
                this.LLIIJI = LIZJ(this.LJZ);
            }
        }
        Rect rect = this.LLIIZ;
        Drawable drawable = this.LJLIL;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.LJLIL.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.LJLIL.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.LJZI) {
            i5 = (this.LJLLI * 2) + Math.max(this.LLIIIZ.getWidth(), this.LLIIJI.getWidth());
        } else {
            i5 = 0;
        }
        this.LLI = Math.max(i5, i3);
        Drawable drawable2 = this.LJLJJLL;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.LJLJJLL.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.LJLIL;
        if (drawable3 != null) {
            Rect LIZJ = C03D.LIZJ(drawable3);
            i7 = Math.max(i7, LIZJ.left);
            i8 = Math.max(i8, LIZJ.right);
        }
        int max = Math.max(this.LJLLILLLL, (this.LLI * 2) + i7 + i8);
        int max2 = Math.max(i6, i4);
        this.mSwitchWidth = max;
        this.LLFZ = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.0xP] */
    public C011602u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Typeface typeface;
        Typeface create;
        int i2;
        this.LLFF = VelocityTracker.obtain();
        this.LLIIZ = new Rect();
        C16880lQ.LLLLII(getContext());
        TextPaint textPaint = new TextPaint(1);
        this.LLIIIJ = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        AnonymousClass033 LJIILIIL = AnonymousClass033.LJIILIIL(context, attributeSet, new int[]{R.attr.textOn, R.attr.textOff, R.attr.thumb, com.zhiliaoapp.musically.R.attr.bay, com.zhiliaoapp.musically.R.attr.bc9, com.zhiliaoapp.musically.R.attr.bfu, com.zhiliaoapp.musically.R.attr.bfv, com.zhiliaoapp.musically.R.attr.bfx, com.zhiliaoapp.musically.R.attr.bj0, com.zhiliaoapp.musically.R.attr.bj1, com.zhiliaoapp.musically.R.attr.bj2, com.zhiliaoapp.musically.R.attr.bko, com.zhiliaoapp.musically.R.attr.bkv, com.zhiliaoapp.musically.R.attr.bkw}, i, 0);
        h0.LJIJ(this, context, new int[]{R.attr.textOn, R.attr.textOff, R.attr.thumb, com.zhiliaoapp.musically.R.attr.bay, com.zhiliaoapp.musically.R.attr.bc9, com.zhiliaoapp.musically.R.attr.bfu, com.zhiliaoapp.musically.R.attr.bfv, com.zhiliaoapp.musically.R.attr.bfx, com.zhiliaoapp.musically.R.attr.bj0, com.zhiliaoapp.musically.R.attr.bj1, com.zhiliaoapp.musically.R.attr.bj2, com.zhiliaoapp.musically.R.attr.bko, com.zhiliaoapp.musically.R.attr.bkv, com.zhiliaoapp.musically.R.attr.bkw}, attributeSet, LJIILIIL.LIZIZ, i);
        Drawable LJ = LJIILIIL.LJ(2);
        this.LJLIL = LJ;
        if (LJ != null) {
            LJ.setCallback(this);
        }
        Drawable LJ2 = LJIILIIL.LJ(11);
        this.LJLJJLL = LJ2;
        if (LJ2 != null) {
            LJ2.setCallback(this);
        }
        setTextOnInternal(LJIILIIL.LJIIJ(0));
        setTextOffInternal(LJIILIIL.LJIIJ(1));
        this.LJZI = LJIILIIL.LIZ(3, true);
        this.LJLLI = LJIILIIL.LIZLLL(8, 0);
        this.LJLLILLLL = LJIILIIL.LIZLLL(5, 0);
        this.LJLLJ = LJIILIIL.LIZLLL(6, 0);
        this.LJLLL = LJIILIIL.LIZ(4, false);
        ColorStateList LIZIZ = LJIILIIL.LIZIZ(9);
        if (LIZIZ != null) {
            this.LJLILLLLZI = LIZIZ;
            this.LJLJJI = true;
        }
        PorterDuff.Mode LIZLLL = C03D.LIZLLL(LJIILIIL.LJII(10, -1), null);
        if (this.LJLJI != LIZLLL) {
            this.LJLJI = LIZLLL;
            this.LJLJJL = true;
        }
        if (this.LJLJJI || this.LJLJJL) {
            LIZ();
        }
        ColorStateList LIZIZ2 = LJIILIIL.LIZIZ(12);
        if (LIZIZ2 != null) {
            this.LJLJL = LIZIZ2;
            this.LJLJLLL = true;
        }
        PorterDuff.Mode LIZLLL2 = C03D.LIZLLL(LJIILIIL.LJII(13, -1), null);
        if (this.LJLJLJ != LIZLLL2) {
            this.LJLJLJ = LIZLLL2;
            this.LJLL = true;
        }
        if (this.LJLJLLL || this.LJLL) {
            LIZIZ();
        }
        int LJIIIIZZ = LJIILIIL.LJIIIIZZ(7, 0);
        if (LJIIIIZZ != 0) {
            AnonymousClass033 anonymousClass033 = new AnonymousClass033(context, context.obtainStyledAttributes(LJIIIIZZ, new int[]{R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, com.zhiliaoapp.musically.R.attr.ae9, com.zhiliaoapp.musically.R.attr.aei, com.zhiliaoapp.musically.R.attr.bhl, com.zhiliaoapp.musically.R.attr.bih}));
            ColorStateList LIZIZ3 = anonymousClass033.LIZIZ(3);
            if (LIZIZ3 != null) {
                this.LLIIIL = LIZIZ3;
            } else {
                this.LLIIIL = getTextColors();
            }
            int LIZLLL3 = anonymousClass033.LIZLLL(0, 0);
            if (LIZLLL3 != 0) {
                float f = LIZLLL3;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int LJII = anonymousClass033.LJII(1, -1);
            int LJII2 = anonymousClass033.LJII(2, -1);
            if (LJII != 1) {
                if (LJII != 2) {
                    if (LJII != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (LJII2 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(LJII2);
                } else {
                    create = Typeface.create(typeface, LJII2);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i2 = create.getStyle();
                } else {
                    i2 = 0;
                }
                int i3 = (~i2) & LJII2;
                textPaint.setFakeBoldText((i3 & 1) != 0);
                textPaint.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (anonymousClass033.LIZ(14, false)) {
                final Context context2 = getContext();
                this.LLIIJLIL = new TransformationMethod(context2) { // from class: X.0xP
                    public final Locale LJLIL;

                    @Override // android.text.method.TransformationMethod
                    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i4, Rect rect) {
                    }

                    {
                        this.LJLIL = context2.getResources().getConfiguration().locale;
                    }

                    @Override // android.text.method.TransformationMethod
                    public final CharSequence getTransformation(CharSequence charSequence, View view) {
                        if (charSequence != null) {
                            return charSequence.toString().toUpperCase(this.LJLIL);
                        }
                        return null;
                    }
                };
            } else {
                this.LLIIJLIL = null;
            }
            setTextOnInternal(this.LJLLLL);
            setTextOffInternal(this.LJLZ);
            anonymousClass033.LJIILJJIL();
        }
        new a0(this).LIZLLL(attributeSet, i);
        LJIILIIL.LJIILJJIL();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LL = viewConfiguration.getScaledTouchSlop();
        this.LLFFF = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().LIZIZ(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.LJLIL != null) {
            Rect rect = this.LLIIZ;
            Drawable drawable = this.LJLJJLL;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect LIZJ = C03D.LIZJ(this.LJLIL);
            i5 = Math.max(0, LIZJ.left - rect.left);
            i9 = Math.max(0, LIZJ.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C03Q.LIZ(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.mSwitchWidth + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.mSwitchWidth) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i7 = getPaddingTop();
                i8 = this.LLFZ + i7;
            } else {
                i8 = getHeight() - getPaddingBottom();
                i7 = i8 - this.LLFZ;
            }
        } else {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i10 = this.LLFZ;
            i7 = height - (i10 / 2);
            i8 = i10 + i7;
        }
        this.LLIFFJFJJ = i6;
        this.LLII = i7;
        this.LLIIIILZ = i8;
        this.LLIIII = width;
    }
}
