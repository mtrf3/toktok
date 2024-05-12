package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.a1;

/* loaded from: classes8.dex */
public final class HX7 extends FrameLayout {
    public Runnable LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLIL = null;
    }

    public final long getFirstDrawnTimeMS() {
        return this.LJLJI;
    }

    public final long getFirstMeasureStartTimeMS() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.LJLJI <= 0) {
            this.LJLJI = System.currentTimeMillis();
        }
        Runnable runnable = this.LJLIL;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void setOnDrawnListener(Runnable runnable) {
        this.LJLIL = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HX7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = -1L;
        this.LJLJI = -1L;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LJLILLLLZI <= 0) {
            this.LJLILLLLZI = System.currentTimeMillis();
        }
        super.onMeasure(i, i2);
    }
}
