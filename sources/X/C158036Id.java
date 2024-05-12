package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* renamed from: X.6Id, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158036Id extends View {
    public Paint LJLIL;
    public Paint LJLILLLLZI;
    public final int LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;

    public int getColor() {
        return this.LJLJJI;
    }

    public C158036Id(Context context) {
        super(context, null);
        this.LJLJI = 6;
        this.LJLJJI = -1;
        Paint paint = new Paint();
        this.LJLILLLLZI = paint;
        paint.setColor(-1);
        this.LJLILLLLZI.setAntiAlias(true);
        this.LJLILLLLZI.setStyle(Paint.Style.STROKE);
        float f = 6;
        this.LJLILLLLZI.setStrokeWidth(f);
        Paint paint2 = new Paint();
        this.LJLIL = paint2;
        paint2.setColor(this.LJLJJI);
        this.LJLIL.setAntiAlias(true);
        this.LJLIL.setStyle(Paint.Style.FILL);
        this.LJLIL.setStrokeWidth(f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2;
        canvas.drawCircle(width, width, (r3 - this.LJLJI) - 4, this.LJLILLLLZI);
        canvas.drawCircle(width, width, r3 - (this.LJLJI * 2), this.LJLIL);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }
}
