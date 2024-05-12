package X;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TBO {
    public final float[] LIZ = new float[8];
    public Path LIZIZ;
    public Paint LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public ColorStateList LJFF;
    public int LJI;
    public boolean LJII;
    public Region LJIIIIZZ;
    public RectF LJIIIZ;

    public final Path LIZ() {
        Path path = this.LIZIZ;
        if (path != null) {
            return path;
        }
        o.LJIJI("mClipPath");
        throw null;
    }

    public final RectF LIZIZ() {
        RectF rectF = this.LJIIIZ;
        if (rectF != null) {
            return rectF;
        }
        o.LJIJI("mLayer");
        throw null;
    }

    public final Paint LIZJ() {
        Paint paint = this.LIZJ;
        if (paint != null) {
            return paint;
        }
        o.LJIJI("mPaint");
        throw null;
    }

    public final void LIZLLL(View view) {
        float width;
        o.LJIIIZ(view, "view");
        int width2 = (int) LIZIZ().width();
        int height = (int) LIZIZ().height();
        RectF rectF = new RectF();
        rectF.left = view.getPaddingLeft();
        rectF.top = view.getPaddingTop();
        float f = width2;
        rectF.right = f - view.getPaddingRight();
        float f2 = height;
        rectF.bottom = f2 - view.getPaddingBottom();
        LIZ().reset();
        if (this.LIZLLL) {
            if (rectF.width() >= rectF.height()) {
                width = rectF.height();
            } else {
                width = rectF.width();
            }
            float f3 = width / 2;
            float f4 = width2 / 2;
            float f5 = height / 2;
            PointF pointF = new PointF(f4, f5);
            if (Build.VERSION.SDK_INT <= 27) {
                LIZ().addCircle(pointF.x, pointF.y, f3, Path.Direction.CW);
                LIZ().moveTo(0.0f, 0.0f);
                LIZ().moveTo(f, f2);
            } else {
                float f6 = f5 - f3;
                LIZ().moveTo(rectF.left, f6);
                LIZ().addCircle(pointF.x, f6 + f3, f3, Path.Direction.CW);
            }
        } else {
            LIZ().addRoundRect(rectF, this.LIZ, Path.Direction.CW);
        }
        Region region = new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        Region region2 = this.LJIIIIZZ;
        if (region2 != null) {
            region2.setPath(LIZ(), region);
        } else {
            o.LJIJI("mAreaRegion");
            throw null;
        }
    }
}
