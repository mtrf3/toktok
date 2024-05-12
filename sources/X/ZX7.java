package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes29.dex */
public final class ZX7 extends ListView {
    public final List<ZX6> LJLIL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float interpolation;
        super.onDraw(canvas);
        if (((ArrayList) this.LJLIL).size() > 0) {
            Iterator it = ((ArrayList) this.LJLIL).iterator();
            while (it.hasNext()) {
                ZX6 zx6 = (ZX6) it.next();
                BitmapDrawable bitmapDrawable = zx6.LIZ;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                if (!zx6.LJIIJJI) {
                    float f = 0.0f;
                    float max = Math.max(0.0f, Math.min(1.0f, ((float) (drawingTime - zx6.LJIIIZ)) / ((float) zx6.LJ)));
                    if (zx6.LJIIJ) {
                        f = max;
                    }
                    Interpolator interpolator = zx6.LIZLLL;
                    if (interpolator == null) {
                        interpolation = f;
                    } else {
                        interpolation = interpolator.getInterpolation(f);
                    }
                    int i = (int) (zx6.LJI * interpolation);
                    Rect rect = zx6.LIZJ;
                    Rect rect2 = zx6.LJFF;
                    rect.top = rect2.top + i;
                    rect.bottom = rect2.bottom + i;
                    float f2 = zx6.LJII;
                    float f3 = f2 + ((zx6.LJIIIIZZ - f2) * interpolation);
                    zx6.LIZIZ = f3;
                    BitmapDrawable bitmapDrawable2 = zx6.LIZ;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (f3 * 255.0f));
                        zx6.LIZ.setBounds(zx6.LIZJ);
                    }
                    if (zx6.LJIIJ && f >= 1.0f) {
                        zx6.LJIIJJI = true;
                        ZX5 zx5 = zx6.LJIIL;
                        if (zx5 != null) {
                            C90576Zgi c90576Zgi = (C90576Zgi) zx5;
                            ((HashSet) c90576Zgi.LIZIZ.LLIIIJ).remove(c90576Zgi.LIZ);
                            c90576Zgi.LIZIZ.LLIFFJFJJ.notifyDataSetChanged();
                        }
                    }
                    if (!(!zx6.LJIIJJI)) {
                    }
                }
                it.remove();
            }
        }
    }

    public ZX7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = new ArrayList();
    }
}
