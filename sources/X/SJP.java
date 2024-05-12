package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SJP extends C71799SFv {
    public float LLFZ;
    public final Path LLI;
    public final Path LLIFFJFJJ;
    public final Region LLII;
    public final Region LLIIII;
    public final Region LLIIIILZ;
    public Path LLIIIJ;
    public boolean LLIIIL;
    public final Paint LLIIIZ;

    private final float getInnerSize() {
        int i;
        if (getSizeVariant() >= 48) {
            i = 3;
        } else {
            i = 2;
        }
        return C32151Nz.LJIIZILJ(Integer.valueOf(i));
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.C72434Sbm, X.VA9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        int save = canvas.save();
        try {
            canvas.clipPath(this.LLIIIJ);
            super.onDraw(canvas);
            if (this.LLIIIL) {
                canvas.drawPath(this.LLIIIJ, this.LLIIIZ);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        int save = canvas.save();
        try {
            canvas.clipPath(this.LLIIIJ);
            super.onDrawForeground(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SJP(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.jm);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SJP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LLI = new Path();
        this.LLIFFJFJJ = new Path();
        this.LLII = new Region();
        this.LLIIII = new Region();
        this.LLIIIILZ = new Region();
        this.LLIIIJ = new Path();
        this.LLIIIL = true;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(getAvatarBorderColor());
        paint.setStrokeWidth(getAvatarStrokeWidth());
        paint.setAntiAlias(true);
        this.LLIIIZ = paint;
    }

    @Override // X.C72434Sbm, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLFZ = getSizePx() / 3.0f;
        this.LLI.reset();
        this.LLIFFJFJJ.reset();
        this.LLII.setEmpty();
        this.LLIIII.setEmpty();
        this.LLIIIILZ.setEmpty();
        float sizePx = getSizePx() * 0.5f;
        Path path = this.LLI;
        float f = this.LLFZ;
        path.addCircle(sizePx - f, f + sizePx, getInnerSize() + sizePx, Path.Direction.CW);
        this.LLIFFJFJJ.addCircle(sizePx, sizePx, sizePx, Path.Direction.CW);
        this.LLIIIILZ.set(0, 0, getSizePx(), getSizePx());
        this.LLII.setPath(this.LLI, this.LLIIIILZ);
        this.LLIIII.setPath(this.LLIFFJFJJ, this.LLIIIILZ);
        this.LLIIII.op(this.LLII, Region.Op.DIFFERENCE);
        Path boundaryPath = this.LLIIII.getBoundaryPath();
        o.LJIIIIZZ(boundaryPath, "region1.boundaryPath");
        this.LLIIIJ = boundaryPath;
        this.LLIIIZ.setStrokeWidth(getAvatarStrokeWidth());
    }
}
