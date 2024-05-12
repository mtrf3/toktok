package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5DU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5DU extends View {
    public final Paint LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public final RectF LJLJJLL;
    public final RectF LJLJL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        RectF rectF = this.LJLJJLL;
        int i = this.LJLILLLLZI;
        canvas.drawRoundRect(rectF, i, i, this.LJLIL);
        RectF rectF2 = this.LJLJL;
        int i2 = this.LJLILLLLZI;
        canvas.drawRoundRect(rectF2, i2, i2, this.LJLIL);
    }

    public final void setBgColor(int i) {
        this.LJLIL.setColor(i);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5DU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        this.LJLIL = paint;
        this.LJLJJLL = new RectF();
        this.LJLJL = new RectF();
        paint.setAntiAlias(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ym, R.attr.z5, R.attr.a3n, R.attr.ab5, R.attr.ad8, R.attr.aew, R.attr.ai5, R.attr.ai6, R.attr.ai7, R.attr.ai8, R.attr.aib, R.attr.aic, R.attr.aid, R.attr.aie, R.attr.aif, R.attr.aig, R.attr.aih, R.attr.aii, R.attr.aiz, R.attr.aj0, R.attr.aj1, R.attr.ajb, R.attr.akq, R.attr.aol, R.attr.ay2, R.attr.b1l, R.attr.b25, R.attr.b36, R.attr.b3k, R.attr.b4p, R.attr.b4q, R.attr.b8z, R.attr.b_d, R.attr.b_p, R.attr.baf, R.attr.bag, R.attr.bff, R.attr.bi_, R.attr.bii, R.attr.bin, R.attr.biw, R.attr.bj3, R.attr.bjp, R.attr.bkc, R.attr.bvl, R.attr.bvx, R.attr.bvz});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.AVDmtView)");
            this.LJLILLLLZI = (int) obtainStyledAttributes.getDimension(31, 0.0f);
            this.LJLJI = (int) obtainStyledAttributes.getDimension(23, 0.0f);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLJJI = View.MeasureSpec.getSize(i);
        this.LJLJJL = View.MeasureSpec.getSize(i2);
        RectF rectF = this.LJLJJLL;
        int i3 = this.LJLJI;
        rectF.set(0.0f, (r5 - i3) / 2, this.LJLJJI, (r5 + i3) / 2);
        RectF rectF2 = this.LJLJL;
        int i4 = this.LJLJJI;
        int i5 = this.LJLJI;
        rectF2.set((i4 - i5) / 2, 0.0f, (i4 + i5) / 2, this.LJLJJL);
    }
}
