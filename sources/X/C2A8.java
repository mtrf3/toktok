package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* renamed from: X.2A8, reason: invalid class name */
/* loaded from: classes.dex */
public class C2A8 extends C47121t6 {
    public final void LJJIJLIJ() {
        for (Drawable drawable : C07Z.LIZ(this)) {
            if (drawable != null && !C07810Sj.LIZLLL(drawable)) {
                drawable.mutate();
                C07810Sj.LJ(drawable, true);
            }
        }
    }

    public final void LJJIL() {
        for (Drawable drawable : getCompoundDrawables()) {
            if (drawable != null && !C07810Sj.LIZLLL(drawable)) {
                drawable.mutate();
                C07810Sj.LJ(drawable, true);
            }
        }
    }

    public C2A8(Context context) {
        super(context, null);
        Drawable background = getBackground();
        if (background != null && !C07810Sj.LIZLLL(background)) {
            background.mutate();
            C07810Sj.LJ(background, true);
        }
        LJJIL();
        LJJIJLIJ();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Drawable background = getBackground();
        if (background != null && !C07810Sj.LIZLLL(background)) {
            background.mutate();
            C07810Sj.LJ(background, true);
        }
    }

    public C2A8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable background = getBackground();
        if (background != null && !C07810Sj.LIZLLL(background)) {
            background.mutate();
            C07810Sj.LJ(background, true);
        }
        LJJIL();
        LJJIJLIJ();
    }

    public C2A8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable background = getBackground();
        if (background != null && !C07810Sj.LIZLLL(background)) {
            background.mutate();
            C07810Sj.LJ(background, true);
        }
        LJJIL();
        LJJIJLIJ();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        LJJIL();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        LJJIJLIJ();
    }
}
