package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* loaded from: classes7.dex */
public class DIT extends View {
    public final Paint LJLIL;
    public final Paint LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;

    public DIT(Context context) {
        super(context);
        Paint paint = new Paint();
        this.LJLIL = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.LJLILLLLZI = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        this.LJLIL.setAlpha(this.LJLJI);
        float f = width;
        canvas.drawCircle(f, f, f, this.LJLIL);
        this.LJLILLLLZI.setAlpha(this.LJLJJI);
        canvas.drawCircle(f, f, width - (this.LJLJJL / 2), this.LJLILLLLZI);
    }

    public void setFillAlpha(int i) {
        this.LJLJI = i;
        invalidate();
    }

    public void setSolidColor(int i) {
        this.LJLIL.setColor(i);
        invalidate();
    }

    public void setStrokeAlpha(int i) {
        this.LJLJJI = i;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.LJLILLLLZI.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(int i) {
        this.LJLJJL = i;
        this.LJLILLLLZI.setStrokeWidth(i);
        invalidate();
    }
}
