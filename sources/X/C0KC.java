package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.0KC, reason: invalid class name */
/* loaded from: classes.dex */
public class C0KC extends View {
    public float LJLIL;
    public float LJLILLLLZI;
    public int LJLJI;
    public Paint LJLJJI;
    public Path LJLJJL;

    public final void LIZ() {
        this.LJLJJL.reset();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        this.LJLJJL.moveTo(this.LJLILLLLZI, getHeight() / 2.0f);
        this.LJLJJL.lineTo(getWidth() / 2.0f, (this.LJLJI * this.LJLIL) + (getHeight() / 2.0f));
        this.LJLJJL.lineTo(getWidth() - this.LJLILLLLZI, getHeight() / 2.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.LJLJJL, this.LJLJJI);
    }

    public void setOffset(float f) {
        this.LJLIL = f;
        LIZ();
        invalidate();
    }

    public C0KC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.LJLJJI = paint;
        paint.setColor(C259910h.LIZIZ(R.attr.bn1, getContext()));
        this.LJLJJI.setStyle(Paint.Style.STROKE);
        this.LJLJJI.setStrokeWidth(getContext().getResources().getDimensionPixelSize(R.dimen.x_));
        this.LJLILLLLZI = this.LJLJJI.getStrokeWidth() / 2.0f;
        this.LJLJJI.setStrokeCap(Paint.Cap.ROUND);
        this.LJLJJI.setStrokeJoin(Paint.Join.ROUND);
        this.LJLJJL = new Path();
        this.LJLJI = getContext().getResources().getDimensionPixelSize(R.dimen.x9);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZ();
    }
}
