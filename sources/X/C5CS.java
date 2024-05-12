package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.5CS, reason: invalid class name */
/* loaded from: classes3.dex */
public class C5CS extends View {
    public Paint LJLIL;
    public Path LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Path path = this.LJLILLLLZI;
        if (path != null) {
            path.reset();
        }
        if (this.LJLJJL == 0 || this.LJLJJLL == 0) {
            this.LJLJJL = getWidth();
            this.LJLJJLL = getHeight();
        }
        this.LJLJL = getPaddingLeft();
        this.LJLJLJ = getPaddingRight();
        this.LJLJLLL = getPaddingTop();
        this.LJLL = getPaddingBottom();
        this.LJLILLLLZI.moveTo(this.LJLJL, this.LJLJLLL);
        this.LJLILLLLZI.lineTo(this.LJLJJL - this.LJLJLJ, this.LJLJJLL - this.LJLL);
        this.LJLILLLLZI.moveTo(this.LJLJL, this.LJLJJLL - this.LJLL);
        this.LJLILLLLZI.lineTo(this.LJLJJL - this.LJLJLJ, this.LJLJLLL);
        canvas.save();
        canvas.drawPath(this.LJLILLLLZI, this.LJLIL);
        canvas.restore();
    }

    public C5CS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.aof, R.attr.aol});
        this.LJLJI = obtainStyledAttributes.getColor(0, -16777216);
        this.LJLJJI = obtainStyledAttributes.getDimensionPixelSize(1, C17N.LJIILL(1.0d));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.LJLIL = paint;
        paint.setColor(this.LJLJI);
        this.LJLIL.setStrokeWidth(this.LJLJJI);
        this.LJLIL.setAntiAlias(true);
        this.LJLIL.setStyle(Paint.Style.STROKE);
        this.LJLIL.setStrokeJoin(Paint.Join.ROUND);
        this.LJLIL.setStrokeCap(Paint.Cap.ROUND);
        this.LJLILLLLZI = new Path();
    }
}
