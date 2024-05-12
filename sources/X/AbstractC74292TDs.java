package X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.TDs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC74292TDs {
    public final C74291TDr LIZ;
    public final RectF LIZIZ;
    public final Path LIZJ;
    public float[] LIZLLL;

    public void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
    }

    public abstract void LIZIZ(float[] fArr);

    public AbstractC74292TDs(C74291TDr view) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
        this.LIZIZ = new RectF();
        this.LIZJ = new Path();
    }
}
