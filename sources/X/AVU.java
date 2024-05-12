package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AVU extends View {
    public final C72769ShB LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;

    public final void LIZ() {
        String valueOf;
        C72769ShB c72769ShB = this.LJLIL;
        int i = 1;
        if (LA9.LIZ(true) && getVariant() == 1) {
            valueOf = C56204M4a.LJI(getCount());
        } else {
            int variant = getVariant();
            int maxCount = getMaxCount();
            int count = getCount();
            if (variant == 0) {
                valueOf = "";
            } else if (maxCount == 0 || maxCount > 9) {
                valueOf = String.valueOf(count);
            } else {
                if (1 <= maxCount) {
                    int i2 = 1;
                    while (true) {
                        i *= 10;
                        if (i2 == maxCount) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                int i3 = i - 1;
                if (count > i3) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(i3);
                    LIZ.append('+');
                    valueOf = X1D.LIZIZ(LIZ);
                } else {
                    valueOf = String.valueOf(count);
                }
            }
        }
        c72769ShB.getClass();
        o.LJIIIZ(valueOf, "<set-?>");
        c72769ShB.LJFF = valueOf;
        invalidate();
        requestLayout();
    }

    public int getDotSize() {
        return this.LJLIL.LIZJ;
    }

    public int getCount() {
        return this.LJLJI;
    }

    public int getMaxCount() {
        return this.LJLJJI;
    }

    public int getVariant() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LJLIL.draw(canvas);
    }

    public void setCount(int i) {
        this.LJLJI = i;
        LIZ();
    }

    public void setDotSize(int i) {
        C72769ShB c72769ShB = this.LJLIL;
        c72769ShB.LIZJ = i;
        if (c72769ShB.LJFF.length() == 0) {
            requestLayout();
        }
    }

    public void setMaxCount(int i) {
        this.LJLJJI = i;
        LIZ();
    }

    public void setVariant(int i) {
        this.LJLILLLLZI = i;
        LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.jl);
        a1.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.m_, R.attr.ma, R.attr.mb, R.attr.bq0, R.attr.bq1, R.attr.bq2, R.attr.bq6}, R.attr.jl, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "this");
        this.LJLIL = new C72769ShB(obtainStyledAttributes.getInt(1, 0), obtainStyledAttributes.getColor(2, -1), obtainStyledAttributes.getColor(0, -16777216), obtainStyledAttributes.getDimensionPixelSize(4, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))));
        setVariant(obtainStyledAttributes.getInt(6, 0));
        setCount(obtainStyledAttributes.getInt(3, 0));
        setMaxCount(obtainStyledAttributes.getInt(5, 0));
        obtainStyledAttributes.recycle();
        LIZ();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.LJLIL.LIZ();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.LJLIL.LJ, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LJLIL.LIZLLL, 1073741824));
    }
}
