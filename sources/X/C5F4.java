package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;

/* renamed from: X.5F4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5F4 extends View {
    public float LJLIL;
    public float LJLILLLLZI;
    public final Path LJLJI;
    public final Paint LJLJJI;

    public final int getMaskHeight() {
        return (int) (this.LJLILLLLZI - this.LJLIL);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LJLILLLLZI == 0.0f) {
            return;
        }
        float width = getWidth();
        float f = this.LJLILLLLZI;
        this.LJLJI.reset();
        this.LJLJI.moveTo(0.0f, 0.0f);
        this.LJLJI.lineTo(0.0f, f);
        Path path = this.LJLJI;
        float f2 = this.LJLIL;
        path.arcTo(0.0f, f - f2, f2 + f2, f + f2, 180.0f, 90.0f, true);
        Path path2 = this.LJLJI;
        float f3 = this.LJLIL;
        path2.lineTo((width - f3) - f3, f - f3);
        Path path3 = this.LJLJI;
        float f4 = this.LJLIL;
        path3.arcTo((width - f4) - f4, f - f4, width, f + f4, 270.0f, 90.0f, false);
        this.LJLJI.lineTo(width, 0.0f);
        this.LJLJI.lineTo(0.0f, 0.0f);
        if (canvas != null) {
            canvas.drawPath(this.LJLJI, this.LJLJJI);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5F4(Context context, AttributeSet attributeSet) {
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
