package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.4ie, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117084ie extends View {
    public final Paint LJLIL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas != null) {
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, C32151Nz.LJIIZILJ(2), this.LJLIL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C117084ie(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        Integer LJI = C79045V0n.LJI(R.attr.go, context);
        paint.setColor(LJI != null ? LJI.intValue() : 0);
        this.LJLIL = paint;
    }
}
