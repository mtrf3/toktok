package X;

import Y.ACListenerS24S0100000_4;
import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.AqS15S0202000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9SY, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9SY {
    public static final C26222AQw LIZ = new C26222AQw("PopupUtil");

    public static void LIZJ(Activity activity, int i, TuxSheet tuxSheet) {
        C26045AKb c26045AKb;
        if (activity == null) {
            return;
        }
        C26222AQw c26222AQw = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("popupToastInternal ");
        LIZ2.append(i);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ2));
        if (tuxSheet == null) {
            c26045AKb = new C26045AKb(activity);
        } else {
            c26045AKb = new C26045AKb(tuxSheet);
        }
        c26045AKb.LJIIIZ(activity.getString(i));
        c26045AKb.LIZLLL(5000L);
        c26045AKb.LJIIJ();
    }

    public static void LIZ(final ActivityC45651qj activityC45651qj, final Fragment fragment, final int i, final C2068389v c2068389v, final InterfaceC65784Pro interfaceC65784Pro) {
        final View decorView;
        if (activityC45651qj == null || fragment == null) {
            return;
        }
        C26222AQw c26222AQw = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("popupBottomToastInternal ");
        LIZ2.append(i);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ2));
        final C76732zl c76732zl = new C76732zl();
        Window window = activityC45651qj.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new Runnable() { // from class: X.9Sb
                public final void LIZ() {
                    Rect rect = new Rect();
                    decorView.getGlobalVisibleRect(rect);
                    int i2 = rect.bottom;
                    View findViewById = decorView.findViewById(R.id.content);
                    if (findViewById != null) {
                        findViewById.getGlobalVisibleRect(rect);
                        c76732zl.element = i2 - rect.bottom;
                        AKT akt = new AKT(fragment);
                        ActivityC45651qj activityC45651qj2 = activityC45651qj;
                        int i3 = i;
                        C2068389v c2068389v2 = c2068389v;
                        C76732zl c76732zl2 = c76732zl;
                        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
                        akt.LJI(activityC45651qj2.getString(i3));
                        if (c2068389v2 != null) {
                            akt.LIZ.LJLILLLLZI = 4;
                            akt.LJIIIIZZ(c2068389v2);
                        }
                        int LIZJ = C47959Irz.LIZJ(12, Math.max(c76732zl2.element, 0) + C7MY.LIZIZ(C61447O9r.LJIIJJI));
                        C208158Ex c208158Ex = akt.LIZ;
                        c208158Ex.LJLJL = LIZJ;
                        c208158Ex.LJLJJI = 0;
                        c208158Ex.LJLJLJ = new ACListenerS24S0100000_4(interfaceC65784Pro2, 214);
                        akt.LIZJ(5000L);
                        akt.LJII();
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ3;
                    try {
                        LIZ();
                    } finally {
                        if (LIZ3) {
                        }
                    }
                }
            });
        }
    }

    public static void LIZIZ(ActivityC45651qj activityC45651qj, int i, int i2, int i3, C9SZ callback) {
        o.LJIIIZ(callback, "callback");
        C26222AQw c26222AQw = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("popupDialogInternal ");
        LIZ2.append(i);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ2));
        if (activityC45651qj == null) {
            return;
        }
        C26227ARb c26227ARb = new C26227ARb(activityC45651qj);
        c26227ARb.LIZIZ(activityC45651qj.getString(i));
        UC0.LIZJ(c26227ARb, new AqS15S0202000_4(activityC45651qj, i2, i3, callback, 1));
        c26227ARb.LIZLLL(C9SX.LJLIL);
        c26227ARb.LJI().LIZLLL();
    }
}
