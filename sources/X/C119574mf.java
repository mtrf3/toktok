package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119574mf extends C119624mk {
    public Paint LJLLLLLL;
    public boolean LJLZ;

    private final Paint getPaint() {
        int i;
        Paint LIZIZ = C6D8.LIZIZ(true);
        LIZIZ.setStyle(Paint.Style.STROKE);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.dz, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        LIZIZ.setColor(i);
        LIZIZ.setStrokeWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(0.5d))));
        return LIZIZ;
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final boolean getShouldDrawBorder() {
        return this.LJLZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119574mf(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLLLLLL = getPaint();
        this.LJLZ = true;
    }

    @Override // X.C72433Sbl, X.VA9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        super.onDraw(canvas);
        if (this.LJLZ && (paint = this.LJLLLLLL) != null && canvas != null) {
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - (paint.getStrokeWidth() / 2), paint);
        }
    }

    public final void setShouldDrawBorder(boolean z) {
        this.LJLZ = z;
        if (!z) {
            this.LJLLLLLL = null;
        } else {
            if (this.LJLLLLLL != null) {
                return;
            }
            this.LJLLLLLL = getPaint();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119574mf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        this.LJLLLLLL = getPaint();
        this.LJLZ = true;
    }
}
