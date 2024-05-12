package X;

import android.content.Context;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4eH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114374eH {
    public static void LIZ(C119624mk c119624mk, int i) {
        int LIZIZ;
        ViewGroup.LayoutParams layoutParams = c119624mk.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = C7MY.LIZIZ(24);
            marginLayoutParams.width = C7MY.LIZIZ(24);
            if (marginLayoutParams.getMarginStart() != 0) {
                LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf((i * 14) + 2)));
            } else {
                LIZIZ = C7MY.LIZIZ(2);
            }
            marginLayoutParams.setMarginStart(LIZIZ);
            c119624mk.setLayoutParams(marginLayoutParams);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.dj);
            c110614Vt.LIZLLL = AnonymousClass391.LIZJ(2);
            c110614Vt.LIZJ = C61328O5c.LIZJ(12);
            Context context = c119624mk.getContext();
            o.LJIIIIZZ(context, "context");
            c119624mk.setBackground(c110614Vt.LIZ(context));
            V8L v8l = ((V92) c119624mk.getHierarchy()).LIZJ;
            if (v8l != null) {
                v8l.LIZLLL(C32151Nz.LJIIZILJ(Double.valueOf(0.5d)));
                Context context2 = c119624mk.getContext();
                o.LJIIIIZZ(context2, "context");
                v8l.LJFF = AnonymousClass636.LJIIIIZZ(R.attr.dz, context2);
                v8l.LJII = true;
            } else {
                v8l = null;
            }
            ((V92) c119624mk.getHierarchy()).LJIL(v8l);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
