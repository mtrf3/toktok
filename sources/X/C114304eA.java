package X;

import Y.ACallableS104S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS8S0211000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4eA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114304eA {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C114314eB.LJLIL);
    public static final java.util.Map<Integer, String> LIZIZ = new LinkedHashMap();

    public static void LIZJ() {
        if ((((Number) LIZ.getValue()).intValue() & 2) == 2) {
            Iterator it = ((LinkedHashMap) LIZIZ).keySet().iterator();
            while (it.hasNext()) {
                C16970lZ.LJII(((Number) it.next()).intValue());
            }
        }
    }

    public static final boolean LIZLLL() {
        if ((((Number) LIZ.getValue()).intValue() & 1) == 1) {
            return true;
        }
        return false;
    }

    public static final void LIZIZ(InterfaceC65784Pro<C76800UCe> asyncBlock) {
        o.LJIIIZ(asyncBlock, "asyncBlock");
        if (LIZLLL()) {
            C10K.LIZJ(new ACallableS104S0100000_1(asyncBlock, (InterfaceC65784Pro<C76800UCe>) 15));
        } else {
            asyncBlock.invoke();
        }
    }

    public static final void LJ(ActivityC45651qj activityC45651qj, int... iArr) {
        if ((((Number) LIZ.getValue()).intValue() & 2) == 2 && activityC45651qj != null && !activityC45651qj.isFinishing()) {
            for (int i : iArr) {
                C16970lZ.LJ(i, activityC45651qj);
            }
        }
    }

    public static View LIZ(LayoutInflater inflater, int i, ViewGroup container, boolean z, int i2) {
        Context context;
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        o.LJIIIZ(inflater, "inflater");
        Activity activity = null;
        if (container != null) {
            context = container.getContext();
        } else {
            context = null;
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        if ((((Number) LIZ.getValue()).intValue() & 2) == 2 && activity != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("asyncInflateV1, id=");
            LIZ2.append((String) ((LinkedHashMap) LIZIZ).get(Integer.valueOf(i)));
            LIZ2.append(", hasCachedView=");
            LIZ2.append(C16970lZ.LIZ(i, activity));
            C221018lt.LJFF("InboxJankOptimization", X1D.LIZIZ(LIZ2));
            o.LJIIIZ(container, "container");
            return L9F.LIZJ(activity, i, new AqS8S0211000_1(i, activity, container, z2, 1));
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, container, z2);
        o.LJIIIIZZ(LLLLIILL, "{\n            inflater.i…, attachToRoot)\n        }");
        return LLLLIILL;
    }
}
