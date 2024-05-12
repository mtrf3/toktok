package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes15.dex */
public final class VUR extends LinearLayout {
    public final /* synthetic */ VUU LJLIL;

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        VOV vov = this.LJLIL.LLIILZL;
        if (vov != null) {
            vov.beforeDispatchDraw(canvas);
        }
        super.dispatchDraw(canvas);
        VOV vov2 = this.LJLIL.LLIILZL;
        if (vov2 != null) {
            vov2.afterDispatchDraw(canvas);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VUR(VUU vuu, Context context) {
        super(context);
        this.LJLIL = vuu;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        VUU vuu = this.LJLIL;
        setMeasuredDimension(vuu.LLIIIZ, vuu.LLIIJI);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        VOV vov = this.LJLIL.LLIILZL;
        if (vov != null) {
            vov.beforeDrawChild(canvas, view, j);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        VOV vov2 = this.LJLIL.LLIILZL;
        if (vov2 != null) {
            vov2.afterDrawChild(canvas, view, j);
        }
        return drawChild;
    }
}
