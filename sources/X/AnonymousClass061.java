package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.zhiliaoapp.musically.R;

/* renamed from: X.061, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass061 {
    public static final SparseIntArray LJII;
    public boolean LIZ;
    public String LIZJ;
    public int LJ;
    public int LIZIZ = -1;
    public int LIZLLL = -1;
    public float LJFF = Float.NaN;
    public float LJI = Float.NaN;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LJII = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void LIZ(AnonymousClass061 anonymousClass061) {
        this.LIZ = anonymousClass061.LIZ;
        this.LIZIZ = anonymousClass061.LIZIZ;
        this.LIZJ = anonymousClass061.LIZJ;
        this.LIZLLL = anonymousClass061.LIZLLL;
        this.LJ = anonymousClass061.LJ;
        this.LJI = anonymousClass061.LJI;
        this.LJFF = anonymousClass061.LJFF;
    }

    public final void LIZIZ(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.w1, R.attr.aa1, R.attr.b1c, R.attr.b1e, R.attr.b44, R.attr.bky});
        this.LIZ = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (LJII.get(index)) {
                case 1:
                    this.LJI = obtainStyledAttributes.getFloat(index, this.LJI);
                    break;
                case 2:
                    this.LIZLLL = obtainStyledAttributes.getInt(index, this.LIZLLL);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.LIZJ = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                        break;
                    } else {
                        this.LIZJ = C11Y.LIZJ[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.LJ = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.LIZIZ = AnonymousClass064.LJIJ(obtainStyledAttributes, index, this.LIZIZ);
                    break;
                case 6:
                    this.LJFF = obtainStyledAttributes.getFloat(index, this.LJFF);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
