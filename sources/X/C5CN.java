package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.5CN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CN extends View {
    public final Paint LJLIL;
    public final Paint LJLILLLLZI;
    public final Path LJLJI;
    public final Path LJLJJI;

    public final Paint getPaint() {
        return this.LJLIL;
    }

    public final Paint getStroke() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        this.LJLJI.rewind();
        this.LJLJI.moveTo(0.0f, 0.0f);
        this.LJLJI.lineTo(getWidth(), 0.0f);
        this.LJLJI.lineTo(getWidth() / 2.0f, getHeight());
        this.LJLJI.lineTo(0.0f, 0.0f);
        this.LJLJI.close();
        this.LJLJJI.rewind();
        this.LJLJJI.moveTo(0.0f, 0.0f);
        this.LJLJJI.lineTo(getWidth() / 2.0f, getHeight());
        this.LJLJJI.lineTo(getWidth(), 0.0f);
        canvas.drawPath(this.LJLJI, this.LJLIL);
        canvas.drawPath(this.LJLJJI, this.LJLILLLLZI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5CN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        a1.LJFF(context, "context");
        Paint paint = new Paint(1);
        Integer LJI = C79045V0n.LJI(R.attr.ct, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        paint.setColor(i);
        this.LJLIL = paint;
        Paint paint2 = new Paint(1);
        paint2.setStrokeWidth(2.0f);
        Integer LJI2 = C79045V0n.LJI(R.attr.dz, context);
        paint2.setColor(LJI2 != null ? LJI2.intValue() : 0);
        paint2.setStyle(Paint.Style.STROKE);
        this.LJLILLLLZI = paint2;
        this.LJLJI = new Path();
        this.LJLJJI = new Path();
    }
}
