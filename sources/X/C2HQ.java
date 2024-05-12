package X;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: X.2HQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HQ extends AbstractC534928b<TextView> {
    public final C2HP LJLILLLLZI;

    @Override // X.QXX
    public final int[] LLLLLLL() {
        return new int[]{R.attr.textAppearance, R.attr.textSize, R.attr.textColor, com.zhiliaoapp.musically.R.attr.wg, com.zhiliaoapp.musically.R.attr.wh, com.zhiliaoapp.musically.R.attr.wj, com.zhiliaoapp.musically.R.attr.wk, com.zhiliaoapp.musically.R.attr.a9l, com.zhiliaoapp.musically.R.attr.aeh, com.zhiliaoapp.musically.R.attr.aog, com.zhiliaoapp.musically.R.attr.b7g};
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2HP] */
    public C2HQ(TextView textView) {
        super(textView);
        this.LJLILLLLZI = new AbstractC534928b<TextView>(textView) { // from class: X.2HP
            @Override // X.QXX
            public final int[] LLLLLLL() {
                return new int[]{R.attr.textSize, com.zhiliaoapp.musically.R.attr.aeh};
            }

            @Override // X.AbstractC534928b
            public final void LLLLZIL(TypedArray typedArray) {
                int dimensionPixelSize;
                int i;
                int indexCount = typedArray.getIndexCount();
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = typedArray.getIndex(i2);
                    if (index == 1) {
                        int i3 = typedArray.getInt(1, 1);
                        if (typedArray.hasValue(0)) {
                            i = typedArray.getDimensionPixelSize(0, -1);
                        } else {
                            i = 0;
                        }
                        Typeface LJI = C259710f.LIZ.LJI(i, i3, false);
                        if (LJI != null) {
                            ((TextView) this.LJLIL).setTypeface(LJI);
                        }
                    } else if (index == 0 && (dimensionPixelSize = typedArray.getDimensionPixelSize(0, 0)) > 0) {
                        ((TextView) this.LJLIL).setTextSize(0, dimensionPixelSize);
                    }
                }
            }
        };
    }

    @Override // X.AbstractC534928b
    public final void LLLLZIL(TypedArray typedArray) {
        int i;
        boolean z;
        int dimensionPixelSize;
        int resourceId;
        int integer = typedArray.getInteger(8, 1);
        if (typedArray.hasValue(1)) {
            i = typedArray.getDimensionPixelSize(1, -1);
        } else {
            i = 0;
        }
        if (typedArray.hasValue(7)) {
            z = typedArray.getBoolean(7, false);
        } else {
            z = false;
        }
        C259810g c259810g = C259710f.LIZ;
        ((TextView) this.LJLIL).setTypeface(c259810g.LJI(i, integer, z));
        if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
            LLLLZLLIL(resourceId);
        }
        if (typedArray.hasValue(9)) {
            C023107f.LJFF((TextView) this.LJLIL, typedArray.getDimensionPixelSize(9, 0));
        }
        if (typedArray.hasValue(1) && (dimensionPixelSize = typedArray.getDimensionPixelSize(1, -1)) != -1) {
            ((TextView) this.LJLIL).setTextSize(0, dimensionPixelSize);
        }
        if ((this.LJLIL instanceof C47121t6) && typedArray.hasValue(10)) {
            ((C47121t6) this.LJLIL).setReduceFont(typedArray.getBoolean(10, false));
        }
        if (c259810g.LJIIIZ() && typedArray.hasValue(6) && typedArray.getInt(6, 0) == 1) {
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(3, -1);
            int dimensionPixelSize3 = typedArray.getDimensionPixelSize(4, -1);
            int dimensionPixelSize4 = typedArray.getDimensionPixelSize(5, 1);
            if (dimensionPixelSize3 > 0 && dimensionPixelSize2 > 0 && dimensionPixelSize4 > 0 && dimensionPixelSize2 > dimensionPixelSize3) {
                C023107f.LIZIZ((TextView) this.LJLIL, c259810g.LJ(dimensionPixelSize3), c259810g.LJ(dimensionPixelSize2), dimensionPixelSize4, 0);
            }
        }
    }

    public final int LLLZ(float f) {
        getClass();
        return C259710f.LIZ.LJ(f);
    }
}
