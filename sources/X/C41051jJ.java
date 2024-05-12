package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1jJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C41051jJ extends C1K2 {
    public C2HQ LJLJL;
    public C2H3 LJLJLJ;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C2H3 c2h3 = this.LJLJLJ;
        if (c2h3 == null) {
            super.draw(canvas);
            return;
        }
        boolean LLLLZIL = c2h3.LJLILLLLZI.LLLLZIL(canvas);
        super.draw(canvas);
        this.LJLJLJ.LJLILLLLZI.getClass();
        if (!LLLLZIL) {
            return;
        }
        canvas.restore();
    }

    public C41051jJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C2H3 c2h3 = new C2H3(this);
        this.LJLJLJ = c2h3;
        c2h3.LLLLZLLLI(attributeSet, R.attr.aqk, 0);
        C2HQ c2hq = new C2HQ(this);
        this.LJLJL = c2hq;
        c2hq.LLLLZLLLI(attributeSet, R.attr.aqk, 0);
        new C2HM(this).LLLLZLLLI(attributeSet, R.attr.aqk, 0);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        LLLLZLLIL(i);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, this.LJLJL.LLLZ(f));
    }
}
