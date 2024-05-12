package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;
import n.b;

/* renamed from: X.5DV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5DV extends View {
    public final Paint LJLIL;
    public final Path LJLILLLLZI;
    public final SY9 LJLJI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LJLIL.setAntiAlias(true);
        this.LJLILLLLZI.moveTo(0.0f, 0.0f);
        this.LJLILLLLZI.lineTo(getWidth(), 0.0f);
        this.LJLILLLLZI.lineTo(getWidth(), getHeight());
        this.LJLILLLLZI.lineTo(0.0f, 0.0f);
        this.LJLILLLLZI.close();
        canvas.drawPath(this.LJLILLLLZI, this.LJLIL);
        int width = getWidth() / 17;
        this.LJLJI.setBounds((getWidth() - width) / 2, width, getWidth() - width, (getHeight() / 2) + width);
        this.LJLJI.draw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5DV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        this.LJLIL = paint;
        this.LJLILLLLZI = new Path();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_tick_fill;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        this.LJLJI = c2068389v.LIZ(context);
        paint.setColor(b.LIZIZ(R.attr.eb, context));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
