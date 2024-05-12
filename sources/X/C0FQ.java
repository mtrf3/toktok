package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: X.0FQ, reason: invalid class name */
/* loaded from: classes.dex */
public class C0FQ extends Drawable.ConstantState {
    public int LIZ;
    public C0FP LIZIZ;
    public ColorStateList LIZJ;
    public PorterDuff.Mode LIZLLL;
    public boolean LJ;
    public Bitmap LJFF;
    public ColorStateList LJI;
    public PorterDuff.Mode LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public Paint LJIIJJI;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C40681ii(this);
    }

    public C0FQ() {
        this.LIZLLL = C40681ii.LJLL;
        this.LIZIZ = new C0FP();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.LIZ;
    }

    public C0FQ(C0FQ c0fq) {
        this.LIZLLL = C40681ii.LJLL;
        if (c0fq != null) {
            this.LIZ = c0fq.LIZ;
            C0FP c0fp = new C0FP(c0fq.LIZIZ);
            this.LIZIZ = c0fp;
            if (c0fq.LIZIZ.LJ != null) {
                c0fp.LJ = new Paint(c0fq.LIZIZ.LJ);
            }
            if (c0fq.LIZIZ.LIZLLL != null) {
                this.LIZIZ.LIZLLL = new Paint(c0fq.LIZIZ.LIZLLL);
            }
            this.LIZJ = c0fq.LIZJ;
            this.LIZLLL = c0fq.LIZLLL;
            this.LJ = c0fq.LJ;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C40681ii(this);
    }
}
