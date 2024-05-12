package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.a1;
import kotlin.jvm.internal.AqS155S0100000_5;

/* renamed from: X.CXv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31499CXv extends LinearLayout {
    public final C62822Ol8 LJLIL;
    public boolean LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;

    private final Paint getPaint() {
        return (Paint) this.LJLIL.getValue();
    }

    public final boolean getDrawMask() {
        return this.LJLILLLLZI;
    }

    public final float getMaskEdge() {
        return this.LJLJI;
    }

    public final float getMaskWidth() {
        return this.LJLJJI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        if (this.LJLILLLLZI && canvas != null) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.dispatchDraw(canvas);
            if (C15380j0.LJIIZILJ()) {
                f = this.LJLJI;
            } else {
                f = this.LJLJI - this.LJLJJI;
            }
            canvas.translate(f, 0.0f);
            canvas.drawPaint(getPaint());
            canvas.restoreToCount(saveLayer);
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void setDrawMask(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setMaskEdge(float f) {
        this.LJLJI = f - getLeft();
        invalidate();
    }

    public final void setMaskWidth(float f) {
        this.LJLJJI = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31499CXv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 457));
        this.LJLJI = Float.MAX_VALUE;
        setWillNotDraw(false);
    }
}
