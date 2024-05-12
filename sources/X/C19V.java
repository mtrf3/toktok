package X;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import o3.h0;

/* renamed from: X.19V, reason: invalid class name */
/* loaded from: classes.dex */
public final class C19V extends C013303l {
    public final SeekBar LIZLLL;
    public Drawable LJ;
    public ColorStateList LJFF;
    public PorterDuff.Mode LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;

    public final void LIZJ() {
        Drawable drawable = this.LJ;
        if (drawable != null) {
            if (this.LJII || this.LJIIIIZZ) {
                Drawable LJFF = C07840Sm.LJFF(drawable.mutate());
                this.LJ = LJFF;
                if (this.LJII) {
                    C07820Sk.LJII(LJFF, this.LJFF);
                }
                if (this.LJIIIIZZ) {
                    C07820Sk.LJIIIIZZ(this.LJ, this.LJI);
                }
                if (this.LJ.isStateful()) {
                    this.LJ.setState(this.LIZLLL.getDrawableState());
                }
            }
        }
    }

    public C19V(SeekBar seekBar) {
        super(seekBar);
        this.LIZLLL = seekBar;
    }

    public final void LIZLLL(Canvas canvas) {
        int i;
        if (this.LJ != null) {
            int max = this.LIZLLL.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.LJ.getIntrinsicWidth();
                int intrinsicHeight = this.LJ.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.LJ.setBounds(-i, -i2, i, i2);
                float width = ((this.LIZLLL.getWidth() - this.LIZLLL.getPaddingLeft()) - this.LIZLLL.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.LIZLLL.getPaddingLeft(), this.LIZLLL.getHeight() / 2);
                int i3 = 0;
                do {
                    this.LJ.draw(canvas);
                    canvas.translate(width, 0.0f);
                    i3++;
                } while (i3 <= max);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // X.C013303l
    public final void LIZ(AttributeSet attributeSet, int i) {
        super.LIZ(attributeSet, i);
        AnonymousClass033 LJIILIIL = AnonymousClass033.LJIILIIL(this.LIZLLL.getContext(), attributeSet, new int[]{R.attr.thumb, com.zhiliaoapp.musically.R.attr.bj7, com.zhiliaoapp.musically.R.attr.bj8, com.zhiliaoapp.musically.R.attr.bj9}, i, 0);
        SeekBar seekBar = this.LIZLLL;
        h0.LJIJ(seekBar, seekBar.getContext(), new int[]{R.attr.thumb, com.zhiliaoapp.musically.R.attr.bj7, com.zhiliaoapp.musically.R.attr.bj8, com.zhiliaoapp.musically.R.attr.bj9}, attributeSet, LJIILIIL.LIZIZ, i);
        Drawable LJFF = LJIILIIL.LJFF(0);
        if (LJFF != null) {
            this.LIZLLL.setThumb(LJFF);
        }
        Drawable LJ = LJIILIIL.LJ(1);
        Drawable drawable = this.LJ;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.LJ = LJ;
        if (LJ != null) {
            LJ.setCallback(this.LIZLLL);
            C07840Sm.LIZJ(LJ, C16310kV.LIZLLL(this.LIZLLL));
            if (LJ.isStateful()) {
                LJ.setState(this.LIZLLL.getDrawableState());
            }
            LIZJ();
        }
        this.LIZLLL.invalidate();
        if (LJIILIIL.LJIIJJI(3)) {
            this.LJI = C03D.LIZLLL(LJIILIIL.LJII(3, -1), this.LJI);
            this.LJIIIIZZ = true;
        }
        if (LJIILIIL.LJIIJJI(2)) {
            this.LJFF = LJIILIIL.LIZIZ(2);
            this.LJII = true;
        }
        LJIILIIL.LJIILJJIL();
        LIZJ();
    }
}
