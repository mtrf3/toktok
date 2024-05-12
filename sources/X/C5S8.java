package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;

/* renamed from: X.5S8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5S8 extends View {
    public final C62822Ol8 LJLIL;
    public final RectF LJLILLLLZI;

    private final Paint getPaint() {
        return (Paint) this.LJLIL.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            boolean z = true;
            if (C16310kV.LIZLLL(this) != 1) {
                z = false;
            }
            if (z) {
                this.LJLILLLLZI.set(-getWidth(), 0.0f, getWidth(), getHeight());
                canvas.drawArc(this.LJLILLLLZI, -90.0f, 180.0f, false, getPaint());
            } else {
                this.LJLILLLLZI.set(0.0f, 0.0f, 2 * getWidth(), getHeight());
                canvas.drawArc(this.LJLILLLLZI, -90.0f, -180.0f, false, getPaint());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5S8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1062));
        this.LJLILLLLZI = new RectF();
    }
}
