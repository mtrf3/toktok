package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.5Ay, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130685Ay extends C54Y {
    public final Paint LJLL;
    public final Paint LJLLI;
    public final float LJLLILLLL;
    public final float LJLLJ;
    public final RectF LJLLL;
    public final RectF LJLLLL;
    public float LJLLLLLL;
    public int LJLZ;
    public float LJZ;
    public float LJZI;

    public final float getAnchorViewLeft() {
        return this.LJZ;
    }

    public final float getAnchorViewWidth() {
        return this.LJZI;
    }

    public final float getMarginScrollLeft() {
        return this.LJLLLLLL;
    }

    public final int getOutScrollX() {
        return this.LJLZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C130685Ay(Context context) {
        super(context, null, 0);
        Integer LJI;
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        this.LJLL = paint;
        Paint paint2 = new Paint();
        this.LJLLI = paint2;
        this.LJLLILLLL = C134845Qy.LIZ(6.0f);
        this.LJLLJ = C134845Qy.LIZ(4.0f);
        this.LJLLL = new RectF();
        this.LJLLLL = new RectF();
        this.LJLLLLLL = C134845Qy.LIZ(42.0f);
        setLayerType(1, null);
        paint2.setAntiAlias(true);
        paint2.setColor(0);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setAntiAlias(true);
        Integer valueOf = Integer.valueOf(R.attr.d7);
        if (valueOf == null || (LJI = C79045V0n.LJI(valueOf.intValue(), context)) == null) {
            return;
        }
        paint.setColor(LJI.intValue());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        this.LJLLL.set(0.0f, 0.0f, getWidth(), getHeight());
        RectF rectF = this.LJLLL;
        float f = this.LJLLILLLL;
        canvas.drawRoundRect(rectF, f, f, this.LJLL);
        float f2 = (this.LJLZ + this.LJZ) - this.LJLLLLLL;
        this.LJLLLL.set(f2, 0.0f, this.LJZI + f2, getHeight());
        RectF rectF2 = this.LJLLLL;
        float f3 = this.LJLLJ;
        canvas.drawRoundRect(rectF2, f3, f3, this.LJLLI);
    }

    public final void setAnchorViewLeft(float f) {
        this.LJZ = f;
    }

    public final void setAnchorViewWidth(float f) {
        this.LJZI = f;
    }

    public final void setMarginScrollLeft(float f) {
        this.LJLLLLLL = f;
    }

    public final void setOutScrollX(int i) {
        this.LJLZ = i;
    }
}
