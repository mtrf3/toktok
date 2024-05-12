package X;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1t6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C47121t6 extends C41541k6 {
    public static boolean LJLLILLLL;
    public static final boolean LJLLJ;
    public static final boolean LJLLL;
    public C23000vI LJLJLLL;
    public boolean LJLL;
    public C2HQ LJLLI;

    public void setReduceFont(boolean z) {
    }

    static {
        C259810g c259810g = C259710f.LIZ;
        LJLLILLLL = c259810g.LJIILL;
        LJLLJ = c259810g.LJIIZILJ;
        LJLLL = c259810g.LIZ;
    }

    private C23000vI getInputFilterHelper() {
        if (this.LJLJLLL == null) {
            this.LJLJLLL = new C23000vI(this);
        }
        return this.LJLJLLL;
    }

    private C2HQ getTextStyleableHelper() {
        if (this.LJLLI == null) {
            this.LJLLI = new C2HQ(this);
        }
        return this.LJLLI;
    }

    public C47121t6(Context context) {
        this(context, null);
    }

    public final void LJJIJIL(int i) {
        getTextStyleableHelper().LLLLZLLIL(i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        if (LJLLL) {
            C23000vI inputFilterHelper = getInputFilterHelper();
            inputFilterHelper.getClass();
            int length = inputFilterArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (inputFilterArr[i] instanceof C23020vK) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    int length2 = inputFilterArr.length;
                    InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length2);
                    inputFilterArr2[length2] = inputFilterHelper.LIZ;
                    inputFilterArr = inputFilterArr2;
                    break;
                }
            }
        }
        super.setFilters(inputFilterArr);
    }

    public C47121t6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.axb);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (LJLLJ) {
            try {
                super.onMeasure(i, i2);
                return;
            } catch (Exception e) {
                if (C259710f.LIZ.LJIIJJI != null) {
                    try {
                        String resourceEntryName = getContext().getResources().getResourceEntryName(getId());
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(resourceEntryName);
                        LIZ.append("'s setText skipped due to the same text. Current text is: ");
                        LIZ.append((Object) getText());
                        C0NB.LJ("setText Optimization", X1D.LIZIZ(LIZ));
                    } catch (Exception unused) {
                    }
                }
                throw e;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (LJLLILLLL) {
            CharSequence text = getText();
            if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(charSequence) && (text instanceof String) && (charSequence instanceof String) && TextUtils.equals(text, charSequence)) {
                if (LJLLJ && C259710f.LIZ.LJIIJJI != null) {
                    try {
                        String resourceEntryName = getContext().getResources().getResourceEntryName(getId());
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(resourceEntryName);
                        LIZ.append("'s setText skipped due to the same text. Current text is: ");
                        LIZ.append((Object) text);
                        C0NB.LJ("setText Optimization", X1D.LIZIZ(LIZ));
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            }
            super.setText(charSequence, bufferType);
            return;
        }
        super.setText(charSequence, bufferType);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        getTextStyleableHelper().LJLILLLLZI.LLLLZLLIL(i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(0, C259710f.LIZ.LJ(TypedValue.applyDimension(i, f, getContext().getResources().getDisplayMetrics())));
    }

    public C47121t6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C259710f.LIZ.getClass();
        LJJIJL(context, attributeSet, i);
    }

    public void LJJIJL(Context context, AttributeSet attributeSet, int i) {
        if (!this.LJLL) {
            this.LJLL = true;
            TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
            getTextStyleableHelper().LLLLZLLLI(attributeSet, i, 0);
        }
    }
}
