package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import defpackage.i0;

/* renamed from: X.UvA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78732UvA extends AbstractC78749UvR {
    public Bitmap.Config mBitmapConfig;
    public float[] mBorderRadii;
    public C245519kJ mCacheKey;
    public String[] mCapInsets;
    public float mCapInsetsScale;
    public int mHeight;
    public int mPaddingBottom;
    public int mPaddingLeft;
    public int mPaddingRight;
    public int mPaddingTop;
    public InterfaceC78716Uuu mScaleType;
    public int mWidth;

    private void adjustPaddings() {
        int i = this.mPaddingLeft;
        int i2 = this.mPaddingRight;
        int i3 = i + i2;
        int i4 = this.mWidth;
        if (i3 > i4 && i4 > 0) {
            float f = i4 / (i + i2);
            this.mPaddingLeft = (int) (i * f);
            this.mPaddingRight = (int) (i2 * f);
        }
        int i5 = this.mPaddingTop;
        int i6 = this.mPaddingBottom;
        int i7 = i5 + i6;
        int i8 = this.mHeight;
        if (i7 > i8 && i8 > 0) {
            float f2 = i8 / (i5 + i6);
            this.mPaddingTop = (int) (i5 * f2);
            this.mPaddingBottom = (int) (i6 * f2);
        }
    }

    @Override // X.AbstractC78749UvR, X.VA3
    public W6U getPostprocessorCacheKey() {
        return this.mCacheKey;
    }

    private float ceil(float f) {
        return (float) Math.ceil(f);
    }

    public static String[] getCapInsetsArr(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            return null;
        }
        String[] split = str.split(" ");
        if (split.length > 4) {
            return null;
        }
        boolean z = true;
        for (int i = 0; i < Math.min(split.length, 4); i++) {
            if (split[i].endsWith("px") || split[i].endsWith("%")) {
                if (split[i].endsWith("px")) {
                    if (split[i].length() > 2) {
                        String str2 = split[i];
                        z = str2.substring(0, str2.length() - 2).matches("[+]?[0-9]*\\.?[0-9]+");
                    }
                } else {
                    if (split[i].endsWith("%")) {
                        if (split[i].length() > 1) {
                            String str3 = split[i];
                            z = str3.substring(0, str3.length() - 1).matches("[+]?[0-9]*\\.?[0-9]+");
                        }
                    }
                }
            }
            z = false;
        }
        if (!z) {
            return null;
        }
        return split;
    }

    public static float getCapInsetsScale(String str) {
        float f = 1.0f;
        if (str == null || str.equalsIgnoreCase("")) {
            return 1.0f;
        }
        try {
            f = CastFloatProtector.parseFloat(str);
            return f;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initCapInsetsScale error ");
            LIZ.append(th.getMessage());
            LLog.LIZLLL(3, "BaseRoundedCornerPostprocessor", X1D.LIZIZ(LIZ));
            return f;
        }
    }

    public static EnumC78690UuU getMode(InterfaceC78716Uuu interfaceC78716Uuu) {
        EnumC78690UuU enumC78690UuU = EnumC78690UuU.SCALE_TO_FILL;
        if (interfaceC78716Uuu == InterfaceC78716Uuu.LJJJLZIJ) {
            return enumC78690UuU;
        }
        if (interfaceC78716Uuu == InterfaceC78716Uuu.LJJL) {
            return EnumC78690UuU.ASPECT_FIT;
        }
        if (interfaceC78716Uuu == InterfaceC78716Uuu.LJJLIIIJILLIZJL) {
            return EnumC78690UuU.ASPECT_FILL;
        }
        if (interfaceC78716Uuu != InterfaceC78716Uuu.LJJLIIIIJ) {
            return enumC78690UuU;
        }
        return EnumC78690UuU.CENTER;
    }

    private void initCapInsets(String str) {
        this.mCapInsets = getCapInsetsArr(str);
    }

    private void initCapInsetsScale(String str) {
        this.mCapInsetsScale = getCapInsetsScale(str);
    }

    @Override // X.AbstractC78749UvR, X.VA3
    public C81392Vwy<Bitmap> process(Bitmap bitmap, AbstractC78853Ux7 abstractC78853Ux7) {
        C81392Vwy<Bitmap> c81392Vwy;
        Bitmap.Config config = this.mBitmapConfig;
        if (config == null) {
            config = bitmap.getConfig();
        }
        try {
            int i = this.mWidth;
            int i2 = this.mHeight;
            if (config == null) {
                config = AbstractC78749UvR.FALLBACK_BITMAP_CONFIGURATION;
            }
            c81392Vwy = abstractC78853Ux7.LJ(i, i2, config);
            try {
                if (this.mCapInsets == null) {
                    LLog.LIZLLL(2, "Lynx Image Processor", "process image from Fresco without cap-insets");
                    transform(c81392Vwy.LJI(), bitmap);
                } else {
                    LLog.LIZLLL(2, "Lynx Image Processor", "process image from Fresco with cap-insets");
                    transformWithCapInsets(c81392Vwy.LJI(), bitmap);
                }
                C81392Vwy<Bitmap> LIZJ = C81392Vwy.LIZJ(c81392Vwy);
                C81392Vwy.LJ(c81392Vwy);
                return LIZJ;
            } catch (Throwable th) {
                th = th;
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("process image error ");
                    LIZ.append(th.getMessage());
                    LLog.LIZLLL(4, "BaseRoundedCornerPostprocessor", X1D.LIZIZ(LIZ));
                    return null;
                } finally {
                    if (c81392Vwy != null) {
                        C81392Vwy.LJ(c81392Vwy);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            c81392Vwy = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void transform(android.graphics.Bitmap r26, android.graphics.Bitmap r27) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78732UvA.transform(android.graphics.Bitmap, android.graphics.Bitmap):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x026b, code lost:
    
        r3 = r3 * r18;
        r7 = X.C1I0.LIZ(r5, r3, 2.0f, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0269, code lost:
    
        if (r18 > r17) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x013d, code lost:
    
        if (r18 > r17) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x013f, code lost:
    
        r4 = r4 * r17;
        r9 = X.C1I0.LIZ(r6, r4, 2.0f, r9);
        r6 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void transformWithCapInsets(android.graphics.Bitmap r36, android.graphics.Bitmap r37) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78732UvA.transformWithCapInsets(android.graphics.Bitmap, android.graphics.Bitmap):void");
    }

    public static float[] getFloatCapInsetsArr(String[] strArr, int i, int i2) {
        if (strArr == null || strArr.length > 4) {
            return null;
        }
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (strArr[i3].endsWith("px")) {
                String str = strArr[i3];
                fArr[i3] = CastFloatProtector.parseFloat(str.substring(0, str.length() - 2));
            } else if (strArr[i3].endsWith("%")) {
                if (i3 == 0 || i3 == 2) {
                    String str2 = strArr[i3];
                    fArr[i3] = CastFloatProtector.parseFloat(str2.substring(0, str2.length() - 2)) * i2;
                } else {
                    String str3 = strArr[i3];
                    fArr[i3] = CastFloatProtector.parseFloat(str3.substring(0, str3.length() - 2)) * i;
                }
            }
        }
        return fArr;
    }

    private Canvas getInitCanvas(Bitmap bitmap, int i, int i2) {
        Canvas canvas = new Canvas(bitmap);
        canvas.clipRect(this.mPaddingLeft, this.mPaddingTop, i - this.mPaddingRight, i2 - this.mPaddingBottom);
        canvas.drawARGB(0, 0, 0, 0);
        return canvas;
    }

    public void updateCacheKey(String str, float[] fArr, InterfaceC78716Uuu interfaceC78716Uuu) {
        StringBuilder sb = new StringBuilder(i0.LJFF("", str));
        sb.append(interfaceC78716Uuu);
        if (fArr != null) {
            for (float f : fArr) {
                sb.append(f);
            }
        }
        sb.append(this.mPaddingBottom);
        sb.append(this.mPaddingTop);
        sb.append(this.mPaddingLeft);
        sb.append(this.mPaddingRight);
        sb.append(this.mScaleType);
        String[] strArr = this.mCapInsets;
        if (strArr != null) {
            sb.append(strArr);
            sb.append(this.mCapInsetsScale);
        }
        sb.append(this.mBitmapConfig);
        this.mCacheKey = new C245519kJ(sb.toString());
    }

    public static Matrix getMatrix(int i, int i2, int i3, int i4, InterfaceC78716Uuu interfaceC78716Uuu) {
        return C78688UuS.LJJIJLIJ(i, i2, i3, i4, getMode(interfaceC78716Uuu));
    }

    public static boolean customDraw(int i, int i2, int i3, int i4, InterfaceC78716Uuu interfaceC78716Uuu, String str, String str2, Canvas canvas, Bitmap bitmap) {
        float[] LJJIIZI;
        float f;
        EnumC78690UuU mode = getMode(interfaceC78716Uuu);
        TraceEvent.LIZIZ("image.NinePatchHelper.drawNinePatch");
        boolean z = false;
        try {
            LJJIIZI = C78688UuS.LJJIIZI(C78688UuS.LJJII(str), i3, i4);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("process customDraw warn ");
            LIZ.append(th.getMessage());
            LLog.LIZLLL(3, "BaseRoundedCornerPostprocessor", X1D.LIZIZ(LIZ));
        }
        if (str2 != null && !str2.equalsIgnoreCase("")) {
            try {
                f = CastFloatProtector.parseFloat(str2);
            } catch (Throwable th2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("initCapInsetsScale error ");
                LIZ2.append(th2.getMessage());
                LLog.LIZLLL(3, "BaseRoundedCornerPostprocessor", X1D.LIZIZ(LIZ2));
            }
            if (LJJIIZI != null || LJJIIZI.length != 4 || (LJJIIZI[0] == 0.0f && LJJIIZI[1] == 0.0f && LJJIIZI[2] == 0.0f && LJJIIZI[3] == 0.0f)) {
                canvas.drawBitmap(bitmap, C78688UuS.LJJIJLIJ(i, i2, i3, i4, mode), null);
            } else {
                C78688UuS.LJIILJJIL(i, i2, i3, i4, mode, LJJIIZI, f, canvas, bitmap);
            }
            z = true;
            TraceEvent.LJ("image.NinePatchHelper.drawNinePatch");
            return z;
        }
        f = 1.0f;
        if (LJJIIZI != null) {
        }
        canvas.drawBitmap(bitmap, C78688UuS.LJJIJLIJ(i, i2, i3, i4, mode), null);
        z = true;
        TraceEvent.LJ("image.NinePatchHelper.drawNinePatch");
        return z;
    }

    public C78732UvA(String str, int i, int i2, int i3, int i4, int i5, int i6, float[] fArr, InterfaceC78716Uuu interfaceC78716Uuu, String str2, String str3, Bitmap.Config config) {
        this.mScaleType = interfaceC78716Uuu;
        this.mWidth = i;
        this.mHeight = i2;
        this.mPaddingLeft = i3;
        this.mPaddingTop = i4;
        this.mPaddingRight = i5;
        this.mPaddingBottom = i6;
        this.mBorderRadii = fArr;
        initCapInsets(str2);
        initCapInsetsScale(str3);
        this.mBitmapConfig = config;
        updateCacheKey(str, fArr, interfaceC78716Uuu);
        adjustPaddings();
    }
}
