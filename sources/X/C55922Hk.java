package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: X.2Hk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55922Hk extends C47121t6 {
    public C55912Hj LJLLLL;

    public C55922Hk(Context context) {
        super(context, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.2Hj, X.28b] */
    @Override // X.C47121t6
    public final void LJJIJL(Context context, AttributeSet attributeSet, int i) {
        super.LJJIJL(context, attributeSet, i);
        ?? r1 = new AbstractC534928b<C55922Hk>(this) { // from class: X.2Hj
            @Override // X.QXX
            public final int[] LLLLLLL() {
                return new int[]{R.attr.textAppearance, R.attr.textColor, R.attr.background, R.attr.paddingLeft, R.attr.paddingRight, com.zhiliaoapp.musically.R.attr.wg, com.zhiliaoapp.musically.R.attr.wh, com.zhiliaoapp.musically.R.attr.wj};
            }

            {
                super(this);
            }

            @Override // X.AbstractC534928b
            public final void LLLLZIL(TypedArray typedArray) {
                int indexCount = typedArray.getIndexCount();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < indexCount; i5++) {
                    int index = typedArray.getIndex(i5);
                    if (index == 0) {
                        int resourceId = typedArray.getResourceId(index, 0);
                        if (resourceId != 0) {
                            C023107f.LJII((TextView) this.LJLIL, resourceId);
                        }
                    } else if (index == 1) {
                        ColorStateList LJIILLIIL = C1DF.LJIILLIIL(this.LJLIL.getContext(), typedArray, index);
                        if (LJIILLIIL != null) {
                            ((TextView) this.LJLIL).setTextColor(LJIILLIIL);
                        }
                    } else if (index == 3) {
                        int dimensionPixelSize = typedArray.getDimensionPixelSize(index, 0);
                        T t = this.LJLIL;
                        ((TextView) t).setPadding(dimensionPixelSize, 0, t.getPaddingRight(), 0);
                    } else if (index == 4) {
                        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(index, 0);
                        T t2 = this.LJLIL;
                        ((TextView) t2).setPadding(t2.getPaddingLeft(), 0, dimensionPixelSize2, 0);
                    } else if (index == 2) {
                        C16300kU.LJIILLIIL(this.LJLIL, typedArray.getDrawable(index));
                    } else if (index == 6) {
                        i2 = typedArray.getDimensionPixelSize(index, 0);
                    } else if (index == 5) {
                        i3 = typedArray.getDimensionPixelSize(index, 0);
                    } else if (index == 7) {
                        i4 = typedArray.getDimensionPixelSize(index, 0);
                    }
                }
                if (i2 > 0 && i3 > 0 && i4 > 0) {
                    C023107f.LIZIZ((TextView) this.LJLIL, i2, i3, i4, 0);
                }
            }
        };
        this.LJLLLL = r1;
        r1.LLLLZLLLI(attributeSet, i, 0);
        setGravity(17);
        setLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
    }
}
