package X;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0MP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0MP {
    public final InterfaceC65784Pro<C76800UCe> LIZ;
    public C10390ax LIZIZ;
    public InterfaceC65784Pro<C76800UCe> LIZJ;
    public InterfaceC65784Pro<C76800UCe> LIZLLL;
    public InterfaceC65784Pro<C76800UCe> LJ;
    public InterfaceC65784Pro<C76800UCe> LJFF;

    public C0MP(IDqS420S0100000 iDqS420S0100000) {
        C10390ax c10390ax = C10390ax.LJ;
        this.LIZ = iDqS420S0100000;
        this.LIZIZ = c10390ax;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
    }

    public static void LIZ(Menu menu, C0MN item) {
        o.LJIIIZ(menu, "menu");
        o.LJIIIZ(item, "item");
        menu.add(0, item.getId(), item.getOrder(), item.getTitleResource()).setShowAsAction(1);
    }

    public final boolean LIZJ(ActionMode actionMode, MenuItem menuItem) {
        o.LJI(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == C0MN.Copy.getId()) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZJ;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        } else if (itemId == C0MN.Paste.getId()) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LIZLLL;
            if (interfaceC65784Pro2 != null) {
                interfaceC65784Pro2.invoke();
            }
        } else if (itemId == C0MN.Cut.getId()) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = this.LJ;
            if (interfaceC65784Pro3 != null) {
                interfaceC65784Pro3.invoke();
            }
        } else if (itemId == C0MN.SelectAll.getId()) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = this.LJFF;
            if (interfaceC65784Pro4 != null) {
                interfaceC65784Pro4.invoke();
            }
        } else {
            return false;
        }
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        return true;
    }

    public final void LIZLLL(ActionMode actionMode, Menu menu) {
        if (menu != null) {
            if (actionMode != null) {
                if (this.LIZJ != null) {
                    LIZ(menu, C0MN.Copy);
                }
                if (this.LIZLLL != null) {
                    LIZ(menu, C0MN.Paste);
                }
                if (this.LJ != null) {
                    LIZ(menu, C0MN.Cut);
                }
                if (this.LJFF != null) {
                    LIZ(menu, C0MN.SelectAll);
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final boolean LJ(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        LIZIZ(menu, C0MN.Copy, this.LIZJ);
        LIZIZ(menu, C0MN.Paste, this.LIZLLL);
        LIZIZ(menu, C0MN.Cut, this.LJ);
        LIZIZ(menu, C0MN.SelectAll, this.LJFF);
        return true;
    }

    public static void LIZIZ(Menu menu, C0MN c0mn, InterfaceC65784Pro interfaceC65784Pro) {
        if (interfaceC65784Pro != null) {
            if (menu.findItem(c0mn.getId()) == null) {
                LIZ(menu, c0mn);
            }
        } else {
            if (menu.findItem(c0mn.getId()) == null) {
                return;
            }
            menu.removeItem(c0mn.getId());
        }
    }
}
