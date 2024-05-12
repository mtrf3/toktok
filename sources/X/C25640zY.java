package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: X.0zY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C25640zY {
    public final Menu LIZ;
    public int LIZIZ = 0;
    public int LIZJ = 0;
    public int LIZLLL = 0;
    public int LJ = 0;
    public boolean LJFF = true;
    public boolean LJI = true;
    public boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public CharSequence LJIIJ;
    public CharSequence LJIIJJI;
    public int LJIIL;
    public char LJIILIIL;
    public int LJIILJJIL;
    public char LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public String LJJ;
    public String LJJI;
    public AbstractC16150kF LJJIFFI;
    public CharSequence LJJII;
    public CharSequence LJJIII;
    public ColorStateList LJJIIJ;
    public PorterDuff.Mode LJJIIJZLJL;
    public final /* synthetic */ C25650zZ LJJIIZ;

    public final void LIZ(MenuItem menuItem) {
        boolean z;
        Object obj;
        MenuItem enabled = menuItem.setChecked(this.LJIJ).setVisible(this.LJIJI).setEnabled(this.LJIJJ);
        boolean z2 = false;
        if (this.LJIIZILJ >= 1) {
            z = true;
        } else {
            z = false;
        }
        enabled.setCheckable(z).setTitleCondensed(this.LJIIJJI).setIcon(this.LJIIL);
        int i = this.LJIJJLI;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.LJJI != null) {
            if (!this.LJJIIZ.LIZJ.isRestricted()) {
                C25650zZ c25650zZ = this.LJJIIZ;
                if (c25650zZ.LIZLLL == null) {
                    c25650zZ.LIZLLL = C25650zZ.LIZ(c25650zZ.LIZJ);
                }
                final Object obj2 = c25650zZ.LIZLLL;
                final String str = this.LJJI;
                menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(obj2, str) { // from class: X.0zX
                    public static final Class<?>[] LIZJ = {MenuItem.class};
                    public final Object LIZ;
                    public final Method LIZIZ;

                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem2) {
                        try {
                            if (this.LIZIZ.getReturnType() == Boolean.TYPE) {
                                return ((Boolean) this.LIZIZ.invoke(this.LIZ, menuItem2)).booleanValue();
                            }
                            this.LIZIZ.invoke(this.LIZ, menuItem2);
                            return true;
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                    {
                        this.LIZ = obj2;
                        Class<?> cls = obj2.getClass();
                        try {
                            this.LIZIZ = cls.getMethod(str, LIZJ);
                        } catch (Exception e) {
                            StringBuilder LIZIZ = C25620zW.LIZIZ("Couldn't resolve menu item onClick handler ", str, " in class ");
                            LIZIZ.append(cls.getName());
                            InflateException inflateException = new InflateException(X1D.LIZIZ(LIZIZ));
                            inflateException.initCause(e);
                            throw inflateException;
                        }
                    }
                });
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.LJIIZILJ >= 2) {
            if (menuItem instanceof C281618q) {
                ((C281618q) menuItem).LJI(true);
            } else if (menuItem instanceof MenuItemC37381dO) {
                MenuItemC37381dO menuItemC37381dO = (MenuItemC37381dO) menuItem;
                try {
                    if (menuItemC37381dO.LJ == null) {
                        menuItemC37381dO.LJ = menuItemC37381dO.LIZLLL.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC37381dO.LJ.invoke(menuItemC37381dO.LIZLLL, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str2 = this.LJJ;
        if (str2 != null) {
            Class<?>[] clsArr = C25650zZ.LJ;
            C25650zZ c25650zZ2 = this.LJJIIZ;
            Object[] objArr = c25650zZ2.LIZ;
            try {
                Constructor<?> constructor = Class.forName(str2, false, c25650zZ2.LIZJ.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                obj = constructor.newInstance(objArr);
            } catch (Exception unused2) {
                obj = null;
            }
            menuItem.setActionView((View) obj);
            z2 = true;
        }
        int i2 = this.LJIL;
        if (i2 > 0 && !z2) {
            menuItem.setActionView(i2);
        }
        AbstractC16150kF abstractC16150kF = this.LJJIFFI;
        if (abstractC16150kF != null && (menuItem instanceof C0XU)) {
            ((C0XU) menuItem).LIZIZ(abstractC16150kF);
        }
        CharSequence charSequence = this.LJJII;
        boolean z3 = menuItem instanceof C0XU;
        if (z3) {
            ((C0XU) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C16570kv.LJII(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.LJJIII;
        if (z3) {
            ((C0XU) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C16570kv.LJIIL(menuItem, charSequence2);
        }
        char c = this.LJIILIIL;
        int i3 = this.LJIILJJIL;
        if (z3) {
            ((C0XU) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C16570kv.LJI(menuItem, c, i3);
        }
        char c2 = this.LJIILL;
        int i4 = this.LJIILLIIL;
        if (z3) {
            ((C0XU) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C16570kv.LJIIJ(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.LJJIIJZLJL;
        if (mode != null) {
            if (z3) {
                ((C0XU) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C16570kv.LJIIIZ(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.LJJIIJ;
        if (colorStateList != null) {
            if (z3) {
                ((C0XU) menuItem).setIconTintList(colorStateList);
            } else {
                if (Build.VERSION.SDK_INT < 26) {
                    return;
                }
                C16570kv.LJIIIIZZ(menuItem, colorStateList);
            }
        }
    }

    public C25640zY(C25650zZ c25650zZ, Menu menu) {
        this.LJJIIZ = c25650zZ;
        this.LIZ = menu;
    }
}
