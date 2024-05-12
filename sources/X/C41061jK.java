package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1jK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C41061jK extends C1K7 {
    public C2HQ LJLJL;
    public C2H3 LJLJLJ;
    public C2HM LJLJLLL;

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

    public C41061jK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C2H3 c2h3 = new C2H3(this);
        this.LJLJLJ = c2h3;
        c2h3.LLLLZLLLI(attributeSet, R.attr.awu, 0);
        C2HQ c2hq = new C2HQ(this);
        this.LJLJL = c2hq;
        c2hq.LLLLZLLLI(attributeSet, R.attr.awu, 0);
        C2HM c2hm = new C2HM(this);
        this.LJLJLLL = c2hm;
        c2hm.LLLLZLLLI(attributeSet, R.attr.awu, 0);
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
