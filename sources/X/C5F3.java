package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;

/* renamed from: X.5F3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5F3 extends View {
    public float LJLIL;
    public int LJLILLLLZI;
    public final Path LJLJI;
    public final Paint LJLJJI;

    public final int getMaskHeight() {
        return (int) (this.LJLILLLLZI - this.LJLIL);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight() - this.LJLILLLLZI;
        float width = getWidth();
        float height2 = getHeight();
        this.LJLJI.reset();
        this.LJLJI.moveTo(0.0f, height);
        Path path = this.LJLJI;
        float f = this.LJLIL;
        path.arcTo(0.0f, height - f, f + f, height + f, 180.0f, -90.0f, true);
        Path path2 = this.LJLJI;
        float f2 = this.LJLIL;
        path2.lineTo((width - f2) - f2, f2 + height);
        Path path3 = this.LJLJI;
        float f3 = this.LJLIL;
        path3.arcTo((width - f3) - f3, height - f3, width, height + f3, 90.0f, -90.0f, false);
        this.LJLJI.lineTo(width, height2);
        this.LJLJI.lineTo(0.0f, height2);
        this.LJLJI.lineTo(0.0f, height);
        if (canvas != null) {
            canvas.drawPath(this.LJLJI, this.LJLJJI);
        }
    }

    public final void setColor(int i) {
        this.LJLJJI.setColor(i);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5F3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJI = new Path();
        Paint paint = new Paint();
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.LJLJJI = paint;
    }
}
