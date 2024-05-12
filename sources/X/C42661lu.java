package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.1lu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42661lu extends C1K4 {
    public C06920Oy LJLJI;
    public final Paint LJLJJI;

    public C42661lu(Context context) {
        super(context);
        this.LJLJJI = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        super.dispatchDraw(canvas);
        if (this.LJLJI != null) {
            boolean z2 = false;
            if (getContext().getResources().getConfiguration().orientation == 1) {
                z = true;
            } else {
                z = false;
            }
            if (C16310kV.LIZLLL(this) == 1) {
                z2 = true;
            }
            if (z) {
                if (this.LJLJI.LIZLLL > 0) {
                    canvas.drawRect(0.0f, getHeight() - this.LJLJI.LIZLLL, getWidth(), getHeight(), this.LJLJJI);
                }
            } else {
                if (z2) {
                    int i = this.LJLJI.LIZ;
                    if (i <= 0) {
                        return;
                    }
                    canvas.drawRect(0.0f, 0.0f, i, getHeight(), this.LJLJJI);
                    return;
                }
                if (this.LJLJI.LIZJ <= 0) {
                    return;
                }
                canvas.drawRect(getWidth() - this.LJLJI.LIZJ, 0.0f, getWidth(), getHeight(), this.LJLJJI);
            }
        }
    }

    public void setColor(int i) {
        this.LJLJJI.setColor(i);
        invalidate();
    }

    public void setNavigationInsets(C06920Oy c06920Oy) {
        this.LJLJI = c06920Oy;
        invalidate();
    }
}
