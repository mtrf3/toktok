package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1lp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42611lp extends AbstractC32681Qa {
    public final List<C11850dJ> LIZLLL;
    public final List<Float> LJ;
    public final long LJFF;
    public final long LJI;
    public final int LJII;

    public final int hashCode() {
        int i;
        int hashCode = this.LIZLLL.hashCode() * 31;
        List<Float> list = this.LJ;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return JBR.LIZJ(this.LJI, JBR.LIZJ(this.LJFF, (hashCode + i) * 31, 31), 31) + this.LJII;
    }

    public final String toString() {
        String str;
        String str2;
        String str3 = "";
        if (!C78923UyF.LJIILJJIL(this.LJFF)) {
            str = "";
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("start=");
            LIZ.append((Object) C10370av.LJIIIIZZ(this.LJFF));
            LIZ.append(", ");
            str = X1D.LIZIZ(LIZ);
        }
        if (C78923UyF.LJIILJJIL(this.LJI)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("end=");
            LIZ2.append((Object) C10370av.LJIIIIZZ(this.LJI));
            LIZ2.append(", ");
            str3 = X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("LinearGradient(colors=");
        LIZ3.append(this.LIZLLL);
        LIZ3.append(", stops=");
        LIZ3.append(this.LJ);
        LIZ3.append(", ");
        LIZ3.append(str);
        LIZ3.append(str3);
        LIZ3.append("tileMode=");
        int i = this.LJII;
        if (i == 0) {
            str2 = "Clamp";
        } else if (i == 1) {
            str2 = "Repeated";
        } else if (i == 2) {
            str2 = "Mirror";
        } else if (i == 3) {
            str2 = "Decal";
        } else {
            str2 = "Unknown";
        }
        LIZ3.append((Object) str2);
        LIZ3.append(')');
        return X1D.LIZIZ(LIZ3);
    }

    @Override // X.AbstractC32681Qa
    public final Shader LIZIZ(long j) {
        float LIZLLL;
        float LJ;
        float LIZLLL2;
        float LJ2;
        int i;
        int[] iArr;
        int i2;
        float[] fArr;
        char c;
        float f;
        float f2;
        float LJJI;
        Shader.TileMode tileMode;
        if (C10370av.LIZLLL(this.LJFF) == Float.POSITIVE_INFINITY) {
            LIZLLL = C10430b1.LIZLLL(j);
        } else {
            LIZLLL = C10370av.LIZLLL(this.LJFF);
        }
        if (C10370av.LJ(this.LJFF) == Float.POSITIVE_INFINITY) {
            LJ = C10430b1.LIZIZ(j);
        } else {
            LJ = C10370av.LJ(this.LJFF);
        }
        if (C10370av.LIZLLL(this.LJI) == Float.POSITIVE_INFINITY) {
            LIZLLL2 = C10430b1.LIZLLL(j);
        } else {
            LIZLLL2 = C10370av.LIZLLL(this.LJI);
        }
        if (C10370av.LJ(this.LJI) == Float.POSITIVE_INFINITY) {
            LJ2 = C10430b1.LIZIZ(j);
        } else {
            LJ2 = C10370av.LJ(this.LJI);
        }
        List<C11850dJ> colors = this.LIZLLL;
        List<Float> list = this.LJ;
        long LIZ = C78923UyF.LIZ(LIZLLL, LJ);
        long LIZ2 = C78923UyF.LIZ(LIZLLL2, LJ2);
        int i3 = this.LJII;
        o.LJIIIZ(colors, "colors");
        if (list == null) {
            if (colors.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (colors.size() != list.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i = 0;
        } else {
            int LJJI2 = C47261Igj.LJJI(colors);
            i = 0;
            for (int i4 = 1; i4 < LJJI2; i4++) {
                if (C11850dJ.LIZLLL(((C11850dJ) ListProtector.get(colors, i4)).LIZ) == 0.0f) {
                    i++;
                }
            }
        }
        float LIZLLL3 = C10370av.LIZLLL(LIZ);
        float LJ3 = C10370av.LJ(LIZ);
        float LIZLLL4 = C10370av.LIZLLL(LIZ2);
        float LJ4 = C10370av.LJ(LIZ2);
        if (Build.VERSION.SDK_INT >= 26) {
            int size = colors.size();
            iArr = new int[size];
            for (int i5 = 0; i5 < size; i5++) {
                iArr[i5] = C78897Uxp.LJJJZ(((C11850dJ) ListProtector.get(colors, i5)).LIZ);
            }
        } else {
            iArr = new int[colors.size() + i];
            int LJJI3 = C47261Igj.LJJI(colors);
            int size2 = colors.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size2; i7++) {
                long j2 = ((C11850dJ) ListProtector.get(colors, i7)).LIZ;
                if (C11850dJ.LIZLLL(j2) == 0.0f) {
                    if (i7 == 0) {
                        i2 = i6 + 1;
                        iArr[i6] = C78897Uxp.LJJJZ(C11850dJ.LIZIZ(((C11850dJ) ListProtector.get(colors, 1)).LIZ, 0.0f));
                    } else if (i7 == LJJI3) {
                        i2 = i6 + 1;
                        iArr[i6] = C78897Uxp.LJJJZ(C11850dJ.LIZIZ(((C11850dJ) ListProtector.get(colors, i7 - 1)).LIZ, 0.0f));
                    } else {
                        int i8 = i6 + 1;
                        iArr[i6] = C78897Uxp.LJJJZ(C11850dJ.LIZIZ(((C11850dJ) ListProtector.get(colors, i7 - 1)).LIZ, 0.0f));
                        i6 = i8 + 1;
                        iArr[i8] = C78897Uxp.LJJJZ(C11850dJ.LIZIZ(((C11850dJ) ListProtector.get(colors, i7 + 1)).LIZ, 0.0f));
                    }
                } else {
                    i2 = i6 + 1;
                    iArr[i6] = C78897Uxp.LJJJZ(j2);
                }
                i6 = i2;
            }
        }
        if (i == 0) {
            if (list != null) {
                fArr = ORZ.LLIZ(list);
            } else {
                fArr = null;
            }
        } else {
            fArr = new float[colors.size() + i];
            if (list != null) {
                c = 0;
                f = ((Number) ListProtector.get(list, 0)).floatValue();
            } else {
                c = 0;
                f = 0.0f;
            }
            fArr[c] = f;
            int LJJI4 = C47261Igj.LJJI(colors);
            int i9 = 1;
            for (int i10 = 1; i10 < LJJI4; i10++) {
                long j3 = ((C11850dJ) ListProtector.get(colors, i10)).LIZ;
                if (list != null) {
                    LJJI = ((Number) ListProtector.get(list, i10)).floatValue();
                } else {
                    LJJI = i10 / C47261Igj.LJJI(colors);
                }
                int i11 = i9 + 1;
                fArr[i9] = LJJI;
                if (C11850dJ.LIZLLL(j3) == 0.0f) {
                    i9 = i11 + 1;
                    fArr[i11] = LJJI;
                } else {
                    i9 = i11;
                }
            }
            if (list != null) {
                f2 = ((Number) ListProtector.get(list, C47261Igj.LJJI(colors))).floatValue();
            } else {
                f2 = 1.0f;
            }
            fArr[i9] = f2;
        }
        if (i3 == 0) {
            tileMode = Shader.TileMode.CLAMP;
        } else if (i3 == 1) {
            tileMode = Shader.TileMode.REPEAT;
        } else if (i3 == 2) {
            tileMode = Shader.TileMode.MIRROR;
        } else if (i3 == 3) {
            if (Build.VERSION.SDK_INT >= 31) {
                tileMode = C11980dW.LIZIZ();
            } else {
                tileMode = Shader.TileMode.CLAMP;
            }
        } else {
            tileMode = Shader.TileMode.CLAMP;
        }
        return new LinearGradient(LIZLLL3, LJ3, LIZLLL4, LJ4, iArr, fArr, tileMode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42611lp)) {
            return false;
        }
        C42611lp c42611lp = (C42611lp) obj;
        if (o.LJ(this.LIZLLL, c42611lp.LIZLLL) && o.LJ(this.LJ, c42611lp.LJ) && C10370av.LIZIZ(this.LJFF, c42611lp.LJFF) && C10370av.LIZIZ(this.LJI, c42611lp.LJI) && this.LJII == c42611lp.LJII) {
            return true;
        }
        return false;
    }

    public C42611lp(List list, List list2, long j, long j2, int i) {
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = j;
        this.LJI = j2;
        this.LJII = i;
    }
}
