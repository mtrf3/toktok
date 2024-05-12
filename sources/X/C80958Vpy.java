package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Vpy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80958Vpy implements InterfaceC80963Vq3 {
    public final Paint LIZ;
    public final ArrayList<OSZ<Integer, Path>> LIZIZ;

    public C80958Vpy() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.LIZ = paint;
        this.LIZIZ = new ArrayList<>();
    }

    @Override // X.InterfaceC80963Vq3
    public final void LIZ(float f, Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        Iterator<OSZ<Integer, Path>> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            OSZ<Integer, Path> next = it.next();
            Paint paint = this.LIZ;
            int intValue = next.getFirst().intValue();
            paint.setColor(Color.argb(O6R.LJJIIZ(Color.alpha(intValue) * Math.abs(f)), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
            canvas.drawPath(next.getSecond(), this.LIZ);
        }
    }

    @Override // X.InterfaceC80963Vq3
    public final void LIZIZ(C80962Vq2 skeletonGlobalConfig, List<C80964Vq4> elements, int i, int i2) {
        o.LJIIIZ(skeletonGlobalConfig, "skeletonGlobalConfig");
        o.LJIIIZ(elements, "elements");
        this.LIZIZ.clear();
        Iterator it = ((ArrayList) elements).iterator();
        while (it.hasNext()) {
            C80964Vq4 c80964Vq4 = (C80964Vq4) it.next();
            RectF rectF = new RectF(c80964Vq4.LJIIIZ, c80964Vq4.LJIIJ, c80964Vq4.LJIIJJI, c80964Vq4.LJIIL);
            Path path = new Path();
            path.addRoundRect(rectF, c80964Vq4.LIZIZ, c80964Vq4.LIZJ, Path.Direction.CW);
            this.LIZIZ.add(new OSZ<>(Integer.valueOf(c80964Vq4.LIZLLL), path));
        }
    }
}
