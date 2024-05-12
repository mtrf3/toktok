package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* renamed from: X.03L, reason: invalid class name */
/* loaded from: classes.dex */
public final class C03L {
    public final CheckedTextView LIZ;
    public ColorStateList LIZIZ;
    public PorterDuff.Mode LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final void LIZ() {
        Drawable checkMarkDrawable = this.LIZ.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.LIZLLL || this.LJ) {
                Drawable mutate = C07840Sm.LJFF(checkMarkDrawable).mutate();
                if (this.LIZLLL) {
                    C07820Sk.LJII(mutate, this.LIZIZ);
                }
                if (this.LJ) {
                    C07820Sk.LJIIIIZZ(mutate, this.LIZJ);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.LIZ.getDrawableState());
                }
                this.LIZ.setCheckMarkDrawable(mutate);
            }
        }
    }

    public C03L(CheckedTextView checkedTextView) {
        this.LIZ = checkedTextView;
    }
}
