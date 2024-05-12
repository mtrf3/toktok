package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.1hN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class SubMenuC39851hN extends C281318n implements SubMenu {
    public final C281318n LJJIFFI;
    public final C281618q LJJII;

    @Override // X.C281318n
    public final String LJIIIZ() {
        int i;
        C281618q c281618q = this.LJJII;
        if (c281618q == null || (i = c281618q.LIZ) == 0) {
            return null;
        }
        return YE1.LIZIZ("android:menu:actionviewstates", ":", i);
    }

    @Override // X.C281318n
    public final C281318n LJIIJ() {
        return this.LJJIFFI.LJIIJ();
    }

    @Override // X.C281318n
    public final boolean LJIIL() {
        return this.LJJIFFI.LJIIL();
    }

    @Override // X.C281318n
    public final boolean LJIILIIL() {
        return this.LJJIFFI.LJIILIIL();
    }

    @Override // X.C281318n
    public final boolean LJIILJJIL() {
        return this.LJJIFFI.LJIILJJIL();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.LJJII;
    }

    @Override // X.C281318n
    public final boolean LIZLLL(C281618q c281618q) {
        return this.LJJIFFI.LIZLLL(c281618q);
    }

    @Override // X.C281318n
    public final boolean LJFF(C281618q c281618q) {
        return this.LJJIFFI.LJFF(c281618q);
    }

    @Override // X.C281318n, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.LJJIFFI.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        LJIL(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        LJIL(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        LJIL(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.LJJII.setIcon(i);
        return this;
    }

    @Override // X.C281318n, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.LJJIFFI.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        LJIL(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        LJIL(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.LJJII.setIcon(drawable);
        return this;
    }

    @Override // X.C281318n
    public final boolean LJ(C281318n c281318n, MenuItem menuItem) {
        if (super.LJ(c281318n, menuItem) || this.LJJIFFI.LJ(c281318n, menuItem)) {
            return true;
        }
        return false;
    }

    public SubMenuC39851hN(Context context, C281318n c281318n, C281618q c281618q) {
        super(context);
        this.LJJIFFI = c281318n;
        this.LJJII = c281618q;
    }
}
