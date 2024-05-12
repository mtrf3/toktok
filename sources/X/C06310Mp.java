package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* renamed from: X.0Mp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06310Mp {
    public static final C06270Ml LIZ = new ThreadLocal<PathMeasure>() { // from class: X.0Ml
        @Override // java.lang.ThreadLocal
        public final PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    public static final C06280Mm LIZIZ = new ThreadLocal<Path>() { // from class: X.0Mm
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    };
    public static final C06290Mn LIZJ = new ThreadLocal<Path>() { // from class: X.0Mn
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    };
    public static final C06300Mo LIZLLL = new ThreadLocal<float[]>() { // from class: X.0Mo
        @Override // java.lang.ThreadLocal
        public final float[] initialValue() {
            return new float[4];
        }
    };
    public static final float LJ = (float) (Math.sqrt(2.0d) / 2.0d);
    public static final PathMeasure LJFF = new PathMeasure();
    public static final Path LJI = new Path();
    public static final Path LJII = new Path();
    public static final float[] LJIIIIZZ = new float[4];
    public static final float LJIIIZ = (float) Math.sqrt(2.0d);
    public static float LJIIJ = -1.0f;

    public static float LIZLLL() {
        if (LJIIJ == -1.0f) {
            LJIIJ = Resources.getSystem().getDisplayMetrics().density;
        }
        return LJIIJ;
    }

    public static void LIZJ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float LJ(Matrix matrix) {
        if (C03970Dp.LIZ) {
            float[] fArr = LIZLLL.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = LJ;
            fArr[2] = f;
            fArr[3] = f;
            matrix.mapPoints(fArr);
            return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
        }
        float[] fArr2 = LJIIIIZZ;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        float f2 = LJIIIZ;
        fArr2[2] = f2;
        fArr2[3] = f2;
        matrix.mapPoints(fArr2);
        return ((float) Math.hypot(fArr2[2] - fArr2[0], fArr2[3] - fArr2[1])) / 2.0f;
    }

    public static void LIZIZ(Path path, C34861Yk c34861Yk) {
        if (c34861Yk == null) {
            return;
        }
        if (C03970Dp.LIZ) {
            LIZ(path, c34861Yk.LIZJ.LJIIJJI() / 100.0f, c34861Yk.LIZLLL.LJIIJJI() / 100.0f, c34861Yk.LJ.LJIIJJI() / 360.0f);
            return;
        }
        LIZ(path, c34861Yk.LIZJ.LJI().floatValue() / 100.0f, c34861Yk.LIZLLL.LJI().floatValue() / 100.0f, c34861Yk.LJ.LJI().floatValue() / 360.0f);
    }

    public static void LIZ(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure;
        Path path2;
        Path path3;
        if (C03970Dp.LIZ) {
            pathMeasure = LIZ.get();
            path2 = LIZIZ.get();
            path3 = LIZJ.get();
        } else {
            pathMeasure = LJFF;
            path2 = LJI;
            path3 = LJII;
        }
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C0GR.LIZ();
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            C0GR.LIZ();
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float min = Math.min(f4, f5) + f6;
        float max = Math.max(f4, f5) + f6;
        if (min >= length && max >= length) {
            min = C06260Mk.LIZJ(min, length);
            max = C06260Mk.LIZJ(max, length);
        }
        if (min < 0.0f) {
            min = C06260Mk.LIZJ(min, length);
        }
        if (max < 0.0f) {
            max = C06260Mk.LIZJ(max, length);
        }
        if (min == max) {
            path.reset();
            C0GR.LIZ();
            return;
        }
        if (min >= max) {
            min -= length;
        }
        path2.reset();
        pathMeasure.getSegment(min, max, path2, true);
        if (max > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, max % length, path3, true);
            path2.addPath(path3);
        } else if (min < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(min + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        C0GR.LIZ();
    }

    public static Bitmap LJFF(Bitmap bitmap, int i, int i2, C04750Gp c04750Gp) {
        int i3;
        int i4;
        Bitmap createScaledBitmap;
        if (bitmap == null || i <= 0 || i2 <= 0) {
            return bitmap;
        }
        if (C03970Dp.LJFF) {
            if (C04010Dt.LIZJ) {
                int i5 = c04750Gp.LIZ;
                int i6 = c04750Gp.LIZIZ;
                if (i5 >= 32 && i6 >= 32) {
                    i3 = i / 2;
                    i4 = i2 / 2;
                    if (bitmap.getWidth() <= i3 || bitmap.getHeight() > i4) {
                        createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i3, i4, true);
                        bitmap.recycle();
                    } else {
                        createScaledBitmap = bitmap;
                    }
                    if (createScaledBitmap.getWidth() >= i || createScaledBitmap.getHeight() < i2) {
                        c04750Gp.LJII = true;
                    }
                    if (C04020Du.LIZ && bitmap.getWidth() == i) {
                        bitmap.getHeight();
                    }
                    return createScaledBitmap;
                }
            }
            i3 = i;
            i4 = i2;
            if (bitmap.getWidth() <= i3) {
            }
            createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i3, i4, true);
            bitmap.recycle();
            if (createScaledBitmap.getWidth() >= i) {
            }
            c04750Gp.LJII = true;
            if (C04020Du.LIZ) {
                bitmap.getHeight();
            }
            return createScaledBitmap;
        }
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap2;
    }
}
