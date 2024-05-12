package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Zjd, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90757Zjd extends AbstractC90446Zec {
    public final ImageView LIZIZ;
    public final View LIZJ;
    public final boolean LIZLLL;
    public final Drawable LJ;
    public final String LJFF;
    public final Drawable LJI;
    public final String LJII;
    public final Drawable LJIIIIZZ;
    public final String LJIIIZ;
    public boolean LJIIJ;

    @Override // X.AbstractC90446Zec
    public final void LIZJ() {
        LJI(true);
    }

    @Override // X.AbstractC90446Zec
    public final void LJ() {
        this.LIZIZ.setEnabled(false);
        this.LIZ = null;
    }

    public final void LJII() {
        C90639Zhj c90639Zhj = this.LIZ;
        if (c90639Zhj == null || !c90639Zhj.LJIIIZ()) {
            this.LIZIZ.setEnabled(false);
            return;
        }
        if (c90639Zhj.LJIILJJIL()) {
            if (c90639Zhj.LJIIJJI()) {
                LJFF(this.LJIIIZ, this.LJIIIIZZ);
                return;
            } else {
                LJFF(this.LJII, this.LJI);
                return;
            }
        }
        if (c90639Zhj.LJIIJ()) {
            LJI(false);
            return;
        }
        if (c90639Zhj.LJIILIIL()) {
            LJFF(this.LJFF, this.LJ);
        } else if (c90639Zhj.LJIIL()) {
            LJI(true);
        }
    }

    @Override // X.AbstractC90446Zec
    public final void LIZIZ() {
        LJII();
    }

    @Override // X.AbstractC90446Zec
    public final void LIZLLL(C90613ZhJ c90613ZhJ) {
        super.LIZLLL(c90613ZhJ);
        LJII();
    }

    public final void LJI(boolean z) {
        this.LJIIJ = this.LIZIZ.isAccessibilityFocused();
        View view = this.LIZJ;
        int i = 0;
        if (view != null) {
            view.setVisibility(0);
            if (this.LJIIJ) {
                this.LIZJ.sendAccessibilityEvent(8);
            }
        }
        ImageView imageView = this.LIZIZ;
        if (true == this.LIZLLL) {
            i = 4;
        }
        imageView.setVisibility(i);
        this.LIZIZ.setEnabled(!z);
    }

    public final void LJFF(String str, Drawable drawable) {
        boolean z = !drawable.equals(this.LIZIZ.getDrawable());
        this.LIZIZ.setImageDrawable(drawable);
        this.LIZIZ.setContentDescription(str);
        this.LIZIZ.setVisibility(0);
        this.LIZIZ.setEnabled(true);
        View view = this.LIZJ;
        if (view != null) {
            view.setVisibility(8);
        }
        if (z && this.LJIIJ) {
            this.LIZIZ.sendAccessibilityEvent(8);
        }
    }

    public C90757Zjd(ImageView imageView, Context context, Drawable drawable, Drawable drawable2, Drawable drawable3, View view) {
        this.LIZIZ = imageView;
        this.LJ = drawable;
        this.LJI = drawable2;
        this.LJIIIIZZ = drawable3 != null ? drawable3 : drawable2;
        this.LJFF = context.getString(R.string.a3);
        this.LJII = context.getString(R.string.a2);
        this.LJIIIZ = context.getString(R.string.a_);
        this.LIZJ = view;
        this.LIZLLL = true;
        imageView.setEnabled(false);
    }
}
