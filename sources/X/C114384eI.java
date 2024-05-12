package X;

import android.content.Context;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4eI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114384eI {
    public static void LIZ(C119624mk c119624mk, int i) {
        ViewGroup.LayoutParams layoutParams = c119624mk.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = C7MY.LIZIZ(32);
            marginLayoutParams.width = C7MY.LIZIZ(32);
            if (marginLayoutParams.getMarginStart() != 0) {
                marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i * 24))));
            }
            c119624mk.setLayoutParams(marginLayoutParams);
            V8L v8l = ((V92) c119624mk.getHierarchy()).LIZJ;
            if (v8l != null) {
                v8l.LIZLLL(C32151Nz.LJIIZILJ(Double.valueOf(0.5d)));
                Context context = c119624mk.getContext();
                o.LJIIIIZZ(context, "context");
                v8l.LJFF = AnonymousClass636.LJIIIIZZ(R.attr.dz, context);
            } else {
                v8l = null;
            }
            ((V92) c119624mk.getHierarchy()).LJIL(v8l);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
