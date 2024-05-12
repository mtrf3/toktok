package X;

import Y.ARunnableS16S0400000_13;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.base.LLog;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

/* loaded from: classes14.dex */
public final class V9R {
    public static final int LJFF = Math.min(3379, 3379);
    public static final int LJI = Math.min(3379, 3379);
    public final V9V LIZ;
    public V9T LIZIZ;
    public final Handler LIZJ = new Handler(C16880lQ.LLJJJJ());
    public int LIZLLL;
    public boolean LJ;

    public final void LIZJ() {
        V9T v9t = this.LIZIZ;
        if (v9t != null) {
            v9t.LIZ();
        }
        this.LIZIZ = null;
    }

    public static void LIZIZ(C81377Vwj c81377Vwj) {
        if (c81377Vwj != null) {
            try {
                c81377Vwj.close();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static Point LJFF(Canvas canvas) {
        return new Point(Math.min(canvas.getMaximumBitmapWidth(), LJFF), Math.min(canvas.getMaximumBitmapHeight(), LJI));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        if (r0 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.V9T LJIIIZ(X.V9U r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto Lb
            java.lang.String r0 = r7.LJFF
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lc
        Lb:
            return r5
        Lc:
            X.W8E r0 = X.W8E.LJII()
            X.W5e r2 = r0.LJIIIZ()
            X.9kJ r1 = new X.9kJ
            java.lang.String r0 = r7.LJFF
            r1.<init>(r0)
            X.WEK r2 = r2.LJ(r1)
            r4 = 0
            if (r2 == 0) goto L27
            java.io.File r0 = r2.LIZ
            if (r0 != 0) goto L42
        L27:
            boolean r0 = r6.LJ
            if (r0 == 0) goto Lb
            java.lang.String r1 = r7.LJFF
            java.lang.String r0 = "://"
            int r0 = r1.indexOf(r0)
            java.lang.String r1 = r7.LJFF
            if (r0 <= 0) goto L40
            int r0 = r0 + 3
        L39:
            java.lang.String r0 = r1.substring(r0)
            if (r0 != 0) goto L48
            goto L42
        L40:
            r0 = 0
            goto L39
        L42:
            java.io.File r0 = r2.LIZ     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> Lb
        L48:
            android.graphics.BitmapRegionDecoder r3 = android.graphics.BitmapRegionDecoder.newInstance(r0, r4)     // Catch: java.lang.Throwable -> Lb
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> Lb
            r2.<init>()     // Catch: java.lang.Throwable -> Lb
            int r0 = r3.getWidth()     // Catch: java.lang.Throwable -> Lb
            float r1 = (float) r0     // Catch: java.lang.Throwable -> Lb
            int r0 = r3.getHeight()     // Catch: java.lang.Throwable -> Lb
            float r0 = (float) r0     // Catch: java.lang.Throwable -> Lb
            X.V9T r1 = r6.LJI(r7, r1, r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L73
            int r0 = r1.LIZ     // Catch: java.lang.Throwable -> Lb
            r2.inSampleSize = r0     // Catch: java.lang.Throwable -> Lb
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> Lb
            r2.inPreferredConfig = r0     // Catch: java.lang.Throwable -> Lb
            android.graphics.Rect r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> Lb
            android.graphics.Bitmap r0 = r3.decodeRegion(r0, r2)     // Catch: java.lang.Throwable -> Lb
            r1.LIZLLL = r0     // Catch: java.lang.Throwable -> Lb
            r1.LJ = r4     // Catch: java.lang.Throwable -> Lb
        L73:
            r3.recycle()     // Catch: java.lang.Throwable -> Lb
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V9R.LJIIIZ(X.V9U):X.V9T");
    }

    public final void LJIIJJI(V9T v9t) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (v9t == null || (bitmap = v9t.LIZLLL) == null || bitmap.isRecycled()) {
            return;
        }
        if (v9t.LJFF.LIZ != this.LIZLLL) {
            v9t.LIZ();
            return;
        }
        V9T v9t2 = this.LIZIZ;
        if (v9t2 != null && (bitmap2 = v9t2.LIZLLL) != null && (bitmap2.getWidth() >= v9t.LIZLLL.getWidth() || this.LIZIZ.LIZLLL.getHeight() >= v9t.LIZLLL.getHeight())) {
            return;
        }
        LIZJ();
        this.LIZIZ = v9t;
        V9V v9v = this.LIZ;
        if (v9v == null) {
            return;
        }
        v9v.LIZIZ();
    }

    public V9R(V9V v9v, int i) {
        this.LIZ = v9v;
        this.LIZLLL = i;
    }

    public final void LJ(Canvas canvas, V9T v9t) {
        Bitmap bitmap;
        if (v9t == null || (bitmap = v9t.LIZLLL) == null || bitmap.isRecycled()) {
            return;
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        V9U v9u = v9t.LJFF;
        if (v9u.LJ == InterfaceC78716Uuu.LJJL && v9u.LIZLLL) {
            Bitmap bitmap2 = this.LIZIZ.LIZLLL;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
            Matrix matrix = new Matrix();
            float min = Math.min((canvas.getWidth() * 1.0f) / this.LIZIZ.LIZLLL.getWidth(), (canvas.getHeight() * 1.0f) / this.LIZIZ.LIZLLL.getHeight());
            matrix.postScale(min, min);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);
            canvas.drawRect(new Rect(0, 0, canvas.getWidth(), canvas.getHeight()), paint);
            return;
        }
        Matrix matrix2 = new Matrix();
        Rect rect = this.LIZIZ.LIZJ;
        matrix2.preTranslate(rect.left, rect.top);
        V9T v9t2 = this.LIZIZ;
        if (v9t2.LJ) {
            Rect rect2 = v9t2.LIZJ;
            Rect rect3 = v9t2.LIZIZ;
            matrix2.postScale(((rect2.right - rect2.left) * 1.0f) / (rect3.right - rect3.left), ((rect2.bottom - rect2.top) * 1.0f) / (rect3.bottom - rect3.top));
            canvas.drawBitmap(this.LIZIZ.LIZLLL, matrix2, paint);
            return;
        }
        Rect rect4 = v9t2.LIZJ;
        float width = ((rect4.right - rect4.left) * 1.0f) / v9t2.LIZLLL.getWidth();
        Rect rect5 = this.LIZIZ.LIZJ;
        matrix2.postScale(width, ((rect5.bottom - rect5.top) * 1.0f) / r2.LIZLLL.getHeight());
        canvas.drawBitmap(this.LIZIZ.LIZLLL, matrix2, paint);
    }

    public final V9T LJIIIIZZ(Context context, V9U v9u) {
        try {
            InputStream open = context.getAssets().open(v9u.LJFF.substring(9));
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(open, false);
            BitmapFactory.Options options = new BitmapFactory.Options();
            V9T LJI2 = LJI(v9u, newInstance.getWidth(), newInstance.getHeight());
            if (LJI2 != null) {
                options.inSampleSize = LJI2.LIZ;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                LJI2.LIZLLL = newInstance.decodeRegion(LJI2.LIZIZ, options);
                LJI2.LJ = false;
            }
            newInstance.recycle();
            open.close();
            return LJI2;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("loadBitmapFromAssetSync error: ");
            LIZ.append(th.getMessage());
            LLog.LIZLLL(4, "LynxImageHelper", X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public final void LJIIJ(Context context, V9U v9u) {
        if (v9u == null || TextUtils.isEmpty(v9u.LJFF)) {
            return;
        }
        LLog.LIZLLL(1, "LynxImageHelper", "loadBitmapFromRemote");
        android.net.Uri parse = UriProtector.parse(v9u.LJFF);
        W6J LIZ = W5I.LIZ();
        W5P LIZLLL = W5P.LIZLLL(parse);
        V9E.LIZIZ(LIZLLL, Bitmap.Config.ARGB_8888);
        LIZ.LJFF(LIZLLL.LIZ(), context).LJ(new V9S(this, v9u), C16880lQ.LLLLZLLIL());
    }

    public final V9T LJI(V9U v9u, float f, float f2) {
        if (f != 0.0f && f2 != 0.0f) {
            float f3 = v9u.LIZIZ;
            if (f3 != 0.0f) {
                float f4 = v9u.LIZJ;
                if (f4 == 0.0f) {
                    return null;
                }
                V9T v9t = new V9T(v9u);
                InterfaceC78716Uuu interfaceC78716Uuu = v9u.LJ;
                if (interfaceC78716Uuu == InterfaceC78716Uuu.LJJLIIIIJ) {
                    v9t.LIZIZ = new Rect();
                    Rect rect = new Rect();
                    v9t.LIZJ = rect;
                    float f5 = v9u.LIZIZ;
                    if (f <= f5) {
                        Rect rect2 = v9t.LIZIZ;
                        rect2.left = 0;
                        rect2.right = (int) f;
                        rect.left = (int) ((f5 - f) / 2.0f);
                        rect.right = (int) ((f5 + f) / 2.0f);
                    } else {
                        Rect rect3 = v9t.LIZIZ;
                        float f6 = (f - f5) / 2.0f;
                        rect3.left = (int) f6;
                        rect3.right = (int) (f - f6);
                        rect.left = 0;
                        rect.right = (int) f5;
                    }
                    float f7 = v9u.LIZJ;
                    if (f2 <= f7) {
                        Rect rect4 = v9t.LIZIZ;
                        rect4.top = 0;
                        rect4.bottom = (int) f2;
                        rect.top = (int) ((f7 - f2) / 2.0f);
                        rect.bottom = (int) ((f7 + f2) / 2.0f);
                    } else {
                        Rect rect5 = v9t.LIZIZ;
                        float f8 = (f2 - f7) / 2.0f;
                        rect5.top = (int) f8;
                        rect5.bottom = (int) (f2 - f8);
                        rect.top = 0;
                        rect.bottom = (int) f7;
                    }
                    Rect rect6 = v9t.LIZIZ;
                    float f9 = rect6.right - rect6.left;
                    float f10 = rect6.bottom - rect6.top;
                    v9t.LIZ = LIZ(v9u.LJI, f9, f10, f9, f10);
                } else if (interfaceC78716Uuu == InterfaceC78716Uuu.LJJL) {
                    float f11 = f3 / f;
                    float f12 = f4 / f2;
                    Rect rect7 = new Rect();
                    v9t.LIZIZ = rect7;
                    rect7.top = 0;
                    rect7.bottom = (int) f2;
                    rect7.left = 0;
                    rect7.right = (int) f;
                    Rect rect8 = new Rect();
                    v9t.LIZJ = rect8;
                    if (f11 <= f12) {
                        float f13 = f11 * f2;
                        rect8.left = 0;
                        rect8.right = (int) v9u.LIZIZ;
                        float f14 = v9u.LIZJ;
                        rect8.top = (int) ((f14 - f13) / 2.0f);
                        rect8.bottom = (int) ((f14 + f13) / 2.0f);
                    } else {
                        float f15 = f12 * f;
                        rect8.top = 0;
                        rect8.bottom = (int) v9u.LIZJ;
                        float f16 = v9u.LIZIZ;
                        rect8.left = (int) ((f16 - f15) / 2.0f);
                        rect8.right = (int) ((f16 + f15) / 2.0f);
                    }
                    v9t.LIZ = LIZ(v9u.LJI, rect8.right - rect8.left, rect8.bottom - rect8.top, f, f2);
                } else if (interfaceC78716Uuu == InterfaceC78716Uuu.LJJLIIIJILLIZJL) {
                    float f17 = f3 / f;
                    float f18 = f4 / f2;
                    Rect rect9 = new Rect();
                    v9t.LIZJ = rect9;
                    rect9.top = 0;
                    rect9.bottom = (int) v9u.LIZJ;
                    rect9.left = 0;
                    rect9.right = (int) v9u.LIZIZ;
                    Rect rect10 = new Rect();
                    v9t.LIZIZ = rect10;
                    if (f17 >= f18) {
                        float f19 = v9u.LIZJ / f17;
                        rect10.left = 0;
                        rect10.right = (int) f;
                        rect10.top = (int) ((f2 - f19) / 2.0f);
                        rect10.bottom = (int) ((f2 + f19) / 2.0f);
                    } else {
                        float f20 = v9u.LIZIZ / f18;
                        rect10.left = (int) ((f - f20) / 2.0f);
                        rect10.right = (int) ((f20 + f) / 2.0f);
                        rect10.top = 0;
                        rect10.bottom = (int) f2;
                    }
                    v9t.LIZ = LIZ(v9u.LJI, v9u.LIZIZ, v9u.LIZJ, rect10.right - rect10.left, rect10.bottom - rect10.top);
                } else {
                    v9t.LIZIZ = new Rect(0, 0, (int) f, (int) f2);
                    v9t.LIZJ = new Rect(0, 0, (int) v9u.LIZIZ, (int) v9u.LIZJ);
                    v9t.LIZ = LIZ(v9u.LJI, v9u.LIZIZ, v9u.LIZJ, f, f2);
                }
                if (this.LJ) {
                    v9t.LIZ = 1;
                }
                return v9t;
            }
            return null;
        }
        return null;
    }

    public final void LJII(Context context, W5O w5o, V9U v9u) {
        String str;
        if (!TextUtils.isEmpty(v9u.LJFF)) {
            if (!TextUtils.isEmpty(v9u.LJFF)) {
                str = String.copyValueOf(v9u.LJFF.toCharArray());
            } else {
                str = null;
            }
            V9U v9u2 = new V9U(v9u.LIZ, v9u.LIZIZ, v9u.LIZJ, v9u.LIZLLL, v9u.LJ, str, v9u.LJI, v9u.LJII, v9u.LJIIIIZZ);
            if (IW1.LJLJJL == null) {
                synchronized (IW1.class) {
                    if (IW1.LJLJJL == null) {
                        IW1.LJLJJL = new IW1();
                    }
                }
            }
            IW1 iw1 = IW1.LJLJJL;
            ARunnableS16S0400000_13 aRunnableS16S0400000_13 = new ARunnableS16S0400000_13(this, v9u2, context, w5o, v9u, 8);
            iw1.getClass();
            if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                Handler handler = iw1.LJLJJI;
                if (handler == null) {
                    if (iw1.LJLILLLLZI == null) {
                        iw1.LJLILLLLZI = new LinkedList();
                    }
                    ((LinkedList) iw1.LJLILLLLZI).add(aRunnableS16S0400000_13);
                } else {
                    handler.post(aRunnableS16S0400000_13);
                }
            }
        }
        if (w5o == null) {
            return;
        }
        try {
            V91 LIZIZ = W5I.LIZ().LJIIIIZZ.LIZIZ(w5o, null);
            if (W5I.LIZ().LIZLLL.LJFF(LIZIZ) == null) {
                return;
            }
            C81392Vwy<W5A> clone = W5I.LIZ().LIZLLL.LJFF(LIZIZ).clone();
            if (clone.LJI() == null || !(clone.LJI() instanceof W5C)) {
                return;
            }
            Bitmap underlyingBitmap = ((W5C) clone.LJI()).getUnderlyingBitmap();
            V9T LJI2 = LJI(v9u, underlyingBitmap.getWidth(), underlyingBitmap.getHeight());
            if (LJI2 == null) {
                return;
            }
            LJI2.LJI = clone;
            LJI2.LIZLLL = underlyingBitmap;
            LJIIJJI(LJI2);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("loadBitmapFromMemory failed: ");
            LIZ.append(th.toString());
            LLog.LIZLLL(4, "BigImageDrawingHelper", X1D.LIZIZ(LIZ));
        }
    }

    public final boolean LIZLLL(Context context, Canvas canvas, W5O w5o, V9U v9u) {
        Bitmap bitmap;
        this.LJ = true;
        V9T v9t = this.LIZIZ;
        if (v9t == null || v9t.LIZLLL == null || v9t.LJFF.LIZ != v9u.LIZ) {
            LIZJ();
            LJII(context, w5o, v9u);
        }
        V9T v9t2 = this.LIZIZ;
        if (v9t2 == null || (bitmap = v9t2.LIZLLL) == null) {
            return false;
        }
        C78732UvA.customDraw((int) v9u.LIZIZ, (int) v9u.LIZJ, bitmap.getWidth(), this.LIZIZ.LIZLLL.getHeight(), v9u.LJ, v9u.LJII, v9u.LJIIIIZZ, canvas, this.LIZIZ.LIZLLL);
        return true;
    }

    public static int LIZ(Point point, float f, float f2, float f3, float f4) {
        if (f4 == 0.0f || f3 == 0.0f) {
            return 32;
        }
        float min = Math.min(Math.min(f / f3, f2 / f4), Math.min(point.x / f3, point.y / f4));
        int i = (int) (f3 * min);
        int i2 = (int) (min * f4);
        if (i == 0 || i2 == 0) {
            return 32;
        }
        float f5 = i2;
        int i3 = 1;
        if (f4 > f5 || f3 > i) {
            int round = Math.round(f4 / f5);
            int round2 = Math.round(f3 / i);
            if (round >= round2) {
                round = round2;
            }
            while (true) {
                int i4 = i3 * 2;
                if (i4 > round) {
                    break;
                }
                i3 = i4;
            }
        }
        return i3;
    }
}
