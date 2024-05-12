package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Jph, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50365Jph {
    public static final boolean LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;

    public static boolean LIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    static {
        FFL.LJIIIZ().getClass();
        LIZ = FFL.LJ(31744, "search_page_launch_booster", true, true);
        LIZIZ = C221108m2.LIZIZ(C50367Jpj.LJLIL);
        LIZJ = C221108m2.LIZIZ(C50366Jpi.LJLIL);
    }

    public static View LIZIZ(int i, ViewGroup container) {
        o.LJIIIZ(container, "container");
        if (C49500Jbk.LIZ()) {
            Context context = container.getContext();
            o.LJIIIIZZ(context, "container.context");
            return C38619FDr.LIZIZ(i, context, container, false);
        }
        Context context2 = container.getContext();
        o.LJIIIIZZ(context2, "container.context");
        if (C45804HyK.LJ(context2) != null) {
            Context context3 = container.getContext();
            o.LJIIIIZZ(context3, "container.context");
            InterfaceC45601Hv3 LJ = C45804HyK.LJ(context3);
            o.LJI(LJ);
            return LJ.getInflater().LIZ(i);
        }
        return C1FL.LIZIZ(container, i, container, false, "{\n            LayoutInfl…ntainer, false)\n        }");
    }

    public static void LIZJ(final InterfaceC45601Hv3 inflaterOwner, boolean z) {
        final int i;
        final int i2;
        o.LJIIIZ(inflaterOwner, "inflaterOwner");
        if (z) {
            i = R.layout.ciy;
            i2 = 2;
        } else {
            i = R.layout.cj8;
            i2 = 4;
        }
        C37190Eig.LIZ.post(new Runnable() { // from class: X.Hwv
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC45601Hv3 interfaceC45601Hv3 = InterfaceC45601Hv3.this;
                int i3 = i;
                int i4 = i2;
                InterfaceC51123K4p inflater = interfaceC45601Hv3.getInflater();
                if (inflater instanceof AbstractC51620KNs) {
                    AbstractC51620KNs abstractC51620KNs = (AbstractC51620KNs) inflater;
                    abstractC51620KNs.getClass();
                    C208108Es c208108Es = new C208108Es(abstractC51620KNs);
                    c208108Es.LIZ(i3, i4);
                    c208108Es.LIZ(R.layout.ci4, 2);
                    c208108Es.LIZ(R.layout.ci3, 1);
                    c208108Es.LIZ(R.layout.chj, 1);
                    c208108Es.LIZ(R.layout.chs, 1);
                    c208108Es.LIZ(R.layout.ch0, 1);
                    c208108Es.LIZ(R.layout.chj, 2);
                    c208108Es.LIZ(R.layout.ch0, 2);
                    c208108Es.LIZ(R.layout.chc, 1);
                    c208108Es.LIZ(R.layout.cgl, 3);
                    c208108Es.LIZ(R.layout.ch4, 1);
                    abstractC51620KNs.LIZJ(c208108Es, 0L);
                }
            }
        });
    }
}
