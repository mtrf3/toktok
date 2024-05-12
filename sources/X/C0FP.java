package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* renamed from: X.0FP, reason: invalid class name */
/* loaded from: classes.dex */
public class C0FP {
    public static final Matrix LJIILL = new Matrix();
    public final Path LIZ;
    public final Path LIZIZ;
    public final Matrix LIZJ;
    public Paint LIZLLL;
    public Paint LJ;
    public PathMeasure LJFF;
    public final C1EC LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public int LJIIJJI;
    public String LJIIL;
    public Boolean LJIILIIL;
    public final C1HQ<String, Object> LJIILJJIL;

    public C0FP() {
        this.LIZJ = new Matrix();
        this.LJII = 0.0f;
        this.LJIIIIZZ = 0.0f;
        this.LJIIIZ = 0.0f;
        this.LJIIJ = 0.0f;
        this.LJIIJJI = 255;
        this.LJIIL = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = new C1HQ<>();
        this.LJI = new C1EC();
        this.LIZ = new Path();
        this.LIZIZ = new Path();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.LJIIJJI;
    }

    public C0FP(C0FP c0fp) {
        this.LIZJ = new Matrix();
        this.LJII = 0.0f;
        this.LJIIIIZZ = 0.0f;
        this.LJIIIZ = 0.0f;
        this.LJIIJ = 0.0f;
        this.LJIIJJI = 255;
        this.LJIIL = null;
        this.LJIILIIL = null;
        C1HQ<String, Object> c1hq = new C1HQ<>();
        this.LJIILJJIL = c1hq;
        this.LJI = new C1EC(c0fp.LJI, c1hq);
        this.LIZ = new Path(c0fp.LIZ);
        this.LIZIZ = new Path(c0fp.LIZIZ);
        this.LJII = c0fp.LJII;
        this.LJIIIIZZ = c0fp.LJIIIIZZ;
        this.LJIIIZ = c0fp.LJIIIZ;
        this.LJIIJ = c0fp.LJIIJ;
        this.LJIIJJI = c0fp.LJIIJJI;
        this.LJIIL = c0fp.LJIIL;
        String str = c0fp.LJIIL;
        if (str != null) {
            c1hq.put(str, this);
        }
        this.LJIILIIL = c0fp.LJIILIIL;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.LJIIJJI = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public final void LIZ(C1EC c1ec, Matrix matrix, Canvas canvas, int i, int i2) {
        boolean z;
        Path.FillType fillType;
        Path.FillType fillType2;
        c1ec.LIZ.set(matrix);
        c1ec.LIZ.preConcat(c1ec.LJIIIZ);
        canvas.save();
        ?? r4 = 0;
        int i3 = 0;
        while (i3 < c1ec.LIZIZ.size()) {
            C0FO c0fo = (C0FO) ListProtector.get(c1ec.LIZIZ, i3);
            if (c0fo instanceof C1EC) {
                LIZ((C1EC) c0fo, c1ec.LIZ, canvas, i, i2);
            } else if (c0fo instanceof C1ED) {
                C1ED c1ed = (C1ED) c0fo;
                float f = i / this.LJIIIZ;
                float f2 = i2 / this.LJIIJ;
                float min = Math.min(f, f2);
                Matrix matrix2 = c1ec.LIZ;
                this.LIZJ.set(matrix2);
                this.LIZJ.postScale(f, f2);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[r4], fArr[1]);
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f3 = (fArr[r4] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                if (max > 0.0f) {
                    float abs = Math.abs(f3) / max;
                    if (abs != 0.0f) {
                        Path path = this.LIZ;
                        c1ed.getClass();
                        path.reset();
                        C07350Qp[] c07350QpArr = c1ed.LIZ;
                        if (c07350QpArr != null) {
                            C07350Qp.LIZIZ(c07350QpArr, path);
                        }
                        Path path2 = this.LIZ;
                        this.LIZIZ.reset();
                        if (c1ed instanceof C40661ig) {
                            Path path3 = this.LIZIZ;
                            if (c1ed.LIZJ == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path3.setFillType(fillType2);
                            this.LIZIZ.addPath(path2, this.LIZJ);
                            canvas.clipPath(this.LIZIZ);
                        } else {
                            C40671ih c40671ih = (C40671ih) c1ed;
                            float f4 = c40671ih.LJIIIZ;
                            if (f4 != 0.0f || c40671ih.LJIIJ != 1.0f) {
                                float f5 = c40671ih.LJIIJJI;
                                float f6 = (f4 + f5) % 1.0f;
                                float f7 = (c40671ih.LJIIJ + f5) % 1.0f;
                                if (this.LJFF == null) {
                                    this.LJFF = new PathMeasure();
                                }
                                this.LJFF.setPath(this.LIZ, r4);
                                float length = this.LJFF.getLength();
                                float f8 = f6 * length;
                                float f9 = f7 * length;
                                path2.reset();
                                if (f8 > f9) {
                                    this.LJFF.getSegment(f8, length, path2, true);
                                    this.LJFF.getSegment(0.0f, f9, path2, true);
                                } else {
                                    this.LJFF.getSegment(f8, f9, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            this.LIZIZ.addPath(path2, this.LIZJ);
                            C0OQ c0oq = c40671ih.LJI;
                            if (c0oq.LIZ != null || c0oq.LIZJ != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (this.LJ == null) {
                                    Paint paint = new Paint(1);
                                    this.LJ = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.LJ;
                                Shader shader = c0oq.LIZ;
                                if (shader != null) {
                                    shader.setLocalMatrix(this.LIZJ);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(c40671ih.LJIIIIZZ * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    paint2.setColor((c0oq.LIZJ & 16777215) | (((int) (Color.alpha(r2) * c40671ih.LJIIIIZZ)) << 24));
                                }
                                paint2.setColorFilter(null);
                                Path path4 = this.LIZIZ;
                                if (c40671ih.LIZJ == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path4.setFillType(fillType);
                                canvas.drawPath(this.LIZIZ, paint2);
                            }
                            C0OQ c0oq2 = c40671ih.LJ;
                            if (c0oq2.LIZ != null || c0oq2.LIZJ != 0) {
                                if (this.LIZLLL == null) {
                                    Paint paint3 = new Paint(1);
                                    this.LIZLLL = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.LIZLLL;
                                Paint.Join join = c40671ih.LJIILIIL;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c40671ih.LJIIL;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c40671ih.LJIILJJIL);
                                Shader shader2 = c0oq2.LIZ;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(this.LIZJ);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(c40671ih.LJII * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    paint4.setColor((c0oq2.LIZJ & 16777215) | (((int) (Color.alpha(r2) * c40671ih.LJII)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c40671ih.LJFF * abs * min);
                                canvas.drawPath(this.LIZIZ, paint4);
                            }
                        }
                    }
                }
            }
            i3++;
            r4 = 0;
        }
        canvas.restore();
    }
}
