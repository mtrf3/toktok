package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.base.LLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: X.YbN, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87697YbN {
    public final Canvas LIZ;
    public final float LIZIZ;
    public final C79483VHj LIZJ;
    public C87698YbO LIZLLL;
    public YLD LJ;
    public Stack<YLD> LJFF;
    public Stack<InterfaceC87720Ybk> LJI;
    public Stack<Matrix> LJII;

    public final boolean LJIIIIZZ() {
        Boolean bool = this.LJ.LIZ.LJLZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Path.FillType LJIILLIIL() {
        VIN vin = this.LJ.LIZ.LLD;
        if (vin != null && vin == VIN.EvenOdd) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    public final boolean LJJI() {
        int i = 0;
        if (this.LJ.LIZ.LJLLJ.floatValue() >= 1.0f) {
            return false;
        }
        Canvas canvas = this.LIZ;
        int floatValue = (int) (this.LJ.LIZ.LJLLJ.floatValue() * 256.0f);
        if (floatValue >= 0) {
            i = 255;
            if (floatValue <= 255) {
                i = floatValue;
            }
        }
        canvas.saveLayerAlpha(null, i, 31);
        this.LJFF.push(this.LJ);
        this.LJ = new YLD(this.LJ);
        return true;
    }

    public final void LJJIJ() {
        this.LIZ.restore();
        this.LJ = this.LJFF.pop();
    }

    public final void LJJIJIIJI() {
        this.LIZ.save();
        this.LJFF.push(this.LJ);
        this.LJ = new YLD(this.LJ);
    }

    public final void LJJIJLIJ() {
        int i;
        C87699YbP c87699YbP = this.LJ.LIZ;
        AbstractC87636YaO abstractC87636YaO = c87699YbP.LLFFF;
        if (abstractC87636YaO instanceof C87637YaP) {
            i = ((C87637YaP) abstractC87636YaO).LJLIL;
        } else if (!(abstractC87636YaO instanceof C87638YaQ)) {
            return;
        } else {
            i = c87699YbP.LJLLL.LJLIL;
        }
        Float f = c87699YbP.LLFII;
        if (f != null) {
            i = LJFF(f.floatValue(), i);
        }
        this.LIZ.drawColor(i);
    }

    public final boolean LJJIL() {
        Boolean bool = this.LJ.LIZ.LJZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static VU6 LIZIZ(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new VU6(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public static Path LJIJJ(C87719Ybj c87719Ybj) {
        Path path = new Path();
        float[] fArr = c87719Ybj.LJIIIIZZ;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = c87719Ybj.LJIIIIZZ;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (c87719Ybj instanceof C87727Ybr) {
            path.close();
        }
        if (c87719Ybj.LJI == null) {
            c87719Ybj.LJI = LIZIZ(path);
        }
        return path;
    }

    public final void LJ(AbstractC87722Ybm abstractC87722Ybm) {
        AbstractC87636YaO abstractC87636YaO = this.LJ.LIZ.LJLILLLLZI;
        if (abstractC87636YaO instanceof C87635YaN) {
            LJII(true, abstractC87722Ybm.LJI, (C87635YaN) abstractC87636YaO);
        }
        AbstractC87636YaO abstractC87636YaO2 = this.LJ.LIZ.LJLJJL;
        if (abstractC87636YaO2 instanceof C87635YaN) {
            LJII(false, abstractC87722Ybm.LJI, (C87635YaN) abstractC87636YaO2);
        }
    }

    public final void LJIIJ(Path path) {
        YLD yld = this.LJ;
        if (yld.LIZ.LLFZ == VIO.NonScalingStroke) {
            Matrix matrix = this.LIZ.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.LIZ.setMatrix(new Matrix());
            Shader shader = this.LJ.LJ.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.LIZ.drawPath(path2, this.LJ.LJ);
            this.LIZ.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.LIZ.drawPath(path, yld.LJ);
    }

    public final Path LJIJ(C87711Ybb c87711Ybb) {
        float f;
        C87650Yac c87650Yac = c87711Ybb.LJIIIIZZ;
        float f2 = 0.0f;
        if (c87650Yac != null) {
            f = c87650Yac.LIZLLL(this);
        } else {
            f = 0.0f;
        }
        C87650Yac c87650Yac2 = c87711Ybb.LJIIIZ;
        if (c87650Yac2 != null) {
            f2 = c87650Yac2.LJ(this);
        }
        float LIZIZ = c87711Ybb.LJIIJ.LIZIZ(this);
        float f3 = f - LIZIZ;
        float f4 = f2 - LIZIZ;
        float f5 = f + LIZIZ;
        float f6 = f2 + LIZIZ;
        if (c87711Ybb.LJI == null) {
            float f7 = 2.0f * LIZIZ;
            c87711Ybb.LJI = new VU6(f3, f4, f7, f7);
        }
        float f8 = 0.5522848f * LIZIZ;
        Path path = new Path();
        path.moveTo(f5, f2);
        float f9 = f2 + f8;
        float f10 = f + f8;
        path.cubicTo(f5, f9, f10, f6, f, f6);
        float f11 = f - f8;
        path.cubicTo(f11, f6, f3, f9, f3, f2);
        float f12 = f2 - f8;
        path.cubicTo(f3, f12, f11, f4, f, f4);
        path.cubicTo(f10, f4, f5, f12, f5, f2);
        path.close();
        return path;
    }

    public final Path LJIJI(C87712Ybc c87712Ybc) {
        float f;
        C87650Yac c87650Yac = c87712Ybc.LJIIIIZZ;
        float f2 = 0.0f;
        if (c87650Yac != null) {
            f = c87650Yac.LIZLLL(this);
        } else {
            f = 0.0f;
        }
        C87650Yac c87650Yac2 = c87712Ybc.LJIIIZ;
        if (c87650Yac2 != null) {
            f2 = c87650Yac2.LJ(this);
        }
        float LIZLLL = c87712Ybc.LJIIJ.LIZLLL(this);
        float LJ = c87712Ybc.LJIIJJI.LJ(this);
        float f3 = f - LIZLLL;
        float f4 = f2 - LJ;
        float f5 = f + LIZLLL;
        float f6 = f2 + LJ;
        if (c87712Ybc.LJI == null) {
            c87712Ybc.LJI = new VU6(f3, f4, LIZLLL * 2.0f, 2.0f * LJ);
        }
        float f7 = LIZLLL * 0.5522848f;
        float f8 = 0.5522848f * LJ;
        Path path = new Path();
        path.moveTo(f, f4);
        float f9 = f + f7;
        float f10 = f2 - f8;
        path.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f8 + f2;
        path.cubicTo(f5, f11, f9, f6, f, f6);
        float f12 = f - f7;
        path.cubicTo(f12, f6, f3, f11, f3, f2);
        path.cubicTo(f3, f10, f12, f4, f, f4);
        path.close();
        return path;
    }

    public final Path LJIJJLI(C87704YbU c87704YbU) {
        float LIZLLL;
        float LJ;
        float f;
        float f2;
        C87650Yac c87650Yac = c87704YbU.LJIIL;
        if (c87650Yac == null) {
            if (c87704YbU.LJIILIIL == null) {
                LIZLLL = 0.0f;
                LJ = 0.0f;
            } else {
                LIZLLL = c87704YbU.LJIILIIL.LJ(this);
                LJ = LIZLLL;
            }
        } else if (c87704YbU.LJIILIIL == null) {
            LIZLLL = c87650Yac.LIZLLL(this);
            LJ = LIZLLL;
        } else {
            LIZLLL = c87650Yac.LIZLLL(this);
            LJ = c87704YbU.LJIILIIL.LJ(this);
        }
        float min = Math.min(LIZLLL, c87704YbU.LJIIJ.LIZLLL(this) / 2.0f);
        float min2 = Math.min(LJ, c87704YbU.LJIIJJI.LJ(this) / 2.0f);
        C87650Yac c87650Yac2 = c87704YbU.LJIIIIZZ;
        if (c87650Yac2 != null) {
            f = c87650Yac2.LIZLLL(this);
        } else {
            f = 0.0f;
        }
        C87650Yac c87650Yac3 = c87704YbU.LJIIIZ;
        if (c87650Yac3 != null) {
            f2 = c87650Yac3.LJ(this);
        } else {
            f2 = 0.0f;
        }
        float LIZLLL2 = c87704YbU.LJIIJ.LIZLLL(this);
        float LJ2 = c87704YbU.LJIIJJI.LJ(this);
        if (c87704YbU.LJI == null) {
            c87704YbU.LJI = new VU6(f, f2, LIZLLL2, LJ2);
        }
        float f3 = f + LIZLLL2;
        float f4 = f2 + LJ2;
        Path path = new Path();
        if (min == 0.0f || min2 == 0.0f) {
            path.addRect(f, f2, f3, f4, Path.Direction.CW);
            return path;
        }
        float f5 = min * 0.5522848f;
        float f6 = 0.5522848f * min2;
        float f7 = f2 + min2;
        path.moveTo(f, f7);
        float f8 = f7 - f6;
        float f9 = f + min;
        float f10 = f9 - f5;
        path.cubicTo(f, f8, f10, f2, f9, f2);
        float f11 = f3 - min;
        path.lineTo(f11, f2);
        float f12 = f11 + f5;
        path.cubicTo(f12, f2, f3, f8, f3, f7);
        float f13 = f4 - min2;
        path.lineTo(f3, f13);
        float f14 = f13 + f6;
        path.cubicTo(f3, f14, f12, f4, f11, f4);
        path.lineTo(f9, f4);
        path.cubicTo(f10, f4, f, f14, f, f13);
        path.lineTo(f, f7);
        path.close();
        return path;
    }

    public final void LJJII(C87721Ybl c87721Ybl) {
        Boolean bool;
        Path.FillType fillType;
        float LIZLLL;
        float LJ;
        float LIZLLL2;
        Path.FillType fillType2;
        C87650Yac c87650Yac;
        String str;
        int indexOf;
        C87650Yac c87650Yac2;
        float f;
        if (c87721Ybl instanceof InterfaceC87729Ybt) {
            return;
        }
        LJJIJIIJI();
        if ((c87721Ybl instanceof AbstractC87705YbV) && (bool = ((AbstractC87705YbV) c87721Ybl).LIZLLL) != null) {
            YLD yld = this.LJ;
            bool.booleanValue();
            yld.getClass();
        }
        if (c87721Ybl instanceof C87714Ybe) {
            C87714Ybe c87714Ybe = (C87714Ybe) c87721Ybl;
            LJJIFFI(c87714Ybe, LJIL(c87714Ybe.LJIIJ, c87714Ybe.LJIIJJI, c87714Ybe.LJIIL, c87714Ybe.LJIILIIL), c87714Ybe.LJIIIZ, c87714Ybe.LJIIIIZZ);
        } else {
            float f2 = 0.0f;
            Bitmap bitmap = null;
            if (c87721Ybl instanceof C87709YbZ) {
                C87709YbZ c87709YbZ = (C87709YbZ) c87721Ybl;
                LJI("Use render", new Object[0]);
                C87650Yac c87650Yac3 = c87709YbZ.LJIIL;
                if ((c87650Yac3 == null || !c87650Yac3.LJI()) && ((c87650Yac2 = c87709YbZ.LJIILIIL) == null || !c87650Yac2.LJI())) {
                    LJJIJL(this.LJ, c87709YbZ);
                    if (LJIIIIZZ()) {
                        C87721Ybl LJFF = c87709YbZ.LIZ.LJFF(c87709YbZ.LJIIIZ);
                        if (LJFF == null) {
                            LJIIJJI("Use reference '%s' not found", c87709YbZ.LJIIIZ);
                        } else {
                            Matrix matrix = c87709YbZ.LJIIIIZZ;
                            if (matrix != null) {
                                this.LIZ.concat(matrix);
                            }
                            C87650Yac c87650Yac4 = c87709YbZ.LJIIJ;
                            if (c87650Yac4 != null) {
                                f = c87650Yac4.LIZLLL(this);
                            } else {
                                f = 0.0f;
                            }
                            C87650Yac c87650Yac5 = c87709YbZ.LJIIJJI;
                            if (c87650Yac5 != null) {
                                f2 = c87650Yac5.LJ(this);
                            }
                            this.LIZ.translate(f, f2);
                            LIZLLL(c87709YbZ, c87709YbZ.LJI);
                            boolean LJJI = LJJI();
                            this.LJI.push(c87709YbZ);
                            this.LJII.push(this.LIZ.getMatrix());
                            if (LJFF instanceof C87714Ybe) {
                                C87714Ybe c87714Ybe2 = (C87714Ybe) LJFF;
                                VU6 LJIL = LJIL(null, null, c87709YbZ.LJIIL, c87709YbZ.LJIILIIL);
                                LJJIJIIJI();
                                LJJIFFI(c87714Ybe2, LJIL, c87714Ybe2.LJIIIZ, c87714Ybe2.LJIIIIZZ);
                                LJJIJ();
                            } else {
                                LJJII(LJFF);
                            }
                            this.LJI.pop();
                            this.LJII.pop();
                            if (LJJI) {
                                LJJIJ();
                            }
                            LJJIJIIJIL(c87709YbZ);
                        }
                    }
                }
            } else if (c87721Ybl instanceof C87715Ybf) {
                C87715Ybf c87715Ybf = (C87715Ybf) c87721Ybl;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(c87715Ybf.LIZLLL());
                LIZ.append(" render");
                LJI(X1D.LIZIZ(LIZ), new Object[0]);
                LJJIJL(this.LJ, c87715Ybf);
                if (LJIIIIZZ()) {
                    Matrix matrix2 = c87715Ybf.LJIIIIZZ;
                    if (matrix2 != null) {
                        this.LIZ.concat(matrix2);
                    }
                    LIZLLL(c87715Ybf, c87715Ybf.LJI);
                    boolean LJJI2 = LJJI();
                    LJJIII(c87715Ybf);
                    if (LJJI2) {
                        LJJIJ();
                    }
                    LJJIJIIJIL(c87715Ybf);
                }
            } else if (c87721Ybl instanceof C87702YbS) {
                C87702YbS c87702YbS = (C87702YbS) c87721Ybl;
                LJI("Image render", new Object[0]);
                C87650Yac c87650Yac6 = c87702YbS.LJIIL;
                if (c87650Yac6 != null && !c87650Yac6.LJI() && (c87650Yac = c87702YbS.LJIILIIL) != null && !c87650Yac.LJI() && (str = c87702YbS.LJIIIZ) != null) {
                    YZD yzd = c87702YbS.LJIIIIZZ;
                    if (yzd == null) {
                        yzd = YZD.LIZLLL;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                        try {
                            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                            bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                        } catch (Exception unused) {
                        }
                        if (bitmap != null) {
                            LJJIIJZLJL(c87702YbS, yzd, bitmap);
                        }
                    }
                    C79483VHj c79483VHj = this.LIZJ;
                    String str2 = c87702YbS.LJIIIZ;
                    YZP yzp = new YZP(this, c87702YbS, yzd);
                    if (c79483VHj.LIZJ.containsKey(str2)) {
                        LLog.LIZLLL(1, "UISVG", "requestBitmapSync got from bitmap cache ");
                        LJJIIJZLJL(c87702YbS, yzd, c79483VHj.LIZJ.get(str2));
                    } else {
                        W5P LIZLLL3 = W5P.LIZLLL(UriProtector.parse(VA1.LIZ(c79483VHj.LIZIZ, str2, false)));
                        V9E.LIZIZ(LIZLLL3, Bitmap.Config.ARGB_8888);
                        W4W<C81392Vwy<W5A>> LJ2 = W5I.LIZ().LJ(LIZLLL3.LIZ(), "lynx_SvgResourceManager");
                        ((AbstractC48384Iyq) LJ2).LJ(new VU4(c79483VHj, LJ2, str2, yzp), FT1.LIZ());
                    }
                }
            } else if (c87721Ybl instanceof C87724Ybo) {
                C87724Ybo c87724Ybo = (C87724Ybo) c87721Ybl;
                LJI("Path render", new Object[0]);
                if (c87724Ybo.LJIIIIZZ != null) {
                    LJJIJL(this.LJ, c87724Ybo);
                    if (LJIIIIZZ() && LJJIL()) {
                        YLD yld2 = this.LJ;
                        if (yld2.LIZJ || yld2.LIZIZ) {
                            Matrix matrix3 = c87724Ybo.LJII;
                            if (matrix3 != null) {
                                this.LIZ.concat(matrix3);
                            }
                            Path path = new C79799VTn(c87724Ybo.LJIIIIZZ).LIZ;
                            if (c87724Ybo.LJI == null) {
                                c87724Ybo.LJI = LIZIZ(path);
                            }
                            LJJIJIIJIL(c87724Ybo);
                            LJ(c87724Ybo);
                            LIZLLL(c87724Ybo, c87724Ybo.LJI);
                            boolean LJJI3 = LJJI();
                            YLD yld3 = this.LJ;
                            if (yld3.LIZIZ) {
                                VIN vin = yld3.LIZ.LJLJI;
                                if (vin != null && vin == VIN.EvenOdd) {
                                    fillType2 = Path.FillType.EVEN_ODD;
                                } else {
                                    fillType2 = Path.FillType.WINDING;
                                }
                                path.setFillType(fillType2);
                                LJIIIZ(c87724Ybo, path);
                            }
                            if (this.LJ.LIZJ) {
                                LJIIJ(path);
                            }
                            if (LJJI3) {
                                LJJIJ();
                            }
                        }
                    }
                }
            } else if (c87721Ybl instanceof C87704YbU) {
                C87704YbU c87704YbU = (C87704YbU) c87721Ybl;
                LJI("Rect render", new Object[0]);
                C87650Yac c87650Yac7 = c87704YbU.LJIIJ;
                if (c87650Yac7 != null && c87704YbU.LJIIJJI != null && !c87650Yac7.LJI() && !c87704YbU.LJIIJJI.LJI()) {
                    LJJIJL(this.LJ, c87704YbU);
                    if (LJIIIIZZ() && LJJIL()) {
                        Matrix matrix4 = c87704YbU.LJII;
                        if (matrix4 != null) {
                            this.LIZ.concat(matrix4);
                        }
                        Path LJIJJLI = LJIJJLI(c87704YbU);
                        LJJIJIIJIL(c87704YbU);
                        LJ(c87704YbU);
                        LIZLLL(c87704YbU, c87704YbU.LJI);
                        boolean LJJI4 = LJJI();
                        if (this.LJ.LIZIZ) {
                            LJIIIZ(c87704YbU, LJIJJLI);
                        }
                        if (this.LJ.LIZJ) {
                            LJIIJ(LJIJJLI);
                        }
                        if (LJJI4) {
                            LJJIJ();
                        }
                    }
                }
            } else if (c87721Ybl instanceof C87711Ybb) {
                C87711Ybb c87711Ybb = (C87711Ybb) c87721Ybl;
                LJI("Circle render", new Object[0]);
                C87650Yac c87650Yac8 = c87711Ybb.LJIIJ;
                if (c87650Yac8 != null && !c87650Yac8.LJI()) {
                    LJJIJL(this.LJ, c87711Ybb);
                    if (LJIIIIZZ() && LJJIL()) {
                        Matrix matrix5 = c87711Ybb.LJII;
                        if (matrix5 != null) {
                            this.LIZ.concat(matrix5);
                        }
                        Path LJIJ = LJIJ(c87711Ybb);
                        LJJIJIIJIL(c87711Ybb);
                        LJ(c87711Ybb);
                        LIZLLL(c87711Ybb, c87711Ybb.LJI);
                        boolean LJJI5 = LJJI();
                        if (this.LJ.LIZIZ) {
                            LJIIIZ(c87711Ybb, LJIJ);
                        }
                        if (this.LJ.LIZJ) {
                            LJIIJ(LJIJ);
                        }
                        if (LJJI5) {
                            LJJIJ();
                        }
                    }
                }
            } else if (c87721Ybl instanceof C87712Ybc) {
                C87712Ybc c87712Ybc = (C87712Ybc) c87721Ybl;
                LJI("Ellipse render", new Object[0]);
                C87650Yac c87650Yac9 = c87712Ybc.LJIIJ;
                if (c87650Yac9 != null && c87712Ybc.LJIIJJI != null && !c87650Yac9.LJI() && !c87712Ybc.LJIIJJI.LJI()) {
                    LJJIJL(this.LJ, c87712Ybc);
                    if (LJIIIIZZ() && LJJIL()) {
                        Matrix matrix6 = c87712Ybc.LJII;
                        if (matrix6 != null) {
                            this.LIZ.concat(matrix6);
                        }
                        Path LJIJI = LJIJI(c87712Ybc);
                        LJJIJIIJIL(c87712Ybc);
                        LJ(c87712Ybc);
                        LIZLLL(c87712Ybc, c87712Ybc.LJI);
                        boolean LJJI6 = LJJI();
                        if (this.LJ.LIZIZ) {
                            LJIIIZ(c87712Ybc, LJIJI);
                        }
                        if (this.LJ.LIZJ) {
                            LJIIJ(LJIJI);
                        }
                        if (LJJI6) {
                            LJJIJ();
                        }
                    }
                }
            } else if (c87721Ybl instanceof C87713Ybd) {
                C87713Ybd c87713Ybd = (C87713Ybd) c87721Ybl;
                LJI("Line render", new Object[0]);
                LJJIJL(this.LJ, c87713Ybd);
                if (LJIIIIZZ() && LJJIL() && this.LJ.LIZJ) {
                    Matrix matrix7 = c87713Ybd.LJII;
                    if (matrix7 != null) {
                        this.LIZ.concat(matrix7);
                    }
                    C87650Yac c87650Yac10 = c87713Ybd.LJIIIIZZ;
                    if (c87650Yac10 == null) {
                        LIZLLL = 0.0f;
                    } else {
                        LIZLLL = c87650Yac10.LIZLLL(this);
                    }
                    C87650Yac c87650Yac11 = c87713Ybd.LJIIIZ;
                    if (c87650Yac11 == null) {
                        LJ = 0.0f;
                    } else {
                        LJ = c87650Yac11.LJ(this);
                    }
                    C87650Yac c87650Yac12 = c87713Ybd.LJIIJ;
                    if (c87650Yac12 == null) {
                        LIZLLL2 = 0.0f;
                    } else {
                        LIZLLL2 = c87650Yac12.LIZLLL(this);
                    }
                    C87650Yac c87650Yac13 = c87713Ybd.LJIIJJI;
                    if (c87650Yac13 != null) {
                        f2 = c87650Yac13.LJ(this);
                    }
                    if (c87713Ybd.LJI == null) {
                        c87713Ybd.LJI = new VU6(Math.min(LIZLLL, LIZLLL2), Math.min(LJ, f2), Math.abs(LIZLLL2 - LIZLLL), Math.abs(f2 - LJ));
                    }
                    Path path2 = new Path();
                    path2.moveTo(LIZLLL, LJ);
                    path2.lineTo(LIZLLL2, f2);
                    LJJIJIIJIL(c87713Ybd);
                    LJ(c87713Ybd);
                    LIZLLL(c87713Ybd, c87713Ybd.LJI);
                    boolean LJJI7 = LJJI();
                    LJIIJ(path2);
                    if (LJJI7) {
                        LJJIJ();
                    }
                }
            } else if (c87721Ybl instanceof C87727Ybr) {
                C87719Ybj c87719Ybj = (C87719Ybj) c87721Ybl;
                LJI("Polygon render", new Object[0]);
                LJJIJL(this.LJ, c87719Ybj);
                if (LJIIIIZZ() && LJJIL()) {
                    YLD yld4 = this.LJ;
                    if (yld4.LIZJ || yld4.LIZIZ) {
                        Matrix matrix8 = c87719Ybj.LJII;
                        if (matrix8 != null) {
                            this.LIZ.concat(matrix8);
                        }
                        if (c87719Ybj.LJIIIIZZ.length >= 2) {
                            Path LJIJJ = LJIJJ(c87719Ybj);
                            LJJIJIIJIL(c87719Ybj);
                            LJ(c87719Ybj);
                            LIZLLL(c87719Ybj, c87719Ybj.LJI);
                            boolean LJJI8 = LJJI();
                            if (this.LJ.LIZIZ) {
                                LJIIIZ(c87719Ybj, LJIJJ);
                            }
                            if (this.LJ.LIZJ) {
                                LJIIJ(LJIJJ);
                            }
                            if (LJJI8) {
                                LJJIJ();
                            }
                        }
                    }
                }
            } else if (c87721Ybl instanceof C87719Ybj) {
                C87719Ybj c87719Ybj2 = (C87719Ybj) c87721Ybl;
                LJI("PolyLine render", new Object[0]);
                LJJIJL(this.LJ, c87719Ybj2);
                if (LJIIIIZZ() && LJJIL()) {
                    YLD yld5 = this.LJ;
                    if (yld5.LIZJ || yld5.LIZIZ) {
                        Matrix matrix9 = c87719Ybj2.LJII;
                        if (matrix9 != null) {
                            this.LIZ.concat(matrix9);
                        }
                        if (c87719Ybj2.LJIIIIZZ.length >= 2) {
                            Path LJIJJ2 = LJIJJ(c87719Ybj2);
                            LJJIJIIJIL(c87719Ybj2);
                            VIN vin2 = this.LJ.LIZ.LJLJI;
                            if (vin2 != null && vin2 == VIN.EvenOdd) {
                                fillType = Path.FillType.EVEN_ODD;
                            } else {
                                fillType = Path.FillType.WINDING;
                            }
                            LJIJJ2.setFillType(fillType);
                            LJ(c87719Ybj2);
                            LIZLLL(c87719Ybj2, c87719Ybj2.LJI);
                            boolean LJJI9 = LJJI();
                            if (this.LJ.LIZIZ) {
                                LJIIIZ(c87719Ybj2, LJIJJ2);
                            }
                            if (this.LJ.LIZJ) {
                                LJIIJ(LJIJJ2);
                            }
                            if (LJJI9) {
                                LJJIJ();
                            }
                        }
                    }
                }
            }
        }
        LJJIJ();
    }

    public final void LJJIII(InterfaceC87720Ybk interfaceC87720Ybk) {
        this.LJI.push(interfaceC87720Ybk);
        this.LJII.push(this.LIZ.getMatrix());
        Iterator<C87721Ybl> it = interfaceC87720Ybk.LIZ().iterator();
        while (it.hasNext()) {
            LJJII(it.next());
        }
        this.LJI.pop();
        this.LJII.pop();
    }

    public final void LJJIJIIJIL(AbstractC87722Ybm abstractC87722Ybm) {
        if (abstractC87722Ybm.LIZIZ == null || abstractC87722Ybm.LJI == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.LJII.peek().invert(matrix)) {
            VU6 vu6 = abstractC87722Ybm.LJI;
            float f = vu6.LIZ;
            float f2 = vu6.LIZIZ;
            float f3 = vu6.LIZJ + f;
            int i = 2;
            float f4 = f2 + vu6.LIZLLL;
            float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
            matrix.preConcat(this.LIZ.getMatrix());
            matrix.mapPoints(fArr);
            float f5 = fArr[0];
            float f6 = fArr[1];
            RectF rectF = new RectF(f5, f6, f5, f6);
            do {
                float f7 = fArr[i];
                if (f7 < rectF.left) {
                    rectF.left = f7;
                }
                if (f7 > rectF.right) {
                    rectF.right = f7;
                }
                float f8 = fArr[i + 1];
                if (f8 < rectF.top) {
                    rectF.top = f8;
                }
                if (f8 > rectF.bottom) {
                    rectF.bottom = f8;
                }
                i += 2;
            } while (i <= 6);
            AbstractC87722Ybm abstractC87722Ybm2 = (AbstractC87722Ybm) this.LJI.peek();
            VU6 vu62 = abstractC87722Ybm2.LJI;
            if (vu62 == null) {
                float f9 = rectF.left;
                float f10 = rectF.top;
                abstractC87722Ybm2.LJI = new VU6(f9, f10, rectF.right - f9, rectF.bottom - f10);
                return;
            }
            float f11 = rectF.left;
            float f12 = rectF.top;
            VU6 vu63 = new VU6(f11, f12, rectF.right - f11, rectF.bottom - f12);
            float f13 = vu63.LIZ;
            if (f13 < vu62.LIZ) {
                vu62.LIZ = f13;
            }
            float f14 = vu63.LIZIZ;
            if (f14 < vu62.LIZIZ) {
                vu62.LIZIZ = f14;
            }
            float f15 = vu63.LIZ + vu63.LIZJ;
            float f16 = vu62.LIZ;
            if (f15 > vu62.LIZJ + f16) {
                vu62.LIZJ = f15 - f16;
            }
            float f17 = vu63.LIZIZ + vu63.LIZLLL;
            float f18 = vu62.LIZIZ;
            if (f17 <= vu62.LIZLLL + f18) {
                return;
            }
            vu62.LIZLLL = f17 - f18;
        }
    }

    public static int LJFF(float f, int i) {
        int i2 = 255;
        int round = Math.round(((i >> 24) & 255) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i2 << 24) | (i & 16777215);
    }

    public static void LJI(String str, Object... objArr) {
        LLog.LIZLLL(1, "SVGAndroidRenderer", C16880lQ.LLLZ(str, objArr));
    }

    public static void LJIIJJI(String str, Object... objArr) {
        LLog.LIZLLL(4, "SVGAndroidRenderer", C16880lQ.LLLZ(str, objArr));
    }

    public static void LJIIL(AbstractC87700YbQ abstractC87700YbQ, String str) {
        AbstractC87705YbV LJFF = abstractC87700YbQ.LIZ.LJFF(str);
        if (LJFF == null) {
            LLog.LIZLLL(3, "SVGAndroidRenderer", C16880lQ.LLLZ("Gradient reference '%s' not found", new Object[]{str}));
            return;
        }
        if (!(LJFF instanceof AbstractC87700YbQ)) {
            LJIIJJI("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (LJFF == abstractC87700YbQ) {
            LJIIJJI("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        AbstractC87700YbQ abstractC87700YbQ2 = (AbstractC87700YbQ) LJFF;
        if (abstractC87700YbQ.LJII == null) {
            abstractC87700YbQ.LJII = abstractC87700YbQ2.LJII;
        }
        if (abstractC87700YbQ.LJIIIIZZ == null) {
            abstractC87700YbQ.LJIIIIZZ = abstractC87700YbQ2.LJIIIIZZ;
        }
        if (abstractC87700YbQ.LJIIIZ == null) {
            abstractC87700YbQ.LJIIIZ = abstractC87700YbQ2.LJIIIZ;
        }
        if (abstractC87700YbQ.LJI.isEmpty()) {
            abstractC87700YbQ.LJI = abstractC87700YbQ2.LJI;
        }
        try {
            if (abstractC87700YbQ instanceof C87710Yba) {
                C87710Yba c87710Yba = (C87710Yba) abstractC87700YbQ;
                C87710Yba c87710Yba2 = (C87710Yba) LJFF;
                if (c87710Yba.LJIIJJI == null) {
                    c87710Yba.LJIIJJI = c87710Yba2.LJIIJJI;
                }
                if (c87710Yba.LJIIL == null) {
                    c87710Yba.LJIIL = c87710Yba2.LJIIL;
                }
                if (c87710Yba.LJIILIIL == null) {
                    c87710Yba.LJIILIIL = c87710Yba2.LJIILIIL;
                }
                if (c87710Yba.LJIILJJIL == null) {
                    c87710Yba.LJIILJJIL = c87710Yba2.LJIILJJIL;
                }
            } else {
                LJIILIIL((C87708YbY) abstractC87700YbQ, (C87708YbY) LJFF);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC87700YbQ2.LJIIJ;
        if (str2 != null) {
            LJIIL(abstractC87700YbQ, str2);
        }
    }

    public static void LJIILIIL(C87708YbY c87708YbY, C87708YbY c87708YbY2) {
        if (c87708YbY.LJIIJJI == null) {
            c87708YbY.LJIIJJI = c87708YbY2.LJIIJJI;
        }
        if (c87708YbY.LJIIL == null) {
            c87708YbY.LJIIL = c87708YbY2.LJIIL;
        }
        if (c87708YbY.LJIILIIL == null) {
            c87708YbY.LJIILIIL = c87708YbY2.LJIILIIL;
        }
        if (c87708YbY.LJIILJJIL == null) {
            c87708YbY.LJIILJJIL = c87708YbY2.LJIILJJIL;
        }
        if (c87708YbY.LJIILL == null) {
            c87708YbY.LJIILL = c87708YbY2.LJIILL;
        }
    }

    public static void LJIILJJIL(C87701YbR c87701YbR, String str) {
        AbstractC87705YbV LJFF = c87701YbR.LIZ.LJFF(str);
        if (LJFF == null) {
            LLog.LIZLLL(3, "SVGAndroidRenderer", C16880lQ.LLLZ("Pattern reference '%s' not found", new Object[]{str}));
            return;
        }
        if (!(LJFF instanceof C87701YbR)) {
            LJIIJJI("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (LJFF == c87701YbR) {
            LJIIJJI("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        C87701YbR c87701YbR2 = (C87701YbR) LJFF;
        if (c87701YbR.LJIIJ == null) {
            c87701YbR.LJIIJ = c87701YbR2.LJIIJ;
        }
        if (c87701YbR.LJIIJJI == null) {
            c87701YbR.LJIIJJI = c87701YbR2.LJIIJJI;
        }
        if (c87701YbR.LJIIL == null) {
            c87701YbR.LJIIL = c87701YbR2.LJIIL;
        }
        if (c87701YbR.LJIILIIL == null) {
            c87701YbR.LJIILIIL = c87701YbR2.LJIILIIL;
        }
        if (c87701YbR.LJIILJJIL == null) {
            c87701YbR.LJIILJJIL = c87701YbR2.LJIILJJIL;
        }
        if (c87701YbR.LJIILL == null) {
            c87701YbR.LJIILL = c87701YbR2.LJIILL;
        }
        if (c87701YbR.LJIILLIIL == null) {
            c87701YbR.LJIILLIIL = c87701YbR2.LJIILLIIL;
        }
        if (c87701YbR.LJII.isEmpty()) {
            c87701YbR.LJII = c87701YbR2.LJII;
        }
        if (c87701YbR.LJIIIZ == null) {
            c87701YbR.LJIIIZ = c87701YbR2.LJIIIZ;
        }
        if (c87701YbR.LJIIIIZZ == null) {
            c87701YbR.LJIIIIZZ = c87701YbR2.LJIIIIZZ;
        }
        String str2 = c87701YbR2.LJIIZILJ;
        if (str2 != null) {
            LJIILJJIL(c87701YbR, str2);
        }
    }

    public static boolean LJIIZILJ(C87699YbP c87699YbP, long j) {
        if ((c87699YbP.LJLIL & j) != 0) {
            return true;
        }
        return false;
    }

    public final Path LIZ(AbstractC87722Ybm abstractC87722Ybm, VU6 vu6) {
        Path LJJ;
        AbstractC87705YbV LJFF = abstractC87722Ybm.LIZ.LJFF(this.LJ.LIZ.LL);
        boolean z = false;
        if (LJFF == null) {
            LJIIJJI("ClipPath reference '%s' not found", this.LJ.LIZ.LL);
            return null;
        }
        C87716Ybg c87716Ybg = (C87716Ybg) LJFF;
        this.LJFF.push(this.LJ);
        YLD yld = new YLD();
        LJJIJIL(yld, C87699YbP.LIZ());
        LJIILL(c87716Ybg, yld);
        this.LJ = yld;
        Boolean bool = c87716Ybg.LJIIIZ;
        if (bool == null || bool.booleanValue()) {
            z = true;
        }
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(vu6.LIZ, vu6.LIZIZ);
            matrix.preScale(vu6.LIZJ, vu6.LIZLLL);
        }
        Matrix matrix2 = c87716Ybg.LJIIIIZZ;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (C87721Ybl c87721Ybl : c87716Ybg.LJII) {
            if ((c87721Ybl instanceof AbstractC87722Ybm) && (LJJ = LJJ((AbstractC87722Ybm) c87721Ybl, true)) != null) {
                path.op(LJJ, Path.Op.UNION);
            }
        }
        if (this.LJ.LIZ.LL != null) {
            if (c87716Ybg.LJI == null) {
                c87716Ybg.LJI = LIZIZ(path);
            }
            Path LIZ = LIZ(c87716Ybg, c87716Ybg.LJI);
            if (LIZ != null) {
                path.op(LIZ, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.LJ = this.LJFF.pop();
        return path;
    }

    public final void LIZLLL(AbstractC87722Ybm abstractC87722Ybm, VU6 vu6) {
        Path LIZ;
        if (this.LJ.LIZ.LL != null && (LIZ = LIZ(abstractC87722Ybm, vu6)) != null) {
            this.LIZ.clipPath(LIZ);
        }
    }

    public final void LJIIIZ(AbstractC87722Ybm abstractC87722Ybm, Path path) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        boolean z2;
        AbstractC87636YaO abstractC87636YaO = this.LJ.LIZ.LJLILLLLZI;
        if (abstractC87636YaO instanceof C87635YaN) {
            AbstractC87705YbV LJFF = this.LIZLLL.LJFF(((C87635YaN) abstractC87636YaO).LJLIL);
            if (LJFF instanceof C87701YbR) {
                C87701YbR c87701YbR = (C87701YbR) LJFF;
                Boolean bool = c87701YbR.LJIIJ;
                if (bool != null && bool.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                String str = c87701YbR.LJIIZILJ;
                if (str != null) {
                    LJIILJJIL(c87701YbR, str);
                }
                if (z) {
                    C87650Yac c87650Yac = c87701YbR.LJIILIIL;
                    if (c87650Yac != null) {
                        f5 = c87650Yac.LIZLLL(this);
                    } else {
                        f5 = 0.0f;
                    }
                    C87650Yac c87650Yac2 = c87701YbR.LJIILJJIL;
                    if (c87650Yac2 != null) {
                        f6 = c87650Yac2.LJ(this);
                    } else {
                        f6 = 0.0f;
                    }
                    C87650Yac c87650Yac3 = c87701YbR.LJIILL;
                    if (c87650Yac3 != null) {
                        f7 = c87650Yac3.LIZLLL(this);
                    } else {
                        f7 = 0.0f;
                    }
                    C87650Yac c87650Yac4 = c87701YbR.LJIILLIIL;
                    if (c87650Yac4 != null) {
                        f8 = c87650Yac4.LJ(this);
                    } else {
                        f8 = 0.0f;
                    }
                } else {
                    C87650Yac c87650Yac5 = c87701YbR.LJIILIIL;
                    if (c87650Yac5 != null) {
                        f = c87650Yac5.LIZJ(this);
                    } else {
                        f = 0.0f;
                    }
                    C87650Yac c87650Yac6 = c87701YbR.LJIILJJIL;
                    if (c87650Yac6 != null) {
                        f2 = c87650Yac6.LIZJ(this);
                    } else {
                        f2 = 0.0f;
                    }
                    C87650Yac c87650Yac7 = c87701YbR.LJIILL;
                    if (c87650Yac7 != null) {
                        f3 = c87650Yac7.LIZJ(this);
                    } else {
                        f3 = 0.0f;
                    }
                    C87650Yac c87650Yac8 = c87701YbR.LJIILLIIL;
                    if (c87650Yac8 != null) {
                        f4 = c87650Yac8.LIZJ(this);
                    } else {
                        f4 = 0.0f;
                    }
                    VU6 vu6 = abstractC87722Ybm.LJI;
                    float f9 = vu6.LIZ;
                    float f10 = vu6.LIZJ;
                    f5 = (f * f10) + f9;
                    float f11 = vu6.LIZIZ;
                    float f12 = vu6.LIZLLL;
                    f6 = (f2 * f12) + f11;
                    f7 = f3 * f10;
                    f8 = f4 * f12;
                }
                if (f7 == 0.0f || f8 == 0.0f) {
                    return;
                }
                YZD yzd = c87701YbR.LJIIIIZZ;
                if (yzd == null) {
                    yzd = YZD.LIZLLL;
                }
                LJJIJIIJI();
                this.LIZ.clipPath(path);
                YLD yld = new YLD();
                LJJIJIL(yld, C87699YbP.LIZ());
                yld.LIZ.LJLLLL = Boolean.FALSE;
                LJIILL(c87701YbR, yld);
                this.LJ = yld;
                VU6 vu62 = abstractC87722Ybm.LJI;
                Matrix matrix = c87701YbR.LJIIL;
                if (matrix != null) {
                    this.LIZ.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (c87701YbR.LJIIL.invert(matrix2)) {
                        VU6 vu63 = abstractC87722Ybm.LJI;
                        float f13 = vu63.LIZ;
                        float f14 = vu63.LIZIZ;
                        float f15 = vu63.LIZJ + f13;
                        float f16 = f14 + vu63.LIZLLL;
                        float[] fArr = {f13, f14, f15, f14, f15, f16, f13, f16};
                        matrix2.mapPoints(fArr);
                        float f17 = fArr[0];
                        float f18 = fArr[1];
                        RectF rectF = new RectF(f17, f18, f17, f18);
                        int i = 2;
                        do {
                            float f19 = fArr[i];
                            if (f19 < rectF.left) {
                                rectF.left = f19;
                            }
                            if (f19 > rectF.right) {
                                rectF.right = f19;
                            }
                            float f20 = fArr[i + 1];
                            if (f20 < rectF.top) {
                                rectF.top = f20;
                            }
                            if (f20 > rectF.bottom) {
                                rectF.bottom = f20;
                            }
                            i += 2;
                        } while (i <= 6);
                        float f21 = rectF.left;
                        float f22 = rectF.top;
                        vu62 = new VU6(f21, f22, rectF.right - f21, rectF.bottom - f22);
                    }
                }
                float floor = (((float) Math.floor((vu62.LIZ - f5) / f7)) * f7) + f5;
                float f23 = vu62.LIZ + vu62.LIZJ;
                float f24 = vu62.LIZIZ + vu62.LIZLLL;
                VU6 vu64 = new VU6(0.0f, 0.0f, f7, f8);
                boolean LJJI = LJJI();
                for (float floor2 = (((float) Math.floor((vu62.LIZIZ - f6) / f8)) * f8) + f6; floor2 < f24; floor2 += f8) {
                    for (float f25 = floor; f25 < f23; f25 += f7) {
                        vu64.LIZ = f25;
                        vu64.LIZIZ = floor2;
                        LJJIJIIJI();
                        if (!this.LJ.LIZ.LJLLLL.booleanValue()) {
                            LJJIIZ(vu64.LIZ, vu64.LIZIZ, vu64.LIZJ, vu64.LIZLLL);
                        }
                        VU6 vu65 = c87701YbR.LJIIIZ;
                        if (vu65 != null) {
                            this.LIZ.concat(LIZJ(vu64, vu65, yzd));
                        } else {
                            Boolean bool2 = c87701YbR.LJIIJJI;
                            if (bool2 == null || bool2.booleanValue()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.LIZ.translate(f25, floor2);
                            if (!z2) {
                                Canvas canvas = this.LIZ;
                                VU6 vu66 = abstractC87722Ybm.LJI;
                                canvas.scale(vu66.LIZJ, vu66.LIZLLL);
                            }
                        }
                        Iterator<C87721Ybl> it = c87701YbR.LJII.iterator();
                        while (it.hasNext()) {
                            LJJII(it.next());
                        }
                        LJJIJ();
                    }
                }
                if (LJJI) {
                    LJJIJ();
                }
                LJJIJ();
                return;
            }
        }
        this.LIZ.drawPath(path, this.LJ.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.Ybl] */
    public final void LJIILL(AbstractC87705YbV abstractC87705YbV, YLD yld) {
        ArrayList arrayList = new ArrayList();
        AbstractC87705YbV abstractC87705YbV2 = abstractC87705YbV;
        while (true) {
            if (abstractC87705YbV2 instanceof AbstractC87705YbV) {
                ListProtector.add(arrayList, 0, abstractC87705YbV2);
            }
            Object obj = abstractC87705YbV2.LIZIZ;
            if (obj == null) {
                break;
            } else {
                abstractC87705YbV2 = (C87721Ybl) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LJJIJL(yld, (AbstractC87705YbV) it.next());
        }
        YLD yld2 = this.LJ;
        yld.LJI = yld2.LJI;
        yld.LJFF = yld2.LJFF;
    }

    public final Path LJJ(AbstractC87722Ybm abstractC87722Ybm, boolean z) {
        Path LJIJJ;
        Path LIZ;
        this.LJFF.push(this.LJ);
        YLD yld = new YLD(this.LJ);
        this.LJ = yld;
        LJJIJL(yld, abstractC87722Ybm);
        if (!LJIIIIZZ() || !LJJIL()) {
            this.LJ = this.LJFF.pop();
            return null;
        }
        if (abstractC87722Ybm instanceof C87709YbZ) {
            if (!z) {
                LJIIJJI("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            C87709YbZ c87709YbZ = (C87709YbZ) abstractC87722Ybm;
            AbstractC87705YbV LJFF = abstractC87722Ybm.LIZ.LJFF(c87709YbZ.LJIIIZ);
            if (LJFF == null) {
                LJIIJJI("Use reference '%s' not found", c87709YbZ.LJIIIZ);
                this.LJ = this.LJFF.pop();
                return null;
            }
            if (!(LJFF instanceof AbstractC87722Ybm)) {
                this.LJ = this.LJFF.pop();
                return null;
            }
            LJIJJ = LJJ((AbstractC87722Ybm) LJFF, false);
            if (LJIJJ == null) {
                return null;
            }
            if (c87709YbZ.LJI == null) {
                c87709YbZ.LJI = LIZIZ(LJIJJ);
            }
            Matrix matrix = c87709YbZ.LJIIIIZZ;
            if (matrix != null) {
                LJIJJ.transform(matrix);
            }
        } else {
            if (abstractC87722Ybm instanceof AbstractC87718Ybi) {
                AbstractC87718Ybi abstractC87718Ybi = (AbstractC87718Ybi) abstractC87722Ybm;
                if (abstractC87722Ybm instanceof C87724Ybo) {
                    LJIJJ = new C79799VTn(((C87724Ybo) abstractC87722Ybm).LJIIIIZZ).LIZ;
                    if (abstractC87722Ybm.LJI == null) {
                        abstractC87722Ybm.LJI = LIZIZ(LJIJJ);
                    }
                } else if (abstractC87722Ybm instanceof C87704YbU) {
                    LJIJJ = LJIJJLI((C87704YbU) abstractC87722Ybm);
                } else if (abstractC87722Ybm instanceof C87711Ybb) {
                    LJIJJ = LJIJ((C87711Ybb) abstractC87722Ybm);
                } else if (abstractC87722Ybm instanceof C87712Ybc) {
                    LJIJJ = LJIJI((C87712Ybc) abstractC87722Ybm);
                } else {
                    if (abstractC87722Ybm instanceof C87719Ybj) {
                        LJIJJ = LJIJJ((C87719Ybj) abstractC87722Ybm);
                    }
                    return null;
                }
                if (LJIJJ != null) {
                    if (abstractC87718Ybi.LJI == null) {
                        abstractC87718Ybi.LJI = LIZIZ(LJIJJ);
                    }
                    Matrix matrix2 = abstractC87718Ybi.LJII;
                    if (matrix2 != null) {
                        LJIJJ.transform(matrix2);
                    }
                    LJIJJ.setFillType(LJIILLIIL());
                }
                return null;
            }
            LJIIJJI("Invalid %s element found in clipPath definition", abstractC87722Ybm.LIZLLL());
            return null;
        }
        if (this.LJ.LIZ.LL != null && (LIZ = LIZ(abstractC87722Ybm, abstractC87722Ybm.LJI)) != null) {
            LJIJJ.op(LIZ, Path.Op.INTERSECT);
        }
        this.LJ = this.LJFF.pop();
        return LJIJJ;
    }

    public final void LJJIIJ(C87698YbO c87698YbO, VU5 vu5) {
        this.LIZLLL = c87698YbO;
        C87714Ybe c87714Ybe = c87698YbO.LIZ;
        if (c87714Ybe == null) {
            LLog.LIZLLL(3, "SVGAndroidRenderer", C16880lQ.LLLZ("Nothing to render. Document is empty.", new Object[0]));
            return;
        }
        VU6 vu6 = c87714Ybe.LJIIIZ;
        YZD yzd = c87714Ybe.LJIIIIZZ;
        this.LJ = new YLD();
        this.LJFF = new Stack<>();
        LJJIJIL(this.LJ, C87699YbP.LIZ());
        YLD yld = this.LJ;
        yld.LJFF = null;
        this.LJFF.push(new YLD(yld));
        this.LJII = new Stack<>();
        this.LJI = new Stack<>();
        Boolean bool = c87714Ybe.LIZLLL;
        if (bool != null) {
            YLD yld2 = this.LJ;
            bool.booleanValue();
            yld2.getClass();
        }
        LJJIJIIJI();
        LJJIFFI(c87714Ybe, new VU6(vu5.LIZ), vu6, yzd);
        LJJIJ();
    }

    public final void LJJIJIL(YLD yld, C87699YbP c87699YbP) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        if (LJIIZILJ(c87699YbP, 4096L)) {
            yld.LIZ.LJLLL = c87699YbP.LJLLL;
        }
        if (LJIIZILJ(c87699YbP, 2048L)) {
            yld.LIZ.LJLLJ = c87699YbP.LJLLJ;
        }
        if (LJIIZILJ(c87699YbP, 1L)) {
            yld.LIZ.LJLILLLLZI = c87699YbP.LJLILLLLZI;
            AbstractC87636YaO abstractC87636YaO = c87699YbP.LJLILLLLZI;
            if (abstractC87636YaO != null && abstractC87636YaO != C87637YaP.LJLJI) {
                z3 = true;
            } else {
                z3 = false;
            }
            yld.LIZIZ = z3;
        }
        if (LJIIZILJ(c87699YbP, 4L)) {
            yld.LIZ.LJLJJI = c87699YbP.LJLJJI;
        }
        if (LJIIZILJ(c87699YbP, 6149L)) {
            LJJIIZI(yld, true, yld.LIZ.LJLILLLLZI);
        }
        if (LJIIZILJ(c87699YbP, 2L)) {
            yld.LIZ.LJLJI = c87699YbP.LJLJI;
        }
        if (LJIIZILJ(c87699YbP, 8L)) {
            yld.LIZ.LJLJJL = c87699YbP.LJLJJL;
            AbstractC87636YaO abstractC87636YaO2 = c87699YbP.LJLJJL;
            if (abstractC87636YaO2 != null && abstractC87636YaO2 != C87637YaP.LJLJI) {
                z2 = true;
            } else {
                z2 = false;
            }
            yld.LIZJ = z2;
        }
        if (LJIIZILJ(c87699YbP, 16L)) {
            yld.LIZ.LJLJJLL = c87699YbP.LJLJJLL;
        }
        if (LJIIZILJ(c87699YbP, 6168L)) {
            LJJIIZI(yld, false, yld.LIZ.LJLJJL);
        }
        if (LJIIZILJ(c87699YbP, 34359738368L)) {
            yld.LIZ.LLFZ = c87699YbP.LLFZ;
        }
        if (LJIIZILJ(c87699YbP, 32L)) {
            C87699YbP c87699YbP2 = yld.LIZ;
            C87650Yac c87650Yac = c87699YbP.LJLJL;
            c87699YbP2.LJLJL = c87650Yac;
            yld.LJ.setStrokeWidth(c87650Yac.LIZIZ(this));
            if (yld.LIZJ && !c87699YbP.LJLJL.LJI()) {
                z = true;
            } else {
                z = false;
            }
            yld.LIZJ = z;
        }
        if (LJIIZILJ(c87699YbP, 64L)) {
            yld.LIZ.LJLJLJ = c87699YbP.LJLJLJ;
            int i2 = YZG.LIZIZ[c87699YbP.LJLJLJ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        yld.LJ.setStrokeCap(Paint.Cap.SQUARE);
                    }
                } else {
                    yld.LJ.setStrokeCap(Paint.Cap.ROUND);
                }
            } else {
                yld.LJ.setStrokeCap(Paint.Cap.BUTT);
            }
        }
        if (LJIIZILJ(c87699YbP, 128L)) {
            yld.LIZ.LJLJLLL = c87699YbP.LJLJLLL;
            int i3 = YZG.LIZJ[c87699YbP.LJLJLLL.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        yld.LJ.setStrokeJoin(Paint.Join.BEVEL);
                    }
                } else {
                    yld.LJ.setStrokeJoin(Paint.Join.ROUND);
                }
            } else {
                yld.LJ.setStrokeJoin(Paint.Join.MITER);
            }
        }
        if (LJIIZILJ(c87699YbP, 256L)) {
            yld.LIZ.LJLL = c87699YbP.LJLL;
            yld.LJ.setStrokeMiter(c87699YbP.LJLL.floatValue());
        }
        if (LJIIZILJ(c87699YbP, 512L)) {
            yld.LIZ.LJLLI = c87699YbP.LJLLI;
        }
        if (LJIIZILJ(c87699YbP, 1024L)) {
            yld.LIZ.LJLLILLLL = c87699YbP.LJLLILLLL;
        }
        if (LJIIZILJ(c87699YbP, 1536L)) {
            C87650Yac[] c87650YacArr = yld.LIZ.LJLLI;
            if (c87650YacArr == null) {
                yld.LJ.setPathEffect(null);
            } else {
                int length = c87650YacArr.length;
                if (length % 2 == 0) {
                    i = length;
                } else {
                    i = length * 2;
                }
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i4 = 0; i4 < i; i4++) {
                    float LIZIZ = yld.LIZ.LJLLI[i4 % length].LIZIZ(this);
                    fArr[i4] = LIZIZ;
                    f += LIZIZ;
                }
                if (f == 0.0f) {
                    yld.LJ.setPathEffect(null);
                } else {
                    float LIZIZ2 = yld.LIZ.LJLLILLLL.LIZIZ(this);
                    if (LIZIZ2 < 0.0f) {
                        LIZIZ2 = (LIZIZ2 % f) + f;
                    }
                    yld.LJ.setPathEffect(new DashPathEffect(fArr, LIZIZ2));
                }
            }
        }
        if (LJIIZILJ(c87699YbP, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            yld.LIZ.LJLLLL = c87699YbP.LJLLLL;
        }
        if (LJIIZILJ(c87699YbP, 16777216L)) {
            yld.LIZ.LJLZ = c87699YbP.LJLZ;
        }
        if (LJIIZILJ(c87699YbP, 33554432L)) {
            yld.LIZ.LJZ = c87699YbP.LJZ;
        }
        if (LJIIZILJ(c87699YbP, 1048576L)) {
            yld.LIZ.LJLLLLLL = c87699YbP.LJLLLLLL;
        }
        if (LJIIZILJ(c87699YbP, 268435456L)) {
            yld.LIZ.LL = c87699YbP.LL;
        }
        if (LJIIZILJ(c87699YbP, 536870912L)) {
            yld.LIZ.LLD = c87699YbP.LLD;
        }
        if (LJIIZILJ(c87699YbP, 67108864L)) {
            yld.LIZ.LJZI = c87699YbP.LJZI;
        }
        if (LJIIZILJ(c87699YbP, 134217728L)) {
            yld.LIZ.LJZL = c87699YbP.LJZL;
        }
        if (LJIIZILJ(c87699YbP, 8589934592L)) {
            yld.LIZ.LLFFF = c87699YbP.LLFFF;
        }
        if (LJIIZILJ(c87699YbP, 17179869184L)) {
            yld.LIZ.LLFII = c87699YbP.LLFII;
        }
        if (LJIIZILJ(c87699YbP, 137438953472L)) {
            yld.LIZ.LLI = c87699YbP.LLI;
        }
    }

    public final void LJJIJL(YLD yld, AbstractC87705YbV abstractC87705YbV) {
        boolean z;
        if (abstractC87705YbV.LIZIZ == null) {
            z = true;
        } else {
            z = false;
        }
        C87699YbP c87699YbP = yld.LIZ;
        Boolean bool = Boolean.TRUE;
        c87699YbP.LJLZ = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        c87699YbP.LJLLLL = bool;
        c87699YbP.LJLLLLLL = null;
        c87699YbP.LL = null;
        c87699YbP.LJLLJ = Float.valueOf(1.0f);
        c87699YbP.LJZI = C87637YaP.LJLILLLLZI;
        c87699YbP.LJZL = Float.valueOf(1.0f);
        c87699YbP.LLF = null;
        c87699YbP.LLFF = Float.valueOf(1.0f);
        c87699YbP.LLFFF = null;
        c87699YbP.LLFII = Float.valueOf(1.0f);
        c87699YbP.LLFZ = VIO.None;
        C87699YbP c87699YbP2 = abstractC87705YbV.LJ;
        if (c87699YbP2 != null) {
            LJJIJIL(yld, c87699YbP2);
        }
        C87699YbP c87699YbP3 = abstractC87705YbV.LJFF;
        if (c87699YbP3 != null) {
            LJJIJIL(yld, c87699YbP3);
        }
    }

    public C87697YbN(Canvas canvas, float f, C79483VHj c79483VHj) {
        this.LIZ = canvas;
        this.LIZIZ = f;
        this.LIZJ = c79483VHj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r6 != 8) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix LIZJ(X.VU6 r9, X.VU6 r10, X.YZD r11) {
        /*
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            if (r11 == 0) goto Lb
            X.YZH r0 = r11.LIZ
            if (r0 != 0) goto Lc
        Lb:
            return r5
        Lc:
            float r6 = r9.LIZJ
            float r0 = r10.LIZJ
            float r6 = r6 / r0
            float r2 = r9.LIZLLL
            float r0 = r10.LIZLLL
            float r2 = r2 / r0
            float r0 = r10.LIZ
            float r4 = -r0
            float r0 = r10.LIZIZ
            float r3 = -r0
            X.YZD r0 = X.YZD.LIZJ
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L32
            float r1 = r9.LIZ
            float r0 = r9.LIZIZ
            r5.preTranslate(r1, r0)
            r5.preScale(r6, r2)
            r5.preTranslate(r4, r3)
            return r5
        L32:
            X.YZC r1 = r11.LIZIZ
            X.YZC r0 = X.YZC.slice
            if (r1 != r0) goto L8e
            float r2 = java.lang.Math.max(r6, r2)
        L3c:
            float r8 = r9.LIZJ
            float r8 = r8 / r2
            float r1 = r9.LIZLLL
            float r1 = r1 / r2
            int[] r6 = X.YZG.LIZ
            X.YZH r0 = r11.LIZ
            int r0 = r0.ordinal()
            r0 = r6[r0]
            r7 = 1073741824(0x40000000, float:2.0)
            switch(r0) {
                case 1: goto L88;
                case 2: goto L88;
                case 3: goto L88;
                case 4: goto L84;
                case 5: goto L84;
                case 6: goto L84;
                default: goto L51;
            }
        L51:
            X.YZH r0 = r11.LIZ
            int r0 = r0.ordinal()
            r6 = r6[r0]
            r0 = 2
            if (r6 == r0) goto L7e
            r0 = 3
            if (r6 == r0) goto L7a
            r0 = 5
            if (r6 == r0) goto L7e
            r0 = 6
            if (r6 == r0) goto L7a
            r0 = 7
            if (r6 == r0) goto L7e
            r0 = 8
            if (r6 == r0) goto L7a
        L6c:
            float r1 = r9.LIZ
            float r0 = r9.LIZIZ
            r5.preTranslate(r1, r0)
            r5.preScale(r2, r2)
            r5.preTranslate(r4, r3)
            goto Lb
        L7a:
            float r0 = r10.LIZLLL
            float r0 = r0 - r1
            goto L82
        L7e:
            float r0 = r10.LIZLLL
            float r0 = r0 - r1
            float r0 = r0 / r7
        L82:
            float r3 = r3 - r0
            goto L6c
        L84:
            float r0 = r10.LIZJ
            float r0 = r0 - r8
            goto L8c
        L88:
            float r0 = r10.LIZJ
            float r0 = r0 - r8
            float r0 = r0 / r7
        L8c:
            float r4 = r4 - r0
            goto L51
        L8e:
            float r2 = java.lang.Math.min(r6, r2)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87697YbN.LIZJ(X.VU6, X.VU6, X.YZD):android.graphics.Matrix");
    }

    public static void LJJIIZI(YLD yld, boolean z, AbstractC87636YaO abstractC87636YaO) {
        Float f;
        int i;
        C87699YbP c87699YbP = yld.LIZ;
        if (z) {
            f = c87699YbP.LJLJJI;
        } else {
            f = c87699YbP.LJLJJLL;
        }
        float floatValue = f.floatValue();
        if (abstractC87636YaO instanceof C87637YaP) {
            i = ((C87637YaP) abstractC87636YaO).LJLIL;
        } else if (!(abstractC87636YaO instanceof C87638YaQ)) {
            return;
        } else {
            i = yld.LIZ.LJLLL.LJLIL;
        }
        int LJFF = LJFF(floatValue, i);
        if (z) {
            yld.LIZLLL.setColor(LJFF);
        } else {
            yld.LJ.setColor(LJFF);
        }
    }

    public final void LJII(boolean z, VU6 vu6, C87635YaN c87635YaN) {
        boolean z2;
        Paint paint;
        float f;
        float f2;
        float f3;
        float f4;
        boolean z3;
        Paint paint2;
        float f5;
        float f6;
        float f7;
        float LIZJ;
        float f8;
        String str;
        AbstractC87705YbV LJFF = this.LIZLLL.LJFF(c87635YaN.LJLIL);
        boolean z4 = true;
        int i = 0;
        if (LJFF == null) {
            Object[] objArr = new Object[2];
            if (z) {
                str = "Fill";
            } else {
                str = "Stroke";
            }
            objArr[0] = str;
            objArr[1] = c87635YaN.LJLIL;
            LJIIJJI("%s reference '%s' not found", objArr);
            AbstractC87636YaO abstractC87636YaO = c87635YaN.LJLILLLLZI;
            if (abstractC87636YaO != null) {
                LJJIIZI(this.LJ, z, abstractC87636YaO);
                return;
            } else if (z) {
                this.LJ.LIZIZ = false;
                return;
            } else {
                this.LJ.LIZJ = false;
                return;
            }
        }
        float f9 = -1.0f;
        if (LJFF instanceof C87710Yba) {
            C87710Yba c87710Yba = (C87710Yba) LJFF;
            String str2 = c87710Yba.LJIIJ;
            if (str2 != null) {
                LJIIL(c87710Yba, str2);
            }
            Boolean bool = c87710Yba.LJII;
            if (bool != null && bool.booleanValue()) {
                z3 = true;
            } else {
                z3 = false;
            }
            YLD yld = this.LJ;
            if (z) {
                paint2 = yld.LIZLLL;
            } else {
                paint2 = yld.LJ;
            }
            if (z3) {
                VU6 vu62 = yld.LJI;
                if (vu62 == null) {
                    vu62 = yld.LJFF;
                }
                C87650Yac c87650Yac = c87710Yba.LJIIJJI;
                if (c87650Yac != null) {
                    f5 = c87650Yac.LIZLLL(this);
                } else {
                    f5 = 0.0f;
                }
                C87650Yac c87650Yac2 = c87710Yba.LJIIL;
                if (c87650Yac2 != null) {
                    f6 = c87650Yac2.LJ(this);
                } else {
                    f6 = 0.0f;
                }
                C87650Yac c87650Yac3 = c87710Yba.LJIILIIL;
                if (c87650Yac3 != null) {
                    f7 = c87650Yac3.LIZLLL(this);
                } else {
                    f7 = vu62.LIZJ;
                }
                C87650Yac c87650Yac4 = c87710Yba.LJIILJJIL;
                if (c87650Yac4 != null) {
                    LIZJ = c87650Yac4.LJ(this);
                }
                LIZJ = 0.0f;
            } else {
                C87650Yac c87650Yac5 = c87710Yba.LJIIJJI;
                if (c87650Yac5 != null) {
                    f5 = c87650Yac5.LIZJ(this);
                } else {
                    f5 = 0.0f;
                }
                C87650Yac c87650Yac6 = c87710Yba.LJIIL;
                if (c87650Yac6 != null) {
                    f6 = c87650Yac6.LIZJ(this);
                } else {
                    f6 = 0.0f;
                }
                C87650Yac c87650Yac7 = c87710Yba.LJIILIIL;
                if (c87650Yac7 != null) {
                    f7 = c87650Yac7.LIZJ(this);
                } else {
                    f7 = 1.0f;
                }
                C87650Yac c87650Yac8 = c87710Yba.LJIILJJIL;
                if (c87650Yac8 != null) {
                    LIZJ = c87650Yac8.LIZJ(this);
                }
                LIZJ = 0.0f;
            }
            LJJIJIIJI();
            YLD yld2 = new YLD();
            LJJIJIL(yld2, C87699YbP.LIZ());
            LJIILL(c87710Yba, yld2);
            this.LJ = yld2;
            Matrix matrix = new Matrix();
            if (!z3) {
                matrix.preTranslate(vu6.LIZ, vu6.LIZIZ);
                matrix.preScale(vu6.LIZJ, vu6.LIZLLL);
            }
            Matrix matrix2 = c87710Yba.LJIIIIZZ;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = c87710Yba.LJI.size();
            if (size == 0) {
                LJJIJ();
                if (z) {
                    this.LJ.LIZIZ = false;
                    return;
                } else {
                    this.LJ.LIZJ = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator<C87721Ybl> it = c87710Yba.LJI.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C87706YbW c87706YbW = (C87706YbW) it.next();
                Float f10 = c87706YbW.LJI;
                if (f10 != null) {
                    f8 = f10.floatValue();
                } else {
                    f8 = 0.0f;
                }
                if (i2 == 0 || f8 >= f9) {
                    fArr[i2] = f8;
                    f9 = f8;
                } else {
                    fArr[i2] = f9;
                }
                LJJIJIIJI();
                LJJIJL(this.LJ, c87706YbW);
                C87699YbP c87699YbP = this.LJ.LIZ;
                C87637YaP c87637YaP = (C87637YaP) c87699YbP.LJZI;
                if (c87637YaP == null) {
                    c87637YaP = C87637YaP.LJLILLLLZI;
                }
                iArr[i2] = LJFF(c87699YbP.LJZL.floatValue(), c87637YaP.LJLIL);
                i2++;
                LJJIJ();
            }
            if ((f5 == f7 && f6 == LIZJ) || size == 1) {
                LJJIJ();
                paint2.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            VWP vwp = c87710Yba.LJIIIZ;
            if (vwp != null) {
                if (vwp == VWP.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (vwp == VWP.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            LJJIJ();
            LinearGradient linearGradient = new LinearGradient(f5, f6, f7, LIZJ, iArr, fArr, tileMode);
            linearGradient.setLocalMatrix(matrix);
            paint2.setShader(linearGradient);
            int floatValue = (int) (this.LJ.LIZ.LJLJJI.floatValue() * 256.0f);
            if (floatValue >= 0) {
                if (floatValue > 255) {
                    i = 255;
                } else {
                    i = floatValue;
                }
            }
            paint2.setAlpha(i);
            return;
        }
        if (LJFF instanceof C87708YbY) {
            C87708YbY c87708YbY = (C87708YbY) LJFF;
            String str3 = c87708YbY.LJIIJ;
            if (str3 != null) {
                LJIIL(c87708YbY, str3);
            }
            Boolean bool2 = c87708YbY.LJII;
            if (bool2 != null && bool2.booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            YLD yld3 = this.LJ;
            if (z) {
                paint = yld3.LIZLLL;
            } else {
                paint = yld3.LJ;
            }
            if (z2) {
                C87650Yac c87650Yac9 = new C87650Yac(50.0f, EnumC87634YaM.percent);
                C87650Yac c87650Yac10 = c87708YbY.LJIIJJI;
                if (c87650Yac10 != null) {
                    f2 = c87650Yac10.LIZLLL(this);
                } else {
                    f2 = c87650Yac9.LIZLLL(this);
                }
                C87650Yac c87650Yac11 = c87708YbY.LJIIL;
                if (c87650Yac11 != null) {
                    f3 = c87650Yac11.LJ(this);
                } else {
                    f3 = c87650Yac9.LJ(this);
                }
                C87650Yac c87650Yac12 = c87708YbY.LJIILIIL;
                if (c87650Yac12 != null) {
                    f = c87650Yac12.LIZIZ(this);
                } else {
                    f = c87650Yac9.LIZIZ(this);
                }
            } else {
                C87650Yac c87650Yac13 = c87708YbY.LJIIJJI;
                f = 0.5f;
                if (c87650Yac13 != null) {
                    f2 = c87650Yac13.LIZJ(this);
                } else {
                    f2 = 0.5f;
                }
                C87650Yac c87650Yac14 = c87708YbY.LJIIL;
                if (c87650Yac14 != null) {
                    f3 = c87650Yac14.LIZJ(this);
                } else {
                    f3 = 0.5f;
                }
                C87650Yac c87650Yac15 = c87708YbY.LJIILIIL;
                if (c87650Yac15 != null) {
                    f = c87650Yac15.LIZJ(this);
                }
            }
            LJJIJIIJI();
            YLD yld4 = new YLD();
            LJJIJIL(yld4, C87699YbP.LIZ());
            LJIILL(c87708YbY, yld4);
            this.LJ = yld4;
            Matrix matrix3 = new Matrix();
            if (!z2) {
                matrix3.preTranslate(vu6.LIZ, vu6.LIZIZ);
                matrix3.preScale(vu6.LIZJ, vu6.LIZLLL);
            }
            Matrix matrix4 = c87708YbY.LJIIIIZZ;
            if (matrix4 != null) {
                matrix3.preConcat(matrix4);
            }
            int size2 = c87708YbY.LJI.size();
            if (size2 == 0) {
                LJJIJ();
                if (z) {
                    this.LJ.LIZIZ = false;
                    return;
                } else {
                    this.LJ.LIZJ = false;
                    return;
                }
            }
            int[] iArr2 = new int[size2];
            float[] fArr2 = new float[size2];
            Iterator<C87721Ybl> it2 = c87708YbY.LJI.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                C87706YbW c87706YbW2 = (C87706YbW) it2.next();
                Float f11 = c87706YbW2.LJI;
                if (f11 != null) {
                    f4 = f11.floatValue();
                } else {
                    f4 = 0.0f;
                }
                if (i3 == 0 || f4 >= f9) {
                    fArr2[i3] = f4;
                    f9 = f4;
                } else {
                    fArr2[i3] = f9;
                }
                LJJIJIIJI();
                LJJIJL(this.LJ, c87706YbW2);
                C87699YbP c87699YbP2 = this.LJ.LIZ;
                C87637YaP c87637YaP2 = (C87637YaP) c87699YbP2.LJZI;
                if (c87637YaP2 == null) {
                    c87637YaP2 = C87637YaP.LJLILLLLZI;
                }
                iArr2[i3] = LJFF(c87699YbP2.LJZL.floatValue(), c87637YaP2.LJLIL);
                i3++;
                LJJIJ();
            }
            if (f == 0.0f || size2 == 1) {
                LJJIJ();
                paint.setColor(iArr2[size2 - 1]);
                return;
            }
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            VWP vwp2 = c87708YbY.LJIIIZ;
            if (vwp2 != null) {
                if (vwp2 == VWP.reflect) {
                    tileMode2 = Shader.TileMode.MIRROR;
                } else if (vwp2 == VWP.repeat) {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
            }
            LJJIJ();
            RadialGradient radialGradient = new RadialGradient(f2, f3, f, iArr2, fArr2, tileMode2);
            radialGradient.setLocalMatrix(matrix3);
            paint.setShader(radialGradient);
            int floatValue2 = (int) (this.LJ.LIZ.LJLJJI.floatValue() * 256.0f);
            if (floatValue2 < 0) {
                floatValue2 = 0;
            } else if (floatValue2 > 255) {
                floatValue2 = 255;
            }
            paint.setAlpha(floatValue2);
            return;
        }
        if (!(LJFF instanceof C87707YbX)) {
            return;
        }
        if (z) {
            if (LJIIZILJ(LJFF.LJ, 2147483648L)) {
                YLD yld5 = this.LJ;
                C87699YbP c87699YbP3 = yld5.LIZ;
                AbstractC87636YaO abstractC87636YaO2 = LJFF.LJ.LLF;
                c87699YbP3.LJLILLLLZI = abstractC87636YaO2;
                if (abstractC87636YaO2 == null) {
                    z4 = false;
                }
                yld5.LIZIZ = z4;
            }
            if (LJIIZILJ(LJFF.LJ, 4294967296L)) {
                this.LJ.LIZ.LJLJJI = LJFF.LJ.LLFF;
            }
            if (!LJIIZILJ(LJFF.LJ, 6442450944L)) {
                return;
            }
            YLD yld6 = this.LJ;
            LJJIIZI(yld6, z, yld6.LIZ.LJLILLLLZI);
            return;
        }
        if (LJIIZILJ(LJFF.LJ, 2147483648L)) {
            YLD yld7 = this.LJ;
            C87699YbP c87699YbP4 = yld7.LIZ;
            AbstractC87636YaO abstractC87636YaO3 = LJFF.LJ.LLF;
            c87699YbP4.LJLJJL = abstractC87636YaO3;
            if (abstractC87636YaO3 == null) {
                z4 = false;
            }
            yld7.LIZJ = z4;
        }
        if (LJIIZILJ(LJFF.LJ, 4294967296L)) {
            this.LJ.LIZ.LJLJJLL = LJFF.LJ.LLFF;
        }
        if (!LJIIZILJ(LJFF.LJ, 6442450944L)) {
            return;
        }
        YLD yld8 = this.LJ;
        LJJIIZI(yld8, z, yld8.LIZ.LJLJJL);
    }

    public final void LJJIIJZLJL(C87702YbS c87702YbS, YZD yzd, Bitmap bitmap) {
        float f;
        float f2;
        int i = 0;
        if (bitmap == null) {
            LJIIJJI("Could not locate image '%s'", c87702YbS.LJIIIZ);
            return;
        }
        VU6 vu6 = new VU6(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        LJJIJL(this.LJ, c87702YbS);
        if (!LJIIIIZZ() || !LJJIL()) {
            return;
        }
        Matrix matrix = c87702YbS.LJIILJJIL;
        if (matrix != null) {
            this.LIZ.concat(matrix);
        }
        C87650Yac c87650Yac = c87702YbS.LJIIJ;
        if (c87650Yac != null) {
            f = c87650Yac.LIZLLL(this);
        } else {
            f = 0.0f;
        }
        C87650Yac c87650Yac2 = c87702YbS.LJIIJJI;
        if (c87650Yac2 != null) {
            f2 = c87650Yac2.LJ(this);
        } else {
            f2 = 0.0f;
        }
        float LIZLLL = c87702YbS.LJIIL.LIZLLL(this);
        float LIZLLL2 = c87702YbS.LJIILIIL.LIZLLL(this);
        YLD yld = this.LJ;
        yld.LJFF = new VU6(f, f2, LIZLLL, LIZLLL2);
        if (!yld.LIZ.LJLLLL.booleanValue()) {
            VU6 vu62 = this.LJ.LJFF;
            LJJIIZ(vu62.LIZ, vu62.LIZIZ, vu62.LIZJ, vu62.LIZLLL);
        }
        c87702YbS.LJI = this.LJ.LJFF;
        LJJIJIIJIL(c87702YbS);
        LIZLLL(c87702YbS, c87702YbS.LJI);
        boolean LJJI = LJJI();
        LJJIJLIJ();
        this.LIZ.save();
        this.LIZ.concat(LIZJ(this.LJ.LJFF, vu6, yzd));
        if (this.LJ.LIZ.LLI != VIP.optimizeSpeed) {
            i = 2;
        }
        this.LIZ.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(i));
        this.LIZ.restore();
        if (LJJI) {
            LJJIJ();
        }
    }

    public final VU6 LJIL(C87650Yac c87650Yac, C87650Yac c87650Yac2, C87650Yac c87650Yac3, C87650Yac c87650Yac4) {
        float f;
        float f2;
        float f3;
        float f4 = 0.0f;
        if (c87650Yac != null) {
            f = c87650Yac.LIZLLL(this);
        } else {
            f = 0.0f;
        }
        if (c87650Yac2 != null) {
            f4 = c87650Yac2.LJ(this);
        }
        YLD yld = this.LJ;
        VU6 vu6 = yld.LJI;
        if (vu6 == null) {
            vu6 = yld.LJFF;
        }
        if (c87650Yac3 != null) {
            f2 = c87650Yac3.LIZLLL(this);
        } else {
            f2 = vu6.LIZJ;
        }
        if (c87650Yac4 != null) {
            f3 = c87650Yac4.LJ(this);
        } else {
            f3 = vu6.LIZLLL;
        }
        return new VU6(f, f4, f2, f3);
    }

    public final void LJJIFFI(C87714Ybe c87714Ybe, VU6 vu6, VU6 vu62, YZD yzd) {
        LJI("Svg render", new Object[0]);
        if (vu6.LIZJ == 0.0f || vu6.LIZLLL == 0.0f) {
            return;
        }
        if (yzd == null && (yzd = c87714Ybe.LJIIIIZZ) == null) {
            yzd = new YZD(YZH.none, YZC.meet);
        }
        LJJIJL(this.LJ, c87714Ybe);
        if (!LJIIIIZZ()) {
            return;
        }
        YLD yld = this.LJ;
        yld.LJFF = vu6;
        if (!yld.LIZ.LJLLLL.booleanValue()) {
            VU6 vu63 = this.LJ.LJFF;
            LJJIIZ(vu63.LIZ, vu63.LIZIZ, vu63.LIZJ, vu63.LIZLLL);
        }
        LIZLLL(c87714Ybe, this.LJ.LJFF);
        if (vu62 != null) {
            this.LIZ.concat(LIZJ(this.LJ.LJFF, vu62, yzd));
            this.LJ.LJI = c87714Ybe.LJIIIZ;
        } else {
            Canvas canvas = this.LIZ;
            VU6 vu64 = this.LJ.LJFF;
            canvas.translate(vu64.LIZ, vu64.LIZIZ);
        }
        boolean LJJI = LJJI();
        LJJIJLIJ();
        LJJIII(c87714Ybe);
        if (LJJI) {
            LJJIJ();
        }
        LJJIJIIJIL(c87714Ybe);
    }

    public final void LJJIIZ(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        C87717Ybh c87717Ybh = this.LJ.LIZ.LJLLLLLL;
        if (c87717Ybh != null) {
            f += c87717Ybh.LIZLLL.LIZLLL(this);
            f2 += this.LJ.LIZ.LJLLLLLL.LIZ.LJ(this);
            f5 -= this.LJ.LIZ.LJLLLLLL.LIZIZ.LIZLLL(this);
            f6 -= this.LJ.LIZ.LJLLLLLL.LIZJ.LJ(this);
        }
        this.LIZ.clipRect(f, f2, f5, f6);
    }
}
