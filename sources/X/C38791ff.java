package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.List;

/* renamed from: X.1ff, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38791ff implements InterfaceC271214q {
    public final String LIZ;
    public final EnumC271414s LIZIZ;
    public final C44461oo LIZJ;
    public final C44471op LIZLLL;
    public final C44481oq LJ;
    public final C44481oq LJFF;
    public final C44451on LJI;
    public final EnumC272114z LJII;
    public final AnonymousClass150 LJIIIIZZ;
    public final float LJIIIZ;
    public final List<C44451on> LJIIJ;
    public final C44451on LJIIJJI;

    @Override // X.InterfaceC271214q
    public final InterfaceC20640rU LIZ(final C04740Go c04740Go, final AbstractC45041pk abstractC45041pk) {
        return new AbstractC43601nQ(c04740Go, abstractC45041pk, this) { // from class: X.24E
            public final String LJIILJJIL;
            public final C0M5<LinearGradient> LJIILL;
            public final C0M5<RadialGradient> LJIILLIIL;
            public final RectF LJIIZILJ;
            public final EnumC271414s LJIJ;
            public final int LJIJI;
            public final C43761ng LJIJJ;
            public final C43791nj LJIJJLI;
            public final C43791nj LJIL;

            public final int LJFF() {
                int i;
                int round = Math.round(this.LJIJJLI.LJ * this.LJIJI);
                int round2 = Math.round(this.LJIL.LJ * this.LJIJI);
                int round3 = Math.round(this.LJIJJ.LJ * this.LJIJI);
                if (round != 0) {
                    i = round * 527;
                } else {
                    i = 17;
                }
                if (round2 != 0) {
                    i = i * 31 * round2;
                }
                if (round3 != 0) {
                    return i * 31 * round3;
                }
                return i;
            }

            @Override // X.InterfaceC20640rU
            public final String getName() {
                return this.LJIILJJIL;
            }

            {
                super(c04740Go, abstractC45041pk, this.LJII.toPaintCap(), this.LJIIIIZZ.toPaintJoin(), this.LJIIIZ, this.LIZLLL, this.LJI, this.LJIIJ, this.LJIIJJI);
                this.LJIILL = new C0M5<>();
                this.LJIILLIIL = new C0M5<>();
                this.LJIIZILJ = new RectF();
                this.LJIILJJIL = this.LIZ;
                this.LJIJ = this.LIZIZ;
                this.LJIJI = (int) (c04740Go.LJLILLLLZI.LIZIZ() / 32.0f);
                AbstractC22650uj<C271314r, C271314r> LIZ = this.LIZJ.LIZ();
                this.LJIJJ = (C43761ng) LIZ;
                LIZ.LIZ(this);
                abstractC45041pk.LJFF(LIZ);
                AbstractC22650uj<PointF, PointF> LIZ2 = this.LJ.LIZ();
                this.LJIJJLI = (C43791nj) LIZ2;
                LIZ2.LIZ(this);
                abstractC45041pk.LJFF(LIZ2);
                AbstractC22650uj<PointF, PointF> LIZ3 = this.LJFF.LIZ();
                this.LJIL = (C43791nj) LIZ3;
                LIZ3.LIZ(this);
                abstractC45041pk.LJFF(LIZ3);
            }

            @Override // X.AbstractC43601nQ, X.InterfaceC34831Yh
            public final void LIZJ(Canvas canvas, Matrix matrix, int i) {
                LIZ(this.LJIIZILJ, matrix);
                if (this.LJIJ == EnumC271414s.Linear) {
                    Paint paint = this.LJIIIIZZ;
                    long LJFF = LJFF();
                    LinearGradient LJ = this.LJIILL.LJ(LJFF, null);
                    if (LJ == null) {
                        PointF LJI = this.LJIJJLI.LJI();
                        PointF LJI2 = this.LJIL.LJI();
                        C271314r LJI3 = LJI();
                        int[] iArr = LJI3.LIZIZ;
                        float[] fArr = LJI3.LIZ;
                        RectF rectF = this.LJIIZILJ;
                        int width = (int) ((rectF.width() / 2.0f) + rectF.left + LJI.x);
                        RectF rectF2 = this.LJIIZILJ;
                        int height = (int) ((rectF2.height() / 2.0f) + rectF2.top + LJI.y);
                        RectF rectF3 = this.LJIIZILJ;
                        int width2 = (int) ((rectF3.width() / 2.0f) + rectF3.left + LJI2.x);
                        RectF rectF4 = this.LJIIZILJ;
                        LJ = new LinearGradient(width, height, width2, (int) ((rectF4.height() / 2.0f) + rectF4.top + LJI2.y), iArr, fArr, Shader.TileMode.CLAMP);
                        this.LJIILL.LJI(LJFF, LJ);
                    }
                    paint.setShader(LJ);
                } else {
                    Paint paint2 = this.LJIIIIZZ;
                    long LJFF2 = LJFF();
                    RadialGradient LJ2 = this.LJIILLIIL.LJ(LJFF2, null);
                    if (LJ2 == null) {
                        PointF LJI4 = this.LJIJJLI.LJI();
                        PointF LJI5 = this.LJIL.LJI();
                        C271314r LJI6 = LJI();
                        int[] iArr2 = LJI6.LIZIZ;
                        float[] fArr2 = LJI6.LIZ;
                        RectF rectF5 = this.LJIIZILJ;
                        int width3 = (int) ((rectF5.width() / 2.0f) + rectF5.left + LJI4.x);
                        RectF rectF6 = this.LJIIZILJ;
                        int height2 = (int) ((rectF6.height() / 2.0f) + rectF6.top + LJI4.y);
                        RectF rectF7 = this.LJIIZILJ;
                        int width4 = (int) ((rectF7.width() / 2.0f) + rectF7.left + LJI5.x);
                        RectF rectF8 = this.LJIIZILJ;
                        LJ2 = new RadialGradient(width3, height2, (float) Math.hypot(width4 - width3, ((int) (((rectF8.height() / 2.0f) + rectF8.top) + LJI5.y)) - height2), iArr2, fArr2, Shader.TileMode.CLAMP);
                        this.LJIILLIIL.LJI(LJFF2, LJ2);
                    }
                    paint2.setShader(LJ2);
                }
                super.LIZJ(canvas, matrix, i);
            }
        };
    }

    public C38791ff(String str, EnumC271414s enumC271414s, C44461oo c44461oo, C44471op c44471op, C44481oq c44481oq, C44481oq c44481oq2, C44451on c44451on, EnumC272114z enumC272114z, AnonymousClass150 anonymousClass150, float f, List<C44451on> list, C44451on c44451on2) {
        this.LIZ = str;
        this.LIZIZ = enumC271414s;
        this.LIZJ = c44461oo;
        this.LIZLLL = c44471op;
        this.LJ = c44481oq;
        this.LJFF = c44481oq2;
        this.LJI = c44451on;
        this.LJII = enumC272114z;
        this.LJIIIIZZ = anonymousClass150;
        this.LJIIIZ = f;
        this.LJIIJ = list;
        this.LJIIJJI = c44451on2;
    }
}
