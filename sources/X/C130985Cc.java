package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.5Cc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130985Cc extends View {
    public float LJLIL;
    public final RectF LJLILLLLZI;
    public final Paint LJLJI;
    public int LJLJJI;
    public final int LJLJJL;
    public float LJLJJLL;

    public final int getBgColor() {
        return this.LJLJJI;
    }

    public final Paint getPaint() {
        return this.LJLJI;
    }

    public final float getProgress() {
        return this.LJLJJLL;
    }

    public final float getRadius() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LJLIL = getMeasuredHeight() / 2.0f;
        RectF rectF = this.LJLILLLLZI;
        rectF.left = 0.0f;
        rectF.right = getMeasuredWidth();
        RectF rectF2 = this.LJLILLLLZI;
        rectF2.top = 0.0f;
        rectF2.bottom = getMeasuredHeight();
        this.LJLJI.setColor(this.LJLJJI);
        if (canvas != null) {
            RectF rectF3 = this.LJLILLLLZI;
            float f = this.LJLIL;
            canvas.drawRoundRect(rectF3, f, f, this.LJLJI);
        }
        this.LJLJI.setColor(this.LJLJJL);
        this.LJLILLLLZI.right = getMeasuredWidth() * this.LJLJJLL;
        if (canvas != null) {
            RectF rectF4 = this.LJLILLLLZI;
            float f2 = this.LJLIL;
            canvas.drawRoundRect(rectF4, f2, f2, this.LJLJI);
        }
    }

    public final void setBgColor(int i) {
        this.LJLJJI = i;
    }

    public final void setProgress(float f) {
        this.LJLJJLL = f;
        invalidate();
    }

    public final void setRadius(float f) {
        this.LJLIL = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C130985Cc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C32151Nz.LJIIZILJ(2);
        this.LJLILLLLZI = new RectF();
        this.LJLJI = new Paint();
        Integer LJ = C79045V0n.LJ(R.attr.dg, context);
        if (LJ != null) {
            this.LJLJJI = LJ.intValue();
            Integer LJ2 = C79045V0n.LJ(R.attr.dn, context);
            if (LJ2 != null) {
                this.LJLJJL = LJ2.intValue();
                this.LJLJJLL = 0.5f;
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
