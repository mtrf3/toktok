package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes15.dex */
public final class WA0 implements WAA, WB1 {
    public static final Class<?> LJIILIIL = WA0.class;
    public final AbstractC78853Ux7 LIZ;
    public final WAF LIZIZ;
    public final V9G LIZJ;
    public final WBH LIZLLL;
    public InterfaceC81849WAj LJ;
    public final WBK LJFF;
    public Rect LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public C81828W9o LJIIJJI;
    public Bitmap.Config LJIIJ = Bitmap.Config.ARGB_8888;
    public int LJIIL = -1;
    public final Paint LJI = new Paint(6);

    public final void LJIIL() {
        int width;
        int width2 = ((C81837W9x) this.LIZLLL).LIZIZ.getWidth();
        this.LJIIIIZZ = width2;
        int i = -1;
        if (width2 == -1) {
            Rect rect = this.LJII;
            if (rect == null) {
                width = -1;
            } else {
                width = rect.width();
            }
            this.LJIIIIZZ = width;
        }
        int height = ((C81837W9x) this.LIZLLL).LIZIZ.getHeight();
        this.LJIIIZ = height;
        if (height == -1) {
            Rect rect2 = this.LJII;
            if (rect2 != null) {
                i = rect2.height();
            }
            this.LJIIIZ = i;
        }
    }

    @Override // X.WAA
    public final void clear() {
        this.LIZIZ.clear();
    }

    @Override // X.V9G
    public final int getFrameCount() {
        return this.LIZJ.getFrameCount();
    }

    @Override // X.V9G
    public final int getLoopCount() {
        return this.LIZJ.getLoopCount();
    }

    @Override // X.WAA
    public final int LIZLLL() {
        return this.LJIIIIZZ;
    }

    @Override // X.WB1
    public final void LJ() {
        clear();
    }

    @Override // X.WAA
    public final int LJFF() {
        return this.LJIIIZ;
    }

    @Override // X.V9G
    public final int LIZIZ(int i) {
        return this.LIZJ.LIZIZ(i);
    }

    @Override // X.WAA
    public final void LIZJ(int i) {
        this.LJI.setAlpha(i);
    }

    @Override // X.WAA
    public final void LJI(Rect rect) {
        this.LJII = rect;
        C81837W9x c81837W9x = (C81837W9x) this.LIZLLL;
        WA1 LJFF = c81837W9x.LIZIZ.LJFF(rect);
        if (LJFF != c81837W9x.LIZIZ) {
            c81837W9x.LIZIZ = LJFF;
            c81837W9x.LIZJ = new WAW(LJFF, c81837W9x.LIZLLL);
        }
        LJIIL();
    }

    @Override // X.WAA
    public final void LJII(ColorFilter colorFilter) {
        this.LJI.setColorFilter(colorFilter);
    }

    @Override // X.WAA
    public final boolean LJIIIIZZ(int i) {
        return this.LIZIZ.LIZLLL(i);
    }

    public final boolean LJIIJJI(C81392Vwy c81392Vwy, int i) {
        if (!C81392Vwy.LJIIJJI(c81392Vwy)) {
            return false;
        }
        boolean LIZ = ((C81837W9x) this.LIZLLL).LIZ(i, (Bitmap) c81392Vwy.LJI());
        if (!LIZ) {
            C81392Vwy.LJ(c81392Vwy);
        }
        return LIZ;
    }

