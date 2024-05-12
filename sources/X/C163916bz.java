package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6bz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163916bz {
    public static void LIZ(View view, boolean z) {
        int i;
        V92 v92;
        VA9 va9 = (VA9) view.findViewById(R.id.k9p);
        V8L LIZIZ = V8L.LIZIZ(C32151Nz.LJIIZILJ(12));
        LIZIZ.LJII(C32151Nz.LJIIZILJ(2));
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        if (z) {
            i = R.attr.dv;
        } else {
            i = R.attr.cl;
        }
        Integer LJI = C79045V0n.LJI(i, context);
        if (LJI != null) {
            LIZIZ.LIZJ(C32151Nz.LJIIZILJ(2), LJI.intValue());
        }
        if (va9 == null || (v92 = (V92) va9.getHierarchy()) == null) {
            return;
        }
        v92.LJIL(LIZIZ);
    }
}
