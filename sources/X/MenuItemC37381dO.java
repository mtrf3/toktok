package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: X.1dO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemC37381dO extends AbstractC261710z implements MenuItem {
    public final C0XU LIZLLL;
    public Method LJ;

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.LIZLLL.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.LIZLLL.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        AbstractC16150kF LIZ = this.LIZLLL.LIZ();
        if (LIZ instanceof C37361dM) {
            return ((C37361dM) LIZ).LIZJ;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.LIZLLL.getActionView();
        if (actionView instanceof C37371dN) {
            return (View) ((C37371dN) actionView).LJLIL;
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.LIZLLL.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.LIZLLL.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.LIZLLL.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.LIZLLL.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.LIZLLL.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.LIZLLL.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.LIZLLL.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.LIZLLL.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.LIZLLL.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.LIZLLL.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.LIZLLL.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.LIZLLL.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.LIZLLL.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return LJ(this.LIZLLL.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.LIZLLL.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.LIZLLL.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.LIZLLL.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.LIZLLL.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.LIZLLL.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.LIZLLL.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.LIZLLL.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.LIZLLL.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.LIZLLL.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProviderVisibilityListenerC44201oO actionProviderVisibilityListenerC44201oO = new ActionProviderVisibilityListenerC44201oO(this, (Context) this.LIZ, actionProvider);
        C0XU c0xu = this.LIZLLL;
        if (actionProvider == null) {
            actionProviderVisibilityListenerC44201oO = null;
        }
        c0xu.LIZIZ(actionProviderVisibilityListenerC44201oO);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        this.LIZLLL.setActionView(i);
        View actionView = this.LIZLLL.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.LIZLLL.setActionView(new C37371dN(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.LIZLLL.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.LIZLLL.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.LIZLLL.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.LIZLLL.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.LIZLLL.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.LIZLLL.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.LIZLLL.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.LIZLLL.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.LIZLLL.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.LIZLLL.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(final MenuItem.OnActionExpandListener onActionExpandListener) {
        MenuItem.OnActionExpandListener onActionExpandListener2;
        C0XU c0xu = this.LIZLLL;
        if (onActionExpandListener != null) {
            onActionExpandListener2 = new MenuItem.OnActionExpandListener(onActionExpandListener) { // from class: X.110
                public final MenuItem.OnActionExpandListener LIZ;

                @Override // android.view.MenuItem.OnActionExpandListener
                public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
                    return this.LIZ.onMenuItemActionCollapse(MenuItemC37381dO.this.LIZLLL(menuItem));
                }

                @Override // android.view.MenuItem.OnActionExpandListener
                public final boolean onMenuItemActionExpand(MenuItem menuItem) {
                    return this.LIZ.onMenuItemActionExpand(MenuItemC37381dO.this.LIZLLL(menuItem));
                }

                {
                    this.LIZ = onActionExpandListener;
                }
            };
        } else {
            onActionExpandListener2 = null;
        }
        c0xu.setOnActionExpandListener(onActionExpandListener2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(final MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener2;
        C0XU c0xu = this.LIZLLL;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener2 = new MenuItem.OnMenuItemClickListener(onMenuItemClickListener) { // from class: X.111
                public final MenuItem.OnMenuItemClickListener LIZ;

                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return this.LIZ.onMenuItemClick(MenuItemC37381dO.this.LIZLLL(menuItem));
                }

                {
                    this.LIZ = onMenuItemClickListener;
                }
            };
        } else {
            onMenuItemClickListener2 = null;
        }
        c0xu.setOnMenuItemClickListener(onMenuItemClickListener2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.LIZLLL.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.LIZLLL.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.LIZLLL.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.LIZLLL.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.LIZLLL.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.LIZLLL.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C37371dN(view);
        }
        this.LIZLLL.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.LIZLLL.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.LIZLLL.setTitle(charSequence);
        return this;
    }

    public MenuItemC37381dO(Context context, C0XU c0xu) {
        super(context);
        if (c0xu != null) {
            this.LIZLLL = c0xu;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.LIZLLL.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.LIZLLL.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.LIZLLL.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.LIZLLL.setShortcut(c, c2, i, i2);
        return this;
    }
}
