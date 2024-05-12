package X;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes13.dex */
public final class T5A extends DmtTextView {
    public final String LJLJL;
    public final int LJLJLJ;
    public String LJLJLLL;

    private final T59 getImageSpan() {
        T59 t59 = new T59(getContext(), this.LJLJLJ);
        t59.LJLIL = (int) KL2.LIZJ(getContext(), 4.0f);
        return t59;
    }

    private final int getDotWidth() {
        return (int) getPaint().measureText(this.LJLJL);
    }

    private final int getSpanWidth() {
        return (int) (Math.ceil(getImageSpan().getDrawable().getIntrinsicWidth()) + KL2.LIZJ(getContext(), 4.0f));
    }

    public final String getMoreString() {
        return this.LJLJLLL;
    }

    public final SpannableString LJJIJIL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(s.LJZL(str).toString());
        LIZ.append(' ');
        String LIZIZ = X1D.LIZIZ(LIZ);
        SpannableString spannableString = new SpannableString(LIZIZ);
        spannableString.setSpan(getImageSpan(), LIZIZ.length() - 1, LIZIZ.length(), 33);
        return spannableString;
    }

    public final void setMoreString(String value) {
        o.LJIIIZ(value, "value");
        this.LJLJLLL = value;
        invalidate();
    }

    public final void setViewLineHeight(int i) {
        int fontMetricsInt;
        if (i >= 0 && i != (fontMetricsInt = getPaint().getFontMetricsInt(null))) {
            setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T5A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJL = "...";
        this.LJLJLJ = R.drawable.am3;
        this.LJLJLLL = "";
        setViewLineHeight((int) KL2.LIZJ(context, 20.0f));
    }

    public final String LJJIJL(int i, String str) {
        int i2 = i;
        TextPaint paint = getPaint();
        if (i2 < 0) {
            i2 = 0;
        }
        StaticLayout staticLayout = new StaticLayout(str, paint, i2, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        String substring = str.substring(staticLayout.getLineStart(getMaxLines() - 1), staticLayout.getLineEnd(getMaxLines() - 1));
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        SpannableString LJJIJIL;
        int size = View.MeasureSpec.getSize(i);
        String charSequence = getText().toString();
        TextPaint paint = getPaint();
        if (size < 0) {
            i3 = 0;
        } else {
            i3 = size;
        }
        if (new StaticLayout(charSequence, paint, i3, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding()).getLineCount() < getMaxLines()) {
            LJJIJIL = LJJIJIL(getText().toString());
        } else {
            if (size > getPaint().measureText(LJJIJL(size, getText().toString())) + getSpanWidth()) {
                LJJIJIL = LJJIJIL(getText().toString());
            } else {
                StringBuilder LIZ = X1D.LIZ();
                String charSequence2 = getText().toString();
                TextPaint paint2 = getPaint();
                if (size < 0) {
                    i4 = 0;
                } else {
                    i4 = size;
                }
                String substring = charSequence2.substring(0, new StaticLayout(charSequence2, paint2, i4, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding()).getLineStart(getMaxLines() - 1));
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                LIZ.append(substring);
                String charSequence3 = getText().toString();
                int dotWidth = (size - getDotWidth()) - getSpanWidth();
                String LJJIJL = LJJIJL(size, charSequence3);
                TextPaint paint3 = getPaint();
                if (dotWidth <= 0) {
                    dotWidth = 0;
                }
                StaticLayout staticLayout = new StaticLayout(LJJIJL, paint3, dotWidth, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
                int lineStart = staticLayout.getLineStart(0);
                int lineEnd = staticLayout.getLineEnd(0);
                StringBuilder LIZ2 = X1D.LIZ();
                String substring2 = LJJIJL(size, charSequence3).substring(lineStart, lineEnd);
                o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                LIZ2.append(substring2);
                LIZ2.append(this.LJLJL);
                LIZ.append(X1D.LIZIZ(LIZ2));
                LJJIJIL = LJJIJIL(X1D.LIZIZ(LIZ));
            }
        }
        setText(LJJIJIL);
        super.onMeasure(i, i2);
    }
}
