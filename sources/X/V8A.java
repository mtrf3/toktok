package X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes14.dex */
public class V8A extends AppCompatTextView {
    public V8A(Context context, AttributeSet attributeSet) {
        super(C78865UxJ.LIZ(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        int LIZJ;
        Context context2 = getContext();
        TypedValue LIZ = C78972Uz2.LIZ(com.zhiliaoapp.musically.R.attr.bhy, context2);
        if (LIZ == null || LIZ.type != 18 || LIZ.data != 0) {
            Resources.Theme theme = context2.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, new int[]{R.attr.textAppearance, R.attr.lineHeight, com.zhiliaoapp.musically.R.attr.aog}, R.attr.textViewStyle, 0);
            int[] iArr = {1, 2};
            int i = 0;
            do {
                LIZJ = C80285Vf7.LIZJ(context2, obtainStyledAttributes, iArr[i], -1);
                i++;
                if (i >= 2) {
                    break;
                }
            } while (LIZJ < 0);
            obtainStyledAttributes.recycle();
            if (LIZJ != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, new int[]{R.attr.textAppearance, R.attr.lineHeight, com.zhiliaoapp.musically.R.attr.aog}, R.attr.textViewStyle, 0);
            int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId == -1) {
                return;
            }
            LJJIJIL(resourceId, theme);
        }
    }

    public final void LJJIJIL(int i, Resources.Theme theme) {
        int LIZJ;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, new int[]{R.attr.letterSpacing, R.attr.lineHeight, com.zhiliaoapp.musically.R.attr.aog});
        Context context = getContext();
        int[] iArr = {1, 2};
        int i2 = 0;
        do {
            LIZJ = C80285Vf7.LIZJ(context, obtainStyledAttributes, iArr[i2], -1);
            i2++;
            if (i2 >= 2) {
                break;
            }
        } while (LIZJ < 0);
        obtainStyledAttributes.recycle();
        if (LIZJ >= 0) {
            setLineHeight(LIZJ);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        TypedValue LIZ = C78972Uz2.LIZ(com.zhiliaoapp.musically.R.attr.bhy, context);
        if (LIZ == null || LIZ.type != 18 || LIZ.data != 0) {
            LJJIJIL(i, context.getTheme());
        }
    }
}
