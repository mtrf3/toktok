package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MXI extends ConstraintLayout {
    public static final int LJLILLLLZI = C17N.LJIILL(10.0d);
    public int LJLIL;

    static {
        C17N.LJIILL(14.0d);
    }

    public final int getRightCoverTopMargin() {
        return this.LJLIL;
    }

    public final void setRightCoverTopMargin(int i) {
        this.LJLIL = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MXI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View findViewById;
        View findViewById2;
        int i3;
        super.onMeasure(i, i2);
        View findViewById3 = findViewById(R.id.h5z);
        if (findViewById3 == null || (findViewById = findViewById(R.id.h4p)) == null || (findViewById2 = findViewById(R.id.h4v)) == null) {
            return;
        }
        if (findViewById.getVisibility() == 0) {
            int measuredHeight = getMeasuredHeight();
            int measuredHeight2 = findViewById3.getMeasuredHeight();
            if (findViewById2.getMeasuredHeight() == 0) {
                findViewById2 = findViewById(R.id.h4x);
            }
            int measuredHeight3 = findViewById2.getMeasuredHeight();
            int measuredHeight4 = findViewById.getMeasuredHeight();
            if (measuredHeight2 > measuredHeight3) {
                i3 = LJLILLLLZI;
            } else {
                i3 = (measuredHeight - measuredHeight4) / 2;
            }
            this.LJLIL = i3;
        }
        View findViewById4 = findViewById(R.id.h5f);
        if (findViewById4 != null && (findViewById4 instanceof TextView)) {
            TextView textView = (TextView) findViewById4;
            if (textView.getVisibility() == 0) {
                CharSequence text = textView.getText();
                o.LJIIIIZZ(text, "title.text");
                TextPaint paint = textView.getPaint();
                o.LJIIIIZZ(paint, "title.paint");
                textView.setText(MXH.LIZJ(new SpannableStringBuilder(text), paint, textView.getMeasuredWidth(), textView.getMaxLines(), 0, 0));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MXI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View findViewById = findViewById(R.id.h4p);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            findViewById.setTop(this.LJLIL);
            findViewById.setBottom((findViewById.getMeasuredHeight() + r1) - 1);
        }
    }
}
