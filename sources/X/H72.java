package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.zhiliaoapp.musically.R;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H72 {
    public static final /* synthetic */ int LIZIZ = 0;
    public Bitmap LIZ;

    static {
        C16880lQ.LJLLJ(H72.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x002b, code lost:
    
        if (0 != 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(java.io.File r6) {
        /*
            r5 = this;
            android.graphics.Bitmap r0 = r5.LIZ
            r4 = 0
            if (r0 != 0) goto Lb
            java.lang.String r0 = "mBitmap is null"
            X.H78.LIZJ(r0)
            return r4
        Lb:
            r0 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L29 java.io.FileNotFoundException -> L2b
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L29 java.io.FileNotFoundException -> L2b
            android.graphics.Bitmap r2 = r5.LIZ     // Catch: java.lang.Throwable -> L22 java.io.FileNotFoundException -> L27
            kotlin.jvm.internal.o.LJI(r2)     // Catch: java.lang.Throwable -> L22 java.io.FileNotFoundException -> L27
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L22 java.io.FileNotFoundException -> L27
            r0 = 100
            r2.compress(r1, r0, r3)     // Catch: java.lang.Throwable -> L22 java.io.FileNotFoundException -> L27
            r3.close()     // Catch: java.io.IOException -> L20
        L20:
            r0 = 1
            return r0
        L22:
            r0 = move-exception
            r3.close()     // Catch: java.io.IOException -> L2a
            goto L2a
        L27:
            r0 = r3
            goto L2d
        L29:
            r0 = move-exception
        L2a:
            throw r0
        L2b:
            if (r0 == 0) goto L30
        L2d:
            r0.close()     // Catch: java.io.IOException -> L30
        L30:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H72.LIZJ(java.io.File):boolean");
    }

    public final boolean LIZLLL(String str) {
        FileOutputStream fileOutputStream;
        if (this.LIZ == null) {
            H78.LIZJ("mBitmap is null");
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(str);
            } catch (FileNotFoundException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            if (fileOutputStream2 == null) {
                throw th;
            }
        }
        try {
            Bitmap bitmap = this.LIZ;
            o.LJI(bitmap);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            try {
                fileOutputStream.close();
                return true;
            } catch (IOException unused) {
                return true;
            }
        } catch (FileNotFoundException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            C16880lQ.LLLLIIL(e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            try {
                fileOutputStream2.close();
                throw th;
            } catch (IOException unused3) {
                throw th;
            }
        }
    }

    public final void LIZ(int i, int i2, String str, Bitmap bitmap, boolean z, boolean z2) {
        float f;
        int i3;
        int width;
        int i4;
        float f2;
        int width2;
        float f3;
        if (i == 0 || i2 == 0) {
            f = 1.0f;
        } else {
            f = Math.min(i / 750.0f, i2 / 750.0f);
        }
        Resources resources = C44172HVg.LIZ.getResources();
        o.LJIIIIZZ(resources, "application.getResources()");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (90 * f), (int) (87 * f), true);
        o.LJIIIIZZ(createScaledBitmap, "createScaledBitmap(logo, w, h, true)");
        if (TextUtils.isEmpty(str)) {
            this.LIZ = createScaledBitmap;
            return;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setColor(resources.getColor(R.color.s9));
        float f4 = 20 * f;
        textPaint.setTextSize(f4);
        KL2.LIZJ(C44172HVg.LIZ, 1.0f);
        textPaint.setShadowLayer(0.0f, 1.0f, 4.0f, resources.getColor(R.color.gi));
        int i5 = (int) f4;
        int measureText = (int) ((5.0f * f) + textPaint.measureText(str));
        int width3 = createScaledBitmap.getWidth();
        if (z) {
            i3 = ((int) Math.ceil(4 * f)) + i5;
        } else {
            i3 = 0;
        }
        int max = Math.max(width3, i3 + measureText);
        Bitmap createBitmap = Bitmap.createBitmap(max, (int) ((28 * f) + createScaledBitmap.getHeight()), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint LIZIZ2 = C6D8.LIZIZ(true);
        if (z) {
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, R.drawable.b9s, null);
            o.LJI(decodeResource);
            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(decodeResource, i5, i5, true);
            if (z2) {
                f2 = 0.0f;
            } else {
                f2 = (max - measureText) - ((f * 4.0f) + i5);
            }
            canvas.drawBitmap(createScaledBitmap2, f2, (6 * f) + createScaledBitmap.getHeight(), LIZIZ2);
            if (z2) {
                width2 = 0;
            } else {
                width2 = (max - createScaledBitmap.getWidth()) + 3;
            }
            canvas.drawBitmap(createScaledBitmap, width2, 0.0f, LIZIZ2);
            o.LJI(str);
            if (z2) {
                f3 = (4.0f * f) + i5;
            } else {
                f3 = max - measureText;
            }
            canvas.drawText(str, f3, (4 * f) + (createScaledBitmap.getHeight() - textPaint.ascent()), textPaint);
        } else {
            if (z2) {
                width = 0;
            } else {
                width = (max - createScaledBitmap.getWidth()) + 3;
            }
            canvas.drawBitmap(createScaledBitmap, width, 0.0f, LIZIZ2);
            o.LJI(str);
            if (z2) {
                i4 = 0;
            } else {
                i4 = max - measureText;
            }
            canvas.drawText(str, i4, (4 * f) + (createScaledBitmap.getHeight() - textPaint.ascent()), textPaint);
        }
        this.LIZ = createBitmap;
    }

    public final void LIZIZ(int i, int i2, String str, Bitmap bitmap, boolean z, boolean z2, HN4 hn4) {
        float f;
        int i3;
        int width;
        int i4;
        float f2;
        int width2;
        float f3;
        if (i == 0 || i2 == 0) {
            f = 1.0f;
        } else {
            f = Math.min(i / 750.0f, i2 / 750.0f);
        }
        Resources resources = C44172HVg.LIZ.getResources();
        o.LJIIIIZZ(resources, "application.getResources()");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (90 * f), (int) (87 * f), true);
        o.LJIIIIZZ(createScaledBitmap, "createScaledBitmap(logo, w, h, true)");
        if (TextUtils.isEmpty(str)) {
            this.LIZ = createScaledBitmap;
            return;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setColor(resources.getColor(R.color.s9));
        float f4 = 20 * f;
        textPaint.setTextSize(f4);
        float LIZJ = KL2.LIZJ(C44172HVg.LIZ, 1.0f);
        float f5 = 4;
        float f6 = f5 * LIZJ;
        textPaint.setShadowLayer(0.0f, LIZJ, f6, resources.getColor(R.color.gi));
        int i5 = (int) f4;
        int measureText = (int) ((5.0f * f) + textPaint.measureText(str));
        int width3 = createScaledBitmap.getWidth();
        if (z) {
            i3 = ((int) Math.ceil(f5 * f)) + i5;
        } else {
            i3 = 0;
        }
        int max = Math.max(width3, i3 + measureText);
        Bitmap createBitmap = Bitmap.createBitmap(max, (int) ((28 * f) + createScaledBitmap.getHeight()), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint LIZIZ2 = C6D8.LIZIZ(true);
        LIZIZ2.setShadowLayer(0.0f, LIZJ, f6, resources.getColor(R.color.gi));
        if (z) {
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, hn4.LIZ, null);
            o.LJI(decodeResource);
            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(decodeResource, i5, i5, true);
            if (z2) {
                f2 = 0.0f;
            } else {
                f2 = (max - measureText) - ((f5 * f) + i5);
            }
            canvas.drawBitmap(createScaledBitmap2, f2, (6 * f) + createScaledBitmap.getHeight(), LIZIZ2);
            if (z2) {
                width2 = 0;
            } else {
                width2 = (max - createScaledBitmap.getWidth()) + 3;
            }
            canvas.drawBitmap(createScaledBitmap, width2, 0.0f, LIZIZ2);
            o.LJI(str);
            if (z2) {
                f3 = (4.0f * f) + i5;
            } else {
                f3 = max - measureText;
            }
            canvas.drawText(str, f3, (f * f5) + (createScaledBitmap.getHeight() - textPaint.ascent()), textPaint);
        } else {
            if (z2) {
                width = 0;
            } else {
                width = (max - createScaledBitmap.getWidth()) + 3;
            }
            canvas.drawBitmap(createScaledBitmap, width, 0.0f, LIZIZ2);
            o.LJI(str);
            if (z2) {
                i4 = 0;
            } else {
                i4 = max - measureText;
            }
            canvas.drawText(str, i4, (f * f5) + (createScaledBitmap.getHeight() - textPaint.ascent()), textPaint);
        }
        this.LIZ = createBitmap;
    }
}
