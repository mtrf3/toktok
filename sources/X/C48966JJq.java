package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.JJq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48966JJq {
    public static final ActivityC45651qj LIZ(View view) {
        Object obj;
        o.LJIIIZ(view, "<this>");
        Iterator it = OJ6.LJJIZ(view.getContext(), C48673J8j.LJLIL).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (obj instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (ActivityC45651qj) obj;
    }

    public static final void LIZIZ(View view, InterfaceC88472Yns<? super ViewGroup.LayoutParams, C76800UCe> updateBlock) {
        o.LJIIIZ(updateBlock, "updateBlock");
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams params = view.getLayoutParams();
        o.LJIIIIZZ(params, "params");
        updateBlock.invoke(params);
        if (C16330kX.LIZJ(view)) {
            view.setLayoutParams(params);
        }
    }
}
