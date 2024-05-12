package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5Fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131775Fd extends View {
    public boolean LJLIL;
    public final Paint LJLILLLLZI;
    public final RectF LJLJI;
    public final float LJLJJI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (this.LJLIL) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
            this.LJLJI.set(getLeft(), getTop(), getRight(), getBottom());
            canvas.drawColor(0);
            RectF rectF = this.LJLJI;
            float f = this.LJLJJI;
            canvas.drawRoundRect(rectF, f, f, this.LJLILLLLZI);
            canvas.restoreToCount(saveLayer);
            return;
        }
        canvas.drawColor(0);
    }

    public final void setColor(int i) {
        this.LJLILLLLZI.setColor(i);
    }

    public final void setSeleted(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131775Fd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        this.LJLIL = true;
        Paint paint = new Paint(1);
        this.LJLILLLLZI = paint;
        this.LJLJI = new RectF();
        this.LJLJJI = KL2.LIZJ(context, 8.0f);
        float LIZJ = KL2.LIZJ(context, 4.0f);
        paint.setColor(R.attr.e2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(LIZJ);
    }
}
