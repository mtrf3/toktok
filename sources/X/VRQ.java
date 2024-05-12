package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;

/* loaded from: classes15.dex */
public final class VRQ extends VRP {
    public final double LJLJLJ;
    public final int LJLJLLL;
    public boolean LJLL;

    public VRQ(ReadableArray readableArray) {
        int i;
        if (readableArray == null) {
            LLog.LIZLLL(4, "LinearGradient", "native parse error array is null");
            return;
        }
        if (readableArray.size() < 3) {
            LLog.LIZLLL(4, "LinearGradient", "native parse error, array.size must be 4  ");
            return;
        }
        this.LJLJLJ = readableArray.getDouble(0);
        LJIIIIZZ(readableArray.getArray(1), readableArray.getArray(2));
        if (readableArray.size() == 4) {
            i = readableArray.getInt(3);
        } else {
            i = 9;
        }
        this.LJLJLLL = i;
    }

    @Override // X.VR1
    public final void LJII(boolean z) {
        this.LJLL = z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        PointF pointF;
        this.LJLJI = Math.max(rect.width(), 1);
        this.LJLJJI = Math.max(rect.height(), 1);
        int i = rect.left;
        int i2 = rect.top;
        int[] iArr = this.LJLJJLL;
        if (iArr == null || iArr.length < 2) {
            this.LJLILLLLZI = null;
        } else {
            float[] fArr = this.LJLJL;
            if (fArr != null && fArr.length != iArr.length) {
                this.LJLILLLLZI = null;
            } else {
                PointF pointF2 = new PointF();
                PointF pointF3 = new PointF();
                try {
                    int i3 = this.LJLJI;
                    int i4 = this.LJLJJI;
                    float f = ((i3 * 2.0f) * i4) / ((i4 * i4) + (i3 * i3));
                    int i5 = this.LJLJLLL;
                    if (i5 == 1) {
                        float f2 = i;
                        pointF2.x = f2;
                        pointF2.y = i4 + i2;
                        pointF3.x = f2;
                        pointF3.y = i2;
                    } else if (i5 == 2) {
                        float f3 = i;
                        pointF2.x = f3;
                        pointF2.y = i2;
                        pointF3.x = f3;
                        pointF3.y = i2 + i4;
                    } else if (i5 == 3) {
                        pointF2.x = i3 + i;
                        float f4 = i2;
                        pointF2.y = f4;
                        pointF3.x = i;
                        pointF3.y = f4;
                    } else if (i5 == 4) {
                        pointF2.x = i;
                        float f5 = i2;
                        pointF2.y = f5;
                        pointF3.x = i + i3;
                        pointF3.y = f5;
                    } else if (i5 == 5) {
                        pointF2.x = (i + i3) - (i4 * f);
                        float f6 = i2;
                        pointF2.y = (i3 * f) + f6;
                        pointF3.x = i + i3;
                        pointF3.y = f6;
                    } else if (i5 == 6) {
                        float f7 = i;
                        pointF2.x = (i4 * f) + f7;
                        float f8 = i2;
                        pointF2.y = (i3 * f) + f8;
                        pointF3.x = f7;
                        pointF3.y = f8;
                    } else if (i5 == 7) {
                        float f9 = i;
                        pointF2.x = f9;
                        float f10 = i2;
                        pointF2.y = f10;
                        pointF3.x = (i4 * f) + f9;
                        pointF3.y = (i3 * f) + f10;
                    } else if (i5 == 8) {
                        pointF2.x = i + i3;
                        float f11 = i2;
                        pointF2.y = f11;
                        pointF3.x = (i + i3) - (i4 * f);
                        pointF3.y = (i3 * f) + f11;
                    } else {
                        PointF pointF4 = new PointF(this.LJLJI / 2.0f, this.LJLJJI / 2.0f);
                        double radians = Math.toRadians(this.LJLJLJ);
                        float sin = (float) Math.sin(radians);
                        float cos = (float) Math.cos(radians);
                        float tan = (float) Math.tan(radians);
                        if (sin >= 0.0f) {
                            if (cos < 0.0f) {
                                if (cos < 0.0f) {
                                    pointF = new PointF(this.LJLJI, this.LJLJJI);
                                }
                            } else {
                                pointF = new PointF(this.LJLJI, 0.0f);
                            }
                            float f12 = i;
                            float f13 = i2;
                            pointF2.offset(f12, f13);
                            pointF3.offset(f12, f13);
                            pointF4.offset(f12, f13);
                            pointF.offset(f12, f13);
                            float f14 = pointF4.y;
                            float f15 = f14 - pointF.y;
                            float f16 = pointF4.x;
                            float f17 = (f15 - (tan * f16)) + (pointF.x * tan);
                            float f18 = ((sin * f17) / ((sin * tan) + cos)) + f16;
                            pointF3.x = f18;
                            float f19 = f14 - (f17 / ((tan * tan) + 1.0f));
                            pointF3.y = f19;
                            pointF2.x = (pointF4.x * 2.0f) - f18;
                            pointF2.y = (pointF4.y * 2.0f) - f19;
                        }
                        if (sin < 0.0f && cos < 0.0f) {
                            pointF = new PointF(0.0f, this.LJLJJI);
                        } else {
                            pointF = new PointF(0.0f, 0.0f);
                        }
                        float f122 = i;
                        float f132 = i2;
                        pointF2.offset(f122, f132);
                        pointF3.offset(f122, f132);
                        pointF4.offset(f122, f132);
                        pointF.offset(f122, f132);
                        float f142 = pointF4.y;
                        float f152 = f142 - pointF.y;
                        float f162 = pointF4.x;
                        float f172 = (f152 - (tan * f162)) + (pointF.x * tan);
                        float f182 = ((sin * f172) / ((sin * tan) + cos)) + f162;
                        pointF3.x = f182;
                        float f192 = f142 - (f172 / ((tan * tan) + 1.0f));
                        pointF3.y = f192;
                        pointF2.x = (pointF4.x * 2.0f) - f182;
                        pointF2.y = (pointF4.y * 2.0f) - f192;
                    }
                    if (Build.VERSION.SDK_INT < 28 && this.LJLL) {
                        TraceEvent.LIZIZ("createBitmapShader");
                        LJIIIZ(pointF2, pointF3, this.LJLJJLL, this.LJLJL, (float) this.LJLJLJ);
                        TraceEvent.LJ("createBitmapShader");
                    } else {
                        this.LJLILLLLZI = new LinearGradient(pointF2.x, pointF2.y, pointF3.x, pointF3.y, this.LJLJJLL, this.LJLJL, Shader.TileMode.CLAMP);
                    }
                } catch (Exception e) {
                    this.LJLILLLLZI = null;
                    this.LJLJJL.setColor(this.LJLJJLL[0]);
                    C16880lQ.LLLLIIL(e);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("exception:\n");
                    LIZ.append(e);
                    LLog.LIZLLL(3, "BackgroundLinearGradientLayer", X1D.LIZIZ(LIZ));
                }
            }
        }
        super.setBounds(rect);
    }

