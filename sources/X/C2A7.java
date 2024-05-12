package X;

import Y.IDUListenerS263S0100000;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import o3.h0;

/* renamed from: X.2A7, reason: invalid class name */
/* loaded from: classes.dex */
public class C2A7 extends C47131t7 {
    public static final /* synthetic */ int LLIIIJ = 0;
    public C47121t6 LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public CharSequence LJLL;
    public Drawable LJLLI;
    public Drawable LJLLILLLL;
    public ColorStateList LJLLJ;
    public final TextView.BufferType LJLLL;
    public int LJLLLL;
    public TextPaint LJLLLLLL;
    public ValueAnimator LJLZ;
    public boolean LJZ;
    public Paint LJZI;
    public int LJZL;
    public boolean LL;
    public Drawable LLD;
    public LiveIconView LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public int LLFII;
    public C2H3 LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public int LLIIIILZ;

    private int getIconExtra() {
        if (this.LJLLILLLL == null) {
            return 0;
        }
        return this.LJLJJLL + this.LJLLLL;
    }

    public final void LJII() {
        if (this.LJZ) {
            return;
        }
        this.LLI = this.LLF.getVisibility();
        this.LLIFFJFJJ = this.LJLJJL.getVisibility();
        if (this.LLF.getVisibility() == 0) {
            this.LLF.setVisibility(4);
        }
        if (this.LJLJJL.getVisibility() == 0) {
            this.LJLJJL.setVisibility(4);
        }
        this.LJZ = true;
        this.LJLZ.start();
    }

    public final void LJJZ() {
        int i;
        this.LJLJJL.setText(this.LJLL, this.LJLLL);
        if (TextUtils.isEmpty(this.LJLL)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.LJZ) {
            if (i == 8) {
                this.LJLJJL.setVisibility(8);
            }
            this.LLIFFJFJJ = i;
        } else {
            this.LJLJJL.setVisibility(i);
        }
        requestLayout();
    }

    public final void LJJZZI() {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLJJL.getLayoutParams();
        if (this.LJLLILLLL == null) {
            i = 0;
        } else {
            i = this.LJLJJLL + this.LJLLLL;
        }
        int maxWidth = ((((getMaxWidth() - getPaddingLeft()) - getPaddingRight()) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin) - i;
        this.LLFII = maxWidth;
        this.LJLJJL.setMaxWidth(maxWidth);
    }

    public final void LJL() {
        if (!this.LJZ) {
            return;
        }
        this.LLF.setVisibility(this.LLI);
        this.LJLJJL.setVisibility(this.LLIFFJFJJ);
        this.LJZ = false;
        this.LJLZ.cancel();
        invalidate();
    }

    @Override // X.C45051pl, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.LLD;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            this.LLD.invalidateSelf();
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLZ.cancel();
    }

    public CharSequence getText() {
        return this.LJLL;
    }

    public C2A7(Context context) {
        this(context, null);
    }

