package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VkC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC80600VkC {
    public int LIZ;
    public int LIZIZ;
    public int[] LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;

    public abstract void LIZ();

    public AbstractC80600VkC(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        this.LIZJ = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.a3c);
        TypedArray LIZLLL = C80244VeS.LIZLLL(context, attributeSet, new int[]{android.R.attr.indeterminate, R.attr.afl, R.attr.ahh, R.attr.b0z, R.attr.bad, R.attr.baj, R.attr.bkp, R.attr.bks, R.attr.bku}, i, i2, new int[0]);
        this.LIZ = C80285Vf7.LIZJ(context, LIZLLL, 8, dimensionPixelSize);
        this.LIZIZ = Math.min(C80285Vf7.LIZJ(context, LIZLLL, 7, 0), this.LIZ / 2);
        this.LJ = LIZLLL.getInt(4, 0);
        this.LJFF = LIZLLL.getInt(1, 0);
        if (!LIZLLL.hasValue(2)) {
            int[] iArr = new int[1];
            TypedValue LIZ = C78972Uz2.LIZ(R.attr.a4r, context);
            if (LIZ != null) {
                i3 = LIZ.data;
            } else {
                i3 = -1;
            }
            iArr[0] = i3;
            this.LIZJ = iArr;
        } else if (LIZLLL.peekValue(2).type != 1) {
            this.LIZJ = new int[]{LIZLLL.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(LIZLLL.getResourceId(2, -1));
            this.LIZJ = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (LIZLLL.hasValue(6)) {
            this.LIZLLL = LIZLLL.getColor(6, -1);
        } else {
            this.LIZLLL = this.LIZJ[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            this.LIZLLL = C78966Uyw.LJIILJJIL(this.LIZLLL, (int) (f * 255.0f));
        }
        LIZLLL.recycle();
    }
}
