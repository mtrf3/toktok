package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1fn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38871fn implements InterfaceC271214q {
    public final String LIZ;
    public final C44451on LIZIZ;
    public final List<C44451on> LIZJ;
    public final C44441om LIZLLL;
    public final C44471op LJ;
    public final C44451on LJFF;
    public final EnumC272114z LJI;
    public final AnonymousClass150 LJII;
    public final float LJIIIIZZ;

    @Override // X.InterfaceC271214q
    public final InterfaceC20640rU LIZ(final C04740Go c04740Go, final AbstractC45041pk abstractC45041pk) {
        return new AbstractC43601nQ(c04740Go, abstractC45041pk, this) { // from class: X.24F
            public final AbstractC45041pk LJIILJJIL;
            public final String LJIILL;
            public final C43741ne LJIILLIIL;
            public C35171Zp LJIIZILJ;

            @Override // X.InterfaceC20640rU
            public final String getName() {
                return this.LJIILL;
            }

            @Override // X.AbstractC43601nQ, X.InterfaceC263811u
            public final <T> void LIZIZ(T t, C06800Om<T> c06800Om) {
                C35171Zp c35171Zp;
                super.LIZIZ(t, c06800Om);
                if (t == C0GO.LIZIZ) {
                    LJIIJ(c06800Om);
                    return;
                }
                if (t != C0GO.LJJ) {
                    return;
                }
                if (C03970Dp.LIZ && (c35171Zp = this.LJIIZILJ) != null) {
                    ((ArrayList) this.LJIILJJIL.LJIJI).remove(c35171Zp);
                }
                if (c06800Om == null) {
                    this.LJIIZILJ = null;
                    return;
                }
                C35171Zp c35171Zp2 = new C35171Zp(c06800Om);
                this.LJIIZILJ = c35171Zp2;
                c35171Zp2.LIZ(this);
                this.LJIILJJIL.LJFF(this.LJIILLIIL);
            }

            {
                Paint.Cap paintCap = this.LJI.toPaintCap();
                Paint.Join paintJoin = this.LJII.toPaintJoin();
                float f = this.LJIIIIZZ;
                C44471op c44471op = this.LJ;
                C44451on c44451on = this.LJFF;
                List<C44451on> list = this.LIZJ;
                C44451on c44451on2 = this.LIZIZ;
                this.LJIILJJIL = abstractC45041pk;
                this.LJIILL = this.LIZ;
                AbstractC22650uj<Integer, Integer> LIZ = this.LIZLLL.LIZ();
                this.LJIILLIIL = (C43741ne) LIZ;
                LIZ.LIZ(this);
                abstractC45041pk.LJFF(LIZ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC43601nQ, X.InterfaceC34831Yh
            public final void LIZJ(Canvas canvas, Matrix matrix, int i) {
                this.LJIIIIZZ.setColor(LJI().intValue());
                C35171Zp c35171Zp = this.LJIIZILJ;
                if (c35171Zp != null) {
                    this.LJIIIIZZ.setColorFilter((ColorFilter) c35171Zp.LJI());
                }
                super.LIZJ(canvas, matrix, i);
            }
        };
    }

    public C38871fn(String str, C44451on c44451on, List<C44451on> list, C44441om c44441om, C44471op c44471op, C44451on c44451on2, EnumC272114z enumC272114z, AnonymousClass150 anonymousClass150, float f) {
        this.LIZ = str;
        this.LIZIZ = c44451on;
        this.LIZJ = list;
        this.LIZLLL = c44441om;
        this.LJ = c44471op;
        this.LJFF = c44451on2;
        this.LJI = enumC272114z;
        this.LJII = anonymousClass150;
        this.LJIIIIZZ = f;
    }
}
