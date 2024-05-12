package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.0FR, reason: invalid class name */
/* loaded from: classes.dex */
public class C0FR extends Drawable.ConstantState {
    public final Drawable.ConstantState LIZ;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.LIZ.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.LIZ.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C40681ii c40681ii = new C40681ii();
        c40681ii.LJLIL = this.LIZ.newDrawable();
        return c40681ii;
    }

    public C0FR(Drawable.ConstantState constantState) {
        this.LIZ = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C40681ii c40681ii = new C40681ii();
        c40681ii.LJLIL = this.LIZ.newDrawable(resources);
        return c40681ii;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C40681ii c40681ii = new C40681ii();
        c40681ii.LJLIL = this.LIZ.newDrawable(resources, theme);
        return c40681ii;
    }
}
