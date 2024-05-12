package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* renamed from: X.18q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C281618q implements C0XU {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public CharSequence LJ;
    public CharSequence LJFF;
    public Intent LJI;
    public char LJII;
    public char LJIIIZ;
    public Drawable LJIIJJI;
    public int LJIIL;
    public final C281318n LJIILIIL;
    public SubMenuC39851hN LJIILJJIL;
    public MenuItem.OnMenuItemClickListener LJIILL;
    public CharSequence LJIILLIIL;
    public CharSequence LJIIZILJ;
    public ColorStateList LJIJ;
    public PorterDuff.Mode LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public int LJJI;
    public View LJJIFFI;
    public AbstractC16150kF LJJII;
    public MenuItem.OnActionExpandListener LJJIII;
    public boolean LJJIIJ;
    public int LJIIIIZZ = 4096;
    public int LJIIJ = 4096;
    public int LJJ = 16;

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final boolean LJ() {
        AbstractC16150kF abstractC16150kF;
        if ((this.LJJI & 8) == 0) {
            return false;
        }
        if (this.LJJIFFI == null && (abstractC16150kF = this.LJJII) != null) {
            this.LJJIFFI = abstractC16150kF.LIZLLL(this);
        }
        if (this.LJJIFFI == null) {
            return false;
        }
        return true;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.LJJI & 8) == 0) {
            return false;
        }
        if (this.LJJIFFI == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.LJJIII;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.LJIILIIL.LIZLLL(this);
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // X.C0XU, android.view.MenuItem
    public final View getActionView() {
        View view = this.LJJIFFI;
        if (view != null) {
            return view;
        }
        AbstractC16150kF abstractC16150kF = this.LJJII;
        if (abstractC16150kF != null) {
            View LIZLLL = abstractC16150kF.LIZLLL(this);
            this.LJJIFFI = LIZLLL;
            return LIZLLL;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.LJIIJJI;
        if (drawable != null) {
            return LIZLLL(drawable);
        }
        int i = this.LJIIL;
        if (i != 0) {
            Drawable LIZ = C20110qd.LIZ(this.LJIILIIL.LIZ, i);
            this.LJIIL = 0;
            this.LJIIJJI = LIZ;
            return LIZLLL(LIZ);
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.LJFF;
        if (charSequence != null) {
            return charSequence;
        }
        return this.LJ;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.LJIILJJIL != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.LJJ & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.LJJ & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.LJJ & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC16150kF abstractC16150kF = this.LJJII;
        if (abstractC16150kF != null && abstractC16150kF.LJI()) {
            if ((this.LJJ & 8) == 0 && this.LJJII.LIZIZ()) {
                return true;
            }
            return false;
        }
        if ((this.LJJ & 8) == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        CharSequence charSequence = this.LJ;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final boolean expandActionView() {
        if (!LJ()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.LJJIII;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.LJIILIIL.LJFF(this);
    }

    @Override // X.C0XU
    public final AbstractC16150kF LIZ() {
        return this.LJJII;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.LJIIJ;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.LJIIIZ;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.LJIILLIIL;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.LIZIZ;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.LJIJ;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.LJIJI;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.LJI;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.LIZ;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.LJIIIIZZ;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.LJII;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.LIZJ;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.LJIILJJIL;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.LJ;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.LJIIZILJ;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.LJJIIJ;
    }

    @Override // X.C0XU
    public final C0XU LIZIZ(AbstractC16150kF abstractC16150kF) {
        AbstractC16150kF abstractC16150kF2 = this.LJJII;
        if (abstractC16150kF2 != null) {
            abstractC16150kF2.LIZIZ = null;
        }
        this.LJJIFFI = null;
        this.LJJII = abstractC16150kF;
        this.LJIILIIL.LJIILL(true);
        AbstractC16150kF abstractC16150kF3 = this.LJJII;
        if (abstractC16150kF3 != null) {
            abstractC16150kF3.LJII(new C281518p(this));
        }
        return this;
    }

    public final Drawable LIZLLL(Drawable drawable) {
        if (drawable != null && this.LJIL && (this.LJIJJ || this.LJIJJLI)) {
            drawable = C07840Sm.LJFF(drawable).mutate();
            if (this.LJIJJ) {
                C07820Sk.LJII(drawable, this.LJIJ);
            }
            if (this.LJIJJLI) {
                C07820Sk.LJIIIIZZ(drawable, this.LJIJI);
            }
            this.LJIL = false;
        }
        return drawable;
    }

    public final void LJFF(boolean z) {
        this.LJJIIJ = z;
        this.LJIILIIL.LJIILL(false);
    }

    public final void LJI(boolean z) {
        int i;
        int i2 = this.LJJ & (-5);
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.LJJ = i | i2;
    }

    public final void LJII(boolean z) {
        if (z) {
            this.LJJ |= 32;
        } else {
            this.LJJ &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // X.C0XU, android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.LJIILIIL.LIZ;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), i, new LinearLayout(context), false);
        this.LJJIFFI = LLLLIILL;
        this.LJJII = null;
        if (LLLLIILL != null && LLLLIILL.getId() == -1 && (i2 = this.LIZ) > 0) {
            LLLLIILL.setId(i2);
        }
        C281318n c281318n = this.LJIILIIL;
        c281318n.LJIIJ = true;
        c281318n.LJIILL(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.LJIIIZ == c) {
            return this;
        }
        this.LJIIIZ = Character.toLowerCase(c);
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.LJJ;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.LJJ = i2;
        if (i != i2) {
            this.LJIILIIL.LJIILL(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i;
        int i2 = this.LJJ;
        int i3 = 2;
        if ((i2 & 4) != 0) {
            C281318n c281318n = this.LJIILIIL;
            c281318n.getClass();
            int i4 = this.LIZIZ;
            int size = c281318n.LJFF.size();
            c281318n.LJJI();
            for (int i5 = 0; i5 < size; i5++) {
                C281618q c281618q = (C281618q) ListProtector.get(c281318n.LJFF, i5);
                if (c281618q.LIZIZ == i4) {
                    boolean z2 = true;
                    if ((c281618q.LJJ & 4) != 0 && c281618q.isCheckable()) {
                        if (c281618q != this) {
                            z2 = false;
                        }
                        int i6 = c281618q.LJJ;
                        int i7 = i6 & (-3);
                        if (z2) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        int i8 = i | i7;
                        c281618q.LJJ = i8;
                        if (i6 != i8) {
                            c281618q.LJIILIIL.LJIILL(false);
                        }
                    }
                }
            }
            c281318n.LJJ();
        } else {
            int i9 = i2 & (-3);
            if (!z) {
                i3 = 0;
            }
            int i10 = i3 | i9;
            this.LJJ = i10;
            if (i2 != i10) {
                this.LJIILIIL.LJIILL(false);
            }
        }
        return this;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final C0XU setContentDescription(CharSequence charSequence) {
        this.LJIILLIIL = charSequence;
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.LJJ |= 16;
        } else {
            this.LJJ &= -17;
        }
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.LJIIJJI = null;
        this.LJIIL = i;
        this.LJIL = true;
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.LJIJ = colorStateList;
        this.LJIJJ = true;
        this.LJIL = true;
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.LJIJI = mode;
        this.LJIJJLI = true;
        this.LJIL = true;
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.LJI = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.LJII == c) {
            return this;
        }
        this.LJII = c;
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.LJJIII = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.LJIILL = onMenuItemClickListener;
        return this;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.LJJI = i;
            C281318n c281318n = this.LJIILIIL;
            c281318n.LJIIJ = true;
            c281318n.LJIILL(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // X.C0XU, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.LJ = charSequence;
        this.LJIILIIL.LJIILL(false);
        SubMenuC39851hN subMenuC39851hN = this.LJIILJJIL;
        if (subMenuC39851hN != null) {
            subMenuC39851hN.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.LJFF = charSequence;
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final C0XU setTooltipText(CharSequence charSequence) {
        this.LJIIZILJ = charSequence;
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i;
        int i2 = this.LJJ;
        int i3 = i2 & (-9);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.LJJ = i4;
        if (i2 != i4) {
            C281318n c281318n = this.LJIILIIL;
            c281318n.LJII = true;
            c281318n.LJIILL(true);
        }
        return this;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.LJJIFFI = view;
        this.LJJII = null;
        if (view != null && view.getId() == -1 && (i = this.LIZ) > 0) {
            view.setId(i);
        }
        C281318n c281318n = this.LJIILIIL;
        c281318n.LJIIJ = true;
        c281318n.LJIILL(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.LJIIL = 0;
        this.LJIIJJI = drawable;
        this.LJIL = true;
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.LJIILIIL.LIZ.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.LJIIIZ == c && this.LJIIJ == i) {
            return this;
        }
        this.LJIIIZ = Character.toLowerCase(c);
        this.LJIIJ = KeyEvent.normalizeMetaState(i);
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // X.C0XU, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.LJII == c && this.LJIIIIZZ == i) {
            return this;
        }
        this.LJII = c;
        this.LJIIIIZZ = KeyEvent.normalizeMetaState(i);
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.LJII = c;
        this.LJIIIZ = Character.toLowerCase(c2);
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    public static void LIZJ(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // X.C0XU, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.LJII = c;
        this.LJIIIIZZ = KeyEvent.normalizeMetaState(i);
        this.LJIIIZ = Character.toLowerCase(c2);
        this.LJIIJ = KeyEvent.normalizeMetaState(i2);
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    public C281618q(C281318n c281318n, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.LJIILIIL = c281318n;
        this.LIZ = i2;
        this.LIZIZ = i;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = charSequence;
        this.LJJI = i5;
    }
}
