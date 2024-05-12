package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5fV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140615fV extends FrameLayout {
    public Bitmap LJLIL;
    public Bitmap LJLILLLLZI;
    public final Paint LJLJI;

    public final void LIZ(Bitmap bitmap) {
        float width = bitmap.getWidth() / (bitmap.getHeight() / getHeight());
        if (this.LJLILLLLZI == null) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) width, getHeight(), true);
            if (C90193gN.LIZ()) {
                int width2 = createScaledBitmap.getWidth();
                int height = createScaledBitmap.getHeight();
                Matrix matrix = new Matrix();
                matrix.postScale(-1.0f, 1.0f);
                createScaledBitmap = Bitmap.createBitmap(createScaledBitmap, 0, 0, width2, height, matrix, true);
            }
            this.LJLILLLLZI = createScaledBitmap;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            Bitmap bitmap = this.LJLIL;
            if (bitmap != null) {
                this.LJLJI.setColor(bitmap.getPixel(bitmap.getWidth() - 1, bitmap.getHeight() - 1));
                LIZ(bitmap);
            }
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (C26338AVi.LIZJ(context)) {
                if (canvas != null) {
                    Bitmap bitmap2 = this.LJLILLLLZI;
                    o.LJI(bitmap2);
                    int width = getWidth();
                    o.LJI(this.LJLILLLLZI);
                    canvas.drawBitmap(bitmap2, width - r0.getWidth(), 0.0f, this.LJLJI);
                    canvas.drawRect(0.0f, 0.0f, getWidth() - 100.0f, getHeight(), this.LJLJI);
                }
            } else if (canvas != null) {
                Bitmap bitmap3 = this.LJLILLLLZI;
                o.LJI(bitmap3);
                canvas.drawBitmap(bitmap3, 0.0f, 0.0f, this.LJLJI);
                canvas.drawRect(100.0f, 0.0f, getWidth(), getHeight(), this.LJLJI);
            }
        } catch (Exception unused) {
        }
        super.onDraw(canvas);
    }

    public final void setFlashSaleBg(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        this.LJLIL = bitmap;
        if (this.LJLILLLLZI == null && getWidth() > 0 && getHeight() > 0) {
            LIZ(bitmap);
        }
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C140615fV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJI = new Paint();
        setWillNotDraw(false);
    }
}