    public final void LJJLJLI(TypedArray typedArray) {
        ColorStateList colorStateList;
        int resourceId;
        ColorStateList colorStateList2;
        setMaxWidth(Integer.MAX_VALUE);
        int indexCount = typedArray.getIndexCount();
        int i = 0;
        while (true) {
            colorStateList = null;
            if (i >= indexCount) {
                break;
            }
            int index = typedArray.getIndex(i);
            if (index == 3) {
                Drawable drawable = typedArray.getDrawable(3);
                if (drawable != null) {
                    C16300kU.LJIILLIIL(this, drawable);
                }
            } else if (index == 4) {
                setPadding(typedArray.getDimensionPixelSize(index, 0), getPaddingTop(), getPaddingRight(), getPaddingBottom());
                LJJZZI();
            } else if (index == 5) {
                setPadding(getPaddingLeft(), getPaddingTop(), typedArray.getDimensionPixelSize(index, 0), getPaddingBottom());
                LJJZZI();
            } else if (index == 1) {
                int resourceId2 = typedArray.getResourceId(index, 0);
                if (resourceId2 != 0) {
                    C023107f.LJII(this.LJLJJL, resourceId2);
                }
            } else if (index == 9) {
                setText(C16880lQ.LLLZZ(typedArray, index));
            } else if (index == 2) {
                ColorStateList LJIILLIIL = C1DF.LJIILLIIL(getContext(), typedArray, index);
                if (LJIILLIIL != null) {
                    this.LJLJJL.setTextColor(LJIILLIIL);
                }
            } else if (index == 0) {
                setEnabled(typedArray.getBoolean(index, isEnabled()));
            } else if (index == 14) {
                int LJFF = C259910h.LJFF(getContext(), typedArray, index);
                if (LJFF != -1) {
                    setIcon(LJFF);
                } else {
                    setIcon((Drawable) null);
                }
            } else if (index == 17) {
                ColorStateList LJIILLIIL2 = C1DF.LJIILLIIL(getContext(), typedArray, index);
                this.LJLLJ = LJIILLIIL2;
                if (LJIILLIIL2 != null) {
                    this.LLF.setIconTintList(LJIILLIIL2);
                    Drawable drawable2 = this.LLD;
                    if (drawable2 != null) {
                        C07820Sk.LJII(drawable2, this.LJLLJ);
                    }
                }
            } else if (index == 16) {
                setIconSize(typedArray.getDimensionPixelSize(index, 0));
            } else if (index == 8) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(index, 0);
                this.LLIIIILZ = dimensionPixelSize;
                setMinHeight(dimensionPixelSize);
            } else if (index == 7) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(index, 0);
                this.LLIIII = dimensionPixelSize2;
                setMinWidth(dimensionPixelSize2);
            } else if (index == 6) {
                setMaxWidth(typedArray.getDimensionPixelSize(index, Integer.MAX_VALUE));
            } else if (index == 12) {
                this.LJLJL = typedArray.getDimensionPixelSize(12, 0);
            } else if (index == 11) {
                this.LJLJLJ = typedArray.getDimensionPixelSize(11, 0);
            } else if (index == 13) {
                this.LJLJLLL = typedArray.getDimensionPixelSize(13, 0);
            } else if (index == 18) {
                int dimensionPixelSize3 = typedArray.getDimensionPixelSize(18, 0);
                this.LJZL = dimensionPixelSize3;
                int i2 = (-dimensionPixelSize3) / 2;
                int i3 = dimensionPixelSize3 / 2;
                this.LLD.setBounds(i2, i2, i3, i3);
            } else if (index == 15) {
                setIconAutoMirrored(typedArray.getBoolean(15, this.LLFFF));
            }
            i++;
        }
        if (typedArray.hasValue(10) && typedArray.getBoolean(10, false) && (resourceId = typedArray.getResourceId(19, 0)) != 0) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(resourceId, new int[]{R.attr.xk, R.attr.bf6});
            if (obtainStyledAttributes.hasValue(0)) {
                int resourceId3 = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId3 == 0 || (colorStateList2 = C04330Ez.LIZJ(resourceId3, getContext())) == null) {
                    colorStateList2 = obtainStyledAttributes.getColorStateList(0);
                }
                h0.LJIL(this, colorStateList2);
            } else {
                h0.LJIL(this, null);
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId4 != 0) {
                colorStateList = C04330Ez.LIZJ(resourceId4, getContext());
            } else if (obtainStyledAttributes.hasValue(1)) {
                colorStateList = obtainStyledAttributes.getColorStateList(1);
            }
            setStrokeColor(colorStateList);
            obtainStyledAttributes.recycle();
        }
    }

    public final void LJJLL(int i) {
        if (this.LLII != i) {
            this.LLII = i;
            this.LJLJI.LLLLZLLIL(i);
            this.LJLJJI.LLLLZLLIL(i);
            C2H3 c2h3 = this.LLFZ;
            if (c2h3 != null) {
                c2h3.LLLLZLLIL(i);
            }
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i, new int[]{android.R.attr.enabled, android.R.attr.textAppearance, android.R.attr.textColor, android.R.attr.background, android.R.attr.paddingLeft, android.R.attr.paddingRight, android.R.attr.maxWidth, android.R.attr.minWidth, android.R.attr.minHeight, android.R.attr.text, R.attr.w9, R.attr.wg, R.attr.wh, R.attr.wj, R.attr.ag7, R.attr.ag8, R.attr.agk, R.attr.ago, R.attr.axw, R.attr.b8s});
            LJJLJLI(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z = this.LJZ;
        super.dispatchDraw(canvas);
        if (this.LJZ && this.LLD != null) {
            C16310kV.LJ(this);
            canvas.save();
            canvas.translate(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.rotate(((Float) this.LJLZ.getAnimatedValue()).floatValue());
            this.LLD.draw(canvas);
            canvas.restore();
        }
    }

    @Override // X.C47131t7, android.view.View
    public final void draw(Canvas canvas) {
        C2H3 c2h3 = this.LLFZ;
        if (c2h3 == null) {
            super.draw(canvas);
            return;
        }
        boolean LLLLZIL = c2h3.LJLILLLLZI.LLLLZIL(canvas);
        super.draw(canvas);
        this.LLFZ.LJLILLLLZI.getClass();
        if (!LLLLZIL) {
            return;
        }
        canvas.restore();
    }

    public void setIcon(Drawable drawable) {
        int i;
        if (drawable instanceof C1Q4) {
            drawable = ((C04530Ft) drawable).LJLIL;
        }
        if (this.LJLLI != drawable) {
            this.LJLLI = drawable;
            if (drawable != null) {
                this.LJLLILLLL = drawable;
                this.LLF.setIcon(drawable);
                this.LLF.setIconTintList(this.LJLLJ);
                this.LLF.setIconAutoMirrored(this.LLFFF);
                i = 0;
            } else {
                this.LJLLILLLL = null;
                this.LLF.setIcon((Drawable) null);
                i = 8;
            }
            if (this.LJZ) {
                if (i == 8) {
                    this.LLF.setVisibility(8);
                }
                this.LLI = i;
            } else {
                this.LLF.setVisibility(i);
            }
            LJJZZI();
            requestLayout();
        }
    }

    public void setIconAttr(int i) {
        setIcon(C259910h.LJ(i, getContext()));
    }

    public void setIconAutoMirrored(boolean z) {
        if (this.LLFFF != z) {
            this.LLFFF = z;
            this.LLF.setIconAutoMirrored(z);
        }
    }

    public void setIconSize(int i) {
        if (i != this.LJLJJLL) {
            this.LJLJJLL = i;
            ViewGroup.LayoutParams layoutParams = this.LLF.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            this.LLF.setLayoutParams(layoutParams);
            LJJZZI();
            requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
    
        if (r5 != null) goto L8;
     */
    @Override // X.C1K3, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setLayoutParams(android.view.ViewGroup.LayoutParams r5) {
        /*
            r4 = this;
            super.setLayoutParams(r5)
            r3 = 0
            r2 = -1
            r1 = -2
            if (r5 == 0) goto L1b
            int r0 = r5.width
            if (r0 == r1) goto L1b
            if (r0 == r2) goto L1b
            super.setMinWidth(r3)
        L11:
            int r0 = r5.height
            if (r0 == r1) goto L23
            if (r0 == r2) goto L23
            super.setMinHeight(r3)
        L1a:
            return
        L1b:
            int r0 = r4.LLIIII
            super.setMinWidth(r0)
            if (r5 == 0) goto L23
            goto L11
        L23:
            int r0 = r4.LLIIIILZ
            super.setMinHeight(r0)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2A7.setLayoutParams(android.view.ViewGroup$LayoutParams):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        LJJZZI();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setMinHeight(int i) {
        int i2;
        this.LLIIIILZ = i;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null && (i2 = layoutParams.height) != -2 && i2 != -1) {
            super.setMinHeight(0);
        } else {
            super.setMinHeight(this.LLIIIILZ);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setMinWidth(int i) {
        int i2;
        this.LLIIII = i;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null && (i2 = layoutParams.width) != -2 && i2 != -1) {
            super.setMinWidth(0);
        } else {
            super.setMinWidth(this.LLIIII);
        }
    }

    public void setText(int i) {
        this.LJLL = getContext().getResources().getText(i);
        LJJZ();
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.LJLJJL.setTextColor(colorStateList);
        }
    }

    public void setIcon(int i) {
        C0TU c0tu = C0TT.LIZ;
        Context context = getContext();
        c0tu.getClass();
        setIcon(C0TU.LIZ(i, context));
        setIconAutoMirrored(c0tu.LIZIZ(i, false));
    }

    public void setText(CharSequence charSequence) {
        this.LJLL = charSequence;
        LJJZ();
    }

    public void setTextColor(int i) {
        this.LJLJJL.setTextColor(i);
    }

    public C2A7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final StaticLayout LJJZZIII(int i, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.LJLLLLLL, i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(this.LJLJJL.getLineSpacingExtra(), this.LJLJJL.getLineSpacingMultiplier()).setIncludePad(this.LJLJJL.getIncludeFontPadding()).setBreakStrategy(this.LJLJJL.getBreakStrategy()).setHyphenationFrequency(this.LJLJJL.getHyphenationFrequency()).setMaxLines(this.LJLJJL.getMaxLines()).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).build();
        }
        return new StaticLayout(charSequence, this.LJLLLLLL, i, Layout.Alignment.ALIGN_NORMAL, this.LJLJJL.getLineSpacingMultiplier(), this.LJLJJL.getLineSpacingExtra(), this.LJLJJL.getIncludeFontPadding());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e1, code lost:
    
        if (r0 != 1) goto L39;
     */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2A7.onMeasure(int, int):void");
    }

    public C2A7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        this.LJLJLLL = -1;
        this.LJLLL = TextView.BufferType.NORMAL;
        this.LLFFF = true;
        this.LLFII = Integer.MAX_VALUE;
        this.LJLLLL = context.getResources().getDimensionPixelSize(R.dimen.a_l);
        ViewGroup.inflate(context, R.layout.da1, this);
        this.LLF = (LiveIconView) findViewById(R.id.lpr);
        this.LJLJJL = (C47121t6) findViewById(R.id.ls0);
        Drawable LIZ = C20110qd.LIZ(getContext(), R.drawable.cx_);
        if (LIZ != null) {
            Drawable LJFF = C07840Sm.LJFF(LIZ);
            this.LLD = LJFF;
            LJFF.mutate();
            this.LLD.setState(getDrawableState());
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.LJLZ = ofFloat;
        ofFloat.setRepeatCount(-1);
        this.LJLZ.setDuration(1000L);
        this.LJLZ.setInterpolator(new LinearInterpolator());
        this.LJLZ.addUpdateListener(new IDUListenerS263S0100000(this, 32));
        C2H3 c2h3 = new C2H3(this);
        this.LLFZ = c2h3;
        c2h3.LLLLZLLLI(attributeSet, 0, 0);
        if (attributeSet != null) {
            this.LLII = attributeSet.getAttributeResourceValue(null, "style", 0);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.enabled, android.R.attr.textAppearance, android.R.attr.textColor, android.R.attr.background, android.R.attr.paddingLeft, android.R.attr.paddingRight, android.R.attr.maxWidth, android.R.attr.minWidth, android.R.attr.minHeight, android.R.attr.text, R.attr.w9, R.attr.wg, R.attr.wh, R.attr.wj, R.attr.ag7, R.attr.ag8, R.attr.agk, R.attr.ago, R.attr.axw, R.attr.b8s}, 0, 0);
        LJJLJLI(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
