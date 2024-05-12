package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6cH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164096cH extends W5G {
    public final Paint LJLIL;
    public float LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;

    public final void LIZ(float f) {
        LIZIZ(this, f);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LJLJI && canvas != null) {
            float f = this.LJLILLLLZI;
            Integer valueOf = Integer.valueOf(canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31));
            this.LJLIL.setAntiAlias(true);
            this.LJLIL.setColor(this.LJLJJI);
            RectF rectF = new RectF(0.0f, 0.0f, f, f);
            RectF rectF2 = new RectF(0.0f, getHeight() - f, f, getHeight());
            RectF rectF3 = new RectF(getWidth() - f, 0.0f, getWidth(), f);
            RectF rectF4 = new RectF(getWidth() - f, getHeight() - f, getWidth(), getHeight());
            canvas.drawRect(rectF, this.LJLIL);
            canvas.drawRect(rectF2, this.LJLIL);
            canvas.drawRect(rectF3, this.LJLIL);
            canvas.drawRect(rectF4, this.LJLIL);
            this.LJLIL.setColor(0);
            this.LJLIL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawCircle(f, f, f, this.LJLIL);
            canvas.drawCircle(f, getHeight() - f, f, this.LJLIL);
            canvas.drawCircle(getWidth() - f, f, f, this.LJLIL);
            canvas.drawCircle(getWidth() - f, getHeight() - f, f, this.LJLIL);
            this.LJLIL.setXfermode(null);
            if (valueOf != null) {
                valueOf.intValue();
                canvas.restoreToCount(valueOf.intValue());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C164096cH(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public static void LIZIZ(C164096cH c164096cH, float f) {
        c164096cH.LJLJI = true;
        c164096cH.LJLILLLLZI = f;
        c164096cH.LJLJJI = -1;
        c164096cH.setLayerType(1, null);
        c164096cH.invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C164096cH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = new Paint();
        this.LJLJJI = -1;
    }
}
