package X;

import Y.AUListenerS40S0110000_14;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.Vpx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC80957Vpx extends FrameLayout {
    public final RectF LJLIL;
    public final Path LJLILLLLZI;
    public final RectF LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public Rect LJLJL;
    public Rect LJLJLJ;
    public float LJLJLLL;
    public final Rect LJLL;
    public final C80497ViX LJLLI;
    public final C80497ViX LJLLILLLL;

    public AbstractC80957Vpx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = new RectF();
        this.LJLILLLLZI = new Path();
        this.LJLJI = new RectF();
        this.LJLJJI = false;
        this.LJLJJL = false;
        this.LJLJJLL = false;
        this.LJLL = new Rect();
        this.LJLLI = new C80497ViX(new Rect());
        this.LJLLILLLL = new C80497ViX(new Rect());
    }

    public AbstractC80957Vpx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLIL = new RectF();
        this.LJLILLLLZI = new Path();
        this.LJLJI = new RectF();
        this.LJLJJI = false;
        this.LJLJJL = false;
        this.LJLJJLL = false;
        this.LJLL = new Rect();
        this.LJLLI = new C80497ViX(new Rect());
        this.LJLLILLLL = new C80497ViX(new Rect());
    }

    public boolean LIZJ(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean LIZJ;
        if (this.LJLJJLL) {
            canvas.save();
            canvas.clipRect(this.LJLJI);
            if (this.LJLJJL) {
                canvas.save();
                canvas.clipPath(this.LJLILLLLZI);
                LIZJ = LIZJ(canvas, view, j);
                canvas.restore();
            } else if (this.LJLJJI) {
                canvas.save();
                canvas.clipRect(this.LJLIL);
                LIZJ = LIZJ(canvas, view, j);
                canvas.restore();
            } else {
                LIZJ = LIZJ(canvas, view, j);
            }
            canvas.restore();
            return LIZJ;
        }
        if (this.LJLJJL) {
            canvas.save();
            canvas.clipPath(this.LJLILLLLZI);
            boolean LIZJ2 = LIZJ(canvas, view, j);
            canvas.restore();
            return LIZJ2;
        }
        if (this.LJLJJI) {
            canvas.save();
            canvas.clipRect(this.LJLIL);
            boolean LIZJ3 = LIZJ(canvas, view, j);
            canvas.restore();
            return LIZJ3;
        }
        return LIZJ(canvas, view, j);
    }

    public final Animator LIZLLL(Rect rect, Rect rect2, float f, boolean z) {
        this.LJLJL = new Rect(rect);
        this.LJLJLJ = new Rect(rect2);
        this.LJLJLLL = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new AUListenerS40S0110000_14(this, z, 1));
        return ofFloat;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLL.set(0, 0, getWidth(), getHeight());
    }
}