    public static void LJIIJ(int[] iArr, float[] fArr, int i, int[] iArr2) {
        VRR vrr = new VRR();
        vrr.LIZ(iArr[0]);
        VRR vrr2 = new VRR();
        int i2 = 1;
        vrr2.LIZ(iArr[1]);
        float f = fArr[0];
        float f2 = fArr[1] - f;
        for (int i3 = 0; i3 < i; i3++) {
            float f3 = i3 / (i - 1.0f);
            float f4 = fArr[i2];
            if (f3 > f4) {
                vrr.LIZLLL = vrr2.LIZLLL;
                vrr.LIZ = vrr2.LIZ;
                vrr.LIZIZ = vrr2.LIZIZ;
                vrr.LIZJ = vrr2.LIZJ;
                i2++;
                vrr2.LIZ(iArr[i2]);
                f2 = fArr[i2] - f4;
                f = f4;
            }
            float f5 = (f3 - f) / f2;
            float f6 = 1.0f - f5;
            iArr2[i3] = (((int) C1I1.LIZ(vrr2.LIZLLL, f5, vrr.LIZLLL * f6, 255.0f)) << 24) | (((int) C1I1.LIZ(vrr2.LIZ, f5, vrr.LIZ * f6, 255.0f)) << 16) | (((int) C1I1.LIZ(vrr2.LIZIZ, f5, vrr.LIZIZ * f6, 255.0f)) << 8) | ((int) C1I1.LIZ(vrr2.LIZJ, f5, vrr.LIZJ * f6, 255.0f));
        }
    }

    public final void LJIIIZ(PointF pointF, PointF pointF2, int[] iArr, float[] fArr, float f) {
        int i;
        int i2;
        float[] fArr2 = fArr;
        int length = (int) PointF.length(pointF2.x - pointF.x, pointF2.y - pointF.y);
        if (length <= 0) {
            this.LJLILLLLZI = null;
            return;
        }
        int[] iArr2 = new int[length];
        if (fArr2 == null) {
            fArr2 = new float[iArr.length];
            if (iArr.length == 2) {
                fArr2[0] = 0.0f;
                fArr2[1] = 1.0f;
            } else if (iArr.length > 2) {
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    fArr2[i3] = i3 / (iArr.length - 1);
                }
            }
        }
        if (fArr2[0] != 0.0f) {
            i = 1;
        } else {
            i = 0;
        }
        if (fArr2[fArr2.length - 1] != 1.0f) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int length2 = fArr2.length + i + i2;
        if (length2 != fArr2.length) {
            int[] iArr3 = new int[length2];
            float[] fArr3 = new float[length2];
            if (i != 0) {
                iArr3[0] = iArr[0];
                fArr3[0] = 0.0f;
            }
            System.arraycopy(iArr, 0, iArr3, i, iArr.length);
            System.arraycopy(fArr2, 0, fArr3, i, fArr2.length);
            if (i2 != 0) {
                int i4 = length2 - 1;
                iArr3[i4] = iArr[iArr.length - 1];
                fArr3[i4] = 1.0f;
            }
            LJIIJ(iArr3, fArr3, length, iArr2);
        } else {
            LJIIJ(iArr, fArr2, length, iArr2);
        }
        this.LJLILLLLZI = new BitmapShader(Bitmap.createBitmap(iArr2, length, 1, Bitmap.Config.ARGB_8888), Shader.TileMode.CLAMP, Shader.TileMode.REPEAT);
        Matrix matrix = new Matrix();
        matrix.postRotate(f + 270.0f);
        matrix.postTranslate(pointF.x, pointF.y);
        this.LJLILLLLZI.setLocalMatrix(matrix);
    }
}
