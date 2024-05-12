package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SJQ extends C71799SFv {
    public final Region LLFZ;
    public final Region LLI;
    public final Region LLIFFJFJJ;
    public final Path LLII;
    public final Path LLIIII;
    public Path LLIIIILZ;
    public final int LLIIIJ;
    public boolean LLIIIL;
    public final Paint LLIIIZ;
    public float LLIIJI;

    public final Path LJIIL() {
        this.LLII.reset();
        this.LLIIII.reset();
        this.LLFZ.setEmpty();
        this.LLI.setEmpty();
        this.LLIFFJFJJ.setEmpty();
        if (this.LLIIIL) {
            float width = getWidth() * 0.5f;
            this.LLII.addCircle(width, width, width, Path.Direction.CW);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (C26338AVi.LIZJ(context)) {
                Path path = this.LLIIII;
                float f = this.LLIIJI - this.LLIIIJ;
                int height = getHeight();
                int i = this.LLIIIJ;
                float f2 = height + i;
                float f3 = this.LLIIJI;
                path.addCircle(f, f2 - f3, f3 + i, Path.Direction.CW);
            } else {
                Path path2 = this.LLIIII;
                float width2 = (getWidth() + this.LLIIIJ) - this.LLIIJI;
                int height2 = getHeight();
                int i2 = this.LLIIIJ;
                float f4 = height2 + i2;
                float f5 = this.LLIIJI;
                path2.addCircle(width2, f4 - f5, f5 + i2, Path.Direction.CW);
            }
            this.LLIFFJFJJ.set(0, 0, getWidth(), getHeight());
            this.LLI.setPath(this.LLIIII, this.LLIFFJFJJ);
            this.LLFZ.setPath(this.LLII, this.LLIFFJFJJ);
            this.LLFZ.op(this.LLI, Region.Op.DIFFERENCE);
        } else {
            float width3 = getWidth() * 0.5f;
            this.LLII.addCircle(width3, width3, width3, Path.Direction.CW);
            this.LLIFFJFJJ.set(0, 0, getWidth(), getHeight());
            this.LLFZ.setPath(this.LLII, this.LLIFFJFJJ);
        }
        Path boundaryPath = this.LLFZ.getBoundaryPath();
        o.LJIIIIZZ(boundaryPath, "avatarRegion.boundaryPath");
        return boundaryPath;
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final float getIconRadius() {
        return this.LLIIJI;
    }

    @Override // X.C72434Sbm, X.VA9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        int save = canvas.save();
        try {
            canvas.clipPath(this.LLIIIILZ);
            super.onDraw(canvas);
            canvas.drawPath(this.LLIIIILZ, this.LLIIIZ);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void setHollow(boolean z) {
        this.LLIIIL = z;
        invalidate();
    }

    public final void setIconRadius(float f) {
        this.LLIIJI = f;
        LJIIL();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SJQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SJQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LLFZ = new Region();
        this.LLI = new Region();
        this.LLIFFJFJJ = new Region();
        this.LLII = new Path();
        this.LLIIII = new Path();
        this.LLIIIILZ = new Path();
        this.LLIIIJ = C7MY.LIZIZ(2);
        this.LLIIIL = true;
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setAntiAlias(true);
        this.LLIIIZ = paint;
        this.LLIIJI = C32151Nz.LJIIZILJ(9);
    }

    @Override // X.C72434Sbm, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLIIIILZ = LJIIL();
    }
}
