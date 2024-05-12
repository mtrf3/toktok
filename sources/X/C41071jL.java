package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1jL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C41071jL extends C1K9 {
    public C2H3 LLILLIZIL;
    public C2HQ LLILLJJLI;

    @Override // X.C011602u, android.view.View
    public final void draw(Canvas canvas) {
        C2H3 c2h3 = this.LLILLIZIL;
        if (c2h3 == null) {
            super.draw(canvas);
            return;
        }
        boolean LLLLZIL = c2h3.LJLILLLLZI.LLLLZIL(canvas);
        super.draw(canvas);
        this.LLILLIZIL.LJLILLLLZI.getClass();
        if (!LLLLZIL) {
            return;
        }
        canvas.restore();
    }

    public C41071jL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C2H3 c2h3 = new C2H3(this);
        this.LLILLIZIL = c2h3;
        c2h3.LLLLZLLLI(attributeSet, R.attr.ax3, 0);
        C2HQ c2hq = new C2HQ(this);
        this.LLILLJJLI = c2hq;
        c2hq.LLLLZLLLI(attributeSet, R.attr.ax3, 0);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        LLLLZLLIL(i);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, this.LLILLJJLI.LLLZ(f));
    }
}
