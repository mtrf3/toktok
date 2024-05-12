package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4mO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119404mO extends View {
    public int LJLIL;
    public final Paint LJLILLLLZI;

    public final int getDotColor() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LJLILLLLZI.setStyle(Paint.Style.FILL);
        this.LJLILLLLZI.setColor(this.LJLIL);
        float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) / 2.0f;
        canvas.drawCircle(min, min, min, this.LJLILLLLZI);
        super.onDraw(canvas);
    }

    public final void setDotColor(int i) {
        this.LJLIL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119404mO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = -16777216;
        this.LJLILLLLZI = new Paint(1);
    }
}