    @Override // X.WAA
    public final boolean LIZ(int i, Canvas canvas, Drawable drawable) {
        WBK wbk;
        boolean z;
        boolean z2 = false;
        if (C81796W8i.LIZIZ(this.LJIIJJI)) {
            C81392Vwy c81392Vwy = null;
            try {
                if (i == this.LJIIL) {
                    c81392Vwy = this.LIZIZ.LIZIZ();
                    z = LJIIIZ(i, c81392Vwy, canvas, 3);
                } else {
                    z = false;
                }
                if (!z) {
                    c81392Vwy = this.LIZIZ.LIZJ();
                    if (!LJIIJJI(c81392Vwy, i) || !LJIIIZ(i, c81392Vwy, canvas, 1)) {
                        try {
                            c81392Vwy = this.LIZ.LJ(this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ);
                            if (LJIIJJI(c81392Vwy, i) && LJIIIZ(i, c81392Vwy, canvas, 2)) {
                                z2 = true;
                            }
                            C81392Vwy.LJ(c81392Vwy);
                            this.LJIIL = i;
                        } catch (Throwable th) {
                            W58.LJIILLIIL(LJIILIIL, "Failed to create frame bitmap for render heif frame", th);
                            C81392Vwy.LJ(c81392Vwy);
                        }
                    } else {
                        z = true;
                    }
                }
                z2 = z;
                C81392Vwy.LJ(c81392Vwy);
                this.LJIIL = i;
            } catch (Throwable th2) {
                C81392Vwy.LJ(c81392Vwy);
                throw th2;
            }
        } else {
            z2 = LJIIJ(i, 0, canvas);
        }
        InterfaceC81849WAj interfaceC81849WAj = this.LJ;
        if (interfaceC81849WAj != null && (wbk = this.LJFF) != null) {
            interfaceC81849WAj.LIZ(wbk, this.LIZIZ, this, i);
        }
        return z2;
    }

    public final boolean LJIIJ(int i, int i2, Canvas canvas) {
        C81392Vwy LJ;
        boolean z = false;
        int i3 = 1;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return false;
                        }
                        LJ = this.LIZIZ.LIZIZ();
                        z = LJIIIZ(i, LJ, canvas, 3);
                        i3 = -1;
                    } else {
                        try {
                            LJ = this.LIZ.LJ(this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ);
                            if (LJIIJJI(LJ, i) && LJIIIZ(i, LJ, canvas, 2)) {
                                z = true;
                            }
                            i3 = 3;
                        } catch (RuntimeException e) {
                            W58.LJIILLIIL(LJIILIIL, "Failed to create frame bitmap", e);
                            return false;
                        }
                    }
                } else {
                    LJ = this.LIZIZ.LIZJ();
                    if (LJIIJJI(LJ, i) && LJIIIZ(i, LJ, canvas, 1)) {
                        z = true;
                    }
                    i3 = 2;
                }
            } else {
                LJ = this.LIZIZ.LJ(i);
                z = LJIIIZ(i, LJ, canvas, 0);
            }
            C81392Vwy.LJ(LJ);
            if (z || i3 == -1) {
                return z;
            }
            return LJIIJ(i, i3, canvas);
        } catch (Throwable th) {
            C81392Vwy.LJ(null);
            throw th;
        }
    }

    public final boolean LJIIIZ(int i, C81392Vwy<Bitmap> c81392Vwy, Canvas canvas, int i2) {
        if (!C81392Vwy.LJIIJJI(c81392Vwy)) {
            return false;
        }
        try {
            if (this.LJII == null) {
                canvas.drawBitmap(c81392Vwy.LJI(), 0.0f, 0.0f, this.LJI);
            } else {
                canvas.drawBitmap(c81392Vwy.LJI(), (Rect) null, this.LJII, this.LJI);
            }
        } catch (Exception e) {
            W58.LJ(LJIILIIL, "canvas draw error: ", e);
        }
        if (i2 != 3) {
            this.LIZIZ.LJFF(i, c81392Vwy);
            return true;
        }
        return true;
    }

    public WA0(AbstractC78853Ux7 abstractC78853Ux7, WAF waf, WAQ waq, C81837W9x c81837W9x, WA8 wa8, WA3 wa3) {
        this.LIZ = abstractC78853Ux7;
        this.LIZIZ = waf;
        this.LIZJ = waq;
        this.LIZLLL = c81837W9x;
        this.LJ = wa8;
        this.LJFF = wa3;
        LJIIL();
    }
}
