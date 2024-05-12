package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;

/* renamed from: X.65j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1547165j extends View {
    public final Paint LJLIL;
    public final Paint LJLILLLLZI;
    public final boolean LJLJI;
    public boolean LJLJJI;
    public final float LJLJJL;
    public final C62822Ol8 LJLJJLL;

    private final float getRadius() {
        return ((Number) this.LJLJJLL.getValue()).floatValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        if (this.LJLJI) {
            float f = 2;
            float f2 = this.LJLJJL / f;
            canvas.drawRoundRect(new RectF(f2, f2, getWidth() - (this.LJLJJL / f), getHeight() - (this.LJLJJL / f)), getRadius(), getRadius(), this.LJLILLLLZI);
            return;
        }
        if (this.LJLJJI) {
            float width = (getWidth() + getHeight()) / 44.0f;
            this.LJLIL.setPathEffect(new DashPathEffect(new float[]{width, width}, 0.0f));
            this.LJLJJI = false;
        }
        float f3 = 2;
        float f4 = this.LJLJJL / f3;
        canvas.drawRoundRect(new RectF(f4, f4, getWidth() - (this.LJLJJL / f3), getHeight() - (this.LJLJJL / f3)), getRadius(), getRadius(), this.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1547165j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        this.LJLIL = paint;
        Paint paint2 = new Paint();
        this.LJLILLLLZI = paint2;
        this.LJLJI = true;
        this.LJLJJI = true;
        float LIZ = C170576mj.LIZ(context, 2.0f);
        this.LJLJJL = LIZ;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(context, 116));
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(LIZ);
        paint.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(LIZ);
        paint2.setColor(-16777216);
    }
}
