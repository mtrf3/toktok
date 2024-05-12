package X;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.a1;

/* renamed from: X.7ZY, reason: invalid class name */
/* loaded from: classes4.dex */
public class C7ZY extends AppCompatTextView {
    public String LJLJL;
    public String LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;

    public final void LJJIJIL() {
        TextPaint paint;
        Layout layout = getLayout();
        if (layout == null || layout.getEllipsisCount(getLineCount() - 1) <= 0 || (paint = getPaint()) == null) {
            return;
        }
        CharSequence ellipsize = TextUtils.ellipsize(this.LJLJLJ, getPaint(), (int) (getMeasuredWidth() - paint.measureText(this.LJLJL)), TextUtils.TruncateAt.END);
        String str = this.LJLJL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append((Object) ellipsize);
        LIZ.append("");
        String LLLZ = C16880lQ.LLLZ(str, new Object[]{X1D.LIZIZ(LIZ)});
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append((Object) ellipsize);
        LJJIJL(LLLZ, X1D.LIZIZ(LIZ2));
    }

    public C7ZY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJL = "";
        this.LJLJLJ = "";
        this.LJLJLLL = -1;
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void LJJIJL(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (this.LJLJLLL != -1) {
            int indexOf = str.indexOf(str2);
            int length = str2.length() + indexOf;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.LJLJLLL), indexOf, length, 33);
            spannableStringBuilder.setSpan(new T5U(42, true), indexOf, length, 33);
        }
        setText(spannableStringBuilder);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLL = true;
        try {
            LJJIJIL();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJJIJLIJ(int i, int i2, String str) {
        this.LJLJL = getResources().getString(i);
        this.LJLJLJ = str;
        this.LJLJLLL = i2;
        LJJIJL(getResources().getString(i, a1.LJ("", str, "")), str);
        if (this.LJLL) {
            LJJIJIL();
        }
    }
}
