package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import kotlin.jvm.internal.o;

/* renamed from: X.abO, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94090abO extends C94005aa1 {
    public final Paint LJLJJLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getItemContainer().getChildCount() > 0 && canvas != null) {
            canvas.drawCircle((getWidth() / 2.0f) + getScrollX(), getHeight() - C93410aQQ.LIZ(2.0f), C93410aQQ.LIZ(2.0f), this.LJLJJLL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94090abO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.LJLJJLL = paint;
        setWillNotDraw(false);
    }
}
