package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.SJr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71899SJr {
    public int LIZ = -1;
    public int LIZIZ = -1;
    public Integer LIZJ;
    public Integer LIZLLL;
    public Float LJ;
    public Float LJFF;
    public EnumC71803SFz LJI;
    public EnumC71900SJs LJII;

    public final C71902SJu LIZ(Context ctx) {
        Integer LJI;
        o.LJIIIZ(ctx, "ctx");
        C71902SJu c71902SJu = new C71902SJu();
        int i = this.LIZ;
        if (i >= 0 && c71902SJu.LIZIZ() != i) {
            c71902SJu.LJIIIIZZ = null;
            c71902SJu.LJIILIIL = i;
            c71902SJu.LIZIZ = i;
            c71902SJu.invalidateSelf();
        }
        int i2 = this.LIZIZ;
        if (i2 >= 0 && c71902SJu.LIZ() != i2) {
            c71902SJu.LJIIIIZZ = null;
            c71902SJu.LJIILJJIL = i2;
            c71902SJu.LIZJ = i2;
            c71902SJu.invalidateSelf();
        }
        Integer num = this.LIZJ;
        if (num != null) {
            c71902SJu.LIZLLL(num.intValue());
        }
        Integer num2 = this.LIZLLL;
        if (num2 != null && (LJI = C79045V0n.LJI(num2.intValue(), ctx)) != null) {
            c71902SJu.LIZLLL(LJI.intValue());
            c71902SJu.invalidateSelf();
        }
        Float f = this.LJ;
        float f2 = 1.0f;
        if (f != null) {
            float floatValue = f.floatValue();
            if (c71902SJu.LJIIJJI != floatValue) {
                c71902SJu.LJIIIIZZ = null;
                if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                } else if (floatValue > 1.0f) {
                    floatValue = 1.0f;
                }
                c71902SJu.LJIIJJI = floatValue;
                c71902SJu.invalidateSelf();
            }
        }
        Float f3 = this.LJFF;
        if (f3 != null) {
            float floatValue2 = f3.floatValue();
            if (c71902SJu.LJIIL != floatValue2) {
                c71902SJu.LJIIIIZZ = null;
                if (floatValue2 < 0.0f) {
                    f2 = 0.0f;
                } else if (floatValue2 <= 1.0f) {
                    f2 = floatValue2;
                }
                c71902SJu.LJIIL = f2;
                c71902SJu.invalidateSelf();
            }
        }
        EnumC71803SFz enumC71803SFz = this.LJI;
        if (enumC71803SFz != null && c71902SJu.LJIIJ != enumC71803SFz) {
            c71902SJu.LJIIIIZZ = null;
            c71902SJu.LJIIJ = enumC71803SFz;
            c71902SJu.invalidateSelf();
        }
        EnumC71900SJs enumC71900SJs = this.LJII;
        if (enumC71900SJs != null) {
            c71902SJu.LJ(enumC71900SJs);
        }
        return c71902SJu;
    }
}
