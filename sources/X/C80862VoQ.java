package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.VoQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80862VoQ extends Drawable {
    public final C80863VoR LIZ;
    public final float[] LIZIZ;
    public final Path LIZJ;
    public final Paint LIZLLL;
    public double LJ;
    public double LJFF;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final Shader LIZ() {
        C80863VoR c80863VoR;
        boolean z;
        int LIZ;
        float f;
        boolean z2;
        boolean z3;
        int LIZ2;
        int LIZ3;
        char c;
        float f2;
        float f3;
        boolean z4;
        int LIZ4;
        float f4;
        if (getBounds().bottom > 0 && this.LJ > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && (c80863VoR = this.LIZ) != null) {
            float f5 = getBounds().bottom;
            double d = this.LJFF;
            if (d < c80863VoR.LIZ()) {
                double d2 = f5;
                double d3 = d + d2;
                if (d3 < c80863VoR.LIZ()) {
                    if (d < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    double LIZ5 = d / c80863VoR.LIZ();
                    double LIZ6 = d3 / c80863VoR.LIZ();
                    int[] iArr = c80863VoR.LJII;
                    if (z4) {
                        LIZ4 = c80863VoR.LIZ;
                    } else {
                        LIZ4 = c80863VoR.LJFF.LIZ(LIZ5);
                    }
                    iArr[0] = LIZ4;
                    c80863VoR.LJII[1] = c80863VoR.LJFF.LIZ(LIZ6);
                    float[] fArr = c80863VoR.LJIIIIZZ;
                    if (z4) {
                        f4 = (float) (Math.abs(d) / d2);
                    } else {
                        f4 = 0.0f;
                    }
                    fArr[0] = f4;
                    c80863VoR.LJIIIIZZ[1] = 1.0f;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f5, c80863VoR.LJII, c80863VoR.LJIIIIZZ, Shader.TileMode.REPEAT);
                    c80863VoR.LIZIZ(c80863VoR.LJII[1]);
                    return linearGradient;
                }
                if (d < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (d3 > c80863VoR.LIZLLL) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                float LIZ7 = (float) ((c80863VoR.LIZ() - d) / d2);
                int[] iArr2 = c80863VoR.LJIIIZ;
                if (z2) {
                    LIZ2 = c80863VoR.LIZ;
                } else {
                    LIZ2 = c80863VoR.LJFF.LIZ(d / c80863VoR.LIZ());
                }
                iArr2[0] = LIZ2;
                int[] iArr3 = c80863VoR.LJIIIZ;
                iArr3[1] = c80863VoR.LIZIZ;
                if (z3) {
                    LIZ3 = c80863VoR.LIZJ;
                } else {
                    LIZ3 = c80863VoR.LJI.LIZ(((d - c80863VoR.LIZ()) + d2) / (c80863VoR.LIZLLL - c80863VoR.LIZ()));
                }
                iArr3[2] = LIZ3;
                float[] fArr2 = c80863VoR.LJIIJ;
                if (z2) {
                    f2 = (float) (Math.abs(d) / d2);
                    c = 0;
                } else {
                    c = 0;
                    f2 = 0.0f;
                }
                fArr2[c] = f2;
                float[] fArr3 = c80863VoR.LJIIJ;
                fArr3[1] = LIZ7;
                if (z3) {
                    f3 = (float) ((c80863VoR.LIZLLL - d) / d2);
                } else {
                    f3 = 1.0f;
                }
                fArr3[2] = f3;
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, f5, c80863VoR.LJIIIZ, c80863VoR.LJIIJ, Shader.TileMode.CLAMP);
                c80863VoR.LIZIZ(c80863VoR.LJIIIZ[2]);
                return linearGradient2;
            }
            double d4 = f5;
            if (d + d4 > c80863VoR.LIZLLL) {
                z = true;
            } else {
                z = false;
            }
            double LIZ8 = (d - c80863VoR.LIZ()) / (c80863VoR.LIZLLL - c80863VoR.LIZ());
            double LIZ9 = ((d - c80863VoR.LIZ()) + d4) / (c80863VoR.LIZLLL - c80863VoR.LIZ());
            c80863VoR.LJII[0] = c80863VoR.LJI.LIZ(LIZ8);
            int[] iArr4 = c80863VoR.LJII;
            if (z) {
                LIZ = c80863VoR.LIZJ;
            } else {
                LIZ = c80863VoR.LJI.LIZ(LIZ9);
            }
            iArr4[1] = LIZ;
            float[] fArr4 = c80863VoR.LJIIIIZZ;
            fArr4[0] = 0.0f;
            if (z) {
                f = (float) ((c80863VoR.LIZLLL - d) / d4);
            } else {
                f = 1.0f;
            }
            fArr4[1] = f;
            LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, 0.0f, f5, c80863VoR.LJII, c80863VoR.LJIIIIZZ, Shader.TileMode.CLAMP);
            c80863VoR.LIZIZ(c80863VoR.LJII[1]);
            return linearGradient3;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        canvas.drawPath(this.LIZJ, this.LIZLLL);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        o.LJIIIZ(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.LIZJ.reset();
        this.LIZJ.addRoundRect(new RectF(bounds), this.LIZIZ, Path.Direction.CW);
        this.LIZLLL.setShader(LIZ());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZLLL.setAlpha(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C80862VoQ(android.content.Context r8, X.C4AH r9, androidx.appcompat.widget.AppCompatImageView r10) {
        /*
            r7 = this;
            r7.<init>()
            X.5H3 r0 = X.C80973VqD.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r8)
            if (r0 == 0) goto La4
            int r1 = r0.intValue()
            X.5H3 r0 = X.C80973VqD.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r8)
            if (r0 == 0) goto La4
            int r6 = r0.intValue()
            X.5H3 r0 = X.C80973VqD.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r8)
            if (r0 == 0) goto La4
            int r5 = r0.intValue()
            X.VoR r3 = new X.VoR
            X.VoS r2 = new X.VoS
            r2.<init>(r1, r6)
            r0 = 4588807732320345784(0x3faeb851eb851eb8, double:0.06)
            int r4 = r2.LIZ(r0)
            X.VoS r2 = new X.VoS
            r2.<init>(r6, r5)
            r0 = 4605741266919258849(0x3feae147ae147ae1, double:0.84)
            int r0 = r2.LIZ(r0)
            r3.<init>(r4, r6, r0)
        L66:
            r7.LIZ = r3
            r0 = 8
            float[] r4 = new float[r0]
            float r1 = r9.LJLIL
            r0 = 0
            r4[r0] = r1
            r2 = 1
            r4[r2] = r1
            float r1 = r9.LJLILLLLZI
            r0 = 2
            r4[r0] = r1
            r0 = 3
            r4[r0] = r1
            float r1 = r9.LJLJI
            r0 = 4
            r4[r0] = r1
            r0 = 5
            r4[r0] = r1
            float r1 = r9.LJLJJI
            r0 = 6
            r4[r0] = r1
            r0 = 7
            r4[r0] = r1
            r7.LIZIZ = r4
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r7.LIZJ = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r2)
            r0.setDither(r2)
            r7.LIZLLL = r0
            if (r3 == 0) goto La3
            r3.LJ = r10
        La3:
            return
        La4:
            r3 = 0
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80862VoQ.<init>(android.content.Context, X.4AH, androidx.appcompat.widget.AppCompatImageView):void");
    }
}
