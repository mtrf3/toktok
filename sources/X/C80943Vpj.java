package X;

import Y.IDDListenerS395S0100000_14;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Vpj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80943Vpj extends ViewGroup {
    public static final /* synthetic */ int LJLJJL = 0;
    public final View LJLIL;
    public int LJLILLLLZI;
    public Matrix LJLJI;
    public final IDDListenerS395S0100000_14 LJLJJI;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LJLIL.getViewTreeObserver().removeOnPreDrawListener(this.LJLJJI);
        C80951Vpr.LIZ.LJII(0, this.LJLIL);
        this.LJLIL.setTag(R.id.drz, null);
        if (this.LJLIL.getParent() != null) {
            ((View) this.LJLIL.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLIL.setTag(R.id.drz, this);
        this.LJLIL.getViewTreeObserver().addOnPreDrawListener(this.LJLJJI);
        C80951Vpr.LIZ.LJII(4, this.LJLIL);
        if (this.LJLIL.getParent() != null) {
            ((View) this.LJLIL.getParent()).invalidate();
        }
    }

    public C80943Vpj(View view) {
        super(view.getContext());
        this.LJLJJI = new IDDListenerS395S0100000_14(this, 0);
        this.LJLIL = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C36521EUz.LIZ(canvas, true);
        canvas.setMatrix(this.LJLJI);
        View view = this.LJLIL;
        C80948Vpo c80948Vpo = C80951Vpr.LIZ;
        c80948Vpo.LJII(0, view);
        this.LJLIL.invalidate();
        c80948Vpo.LJII(4, this.LJLIL);
        drawChild(canvas, this.LJLIL, getDrawingTime());
        C36521EUz.LIZ(canvas, false);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        int i2;
        super.setVisibility(i);
        if (this.LJLIL.getTag(R.id.drz) == this) {
            if (i == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            C80951Vpr.LIZ.LJII(i2, this.LJLIL);
        }
    }

    public static void LIZ(View view, View view2) {
        C80951Vpr.LIZ.LJI(view2, view2.getLeft(), view2.getTop(), view.getWidth() + view2.getLeft(), view.getHeight() + view2.getTop());
    }
}
