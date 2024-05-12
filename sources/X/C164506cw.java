package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6cw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164506cw {
    public Bitmap LIZ;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x002d, code lost:
    
        if (r2 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(java.lang.String r5) {
        /*
            r4 = this;
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L27 java.lang.Throwable -> L2c
            r3.<init>(r5)     // Catch: java.io.FileNotFoundException -> L27 java.lang.Throwable -> L2c
            android.graphics.Bitmap r2 = r4.LIZ     // Catch: java.lang.Throwable -> L21 java.io.FileNotFoundException -> L24
            kotlin.jvm.internal.o.LJI(r2)     // Catch: java.lang.Throwable -> L21 java.io.FileNotFoundException -> L24
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L21 java.io.FileNotFoundException -> L24
            r0 = 100
            r2.compress(r1, r0, r3)     // Catch: java.lang.Throwable -> L21 java.io.FileNotFoundException -> L24
            r3.close()     // Catch: java.io.IOException -> L16
            goto L1a
        L16:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L1a:
            android.graphics.Bitmap r0 = r4.LIZ
            X.C42299Git.LJ(r0)
            r0 = 1
            return r0
        L21:
            r1 = move-exception
            r2 = r3
            goto L2f
        L24:
            r0 = move-exception
            r2 = r3
            goto L28
        L27:
            r0 = move-exception
        L28:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L2c
            goto L3d
        L2c:
            r1 = move-exception
            if (r2 == 0) goto L37
        L2f:
            r2.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L37:
            android.graphics.Bitmap r0 = r4.LIZ
            X.C42299Git.LJ(r0)
            throw r1
        L3d:
            if (r2 == 0) goto L47
            r2.close()     // Catch: java.io.IOException -> L43
            goto L47
        L43:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L47:
            android.graphics.Bitmap r0 = r4.LIZ
            X.C42299Git.LJ(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164506cw.LIZIZ(java.lang.String):boolean");
    }

    public final void LIZ(Bitmap bitmap, String str, boolean z) {
        int width;
        Resources resources = C44172HVg.LIZ.getResources();
        o.LJIIIIZZ(resources, "application.getResources()");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 168, 67, true);
        o.LJIIIIZZ(createScaledBitmap, "createScaledBitmap(logo, 168, 67, true)");
        if (TextUtils.isEmpty(str)) {
            this.LIZ = createScaledBitmap;
            return;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setColor(resources.getColor(R.color.s9));
        textPaint.setTextSize(30.0f);
        float LIZ = C170576mj.LIZ(C44172HVg.LIZ, 1.0f);
        textPaint.setShadowLayer(2 * LIZ, 0.0f, LIZ, resources.getColor(R.color.cn));
        int max = Math.max(createScaledBitmap.getWidth(), (int) (textPaint.measureText(str) + 5.0f)) + 15;
        Bitmap createBitmap = Bitmap.createBitmap(max, createScaledBitmap.getHeight() + 44 + 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint LIZIZ = C6D8.LIZIZ(true);
        if (z) {
            width = 4;
        } else {
            width = max - createScaledBitmap.getWidth();
        }
        canvas.drawBitmap(createScaledBitmap, width, 0.0f, LIZIZ);
        canvas.drawText(str, (max - r7) - 4, (createScaledBitmap.getHeight() + 2) - textPaint.ascent(), textPaint);
        this.LIZ = createBitmap;
    }
}
