package X;

import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JY2 {
    public static JQA LIZ(View view) {
        Object obj;
        o.LJIIIZ(view, "view");
        JY5 jy5 = JY5.LIZIZ;
        Reference reference = (Reference) jy5.LIZ.get(view);
        Object obj2 = null;
        if (reference != null) {
            obj = reference.get();
        } else {
            obj = null;
        }
        int i = 0;
        while (view.getId() != 16908290) {
            if (i > 30) {
                break;
            }
            Reference reference2 = (Reference) jy5.LIZ.get(view);
            if (reference2 != null) {
                obj = reference2.get();
                if (obj != null) {
                    break;
                }
            } else {
                obj = null;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            i++;
        }
        obj2 = obj;
        JQA jqa = (JQA) obj2;
        if (jqa == null) {
            return new JQA();
        }
        return jqa;
    }

    public static void LIZJ(View view) {
        o.LJIIIZ(view, "view");
        JY5.LIZIZ.LIZ.remove(view);
        JY3.LIZ.remove(Integer.valueOf(view.hashCode()));
    }

    public static void LIZIZ(View view, JQA param) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(param, "param");
        JY5.LIZIZ.LIZ.put(view, new WeakReference(param));
        JY3.LIZ.put(Integer.valueOf(view.hashCode()), param);
    }
}
