package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.O5a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61326O5a extends View {
    public int LJLIL;
    public int LJLILLLLZI;
    public Paint LJLJI;
    public Rect LJLJJI;

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LJLJI = new Paint(1);
        this.LJLJJI = new Rect();
    }

    public int getProgress() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LJLJJI.set(0, 0, (getMeasuredWidth() * this.LJLIL) / this.LJLILLLLZI, getMeasuredHeight());
        canvas.drawRect(this.LJLJJI, this.LJLJI);
    }

    public void setColor(int i) {
        this.LJLJI.setColor(i);
        postInvalidate();
    }

    public void setMaxProgress(int i) {
        this.LJLILLLLZI = i;
        postInvalidate();
    }

    public void setProgress(int i) {
        this.LJLIL = i;
        postInvalidate();
    }

    public C61326O5a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLILLLLZI = 100;
    }
}
