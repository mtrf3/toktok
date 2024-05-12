package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5Qh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134675Qh extends ConstraintLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final RectF LJLJJL;
    public final float[] LJLJJLL;
    public final Path LJLJL;
    public final Paint LJLJLJ;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        super.draw(canvas);
        if (this.LJLIL == 0 && this.LJLJI == 0 && this.LJLILLLLZI == 0 && this.LJLJJI == 0) {
            return;
        }
        this.LJLJL.reset();
        this.LJLJL.setFillType(Path.FillType.INVERSE_WINDING);
        this.LJLJL.addRoundRect(this.LJLJJL, this.LJLJJLL, Path.Direction.CW);
        canvas.drawPath(this.LJLJL, this.LJLJLJ);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C134675Qh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C134675Qh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLJJL = new RectF();
        this.LJLJJLL = new float[8];
        this.LJLJL = new Path();
        Paint paint = new Paint(1);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.LJLJLJ = paint;
    }

    public final void LJJLJLI(int i, int i2, int i3, int i4) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
        float[] fArr = this.LJLJJLL;
        float f = i;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = i3;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = i4;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = i2;
        fArr[6] = f4;
        fArr[7] = f4;
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLJJL.set(0.0f, 0.0f, getWidth(), getHeight());
    }
}
