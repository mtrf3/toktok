package X;

import android.content.Context;
import android.graphics.Canvas;
import kotlin.jvm.internal.o;

/* renamed from: X.8FZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8FZ extends SY9 {
    public float LJIILLIIL;

    @Override // X.SY9, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        int width = getBounds().width();
        int height = getBounds().height();
        canvas.save();
        canvas.rotate(this.LJIILLIIL, (width / 2.0f) + getBounds().left, (height / 2.0f) + getBounds().top);
        super.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8FZ(Context ctx, int i) {
        super(ctx, i);
        o.LJIIIZ(ctx, "ctx");
    }
}
