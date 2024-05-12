package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: X.10z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC261710z {
    public Object LIZ;
    public Object LIZIZ;
    public Object LIZJ;

    public abstract void LIZJ();

    public abstract void LJFF();

    public abstract void LJI(C80878Vog c80878Vog);

    public abstract void LJII();

    public abstract void LJIIIIZZ();

    public abstract void LJIIIZ();

    public abstract void LJIIJ(float f, float f2, float f3, RectF rectF, float f4);

    public /* synthetic */ AbstractC261710z(int i) {
        this.LIZIZ = new float[i * 2];
        this.LIZJ = new int[i];
    }

    public final MenuItem LIZLLL(MenuItem menuItem) {
        if (menuItem instanceof C0XU) {
            C0XU c0xu = (C0XU) menuItem;
            if (this.LIZIZ == null) {
                this.LIZIZ = new C0MA();
            }
            MenuItem menuItem2 = (MenuItem) ((C0MA) this.LIZIZ).getOrDefault(menuItem, null);
            if (menuItem2 == null) {
                MenuItemC37381dO menuItemC37381dO = new MenuItemC37381dO((Context) this.LIZ, c0xu);
                ((C0MA) this.LIZIZ).put(c0xu, menuItemC37381dO);
                return menuItemC37381dO;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public final SubMenu LJ(SubMenu subMenu) {
        if (subMenu instanceof C1OP) {
            C1OP c1op = (C1OP) subMenu;
            if (this.LIZJ == null) {
                this.LIZJ = new C0MA();
            }
            SubMenu subMenu2 = (SubMenu) ((C0MA) this.LIZJ).getOrDefault(c1op, null);
            if (subMenu2 == null) {
                SubMenuC44211oP subMenuC44211oP = new SubMenuC44211oP((Context) this.LIZ, c1op);
                ((C0MA) this.LIZJ).put(c1op, subMenuC44211oP);
                return subMenuC44211oP;
            }
            return subMenu2;
        }
        return subMenu;
    }

    public /* synthetic */ AbstractC261710z(KLL kll, KLL kll2) {
        this.LIZ = kll;
        this.LIZIZ = kll2;
        this.LIZJ = new C56237M5h(kll, kll2);
    }

    public void LJIIJJI(float f, float f2, RectF rectF, float f3) {
        C56237M5h c56237M5h = (C56237M5h) this.LIZJ;
        KLL kll = (KLL) c56237M5h.LIZ;
        KLL kll2 = (KLL) c56237M5h.LIZIZ;
        if (kll != null) {
            kll.adjustCoordinate(f, f2, rectF, f3, 1.0f);
        }
        if (kll2 != null) {
            kll2.adjustCoordinate(f, f2, rectF, f3, 1.0f);
        }
    }
}
