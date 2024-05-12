package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5BZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5BZ extends AppCompatImageView {
    public static final int LJLJI;
    public static final int LJLJJI;
    public static final int LJLJJL;
    public final Paint LJLIL;
    public Path LJLILLLLZI;

    static {
        float f;
        float f2;
        if (C1291054w.LJ().LJJJLL) {
            f = 26.0f;
        } else {
            f = 20.0f;
        }
        LJLJI = C134845Qy.LIZ(f);
        if (C1291054w.LJ().LJJJLL) {
            f2 = 30.0f;
        } else {
            f2 = 23.0f;
        }
        LJLJJI = C134845Qy.LIZ(f2);
        LJLJJL = C134845Qy.LIZ(2.0f);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5BZ(Context context) {
        this(context, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        canvas.clipPath(this.LJLILLLLZI);
        super.onDraw(canvas);
        canvas.drawPath(this.LJLILLLLZI, this.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5BZ(Context context, Object obj) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        int i = LJLJJL;
        Paint paint = new Paint();
        this.LJLIL = paint;
        this.LJLILLLLZI = new Path();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.getSize(i);
        } else {
            i3 = LJLJI;
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            i4 = View.MeasureSpec.getSize(i2);
        } else {
            i4 = LJLJJI;
        }
        setMeasuredDimension(i3, i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5BZ(Context context, int i) {
        this(context, (Object) null);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = new Path();
        float f = i / 20.0f;
        float f2 = i2 / 23.0f;
        if (f >= f2) {
            f = f2;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        path.reset();
        path.moveTo(10.0f, 1.0f);
        path.cubicTo(5.04f, 1.0f, 1.0f, 5.02f, 1.0f, 9.99f);
        path.cubicTo(1.0f, 11.35f, 1.57f, 12.77f, 2.32f, 14.07f);
        path.cubicTo(3.07f, 15.39f, 4.08f, 16.69f, 5.08f, 17.82f);
        path.cubicTo(6.08f, 18.95f, 7.1f, 19.95f, 7.9f, 20.66f);
        path.cubicTo(8.31f, 21.02f, 8.66f, 21.31f, 8.95f, 21.52f);
        path.cubicTo(9.09f, 21.62f, 9.22f, 21.72f, 9.34f, 21.79f);
        path.cubicTo(9.4f, 21.83f, 9.48f, 21.87f, 9.56f, 21.9f);
        path.cubicTo(9.61f, 21.92f, 9.78f, 22.0f, 10.0f, 22.0f);
        path.cubicTo(10.22f, 22.0f, 10.39f, 21.92f, 10.44f, 21.9f);
        path.cubicTo(10.52f, 21.87f, 10.6f, 21.83f, 10.66f, 21.79f);
        path.cubicTo(10.78f, 21.72f, 10.91f, 21.62f, 11.05f, 21.52f);
        path.cubicTo(11.34f, 21.31f, 11.69f, 21.02f, 12.1f, 20.66f);
        path.cubicTo(12.9f, 19.95f, 13.92f, 18.95f, 14.92f, 17.82f);
        path.cubicTo(15.92f, 16.69f, 16.93f, 15.39f, 17.68f, 14.07f);
        path.cubicTo(18.43f, 12.77f, 19.0f, 11.35f, 19.0f, 9.99f);
        path.cubicTo(19.0f, 5.02f, 14.96f, 1.0f, 10.0f, 1.0f);
        path.transform(matrix);
        this.LJLILLLLZI = path;
    }
}
