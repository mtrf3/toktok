package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.aSE, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93522aSE extends View {
    public final Paint LJLIL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        if (canvas != null) {
            canvas.drawCircle(width, height, getWidth() / 2.0f, this.LJLIL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93522aSE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        Paint paint = new Paint();
        this.LJLIL = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
    }
}
