package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.68v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1556168v extends View {
    public Paint LJLIL;
    public Paint LJLILLLLZI;
    public final int LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;

    public int getColor() {
        return this.LJLJJI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        canvas.drawCircle(width, width, width, this.LJLIL);
        canvas.drawCircle(width, width, width - (this.LJLJI / 2.0f), this.LJLILLLLZI);
    }

    public C1556168v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int LIZIZ = (int) C74275TDb.LIZIZ(getContext(), 2.0f);
        this.LJLJI = LIZIZ;
        this.LJLJJI = -1;
        this.LJLJJL = false;
        Paint paint = new Paint();
        this.LJLILLLLZI = paint;
        paint.setColor(-1);
        this.LJLILLLLZI.setAntiAlias(true);
        this.LJLILLLLZI.setStyle(Paint.Style.STROKE);
        this.LJLILLLLZI.setStrokeWidth(LIZIZ);
        Paint paint2 = new Paint();
        this.LJLIL = paint2;
        paint2.setColor(this.LJLJJI);
        this.LJLIL.setAntiAlias(true);
        this.LJLIL.setStyle(Paint.Style.FILL);
        this.LJLIL.setStrokeWidth(LIZIZ);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }
}
