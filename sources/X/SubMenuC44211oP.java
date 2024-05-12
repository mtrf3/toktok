package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.1oP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC44211oP extends MenuC37401dQ implements SubMenu {
    public final C1OP LJ;

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.LJ.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return LIZLLL(this.LJ.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        this.LJ.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        this.LJ.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.LJ.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.LJ.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.LJ.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.LJ.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.LJ.setIcon(drawable);
        return this;
    }

    public SubMenuC44211oP(Context context, C1OP c1op) {
        super(context, c1op);
        this.LJ = c1op;
    }
}
