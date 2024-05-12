package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VaZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80003VaZ extends LinearLayout implements InterfaceC80004Vaa {
    public TextView LJLIL;
    public Button LJLILLLLZI;
    public final int LJLJI;
    public int LJLJJI;

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LJLIL = (TextView) findViewById(R.id.k6c);
        this.LJLILLLLZI = (Button) findViewById(R.id.k6b);
    }

    public Button getActionView() {
        return this.LJLILLLLZI;
    }

    public TextView getMessageView() {
        return this.LJLIL;
    }

    public void setMaxInlineActionWidth(int i) {
        this.LJLJJI = i;
    }

    public C80003VaZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.maxWidth, R.attr.uw, R.attr.w2, R.attr.xh, R.attr.xk, R.attr.xl, R.attr.ab6, R.attr.b09});
        this.LJLJI = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.LJLJJI = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LJLJI > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.LJLJI;
            if (measuredWidth > i3) {
                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                super.onMeasure(i, i2);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mu);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mt);
        if (this.LJLIL.getLayout().getLineCount() > 1) {
            if (this.LJLJJI > 0 && this.LJLILLLLZI.getMeasuredWidth() > this.LJLJJI) {
                if (!LIZ(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    return;
                }
                super.onMeasure(i, i2);
            }
        } else {
            dimensionPixelSize = dimensionPixelSize2;
        }
        if (!LIZ(0, dimensionPixelSize, dimensionPixelSize)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public final boolean LIZ(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.LJLIL.getPaddingTop() != i2 || this.LJLIL.getPaddingBottom() != i3) {
            TextView textView = this.LJLIL;
            if (C16310kV.LJI(textView)) {
                C16310kV.LJIIJ(textView, C16310kV.LJFF(textView), i2, C16310kV.LJ(textView), i3);
                return true;
            }
            textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
            return true;
        }
        return z;
    }
}
