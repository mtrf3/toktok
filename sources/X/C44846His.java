package X;

import android.view.View;

/* renamed from: X.His, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44846His {
    public static InterfaceC55235Lm3 LIZ(View view) {
        Object obj;
        while (true) {
            if (view != null) {
                if (view.getTag(UC1.LJLJL) == null) {
                    Object parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    obj = view.getTag(UC1.LJLJL);
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (!(obj instanceof InterfaceC55235Lm3)) {
            return null;
        }
        return (InterfaceC55235Lm3) obj;
    }
}
