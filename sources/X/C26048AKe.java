package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.AKe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26048AKe {
    public Object LIZ;
    public final Object LIZIZ;
    public final Object LIZJ;
    public Object LIZLLL;

    public final void LJII() {
        Context context = (Context) this.LIZIZ;
        View view = (View) this.LIZJ;
        CharSequence charSequence = ((C26044AKa) this.LIZ).LJLIL.LIZIZ;
        if (context != null && view != null && charSequence != null && charSequence.length() > 0) {
            C26050AKg c26050AKg = new C26050AKg(context, view, (C26044AKa) this.LIZ);
            c26050AKg.LIZLLL();
            if (((C26044AKa) this.LIZ).LJLIL.LJII) {
                AKZ.LIZJ(c26050AKg);
            }
            this.LIZLLL = c26050AKg;
        }
    }

    public /* synthetic */ C26048AKe(Dialog dialog) {
        View view;
        o.LJIIIZ(dialog, "dialog");
        this.LIZ = new C26044AKa(0);
        Window window = dialog.getWindow();
        if (window != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        this.LIZJ = view;
        this.LIZIZ = dialog.getContext();
    }

    public final void LIZ(InterfaceC65784Pro listener) {
        o.LJIIIZ(listener, "listener");
        ((C26044AKa) this.LIZ).LJLIL.LJIIIZ = new WeakReference<>(listener);
    }

    public final void LIZIZ(long j) {
        ((C26044AKa) this.LIZ).LJLIL.LJ = j;
    }

    public final void LIZJ(int i) {
        ((C26044AKa) this.LIZ).LJLIL.LIZJ = Integer.valueOf(i);
    }

    public final void LIZLLL(int i) {
        ((C26044AKa) this.LIZ).LJLIL.LIZLLL = Integer.valueOf(i);
    }

    public final void LJ(int i) {
        Integer num;
        AKW akw = ((C26044AKa) this.LIZ).LJLIL;
        Context context = (Context) this.LIZIZ;
        if (context != null) {
            num = C79045V0n.LJI(i, context);
        } else {
            num = null;
        }
        akw.LIZLLL = num;
    }

    public final void LJFF(int i) {
        String str;
        AKW akw = ((C26044AKa) this.LIZ).LJLIL;
        Context context = (Context) this.LIZIZ;
        if (context != null) {
            str = context.getString(i);
        } else {
            str = null;
        }
        akw.LIZIZ = str;
    }

    public final void LJI(CharSequence charSequence) {
        ((C26044AKa) this.LIZ).LJLIL.LIZIZ = charSequence;
    }

    public /* synthetic */ C26048AKe(PopupWindow popupWindow) {
        Context context;
        o.LJIIIZ(popupWindow, "popupWindow");
        this.LIZ = new C26044AKa(0);
        this.LIZJ = popupWindow.getContentView();
        View contentView = popupWindow.getContentView();
        if (contentView != null) {
            context = contentView.getContext();
        } else {
            context = null;
        }
        this.LIZIZ = context;
    }

    public /* synthetic */ C26048AKe(Fragment fragment) {
        View view;
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = new C26044AKa(0);
        View view2 = fragment.getView();
        if (view2 != null) {
            view = view2.getRootView();
        } else {
            view = null;
        }
        this.LIZJ = view;
        this.LIZIZ = fragment.getContext();
    }

    public /* synthetic */ C26048AKe(Activity activity) {
        View view;
        o.LJIIIZ(activity, "activity");
        this.LIZ = new C26044AKa(0);
        Window window = activity.getWindow();
        if (window != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        this.LIZJ = view;
        this.LIZIZ = activity;
    }

    public /* synthetic */ C26048AKe(View parent) {
        o.LJIIIZ(parent, "parent");
        this.LIZ = new C26044AKa(0);
        this.LIZJ = parent;
        this.LIZIZ = parent.getContext();
    }

    public /* synthetic */ C26048AKe(String str) {
        this.LIZ = "https://accounts.google.com/o/oauth2/v2/auth";
        this.LIZIZ = "https://www.googleapis.com/oauth2/v4/token";
        this.LIZLLL = str;
    }
}
