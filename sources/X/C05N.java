package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.05N, reason: invalid class name */
/* loaded from: classes.dex */
public class C05N extends ViewGroup {
    public boolean LJLIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.LJLIL) {
            return super.getChildCount();
        }
        return 0;
    }

    public C05N(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.e5a, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        int childCount = super.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            o.LJII(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((C283919n) childAt).LJLJLJ) {
                this.LJLIL = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.LJLIL = false;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void LIZ(InterfaceC11750d9 canvas, View view, long j) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(view, "view");
        super.drawChild(((C1QR) canvas).LIZ, view, j);
    }
}
