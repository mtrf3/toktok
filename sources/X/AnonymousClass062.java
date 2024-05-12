package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: X.062, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass062 {
    public boolean LIZ;
    public int LIZIZ;
    public int LIZJ;
    public float LIZLLL = 1.0f;
    public float LJ = Float.NaN;

    public final void LIZ(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.visibility, R.attr.alpha, com.zhiliaoapp.musically.R.attr.aml, com.zhiliaoapp.musically.R.attr.b1d, com.zhiliaoapp.musically.R.attr.bwc});
        this.LIZ = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.LIZLLL = obtainStyledAttributes.getFloat(index, this.LIZLLL);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.LIZIZ);
                this.LIZIZ = i2;
                this.LIZIZ = AnonymousClass064.LIZLLL[i2];
            } else if (index == 4) {
                this.LIZJ = obtainStyledAttributes.getInt(index, this.LIZJ);
            } else if (index == 3) {
                this.LJ = obtainStyledAttributes.getFloat(index, this.LJ);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
