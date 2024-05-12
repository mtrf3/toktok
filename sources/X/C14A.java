package X;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.14A, reason: invalid class name */
/* loaded from: classes.dex */
public final class C14A {
    public java.util.Set<DialogInterface> LIZ;
    public java.util.Set<DialogFragment> LIZIZ;
    public boolean LIZJ;

    public final void LIZIZ() {
        if (!C259710f.LIZ.LJII) {
            return;
        }
        java.util.Set<DialogInterface> set = this.LIZ;
        if (set != null && !((HashSet) set).isEmpty()) {
            Iterator it = new HashSet(this.LIZ).iterator();
            while (it.hasNext()) {
                ((DialogInterface) it.next()).cancel();
            }
            ((HashSet) this.LIZ).clear();
        }
        java.util.Set<DialogFragment> set2 = this.LIZIZ;
        if (set2 != null && !((HashSet) set2).isEmpty()) {
            Iterator it2 = new HashSet(this.LIZIZ).iterator();
            while (it2.hasNext()) {
                ((DialogFragment) it2.next()).dismiss();
            }
            ((HashSet) this.LIZIZ).clear();
        }
    }

    public final boolean LIZJ() {
        java.util.Set<DialogInterface> set = this.LIZ;
        if (set != null && !((HashSet) set).isEmpty()) {
            Iterator it = ((HashSet) this.LIZ).iterator();
            while (it.hasNext()) {
                DialogInterface dialogInterface = (DialogInterface) it.next();
                if ((dialogInterface instanceof Dialog) && ((Dialog) dialogInterface).isShowing()) {
                    return true;
                }
            }
        }
        java.util.Set<DialogFragment> set2 = this.LIZIZ;
        if (set2 != null && !((HashSet) set2).isEmpty()) {
            Iterator it2 = ((HashSet) this.LIZIZ).iterator();
            while (it2.hasNext()) {
                Dialog dialog = ((DialogFragment) it2.next()).getDialog();
                if (dialog != null && dialog.isShowing()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LIZLLL() {
        if (C259710f.LIZ.LJI && this.LIZJ) {
            return true;
        }
        return false;
    }

    public final void LIZ(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            if (this.LIZ == null) {
                this.LIZ = new HashSet();
            }
            this.LIZ.add(dialogInterface);
        }
    }

    public final void LJ(DialogInterface dialogInterface) {
        java.util.Set<DialogInterface> set;
        if (dialogInterface != null && (set = this.LIZ) != null) {
            ((HashSet) set).remove(dialogInterface);
        }
    }

    public final void LJFF(boolean z) {
        if (C259710f.LIZ.LJI) {
            this.LIZJ = z;
        }
    }
}
