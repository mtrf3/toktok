package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes15.dex */
public final class VUM extends LinearLayout {
    public final /* synthetic */ VUG LJLIL;

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LJLIL.LLIIIJ || super.canScrollHorizontally(i)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        VOV vov = this.LJLIL.LL;
        if (vov != null) {
            vov.beforeDispatchDraw(canvas);
        }
        super.dispatchDraw(canvas);
        VOV vov2 = this.LJLIL.LL;
        if (vov2 != null) {
            vov2.afterDispatchDraw(canvas);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VUM(VUG vug, Context context) {
        super(context);
        this.LJLIL = vug;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        VUG vug = this.LJLIL;
        setMeasuredDimension(vug.LJZ, vug.LJZI);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild;
        Rect beforeDrawChild;
        VOV vov = this.LJLIL.LL;
        if (vov != null && (beforeDrawChild = vov.beforeDrawChild(canvas, view, j)) != null) {
            canvas.save();
            canvas.clipRect(beforeDrawChild);
            drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
        } else {
            drawChild = super.drawChild(canvas, view, j);
        }
        VOV vov2 = this.LJLIL.LL;
        if (vov2 != null) {
            vov2.afterDrawChild(canvas, view, j);
        }
        return drawChild;
    }
}
