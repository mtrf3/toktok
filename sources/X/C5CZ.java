package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;

/* renamed from: X.5CZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CZ extends View {
    public final Paint LJLIL;
    public final Path LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.LJLILLLLZI;
        path.moveTo(0.0f, getHeight() - (this.LJLJI * 0.293f));
        path.lineTo(this.LJLJI * 0.707f, getHeight() - (this.LJLJI * 0.293f));
        float f = 2;
        float f2 = this.LJLJJI;
        path.lineTo((getWidth() / f) - (f2 * 0.707f), f2 * 0.707f);
        float f3 = this.LJLJJI;
        path.lineTo((f3 * 0.707f) + (getWidth() / f), f3 * 0.707f);
        path.lineTo(getWidth() - (this.LJLJI * 0.707f), getHeight() - (this.LJLJI * 0.293f));
        path.lineTo(getWidth(), getHeight() - (this.LJLJI * 0.293f));
        path.lineTo(getWidth(), getHeight());
        path.lineTo(0.0f, getHeight());
        path.lineTo(0.0f, getHeight() - (this.LJLJI * 0.293f));
        path.close();
        if (canvas != null) {
            canvas.drawPath(this.LJLILLLLZI, this.LJLIL);
            float f4 = this.LJLJJI;
            float f5 = this.LJLJJI;
            canvas.drawArc(new RectF((getWidth() / f) - f4, f4 * 0.414f, (getWidth() / f) + f5, f5 * 2.414f), 225.0f, 90.0f, true, this.LJLIL);
        }
        this.LJLIL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        if (canvas != null) {
            float f6 = -this.LJLJI;
            float height = getHeight();
            float f7 = this.LJLJI;
            canvas.drawArc(new RectF(f6, height - (f7 * f), f7, getHeight()), 45.0f, 45.0f, true, this.LJLIL);
            canvas.drawArc(new RectF(getWidth() - this.LJLJI, getHeight() - (this.LJLJI * f), getWidth() + this.LJLJI, getHeight()), 90.0f, 45.0f, true, this.LJLIL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5CZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        this.LJLIL = paint;
        this.LJLILLLLZI = new Path();
        this.LJLJI = C74275TDb.LIZ(5.7f);
        this.LJLJJI = C74275TDb.LIZ(4.24f);
        setLayerType(1, null);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }
}
