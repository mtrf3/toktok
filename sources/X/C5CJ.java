package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5CJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CJ extends AppCompatImageView {
    public final Paint LJLIL;
    public float LJLILLLLZI;
    public final Path LJLJI;
    public final Path LJLJJI;
    public final RectF LJLJJL;

    public final void LIZ() {
        this.LJLJI.reset();
        this.LJLJJI.reset();
        this.LJLJJL.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.LJLJJI;
        RectF rectF = this.LJLJJL;
        float f = this.LJLILLLLZI;
        path.addRoundRect(rectF, f, f, Path.Direction.CCW);
        this.LJLJI.addRect(this.LJLJJL, Path.Direction.CCW);
        this.LJLJI.op(this.LJLJJI, Path.Op.XOR);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (this.LJLILLLLZI == 0.0f) {
            return;
        }
        canvas.drawPath(this.LJLJI, this.LJLIL);
    }

    public final void setBGColor(int i) {
        this.LJLIL.setColor(i);
    }

    public final void setCornerRadius(int i) {
        this.LJLILLLLZI = i;
        LIZ();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5CJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5CJ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-15000805);
        this.LJLIL = paint;
        this.LJLJI = new Path();
        this.LJLJJI = new Path();
        this.LJLJJL = new RectF();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LJLILLLLZI == 0.0f) {
            return;
        }
        LIZ();
    }
}
