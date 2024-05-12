package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.91Y, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C91Y {
    public static final List<Integer> LIZ;
    public static final List<Integer> LIZIZ;

    static {
        Integer valueOf = Integer.valueOf(R.id.alo);
        LIZ = C47261Igj.LJJIJIIJI(Integer.valueOf(R.id.lhs), Integer.valueOf(R.id.n4p), valueOf);
        LIZIZ = C47261Igj.LJJIJIIJI(valueOf, Integer.valueOf(R.id.arz), Integer.valueOf(R.id.epy));
    }

    public static final void LIZ(ViewGroup view) {
        o.LJIIIZ(view, "view");
        LIZIZ(view, new C91X());
    }

    public static void LIZIZ(ViewGroup viewGroup, InterfaceC88472Yns interfaceC88472Yns) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!LIZ.contains(Integer.valueOf(childAt.getId()))) {
                if (!LIZJ(viewGroup, interfaceC88472Yns)) {
                    interfaceC88472Yns.invoke(childAt);
                }
            } else if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                int childCount2 = viewGroup2.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = viewGroup2.getChildAt(i2);
                    if (!LIZ.contains(Integer.valueOf(childAt2.getId()))) {
                        if (!LIZJ(childAt2, interfaceC88472Yns)) {
                            interfaceC88472Yns.invoke(childAt2);
                        }
                    } else {
                        Object tag = childAt2.getTag(C8QI.LJII);
                        if (!(tag instanceof Boolean)) {
                            tag = null;
                        }
                        if (o.LJ(tag, Boolean.FALSE) && !LIZJ(childAt2, interfaceC88472Yns)) {
                            interfaceC88472Yns.invoke(childAt2);
                        }
                    }
                }
            }
        }
    }

    public static boolean LIZJ(View view, InterfaceC88472Yns interfaceC88472Yns) {
        if (!C2302491w.LIZ() || view.getId() != R.id.epy) {
            return false;
        }
        if (!(view instanceof ViewGroup)) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childView = viewGroup.getChildAt(i);
            o.LJIIIIZZ(childView, "childView");
            interfaceC88472Yns.invoke(childView);
        }
        return true;
    }
}
