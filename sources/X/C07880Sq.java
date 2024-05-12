package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: X.0Sq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07880Sq extends Drawable.ConstantState {
    public int LIZ;
    public Drawable.ConstantState LIZIZ;
    public ColorStateList LIZJ;
    public PorterDuff.Mode LIZLLL;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i;
        int i2 = this.LIZ;
        Drawable.ConstantState constantState = this.LIZIZ;
        if (constantState != null) {
            i = constantState.getChangingConfigurations();
        } else {
            i = 0;
        }
        return i2 | i;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C42001kq(this, null);
    }

    public C07880Sq(C07880Sq c07880Sq) {
        this.LIZLLL = C1M6.LJLJL;
        if (c07880Sq != null) {
            this.LIZ = c07880Sq.LIZ;
            this.LIZIZ = c07880Sq.LIZIZ;
            this.LIZJ = c07880Sq.LIZJ;
            this.LIZLLL = c07880Sq.LIZLLL;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C42001kq(this, resources);
    }
}
