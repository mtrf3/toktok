package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.Fe7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39455Fe7 extends Drawable {
    public final LinkedList<Paint> LIZ;
    public final Paint LIZIZ;
    public final DIJ LIZJ;
    public boolean LIZLLL;

    public abstract void LIZ(Canvas canvas);

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    public AbstractC39455Fe7() {
        LinkedList<Paint> linkedList = new LinkedList<>();
        this.LIZ = linkedList;
        Paint paint = new Paint();
        this.LIZIZ = paint;
        this.LIZJ = new DIJ();
        linkedList.add(paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        if (!this.LIZLLL) {
            Iterator<Paint> it = this.LIZ.iterator();
            while (it.hasNext()) {
                it.next().setAntiAlias(true);
            }
            this.LIZLLL = true;
        }
        canvas.save();
        LIZ(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Iterator<Paint> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Iterator<Paint> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().setColorFilter(colorFilter);
        }
    }

    public final void LIZIZ(float f, float f2, Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        canvas.translate(getBounds().left, getBounds().top);
        canvas.scale(getBounds().width() / f, getBounds().height() / f2);
    }
}
