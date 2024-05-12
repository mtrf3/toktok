package X;

import Y.AUListenerS96S0200000_4;
import Y.IDAListenerS5S0300000_4;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.T5i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74074T5i extends C74073T5h {
    public static final String LLILLIZIL = "&";
    public CharSequence LJZL;
    public boolean LL;
    public SpannableStringBuilder LLD;
    public SpannableStringBuilder LLF;
    public int LLFF;
    public int LLFFF;
    public Animator LLFII;
    public int LLFZ;
    public Animator LLI;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LLIFFJFJJ;
    public InterfaceC65784Pro<C76800UCe> LLII;
    public final int LLIIII;
    public final int LLIIIILZ;
    public SpannableStringBuilder LLIIIJ;
    public SpannableStringBuilder LLIIIL;
    public CharSequence LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;
    public final long LLIIL;
    public boolean LLIILII;
    public InterfaceC65784Pro<C76800UCe> LLIILZL;
    public InterfaceC65784Pro<C76800UCe> LLIIZ;
    public boolean LLIL;
    public final Paint LLILII;
    public int LLILIL;
    public float LLILL;

    public final void LJJIZ() {
        if (!this.LLIIJI || this.LLIILII) {
            return;
        }
        this.LLIL = false;
        this.LL = false;
        boolean z = !this.LLIIJLIL;
        this.LLIIJLIL = z;
        this.LLIFFJFJJ.invoke(Boolean.valueOf(z));
        if (this.LLIIJLIL) {
            Animator animator = this.LLFII;
            if (animator == null) {
                return;
            }
            animator.start();
            return;
        }
        Animator animator2 = this.LLI;
        if (animator2 == null) {
            return;
        }
        animator2.start();
    }

    public final int getCurrentHeight() {
        if (this.LLIIJLIL) {
            return this.LLFFF;
        }
        return this.LLFZ;
    }

    public final InterfaceC65784Pro<C76800UCe> getAnimEndCallback() {
        return this.LLIIZ;
    }

    public final InterfaceC65784Pro<C76800UCe> getAnimStartCallback() {
        return this.LLIILZL;
    }

    public final boolean getAutoExpand() {
        return this.LLIL;
    }

    public final boolean getCanFold() {
        return this.LLIIJI;
    }

    public final InterfaceC65784Pro<C76800UCe> getMeasureListener() {
        return this.LLII;
    }

    public final CharSequence getOriginText() {
        return this.LJZL;
    }

    public final InterfaceC88472Yns<Boolean, C76800UCe> getStateChangedListener() {
        return this.LLIFFJFJJ;
    }

    public final CharSequence getSuffix() {
        return this.LLIIIZ;
    }

    private final void setExpandableText(CharSequence charSequence) {
        boolean z;
        setOriginText(charSequence);
        if (this.LLFF <= 0) {
            return;
        }
        CharSequence realShowText = new SpannableStringBuilder(this.LJZL).append(this.LLIIIZ);
        o.LJIIIIZZ(realShowText, "realShowText");
        Layout LJJIL = LJJIL(realShowText);
        int lineCount = LJJIL.getLineCount();
        if (lineCount > this.LLIIII) {
            z = true;
        } else {
            z = false;
        }
        this.LLIIJI = z;
        if (this.LL) {
            this.LLIIJLIL = z;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Layout LJJIL2 = LJJIL(charSequence);
        if (this.LLIIJI) {
            this.LLILL = LJJIL2.getLineTop(this.LLIIII) + getPaddingTop();
            if (!TextUtils.isEmpty(this.LJZL)) {
                int i = this.LLIIIILZ;
                if (lineCount > i) {
                    int lineEnd = LJJIL2.getLineEnd(i - 1);
                    CharSequence charSequence2 = this.LJZL;
                    o.LJI(charSequence2);
                    CharSequence subSequence = charSequence2.subSequence(0, lineEnd);
                    CharSequence expandBuilder = new SpannableStringBuilder(subSequence).append((CharSequence) this.LLIIIL);
                    while (true) {
                        o.LJIIIIZZ(expandBuilder, "expandBuilder");
                        if (LJJIL(expandBuilder).getLineCount() <= this.LLIIIILZ) {
                            break;
                        }
                        subSequence = subSequence.subSequence(0, subSequence.length() - 1);
                        expandBuilder = new SpannableStringBuilder(subSequence).append((CharSequence) this.LLIIIL);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(expandBuilder);
                    this.LLD = spannableStringBuilder;
                    this.LLFZ = getPaddingBottom() + getPaddingTop() + LJJIL(spannableStringBuilder).getHeight();
                } else {
                    CharSequence charSequence3 = this.LJZL;
                    if (charSequence3 == null) {
                        charSequence3 = "";
                    }
                    SpannableStringBuilder append = new SpannableStringBuilder(charSequence3).append(this.LLIIIZ);
                    o.LJIIIIZZ(append, "createSpannableStringBui…nText?:\"\").append(suffix)");
                    this.LLD = append;
                    this.LLFZ = getPaddingBottom() + getPaddingTop() + LJJIL(append).getHeight();
                }
            }
            if (!TextUtils.isEmpty(this.LJZL)) {
                int lineEnd2 = LJJIL2.getLineEnd(this.LLIIII - 1);
                CharSequence charSequence4 = this.LJZL;
                o.LJI(charSequence4);
                CharSequence subSequence2 = charSequence4.subSequence(0, lineEnd2);
                CharSequence builder = new SpannableStringBuilder(subSequence2).append((CharSequence) this.LLIIIJ);
                while (true) {
                    o.LJIIIIZZ(builder, "builder");
                    if (LJJIL(builder).getLineCount() <= this.LLIIII) {
                        break;
                    }
                    subSequence2 = subSequence2.subSequence(0, subSequence2.length() - 1);
                    builder = new SpannableStringBuilder(subSequence2).append((CharSequence) this.LLIIIJ);
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(builder);
                this.LLF = spannableStringBuilder2;
                int paddingBottom = getPaddingBottom() + getPaddingTop() + LJJIL(spannableStringBuilder2).getHeight();
                this.LLFFF = paddingBottom;
                this.LLFII = LJJIJLIJ(this.LLFZ, paddingBottom, new AqS178S0100000_12(this, 21), new AqS162S0100000_12(this, 31), new AqS162S0100000_12(this, 32));
                this.LLI = LJJIJLIJ(this.LLFFF, this.LLFZ, new AqS178S0100000_12(this, 22), new AqS162S0100000_12(this, 33), new AqS162S0100000_12(this, 34));
            }
            if (this.LLIL) {
                this.LLILIL = 0;
                layoutParams.height = this.LLFZ;
                setText(this.LLD);
                this.LLIIJLIL = false;
            } else if (this.LLIIJLIL) {
                layoutParams.height = this.LLFFF;
                setText(this.LLF);
            } else {
                layoutParams.height = this.LLFZ;
                setText(this.LLD);
            }
            setLayoutParams(layoutParams);
            return;
        }
        int height = LJJIL.getHeight();
        this.LLFZ = height;
        layoutParams.height = height;
        setText(realShowText);
    }

    public final Layout LJJIL(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), this.LLFF);
            o.LJIIIIZZ(obtain, "obtain(\n            text… mMeasuredWidth\n        )");
            obtain.setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).setBreakStrategy(getBreakStrategy()).setHyphenationFrequency(getHyphenationFrequency()).setTextDirection(textDirectionHeuristic);
            obtain.setUseLineSpacingFromFallbacks(isFallbackLineSpacing());
            StaticLayout build = obtain.build();
            o.LJIIIIZZ(build, "layoutBuilder.build()");
            return build;
        }
        return new StaticLayout(charSequence, getPaint(), this.LLFF, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
    }

    @Override // X.C74072T5g, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        if (this.LLIIJI && canvas != null) {
            canvas.saveLayer(0.0f, 0.0f, getWidth(), this.LLFZ, null);
            z = true;
        } else {
            z = false;
        }
        super.onDraw(canvas);
        if (this.LLIIJI) {
            this.LLILII.setAlpha(this.LLILIL);
            if (canvas != null) {
                canvas.drawRect(0.0f, this.LLILL, getWidth(), this.LLFZ, this.LLILII);
            }
        }
        if (z && canvas != null) {
            canvas.restore();
        }
    }

    public final void setAnimEndCallback(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LLIIZ = interfaceC65784Pro;
    }

    public final void setAnimStartCallback(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LLIILZL = interfaceC65784Pro;
    }

    public final void setAutoExpand(boolean z) {
        this.LLIL = z;
    }

    public final void setMeasureListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LLII = interfaceC65784Pro;
    }

    public final void setOriginText(CharSequence value) {
        o.LJIIIZ(value, "value");
        if (!o.LJ(this.LJZL, value)) {
            this.LL = true;
            this.LLFF = 0;
            this.LLIL = false;
        }
        this.LJZL = value;
        requestLayout();
    }

    public final void setStateChangedListener(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LLIFFJFJJ = interfaceC88472Yns;
    }

    public final void setSuffix(CharSequence value) {
        o.LJIIIZ(value, "value");
        this.LLIIIZ = value;
        String str = LLILLIZIL;
        SpannableStringBuilder append = new SpannableStringBuilder(str).append(value);
        o.LJIIIIZZ(append, "createSpannableStringBui…TRING).append(foldSuffix)");
        this.LLIIIJ = append;
        SpannableStringBuilder append2 = new SpannableStringBuilder(str).append(this.LLIIIZ);
        o.LJIIIIZZ(append2, "createSpannableStringBui…ING).append(expandSuffix)");
        this.LLIIIL = append2;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74074T5i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJZL = "";
        this.LL = true;
        this.LLD = new SpannableStringBuilder("");
        this.LLF = new SpannableStringBuilder("");
        this.LLIFFJFJJ = C34390Dec.LJLIL;
        this.LLIIIJ = new SpannableStringBuilder("");
        this.LLIIIL = new SpannableStringBuilder("");
        this.LLIIIZ = "";
        this.LLIIJI = true;
        this.LLIIJLIL = true;
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.LLILII = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a46, R.attr.ac6, R.attr.ac7, R.attr.ac8, R.attr.ae6, R.attr.b71});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…eable.ExpandableTextView)");
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 3);
        setOriginText(LLLZLZ != null ? LLLZLZ : "");
        this.LLIIL = obtainStyledAttributes.getInt(1, 300);
        this.LLIIII = obtainStyledAttributes.getInt(4, 2);
        this.LLIIIILZ = obtainStyledAttributes.getInt(2, 5);
        CharSequence charSequence = this.LLIIIZ;
        String str = LLILLIZIL;
        SpannableStringBuilder append = new SpannableStringBuilder(str).append(charSequence);
        o.LJIIIIZZ(append, "createSpannableStringBui…TRING).append(foldSuffix)");
        this.LLIIIJ = append;
        SpannableStringBuilder append2 = new SpannableStringBuilder(str).append(this.LLIIIZ);
        o.LJIIIIZZ(append2, "createSpannableStringBui…ING).append(expandSuffix)");
        this.LLIIIL = append2;
        setHighlightColor(Color.argb(0, 0, 0, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // X.C74072T5g, X.C47121t6, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.LLFF;
        if ((i3 == 0 || i3 != getMeasuredWidth()) && !this.LLIILII) {
            this.LLFF = getMeasuredWidth();
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LLII;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            setExpandableText(this.LJZL);
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), getLayoutParams().height);
        }
    }

    public final ValueAnimator LJJIJLIJ(int i, int i2, InterfaceC88472Yns<? super ValueAnimator, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(this.LLIIL);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new AUListenerS96S0200000_4(this, interfaceC88472Yns, 1));
        ofInt.addListener(new IDAListenerS5S0300000_4(this, interfaceC65784Pro, interfaceC65784Pro2, 1));
        return ofInt;
    }
}
