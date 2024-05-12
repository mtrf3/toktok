package X;

import Y.ARunnableS38S0100000_2;
import android.app.Activity;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5sa */
/* loaded from: classes3.dex */
public final class C148725sa {
    public static final void LIZJ(Activity activity, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(activity, "activity");
        C139825eE c139825eE = new C139825eE(activity);
        c139825eE.LIZ.LIZIZ = view;
        c139825eE.LJI(WHL.START);
        C82682Wcg c82682Wcg = c139825eE.LIZ;
        c82682Wcg.LJII = 3000L;
        c82682Wcg.LJIJJLI = true;
        c139825eE.LJIIJJI(R.string.s73);
        c139825eE.LJ(new AqS152S0100000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 656));
        view.postDelayed(new ARunnableS38S0100000_2(c139825eE.LIZJ(), 126), 100L);
    }

    public static /* synthetic */ void LIZIZ(Activity activity, View view, boolean z, InterfaceC65784Pro interfaceC65784Pro) {
        LIZ(activity, view, z, interfaceC65784Pro, null, WHL.START);
    }

    public static final void LIZ(final Activity activity, View view, final boolean z, final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, View view2, final WHL position) {
        int i;
        final View view3 = view2;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(position, "position");
        if (view3 == null) {
            if (view != null) {
                if (C148745sc.LIZ()) {
                    i = R.id.ld4;
                } else {
                    i = R.id.azw;
                }
                view3 = view.findViewById(i);
                if (view3 == null) {
                    return;
                }
            } else {
                return;
            }
        }
        view3.postDelayed(new Runnable() { // from class: X.5sb
            public final void LIZ() {
                int i2;
                if (!view3.isAttachedToWindow() || activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                int i3 = 0;
                if (z) {
                    if (C135125Sa.LIZ().getBoolean("entranceTipsShown", false)) {
                        return;
                    }
                    C135125Sa.LIZ().storeBoolean("entranceTipsShown", true);
                    C135125Sa.LIZ().storeBoolean("guideShown", true);
                } else {
                    String LIZJ = C77339UWx.LIZJ();
                    if (C135125Sa.LIZJ(LIZJ)) {
                        return;
                    } else {
                        C135125Sa.LIZLLL(LIZJ);
                    }
                }
                C135125Sa.LIZ().storeBoolean("guideShownH5", true);
                if (z) {
                    i2 = R.string.je;
                } else {
                    i2 = R.string.ms;
                }
                C139825eE c139825eE = new C139825eE(activity);
                c139825eE.LIZIZ(view3);
                c139825eE.LJI(position);
                c139825eE.LIZ.LJII = 3000L;
                if (position == WHL.TOP) {
                    i3 = C7MY.LIZIZ(12);
                }
                C82682Wcg c82682Wcg = c139825eE.LIZ;
                c82682Wcg.LJIIIIZZ = i3;
                c82682Wcg.LJIJJLI = true;
                c139825eE.LJ(new AqS152S0100000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 655));
                c139825eE.LJIIJJI(i2);
                c139825eE.LIZJ().show();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    LIZ();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, 100L);
    }
}
