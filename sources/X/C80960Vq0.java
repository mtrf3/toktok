package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Vq0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80960Vq0 implements InterfaceC80963Vq3 {
    public Canvas LIZJ;
    public Canvas LIZLLL;
    public Bitmap LJ;
    public Bitmap LJFF;
    public int LJII;
    public final Paint LIZ = new Paint(1);
    public final Paint LIZIZ = new Paint(1);
    public C80962Vq2 LJI = new C80962Vq2();

    @Override // X.InterfaceC80963Vq3
    public final void LIZ(float f, Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        Bitmap bitmap = this.LJFF;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        float[] fArr = new float[4];
        int i = this.LJI.LJI;
        if (i != 0) {
            if (i == 1) {
                float f2 = this.LJII;
                float f3 = f2 * f;
                fArr[0] = f3;
                fArr[1] = 0.0f;
                fArr[2] = f3 + f2;
                fArr[3] = 0.0f;
            }
        } else {
            float f4 = this.LJII;
            float f5 = f4 * f;
            fArr[0] = f5;
            fArr[1] = 0.0f;
            fArr[2] = f5 + f4;
            fArr[3] = 0.0f;
        }
        Paint paint = this.LIZ;
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        C80962Vq2 c80962Vq2 = this.LJI;
        int i2 = c80962Vq2.LIZLLL;
        paint.setShader(new LinearGradient(f6, f7, f8, f9, new int[]{i2, c80962Vq2.LJ, i2}, new float[]{0.0f, 0.4f, 0.7f}, Shader.TileMode.CLAMP));
        Bitmap bitmap2 = this.LJ;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.LIZ);
        }
    }

    @Override // X.InterfaceC80963Vq3
    public final void LIZIZ(C80962Vq2 skeletonGlobalConfig, List<C80964Vq4> elements, int i, int i2) {
        o.LJIIIZ(skeletonGlobalConfig, "skeletonGlobalConfig");
        o.LJIIIZ(elements, "elements");
        this.LJI = skeletonGlobalConfig;
        this.LJII = i;
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZ.setStyle(Paint.Style.FILL);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.LIZLLL = new Canvas(createBitmap);
        this.LJFF = createBitmap;
        Bitmap createBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        this.LIZJ = new Canvas(createBitmap2);
        this.LJ = createBitmap2;
        Iterator it = ((ArrayList) elements).iterator();
        while (it.hasNext()) {
            C80964Vq4 c80964Vq4 = (C80964Vq4) it.next();
            RectF rectF = new RectF(c80964Vq4.LJIIIZ, c80964Vq4.LJIIJ, c80964Vq4.LJIIJJI, c80964Vq4.LJIIL);
            this.LIZIZ.setColor(c80964Vq4.LIZLLL);
            Canvas canvas = this.LIZLLL;
            if (canvas != null) {
                canvas.drawRoundRect(rectF, c80964Vq4.LIZIZ, c80964Vq4.LIZJ, this.LIZIZ);
            }
            Canvas canvas2 = this.LIZJ;
            if (canvas2 != null) {
                canvas2.drawRoundRect(rectF, c80964Vq4.LIZIZ, c80964Vq4.LIZJ, this.LIZIZ);
            }
        }
    }
}
