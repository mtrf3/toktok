package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4mU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119464mU extends View {
    public final float LJLIL;
    public int LJLILLLLZI;
    public final Paint LJLJI;
    public final Paint LJLJJI;

    public final int getColor() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        float f = 2;
        float min = Math.min(getWidth(), getHeight()) / f;
        canvas.drawCircle(getWidth() / f, getHeight() / f, min - (this.LJLIL / f), this.LJLJI);
        this.LJLJJI.setColor(this.LJLILLLLZI);
        canvas.drawCircle(getWidth() / f, getHeight() / f, min - this.LJLIL, this.LJLJJI);
    }

    public final void setColor(int i) {
        this.LJLILLLLZI = i;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119464mU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C74275TDb.LIZIZ(context, 3.0f);
        this.LJLILLLLZI = -16777216;
        Paint paint = new Paint();
        Integer LJI = C79045V0n.LJI(R.attr.dm, context);
        if (LJI != null) {
            paint.setColor(LJI.intValue());
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(C32151Nz.LJIIZILJ(3));
            paint.setAntiAlias(true);
            this.LJLJI = paint;
            Paint paint2 = new Paint();
            paint2.setColor(-16777216);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            this.LJLJJI = paint2;
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
