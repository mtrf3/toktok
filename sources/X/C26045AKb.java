package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.ss.android.agilelogger.ALog;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.AKb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26045AKb {
    public C26046AKc LIZ;
    public final Context LIZIZ;
    public final View LIZJ;
    public C26047AKd LIZLLL;
    public C25600zU LJ;

    public final void LIZIZ() {
        this.LIZ.LJLIL.LJII = false;
        C26047AKd c26047AKd = this.LIZLLL;
        if (c26047AKd != null) {
            c26047AKd.dismiss();
        }
    }

    public final void LJIIJ() {
        Context context = this.LJ;
        if (context == null) {
            context = this.LIZIZ;
        }
        View view = this.LIZJ;
        CharSequence charSequence = this.LIZ.LJLIL.LIZIZ;
        if (context != null && view != null && charSequence != null && charSequence.length() > 0) {
            C26047AKd c26047AKd = new C26047AKd(context, view, this.LIZ);
            c26047AKd.LIZLLL();
            if (this.LIZ.LJLIL.LJII) {
                AKZ.LIZJ(c26047AKd);
            }
            this.LIZLLL = c26047AKd;
        }
        Context context2 = this.LIZIZ;
        C26046AKc c26046AKc = this.LIZ;
        if (context2 != null && c26046AKc != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("context is ");
            LIZ.append(context2.getClass());
            LIZ.append(", bundle is ");
            LIZ.append(c26046AKc);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("TUX", X1D.LIZIZ(LIZ));
        }
    }

    public C26045AKb(Dialog dialog) {
        View view;
        o.LJIIIZ(dialog, "dialog");
        this.LIZ = new C26046AKc(0);
        Window window = dialog.getWindow();
        if (window != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        this.LIZJ = view;
        this.LIZIZ = dialog.getContext();
    }

    public final void LIZ(boolean z) {
        AKW akw = this.LIZ.LJLIL;
        akw.LJII = z;
        if (z) {
            int i = AKV.LIZJ + 1;
            AKV.LIZJ = i;
            if (i >= Integer.MAX_VALUE) {
                AKV.LIZJ = 1;
            }
            akw.LJIIIIZZ = AKV.LIZJ;
        }
    }

    public final void LIZJ(InterfaceC65784Pro listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ.LJLIL.LJIIIZ = new WeakReference<>(listener);
    }

    public final void LIZLLL(long j) {
        this.LIZ.LJLIL.LJ = j;
    }

    public final void LJ(int i) {
        Context context = this.LIZIZ;
        if (context == null) {
            return;
        }
        this.LJ = new C25600zU(context, i);
    }

    public final void LJFF(int i) {
        this.LIZ.LJLIL.LIZJ = Integer.valueOf(i);
    }

    public final void LJI(int i) {
        this.LIZ.LJLIL.LIZLLL = Integer.valueOf(i);
    }

    public final void LJII(int i) {
        Integer LJI;
        AKW akw = this.LIZ.LJLIL;
        Context context = this.LJ;
        if (context != null || (context = this.LIZIZ) != null) {
            LJI = C79045V0n.LJI(i, context);
        } else {
            LJI = null;
        }
        akw.LIZLLL = LJI;
    }

    public final void LJIIIIZZ(int i) {
        String string;
        AKW akw = this.LIZ.LJLIL;
        Context context = this.LJ;
        if (context != null || (context = this.LIZIZ) != null) {
            string = context.getString(i);
        } else {
            string = null;
        }
        akw.LIZIZ = string;
    }

    public final void LJIIIZ(CharSequence charSequence) {
        this.LIZ.LJLIL.LIZIZ = charSequence;
    }

    public C26045AKb(PopupWindow popupWindow) {
        Context context;
        o.LJIIIZ(popupWindow, "popupWindow");
        this.LIZ = new C26046AKc(0);
        this.LIZJ = popupWindow.getContentView();
        View contentView = popupWindow.getContentView();
        if (contentView != null) {
            context = contentView.getContext();
        } else {
            context = null;
        }
        this.LIZIZ = context;
    }

    public C26045AKb(Fragment fragment) {
        View view;
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = new C26046AKc(0);
        View view2 = fragment.getView();
        if (view2 != null) {
            view = view2.getRootView();
        } else {
            view = null;
        }
        this.LIZJ = view;
        this.LIZIZ = fragment.getContext();
    }

    public C26045AKb(Activity activity) {
        View view;
        o.LJIIIZ(activity, "activity");
        this.LIZ = new C26046AKc(0);
        Window window = activity.getWindow();
        if (window != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        this.LIZJ = view;
        this.LIZIZ = activity;
    }

    public C26045AKb(View parent) {
        o.LJIIIZ(parent, "parent");
        this.LIZ = new C26046AKc(0);
        this.LIZJ = parent;
        this.LIZIZ = parent.getContext();
    }
}
