package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Si6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72826Si6 extends Drawable {
    public final String LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final Paint LJI;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LJI.setColor(this.LIZIZ);
        this.LJI.setTextSize(this.LIZJ);
        this.LJI.setAntiAlias(true);
        float f = getBounds().right;
        float f2 = getBounds().bottom;
        float measureText = this.LJI.measureText(this.LIZ);
        canvas.drawColor(0);
        int i = this.LJFF;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            float f4 = (-measureText) / 2;
            int i3 = this.LJ;
            for (int i4 = 0; i4 < i3; i4++) {
                canvas.save();
                canvas.translate(f4, f3);
                canvas.rotate(this.LIZLLL);
                canvas.drawText(this.LIZ, 0.0f, 0.0f, this.LJI);
                canvas.restore();
                f4 += f / (this.LJ - 1);
            }
            f3 += f2 / this.LJFF;
        }
        canvas.save();
        canvas.restore();
    }

    public C72826Si6(C72827Si7 c72827Si7, Context context) {
        String string;
        int i;
        float LIZJ;
        float f;
        int i2;
        int i3;
        o.LJIIIZ(context, "context");
        if (c72827Si7 == null || (string = c72827Si7.LJLIL) == null) {
            string = context.getString(R.string.bhf);
            o.LJIIIIZZ(string, "context.getString(DEFAULT_TEXT_ID)");
        }
        this.LIZ = string;
        if (c72827Si7 != null) {
            i = c72827Si7.LJLILLLLZI;
        } else {
            i = 520093695;
        }
        this.LIZIZ = i;
        if (c72827Si7 != null) {
            LIZJ = c72827Si7.LJLJI;
        } else {
            LIZJ = KL2.LIZJ(context, 18.0f);
        }
        this.LIZJ = LIZJ;
        if (c72827Si7 != null) {
            f = c72827Si7.LJLJJI;
        } else {
            f = -15.0f;
        }
        this.LIZLLL = f;
        if (c72827Si7 != null) {
            i2 = c72827Si7.LJLJJL;
        } else {
            i2 = 3;
        }
        this.LJ = i2;
        if (c72827Si7 != null) {
            i3 = c72827Si7.LJLJJLL;
        } else {
            i3 = 10;
        }
        this.LJFF = i3;
        this.LJI = new Paint();
    }
}
