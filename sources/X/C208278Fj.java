package X;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.8Fj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208278Fj extends TuxTextView {
    public String LJLLLL;
    public String LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public int LL;
    public Animator LLD;
    public SpannableString LLF;
    public StaticLayout LLFF;
    public CharSequence LLFFF;
    public final java.util.Map<Integer, View> LLFII;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLFII;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final boolean getExpanded() {
        return !this.LJZI;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        Animator animator = this.LLD;
        if (animator != null) {
            animator.cancel();
        }
        super.onDetachedFromWindow();
    }

    public final boolean getCollapsed() {
        return this.LJZI;
    }

    public final String getExpandAction() {
        return this.LJLLLLLL;
    }

    public final int getExpandActionColor() {
        return this.LJZ;
    }

    public final int getLimitedMaxLines() {
        return this.LJLZ;
    }

    public final String getOriginalText() {
        return this.LJLLLL;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        super.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void setExpandAction(String value) {
        o.LJIIIZ(value, "value");
        this.LJLLLLLL = value;
        int length = String.valueOf((char) 8230).length();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((char) 8230);
        LIZ.append(' ');
        LIZ.append(value);
        SpannableString spannableString = new SpannableString(X1D.LIZIZ(LIZ));
        this.LLF = spannableString;
        spannableString.setSpan(new T5U(42, false), length, this.LLF.length(), 33);
        this.LLF.setSpan(new ForegroundColorSpan(this.LJZ), length, this.LLF.length(), 33);
        LJJJJJ(this, true);
    }

    public final void setExpandActionColor(int i) {
        this.LJZ = i;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length = String.valueOf((char) 8230).length();
        SpannableString spannableString = this.LLF;
        spannableString.setSpan(foregroundColorSpan, length, spannableString.length(), 33);
        LJJJJJ(this, true);
    }

    public final void setExpandable(boolean z) {
        this.LJZL = z;
    }

    public final void setExpanded$topic_release(boolean z) {
        CharSequence charSequence;
        if (this.LJZI) {
            charSequence = this.LLFFF;
        } else {
            charSequence = this.LJLLLL;
        }
        setText(charSequence);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void setLimitedMaxLines(int i) {
        if (getMaxLines() == -1 || i <= getMaxLines()) {
            this.LJLZ = i;
            LJJJJJ(this, false);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("\n                    maxLines (");
        LIZ.append(getMaxLines());
        LIZ.append(") must be greater than or equal to limitedMaxLines (");
        LIZ.append(i);
        LIZ.append("). \n                    maxLines can be -1 if there is no upper limit for lineCount.\n                ");
        String LJJIJIIJI = C38346F3e.LJJIJIIJI(X1D.LIZIZ(LIZ));
        LJJIJIIJI.toString();
        throw new IllegalStateException(LJJIJIIJI);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i == -1 || this.LJLZ <= i) {
            super.setMaxLines(i);
            LJJJJJ(this, false);
            return;
        }
        StringBuilder LJ = C7MY.LJ("\n                maxLines (", i, ") must be greater than or equal to limitedMaxLines (");
        LJ.append(this.LJLZ);
        LJ.append("). \n                maxLines can be -1 if there is no upper limit for lineCount.\n            ");
        String LJJIJIIJI = C38346F3e.LJJIJIIJI(X1D.LIZIZ(LJ));
        LJJIJIIJI.toString();
        throw new IllegalStateException(LJJIJIIJI);
    }

    public final void setOriginalText(String value) {
        o.LJIIIZ(value, "value");
        this.LJLLLL = value;
        LJJJJJ(this, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208278Fj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLFII = C62850Ola.LJFF(context, "context");
        this.LJLLLL = "";
        this.LJLLLLLL = "";
        this.LJLZ = 3;
        this.LJZ = C04330Ez.LIZIZ(context, android.R.color.holo_purple);
        this.LJZI = true;
        this.LLF = new SpannableString("");
        setEllipsize(TextUtils.TruncateAt.END);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a46, R.attr.ac6, R.attr.ac7, R.attr.ac8, R.attr.ae6, R.attr.b71});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…eable.ExpandableTextView)");
        String string = context.getString(R.string.cdh);
        o.LJIIIIZZ(string, "context.getString(R.stri…_ratereview_reviews_more)");
        setExpandAction(string);
        Integer LJI = C79045V0n.LJI(R.attr.gp, context);
        if (LJI != null) {
            setExpandActionColor(LJI.intValue());
        }
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 5);
        setOriginalText(LLLZLZ == null ? this.LJLLLL : LLLZLZ);
        setLimitedMaxLines(obtainStyledAttributes.getInt(0, this.LJLZ));
        if (getMaxLines() == -1 || this.LJLZ <= getMaxLines()) {
            obtainStyledAttributes.recycle();
            return;
        }
        String LJJIJIIJI = C38346F3e.LJJIJIIJI("\n                maxLines (" + getMaxLines() + ") must be greater than or equal to limitedMaxLines (" + this.LJLZ + "). \n                maxLines can be -1 if there is no upper limit for lineCount.\n            ");
        LJJIJIIJI.toString();
        throw new IllegalStateException(LJJIJIIJI);
    }

    public static /* synthetic */ void LJJJJJ(C208278Fj c208278Fj, boolean z) {
        c208278Fj.LJJJJ((c208278Fj.getMeasuredWidth() - c208278Fj.getCompoundPaddingStart()) - c208278Fj.getCompoundPaddingEnd(), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.text.SpannableStringBuilder, java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.CharSequence] */
    public final void LJJJJ(int i, boolean z) {
        float f;
        CharSequence charSequence;
        DynamicLayout dynamicLayout;
        if (i <= 0) {
            return;
        }
        StaticLayout LJJJIL = LJJJIL(this.LJLZ, i, this.LJLLLL);
        if (z) {
            this.LLFF = LJJJIL(1, i, this.LLF);
        }
        ?? span = LJJJIL.getText();
        if (!o.LJ(span.toString(), this.LJLLLL)) {
            this.LJZL = true;
            C118234kV it = C78842Uww.LJJ(0, LJJJIL.getLineCount()).iterator();
            int i2 = 0;
            while (it.LJLJI) {
                i2 += (int) LJJJIL.getLineWidth(it.nextInt());
            }
            float f2 = i2;
            StaticLayout staticLayout = this.LLFF;
            if (staticLayout != null) {
                f = staticLayout.getLineWidth(0);
            } else {
                f = 0.0f;
            }
            CharSequence textWithoutCta = TextUtils.ellipsize(this.LJLLLL, getPaint(), f2 - f, TextUtils.TruncateAt.END);
            o.LJIIIIZZ(textWithoutCta, "textWithoutCta");
            int LJJLIIIJJIZ = s.LJJLIIIJJIZ(textWithoutCta, (char) 8230, 0, false, 6);
            CharSequence charSequence2 = null;
            if (o.LJ(textWithoutCta, "")) {
                StaticLayout staticLayout2 = this.LLFF;
                span = staticLayout2 != null ? staticLayout2.getText() : 0;
            } else if (LJJLIIIJJIZ != -1) {
                int i3 = LJJLIIIJJIZ + 1;
                SpannableStringBuilder append = new SpannableStringBuilder().append(textWithoutCta);
                StaticLayout staticLayout3 = this.LLFF;
                if (staticLayout3 != null) {
                    charSequence = staticLayout3.getText();
                } else {
                    charSequence = null;
                }
                span = append.replace(LJJLIIIJJIZ, i3, charSequence);
                o.LJIIIIZZ(span, "span");
                int width = LJJJIL.getWidth();
                if (Build.VERSION.SDK_INT >= 28) {
                    dynamicLayout = DynamicLayout.Builder.obtain(span, getPaint(), width).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).build();
                } else {
                    dynamicLayout = new DynamicLayout(span, span, getPaint(), width, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), false);
                }
                o.LJIIIIZZ(dynamicLayout, "if (Build.VERSION.SDK_IN…ngExtra, false)\n        }");
                StaticLayout staticLayout4 = this.LLFF;
                if (staticLayout4 != null) {
                    charSequence2 = staticLayout4.getText();
                }
                for (int LJJLIIIJL = s.LJJLIIIJL(span, String.valueOf(charSequence2), 0, false, 6) - 1; LJJLIIIJL >= 0 && dynamicLayout.getLineCount() > this.LJLZ; LJJLIIIJL--) {
                    span.delete(LJJLIIIJL, LJJLIIIJL + 1);
                }
            }
        } else {
            this.LJZL = false;
            span = this.LJLLLL;
        }
        this.LLFFF = span;
        String str = span;
        if (!this.LJZI) {
            str = this.LJLLLL;
        }
        setText(str);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        Animator animator;
        int size = (View.MeasureSpec.getSize(i) - getCompoundPaddingStart()) - getCompoundPaddingEnd();
        if (size == this.LL || ((animator = this.LLD) != null && animator.isRunning())) {
            super.onMeasure(i, i2);
            return;
        }
        this.LL = size;
        LJJJJ(size, true);
        super.onMeasure(i, i2);
    }

    public final StaticLayout LJJJIL(int i, int i2, CharSequence charSequence) {
        int i3;
        StaticLayout staticLayout;
        String charSequence2;
        if (i2 < 0) {
            i3 = 0;
        } else {
            i3 = i2;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            StaticLayout build = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), i3).setIncludePad(false).setEllipsize(TextUtils.TruncateAt.END).setMaxLines(i).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).build();
            o.LJIIIIZZ(build, "obtain(text, 0, text.len…\n                .build()");
            return build;
        }
        int length = charSequence.length();
        if (length > 300) {
            length = 300;
        }
        do {
            if (charSequence.length() == 0 || length <= 0) {
                charSequence2 = "";
            } else if (charSequence.length() <= length) {
                charSequence2 = charSequence;
            } else {
                int i4 = length - 1;
                if (i4 < 0) {
                    i4 = 0;
                }
                charSequence2 = charSequence.subSequence(0, i4).toString();
                if ((char) 8230 != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(charSequence2);
                    LIZ.append((Object) (char) 8230);
                    charSequence2 = X1D.LIZIZ(LIZ);
                }
            }
            staticLayout = new StaticLayout(charSequence2, getPaint(), i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            length -= 10;
        } while (staticLayout.getLineCount() > getMaxLines());
        return staticLayout;
    }
}
