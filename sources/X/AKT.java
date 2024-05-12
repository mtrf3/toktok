package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS91S0101000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AKT {
    public C208158Ex LIZ;
    public Context LIZIZ;
    public final View LIZJ;
    public AKR LIZLLL;

    public final void LIZ() {
        this.LIZ.LJLIL.LJII = false;
        AKR akr = this.LIZLLL;
        if (akr != null) {
            akr.dismiss();
        }
    }

    public final void LJII() {
        Context context = this.LIZIZ;
        View view = this.LIZJ;
        CharSequence charSequence = this.LIZ.LJLIL.LIZIZ;
        if (context == null || view == null || charSequence == null || charSequence.length() == 0) {
            return;
        }
        AKR akr = new AKR(context, view, this.LIZ);
        akr.LIZLLL();
        if (this.LIZ.LJLIL.LJII) {
            AKZ.LIZJ(akr);
        }
        this.LIZLLL = akr;
    }

    public AKT(Dialog dialog) {
        View view;
        o.LJIIIZ(dialog, "dialog");
        this.LIZ = new C208158Ex(0);
        Window window = dialog.getWindow();
        if (window != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        this.LIZJ = view;
        this.LIZIZ = dialog.getContext();
    }

    public final void LIZIZ(InterfaceC65784Pro listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.LJLIL.LJIIIZ = new WeakReference<>(listener);
    }

    public final void LIZJ(long j) {
        this.LIZ.LJLIL.LJ = j;
    }

    public final void LIZLLL(int i) {
        String str;
        C208158Ex c208158Ex = this.LIZ;
        Context context = this.LIZIZ;
        if (context != null) {
            str = context.getString(i);
        } else {
            str = null;
        }
        c208158Ex.LJLJJLL = str;
    }

    public final void LJ(int i) {
        Context context = this.LIZIZ;
        if (context == null) {
            return;
        }
        this.LIZIZ = new C25600zU(context, i);
    }

    public final void LJFF(int i) {
        String str;
        AKW akw = this.LIZ.LJLIL;
        Context context = this.LIZIZ;
        if (context != null) {
            str = context.getString(i);
        } else {
            str = null;
        }
        akw.LIZIZ = str;
    }

    public final void LJI(CharSequence charSequence) {
        this.LIZ.LJLIL.LIZIZ = charSequence;
    }

    public final void LJIIIIZZ(C2068389v c2068389v) {
        int LIZIZ = C7MY.LIZIZ(20);
        this.LIZ.LJLJI = new AqS91S0101000_1(c2068389v, LIZIZ, 0);
    }

    public AKT(Fragment fragment) {
        View view;
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = new C208158Ex(0);
        View view2 = fragment.getView();
        if (view2 != null) {
            view = view2.getRootView();
        } else {
            view = null;
        }
        this.LIZJ = view;
        this.LIZIZ = fragment.getContext();
    }

    public AKT(Activity activity) {
        View view;
        o.LJIIIZ(activity, "activity");
        this.LIZ = new C208158Ex(0);
        Window window = activity.getWindow();
        if (window != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        this.LIZJ = view;
        this.LIZIZ = activity;
    }

    public AKT(View parent) {
        o.LJIIIZ(parent, "parent");
        this.LIZ = new C208158Ex(0);
        this.LIZJ = parent;
        this.LIZIZ = parent.getContext();
    }
}
