package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5OA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5OA extends View {
    public final C5OB LJLIL;
    public C5OC LJLILLLLZI;
    public final Drawable LJLJI;
    public final Drawable LJLJJI;
    public final Rect LJLJJL;
    public final Rect LJLJJLL;
    public final RectF LJLJL;
    public final Paint LJLJLJ;

    public final int getRightHandlerX$tools_camera_edit_release() {
        return getRight() - this.LJLIL.LJLJJLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        int i = C5OD.LIZ[this.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Drawable drawable = this.LJLJI;
                    if (drawable != null) {
                        drawable.setBounds(this.LJLJJL);
                    }
                    Drawable drawable2 = this.LJLJI;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = this.LJLJJI;
                    if (drawable3 != null) {
                        drawable3.setBounds(this.LJLJJLL);
                    }
                    Drawable drawable4 = this.LJLJJI;
                    if (drawable4 != null) {
                        drawable4.draw(canvas);
                    }
                    canvas.drawRoundRect(this.LJLJL, 0.0f, 0.0f, this.LJLJLJ);
                }
            } else {
                RectF rectF = this.LJLJL;
                float f = this.LJLIL.LJLJJI;
                canvas.drawRoundRect(rectF, f, f, this.LJLJLJ);
            }
            super.onDraw(canvas);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5OA(C5OB config, Context context) {
        super(context, null, 0);
        o.LJIIIZ(config, "config");
        new LinkedHashMap();
        this.LJLIL = config;
        this.LJLILLLLZI = C5OC.NONE;
        this.LJLJI = C04270Et.LIZIZ(context, config.LJLIL);
        this.LJLJJI = C04270Et.LIZIZ(context, config.LJLILLLLZI);
        this.LJLJJL = new Rect();
        this.LJLJJLL = new Rect();
        this.LJLJL = new RectF();
        Paint paint = new Paint();
        paint.setColor(AnonymousClass636.LJIIIIZZ(config.LJLJI, context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(config.LJLJJL);
        this.LJLJLJ = paint;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.LJLJJL.set(0, 0, this.LJLIL.LJLJJLL, i6);
        this.LJLJJLL.set(i5 - this.LJLIL.LJLJJLL, 0, i5, i6);
        RectF rectF = this.LJLJL;
        C5OB c5ob = this.LJLIL;
        int i7 = c5ob.LJLJJLL;
        int i8 = c5ob.LJLJJL;
        C77275UUl.LJI(rectF, i7 - (i8 / 2), i8 / 2, (i8 / 2) + (i5 - i7), i6 - (i8 / 2));
        setElevation(C32151Nz.LJIIZILJ(3));
    }
}
