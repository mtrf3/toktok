package X;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.VhJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80421VhJ extends Drawable.ConstantState {
    public C80416VhE LIZ;
    public V1F LIZIZ;
    public ColorStateList LIZJ;
    public ColorStateList LIZLLL;
    public final ColorStateList LJ;
    public ColorStateList LJFF;
    public PorterDuff.Mode LJI;
    public Rect LJII;
    public final float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public int LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public final float LJIILJJIL;
    public final int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public boolean LJIJI;
    public final Paint.Style LJIJJ;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C80418VhG c80418VhG = new C80418VhG(this);
        c80418VhG.LJLJJL = true;
        return c80418VhG;
    }

    public C80421VhJ(C80421VhJ c80421VhJ) {
        this.LJI = PorterDuff.Mode.SRC_IN;
        this.LJIIIIZZ = 1.0f;
        this.LJIIIZ = 1.0f;
        this.LJIIJJI = 255;
        this.LJIJJ = Paint.Style.FILL_AND_STROKE;
        this.LIZ = c80421VhJ.LIZ;
        this.LIZIZ = c80421VhJ.LIZIZ;
        this.LJIIJ = c80421VhJ.LJIIJ;
        this.LIZJ = c80421VhJ.LIZJ;
        this.LIZLLL = c80421VhJ.LIZLLL;
        this.LJI = c80421VhJ.LJI;
        this.LJFF = c80421VhJ.LJFF;
        this.LJIIJJI = c80421VhJ.LJIIJJI;
        this.LJIIIIZZ = c80421VhJ.LJIIIIZZ;
        this.LJIIZILJ = c80421VhJ.LJIIZILJ;
        this.LJIILL = c80421VhJ.LJIILL;
        this.LJIJI = c80421VhJ.LJIJI;
        this.LJIIIZ = c80421VhJ.LJIIIZ;
        this.LJIIL = c80421VhJ.LJIIL;
        this.LJIILIIL = c80421VhJ.LJIILIIL;
        this.LJIILJJIL = c80421VhJ.LJIILJJIL;
        this.LJIILLIIL = c80421VhJ.LJIILLIIL;
        this.LJIJ = c80421VhJ.LJIJ;
        this.LJ = c80421VhJ.LJ;
        this.LJIJJ = c80421VhJ.LJIJJ;
        if (c80421VhJ.LJII != null) {
            this.LJII = new Rect(c80421VhJ.LJII);
        }
    }

    public C80421VhJ(C80416VhE c80416VhE) {
        this.LJI = PorterDuff.Mode.SRC_IN;
        this.LJIIIIZZ = 1.0f;
        this.LJIIIZ = 1.0f;
        this.LJIIJJI = 255;
        this.LJIJJ = Paint.Style.FILL_AND_STROKE;
        this.LIZ = c80416VhE;
        this.LIZIZ = null;
    }
}
